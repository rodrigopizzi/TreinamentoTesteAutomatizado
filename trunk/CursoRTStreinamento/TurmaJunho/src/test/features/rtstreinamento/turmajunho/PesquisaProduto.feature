#language:pt
Funcionalidade: Pesquisa de produtos

  Contexto: 
    Dado que eu esteja na página de pesquisa de produto

  @validação
  Cenário: Pesquisar produto pelo nome completo
    Dado que o filme "Senhor dos Anéis - As duas Torres" esteja cadastrado
    Quando pesquiso o filme "Senhor dos Anéis - As duas Torres"
    Então visualizo que o filme foi pesquisado

  @validação @execução-manual
  Cenário: Pesquisar produto por parte do nome
    Dado que o filme "Senhor dos Anéis - As duas Torres" esteja cadastrado
    E que o filme "Senhor dos Anéis - A sociedade do anel" esteja cadastrado
    Quando pesquiso o filme "Senhor dos Anéis"
    Então visualizo dois filmes no resultado da pesquisa

  @validação
  Cenário: Pesquisar produto indisponível
    Dado que o filme "Thor" esteja cadastrado como indisponível
    Quando pesquiso o filme "Thor"
    Então visualizo o filme como indisponivel no resultado da pesquisa

  @exceção
  Cenário: Pesquisar produto inexistente
    Dado que o filme "O espetacular homem aranha 2" não esteja cadastrado
    Quando pesquiso o filme "O espetacular homem aranha 2"
    Então visualizo a mensagem Produto não cadastrado

  @exceção
  Cenário: Pesquisar sem informar o nome do produto
    Dado que existam filmes cadastrados
    Quando pesquiso o filme sem informar o nome
    Então visualizo todos os produtos cadastrados

  @validação
  Esquema do Cenário: Pesquisar produto por parte do nome
    Dado que o filme "Senhor dos Anéis - As duas Torres" esteja cadastrado
    E que o filme "Senhor dos Anéis - A sociedade do anel" esteja cadastrado
    Quando pesquiso o filme "<valor-pesquisar>"
    Então visualizo "<quantidade>" filmes no resultado da pesquisa

    Cenários: 
      | valor-pesquisar | quantidade |
      | Senhor          | 2          |
      | Anéis           | 2          |
      | dos             | 2          |
      | Sociedade       | 1          |
