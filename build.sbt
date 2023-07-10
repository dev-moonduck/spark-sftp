name := "spark-sftp"

organization := "md.lib"

scalaVersion := "2.12.17"

//sparkVersion := "3.4.0"

//spName := "md-lib/spark-sftp"

version := "0.1.0"

val v = new {
  val sftpClient = "1.0.3"
  val scalaTest = "3.2.16"
  val spark = "3.4.0"
  val sparkXml = "0.16.0"
}

// Dependent libraries
libraryDependencies ++= Seq(
  "com.springml" % "sftp.client" % "1.0.3",
//  "org.mockito" % "mockito-core" % "2.0.31-beta",
  "com.databricks" %% "spark-xml" % v.sparkXml
)

// used spark components
//sparkComponents += "sql"

// Repositories
//resolvers += "Spark Package Main Repo" at "https://dl.bintray.com/spark-packages/maven"

// Spark packages
//spDependencies += "com.databricks/spark-avro_2.11:3.2.0"

// Test dependencies
libraryDependencies += "org.scalatest" %% "scalatest" % v.scalaTest % "test"
//libraryDependencies += "org.apache.avro" % "avro-mapred" % "1.7.7" % "test" exclude("org.mortbay.jetty", "servlet-api")
libraryDependencies +=  "org.apache.spark" %% "spark-hive" % v.spark % "test"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % v.spark % Provided
)

//spIgnoreProvided := true
// licenses := Seq("Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0"))

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

//publishTo := {
//  val nexus = "https://oss.sonatype.org/"
//  if (version.value.endsWith("SNAPSHOT"))
//    Some("snapshots" at nexus + "content/repositories/snapshots")
//  else
//    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
//}

//pomExtra := (
//  <url>https://github.com/springml/spark-sftp</url>
//    <licenses>
//      <license>
//        <name>Apache License, Verision 2.0</name>
//        <url>http://www.apache.org/licenses/LICENSE-2.0.html</url>
//        <distribution>repo</distribution>
//      </license>
//    </licenses>
//    <scm>
//      <connection>scm:git:github.com/springml/spark-sftp</connection>
//      <developerConnection>scm:git:git@github.com:springml/spark-sftp</developerConnection>
//      <url>github.com/springml/spark-sftp</url>
//    </scm>
//    <developers>
//      <developer>
//        <id>springml</id>
//        <name>Springml</name>
//        <url>http://www.springml.com</url>
//      </developer>
//    </developers>)
