package Funcionario_DB;

import com.placeholder.PlaceHolder;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginFuncionario extends javax.swing.JFrame {

    PlaceHolder holder;
    
    public LoginFuncionario() {
        initComponents();
        
        holder = new PlaceHolder(txtUsuario, "Informe o Usuário");
        holder.setCursiva(true);
    }

    private static String usuario;
    private static int senha;

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        LoginFuncionario.usuario = usuario;
    }

    public static int getSenha() {
        return senha;
    }

    public static void setSenha(int senha) {
        LoginFuncionario.senha = senha;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblLogoLogin = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnAcessar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LoginFuncionário");
        setLocation(new java.awt.Point(500, 250));
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(70, 130, 180));
        jLabel1.setText("Login Funcionário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 20, 310, 40);

        lblLogoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Funcionario_DB/Imagens/login.png"))); // NOI18N
        getContentPane().add(lblLogoLogin);
        lblLogoLogin.setBounds(10, 130, 250, 240);

        lblUsuario.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(65, 105, 225));
        lblUsuario.setText("Usuário:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(254, 140, 80, 21);

        lblSenha.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(65, 105, 225));
        lblSenha.setText("Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(254, 170, 80, 21);

        txtUsuario.setToolTipText("");
        txtUsuario.setName(""); // NOI18N
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(350, 130, 120, 30);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(350, 170, 120, 30);

        btnAcessar.setBackground(new java.awt.Color(135, 206, 250));
        btnAcessar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAcessar.setForeground(new java.awt.Color(65, 105, 225));
        btnAcessar.setText("Acessar");
        btnAcessar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcessar);
        btnAcessar.setBounds(320, 240, 150, 30);

        btnCadastrar.setBackground(new java.awt.Color(135, 206, 250));
        btnCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(65, 105, 225));
        btnCadastrar.setText("Cadastrar Login");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(320, 290, 150, 30);

        btnSair.setBackground(new java.awt.Color(135, 206, 250));
        btnSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(65, 105, 225));
        btnSair.setText("Sair");
        btnSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(320, 340, 150, 30);

        jLabel2.setFont(new java.awt.Font("Arial Black", 2, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(128, 128, 128));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Somente Números");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 200, 120, 10);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Funcionario_DB/Imagens/FundoClaro.jpg"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 500, 400);

        setSize(new java.awt.Dimension(516, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        CadastroLogin cadastro = new CadastroLogin();
        cadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarActionPerformed

        try {
            setUsuario(txtUsuario.getText());
            setSenha(Integer.parseInt(txtSenha.getText()));
            
            ConexaoLogar logar = new ConexaoLogar();
            
            if(logar.pesquisar(getUsuario(), getSenha()))
                {
                    MenuFuncionario menu = new MenuFuncionario();
                    menu.setVisible(true);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Usuário e Senha Invalido");
                    txtUsuario.setText("");
                    txtSenha.setText("");
                }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAcessarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblLogoLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
