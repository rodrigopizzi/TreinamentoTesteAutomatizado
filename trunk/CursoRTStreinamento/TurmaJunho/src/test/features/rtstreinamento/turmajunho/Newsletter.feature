#language:pt
Funcionalidade: Cadastrar e-mail newsletter

  @executar-esse @validação
  Cenário: Cadastrar um email valido
    Dado que o eu esteja na página de newsletter
    Quando tento cadastrar o email "joao210620141040@gmail.com" na newsletter
    Então visualizo a mensagem "Seu cadastro foi realizado com sucesso em nossa newsletter."

  @exceção
  Cenário: Rejeitar cadastro email já existente
    Dado que o eu esteja na página de newsletter
    E o email "joao@gmail.com" já esteja cadastrado
    Quando tento cadastrar o email "joao@gmail.com" na newsletter
    Então visualizo a mensagem "Email já cadastrado."

  @exceção
  Cenário: Rejeitar formato de email inválido
    Dado que o eu esteja na página de newsletter
    Quando tento cadastrar o email "maria.#@gmail.com" na newsletter
    Então visualizo a mensagem "Email inválido."
