# Sistema de Funcionários - Revisão POO1 em Java

Este projeto foi desenvolvido como exercício de revisão para a disciplina de Programação Orientada a Objetos 1 (POO1), utilizando conceitos como classes, herança, sobrescrita de métodos e agregação.

## 📚 Descrição

O sistema simula um cadastro de funcionários de uma organização, permitindo:
- Armazenar dados pessoais e endereço.
- Calcular o pagamento do salário em parcelas.
- Especializar funcionários como professores com regras diferentes de pagamento.
- Gerar listagens ordenadas:
  - Por nome completo.
  - Por salário.
  - Por cidade de residência.

## 🏗️ Estrutura de Classes

### 🔹 `Endereco`
Contém informações do local de residência:
- `logradouro` (String)
- `bairro` (String)
- `cidade` (String)
- `estado` (String)

### 🔹 `Pessoa`
Classe base que possui:
- `nome` (String)
- `sobrenome` (String)
- `endereco` (agregação com `Endereco`)

Método adicional:
- `getNomeCompleto()` → retorna o nome completo formatado.

### 🔹 `Funcionario` (extends `Pessoa`)
Adiciona:
- `matricula` (int)
- `salario` (double, não permite valores negativos)

Métodos:
- `getSalarioPrimeiraParcela()` → 60% do salário.
- `getSalarioSegundaParcela()` → 40% do salário.

### 🔹 `Professor` (extends `Funcionario`)
Especialização de `Funcionario`.
- Sobrescreve os métodos de parcelas para receber 100% do salário na primeira parcela e 0% na segunda.

### 🔹 `MockMain`
Classe principal que:
- Cria objetos de exemplo.
- Imprime listagens de funcionários:
  - Ordenados pelo nome.
  - Ordenados pelo salário.
  - Filtrados pela cidade de residência.

## 🖥️ Como executar

1. **Clone o repositório do projeto:**

```bash
git clone https://github.com/grebechi/revisao-prova-poo1.git
```

2. **Abra o NetBeans.**

3. **Vá em File > Open Project e selecione a pasta do projeto que você clonou.**

4. **No NetBeans, clique com o botão direito no projeto e selecione Run ou pressione F6 para executar a MainClass (MockMain.java).**

## 🔎 Exemplo de Saída

=== Funcionários ordenados por nome ===
Antônio Ferreira
Bruno Oliveira
Carlos Silva
Eduardo Matos
Gabriel Rebechi

=== Funcionários ordenados pelo salário ===
Bruno Oliveira - Salário: 2800,00
Carlos Silva - Salário: 3200,00
Eduardo Matos - Salário: 3500,00
Antônio Ferreira - Salário: 4500,00
Gabriel Rebechi - Salário: 5000,00

=== Funcionários que moram na cidade de Osório ===
Bruno Oliveira - Cidade: Osório
Carlos Silva - Cidade: Osório
Eduardo Matos - Cidade: Osório
