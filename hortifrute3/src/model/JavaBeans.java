package model;

/**
 * encapsulamento dos dados
 * 
 * 
 * @author gabriel da silva (fluxo)
 *
 */

public class JavaBeans {

	private String id;
	private String produtos;
	private String quantidade;
	private String valor;
	private String datapd;
	private String validade;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProdutos() {
		return produtos;
	}
	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getDatapd() {
		return datapd;
	}
	public void setDatapd(String datapd) {
		this.datapd = datapd;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public JavaBeans() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JavaBeans(String id, String produtos, String quantidade, String valor, String datapd, String validade) {
		super();
		this.id = id;
		this.produtos = produtos;
		this.quantidade = quantidade;
		this.valor = valor;
		this.datapd = datapd;
		this.validade = validade;
	}
  
	
}
