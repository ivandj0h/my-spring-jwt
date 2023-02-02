## My Spring JWT

### About
This is how i `Secure` my Spring Boot Application with JWT

```bash
THIS PROJECT STILL IN DEVELOPMENT
```

***

- Create pem file with openssl
```bash
openssl genrsa -out keypair.pem 2048
```

- Create public key from pem file
```bash
openssl rsa -in keypair.pem -pubout -outform PEM -out public.pem
```

- Create private key from pem file
```bash
openssl pkcs8 -topk8 -inform PEM -outform PEM -nocrypt -in keypair.pem -out private.pem
```