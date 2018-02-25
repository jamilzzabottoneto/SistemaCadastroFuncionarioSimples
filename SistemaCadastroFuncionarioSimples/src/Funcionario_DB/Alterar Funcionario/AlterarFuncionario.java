package Funcionario_DB;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlterarFuncionario extends javax.swing.JFrame {

    private static String novoSexo;
    private static String novoNome;
    private static int novaMatricula;

    public AlterarFuncionario() {
        initComponents();
    }

    public static String getNovoSexo() {
        return novoSexo;
    }

    public static void setNovoSexo(String novoSexo) {
        AlterarFuncionario.novoSexo = novoSexo;
    }

    public static String getNovoNome() {
        return novoNome;
    }

    public static void setNovoNome(String novoNome) {
        AlterarFuncionario.novoNome = novoNome;
    }

    public static int getNovaMatricula() {
        return novaMatricula;
    }

    public static void setNovaMatricula(int novaMatricula) {
        AlterarFuncionario.novaMatricula = novaMatricula;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnAlterDados = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblSexo = new javax.swing.JLabel();
        rdbMasculino = new javax.swing.JRadioButton();
        rdbFeminino = new javax.swing.JRadioButton();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblIcone = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alterar Funcionário");
        setLocation(new java.awt.Point(500, 250));
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        btnAlterDados.setBackground(new java.awt.Color(135, 206, 250));
        btnAlterDados.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlterDados.setForeground(new java.awt.Color(65, 105, 225));
        btnAlterDados.setText("Alterar Dados");
        btnAlterDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAlterDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterDadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterDados);
        btnAlterDados.setBounds(260, 320, 120, 40);

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
        btnVoltar.setBounds(400, 320, 90, 40);

        lblSexo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(65, 105, 225));
        lblSexo.setText("Novo Sexo:");
        getContentPane().add(lblSexo);
        lblSexo.setBounds(180, 230, 86, 21);

        rdbMasculino.setBackground(new java.awt.Color(164, 220, 235));
        buttonGroup1.add(rdbMasculino);
        rdbMasculino.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rdbMasculino.setForeground(new java.awt.Color(65, 105, 225));
        rdbMasculino.setText("Masculino");
        rdbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMasculinoActionPerformed(evt);
            }
        });
        getContentPane().add(rdbMasculino);
        rdbMasculino.setBounds(290, 230, 110, 29);

        rdbFeminino.setBackground(new java.awt.Color(164, 220, 235));
        buttonGroup1.add(rdbFeminino);
        rdbFeminino.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rdbFeminino.setForeground(new java.awt.Color(65, 105, 225));
        rdbFeminino.setText("Feminino");
        rdbFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbFemininoActionPerformed(evt);
            }
        });
        getContentPane().add(rdbFeminino);
        rdbFeminino.setBounds(400, 230, 95, 29);

        lblNome.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(65, 105, 225));
        lblNome.setText("Novo Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(180, 180, 93, 21);

        txtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtNome);
        txtNome.setBounds(290, 180, 170, 25);

        lblMatricula.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblMatricula.setForeground(new java.awt.Color(65, 105, 225));
        lblMatricula.setText("Número da Matricula:");
        getContentPane().add(lblMatricula);
        lblMatricula.setBounds(180, 140, 170, 21);

        txtMatricula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtMatricula);
        txtMatricula.setBounds(360, 140, 102, 25);

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(70, 130, 180));
        lblTitulo.setText("Alterar Funcionário");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(90, 30, 340, 30);

        lblIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Funcionario_DB/Imagens/alterar.png"))); // NOI18N
        getContentPane().add(lblIcone);
        lblIcone.setBounds(0, 140, 250, 256);

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

    private void btnAlterDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterDadosActionPerformed

        setNovaMatricula(Integer.parseInt(txtMatricula.getText()));
        setNovoNome(txtNome.getText());

        ConexaoDB DB = new ConexaoDB();

        try {
            DB.alterar();

            JOptionPane.showMessageDialog(null, "Usuario Alterado com Sucesso!!!");

        } catch (ClassNotFoundException ex) {

            JOptionPane.showMessageDialog(null, "Usuario Não Alterado");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Usuario Não Alterado");
        }

        txtMatricula.setText("");
        txtNome.setText("");
        if (rdbMasculino.isSelected()) {
            rdbMasculino.setSelected(true);
        }
        if (rdbFeminino.isSelected()) {
            rdbFeminino.setSelected(false);
        }

    }//GEN-LAST:event_btnAlterDadosActionPerformed

    private void rdbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMasculinoActionPerformed

        if (rdbMasculino.isSelected()) {
            this.setNovoSexo("Masculino");
        }
    }//GEN-LAST:event_rdbMasculinoActionPerformed

    private void rdbFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbFemininoActionPerformed

        if (rdbFeminino.isSelected()) {
            this.setNovoSexo("Feminino");
        }
    }//GEN-LAST:event_rdbFemininoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlterarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterDados;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblIcone;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rdbFeminino;
    private javax.swing.JRadioButton rdbMasculino;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

}
