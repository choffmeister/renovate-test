name := "renovate-test"
scalaVersion := "2.12.10"
organization := "de.choffmeister"

resolvers in ThisBuild ++= Seq(
  "pkgdist" at s"https://maven.pkg.airfocus.dev",
  Resolver.jcenterRepo,
  Resolver.bintrayRepo("choffmeister", "maven")
)

libraryDependencies ++= Seq(
  "io.airfocus" %% "airfocus-team-service-api" % Versions.airfocusTeamServiceApi,
  "org.scalatest" %% "scalatest" % Versions.scalatest % Test,
)
