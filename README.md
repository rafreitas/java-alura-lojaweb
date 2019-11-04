validate - validate the project is correct and all necessary information is available
compile - compile the source code of the project
test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
package - take the compiled code and package it in its distributable format, such as a JAR.
verify - run any checks on results of integration tests to ensure quality criteria are met
install - install the package into the local repository, for use as a dependency in other projects locally
deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.


mvn versions:use-latest-versions //ATUALIZA AS DEPENDENCIAS PARA A ULTIMA VERSAO

mvn versions:display-dependency-updates //VERIFICA SE EXISTEM ATUALIZACOES PARA AS DEPENDENCIAS

Comandos usados para rodar Maven:
	- verify (Se simplesmente utilizarmos o comando mvn verify no terminal, não teremos uma verificação efetiva, afinal não configuramos o PMD para ser utilizado no momento da verificação.) (Quando chegarmos na fase de verificação, serão executados todos os objetivos declarados no arquivo pom.xml, no caso, apenas pmd:check. A partir dessa modificação, todas as vezes que executarmos o comando mvn verify passaremos pelas fases de validação, compilação, pacotes, e então chegaremos à verificação.)(Executa o Jacoco caso esteja adicionado no POM)
	
	- pmd:pmd (analisa o código fonte e detecta possíveis margens de bug no código)

	- check (realiza uma varredura no build à procura de erros, inclusive interrompendo o projeto caso as regras definidas para o código não sejam cumpridas)

jetty:run (roda o servlet jetty)
