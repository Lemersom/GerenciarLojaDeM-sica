package cods;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class JanelaServico extends javax.swing.JFrame {

    public Servico servico;
    private static GerServico gerServ = new GerServico();
    
    private static JanelaServico janelaServico1 = new JanelaServico();
    
    /**
     * Creates new form JanelaServico
     */
    public JanelaServico() {
        initComponents();
    }
    
    public static JanelaServico getJanelaServ(){
        if(janelaServico1 == null){
            janelaServico1 = new JanelaServico();
        }
        return janelaServico1;
    }
    
    public static GerServico getGerServ(){
        return gerServ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCodigo = new javax.swing.JLabel();
        lbLuthier = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        lbServico = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtLuthier = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JToggleButton();
        btConsultar = new javax.swing.JToggleButton();
        btExcluir = new javax.swing.JToggleButton();
        btConcluir = new javax.swing.JToggleButton();
        btLimpar = new javax.swing.JToggleButton();
        btSair = new javax.swing.JToggleButton();
        lbValor = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        TabServico1 = new javax.swing.JScrollPane();
        tabServico = new javax.swing.JTable();
        txtValor = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Serviços");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lbCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCodigo.setText("Código:");

        lbLuthier.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbLuthier.setText("Luthier:");

        lbDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDescricao.setText("Descrição:");

        lbServico.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbServico.setText("Serviço");

        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtLuthier.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btConcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btConcluir.setText("Concluir");
        btConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConcluirActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lbValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbValor.setText("Valor:");

        txtDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        tabServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Luthier", "Data", "Status", "Valor", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabServico1.setViewportView(tabServico);
        if (tabServico.getColumnModel().getColumnCount() > 0) {
            tabServico.getColumnModel().getColumn(5).setPreferredWidth(300);
        }

        txtValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        lblData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblData.setText("Data:");

        txtData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrar))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addGap(48, 48, 48)
                .addComponent(btSair)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lbServico))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblData)
                            .addGap(18, 18, 18)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbCodigo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lbLuthier)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtLuthier, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbValor)
                                .addGap(18, 18, 18)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(TabServico1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lbServico)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCodigo))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLuthier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbLuthier))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblData))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbValor)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDescricao)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TabServico1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpar)
                            .addComponent(btSair))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btConsultar)
                            .addComponent(btCadastrar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btExcluir)
                            .addComponent(btConcluir))
                        .addGap(22, 22, 22))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrar();
        listarTab();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
        Inicio in = new Inicio();
        in.setVisible(true);
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
        listarTab();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConcluirActionPerformed
        concluir();
        listarTab();
    }//GEN-LAST:event_btConcluirActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Inicio in = new Inicio();
        in.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    
    public static void listarTab(){
        DefaultTableModel modelo = (DefaultTableModel) tabServico.getModel();
        int i = 0;
        
        modelo.setRowCount(i);
        
        for(Servico serv : gerServ.getbdServ()){
            modelo.insertRow(i, new Object[]{serv.getCodigo(), serv.getLuthier(),serv.getData(), serv.getStatus(), 
                    serv.getValor(), serv.getDescricao()});
            i++;
        }
    }
    
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(null, 
                "Deseja Sair?", 
                "Sair", 
                JOptionPane.YES_NO_OPTION);
        if(resp == 0){
            this.dispose();
        }
    }
    
    public void limpar(){
        txtCodigo.setText("");
        txtLuthier.setText("");
        txtData.setText("");
        txtValor.setText("");
        txtDescricao.setText("");
        txtCodigo.requestFocus();
    }
    
    public void cadastrar(){
        Servico serv = new Servico();
        
        
        serv.setCodigo(txtCodigo.getText());
        serv.setLuthier(txtLuthier.getText());
        serv.setData(txtData.getText());
        serv.setValor(Float.parseFloat(txtValor.getText()));
        serv.setDescricao(txtDescricao.getText());
        
                
        serv = gerServ.cadServ(serv);
        
        if(serv != null){
            JOptionPane.showMessageDialog(null, "Serviço cadastrado com sucesso", 
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(null, "Serviço já possui cadastro", 
                        "Erro no cadastro", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    }
    
    public void consultar(){
        Servico serv = new Servico();
        
        serv.setCodigo(txtCodigo.getText());
        
        serv = gerServ.consultaCodigo(serv);
        
        if(serv != null){
            txtCodigo.setText(serv.getCodigo());
            txtLuthier.setText(serv.getLuthier());
            txtData.setText(serv.getData());
            txtValor.setText(Float.toString(serv.getValor()));
            txtDescricao.setText(serv.getDescricao());
            JOptionPane.showMessageDialog(null, "Sucesso na consulta", "Consulta", 1);
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(null, "Serviço não cadastrada", "Erro na Consulta", 0);
            limpar();
        }
    }
    
    public void excluir(){
        Servico serv = new Servico();
        
        serv.setCodigo(txtCodigo.getText());
        
        serv = gerServ.consultaCodigo(serv);
        
        if(serv != null){
            
            txtCodigo.setText(serv.getCodigo());
            txtLuthier.setText(serv.getLuthier());
            txtData.setText(serv.getData());
            txtValor.setText(Float.toString(serv.getValor()));
            txtDescricao.setText(serv.getDescricao());
        
            

            int perg = JOptionPane.showConfirmDialog(null, "Deseja excluir?", 
                                   "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);
            if(perg == 0){
                gerServ.excluirServ(serv);
                JOptionPane.showMessageDialog(null, "Sucesso na exclusão", "Exclusão", 1);
                
            }
            
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(null, "Serviço não cadastrado", "Erro na Consulta", 0);
            limpar();
        }
    }
    
    public void concluir(){
        Servico serv = new Servico();
        
        serv.setCodigo(txtCodigo.getText());
        
        serv = gerServ.consultaCodigo(serv);
        
        if(serv != null){
            
            txtCodigo.setText(serv.getCodigo());
            txtLuthier.setText(serv.getLuthier());
            txtData.setText(serv.getData());
            txtValor.setText(Float.toString(serv.getValor()));
            txtDescricao.setText(serv.getDescricao());
        
            

            int perg = JOptionPane.showConfirmDialog(null, "Deseja concluir o serviço?", 
                                   "Confirmação de Conclusão", JOptionPane.YES_NO_OPTION);
            if(perg == 0){
                gerServ.concluirServ(serv);
                JOptionPane.showMessageDialog(null, "Sucesso na conclusão", "Conclusão", 1);
                
            }
            
            limpar();
        }
        else{
            JOptionPane.showMessageDialog(null, "Serviço não cadastrado", "Erro na Consulta", 0);
            limpar();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TabServico1;
    private javax.swing.JToggleButton btCadastrar;
    private javax.swing.JToggleButton btConcluir;
    private javax.swing.JToggleButton btConsultar;
    private javax.swing.JToggleButton btExcluir;
    private javax.swing.JToggleButton btLimpar;
    private javax.swing.JToggleButton btSair;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbLuthier;
    private javax.swing.JLabel lbServico;
    private javax.swing.JLabel lbValor;
    private javax.swing.JLabel lblData;
    private static javax.swing.JTable tabServico;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtLuthier;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
