package example

import com.thinkaurelius.titan.core.{TitanLabel, TitanKey, TitanFactory}
import org.apache.commons.configuration.BaseConfiguration
import com.ansvia.graph.BlueprintsWrapper._
import scala.collection.JavaConversions._

object ConsumerApp extends App {
  val conf = new BaseConfiguration()
  conf.setProperty("storage.backend", "cassandra")
  conf.setProperty("storage.hostname", "127.0.0.1")
  conf.setProperty("storage.keyspace","TestTitanKeySpace2")
  implicit val db = TitanFactory.open(conf)

  case class Person(name:String, kind:String)

  val hercules = Person("hercules", "demigod")

  db.save(hercules)
}
