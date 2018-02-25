package Funcionario_DB;

import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class ConexaoDB {

    //Armazena informações da conexão com o banco de dados
    private static Connection conn = null;
    //Recebe comandos sql e faz o envio das informações
    private static Statement stmt = null;

    //Conjunto de dados que retorna instrução SQL
    private static ResultSet rs = null;
    
    static String matrizN[][] = new String[10][2];
    static int cont = PesquisarFuncionario.getMatriculaFunc();

    //Encapsulamento dos Atributos da Conexão
    public static Connection getConn() {
        return conn;
    }

    public static void setConn(Connection conn) {
        ConexaoDB.conn = conn;
    }

    public static Statement getStmt() {
        return stmt;
    }

    public static void setStmt(Statement stmt) {
        ConexaoDB.stmt = stmt;
    }

    public static ResultSet getRs() {
        return rs;
    }

    public static void setRs(ResultSet rs) {
        ConexaoDB.rs = rs;
    }

    public static Connection conexao() throws ClassNotFoundException, SQLException {

        //registra um driver JDBC
        Class.forName("oracle.jdbc.driver.OracleDriver");

        setConn(DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr"));

        return getConn();
    }

    public void insert() throws ClassNotFoundException, SQLException {

        setConn(conexao());
        setStmt(getConn().createStatement());

        try {

            String inserir = "INSERT INTO Funcionario(matricula, nome, sexo) VALUES (func.nextval" + ",'"
                    + InclusaoFuncionario.getNome() + "' , '" + InclusaoFuncionario.getSexo() + "')";

            setRs(getStmt().executeQuery(inserir));

            JOptionPane.showMessageDialog(null, "Registro Inserido com Sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ususario ja Registrado!");
        }

    }

    public void excluir() throws ClassNotFoundException, SQLException {

        setConn(conexao());
        setStmt(getConn().createStatement());
        
        

        String excluir = "DELETE FROM Funcionario WHERE matricula = " + ExcluirFuncionario.getMatricula();
        
        setRs(getStmt().executeQuery(excluir));

    }

    public void select() throws ClassNotFoundException, SQLException {

        setConn(conexao());
        setStmt(getConn().createStatement());

        String pesquisa = "Select matricula, nome, sexo FROM Funcionario WHERE matricula = " + PesquisarFuncionario.getMatriculaFunc();

        setRs(getStmt().executeQuery(pesquisa));

        while (getRs().next()) {

            JOptionPane.showMessageDialog(null, 
                    "Número Matrícula: " + getRs().getString("Matricula")
                    + "\nNome Funcionario: " + getRs().getString("nome") 
                    + "\nSexo Funcionário: " + getRs().getString("sexo"));
        }

    }

    public void pesquisar() throws ClassNotFoundException, SQLException {

        setConn(conexao());
        setStmt(getConn().createStatement());

        String pesquisa = "Select matricula, nome, sexo FROM Funcionario WHERE matricula = " + ExcluirFuncionario.getMatricula();

        setRs(getStmt().executeQuery(pesquisa));

        while (getRs().next()) {

            ExcluirFuncionario.setNome((getRs().getString("nome")));
            ExcluirFuncionario.setSexo(getRs().getString("sexo"));
        }

    }

    public void alterar() throws ClassNotFoundException, SQLException {

        setConn(conexao());
        setStmt(getConn().createStatement());

        String alterDados = "UPDATE Funcionario SET nome = '" + AlterarFuncionario.getNovoNome() + "', sexo = '" + AlterarFuncionario.getNovoSexo()
                + "' where matricula = " + AlterarFuncionario.getNovaMatricula();

        setRs(getStmt().executeQuery(alterDados));

        JOptionPane.showMessageDialog(null, "Registro Alterado com Sucesso!!!");
    }

}
