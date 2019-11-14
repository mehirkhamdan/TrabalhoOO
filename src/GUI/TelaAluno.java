
package GUI;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TelaAluno extends javax.swing.JFrame {

    public TelaAluno() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jBPesuisar = new javax.swing.JButton();
        jNomeCurso = new javax.swing.JLabel();
        jBSair = new javax.swing.JButton();
        txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Portal  do Aluno");
        setResizable(false);
        getContentPane().setLayout(null);

        jBPesuisar.setBackground(new java.awt.Color(0, 153, 153));
        jBPesuisar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBPesuisar.setText("Visualizar");
        jBPesuisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBPesuisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesuisarActionPerformed(evt);
            }
        });
        getContentPane().add(jBPesuisar);
        jBPesuisar.setBounds(100, 170, 100, 30);

        jNomeCurso.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jNomeCurso.setForeground(new java.awt.Color(255, 255, 255));
        jNomeCurso.setText("Relatorio de Notas");
        getContentPane().add(jNomeCurso);
        jNomeCurso.setBounds(150, 80, 180, 40);

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
        jBSair.setBounds(260, 170, 100, 30);

        txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundos (211).JPG"))); // NOI18N
        getContentPane().add(txt);
        txt.setBounds(0, 0, 470, 340);

        setSize(new java.awt.Dimension(486, 374));
        setLocationRelativeTo(null);
    }

    private void jBPesuisarActionPerformed(java.awt.event.ActionEvent evt) {
        
        this.dispose();
        RelatorioAlunos lista = new RelatorioAlunos ();
        lista.setVisible(true);
        Path caminho = Paths.get("Alunos_Cadastrados.txt");
        try{
            byte [] texto = Files.readAllBytes(caminho);
            String leitura = new String (texto);
            
            txt.setText(leitura);
        }catch(Exception erro){
            
        }
    }

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        TelaLogin tl_in = new TelaLogin();
        tl_in.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPesuisar;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jNomeCurso;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
}
