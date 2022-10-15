#language: pt

Funcionalidade: Segunda Funcionalidade

  Cenario:Soma respondendo corretamente
    Quando joazinho soma 2 + 2
    Então o resultado sera 4
    E deu tudo OK


  Cenario: Passando Hash
    Quando eu passo varios dados
      | id       | 10                |
      | username | usuario           |
      | email    | usuario@email.com |
      | phone    | 12345             |
