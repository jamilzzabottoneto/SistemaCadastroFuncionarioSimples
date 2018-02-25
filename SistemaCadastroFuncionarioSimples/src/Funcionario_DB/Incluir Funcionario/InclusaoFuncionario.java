package Funcionario_DB;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InclusaoFuncionario extends javax.swing.JFrame {

    private static String sexo;
    private static String nome;
    private static int matricula;

    public InclusaoFuncionario() {
        initComponents();
        txtMatricula.setEnabled(false);
    }

    public static String getSexo() {
        return sexo;
    }

    public static void setSexo(String sexo) {
        InclusaoFuncionario.sexo = sexo;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        InclusaoFuncionario.nome = nome;
    }

    public static int getMatricula() {
        return matricula;
    }

    public static void setMatricula(int matricula) {
        InclusaoFuncionario.matricula = matricula;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo = new javax.swing.ButtonGroup();
        btnIncluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        rdbMasculino = new javax.swing.JRadioButton();
        rdbFeminino = new javax.swing.JRadioButton();
        lblIcone = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Incluir funcionario");
        setBackground(new java.awt.Color(0, 51, 204));
        setLocation(new java.awt.Point(500, 250));
        getContentPane().setLayout(null);

        btnIncluir.setBackground(new java.awt.Color(135, 206, 250));
        btnIncluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnIncluir.setForeground(new java.awt.Color(65, 105, 225));
        btnIncluir.setText("Incluir");
        btnIncluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnIncluir);
        btnIncluir.setBounds(270, 320, 88, 40);

        btnSair.setBackground(new java.awt.Color(135, 206, 250));
        btnSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(65, 105, 225));
        btnSair.setText("Voltar");
        btnSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.setMaximumSize(new java.awt.Dimension(51, 23));
        btnSair.setMinimumSize(new java.awt.Dimension(51, 23));
        btnSair.setPreferredSize(new java.awt.Dimension(51, 23));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(390, 320, 87, 40);

        lblMatricula.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblMatricula.setForeground(new java.awt.Color(65, 105, 225));
        lblMatricula.setText("Matrícula:");
        getContentPane().add(lblMatricula);
        lblMatricula.setBounds(190, 110, 76, 21);

        txtMatricula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtMatricula);
        txtMatricula.setBounds(280, 110, 120, 25);

        lblNome.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(65, 105, 225));
        lblNome.setText("Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(190, 150, 49, 21);

        lblSexo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(65, 105, 225));
        lblSexo.setText("Sexo:");
        getContentPane().add(lblSexo);
        lblSexo.setBounds(190, 200, 42, 21);

        txtNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtNome);
        txtNome.setBounds(280, 150, 200, 25);

        rdbMasculino.setBackground(new java.awt.Color(164, 220, 235));
        btnGrupo.add(rdbMasculino);
        rdbMasculino.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rdbMasculino.setForeground(new java.awt.Color(65, 105, 225));
        rdbMasculino.setText("Masculino");
        rdbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMasculinoActionPerformed(evt);
            }
        });
        getContentPane().add(rdbMasculino);
        rdbMasculino.setBounds(280, 200, 103, 29);

        rdbFeminino.setBackground(new java.awt.Color(164, 220, 235));
        btnGrupo.add(rdbFeminino);
        rdbFeminino.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rdbFeminino.setForeground(new java.awt.Color(65, 105, 225));
        rdbFeminino.setText("Feminino");
        rdbFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbFemininoActionPerformed(evt);
            }
        });
        getContentPane().add(rdbFeminino);
        rdbFeminino.setBounds(390, 200, 95, 29);

        lblIcone.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Funcionario_DB/Imagens/incluir_3.png"))); // NOI18N
        getContentPane().add(lblIcone);
        lblIcone.setBounds(0, 140, 320, 250);

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(70, 130, 180));
        lblTitulo.setText("Inserir Funcionário");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(90, 30, 320, 40);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Funcionario_DB/Imagens/FundoClaro.jpg"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, 0, 500, 400);

        setSize(new java.awt.Dimension(515, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed

        //setMatricula(Integer.parseInt(txtMatricula.getText()));
        setNome(txtNome.getText());

        try {

            ConexaoDB db = new ConexaoDB();

            db.insert();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Funcinário Não registrado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Funcinário Não registrado");
        }
        txtMatricula.setText("");
        txtNome.setText("");

        if (rdbMasculino.isSelected()) {
            rdbMasculino.setSelected(true);
        }
        if (rdbFeminino.isSelected()) {
            rdbFeminino.setSelected(false);
        }

    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        MenuFuncionario menu = new MenuFuncionario();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void rdbFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbFemininoActionPerformed

        if (rdbFeminino.isSelected()) {
            this.setSexo("Feminino");
        }
    }//GEN-LAST:event_rdbFemininoActionPerformed

    private void rdbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMasculinoActionPerformed

        if (rdbMasculino.isSelected()) {
            this.setSexo("Masculino");
        }
    }//GEN-LAST:event_rdbMasculinoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InclusaoFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
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
