# Kmeans_cityBike

CityBike data preview : 

    +--------------------+----------+----------+--------------------+------+
    |             address|  latitude| longitude|                name|number|
    +--------------------+----------+----------+--------------------+------+
    |Lower River Tce /...|-27.482279|153.028723|122 - LOWER RIVER...|   122|
    |Main St / Darragh St| -27.47059|153.036046|91 - MAIN ST / DA...|    91|
    |Sydney St Ferry T...|-27.474531|153.042728|88 - SYDNEY ST FE...|    88|
    |Browne St / James St|-27.461881|153.046986|75 - BROWNE ST / ...|    75|
    |Kurilpa Point / M...|-27.469658|153.016696|98 - KURILPA POIN...|    98|
    |Montague Rd / Ski...| -27.48172| 153.00436|109 - MONTAGUE RD...|   109|
    |Macquarie St / Gu...|-27.493626|153.001482|149 - MACQUARIE S...|   149|
    |Bi-centennial Bik...|-27.476076|153.002459|139 - BI-CENTENNI...|   139|
    |Sir William McGre...|-27.493963|153.011938|24 - SIR WILLIAM ...|    24|
    |Vulture St / Trib...|-27.482197|153.020894|117 - VULTURE ST ...|   117|
    |Lamington St / Re...|-27.465226|153.050864|73 - LAMINGTON ST...|    73|
    |King George Square 2|-27.468447|153.024662|1101 - KING GEORG...|  1101|
    | Mary St / George St|-27.473021|153.025988|23 - MARY STREET ...|    23|
    |McLachlan St / Wi...|-27.457825|153.036866|54 - MCLACHLAN ST...|    54|
    |       Grey St / QCA| -27.48148| 153.02368|  93 - GREY ST / QCA|    93|
    | Roma St / Turbot St|-27.467464|153.022094|31 - ROMA ST / TU...|    31|
    |Thynne Rd / Colle...|-27.499963|153.017633|97 - THYNNE RD / ...|    97|
    |Sandford St / Bri...|-27.490776|152.994747|147 - SANDFORD ST...|   147|
    |James St / Harcou...|-27.458199|153.041688|77 - JAMES ST / H...|    77|
    |Sidon St / Little...|-27.481808|153.025477|119 - SIDON ST / ...|   119|
    +--------------------+----------+----------+--------------------+------+
    
# Kmeans results : 

    +--------------------+----------+----------+--------------------+------+--------------------+----------+
    |             address|  latitude| longitude|                name|number|            features|prediction|
    +--------------------+----------+----------+--------------------+------+--------------------+----------+
    |Lower River Tce /...|-27.482279|153.028723|122 - LOWER RIVER...|   122|[-27.482279,153.0...|         2|
    |Main St / Darragh St| -27.47059|153.036046|91 - MAIN ST / DA...|    91|[-27.47059,153.03...|         2|
    |Sydney St Ferry T...|-27.474531|153.042728|88 - SYDNEY ST FE...|    88|[-27.474531,153.0...|         1|
    |Browne St / James St|-27.461881|153.046986|75 - BROWNE ST / ...|    75|[-27.461881,153.0...|         1|
    |Kurilpa Point / M...|-27.469658|153.016696|98 - KURILPA POIN...|    98|[-27.469658,153.0...|         2|
    +--------------------+----------+----------+--------------------+------+--------------------+----------+

# Distribution in each cluster : 

    +----------+-----------+
    |prediction|count(name)|
    +----------+-----------+
    |         1|         44|
    |         2|         64|
    |         0|         41|
    +----------+-----------+
 
# Clustering Evaluation : 

Silhouette with squared euclidean distance = 0.588169797378973

Silhouette index is an a number between -1 and 1 and it refers to a best clustering when it is close to 1.
So we can say that our classification is good.
