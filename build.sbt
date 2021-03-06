ThisBuild / scalaVersion := "2.13.2"
ThisBuild / organization := "io.github.zero-deps"
ThisBuild / licenses := "MIT" -> url("https://raw.githubusercontent.com/zero-deps/leveldb-jnr/master/LICENSE") :: Nil
ThisBuild / version := zero.ext.git.version
ThisBuild / scalacOptions in Compile ++= Seq(
  "-feature",
  "-unchecked",
  "-deprecation",
  "-Xfatal-warnings",
  "-Ywarn-unused:imports",
)
ThisBuild / resolvers += Resolver.bintrayRepo("zero-deps", "maven")
ThisBuild / isSnapshot := true
ThisBuild / publishArtifact := true
ThisBuild / publishArtifact in Test := true

ThisBuild / turbo := true
ThisBuild / useCoursier := true
Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val root = project.in(file(".")).settings(
  name := "leveldb-jnr",
  libraryDependencies ++= Seq(
    "com.github.jnr" % "jnr-ffi" % "2.1.13",
    "org.scalatest" %% "scalatest" % "3.1.1" % Test,
  )
)
