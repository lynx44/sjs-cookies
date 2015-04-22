organization := "com.standardedge"

name := "cookies"

version := "1.0"

scalaVersion := "2.11.6"

jsDependencies += ProvidedJS / "cookies.min.js"

lazy val root = (project in file(".")).enablePlugins(ScalaJSPlugin)