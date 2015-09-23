//Group,  ArtifactId, Version
//addSbtPlugin("org.scalastyle" % "scalastyle_2.10" % "0.4.0")
//resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
//resolvers += Resolver.url("scoverage-bintray", url("https://dl.bintray.com/sksamuel/sbt-plugins/"))(Resolver.ivyStylePatterns)
addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.1.2")
//addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.1.0")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.7.0")
addSbtPlugin("org.flywaydb" % "flyway-sbt" % "3.2.1")

resolvers += "Flyway" at "http://flywaydb.org/repo"

addSbtPlugin("io.gatling" % "gatling-sbt" % "2.1.7")




resolvers += Resolver.url("gatling", url("http://dl.bintray.com/content/gatling/sbt-plugins/"))(Resolver.ivyStylePatterns)
resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"
resolvers += Resolver.url("scoverage-bintray", url("https://dl.bintray.com/sksamuel/sbt-plugins/"))(Resolver.ivyStylePatterns)

//addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.1.1")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.0")
addSbtPlugin("de.johoop" % "findbugs4sbt" % "1.4.0")
//addSbtPlugin("de.johoop" % "cpd4sbt" % "1.1.5")
addSbtPlugin("com.github.ajtkulov" % "scala-cpd" % "0.2")