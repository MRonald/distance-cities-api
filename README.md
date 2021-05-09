# distance-cities-api
Uma API em Java e Spring com um banco de dados Postgresql que retorna dados de países com o código BACEN, a lista de todos os estados brasileiros com seu código IBGE, DDDs regionais e informações do país do qual faz parte e também retorna a lista de cidades brasileiras com a sua UF, código IBGE e localização geográfica todos com paginação.

## Exemplos de busca via URL

URL base para busca de países (retorna a primeira página dos resultados):
>[https://distance-cities-api.herokuapp.com/countries](https://distance-cities-api.herokuapp.com/countries)

Busca a primeira página separando cada página em 10 itens:
>[https://distance-cities-api.herokuapp.com/countries?page=0&size=10](https://distance-cities-api.herokuapp.com/countries?page=0&size=10)

Busca ordenada por nome de forma ascendente:
>[https://distance-cities-api.herokuapp.com/countries?sort=name,asc](https://distance-cities-api.herokuapp.com/countries?sort=name,asc)

Todos esses parâmetros funcionam para a busca por estado ou cidade.

URL base para busca de estados (retorna a primeira página dos resultados):
>[https://distance-cities-api.herokuapp.com/states](https://distance-cities-api.herokuapp.com/states)

URL base para busca de cidades (retorna a primeira página dos resultados):
>[https://distance-cities-api.herokuapp.com/cities](https://distance-cities-api.herokuapp.com/cities)

A busca da distância entre duas cidades pode retornar a distância em metros ou em milhas, de acordo com a necessidade.

Busca da distância entre duas cidades em milhas:
>[https://distance-cities-api.herokuapp.com/distances/by-points?from=4929&to=5254](https://distance-cities-api.herokuapp.com/distances/by-points?from=4929&to=5254)

Busca da distância entre duas cidades em metros:
>[https://distance-cities-api.herokuapp.com/distances/by-cube?from=4929&to=5254](https://distance-cities-api.herokuapp.com/distances/by-cube?from=4929&to=5254)

Os parâmetros FROM e TO recebem o número do ID da cidade referente.

### Principais dependências
- Spring Data JPA
- Spring Web
- Hibernate Types
- Postgresql

### Extras
- Banco de dados gerenciado com Docker

### JDK Version
Open JDK 8
