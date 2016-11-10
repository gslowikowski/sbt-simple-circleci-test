organization := "com.github.gslowikowski.sbt-simple-circleci-test"
name := "test"
version := "1.0.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.hamcrest" % "hamcrest-core" % "1.3" % "test"
)
