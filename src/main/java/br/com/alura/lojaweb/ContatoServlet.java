/**
 * @author Raphael F.
 * OBJETIVO: mvn versions:use-latest-versions //ATUALIZA AS DEPENDENCIAS PARA A ULTIMA VERSAO
 *
 * mvn versions:display-dependency-updates //VERIFICA SE EXISTEM ATUALIZACOES PARA AS DEPENDENCIAS
 *
 * Comandos usados para rodar Maven:
 *	- verify (Se simplesmente utilizarmos o comando mvn verify no terminal, n�o teremos uma verifica��o efetiva, afinal n�o configuramos o PMD para ser utilizado no momento da verifica��o.) (Quando chegarmos na fase de verifica��o, ser�o executados todos os objetivos declarados no arquivo pom.xml, no caso, apenas pmd:check. A partir dessa modifica��o, todas as vezes que executarmos o comando mvn verify passaremos pelas fases de valida��o, compila��o, pacotes, e ent�o chegaremos � verifica��o.)(Executa o Jacoco caso esteja adicionado no POM)
 *	
 *	- pmd:pmd (analisa o c�digo fonte e detecta poss�veis margens de bug no c�digo)
 *
 *	- check (realiza uma varredura no build � procura de erros, inclusive interrompendo o projeto caso as regras definidas para o c�digo n�o sejam cumpridas)
 *
 * jetty:run (roda o servlet jetty)
 */

package br.com.alura.lojaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/contato"})
public class ContatoServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("<html><h2>Fale Conosco</h2></html>");
		writer.close();
	}

}
