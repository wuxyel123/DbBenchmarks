# DbBenchmarks#

* The script for creating the table used for tests is in DATABASE folder
* During my tests i used postgresql 
* During my tests i deployed the WAR package in wildfly because I couldnt make it work on tomcat
* mvn clean install generates a deployable WAR package
* The database uri, username and password must be set both in application.properties file in the resources folder and in test.magnews.dbBenchmark.utils.DbUtils.java 
