/**
 * validaçao dos campos obrigatorios
 * 
 * @aothor gabriel silva lins
 */

function validar(){
	// alert("teste");
	// validaçao do campos obrigatorios
	// as linhas abaixo capiturao o coteudo da caixa de texto do formulario e
	// armazenam nas
	// variaveis nome e fone
	
	let  produtos = frmestoque.produtos.value;
	let  quantidade = frmestoque.quantidade.value;
	let  valor = frmestoque.valor.value;
	let  datapd = frmestoque.datapd.value;
	let  validade = frmestoque.validade.value;
	
	// se nome nao foi preenchido
	
	if (produtos == "") {
		alert( "preencha o campo Produtos");
		frmestoque.produtos.focus();
		return false;
	} else if (quantidade == "") {
		alert("preencha o campo Quantidade");
		frmestoque.quantidade.focus();
		return false;
	} else if (valor == "") {
		alert("preencha o campo Valor");
		frmestoque.valor.focus();
		return false;
	} else if (datapd == "") {
		alert("preencha o campo Datapd");
		frmestoque.datapd.focus();
		return false;
	} else if (validade == "") {
		alert("preencha o campo Validade");
		frmestoque.validade.focus();
		return false;	
	} else{
	
	
	// a linha abaixo envia os documentos para o formulario
		
	document.forms["frmestoque"].submit();
 }
	

}
