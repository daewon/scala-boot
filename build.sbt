name := "bootstrap"

version := "0.1"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.14" % "test"
)

scalacOptions += "-feature"

scalacOptions += "-deprecation"

// Read here for optional dependencies:
// http://etorreborre.github.com/specs2/guide/org.specs2.guide.Runners.html#Dependencies
resolvers ++= Seq(
  "snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases"  at "http://oss.sonatype.org/content/repositories/releases"
)

resolvers += "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"
