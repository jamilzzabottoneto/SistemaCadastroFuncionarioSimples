package Funcionario_DB;


public class MenuFuncionario extends javax.swing.JFrame {

    
    public MenuFuncionario() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFoto = new javax.swing.JLabel();
        lblDadosFunc = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuIncluir = new javax.swing.JMenuItem();
        menuExcluir = new javax.swing.JMenuItem();
        meuPesquisar = new javax.swing.JMenuItem();
        menuAlterar = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        getContentPane().setLayout(null);

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Funcionario_DB/Imagens/funcionario.png"))); // NOI18N
        getContentPane().add(lblFoto);
        lblFoto.setBounds(85, 93, 324, 275);

        lblDadosFunc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDadosFunc.setForeground(new java.awt.Color(70, 130, 180));
        lblDadosFunc.setText("Bem Vindo ao Painel de Dados de Funcionários");
        getContentPane().add(lblDadosFunc);
        lblDadosFunc.setBounds(40, 20, 420, 50);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Funcionario_DB/Imagens/FundoClaro.jpg"))); // NOI18N
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, -20, 500, 400);

        jMenu1.setText("Funcionario");

        menuIncluir.setMnemonic('i');
        menuIncluir.setText("Inclusão");
        menuIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIncluirActionPerformed(evt);
            }
        });
        jMenu1.add(menuIncluir);

        menuExcluir.setMnemonic('e');
        menuExcluir.setText("Exclusão");
        menuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirActionPerformed(evt);
            }
        });
        jMenu1.add(menuExcluir);

        meuPesquisar.setText("Pesquisar");
        meuPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meuPesquisarActionPerformed(evt);
            }
        });
        jMenu1.add(meuPesquisar);

        menuAlterar.setText("Alterar");
        menuAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarActionPerformed(evt);
            }
        });
        jMenu1.add(menuAlterar);

        menuSair.setMnemonic('s');
        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenu1.add(menuSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(516, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIncluirActionPerformed
        
        InclusaoFuncionario inFunc = new InclusaoFuncionario();
        inFunc.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuIncluirActionPerformed

    private void menuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirActionPerformed
        ExcluirFuncionario exFunc = new ExcluirFuncionario();
        exFunc.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuExcluirActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        LoginFuncionario login = new LoginFuncionario();
        login.setVisible(true);
        dispose();
      
    }//GEN-LAST:event_menuSairActionPerformed

    private void meuPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meuPesquisarActionPerformed
        
        PesquisarFuncionario pesq = new PesquisarFuncionario();
        pesq.setVisible(true);
        dispose();
    }//GEN-LAST:event_meuPesquisarActionPerformed

    private void menuAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarActionPerformed
        
        AlterarFuncionario alter = new AlterarFuncionario();
        alter.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuAlterarActionPerformed

   
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblDadosFunc;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JMenuItem menuAlterar;
    private javax.swing.JMenuItem menuExcluir;
    private javax.swing.JMenuItem menuIncluir;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem meuPesquisar;
    // End of variables declaration//GEN-END:variables

}
