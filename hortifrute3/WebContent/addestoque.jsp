<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("javabeans");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>estoque</title>
<link rel="icon" href="imagens/fa.jpg">
<link rel="stylesheet" href="style.css">


</head>

<header>
	<div id="layout">
		<div id='logo'>
			<img src="imagens/menu.png" alt="logotipo">
		</div>
		<nav>
			<ul>
				<li><a href="index.html">menu</a></li>
				<li><a href="facebook.com">sobre</a></li>
				<li><a href="">contato</a></li>
				<li><a href="">reds</a></li>
			</ul>
		</nav>
		<div id=link>
			<a href="addestoque.jsp" target="blank">Estoque</a>
		</div>

	</div>
</header>

<body>
	<h1>Estoque</h1>
	<a href="cadastro.html" class="Botao1">Adcionar ao Estoque</a>
	<table id="tabela">
		<thead>
			<tr>
				<th>id</th>
				<th>produtos</th>
				<th>quantidade</th>
				<th>valor</th>
				<th>datapd</th>
				<th>validade</th>
				

			</tr>
		</thead>

		<tbody>
		   <%for(int i=0; i <lista.size(); i++){ %>
		   <tr>
		     <td><%=lista.get(i).getId() %></td>
		     <td><%=lista.get(i).getProdutos() %></td>
		     <td><%=lista.get(i).getQuantidade()%></td>
		     <td><%=lista.get(i).getValor() %></td>
		     <td><%=lista.get(i).getDatapd() %></td>
		     <td><%=lista.get(i).getValidade() %></td>
		     </tr>
		   <% } %>
		</tbody>
	</table>
	


	<footer>
		<div class="layout">
			<div id="rodape">
				<p>₢2021 LinsHotiFruti</p>
			</div>
			<div id=social>
				<a href=" https://www.facebook.com" target="_blank"> <img
					src="imagens/face.png" alt="fecebook"></a> <a
					href=" http://www.instagram.com" target="_blank"> <img
					src="imagens/instagram.png" alt="instagram."></a> <a
					href=" http://www.twitter.com" target="_blank"> <img
					src="imagens/twitter.png" alt="twitter."></a> <a
					href=" http://www.youtube.com" target="_blank"> <img
					src="imagens/youtube.png" alt="youtube."></a>
			</div>

		</div>
	</footer>
</body>
</html>