name := """lol-builder"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "org.mongodb" % "mongo-java-driver" % "2.11.4",
  "uk.co.panaxiom" %% "play-jongo" % "0.7.1-jongo1.0",
  "org.webjars" %% "webjars-play" % "2.3.0",
  "org.webjars" % "bootstrap" % "3.2.0",
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)
