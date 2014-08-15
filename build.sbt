name := "blueprints-scala-example"

version := "1.0"

//scalaVersion := "2.10.4"
scalaVersion := "2.11.2"

resolvers ++= Seq(
  "snapshots"           at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases"            at "http://oss.sonatype.org/content/repositories/releases",
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Ansvia Releases Repo" at "http://scala.repo.ansvia.com/releases/"
)

libraryDependencies ++= {
  Seq(
    "com.typesafe.scala-logging" %%  "scala-logging-slf4j"      % "2.1.2",
    "ch.qos.logback"             %   "logback-core"             % "1.1.2",
    "ch.qos.logback"             %   "logback-classic"          % "1.1.2",
    "com.ansvia.graph"          % "blueprints-scala_2.10"       % "0.1.17",
    "com.tinkerpop.blueprints" % "blueprints-core" % "2.4.0"
  )
}

unmanagedBase := baseDirectory.value / "libs"
