// Comment to get more information during initialization
logLevel := Level.Warn

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.3")
//addSbtPlugin("com.typesafe.play" % "sbt-plugin" % System.getProperty("play.version", "2.4.3"))

	// The Typesafe repository
	resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

	// Add Scalariform
	addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0")

	// PGP signing
	addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")

// Web plugins
addSbtPlugin("com.typesafe.sbt" % "sbt-coffeescript" % "1.0.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.0.6")
addSbtPlugin("com.typesafe.sbt" % "sbt-jshint" % "1.0.3")
addSbtPlugin("com.typesafe.sbt" % "sbt-rjs" % "1.0.7")
addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-mocha" % "1.1.0")

// Play enhancer - this automatically generates getters/setters for public fields
// and rewrites accessors of these fields to use the getters/setters. Remove this
// plugin if you prefer not to have this feature, or disable on a per project
// basis using disablePlugins(PlayEnhancer) in your build.sbt
addSbtPlugin("com.typesafe.sbt" % "sbt-play-enhancer" % "1.1.0")

// Play Ebean support, to enable, uncomment this line, and enable in your build.sbt using
// enablePlugins(SbtEbean). Note, uncommenting this line will automatically bring in
// Play enhancer, regardless of whether the line above is commented out or not.
// addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % "1.0.0")

//eclipse-plugin (else not possible to import play projects
//more info on:
//https://www.playframework.com/documentation/2.4.x/IDE#Eclipse
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "4.0.0")




