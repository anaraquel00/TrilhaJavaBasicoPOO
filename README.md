# TrilhaJavaBasicoPOO

1. Diagrama UML

+---------------------+       +-----------------------+
|      <<interface>>  |       |       <<interface>>   |
|   ReprodutorMusical |       |   AparelhoTelefonico  |
+---------------------+       +-----------------------+
| + tocar(): void     |       | + ligar(numero: String): void |
| + pausar(): void    |       | + atender(): void             |
| + selecionarMusica( |       | + iniciarCorreioVoz(): void   |
|   musica: String):  |       +-----------------------+
|   void              |
+---------------------+

+---------------------+       +---------------------+
|      <<interface>>  |       |       iPhone        |
|   NavegadorInternet |       +---------------------+
+---------------------+       | - modelo: String    |
| + exibirPagina(     |       | - armazenamento: int|
|   url: String): void|       +---------------------+
| + adicionarNovaAba():|      | + tocar(): void    |
|   void              |       | + pausar(): void   |
| + atualizarPagina(): |      | + selecionarMusica(|
|   void              |       |   musica: String): |
+---------------------+       |   void             |
                              | + ligar(numero:    |
                              |   String): void    |
                              | + atender(): void  |
                              | + iniciarCorreio-  |
                              |   Voz(): void      |
                              | + exibirPagina(    |
                              |   url: String):    |
                              |   void             |
                              | + adicionarNovaAba(|
                              |   ): void          |
                              | + atualizarPagina( |
                              |   ): void          |
                              +---------------------+                        
