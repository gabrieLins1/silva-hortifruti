package model;

/**
 * encapsulamento dos dados
 * 
 * @author gabriel.slins1
 *
 */

public class JavaBeans {

	private String id;
	private String produto;
	private String quantidade;
	private String valor;
	private String datapd;
	private String validade;

	/**
	 * id
	 * 
	 * @return id
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * produto
	 * 
	 * @return produto
	 */
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	/**
	 * quantidade
	 * 
	 * @return quantidade
	 */
	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * valor
	 * 
	 * @return valor
	 */
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	/**
	 * datapd
	 * 
	 * @return datapd
	 */
	public String getDatapd() {
		return datapd;
	}

	public void setDatapd(String datapd) {
		this.datapd = datapd;
	}

	/**
	 * validade
	 * 
	 * @return validade
	 */
	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	/**
	 * controle padrao
	 */
	public JavaBeans() {
		super();

	}

	/**
	 * contrutor para uso do arraylist
	 * 
	 * @param id
	 * @param produto
	 * @param quantidade
	 * @param valor
	 * @param datapd
	 * @param validade
	 */
	public JavaBeans(String id, String produto, String quantidade, String valor, String datapd, String validade) {
		super();
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = valor;
		this.datapd = datapd;
		this.validade = validade;
	}

}
