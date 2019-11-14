
package GUI;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class TelaAtendente extends javax.swing.JFrame {

    
    public TelaAtendente() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBMatricula = new javax.swing.JButton();
        jBRelatorio = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jBCadastraProfessor = new javax.swing.JButton();
        jLabelAtendente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Servicos Reserevados");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Servicos Disponiveis:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 130, 170, 80);

        jBMatricula.setBackground(new java.awt.Color(0, 153, 153));
        jBMatricula.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBMatricula.setText("Matricular Aluno");
        jBMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(jBMatricula);
        jBMatricula.setBounds(280, 50, 160, 40);

        jBRelatorio.setBackground(new java.awt.Color(0, 153, 153));
        jBRelatorio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBRelatorio.setText("Relatorio");
        jBRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(jBRelatorio);
        jBRelatorio.setBounds(280, 190, 160, 40);

        jBSair.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });
        getContentPane().add(jBSair);
        jBSair.setBounds(320, 250, 90, 30);

        jBCadastraProfessor.setBackground(new java.awt.Color(0, 153, 153));
        jBCadastraProfessor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBCadastraProfessor.setText("Cadastrar Professor");
        jBCadastraProfessor.setPreferredSize(new java.awt.Dimension(139, 25));
        jBCadastraProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastraProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(jBCadastraProfessor);
        jBCadastraProfessor.setBounds(280, 120, 160, 40);

        jLabelAtendente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundos (211).JPG"))); // NOI18N
        getContentPane().add(jLabelAtendente);
        jLabelAtendente.setBounds(0, 0, 640, 370);

        setSize(new java.awt.Dimension(655, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMatriculaActionPerformed
        
        this.dispose();
        TelaMatricula tMatricula = new TelaMatricula();
        tMatricula.setVisible(true);
        
    }//GEN-LAST:event_jBMatriculaActionPerformed

    private void jBRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRelatorioActionPerformed
    
       this.dispose();
        TelaRelatorio t_relatorio = new TelaRelatorio();
        t_relatorio.setVisible(true);   
  
  
    }//GEN-LAST:event_jBRelatorioActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        
        System.exit(0);
        
        
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBCadastraProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastraProfessorActionPerformed
        
        this.dispose();
        TelaCadastro TelaCadastro = new TelaCadastro();
       TelaCadastro.setVisible(true);
    }//GEN-LAST:event_jBCadastraProfessorActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastraProfessor;
    private javax.swing.JButton jBMatricula;
    private javax.swing.JButton jBRelatorio;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAtendente;
    // End of variables declaration//GEN-END:variables
}
