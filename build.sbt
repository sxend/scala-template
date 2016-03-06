
organization := "arimitsu.sf"

name := "scala-template"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.7"

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"),
  Resolver.bintrayRepo("sxend", "releases"),
  Resolver.bintrayRepo("sxend", "snapshots"),
  "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
)

libraryDependencies ++= {
  val akkaVersion = "2.4.2"
  val shapelessVersion = "2.3.0"
  val spec2Version = "3.7"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-http-experimental" % akkaVersion,
    "com.chuusai" %% "shapeless" % shapelessVersion,
    "org.specs2" %% "specs2-html" % spec2Version % "test",
    "org.specs2" %% "specs2-junit" % spec2Version % "test",
    "org.specs2" %% "specs2-core" % spec2Version % "test"
  )
}

publishMavenStyle := false

bintrayRepository := {
  if (version.value.matches("^[0-9]+\\.[0-9]+\\.[0-9]+$")) "releases" else "snapshots"
}

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

javacOptions ++= Seq("-source", "1.8")

scalacOptions ++= Seq(
  "-feature",
  "-language:reflectiveCalls",
  "-language:postfixOps"
)

testOptions in Test += Tests.Argument("junitxml", "html", "console")

assemblyJarName in assembly := s"scala-template-assembly-${version.value}.jar"

mainClass in assembly := Some("arimitsu.sf.template.Bootstrap")
