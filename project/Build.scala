import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "JapidSample42"
    val appVersion      = "0.8.0"

    val appDependencies = Seq(
        javaCore
//      "japid42" % "japid42_2.9.1" % "0.6.1"
        ,"org.apache.commons" % "commons-email" % "1.2"
        ,"commons-lang" % "commons-lang" % "2.6"
        ,"org.eclipse.tycho" % "org.eclipse.jdt.core" % "3.8.2.v20120814-155456"
        ,"com.google.code.javaparser" % "javaparser" % "1.0.8"

    )

    val japid = play.Project("japid42", "0.8.0", appDependencies, path = file("modules/japid42")).settings(
    )

    val main = play.Project(appName, appVersion, Seq()).settings(
//      resolvers += "Local Play Repository" at "/Users/bran/projects/playscala/repository/local"
      resolvers += Resolver.url("Japid on Github", url("http://branaway.github.com/releases/"))(Resolver.ivyStylePatterns),

      resourceDirectories in (Compile, run) <+= baseDirectory / "japidroot"

    ).dependsOn(japid)

}
