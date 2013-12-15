resolvers ++= Seq("less is" at "http://repo.lessis.me", "coda" at "http://repo.codahale.com")

resolvers += Resolver.url("sbt-plugin-releases", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

resolvers += "Scala-Tools Maven2 Snapshots Repository" at "http://scala-tools.org/repo-snapshots"

addSbtPlugin("org.ensime" % "ensime-sbt-cmd" % "0.1.2")

