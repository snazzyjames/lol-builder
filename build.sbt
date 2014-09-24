name := """lol-builder"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "uk.co.panaxiom" %% "play-jongo" % "0.7.1-jongo1.0",
  "org.webjars" %% "webjars-play" % "2.3.0",
  "org.mindrot" % "jbcrypt" % "0.3m",
  "org.mongodb" % "mongo-java-driver" % "2.11.4",
  "org.webjars" % "bootstrap" % "3.2.0",
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)
