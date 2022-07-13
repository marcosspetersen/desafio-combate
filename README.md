# DESAFIO: Combate (Projeto de Estudo)
Em um jogo de combate, cada jogador joga com um campeão. Cada campeão possui um nome, uma
quantidade de ataque, armadura e vida. O combate entre dois campeões é organizado em turnos, de modo
que em cada turno, os dois campeões se atacam. Você deve fazer um programa para instanciar dois
campeões, depois executar N turnos de combate, mostrando a cada turno o estado de cada campeão,
conforme exemplos. Se em um turno um dos campeões morrer (quantidade de vida igual a zero), o
combate deve terminar. Ao final do combate, mostrar na tela "FIM DO COMBATE".

A regra para um campeão A receber dano de outro campeão B é a seguinte:
1) A quantidade de vida do campeão A deve ser decrescida da quantidade de ataque do campeão B, descontada a
quantidade de armadura do campeão A. A quantidade de vida resultante não pode ser menor que zero.
2) Independente da quantidade de armadura do campeão A, pelo menos 1 de vida o campeão A deve perder.

Você deve criar uma classe para representar o campeão.<br/>
O método takeDamage serve para fazer com que o campeão receba dano advindo do ataque de outro campeão,
conforme regras acima.<br/>
O método status deve retornar o nome e a situação de vida do campeão (inclusive com a palavra "morreu" se
a vida estiver a zero), conforme exemplos.<br/>

**EXEMPLO 1:**

Digite os dados do primeiro campeão:<br/>
Nome: Darius<br/>
Vida inicial: 50<br/>
Ataque: 8<br/>
Armadura: 1<br/>

Digite os dados do segundo campeão:<br/>
Nome: Fiora<br/>
Vida inicial: 40<br/>
Ataque: 10<br/>
Armadura: 2<br/>

Quantos turnos você deseja executar? 2

Resultado do turno 1:<br/>
Darius: 41 de vida<br/>
Fiora: 34 de vida<br/>

Resultado do turno 2:<br/>
Darius: 32 de vida<br/>
Fiora: 28 de vida<br/>

**FIM DO COMBATE**

**EXEMPLO 2:**

Digite os dados do primeiro campeão:<br/>
Nome: Darius<br/>
Vida inicial: 50<br/>
Ataque: 8<br/>
Armadura: 1<br/>

Digite os dados do segundo campeão:<br/>
Nome: Fiora<br/>
Vida inicial: 40<br/>
Ataque: 30<br/>
Armadura: 10<br/>

Quantos turnos você deseja executar? 4

Resultado do turno 1:<br/>
Darius: 21 de vida<br/>
Fiora: 39 de vida<br/>

Resultado do turno 2:<br/>
Darius: 0 de vida (morreu)<br/>
Fiora: 38 de vida<br/>

**FIM DO COMBATE**
