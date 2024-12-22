## Demonstração de Threads em Kotlin para Android

**Print da Tela principal**

![image](https://github.com/user-attachments/assets/54f158e9-a5e2-453e-b1a4-37f3b12f0a57)


**Descrição:**

Este aplicativo Android, desenvolvido em Kotlin, tem como objetivo demonstrar de forma prática os conceitos de threads e sua importância no desenvolvimento de aplicativos mobile.

**Funcionalidades:**

* **UI Thread:** Ao clicar no botão "UI Thread", uma tarefa é iniciada na thread principal da aplicação. Isso simulará uma operação demorada, como uma requisição de rede, que bloqueará a interface do usuário, tornando a tela não responsiva.
* **Thread em Segundo Plano:** Ao clicar no botão "Thread", a mesma tarefa é executada em uma thread separada, permitindo que a interface do usuário continue responsiva durante a execução da tarefa.
* **Visualização da Thread:** O aplicativo exibe em tempo real a thread em que a tarefa está sendo executada, facilitando a compreensão do comportamento de cada botão.
* **Botão Parar: ** Para a execução da Thread e o mesmo botão se torna o botão : **Reiniciar**

**Tecnologias Utilizadas:**

* **Kotlin:** Linguagem de programação utilizada para o desenvolvimento do aplicativo.
* **Android Studio:** Ambiente de desenvolvimento integrado utilizado para criar aplicativos Android.
* **Threads:** Conceito fundamental da programação concorrente utilizado para executar tarefas em paralelo.

**Como Usar:**

1. Clone este repositório.
2. Abra o projeto no Android Studio.
3. Execute o aplicativo em um emulador ou dispositivo físico.
4. Clique nos botões "UI Thread" e "Thread" para observar o comportamento da aplicação.

**Resultados Esperados:**

Ao clicar no botão "UI Thread", você notará que a interface do usuário fica congelada durante a execução da tarefa, enquanto ao clicar no botão "Thread", a interface permanece responsiva.

**Aprendizados:**

* **Importância das Threads:** Demonstra a necessidade de executar tarefas longas em threads separadas para evitar que a interface do usuário fique bloqueada.
* **UI Thread:** Explica o papel da thread principal na atualização da interface do usuário.
* **Threads em Segundo Plano:** Apresenta como criar e utilizar threads para executar tarefas em background.

**Contribuições:**

Contribuições são bem-vindas! Se você encontrar algum bug ou tiver alguma sugestão, por favor, abra um issue ou faça um pull request.



**Autor:**

[Wesley]
[wesleyschuabvieira@gmail.com]

**Agradecimentos:**

[[Josivan]](https://www.linkedin.com/in/josivan-van-silva-phd-67861437/)
