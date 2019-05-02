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

### Urls

Todas as urls responderão no formato **JSON**.

#### Listagem de itens do estoque

```sh
http://localhost:8080/loja/estoque
```

#### Aumentar quantidade de item do estoque

```sh
http://localhost:8080/loja/estoque?acao=aumentar&item=1
```

#### Diminuir quantidade de item do estoque

```sh
http://localhost:8080/loja/estoque?acao=diminuir&item=1
```

