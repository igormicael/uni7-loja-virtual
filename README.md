# uni7-loja-virtual

Projeto que visa construir aplicação Java EE multimódulo.

### Prerequisitos

- Java 11
- Maven
- Wildfly 16

### Instalação Local

```sh
mvn clean install
```
```sh
mvn eclipse:eclipse
```

### Instalação Docker

```sh
docker build -t loja .
```
```sh
docker run -p 9990:9990 -p 8080:8080 loja
```

#### Acessar em

```sh
http://localhost:8080/loja
```

