package aymenPackage
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.clustering.KMeans
import org.apache.spark.ml.Pipeline
import org.apache.spark.sql.SparkSession,org.apache.spark.sql.SaveMode
import org.apache.spark.ml.evaluation.ClusteringEvaluator

object cityBikeApp {
  def main(args:Array[String]): Unit ={
    val spark =  SparkSession
        .builder
        .master("local")
        .appName("firstApp")
        .getOrCreate()

    //importation des données
    val data= spark.read.json("Brisbane_CityBike.json")
    data.show()

    // Transformer les données latitude et longitude en un seul vecteur
    val assembler = new VectorAssembler()
      .setInputCols(Array("latitude","longitude"))
      .setOutputCol("features")

    // création de l'objet Kmeans
    val kmeans = new KMeans()
      .setK(3).setSeed(1L)
      .setFeaturesCol("features")
      .setPredictionCol("prediction")


    val pipeline = new Pipeline().setStages(Array(assembler, kmeans))

    //ecxécution de la classification
    val model = pipeline.fit(data)
    val clusters = model.transform(data)

    //evaluation de la classification
    val evaluator = new ClusteringEvaluator()
    val silhouette = evaluator.evaluate(clusters)
    println(s"Silhouette with squared euclidean distance = $silhouette")
    clusters.createGlobalTempView("cluster")
    spark.sql("SELECT prediction,COUNT(name) FROM global_temp.cluster group by prediction").show()

    // Extraction des donn&es avec les classes
    clusters.drop("features")
      .repartition(1)
      .write
      .mode(SaveMode.Overwrite)
      .format("com.databricks.spark.csv")
      .option("header", "true")
      .option("delimiter", ";")
      .save("OUTPUT")
    }

}
