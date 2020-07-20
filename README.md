# Prodcution-ready-hibernate-application-structure-for-creating-API-s
hibernate application structure for creating API's, This hibernate application structure is divided into 3 modules. so it becomes easy to manage the code of application.

# It has Three Modules
1. contains the pojo class
  - it also contains the code for database connectivity/configuration. so that is becomes easy to create/use session object.
2. contains the business Entity class
3. conatins the actual logic for database Interaction.

# URL Request example
ex- http://localhost:8080/ApiCallingApp/webapi/ApiCallingApp/getStudentsList

# Output

output - {"cIntResponseStatus":200,"cObjResponseData":[{"Roll_No":1,"Student_Name":"nikhil","Student_Surname":"nikhil","Student_MobileNo":1234568799},{"Roll_No":2,"Student_Name":"karan","Student_Surname":"karan","Student_MobileNo":1324567899},{"Roll_No":4,"Student_Name":"yash","Student_Surname":"yash","Student_MobileNo":1324569877}]}
