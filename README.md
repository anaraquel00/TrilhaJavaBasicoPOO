# 📱 Projeto iPhone - Modelagem UML com Java

Este projeto implementa uma representação em Java das funcionalidades básicas de um iPhone, conforme apresentado no lançamento de 2007, utilizando princípios de POO e diagramação UML.

## 📊 Diagrama UML
    
    class iPhone {
        -String modelo
        -int armazenamento
        +iPhone(String modelo, int armazenamento)
        +tocar() void
        +pausar() void
        +selecionarMusica(String) void
        +ligar(String) void
        +atender() void
        +iniciarCorreioVoz() void
        +exibirPagina(String) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }
    
    interface ReprodutorMusical {
        <<interface>>
        +tocar() void
        +pausar() void
        +selecionarMusica(String) void
    }
    
    interface AparelhoTelefonico {
        <<interface>>
        +ligar(String) void
        +atender() void
        +iniciarCorreioVoz() void
    }
    
    interface NavegadorInternet {
        <<interface>>
        +exibirPagina(String) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }
    
    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorInternet

# 🛠️ Funcionalidades Implementadas

# 🔊 Reprodutor Musical
tocar(): Inicia a reprodução musical

pausar(): Pausa a reprodução atual

selecionarMusica(String musica): Seleciona uma música específica

# 📞 Aparelho Telefônico
ligar(String numero): Realiza chamadas telefônicas

atender(): Atende chamadas recebidas

iniciarCorreioVoz(): Acessa o correio de voz

# 🌐 Navegador na Internet
exibirPagina(String url): Carrega páginas web

adicionarNovaAba(): Abre nova aba de navegação

atualizarPagina(): Recarrega a página atual

# 📂 Estrutura do Projeto
src/
├── interfaces/
│   ├── ReprodutorMusical.java
│   ├── AparelhoTelefonico.java
│   └── NavegadorInternet.java
├── iPhone.java
└── Main.java

# 🚀 Como Executar
Clone o repositório:
git clone https://github.com/seu-usuario/projeto-iphone.git
cd projeto-iphone/src
javac *.java interfaces/*.java
java Main

# 📝 Licença
Este projeto está licenciado sob a licença MIT - veja o arquivo LICENSE para detalhes.

# 🤝 Contribuições
Contribuições são bem-vindas! Siga estes passos:

Faça um Fork do projeto

Crie sua Branch (git checkout -b feature/nova-funcionalidade)

Commit suas mudanças (git commit -m 'Adiciona nova funcionalidade')

Push para a Branch (git push origin feature/nova-funcionalidade)

Abra um Pull Request

Desenvolvido com ❤️ por Ana Raquel para a Dio
