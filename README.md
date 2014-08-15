anvie/blueprints-scala example with scala 2.11.2
=====================

[error] (run-main-0) java.lang.NoClassDefFoundError: scala/ScalaObject
java.lang.NoClassDefFoundError: scala/ScalaObject
        at com.ansvia.graph.util.CaseClassSigParser$.com$ansvia$graph$util$CaseClassSigParser$$isExcluded(Poso.scala:272)
        at com.ansvia.graph.util.CaseClassSigParser$.parse(Poso.scala:332)
        at com.ansvia.graph.util.CaseClassDeserializer$$anonfun$6.apply(Poso.scala:193)
        at com.ansvia.graph.util.CaseClassDeserializer$$anonfun$6.apply(Poso.scala:193)
        at scala.collection.mutable.MapLike$class.getOrElseUpdate(MapLike.scala:188)
        at com.ansvia.graph.util.CaseClassDeserializer$$anon$3.scala$collection$mutable$SynchronizedMap$$super$getOrElseUpdate(Poso.scala:36)
        at scala.collection.mutable.SynchronizedMap$class.getOrElseUpdate(SynchronizedMap.scala:40)
        at com.ansvia.graph.util.CaseClassDeserializer$$anon$3.getOrElseUpdate(Poso.scala:36)
        at com.ansvia.graph.util.CaseClassDeserializer$.serialize(Poso.scala:193)
        at com.ansvia.graph.ObjectConverter$.serialize(ObjectConverter.scala:33)
        at com.ansvia.graph.BlueprintsWrapper$$anon$7.save(BlueprintsWrapper.scala:419)
