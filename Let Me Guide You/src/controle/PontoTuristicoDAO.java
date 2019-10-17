package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import conexao.Conexao;
import modelo.PontoTuristico;



public class PontoTuristicoDAO {
	
	Conexao con = new Conexao();
	
   

	public void inserePonto(PontoTuristico turistico) {

		try {
			
			PreparedStatement pstmt = con.getConexao().prepareStatement(
					"insert into pontoTuristico (nome, cidade, estado) "
					+ "values (?,?,?);");
		
			pstmt.setString(1, turistico.getNome());
			pstmt.setString(2, turistico.getCidade());
			pstmt.setString(3, turistico.getEstado());
		
			
			pstmt.executeUpdate();	
			
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      
	}
	
	
	
	
	public void editarTuristico (String nome, String cidade, String estado, int codigo){
		 
		 try {
				PreparedStatement pstmt = con.getConexao().prepareStatement(
						"update pontoTuristico set nome = ?, cidade = ?, estado = ? where codigo = ?");
				
				
				pstmt.setString(1, nome);
				pstmt.setString(2, cidade);
				pstmt.setString(3, estado);
				pstmt.setInt(3, codigo);
				

				
				pstmt.executeUpdate();	
				
				}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	 }
	
	
	public void excluirPonto (int codigo){
		 
		 try {
				PreparedStatement pstmt = con.getConexao().prepareStatement(
						"delete from pontoTuristico where codigo=?");
				pstmt.setInt(1,  codigo);
				
				pstmt.executeUpdate();	
						
				}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	 }
	
	// Lista Pontos
	public ArrayList<PontoTuristico> consultaPontoTuristico() {

		ResultSet rs = null;
		
		ArrayList<PontoTuristico> dados= new ArrayList<>();
		
		try {		
		
			PreparedStatement pstmt = con.getConexao().prepareStatement(
					"select * from pontoTuristico");
		
		
			
			rs = pstmt.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					PontoTuristico ponto = new PontoTuristico(rs.getString("nome"),rs.getString("cidade"),rs.getString("estado"));
					dados.add(ponto);
				}
				
			}
				

			
			return dados;
					
		} catch (SQLException e) {
			e.printStackTrace();
		}   
		
		return null;
		
	}
	
	
	public int consultaCodigo(String nome){
		
			ResultSet rs = null;
			int codigoTuristico=0;
		 try {
				
				PreparedStatement pstmt = con.getConexao().prepareStatement(
						"select codigo from pontoTuristico\r\n" + 
						"where nome like ?");
			
				pstmt.setString(1, nome);
				
				
				rs = pstmt.executeQuery();
				
				if (rs.next()) {
					 codigoTuristico = rs.getInt("codigo");  
					}
						
				}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		 return codigoTuristico;
	 }

}
