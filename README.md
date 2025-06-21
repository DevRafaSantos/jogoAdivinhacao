# 🎯 Jogo de Adivinhação (Java)

Um simples jogo de adivinhação feito em Java, onde o usuário precisa acertar um número aleatório entre 1 e 100. O sistema fornece dicas se o número é maior ou menor que o palpite, até o usuário acertar.

## 📌 Objetivo

- Gerar um número aleatório entre 1 e 100.
- O usuário tenta adivinhar o número através do terminal.
- A cada tentativa, o sistema informa se o número é maior ou menor que o palpite.
- Ao acertar, o programa exibe a quantidade de tentativas feitas.

## 🚀 Tecnologias Utilizadas

- Java 17+ (pode funcionar em versões anteriores)
- `java.util.Scanner` para entrada de dados
- `java.util.Random` para geração do número secreto

## 💻 Como Executar

1. Certifique-se de ter o Java instalado:
   ```bash
   java -version
   ```

2. Compile o código:
   ```bash
   javac jogoAdivinhacao.java
   ```

3. Execute o programa:
   ```bash
   java jogoAdivinhacao
   ```

## 🧠 Funcionalidades

- Geração aleatória de número entre 1 e 100
- Entrada de dados pelo terminal
- Dicas de "maior" ou "menor"
- Contagem de tentativas

## 📸 Exemplo de Uso

```
Digite o seu palpite: 
50
O número é maior que 50! Tente novamente!
Digite o seu palpite:
75
O número é menor que 75! Tente novamente!
...
Parabéns! Você acertou o palpite!
Seu palpite: 64
Número secreto: 64
Você tentou 5 vezes até acertar o palpite.
```

## 👤 Autor

- Rafael Santos de Andrade

## 📝 Licença

Este projeto está licenciado sob a licença de Rafael Santos.
