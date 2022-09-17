# DbBenchmarks
This simple application lets you test your database from a spring boot context.

##Usage info
* Prepare two .txt, one containing the insert queries and one containing the select queries you want to bench. Put a query for each line
* The script to generate the test table I used and the test .txt files populated with queries are in the DATABASE folder
* In the DATABASE folder there is also a python script to generate two test files with insert and select statements
* Clearing the table after each test is up to the user
* Set the database uri, username, password, schema and input files path in ```src/main/resources/application.properties```
* Generates a deployable WAR package with the command: ```mvn clean install -DskipTests```
* Deploy the application

Once the app is deployed you can call the service via a REST request with the following endpoint and payload: 
 * Endpoint: ```/dbBenchmark/db/benchmark```


