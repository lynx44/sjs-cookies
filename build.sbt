organization := "com.standardedge"

name := "cookies"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.6"

jsDependencies += ProvidedJS / "cookies.js"

lazy val root = (project in file(".")).enablePlugins(ScalaJSPlugin)
