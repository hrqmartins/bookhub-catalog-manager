# BookHub - Gestão de Catálogo Literário 📚

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Version](https://img.shields.io/badge/JDK-17%2B-blue?style=for-the-badge)

O **BookHub** é uma aplicação robusta de linha de comando (CLI) desenvolvida para gerenciar coleções de livros. O projeto vai além do CRUD básico, focando na organização eficiente de dados em memória, critérios de ordenação customizados e filtragem avançada.

## 🎯 Objetivos do Projeto

Este projeto foi construído para aplicar conceitos de engenharia de software fundamentais para o ecossistema Java, demonstrando a transição de um código acadêmico para uma estrutura profissional e organizada.

## 🚀 Funcionalidades

- **Gerenciamento de Inventário**: Adição, remoção e consulta de títulos no acervo.
- **Ordenação Inteligente**:
  - Ordenação natural por Título (implementando `Comparable`).
  - Ordenação por Preço ou Ano de Lançamento (implementando `Comparator`).
- **Filtragem com Stream API**: Localização rápida de livros por autor ou por faixas de preço específicas.
- **Relatórios Dinâmicos**: Exibição formatada e legível de todos os dados do acervo.

## 🛠️ Decisões Técnicas e Arquitetura

Para atrair a atenção de recrutadores, o código foi estruturado seguindo princípios que garantem manutenibilidade:

- **Java Collections Framework**: Escolha estratégica de `ArrayList` para acesso eficiente aos dados e manipulação dinâmica.
- **Encapsulamento Rigoroso**: Proteção das coleções internas para evitar efeitos colaterais (uso de métodos que retornam cópias defensivas ou listas não modificáveis).
- **Interface Segregation**: Implementação de interfaces de comparação para permitir múltiplos critérios de ordenação sem poluir a classe de domínio.
- **Clean Code**: Nomenclatura semântica em inglês (padrão de mercado) e métodos com responsabilidade única.

## 📂 Estrutura de Pastas

```text
src/
 └── br.com.bookhub/
      ├── model/       # Classes de domínio (Livro)
      ├── service/     # Lógica de negócio e gestão da lista
      ├── exception/   # Tratamento de erros customizados
      └── main/        # Ponto de entrada da aplicação
