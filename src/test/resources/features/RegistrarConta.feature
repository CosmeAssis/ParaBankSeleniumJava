#language: pt

Funcionalidade: Registrar uma nova conta no ParaBank
  Eu como usuário do ParaBank
  quero registrar uma nova conta
  para começar usar os serviços do ParaBank

  @Registar_NovaConta
Cenário: Registrar nova conta no Parabank

Dado que acesso o site ParaBank
Quando clicar em Register
E preencho os dados de cadastro
E clico no botão Register
Então mensagem de conta criada com sucesso é exibida