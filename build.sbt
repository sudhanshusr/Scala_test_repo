
//Organization
organization := "com.cybage.hellosbt"

//Version of your project
version := "0.1.0"

//Scala version
scalaVersion := "2.11.6"

//Name of Project
name := "Scala_test_plugin_created"



jacoco.settings

coverageEnabled := true

coverageMinimum := 10

coverageFailOnMinimum := true

coverageExcludedPackages := "<empty>;Reverse.*;.*AuthService.*;models\\.data\\..*"

import de.johoop.findbugs4sbt.FindBugs._

findbugsSettings

findbugsReportType := Some(de.johoop.findbugs4sbt.ReportType.Html)


//import de.johoop.cpd4sbt.CopyPasteDetector._

//cpdSettings

val myProject = (project in file(".")).enablePlugins(CpdPlugin)


libraryDependencies ++= 
			Seq("junit" % "junit" % "4.10",
			"com.novocode" % "junit-interface" % "0.11" % Test,
				"org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
    		)
			
libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "2.35.0" % "test"

libraryDependencies ++= Seq(
    "com.h2database" % "h2" % "1.3.174"
)	
			

    		
