# Sistema de Gestão de Biblioteca

Bem-vindo ao projeto de **Sistema de Gestão de Biblioteca**! O objetivo é aplicar conceitos fundamentais de Java, incluindo herança, polimorfismo, estruturas de repetição, e manipulação de datas.

## Funcionalidades

### Gerenciamento de Livros
- **Listar todos os livros disponíveis**: Exibe apenas os livros que estão disponíveis para empréstimo.
- **Realizar empréstimo de um livro**: Permite que um usuário escolha um livro disponível e registre o empréstimo.

## Estrutura do Projeto

O projeto é dividido nas seguintes classes principais:

- **Livro**: Representa os livros na biblioteca, com atributos como `id`, `titulo`, `autor`, `disponivel`, `dataCadastro` e `dataAtualizacao`.
- **Autor**: Representa os autores dos livros, com atributos como `id`, `nome` e `dataNascimento`.
- **Biblioteca**: Gerencia a coleção de livros, autores, empréstimos e clientes do sistema.
- **Cliente**: Representa os clientes do sistema, com atributos `livroPego`, `nome`, `idade` e `id`.
## Requisitos

- **Java Development Kit (JDK)** 8 ou superior
- **IDE** de sua escolha (Eclipse, IntelliJ IDEA, NetBeans, etc.)

## Como Iniciar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/sistema-gestao-biblioteca.git
