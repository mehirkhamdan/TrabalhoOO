
package GUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;


public class RelatorioFuncionarios extends javax.swing.JFrame {

    
    public RelatorioFuncionarios() {
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
        jButton2 = new javax.swing.JButton();

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

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Pesquisa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(JBListar)
                .addGap(67, 67, 67)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(JBMostrar)
                .addGap(27, 27, 27))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBListar)
                        .addComponent(JBMostrar))))
        );

        setSize(new java.awt.Dimension(494, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBListarActionPerformed
        
        Path caminho = Paths.get("Funcionario_Cadastrados.txt");
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
               
           
        try{
                        FileReader fr = new FileReader("Notas_alunos.txt");
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
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBListar;
    private javax.swing.JButton JBMostrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt;
    // End of variables declaration//GEN-END:variables
}
