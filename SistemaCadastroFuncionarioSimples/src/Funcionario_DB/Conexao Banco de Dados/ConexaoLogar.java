package Funcionario_DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexaoLogar {

    //Armazena informações da conexão com o banco de dados
    private static Connection conn = null;

    //Recebe comandos sql e faz o envio das informações
    private static Statement stmt = null;

    private static PreparedStatement pstmt = null;

    //Conjunto de dados que retorna instrução SQL
    private static ResultSet rs = null;

    public ConexaoLogar() {
    }

    //Encapsulamento dos Atributos da Conexão
    public static Connection getConn() {
        return conn;
    }

    public static void setConn(Connection conn) {
        ConexaoLogar.conn = conn;
    }

    public static Statement getStmt() {
        return stmt;
    }

    public static void setStmt(Statement stmt) {
        ConexaoLogar.stmt = stmt;
    }

    public static ResultSet getRs() {
        return rs;
    }

    public static void setRs(ResultSet rs) {
        ConexaoLogar.rs = rs;
    }

    public static PreparedStatement getPstmt() {
        return pstmt;
    }

    public static void setPstmt(PreparedStatement pstmt) {
        ConexaoLogar.pstmt = pstmt;
    }

    public static Connection conexao() throws ClassNotFoundException, SQLException {

        //registra um driver JDBC
        Class.forName("oracle.jdbc.driver.OracleDriver");

        setConn(DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr"));

        return getConn();
    }
    
    public void desconectar() throws SQLException
    {
        getConn().close();
    }

    public void cadastar() throws ClassNotFoundException, SQLException {

        setConn(conexao());

        setStmt(getConn().createStatement());

        try {

            String inserir = "INSERT INTO logar(id, usuario, senha) VALUES (" + CadastroLogin.getId() + ",'" + CadastroLogin.getUsuario() + "',"
                    + CadastroLogin.getSenha() + ")";

            setRs(getStmt().executeQuery(inserir));

            JOptionPane.showMessageDialog(null, "Cadastro Feito com Sucesso");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Ususario ja Cadastrado!");
        }

    }
    private String ususario;
    private int senha;

    public String getUsusario() {
        return ususario;
    }

    public void setUsusario(String ususario) {
        this.ususario = ususario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean verificar = false;

    public boolean pesquisar(String usuario, int senha) throws ClassNotFoundException, SQLException {

        setConn(conexao());

        String pesquisa = "SELECT * FROM logar WHERE usuario = ? AND senha = ?";

        setPstmt(getConn().prepareStatement(pesquisa));
        getPstmt().setString(1, usuario);
        getPstmt().setInt(2, senha);

        setRs(getPstmt().executeQuery());

        if (getRs().next()) {
            verificar = true;
        }

        return verificar;
    }
}
