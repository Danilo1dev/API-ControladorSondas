# _Controlador de Sondas_

Elo7

Uma Sonda Espacial precisa de um local para pousar e realizar sua movimentação, então é necessário ter um Planeta.
No critério das informações é necessário criar uma sonda e um planeta para que consiga pousar.

- Sonda
- Planeta
- Direção de movimentação (N, E, S, W)

## Sonda
Instruções para se movimentar após o pouso.

- M -> Andar para a frente na direção que está 1 posição.
- L -> Virar a sonda para a esquerda (90 graus)
- R -> Virar a sonda para a direita (90 graus)

## Api
Para este projeto foi realizado a aplicação sobre camadas referenciado ao padrão Rest.
Cada camada tem sua funcionalidade especifica. Com isso foi criadas as Api's Sonda e Planeta para atender a regra de negocio.

- Planeta

A Api Planeta contem domino de limiteX e limiteY para delimitar o tamanho do territorio que a sonda pode explorar, e a posição do pouso.

- Sonda

A Api Sonda contem dominio de direção e posiçãoX e posiçãoY .

## Powered By

-Spring Boot 2.7.3;

-Banco H2;

-Swagger;

-Java 11;

## Desafio
Segue o enunciado original:

| GitHub | [Elo7](https://gist.github.com/Danilo1dev/fb8723aa018d59f917c06590b501962d).

## Develop
Contem todo projeto implementado.

- Link para [Testar aplicação local](http://localhost:8080/controlador-sondas/api/public/swagger-ui/index.html#/).

