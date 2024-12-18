# Services
1. Upi-Service: Quarkus with oracle integration with few endpoints
2. Mountebank for mocking the switch mb start
3. Oracle database docker compose dile


# Further steps to start
1. Upi-Service - Refer to it;s readme
2. mountebank - mb start(Ensure you have nodejs installed). This is just a mock server, so if you find difficuly with JS, write your own custom mock server
3. To start oracle db - run 
```
docker-compose up -d
```
Next install DBeaver to check the connection. It should be localhost with port 1521. The user details/password is present inside yaml. When the oralce starts, ensure a pluggable db is created, if not then create one.