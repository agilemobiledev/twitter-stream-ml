resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

name := "root"

scalaVersion := "2.11.7"

run := {}

publish := {}

publishLocal := {}

publishArtifact in (Compile, packageBin) := false

publishArtifact in (Compile, packageDoc) := false

publishArtifact in (Compile, packageSrc) := false

lazy val commonSettings = Seq(
  version := "0.1.1",
  scalaVersion := "2.11.7",
  scalacOptions := Seq("-encoding", "utf8"),
  javacOptions := Seq("-source", "1.7"),
  homepage := Some(url("https://github.com/giorgioinf/twitter-stream-ml")),
  description := "Machine Learning over Twitter's stream. Using Apache Spark, Web Server and Lightning Graph server.",
  organization := "com.giorgioinf",
  organizationName := "giorgioinf.com",
  organizationHomepage := Some(url("http://giorgioinf.com")),
  publishMavenStyle := true,
  assemblyJarName in assembly := s"${name.value}_${scalaVersion.value.dropRight(2)}-${version.value}.jar",
  assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)
)

lazy val web = project.settings(commonSettings)

lazy val spark = project.settings(commonSettings)
