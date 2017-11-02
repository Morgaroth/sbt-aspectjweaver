organization := "com.gilt.sbt"

crossSbtVersions := Vector("0.13.15", "1.0.1")

name := "sbt-aspectjweaver"

sbtPlugin := true

scalacOptions ++= List(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-encoding", "UTF-8"
)

version := "0.2.1"

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.0" % "provided")

publishMavenStyle := false

bintrayPackageLabels := Seq("sbt", "aspectj", "aspectjweaver", "sbt-native-packager")

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
