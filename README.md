# iPhone

# iPhone Component Model

Este projeto é uma representação UML e implementação em Java das funcionalidades principais do iPhone, conforme apresentado no lançamento do iPhone em 2007. O projeto abrange três funcionalidades principais: Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## Funcionalidades

### Reprodutor Musical
- `tocar()`: Inicia a reprodução de uma música.
- `pausar()`: Pausa a música em reprodução.
- `selecionarMusica(String musica)`: Seleciona uma música específica para reprodução.

### Aparelho Telefônico
- `ligar(String numero)`: Realiza uma chamada para o número especificado.
- `atender()`: Atende uma chamada recebida.
- `iniciarCorreioVoz()`: Inicia o correio de voz.

### Navegador na Internet
- `exibirPagina(String url)`: Exibe a página da web especificada pela URL.
- `adicionarNovaAba()`: Adiciona uma nova aba no navegador.
- `atualizarPagina()`: Atualiza a página atual no navegador.

## Diagrama UML

```mermaid
classDiagram
    interface ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    interface AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    interface NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
