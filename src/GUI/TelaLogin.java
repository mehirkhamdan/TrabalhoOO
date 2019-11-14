
package GUI;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.JOptionPane;


public class TelaLogin extends javax.swing.JFrame {

    
    public TelaLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonEntrar = new javax.swing.JButton();
        jSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtLogin = new javax.swing.JTextField();
        jUsuario = new javax.swing.JLabel();
        jLabelTelaLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign In - Sistema de Cadastro de Alunos");
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonEntrar.setBackground(new java.awt.Color(0, 153, 153));
        jButtonEntrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        jButtonEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonEntrarKeyPressed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(300, 230, 80, 30);

        jSenha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jSenha.setForeground(new java.awt.Color(240, 240, 240));
        jSenha.setText("Senha:");
        getContentPane().add(jSenha);
        jSenha.setBounds(90, 160, 60, 20);

        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(180, 160, 210, 30);
        getContentPane().add(txtLogin);
        txtLogin.setBounds(180, 90, 210, 30);

        jUsuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jUsuario.setForeground(new java.awt.Color(240, 240, 240));
        jUsuario.setText("Usuario:");
        getContentPane().add(jUsuario);
        jUsuario.setBounds(90, 90, 90, 22);

        jLabelTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundos (211).JPG"))); // NOI18N
        jLabelTelaLogin.setText("Senha");
        getContentPane().add(jLabelTelaLogin);
        jLabelTelaLogin.setBounds(0, 0, 490, 350);

        setSize(new java.awt.Dimension(504, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        if(txtLogin.getText().equals("admin") && txtSenha.getText().equals("123456"))
        {
            this.dispose();
            TelaAtendente tAtendente = new TelaAtendente();
            tAtendente.setVisible(true);
            
        }
        
        else if (txtLogin.getText().equals("aluno") && txtSenha.getText().equals("123456"))
             {
               this.dispose();
               TelaAluno tAluno = new TelaAluno();
               tAluno.setVisible(true);
             } 
        else if (txtLogin.getText().equals("professor") && txtSenha.getText().equals("123456"))
             {
               this.dispose();
               TelaProfessor t_professor = new TelaProfessor();
               t_professor.setVisible(true);
             } 
        else if (txtLogin.getText().equals("2019001") && txtSenha.getText().equals("123456"))
             {                      
                            
                                    this.dispose();
                                    RelatorioNotaAluno lista_aluno = new RelatorioNotaAluno(); 
                                     
                
                 try{
                 FileReader fr = new FileReader("Notas_Alunos.txt");
		            BufferedReader br = new BufferedReader(fr);  
		           String pesquisa = txtLogin.getText();
		            while( br.ready()) {
                                String linha = br.readLine();
                                if(linha.contains(pesquisa)) {
                                lista_aluno.txt.setText(linha);
                                System.out.println(linha);     
                                 br.close();
                                 fr.close();
                         
                              lista_aluno.setVisible(true);   
                              
                         
                              
                              
                                }
                            }
                                                       
        }catch(Exception erro){
            
        }
             }
        
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEntrarKeyPressed
        
    }//GEN-LAST:event_jButtonEntrarKeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
             if(txtLogin.getText().equals("admin") && txtSenha.getText().equals("123456"))
            {   
            this.dispose();
            TelaAtendente tAtendente = new TelaAtendente();
            tAtendente.setVisible(true);
            
            }
        
        else if (txtLogin.getText().equals("aluno") && txtSenha.getText().equals("123456"))
             {
               this.dispose();
               TelaAluno tAluno = new TelaAluno();
               tAluno.setVisible(true);
             } 
        else
        {
              JOptionPane.showMessageDialog(null, "Usuario ou Senha Incorreto");
        }
        
    }                           
      
        
    }//GEN-LAST:event_txtSenhaKeyPressed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabelTelaLogin;
    private javax.swing.JLabel jSenha;
    private javax.swing.JLabel jUsuario;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
