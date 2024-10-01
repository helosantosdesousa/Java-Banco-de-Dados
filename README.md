# Gerenciador de Estoque em Java 📦

Este projeto é uma aplicação Java que gerencia produtos em estoque, utilizando uma estrutura básica de banco de dados através da classe `ProdutoDAO`. A classe `Main` executa as operações principais, como a inserção de novos produtos, a listagem dos produtos cadastrados e o cálculo do valor total do estoque.

## Funcionalidades

- **Inserção de Produtos**: Trechos de código comentados permitem a inserção de novos produtos, incluindo detalhes como ID, nome, quantidade em estoque e preço.
  
- **Listagem de Produtos**: A aplicação lista todos os produtos armazenados, exibindo suas informações no console.
  
- **Cálculo do Valor Total do Estoque**: Calcula e imprime o valor total de todos os itens em estoque, formatado para visualização monetária.
  
- **Identificação do Produto com Menor Estoque**: Determina e exibe qual produto possui a menor quantidade em estoque.

## Estrutura

- **Classe Produto**: Representa os produtos com atributos como ID, nome, quantidade e preço.
  
- **Classe ProdutoDAO**: Gerencia as operações de acesso ao banco de dados para os produtos.
  
- **Formato Decimal**: Utiliza `DecimalFormat` para garantir que os valores monetários sejam exibidos corretamente.

Este projeto serve como um bom exemplo de como implementar uma lógica básica de gerenciamento de estoque em Java, com foco na interação com dados de produtos.
