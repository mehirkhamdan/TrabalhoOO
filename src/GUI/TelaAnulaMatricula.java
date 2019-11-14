
package GUI;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;


public class TelaAnulaMatricula extends javax.swing.JFrame {

    
    public TelaAnulaMatricula() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBExcluir = new javax.swing.JButton();
        jNome = new javax.swing.JLabel();
        txtCodigoAluno = new javax.swing.JTextField();
        jCodigoAluno = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jBVoltar = new javax.swing.JButton();
        txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Anular Matricula");
        setResizable(false);
        getContentPane().setLayout(null);

        jBExcluir.setBackground(new java.awt.Color(0, 153, 153));
        jBExcluir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBExcluir.setText("Excluir");
        jBExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jBExcluir);
        jBExcluir.setBounds(160, 240, 100, 40);

        jNome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jNome.setForeground(new java.awt.Color(255, 255, 255));
        jNome.setText("Nome");
        getContentPane().add(jNome);
        jNome.setBounds(110, 80, 100, 22);
        getContentPane().add(txtCodigoAluno);
        txtCodigoAluno.setBounds(110, 180, 110, 30);

        jCodigoAluno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jCodigoAluno.setForeground(new java.awt.Color(255, 255, 255));
        jCodigoAluno.setText("Codigo Aluno");
        getContentPane().add(jCodigoAluno);
        jCodigoAluno.setBounds(110, 150, 110, 22);
        getContentPane().add(txtNome);
        txtNome.setBounds(110, 110, 270, 30);

        jBVoltar.setBackground(new java.awt.Color(0, 153, 153));
        jBVoltar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jBVoltar);
        jBVoltar.setBounds(280, 240, 80, 40);

        txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundos (211).JPG"))); // NOI18N
        getContentPane().add(txt);
        txt.setBounds(0, 0, 480, 340);

        setSize(new java.awt.Dimension(495, 374));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        
        
        
        this.dispose();
        JOptionPane.showMessageDialog(null, "Matricula Anulada!!!");
        TelaAnulaMatricula tba = new TelaAnulaMatricula();
        tba.setVisible(true);
        Path caminho = Paths.get("C:/Users/mehir/Documents/NetBeansProjects/SistemaGestaoDeAlunos-master/SistemaGestaoDeAlunos-master/Projeto/Alunos_Cadastrados.txt");
        try{
            byte [] texto = Files.readAllBytes(caminho);
            String leitura = new String (texto);
            
            txt.setText(leitura);
        }catch(Exception erro){
            
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        this.dispose();
        TelaAtendente tA = new TelaAtendente ();
        tA.setVisible(true);

    }//GEN-LAST:event_jBVoltarActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAnulaMatricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jCodigoAluno;
    private javax.swing.JLabel jNome;
    private javax.swing.JLabel txt;
    private javax.swing.JTextField txtCodigoAluno;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
