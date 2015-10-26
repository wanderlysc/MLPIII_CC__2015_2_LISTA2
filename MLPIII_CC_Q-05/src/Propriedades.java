import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.JOptionPane;


public class Propriedades{
	public static void main(String[] args) {
		Properties props = new Properties();
		FileInputStream fis = null;
		Connection connection = null;
		try{
			fis = new FileInputStream("database.properties");
			props.load(fis);
			
			Class.forName(props.getProperty("conexao.driver"));
			connection = DriverManager.getConnection(props.getProperty("jdbc:postgresql://"+"conexao.url"+":"+"conexao.porta"+"/"+"conexao.database"),
					props.getProperty("conexao.usuario"),
					props.getProperty("conexao.senha"));
			
			
			}
		 catch (IOException|ClassNotFoundException e){
			 JOptionPane.showMessageDialog(null,"Erro de comunicação com o Banco de dados! Verifique a conexão ou se o usuario e senha foram inseridos corretamente!","ERRO",JOptionPane.ERROR_MESSAGE);
		} catch (SQLException e){
			JOptionPane.showMessageDialog(null,"Erro de comunicação com o Banco de dados! Verifique a conexão ou se o usuario e senha foram inseridos corretamente!","ERRO",JOptionPane.ERROR_MESSAGE);
		}
		
		if (connection != null) {
			JOptionPane.showMessageDialog(null,"Conexao estabelecida com SUCESSO!!!");
		}else{
			JOptionPane.showMessageDialog(null,"Erro de comunicação com o Banco de dados! Verifique a conexão ou se o usuario e senha foram inseridos corretamente!","ERRO",JOptionPane.ERROR_MESSAGE);
		}	
	}
}
