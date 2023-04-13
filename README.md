# Anotações Curso Especialista Java

Misura de C com C++, dedicada a evolução de microcomputadores, seu nome original foi linguagem Oak (Carvalho)


## Plataformas

 Obs: Entender o objetivo de cada plataforma e porque cada plataforma existe

- Java SE (Standard Edition), principal plataforma utilizada mundialmente. (https://docs.oracle.com/javase/specs/)
- Jakarta EE (Enterpise Edition), voltada para aplicações executadas em servidores


## Diferenças entre JRE e JDK

- JRE, software que irá realizar o load do program e binários java, ela terá presente também a JVM

- JDK, kit o desenvolvedor que contém o compilador  e outros utilitários para realizar a execução e desenvolvimento dos programas Java.

## Versões do Java

Antigamente demorava muito para que as releases das versões do Java fossem liberadas. Atualmente são liberadas versões FR duas vezes por ano (uma a cada seis meses). As versões LTS são lançadas a cada dois anos.

    - FR : Featue Release

    - LTS: Long Term Support

## Qual versão escolher para utilizar?

- A versão do JAVA 08 é a versão mais utilizada no mercado.

- A versão 17 é a mais recente LTS

- Nunca utilize a versão FR

## Distirbuição versus Licenças

    JAVA SE Especification (JSR) > OpenJDK (RI) (Implementação de Referência) > Depois disso, as empresas implementam as sua próprias distribuições.

- Distribuiçôes Recomendadas: 
     - https://www.oracle.com/br/java/technologies/java-se-glance.html
     - https://aws.amazon.com/pt/corretto/?filtered-posts.sort-by=item.additionalFields.createdDate&filtered-posts.sort-order=desc
     - (Recomendada para o curso) https://aws.amazon.com/pt/corretto/?filtered-posts.sort-by=item.additionalFields.createdDate&filtered-posts.sort-order=desc
    
- Site útil para trabalhar com múltiplas distribuições do JDK:
    - SDK Man (https://sdkman.io/)

 ``` sdk list java ```

 ``` sdk install java 17.0.2-tem ``` -> Default

 ``` sdk install java 11.0.14-tem ```

``` sdk use java 17.0.2-tem ``` ->  Para alternar

``` sdk default java 17.0.2-tem ``` -> Para tornar Default

# 

# Módulo 02 - Fundamentos da linguagem java

## O comando javac

Por defininição o comando javac é software responsável dentro do JDK por realizar a compilação de um arquivo .java.

Este software ao compilar o arquivo java irá gerar um arquivo de extensão .class com o mesmo nome. Este arquivo é arquivo de bytecode, que é interpretado pela JVM e poderá ser executado em qualquer abiente que tenha a JVM instalada...


``` git remote set-url origin https://github.com/guillecosme/curso-alga-works-especialista-java.git ```