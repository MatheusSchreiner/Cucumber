#language: pt

Funcionalidade: Terceira Funcionalidade


  Esquema do Cenario: Soma respondendo corretamente
    Quando joazinho soma <primeironumero> e <segundonumero>
    Então o resultado da soma sera <resultado>

    Exemplos:
      | primeironumero | segundonumero | resultado |
      | 1              | 1             | 2         |
      | 2              | 2             | 4         |
      | 2              | 2             | 6         |

