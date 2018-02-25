package Funcionario_DB;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ExcluirFuncionario extends javax.swing.JFrame {

    private static int matricula;
    private static String nome;
    private static String sexo;

    public static int getMatricula() {
        return matricula;
    }

    public static void setMatricula(int matricula) {
        ExcluirFuncionario.matricula = matricula;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        ExcluirFuncionario.nome = nome;
    }

    public static String getSexo() {
        return sexo;
    }

    public static void setSexo(String sexo) {
        ExcluirFuncionario.sexo = sexo;
    }

    public ExcluirFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblSexo = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblicone = new javax.swing.JLabel();
        lblfundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Excluir funcionário");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(500, 250));
        getContentPane().setLayout(null);

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
        btnVoltar.setBounds(400, 340, 80, 40);

        btnExcluir.setBackground(new java.awt.Color(135, 206, 250));
        btnExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(65, 105, 225));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(260, 340, 80, 40);

        lblSexo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(65, 105, 225));
        lblSexo.setText("Sexo:");
        getContentPane().add(lblSexo);
        lblSexo.setBounds(250, 270, 42, 21);

        txtSexo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSexo.setEnabled(false);
        getContentPane().add(txtSexo);
        txtSexo.setBounds(330, 270, 150, 25);

        txtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNome.setEnabled(false);
        getContentPane().add(txtNome);
        txtNome.setBounds(330, 230, 150, 25);

        txtMatricula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtMatricula);
        txtMatricula.setBounds(370, 130, 110, 25);

        lblNome.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(65, 105, 225));
        lblNome.setText("Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(250, 230, 49, 21);

        lblMatricula.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblMatricula.setForeground(new java.awt.Color(65, 105, 225));
        lblMatricula.setText("Matricula:");
        getContentPane().add(lblMatricula);
        lblMatricula.setBounds(250, 130, 76, 21);

        btnOK.setBackground(new java.awt.Color(135, 206, 250));
        btnOK.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnOK.setForeground(new java.awt.Color(65, 105, 225));
        btnOK.setText("Conferir Dados");
        btnOK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        getContentPane().add(btnOK);
        btnOK.setBounds(250, 170, 230, 40);

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(70, 130, 180));
        lblTitulo.setText("Excluir Funcionário");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(80, 30, 340, 40);

        lblicone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Funcionario_DB/Imagens/excluir.png"))); // NOI18N
        getContentPane().add(lblicone);
        lblicone.setBounds(-10, 140, 270, 256);

        lblfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Funcionario_DB/Imagens/FundoClaro.jpg"))); // NOI18N
        getContentPane().add(lblfundo);
        lblfundo.setBounds(0, 0, 500, 400);

        setSize(new java.awt.Dimension(516, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        setMatricula(Integer.parseInt(txtMatricula.getText()));

        try {
            ConexaoDB DB = new ConexaoDB();
            DB.excluir();

            JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso");

            

        } catch (ClassNotFoundException ex) {

            JOptionPane.showMessageDialog(null, "Registro Não Existente");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Registro Não Excluído");
        }
        
        txtMatricula.setText("");
        txtNome.setText("");
        txtSexo.setText("");

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        MenuFuncionario menu = new MenuFuncionario();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed

        setMatricula(Integer.parseInt(txtMatricula.getText()));

        try {
            ConexaoDB DB = new ConexaoDB();
            DB.pesquisar();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        txtNome.setEnabled(true);
        txtSexo.setEnabled(true);
        txtNome.setText(getNome().toString());
        txtSexo.setText(getSexo().toString());
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_btnOKActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExcluirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcluirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcluirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcluirFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcluirFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblfundo;
    private javax.swing.JLabel lblicone;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables

}
