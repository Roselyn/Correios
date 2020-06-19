# language: pt

Funcionalidade: Pesquisa CEP 
  Para pesquisar um CEP
  Sendo eu um cliente
  Quero fazer uma busca com sucesso 
  
Esquema do Cenário: Pesquisa com sucesso 
  Dado que esteja na tela inicial
  Quando eu pesquisar um <cep>
  Então o resultado com o nome da Rua será exibido

Exemplos:

|cep|
|"02516030"|

Esquema do Cenário: Pesquisa Logradouro 
  Dado que esteja na tela inicial
  Quando eu pesquisar um <logradouro>
  Então os resultados com os CEPs será exibido

Exemplos:

|logradouro|
|"Avenida Medeiros"|
