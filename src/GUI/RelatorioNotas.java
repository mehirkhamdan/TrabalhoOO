
package GUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;


public class RelatorioNotas extends javax.swing.JFrame {

    
    public RelatorioNotas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        JBListar = new javax.swing.JButton();
        JBMostrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Matriculas");
        setBackground(new java.awt.Color(51, 51, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBListar.setBackground(new java.awt.Color(0, 153, 153));
        JBListar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBListar.setText("Listar");
        JBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBListarActionPerformed(evt);
            }
        });
        getContentPane().add(JBListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 457, -1, -1));

        JBMostrar.setBackground(new java.awt.Color(0, 153, 153));
        JBMostrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JBMostrar.setText("Voltar");
        JBMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(JBMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 457, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Pesquisa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 457, -1, -1));

        txt.setBackground(new java.awt.Color(153, 204, 255));
        txt.setColumns(20);
        txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt.setRows(5);
        jScrollPane1.setViewportView(txt);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 440));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, -1));

        setSize(new java.awt.Dimension(494, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBListarActionPerformed
        
        Path caminho = Paths.get("Notas_alunos.txt");
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
                new RelatorioNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBListar;
    private javax.swing.JButton JBMostrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt;
    // End of variables declaration//GEN-END:variables
}
