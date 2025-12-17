Start services in following order
Service Discovery
Product Discovery
User Service
API Gateway

Try following end points
In Chrome to confirm all services have started# 
http://localhost:8761/

In Postman
POST - localhost:8087/users/users
Add following in Body -> Raw -> json
[{"name":"Pravin Kashelkar","city":"Mumbai"},{"name":"Kashelkar Pravin","city":"Pune"}]

GET - localhost:8087/users/users

POST - localhost:8087/products/products
Add following in Body -> Raw -> json
[{"name":"Book 1","category":"Fictitious","price":"145","userId":"1"},{"name":"Book 2","category":"Science","price":"312","userId":"2"},{"name":"Book 3","category":"Technology","price":"410","userId":"2"},{"name":"Book 4","category":"History","price":"278","userId":"1"}]

GET - localhost:8087/products/products
GET - localhost:8087/users/users/products/1
