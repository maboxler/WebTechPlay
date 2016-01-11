name := """UChess beta"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)


libraryDependencies += "ws.securesocial" %% "securesocial" % "3.0-M4"
resolvers += Resolver.sonatypeRepo("snapshots")



// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator


fork in run := true

fork in run := true