package Funcionario_DB;

import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class CadastroLogin extends javax.swing.JFrame {

    
    public CadastroLogin() {
        initComponents();
    }
    
    private static String usuario;
    private static int senha;
    private static int id;

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        CadastroLogin.usuario = usuario;
    }

    public static int getSenha() {
        return senha;
    }

    public static void setSenha(int senha) {
        CadastroLogin.senha = senha;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        CadastroLogin.id = id;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadastroLogin = new javax.swing.JLabel();
        lblFotoCadastro = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Login");
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        lblCadastroLogin.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblCadastroLogin.setForeground(new java.awt.Color(70, 130, 180));
        lblCadastroLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastroLogin.setText("Cadastrar Login");
        getContentPane().add(lblCadastroLogin);
        lblCadastroLogin.setBounds(90, 20, 290, 40);

        lblFotoCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFotoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Funcionario_DB/Imagens/cadastro.png"))); // NOI18N
        getContentPane().add(lblFotoCadastro);
        lblFotoCadastro.setBounds(0, 90, 220, 230);

        btnVoltar.setBackground(new java.awt.Color(135, 206, 250));
        btnVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(65, 105, 225));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(370, 300, 100, 40);

        btnCadastrar.setBackground(new java.awt.Color(135, 206, 250));
        btnCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(65, 105, 225));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(230, 300, 100, 40);

        lblID.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(65, 105, 225));
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblID.setText("ID:");
        getContentPane().add(lblID);
        lblID.setBounds(230, 110, 40, 21);
        getContentPane().add(txtID);
        txtID.setBounds(320, 110, 130, 23);

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(65, 105, 225));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuário:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(230, 150, 72, 30);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(320, 150, 130, 23);

        lblSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(65, 105, 225));
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(230, 190, 60, 30);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(320, 200, 130, 23);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Funcionario_DB/Imagens/FundoClaro.jpg"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 500, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        
        LoginFuncionario login = new LoginFuncionario();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        setId(Integer.parseInt(txtID.getText()));
        setUsuario(txtUsuario.getText());
        setSenha(Integer.parseInt(txtSenha.getText()));
        
        try {            
            ConexaoLogar logar = new ConexaoLogar();
            logar.cadastar();
            
        } catch (ClassNotFoundException ex) {
            
            JOptionPane.showMessageDialog(null, ex);
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex);
        }
        
        txtID.setText("");
        txtSenha.setText("");
        txtUsuario.setText("");
        
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

   
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblCadastroLogin;
    private javax.swing.JLabel lblFotoCadastro;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
