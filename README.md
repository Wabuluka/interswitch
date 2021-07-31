# Interswitch Employee Leave Management System
## Installion
### Requirements
This system has been developed using Java Spring Boot, there for; Running it requires one to
be running machines with Java installed.
* Download the source code from github
* Make sure all the dependences are installed.
* I am using IntelliJ IDEA. Simply load the source code and build the project. It will 
download all the required dependences.
  
#### Database
The system uses MySQL 8 for storing data.
Make sure you have it installed. In case you are using a lower MySQL version, It should work just as well
* Make sure in the properties file you change the username and password to much you system settings
* The database is called interswitch_db.

## Running the Web Application
After running the application in IntelliJ, it will create the database structure as required in Question 1.
It further inserts some demo data for the two database tables user and leave respectively

### Testing
Testing of this application can best be achieved using Post Man or any similar client <br>
* To see the list of leaves created by the system<br>
http://localhost:8080/api/v1/leave - Method {GET} <br>
* To create a leave for an employee <br>
 > http://localhost:8080/api/v1/leave - Method {POST} <br>
* To get all leaves created by the system <br>
> http://localhost:8080/api/v1/leave - Method {GET} <br>
  
### Others
Due to time limit, I have also included a class for users that simply creates 2 demo users.
> http://localhost:8080/api/v1/user - Method {GET} <br>

With this link you can have a look at the users created by the system.
  
### Areas to look at in the next update
Should there be an update to this software, database relationships shall be included through more advanced
JPA, TDD shall be implemented, validation shall also be added.

***
**Warning!**

Please note that this is a beta version of the application so there may be irregularities in 
how it operates, sometimes it may crush without warning or may simply refuse to work due to
several changes the developer may have made. 

Regards
> Davies Wabulukka