
package GUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;


public class RelatorioProfessores extends javax.swing.JFrame {

    
    public RelatorioProfessores() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();
        JBListar = new javax.swing.JButton();
        JBMostrar = new javax.swing.JButton();
        jBPesquisar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Matriculas");
        setBackground(new java.awt.Color(51, 51, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txt.setBackground(new java.awt.Color(153, 204, 255));
        txt.setColumns(20);
        txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt.setRows(5);
        jScrollPane1.setViewportView(txt);

        JBListar.setBackground(new java.awt.Color(0, 153, 153));
        JBListar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBListar.setText("Listar");
        JBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBListarActionPerformed(evt);
            }
        });

        JBMostrar.setBackground(new java.awt.Color(0, 153, 153));
        JBMostrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBMostrar.setText("Voltar");
        JBMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMostrarActionPerformed(evt);
            }
        });

        jBPesquisar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(JBListar)
                .addGap(55, 55, 55)
                .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(JBMostrar)
                .addGap(37, 37, 37))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBMostrar)
                        .addComponent(JBListar))))
        );

        setSize(new java.awt.Dimension(494, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBListarActionPerformed
        
        Path caminho = Paths.get("Professores_Cadastrados.txt");
        try{
            byte [] texto = Files.readAllBytes(caminho);
            String leitura = new String (texto);
            
            txt.setText(leitura);
        }catch(Exception erro){
            
        }
    }//GEN-LAST:event_JBListarActionPerformed

    private void JBMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBMostrarActionPerformed
       this.dispose();
       TelaRelatorio t_relatorio = new TelaRelatorio();
       t_relatorio.setVisible(true);
    }//GEN-LAST:event_JBMostrarActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
                         
               
                try{
                        FileReader fr = new FileReader("Alunos_matriculados.txt");
			BufferedReader br =new BufferedReader(fr);
			
			String pesquisa = JOptionPane.showInputDialog("Informe um nome para pesquisa: ");
				
			while(br.ready()) {
				String linha = br.readLine();
				if(linha.contains(pesquisa)) {
                                    txt.setText(linha); 
					System.out.println(linha);
				}
			}
			br.close();
			fr.close();
                        
                        
		}catch(IOException ex) {
			ex.printStackTrace();
                }
	
    }//GEN-LAST:event_jBPesquisarActionPerformed

    
    public static void main(String args[]) {
        

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioProfessores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBListar;
    private javax.swing.JButton JBMostrar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt;
    // End of variables declaration//GEN-END:variables
}
