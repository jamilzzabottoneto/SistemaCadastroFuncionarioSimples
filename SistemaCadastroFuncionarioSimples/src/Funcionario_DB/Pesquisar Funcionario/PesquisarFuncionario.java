package Funcionario_DB;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PesquisarFuncionario extends javax.swing.JFrame {

    private static int matriculaFunc;
    private static String nome;
    private static String sexo;

    public static int getMatriculaFunc() {
        return matriculaFunc;
    }

    public static void setMatriculaFunc(int matriculaFunc) {
        PesquisarFuncionario.matriculaFunc = matriculaFunc;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        PesquisarFuncionario.nome = nome;
    }

    public static String getSexo() {
        return sexo;
    }

    public static void setSexo(String sexo) {
        PesquisarFuncionario.sexo = sexo;
    }

    public PesquisarFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExibir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtMatriculaFunc = new javax.swing.JTextField();
        lblMatriculaFunc = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblIcone = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar Funcionário");
        setLocation(new java.awt.Point(500, 250));
        getContentPane().setLayout(null);

        btnExibir.setBackground(new java.awt.Color(135, 206, 250));
        btnExibir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExibir.setForeground(new java.awt.Color(65, 105, 225));
        btnExibir.setText("Exibir Dados");
        btnExibir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExibir);
        btnExibir.setBounds(260, 320, 99, 40);

        btnVoltar.setBackground(new java.awt.Color(135, 206, 250));
        btnVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(65, 105, 225));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(400, 320, 75, 40);

        txtMatriculaFunc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtMatriculaFunc);
        txtMatriculaFunc.setBounds(320, 190, 110, 25);

        lblMatriculaFunc.setFont(new java.awt.Font("Arial Black", 0, 17)); // NOI18N
        lblMatriculaFunc.setForeground(new java.awt.Color(65, 105, 225));
        lblMatriculaFunc.setText("Matricula do Funcionário");
        getContentPane().add(lblMatriculaFunc);
        lblMatriculaFunc.setBounds(260, 140, 240, 30);

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(70, 130, 180));
        lblTitulo.setText("Consultar Funcionário");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(60, 20, 380, 40);

        lblIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Funcionario_DB/Imagens/pesquisa.png"))); // NOI18N
        getContentPane().add(lblIcone);
        lblIcone.setBounds(10, 90, 260, 270);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Funcionario_DB/Imagens/FundoClaro.jpg"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 500, 400);

        setSize(new java.awt.Dimension(516, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        MenuFuncionario menu = new MenuFuncionario();
        menu.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirActionPerformed

        setMatriculaFunc(Integer.parseInt(txtMatriculaFunc.getText()));

        try {

            ConexaoDB db = new ConexaoDB();

            db.select();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Funcinário Não registrado");

        } catch (ClassNotFoundException ex) {

            JOptionPane.showMessageDialog(null, "Funcinário Não registrado");
        }
        
        txtMatriculaFunc.setText("");

    }//GEN-LAST:event_btnExibirActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PesquisarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExibir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JLabel lblMatriculaFunc;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtMatriculaFunc;
    // End of variables declaration//GEN-END:variables

}
