
package GUI;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;


public class TelaRelatorio extends javax.swing.JFrame {

    
    public TelaRelatorio() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBEntrar = new javax.swing.JButton();
        jCOpcao = new javax.swing.JComboBox<String>();
        jNomeCurso = new javax.swing.JLabel();
        jBVoltar = new javax.swing.JButton();
        txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Portal  de Relatorio");
        setResizable(false);
        getContentPane().setLayout(null);

        jBEntrar.setBackground(new java.awt.Color(0, 153, 153));
        jBEntrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBEntrar.setText("Entrar");
        jBEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBEntrar);
        jBEntrar.setBounds(130, 200, 100, 30);

        jCOpcao.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCOpcao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Listar Alunos", "Listar Professores", "Listar Funcionarios", "Listar Notas", " " }));
        getContentPane().add(jCOpcao);
        jCOpcao.setBounds(130, 120, 140, 20);

        jNomeCurso.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jNomeCurso.setForeground(new java.awt.Color(255, 255, 255));
        jNomeCurso.setText("Op��es");
        getContentPane().add(jNomeCurso);
        jNomeCurso.setBounds(130, 90, 110, 22);

        jBVoltar.setBackground(new java.awt.Color(0, 153, 153));
        jBVoltar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBVoltar.setText("Voltar");
        jBVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jBVoltar);
        jBVoltar.setBounds(260, 200, 80, 30);

        txt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundos (211).JPG"))); // NOI18N
        getContentPane().add(txt);
        txt.setBounds(0, 0, 470, 340);

        setSize(new java.awt.Dimension(486, 374));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
        if(jCOpcao.getSelectedItem().equals("Selecione")){
            
            JOptionPane.showMessageDialog(null,"Escolha as op��ess abaixo", null, WIDTH);
            
        }else if(jCOpcao.getSelectedItem().equals("Listar Alunos")) {                      
         
            this.dispose();
        RelatorioAlunos lista = new RelatorioAlunos();
        lista.setVisible(true); 
        
        }else if(jCOpcao.getSelectedItem().equals("Listar Professores")) {
                
        this.dispose();
        RelatorioProfessores lista_professores = new RelatorioProfessores();
        lista_professores.setVisible(true);
        
        }else if(jCOpcao.getSelectedItem().equals("Listar Funcionarios")) {
                
        this.dispose();
        RelatorioFuncionarios lista_funcionarios = new RelatorioFuncionarios();
        lista_funcionarios.setVisible(true);
        
       }else if(jCOpcao.getSelectedItem().equals("Listar Notas")) {
                
        this.dispose();
        RelatorioNotas listaNotasAluno = new RelatorioNotas();
        listaNotasAluno.setVisible(true); 
        
    }//GEN-LAST:event_jBEntrarActionPerformed
    }
    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        this.dispose();
        TelaAtendente t_atendente = new TelaAtendente();
        t_atendente.setVisible(true);
    }//GEN-LAST:event_jBVoltarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEntrar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JComboBox<String> jCOpcao;
    private javax.swing.JLabel jNomeCurso;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
}
