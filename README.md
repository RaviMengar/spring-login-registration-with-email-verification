# Login And Registration With Email Verification

Complete login and sign-up backend system using Spring Boot.

- [x] Spring Boot
- [x] Spring Security
- [x] Java Mail
- [x] Email verification with expiry
- [x] Spring Boot

### CURL
```
curl --location --request POST 'localhost:8080/api/v1/registration' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "Ravi",
    "lastName": "Mengar",
    "email": "ravi*****@gmail.com",
    "password": "password"
}'
```
