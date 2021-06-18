package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * CAMADA MODEL DO MODELO MVC
 * 
 * @author gabriel da silva
 *
 */

public class DAO {
	/* conexao com o banco de dados */
	/* parametrosde conexao */
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://10.26.49.101:3306/estoque?useTimezone=true&serverTimezone=UTC";
	private String user = "silva";
	private String password = "Senac@123456";

	/**
	 * conexao com o banco de dados
	 * 
	 * @return con
	 */

	private Connection conectar() {
		// criar um obijeto para conexao co mo banco
		Connection con = null;
		// tratamento de exce�oes
		try {
			// execu�ao do driver
			Class.forName(driver);
			// esta linha executa a conexao
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/**
	 * texte de conexao
	 */
	public void testarConexao() {
		try {
			//estabelecer conexao (metodo conectar()(abrir a jeladera))
			Connection con = conectar();
			// escreve no console
			System.out.println("teste de conexao hortifruti");
			System.out.println(con);
			//finalizar a conexao (fechar a porta da geladeira)
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	

	/* CRUD CREATE */
	public void inserirestoque(JavaBeans javabeans) {
		//query (comando sql para inserir um estoque)
		String create ="insert into tabelaestoque (produtos,quantidade,valor,datapd,validade) values(?,?,?,?,?)";
		try {
			//abrir a conexao com o banco de dados
			Connection con = conectar();
			//passo 7 e 8 pegar os dados do estoque da classe javabeans e
			//subistituir as (?,?,?) para armazenar no banco
			PreparedStatement pst = con.prepareStatement(create);
			
			pst.setString(1, javabeans.getProdutos()); //(?   )
			pst.setString(2, javabeans.getQuantidade()); //( ?  )
			pst.setString(3, javabeans.getValor());//(   ?)
			pst.setString(4, javabeans.getDatapd());//(   ?)
			pst.setString(5, javabeans.getValidade());//(   ?)
			//executar a query (comando sql) gravando os dados no banco
			pst.executeUpdate();
			
			// nao esquecer de fechar a conexao
			con.close();
						
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	/* CRUD READ */
	//AttayList -> trabalha a variaveis com varios conteudos como se fosse uma lista dinamica comesso
		public ArrayList<JavaBeans> listarprodutos(){
			//criar um obijeto para armazenar a lista no javabeans
			ArrayList<JavaBeans> javabeans = new ArrayList<>();
			//criar uma variavel para executar a query (comondo do banco de dados)
			String read = "select * from tabelaestoque order by produtos" ;
			//tratamento de  exece�oes ( nao e possivel a resoluc�ao pe�o desenvolvedor)
			try {
				
				//se tudo ok
				//abrir a cinexao com o banco (abrir a porta
				Connection con = conectar();
				
				//prepara a conexao(executar da query (comando sql)
				PreparedStatement pst = con.prepareStatement(read);
				
				//executar a query(comando)passo-3
				ResultSet rs = pst.executeQuery();
				//enquanto houver contatos no banco
				
				
				while (rs.next()) {
					//armazenar os contatos na lista(Arraylist) passo 4 e 5
					String id = rs.getString(1);
					String produtos = rs.getString(2);
					String quantidade = rs.getString(3);
					String valor = rs.getString(4);
					String datapd = rs.getString(5);
					String validade = rs.getString(6);
					javabeans.add(new JavaBeans(id,produtos,quantidade,valor,datapd,validade));
					
					//teste de recebimento da listagem do banco]
					
				//System.out.println(rs.getString(1));
				//System.out.println(rs.getString(2));
				//System.out.println(rs.getString(3));
				//System.out.println(rs.getString(4));
				
				}
				con.getClass();
				return javabeans;
						
			} catch (Exception e) {
				//caso ocorra uma excexao,mostrar(e)
				//System.out.println -> ecrever no console ("so o desenvolvedor")
				System.out.println(e);
				//fechar a porta encerrar a conexao
				return null;
			}
		
		}
	

	/*  CRUD  UPDATE */

	/*  CRUD DELETE */

}
