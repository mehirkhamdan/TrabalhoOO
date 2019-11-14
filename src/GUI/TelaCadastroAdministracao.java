
package GUI;

import Code.Funcionario;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class TelaCadastroAdministracao extends javax.swing.JFrame {

    
    public TelaCadastroAdministracao() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtTelefone = new javax.swing.JTextField();
        jTelefone = new javax.swing.JLabel();
        jEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jBSalvar = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jNomeCurso = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jNomeProfessor = new javax.swing.JLabel();
        jEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jSexo = new javax.swing.JLabel();
        txtSexo = new javax.swing.JComboBox<String>();
        txtIdAdmisistraco = new javax.swing.JTextField();
        jIdProfessor = new javax.swing.JLabel();
        jAnexarDocumento = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        jBArquivo = new javax.swing.JButton();
        jDataNascimento = new javax.swing.JLabel();
        jCpf = new javax.swing.JLabel();
        jRg = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtRg = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        jLabel1Matricula = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Alunos");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 153, 153))); // NOI18N

        txtTelefone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jTelefone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTelefone.setText("Telefone");

        jEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jEmail.setText("Email");

        txtEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jBSalvar.setBackground(new java.awt.Color(0, 153, 153));
        jBSalvar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBVoltar.setBackground(new java.awt.Color(0, 153, 153));
        jBVoltar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBVoltar)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTelefone))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 66, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTelefone)
                    .addComponent(jEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBSalvar)
                            .addComponent(jBVoltar))
                        .addContainerGap())))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(140, 450, 610, 140);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jNomeCurso.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jNomeCurso.setText("Cargo");

        txtNome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jNomeProfessor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jNomeProfessor.setText("Nome");

        jEndereco.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jEndereco.setText("Endereco");

        txtEndereco.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jSexo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSexo.setText("Sexo");

        txtSexo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Masculino", "Femenino" }));

        txtIdAdmisistraco.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jIdProfessor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jIdProfessor.setText("Id Administracao");

        jAnexarDocumento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jAnexarDocumento.setText("Anexar Documento");

        txtFile.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jBArquivo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jBArquivo.setText("Arquivo");
        jBArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBArquivoActionPerformed(evt);
            }
        });

        jDataNascimento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jDataNascimento.setText("Data Nascimento");

        jCpf.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCpf.setText("Cpf");

        jRg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRg.setText("Rg");

        txtDataNascimento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtCpf.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtRg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtCargo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNomeCurso)
                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCargo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCpf)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(150, 150, 150)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRg))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(156, 156, 156))))
                        .addGap(103, 103, 103))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jEndereco)
                            .addComponent(jAnexarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBArquivo)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDataNascimento)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdAdmisistraco, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jIdProfessor))))
                        .addContainerGap(88, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jIdProfessor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdAdmisistraco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jNomeProfessor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNomeCurso)
                            .addComponent(jSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jDataNascimento)
                        .addComponent(jCpf))
                    .addComponent(jRg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCpf)
                    .addComponent(txtRg)
                    .addComponent(txtDataNascimento))
                .addGap(29, 29, 29)
                .addComponent(jEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jAnexarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jIdProfessor.getAccessibleContext().setAccessibleName("Codigo Aluno");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(140, 70, 610, 380);

        jLabel1Matricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundos (211).JPG"))); // NOI18N
        getContentPane().add(jLabel1Matricula);
        jLabel1Matricula.setBounds(0, 0, 880, 660);
        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(893, 677));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
       
        if(txtSexo.getSelectedItem().equals("Selecione")){
            
            JOptionPane.showMessageDialog(null,"Escolha as opções abaixo", null, WIDTH);
                   
                   
        }else{
        
        Funcionario cad = new  Funcionario();
     
      
      cad.setNome(txtNome.getText());
      cad.setCodigoFuncionario(txtIdAdmisistraco.getText());
      cad.setCargo(txtCargo.getText());
      cad.setDataNascimento(txtDataNascimento.getText());
      cad.setCpf(txtCpf.getText());
      cad.setRg(txtRg.getText());
      cad.setSexo(txtSexo.getSelectedItem().toString());
      cad.setEndereco(txtEndereco.getText());
      cad.setTelefone(txtTelefone.getText());      
      cad.setEmail(txtEmail.getText());
      
      
      
      
      JOptionPane.showMessageDialog(null,cad.CadastrarFuncionario());
      
      
        txtNome.setText("");
        txtIdAdmisistraco.setText("");
        txtEndereco.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        
        }
        
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        this.dispose();
        TelaAtendente tA = new TelaAtendente ();
        tA.setVisible(true);
        
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jBArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBArquivoActionPerformed
            
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setDialogTitle("Escolhe o documento");  
        int retorno = fileChooser.showOpenDialog(this);
        
        if(retorno == JFileChooser.APPROVE_OPTION){
            
            File ficheiro = fileChooser.getSelectedFile();
            txtFile.setText(ficheiro.getPath());
        }
    }//GEN-LAST:event_jBArquivoActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAdministracao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAnexarDocumento;
    private javax.swing.JButton jBArquivo;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jCpf;
    private javax.swing.JLabel jDataNascimento;
    private javax.swing.JLabel jEmail;
    private javax.swing.JLabel jEndereco;
    private javax.swing.JLabel jIdProfessor;
    private javax.swing.JLabel jLabel1Matricula;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jNomeCurso;
    private javax.swing.JLabel jNomeProfessor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jRg;
    private javax.swing.JLabel jSexo;
    private javax.swing.JLabel jTelefone;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextField txtIdAdmisistraco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRg;
    private javax.swing.JComboBox<String> txtSexo;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
