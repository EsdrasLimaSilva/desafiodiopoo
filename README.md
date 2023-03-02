# Desafio DIO: Abstraindo um Bootcamp Usando Orientação a Objetos em Java

Este repositório é um desafio proposto pela Digital Innovation One relacionado a programação
orientada a objetos. O desafio consiste em abstrair um bootcamp, implementando as suas
funcionalidades mais básicas.

Este repositório foi construído utilizando a ferramenta Maven para maior facilidade na implementação
de testes no futuro. Além de ser uma forma de treinar os conhecimentos adquiridos no bootcamp sobre
a ferramenta.

## Como rodar?

-  Certificar-se que possui o JDK instalado, de preferência a versão 11 bem como o Maven.
-  Navege até a pasta do projeto na linha de comando e rode o camando "mvn package" no terminal para
   construir a pasta "target".
-  Em seguida, na sua IDE de preferência, basta apertar o botão de "play" para rodar.
-  Outra forma seria utilizando o Maven. Para fazer isso, dentro da pasta do projeto, digite o
   seguinte comando no terminal:

   <code>mvn exec:java -Dexec.mainClass="br.com.dio.Main"</code>

### Observação

Se você utiliza o visual studio code, na raiz do projeto adicione a pasta ".vscode" com o arquivo
settings.json dentro contendo o seguinte conteúdo:

<strong>"java.configuration.updateBuildConfiguration": "automatic"<strong>
