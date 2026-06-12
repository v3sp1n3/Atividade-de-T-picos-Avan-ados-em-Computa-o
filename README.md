Esta aplicação foi desenvolvida para fornecer um resumo estatístico das consultas veterinárias cadastradas no sistema. Por meio do endpoint GET /consultas/resumo, a aplicação recupera todas as consultas armazenadas no banco de dados e processa essas informações em Java, utilizando apenas um único laço de repetição.

Ao executar a consulta, o sistema calcula e retorna:

O total de consultas realizadas;
A quantidade de consultas de cachorros;
A quantidade de consultas de gatos;
A idade média dos pets atendidos.

O resultado é disponibilizado em formato JSON, permitindo que outras aplicações ou interfaces consumam essas informações de maneira simples e organizada. Toda a lógica de contagem e cálculo é realizada na camada de serviço da aplicação, sem utilizar funções de agregação do banco de dados, atendendo às regras estabelecidas para o desenvolvimento da funcionalidade.
