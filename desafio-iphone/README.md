## POO - Desafio
Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.

Com base no vídeo de lançamento do iPhone conforme link abaixo, elabore em uma ferramenta de UML de sua preferência a  
diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reproduzir Musical, Aparelho  
Telefônico e Navegador na Internet. Em seguida crie as classes e interfaces no formato de arquivos .java

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
* Minutos relevantes do 00:15 até 00:55

Comportamentos esperados:
* Reproduzir Musical: tocar, pausar, selecionarMusica
* Aparelho Telefônico: ligar, atender, iniciarCorreioVoz
* Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina

Funcionalidades a Modelar
1) Reproduzir Musical
    * Métodos: tocar(), pausar(), selecionarMusica(String musica)
2) Aparelho Telefônico
    * Métodos: ligar(String numero), atender(), iniciarCorreioVoz()
3) Navegador na Internet
    * Métodos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()

## Objetivo
1) Criar um diagrama UML que represente as funcionalidades descritas acima.
2) Implementar as classes e interfaces correspondentes em Java(Opcional)

## Exemplo de Diagrama UML (Mermaid)
![Exemplo UML](/resources/exemplo_uml.png "Exemplo UML")

## Intruções
1) Assista ao vídeo do lançamento do iPhone para entender as funcionalidades principais.
2) Utilize uma ferramenta UML de sua preferência para criar o diagrama das classes e interfaces. Você pode utilizar o  
modelo acima (criado na sintaxe Mermaid), 3) uma alternativa open-source e compatível com arquivos Markdown como este.
4) Opcionalmente, caso esteja cheio(a) de confiança, pode implementar as classes Java representadas em seu diagrama UML.
5) Submeta seu repositório GitHub conforme as orientações da plataforma DIO. Por exemplo:
https://github.com/glysns/trilha-java-basico/desafios/poo/README.md

########################################################################
## Diagrama criado
![Diagrama criado](/resources/modelagem_iphone.drawio.png "Diagrama criado")