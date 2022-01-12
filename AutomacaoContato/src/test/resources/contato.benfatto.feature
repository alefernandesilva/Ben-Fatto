#Author: alefernandes26@gmail.com

Feature: Teste regressivo Ben Fatto
  Eu como usuario quero acessar o site da Ben Fatto para validar mensagem de contato

  @positivo
  Scenario: CT01 Validar mensagem com dados validos
    Given que eu esteja no site da BenFatto "http://benfatto.net.br/"
    When clico no contato
    And preencho o nome "Teste"
    And preencho o empresa "Teste"
    And preencho o email "seuemail@gmail.com"
    And preencho o telefone "11999998888"
    And preencho a mensagem "Teste para validar o projeto de automacao"
    And clico em enviar
    Then sistema exibe mensagem de sucesso
    
  @negativo
  Scenario: CT02 Validar mensagem com dados em branco
    Given que eu esteja no site da BenFatto "http://benfatto.net.br/"
    When clico no contato
    And preencho o nome ""
    And preencho o empresa ""
    And preencho o email ""
    And preencho o telefone ""
    And preencho a mensagem ""
    And clico em enviar
    Then sistema exibe mensagens para preenchimento dos campos