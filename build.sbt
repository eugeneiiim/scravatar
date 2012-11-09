name := "scravatar"

scalaVersion := "2.10.0-RC1"

organization := "com.andersen-gott"

version := "1.1-SNAPSHOT"

libraryDependencies ++=
  Seq(
    "org.scalatest" % "scalatest_2.10.0-M7" % "2.0.M4-2.10.0-M7-B1" % "test"
  )

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

publishTo := Some("Blend Repository" at "https://blend.artifactoryonline.com/blend/blend")
