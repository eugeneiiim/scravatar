name := "scravatar"

scalaVersion := "2.10.0-RC1"

organization := "com.andersen-gott"

version := "1.1-SNAPSHOT"

libraryDependencies ++=
  Seq(
    "org.scalatest" % "scalatest_2.10.0-M7" % "2.0.M4-2.10.0-M7-B1" % "test"
  )

credentials += Credentials(Path.userHome / ".sbt" / "magott-credentials")

publishTo <<= version { (v: String) =>
  val nexus = "http://mvn.compose.cc:8081/nexus/content/repositories"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("Blend Snapshots (publish)" at nexus + "/snapshots/")
  else
    Some("Blend Releases"  at nexus + "/releases/")
}

seq(aetherPublishSettings: _*)

homepage := Some(new URL("http://github.com/magott/scravatar"))

startYear := Some(2012)

licenses := Seq(("Apache 2", new URL("http://www.apache.org/licenses/LICENSE-2.0.txt")))

pomExtra <<= (pomExtra, name, description) {(pom, name, desc) => pom ++ xml.Group(
  <scm>
    <url>http://github.com/magott/scravatar</url>
  	<connection>scm:git:git://github.com/magott/scravatar.git</connection>
  	<developerConnection>scm:git:git@github.com:magott/scravatar.git</developerConnection>
  </scm>
  <developers>
    <developer>
      <id>magott</id>
  	  <name>Morten Andersen-Gott</name>
  	  <url>http://www.andersen-gott.com</url>
  	</developer>
  </developers>
)}