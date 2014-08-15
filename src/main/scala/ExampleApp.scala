package example

import com.tinkerpop.blueprints.impls.tg.TinkerGraphFactory
import com.ansvia.graph.BlueprintsWrapper._
import scala.collection.JavaConversions._

object ConsumerApp extends App {
  implicit val db = TinkerGraphFactory.createTinkerGraph()

  case class Person(name:String, kind:String)

  val hercules = Person("hercules", "demigod")

  db.save(hercules)
}
