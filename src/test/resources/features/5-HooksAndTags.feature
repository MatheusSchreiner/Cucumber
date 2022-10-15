#language: pt

Funcionalidade: Hooks and Tags

  Cenario: primeiro cenario
    Então roda

  @wip
  Cenario: Este cenario nao ira rodar
    Dado que estou utilizando a tag wip

  @tag
  Cenario: Este cenario ira rodar o segundo Before apenas uma vez
    Dado que estou utilizando a tag

  @token
  Cenario: Com hook
    Entao Apenas este cenario ira rodar o segundo Before


  @deleteUser
  Cenario: delecao do usuario
