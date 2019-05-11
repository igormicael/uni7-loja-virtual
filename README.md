# uni7-loja-virtual

Projeto que visa construir aplicação Java EE multimódulo.

### Prerequisitos

- Java 11
- Maven
- Wildfly 16


### Instalação Docker

- Gerar a imagem do projeto [Reposicao](https://github.com/igormicael/uni7-reposicao)
- Gerar a imagem do projeto Loja, através dos comandos:
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

#### Visualizar itens no carrinho 

```sh
http://localhost:8080/loja/carrinho
```

#### Adicionar item no carrinho 

```sh
http://localhost:8080/loja/carrinho?acao=adicionar&produto=1&quantidade=1
```


#### Remover item no carrinho 

```sh
http://localhost:8080/loja/carrinho?acao=remover&produto=1&quantidade=1
```


#### Finalizar compra

```sh
http://localhost:8080/loja/carrinho?acao=finalizar
```
