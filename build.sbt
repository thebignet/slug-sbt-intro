name:="slug"

ThisBuild / scalaVersion := "2.12.6"

val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"


lazy val slug = (project in file("."))
  .aggregate(slugDomain)
  .enablePlugins(JavaAppPackaging)
  .enablePlugins(GitVersioning)
  .settings(
    name := "slug",
    git.useGitDescribe := true,
    libraryDependencies += scalaTest % Test
  )

lazy val slugDomain = (project in file("domain"))
  .settings(
    name := "slugDomain",
    libraryDependencies += scalaTest % Test
  )