<hr>

 <div align=center>

# Olá, sejam bem-vindos! 👋

<hr>

![](api/src/assets/banner_Aluno_Online.png)

 <hr>

 </div>

## 📖 Sumário

- [Sobre](#-sobre)
- [Detalhes Técnicos](#-detalhes-técnicos)
  - [Tecnologias e Frameworks](#-tecnologias-e-frameworks)
  - [Configuração do Ambiente](#-configuração-do-ambiente)
  - [Fluxos do Sistema](#-fluxos-do-sistema)
- [Atividades](#-atividades)
  - [Atividade 1](#atividade-1)
    - Criar Aluno
  - [Atividade 2](#atividade-2)
    - Listar Todos Alunos
    - Buscar Aluno pelo ID
    - Deletar Aluno por ID
  - [Atividade 3](#atividade-3)
    - CRUD Aluno
    - CRUD Professor
    - CRUD Disciplina
  - [Atividade 4](#atividade-4)
    - Trancar Matrícula
    - Swagger


## 📚 Sobre
- Sou **Richelle Monteiro**, estudante do 3º período B noite de Sistemas para Internet no Centro Universitário-UNIESP;
- Esse repositório é destinado à disciplina de Tecnologia para Back-end I, prof Kelson Almeida
- O projeto é um sistema de cadastro Alunos, Professores e Disciplinas

## 📈 Detalhes Técnicos

### 📚 Tecnologias e Frameworks
- **Java** (versão 17)
- **Spring Boot** (versão 3.x)
- **Maven** para gerenciamento de dependências
- **Banco de dados PostgreSQL** (versão 15)
- **Insomnia** para testes das APIs
- **DBeaver** para visualização e manipulação do banco de dados

### 🛠️ Configuração do Ambiente
1. Instale o **Java 17** e o **Maven**.
2. Configure o banco de dados PostgreSQL e ajuste as credenciais no `application.properties`.
3. Execute `mvn spring-boot:run` para iniciar o projeto.

### 🔄 Fluxos do Sistema
- **Aluno**: CRUD completo + Trancamento de matrícula.
- **Professor**: CRUD completo.
- **Disciplina**: CRUD completo.
- **Swagger** disponível para visualização da API.

## 🎯 Atividades

#### Atividade 1

###### Criar Aluno

a. Print Insomnia (POST Criar Aluno - 201 Created)

<div align="center">

![](api/src/assets/criarAluno_insomnia.PNG)

</div>

b. Print DBeaver (Criação Aluno - banco de dados)
<div align="center">

![](api/src/assets/criarAluno_DBeaver.PNG)

</div>

[⬆ Voltar ao sumário](#-sumário)

<hr>

#### Atividade 2

###### Listar Todos os Alunos

a. Print Insomnia (GET Listar Todos Alunos - 200 OK)

<div align="center">

![](api/src/assets/listarTodosAlunos_insomnia.PNG)

</div>

b. Print DBeaver (Listar Todos Alunos - banco de dados)
<div align="center">

![](api/src/assets/listarTodosAlunos_DBeaver.PNG)

</div>

<hr>

###### Buscar Aluno pelo ID

a. Print Insomnia (GET Buscar Aluno pelo ID - 200 OK)

<div align="center">

![](api/src/assets/buscarAlunoPorId_insomnia.PNG)

</div>

b. Print DBeaver (Aluno ID 3 - banco de dados)
<div align="center">

![](api/src/assets/buscarAlunoPorId_DBeaver.PNG)

</div>

<hr>

###### Deletar Aluno pelo ID

a. Print Insomnia (DELETE Deletar Aluno pelo ID - 200 OK)

<div align="center">

![](api/src/assets/deletarAlunoPorId_insomnia.PNG)

</div>

b. Print DBeaver (Aluno ID 3 deletado - banco de dados)
<div align="center">

![](api/src/assets/deletarAlunoPorId_DBeaver.PNG)

</div>

[⬆ Voltar ao sumário](#-sumário)

<hr>

#### Atividade 3

###### Atualizar Aluno por ID

a. Print Insomnia (PUT Atualizar Aluno por ID - 204 NO CONTENT)

<div align="center">

![](api/src/assets/atualizarAlunoPorId_insomnia.PNG)

</div>

b. Print DBeaver (Atualizar Aluno por ID - banco de dados)
<div align="center">

![](api/src/assets/atualizarAlunoPorId_DBeaver.PNG)

</div>

<hr>

###### Criar Professor

a. Print Insomnia (POST Criar Professor - 200 OK)

<div align="center">

![](api/src/assets/criarProfessor_insomnia.PNG)

</div>

b. Print DBeaver (Criar Professor - banco de dados)
<div align="center">

![](api/src/assets/criarProfessor_DBeaver.PNG)

</div>

<hr>

###### Buscar Professor pelo ID

a. Print Insomnia (GET Buscar Professor pelo ID - 200 OK)

<div align="center">

![](api/src/assets/buscarProfessorPorId_insomnia.PNG)

</div>

b. Print DBeaver (Professor ID 2 deletado - banco de dados)
<div align="center">

![](api/src/assets/deletarProfessorPorId_DBeaver.PNG)

</div>

[⬆ Voltar ao sumário](#-sumário)

<hr>

<hr>

###### Listar Todos Professores

a. Print Insomnia (GET Listar Todos Professores - 200 OK)

<div align="center">

![](api/src/assets/listarTodosProfessores_insomnia.PNG)

</div>

b. Print DBeaver (Listar Todos Professores - banco de dados)
<div align="center">

![](api/src/assets/listarTodosProfessores_DBeaver.PNG)

</div>

<hr>

###### Deletar Professor pelo ID

a. Print Insomnia (DEL Deletar Professor pelo ID - 204 NO CONTENT)

<div align="center">

![](api/src/assets/deletarProfessorPorId_insomnia.PNG)

</div>

b. Print DBeaver (Professor ID 1 - banco de dados)
<div align="center">

![](api/src/assets/buscarProfessorPorId_DBeaver.PNG)

</div>

[⬆ Voltar ao sumário](#-sumário)

<hr>

###### Criar Disciplina

a. Print Insomnia (POST Criar Disciplina - 201 CREATED)

<div align="center">

![](api/src/assets/criarDisciplina_insomnia.PNG)

</div>

b. Print DBeaver (OST Criar Disciplina - banco de dados)
<div align="center">

![](api/src/assets/criarDisciplina_DBeaver.PNG)

</div>

<hr>

###### Listar Todas Disciplinas

a. Print Insomnia (GET Listar Todas Disciplinas - 200 OK)

<div align="center">

![](api/src/assets/listarTodasDisciplinas_insomnia.PNG)

</div>

b. Print DBeaver (Listar Todas Disciplinas - banco de dados)
<div align="center">

![](api/src/assets/listarTodasDisciplinas_DBeaver.PNG)

</div>

<hr>

###### Buscar Disciplina pelo ID

a. Print Insomnia (GET Buscar Disciplina pelo ID - 200 OK)

<div align="center">

![](api/src/assets/buscarDisciplinaPorId_insomnia.PNG)

</div>

b. Print DBeaver (Disciplina ID 3 - banco de dados)
<div align="center">

![](api/src/assets/buscarProfessorPorId_DBeaver.PNG)

</div>

[⬆ Voltar ao sumário](#-sumário)

<hr>

<hr>

###### Deletar Disciplina por ID

a. Print Insomnia (GET Listar Todos Professores - 200 OK)

<div align="center">

![](api/src/assets/listarTodosProfessores_insomnia.PNG)

</div>

b. Print DBeaver (Listar Todos Professores - banco de dados)
<div align="center">

![](api/src/assets/listarTodosProfessores_DBeaver.PNG)

</div>

<hr>

###### Deletar Professor pelo ID

a. Print Insomnia (DEL Deletar Disciplina pelo ID - 204 NO CONTENT)

<div align="center">

![](api/src/assets/deletarDisciplinaPorId_insomnia.PNG)

</div>

b. Print DBeaver (Disciplina ID 1 - banco de dados)
<div align="center">

![](api/src/assets/deletarDisciplinaPorId_DBeaver.PNG)

</div>

[⬆ Voltar ao sumário](#-sumário)

<hr>

#### Atividade 4

###### Trancar Matrícula

a. Print Insomnia (PATCH Trancar Matrícula - 204 No Content)

<div align="center">

![](api/src/assets/trancarMatricula_insomnia.PNG)

</div>

b. Print Insomnia (PATCH Trancar Matrícula - 400 Bad Request)
<div align="center">

![](api/src/assets/trancarMatricula400_insomnia.PNG)

</div>

c. Print DBeaver (Trancar Matrícula - banco de dados)
<div align="center">

![](api/src/assets/trancarMatricula_DBeaver.PNG)

</div>

<hr>

###### Swagger

a. Print Swagger
<div align="center">

![](api/src/assets/Swagger_documentacao.PNG)

</div>



[⬆ Voltar ao sumário](#-sumário)



<hr>
