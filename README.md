# Stream API
### O que é?
API do java para operações com coleções, ela abitrai grande parte do trabalho do desenvolvedor, fazendo com que o desenvolvedor foque na sua logica de negocio sem necessariamente se preocupar com a implementação de todo o codigo.

### operações com Stream
Existem mais de 30 operações e 7 staticos que podem ser feitas com Stream:

- Build - construtor de stram
- Intermediarias -  sempre retornam uma stream, que pode ser reutiliazado
- Terminais - geram algo diferente de um stram, podendo ser : void, double, int, String ...

### Tipos de Stream
- [x] **Ordenada** 
- [x] **Não ordenada**

- [x] **sequencial** - processa a stream de forma sequencial
- [x] **paralela** - executa o processamento de forma paralela. Internamente seram craidas varias linhas paralelas de processamento sem se preocupar com a implementação