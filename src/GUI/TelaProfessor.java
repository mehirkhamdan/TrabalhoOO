
package GUI;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;


public class TelaProfessor extends javax.swing.JFrame {

    
    public TelaProfessor() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBPesquisar = new javax.swing.JButton();
        jCOpcao = new javax.swing.JComboBox<String>();
        jNomeCurso = new javax.swing.JLabel();
        jBSair = new javax.swing.JButton();
        txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Portal  do Aluno");
        setResizable(false);
        getContentPane().setLayout(null);

        jBPesquisar.setBackground(new java.awt.Color(0, 153, 153));
        jBPesquisar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jBPesquisar);
        jBPesquisar.setBounds(130, 200, 100, 30);

        jCOpcao.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCOpcao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Lan�ar Notas", "Relat�rios", " " }));
        getContentPane().add(jCOpcao);
        jCOpcao.setBounds(130, 120, 140, 20);

        jNomeCurso.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jNomeCurso.setForeground(new java.awt.Color(255, 255, 255));
        jNomeCurso.setText("Op��es");
        getContentPane().add(jNomeCurso);
        jNomeCurso.setBounds(130, 90, 110, 22);

        jBSair.setBackground(new java.awt.Color(0, 153, 153));
        jBSair.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBSair.setText("Sair");
        jBSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });
        getContentPane().add(jBSair);
        jBSair.setBounds(260, 200, 70, 30);

        txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundos (211).JPG"))); // NOI18N
        getContentPane().add(txt);
        txt.setBounds(0, 0, 470, 340);

        setSize(new java.awt.Dimension(486, 374));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        if(jCOpcao.getSelectedItem().equals("Selecione")){
            
            JOptionPane.showMessageDialog(null,"Escolha as op��es abaixo", null, WIDTH);
        }else if(jCOpcao.getSelectedItem().equals("Lan�ar Notas")) {                      
          this.dispose();
        TelaNotasAluno telaNota = new TelaNotasAluno();
        telaNota.setVisible(true); 
        }else if(jCOpcao.getSelectedItem().equals("Relat�rios")) {
                
        this.dispose();
        RelatorioNotas lista1 = new RelatorioNotas();
        lista1.setVisible(true);
    }//GEN-LAST:event_jBPesquisarActionPerformed
    }
    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        this.dispose();
        TelaLogin tl_in = new TelaLogin();
        tl_in.setVisible(true);
    }//GEN-LAST:event_jBSairActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBSair;
    private javax.swing.JComboBox<String> jCOpcao;
    private javax.swing.JLabel jNomeCurso;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
}
