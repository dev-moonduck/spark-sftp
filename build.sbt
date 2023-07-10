name := "spark-sftp"

organization := "md.lib"

scalaVersion := "2.12.17"

version := "0.1.0"

val v = new {
  val sftpClient = "1.0.3"
  val scalaTest = "3.2.16"
  val spark = "3.4.0"
  val sparkXml = "0.16.0"
  val sshj = "0.32.0"
}

// Dependent libraries
libraryDependencies ++= Seq(
//  "com.springml" % "sftp.client" % "1.0.3",
  "com.hierynomus" % "sshj" % v.sshj,
  "org.apache.spark" %% "spark-sql" % v.spark % Provided,
  "org.apache.spark" %% "spark-avro" % v.spark % Provided,
  "com.databricks" %% "spark-xml" % v.sparkXml
)

// Test dependencies
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % v.scalaTest,
  "org.apache.spark" %% "spark-hive" % v.spark
).map(_ % Test)

licenses := Seq("Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0"))

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
