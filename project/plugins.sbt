resolvers += Resolver.url(
  "bintray-sbt-plugin-releases",
  url("https://dl.bintray.com/content/sbt/sbt-plugin-releases"))(
    Resolver.ivyStylePatterns)

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")

resolvers += Resolver.sonatypeRepo("snapshots")

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0")
