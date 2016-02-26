
organization := "arimitsu.sf"

name := "scala-template"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.7"

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"),
  "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/",
  "sxend repo releases" at "http://dl.bintray.com/sxend/releases",
  "sxend repo snapshots" at "http://dl.bintray.com/sxend/snapshots"
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream-experimental" % "2.0.3",
  "com.typesafe.akka" %% "akka-http-experimental" % "2.0.3",
  "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "2.0.3",
  "com.chuusai" %% "shapeless" % "2.3.0",
  "org.specs2" %% "specs2-html" % "3.7" % "test",
  "org.specs2" %% "specs2-junit" % "3.7" % "test",
  "org.specs2" %% "specs2-core" % "3.7" % "test"
)

publishMavenStyle := false

bintrayRepository := {
  if (version.value.matches("^[0-9]\\.[0-9]*\\.[0-9]*$")) "releases" else "snapshots"
}

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

javacOptions ++= Seq("-source", "1.8")

scalacOptions ++= Seq(
  "-feature",
  "-language:reflectiveCalls",
  "-language:postfixOps"
)

testOptions in Test += Tests.Argument("junitxml", "html", "console")
