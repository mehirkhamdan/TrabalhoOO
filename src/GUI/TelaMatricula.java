
package GUI;

import Code.Aluno;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class TelaMatricula extends javax.swing.JFrame {

   
    public TelaMatricula() {
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
        txtCurso = new javax.swing.JComboBox<String>();
        jNomeCurso = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jNome = new javax.swing.JLabel();
        jAnoCurso = new javax.swing.JLabel();
        txtAnoCurso = new javax.swing.JComboBox<String>();
        jEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jSexo = new javax.swing.JLabel();
        txtSexo = new javax.swing.JComboBox<String>();
        txtCodigoAluno = new javax.swing.JTextField();
        jCodigoAluno = new javax.swing.JLabel();
        jAnexarDocumento = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        jBArquivo = new javax.swing.JButton();
        jDataNascimento = new javax.swing.JLabel();
        jCpf = new javax.swing.JLabel();
        jRg = new javax.swing.JLabel();
        jResponsavel = new javax.swing.JLabel();
        jCpfResponsavel = new javax.swing.JLabel();
        txtResponsavel = new javax.swing.JTextField();
        txtCpfResponsavel = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtRg = new javax.swing.JTextField();
        jLabel1Matricula = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Alunos");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 153, 153))); // NOI18N

        jTelefone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTelefone.setText("Telefone");

        jEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jEmail.setText("Email");

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
                        .addGap(23, 23, 23))
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtTelefone))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvar)
                    .addComponent(jBVoltar)))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(140, 450, 610, 130);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        txtCurso.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtCurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Ensino Fundamental", "Ensino Medio", " " }));

        jNomeCurso.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jNomeCurso.setText("Nome Curso");

        jNome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jNome.setText("Nome");

        jAnoCurso.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jAnoCurso.setText("Ano Curso");

        txtAnoCurso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", " 1 Ano", " 2 Ano", " 3 Ano", " 4 Ano" }));
        txtAnoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoCursoActionPerformed(evt);
            }
        });

        jEndereco.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jEndereco.setText("Endereco");

        jSexo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jSexo.setText("Sexo");

        txtSexo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Masculino", "Femenino" }));

        jCodigoAluno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCodigoAluno.setText("CodigoAluno");

        jAnexarDocumento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jAnexarDocumento.setText("Anexar Documento");

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

        jResponsavel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jResponsavel.setText("Nome Responsavel");

        jCpfResponsavel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCpfResponsavel.setText("Cpf Responsavel");

        txtResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResponsavelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jDataNascimento)
                                        .addGap(33, 33, 33)
                                        .addComponent(jCpf)))
                                .addGap(295, 295, 295)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCodigoAluno)))
                            .addComponent(jAnexarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(289, 289, 289)
                                                .addComponent(jRg))
                                            .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(146, 146, 146)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jAnoCurso)
                                            .addComponent(txtAnoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jEndereco)
                                            .addComponent(txtEndereco)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCpfResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jResponsavel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCpfResponsavel)
                                .addGap(68, 68, 68)))
                        .addGap(65, 65, 65))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNomeCurso)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBArquivo)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCodigoAluno, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jAnoCurso, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jNome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoAluno)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRg)
                        .addComponent(jSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDataNascimento)
                            .addComponent(jCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRg)
                            .addComponent(txtSexo, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(txtCpf)
                            .addComponent(txtDataNascimento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNomeCurso)
                            .addComponent(jEndereco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jResponsavel)
                    .addComponent(jCpfResponsavel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpfResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAnexarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jCodigoAluno.getAccessibleContext().setAccessibleName("Codigo Aluno");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(140, 70, 610, 390);

        jLabel1Matricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundos (211).JPG"))); // NOI18N
        getContentPane().add(jLabel1Matricula);
        jLabel1Matricula.setBounds(0, 0, 880, 640);
        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(893, 677));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoCursoActionPerformed
        
    }//GEN-LAST:event_txtAnoCursoActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
       
        if(txtAnoCurso.getSelectedItem().equals("Selecione")){
            
            JOptionPane.showMessageDialog(null,"Escolha as opções abaixo", null, WIDTH);
                   
        }else if (txtSexo.getSelectedItem().equals("Selecione")){
            JOptionPane.showMessageDialog(null,"Escolha as opções abaixo", null, WIDTH);
            
        }else if (txtCurso.getSelectedItem().equals("Selecione")){
            JOptionPane.showMessageDialog(null,"Escolha as opções abaixo", null, WIDTH);
            
             
             
        } else{
        
        
        Aluno cad = new  Aluno();
      
      cad.setMatriculado(Boolean.TRUE);
      cad.setNome(txtNome.getText());
      cad.setAnoCurso(txtAnoCurso.getSelectedItem().toString());
      cad.setCodigoAluno(txtCodigoAluno.getText());
      cad.setDataNascimento(txtDataNascimento.getText());
      cad.setCpf(txtCpf.getText());
      cad.setRg(txtRg.getText());
      cad.setSexo(txtSexo.getSelectedItem().toString());
      cad.setSerie(txtCurso.getSelectedItem().toString());
      cad.setEndereco(txtEndereco.getText());
      cad.setResponsavel(txtResponsavel.getText());
      cad.setCpfResponsavel(txtCpfResponsavel.getText());
      cad.setTelefone(txtTelefone.getText());      
      cad.setEmail(txtEmail.getText());
      
      
     
      
      JOptionPane.showMessageDialog(null,cad.CadastrarAluno());
      
      
        txtNome.setText("");
        txtCodigoAluno.setText("");
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

    private void txtResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResponsavelActionPerformed
        
    }//GEN-LAST:event_txtResponsavelActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMatricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAnexarDocumento;
    private javax.swing.JLabel jAnoCurso;
    private javax.swing.JButton jBArquivo;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JLabel jCodigoAluno;
    private javax.swing.JLabel jCpf;
    private javax.swing.JLabel jCpfResponsavel;
    private javax.swing.JLabel jDataNascimento;
    private javax.swing.JLabel jEmail;
    private javax.swing.JLabel jEndereco;
    private javax.swing.JLabel jLabel1Matricula;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jNome;
    private javax.swing.JLabel jNomeCurso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jResponsavel;
    private javax.swing.JLabel jRg;
    private javax.swing.JLabel jSexo;
    private javax.swing.JLabel jTelefone;
    private javax.swing.JComboBox<String> txtAnoCurso;
    private javax.swing.JTextField txtCodigoAluno;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtCpfResponsavel;
    private javax.swing.JComboBox<String> txtCurso;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtResponsavel;
    private javax.swing.JTextField txtRg;
    private javax.swing.JComboBox<String> txtSexo;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
