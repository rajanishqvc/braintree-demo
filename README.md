"# braintree-demo" 

# Overview
Turns out that the Braintree gateway implementation was working after all.  The token was being generated, but the rest endpoint was not designed to return it.  

I've added a new controller for specifically retrieving the token, which is used on the web page javascript client implementation.   Please see [ClientTokenController.java](/src/main/java/com/qvc/demo/ClientTokenController.java)

# Install
```mvn clean compile```

# Run
```mvn spring-boot:run```

# Retrieve Client Token
```curl localhost:8080/client_token```
