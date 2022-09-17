# DbBenchmarks
This simple application lets you test your database from a spring boot context.

##Usage info
* Set the database uri, username and password in ```src/main/resources/application.properties```
* Generates a deployable WAR package with the command: ```mvn clean install -DskipTests```

Once the app is deployed you can call the service via a REST request with the following endpoint and payload: 
 * Endpoint: ```/dbBenchmark/db/benchmark```
 * Payload: 
  ```{
   "insertNumberToBenchmark": #Number of lines to insert
   ,"selectNumberToBenchmark":#Number of lines to select
   ,"commitAfterXStatement": #Number of statements after a commit is performed
   }```

