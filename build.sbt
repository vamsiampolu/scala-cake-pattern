
organization := "com.example"
scalaVersion := "2.12.6"
version      := "0.1.0-SNAPSHOT"
name := "scala-cake-example"
libraryDependencies ++= Seq(
  "org.hibernate" %% "hibernate-core" % "4.0.0.CR5",
  "org.hibernate" %% "hibernate-entitymanager" % "4.0.0.CR5",
  "org.hsqldb" %% "hsqldb" % "2.2.4",
  "org.specs2" %% "specs2-core" % "4.2.0" % Test,
  "org.specs2" %% "specs2-mock" % "4.2.0" % Test
)
