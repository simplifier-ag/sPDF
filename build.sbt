
name := "sPDF"

description := "Create PDFs using plain old HTML+CSS. Uses wkhtmltopdf on the back-end which renders HTML using Webkit."

homepage := Some(url("https://github.com/simplifier-ag/sPDF"))

startYear := Some(2013)

licenses := Seq(
  ("MIT", url("http://opensource.org/licenses/MIT"))
)

organization := "io.github.simplifier-ag"

scalaVersion := "2.12.15"

crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.15")

releaseCrossBuild := true

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-encoding", "UTF-8"
)

Test / fork  := true

Test/ parallelExecution := false

Compile / logLevel := Level.Warn

scmInfo := Some(
  ScmInfo(
    url("https://github.com/simplifier-ag/sPDF"),
    "scm:git:https://github.com/simplifier-ag/sPDF.git",
    Some("scm:git:git@github.com:simplifier-ag/sPDF.git")
  )
)

// add dependencies on standard Scala modules, in a way
// supporting cross-version publishing
// taken from: http://github.com/scala/scala-module-dependency-sample
libraryDependencies := {
  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((2, scalaMajor)) if scalaMajor >= 11 =>
      libraryDependencies.value ++ Seq(
        "org.scala-lang.modules" %% "scala-xml" % "1.3.0",
        "org.scala-lang.modules" %% "scala-parser-combinators" % "2.3.0"
      )
    case _ =>
      libraryDependencies.value
  }
}

libraryDependencies ++= Seq (
  "org.scalatest"   %% "scalatest"      % "3.0.0"   % "test",
  "org.mockito"     %  "mockito-all"    % "1.10.8"  % "test"
)

// publishing
publishMavenStyle := true

publishTo := {
  val nexus = "https://s01.oss.sonatype.org/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

credentials += Credentials(Path.userHome / ".credentials.sonatype")
credentials += Credentials(
  "GnuPG Key ID",
  "gpg",
  "D47B6E1E63D979514A139ADAD433750913FA4E7E", // key identifier
  "ignored" // this field is ignored; passwords are supplied by pinentry
)
Test / publishArtifact := false

// publishArtifact in (Compile, packageDoc) := false

// publishArtifact in (Compile, packageSrc) := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <developers>
    <developer>
      <id>cloudify</id>
      <name>Federico Feroldi</name>
      <email>pix@yahoo.it</email>
      <url>http://www.pixzone.com</url>
    </developer>
    <developer>
      <id>C-Schwemin</id>
      <name>Christoph Schwemin</name>
    </developer>
  </developers>
)

// Josh Suereth's step-by-step guide to publishing on sonatype
// https://www.scala-sbt.org/release/docs/Using-Sonatype.html
