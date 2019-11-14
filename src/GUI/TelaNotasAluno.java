
package GUI;


import Code.Professor;
import Code.Aluno;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class TelaNotasAluno extends javax.swing.JFrame {

	   
    public TelaNotasAluno() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jNomeCurso = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jNome = new javax.swing.JLabel();
        jAnoCurso = new javax.swing.JLabel();
        txtNumeroAluno = new javax.swing.JTextField();
        jCodigoAluno = new javax.swing.JLabel();
        jBSalvar = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();
        txtAnoCuso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBim1_2 = new javax.swing.JTextField();
        txtBim1_1 = new javax.swing.JTextField();
        txtBim1_3 = new javax.swing.JTextField();
        txtBim1_4 = new javax.swing.JTextField();
        txtBim2_1 = new javax.swing.JTextField();
        txtBim2_2 = new javax.swing.JTextField();
        txtBim2_3 = new javax.swing.JTextField();
        txtBim2_4 = new javax.swing.JTextField();
        txtBim3_1 = new javax.swing.JTextField();
        txtBim3_2 = new javax.swing.JTextField();
        txtBim3_3 = new javax.swing.JTextField();
        txtBim3_4 = new javax.swing.JTextField();
        txtBim4_1 = new javax.swing.JTextField();
        txtBim4_2 = new javax.swing.JTextField();
        txtBim4_3 = new javax.swing.JTextField();
        txtBim4_4 = new javax.swing.JTextField();
        txtF1_1 = new javax.swing.JTextField();
        txtf1_2 = new javax.swing.JTextField();
        txtF1_3 = new javax.swing.JTextField();
        txtF1_4 = new javax.swing.JTextField();
        txtF2_1 = new javax.swing.JTextField();
        txtF2_2 = new javax.swing.JTextField();
        txtF2_3 = new javax.swing.JTextField();
        txtF2_4 = new javax.swing.JTextField();
        txtF3_1 = new javax.swing.JTextField();
        txtF3_2 = new javax.swing.JTextField();
        txtF3_3 = new javax.swing.JTextField();
        txtf3_4 = new javax.swing.JTextField();
        txtF4_1 = new javax.swing.JTextField();
        txtF4_2 = new javax.swing.JTextField();
        txtF4_3 = new javax.swing.JTextField();
        txtF4_4 = new javax.swing.JTextField();
        jCDisciplina1 = new javax.swing.JComboBox();
        jCDisciplina2 = new javax.swing.JComboBox();
        jCDisciplina3 = new javax.swing.JComboBox();
        jCDisciplina4 = new javax.swing.JComboBox();
        jLabel1Matricula = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Portal de Notas");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 153, 153))); 
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jNomeCurso.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jNomeCurso.setText("Disciplina");
        jPanel1.add(jNomeCurso);
        jNomeCurso.setBounds(16, 97, 60, 17);

        txtNome.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jPanel1.add(txtNome);
        txtNome.setBounds(11, 47, 324, 32);

        jNome.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jNome.setText("Nome");
        jPanel1.add(jNome);
        jNome.setBounds(11, 24, 54, 17);

        jAnoCurso.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jAnoCurso.setText("Ano Curso");
        jPanel1.add(jAnoCurso);
        jAnoCurso.setBounds(509, 24, 66, 17);

        txtNumeroAluno.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jPanel1.add(txtNumeroAluno);
        txtNumeroAluno.setBounds(366, 48, 99, 30);

        jCodigoAluno.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jCodigoAluno.setText("Numero Aluno");
        jPanel1.add(jCodigoAluno);
        jCodigoAluno.setBounds(366, 24, 100, 17);
        jCodigoAluno.getAccessibleContext().setAccessibleName("Codigo Aluno");

        jBSalvar.setBackground(new java.awt.Color(0, 153, 153));
        jBSalvar.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jBSalvar);
        jBSalvar.setBounds(381, 450, 90, 25);

        jBVoltar.setBackground(new java.awt.Color(0, 153, 153));
        jBVoltar.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(jBVoltar);
        jBVoltar.setBounds(490, 450, 90, 25);

        txtAnoCuso.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jPanel1.add(txtAnoCuso);
        txtAnoCuso.setBounds(509, 47, 66, 32);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jLabel1.setText("1 Bim");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(156, 97, 36, 17);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jLabel2.setText("2 Bim");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 97, 36, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jLabel3.setText("3 Bim");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(264, 97, 36, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jLabel4.setText("4 Bim");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(318, 97, 36, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jLabel5.setText("Falta 1");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(372, 97, 42, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jLabel6.setText("Falta 2");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(432, 97, 42, 17);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jLabel7.setText("Falta 3");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(492, 97, 42, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jLabel8.setText("Falta 4");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(552, 97, 42, 17);

        txtBim1_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jPanel1.add(txtBim1_2);
        txtBim1_2.setBounds(160, 160, 30, 30);

        txtBim1_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jPanel1.add(txtBim1_1);
        txtBim1_1.setBounds(160, 120, 30, 30);

        txtBim1_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jPanel1.add(txtBim1_3);
        txtBim1_3.setBounds(160, 200, 30, 30);

        txtBim1_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jPanel1.add(txtBim1_4);
        txtBim1_4.setBounds(160, 240, 30, 30);
        jPanel1.add(txtBim2_1);
        txtBim2_1.setBounds(210, 120, 30, 30);
        jPanel1.add(txtBim2_2);
        txtBim2_2.setBounds(210, 160, 30, 30);
        jPanel1.add(txtBim2_3);
        txtBim2_3.setBounds(210, 200, 30, 30);
        jPanel1.add(txtBim2_4);
        txtBim2_4.setBounds(210, 240, 30, 30);
        jPanel1.add(txtBim3_1);
        txtBim3_1.setBounds(260, 120, 30, 30);
        jPanel1.add(txtBim3_2);
        txtBim3_2.setBounds(260, 160, 30, 30);
        jPanel1.add(txtBim3_3);
        txtBim3_3.setBounds(260, 200, 30, 30);
        jPanel1.add(txtBim3_4);
        txtBim3_4.setBounds(260, 240, 30, 30);
        jPanel1.add(txtBim4_1);
        txtBim4_1.setBounds(320, 120, 30, 30);
        jPanel1.add(txtBim4_2);
        txtBim4_2.setBounds(320, 160, 30, 30);
        jPanel1.add(txtBim4_3);
        txtBim4_3.setBounds(320, 200, 30, 30);
        jPanel1.add(txtBim4_4);
        txtBim4_4.setBounds(320, 240, 30, 30);

        txtF1_1.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jPanel1.add(txtF1_1);
        txtF1_1.setBounds(370, 120, 30, 30);

        txtf1_2.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jPanel1.add(txtf1_2);
        txtf1_2.setBounds(370, 160, 30, 30);

        txtF1_3.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jPanel1.add(txtF1_3);
        txtF1_3.setBounds(370, 200, 30, 30);

        txtF1_4.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jPanel1.add(txtF1_4);
        txtF1_4.setBounds(370, 240, 30, 30);
        jPanel1.add(txtF2_1);
        txtF2_1.setBounds(430, 120, 30, 30);
        jPanel1.add(txtF2_2);
        txtF2_2.setBounds(430, 160, 30, 30);
        jPanel1.add(txtF2_3);
        txtF2_3.setBounds(430, 200, 30, 30);
        jPanel1.add(txtF2_4);
        txtF2_4.setBounds(430, 240, 30, 30);
        jPanel1.add(txtF3_1);
        txtF3_1.setBounds(490, 120, 30, 30);
        jPanel1.add(txtF3_2);
        txtF3_2.setBounds(490, 160, 30, 30);
        jPanel1.add(txtF3_3);
        txtF3_3.setBounds(490, 200, 30, 30);
        jPanel1.add(txtf3_4);
        txtf3_4.setBounds(490, 240, 30, 30);
        jPanel1.add(txtF4_1);
        txtF4_1.setBounds(550, 120, 30, 30);
        jPanel1.add(txtF4_2);
        txtF4_2.setBounds(550, 160, 30, 30);
        jPanel1.add(txtF4_3);
        txtF4_3.setBounds(550, 200, 30, 30);
        jPanel1.add(txtF4_4);
        txtF4_4.setBounds(550, 240, 30, 30);

        jCDisciplina1.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jCDisciplina1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Ciencias  ", "Historia  ", "Matematica", "Portugues ", " ", " " }));
        jPanel1.add(jCDisciplina1);
        jCDisciplina1.setBounds(10, 120, 110, 30);

        jCDisciplina2.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jCDisciplina2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Ciencias  ", "Historia  ", "Matematica", "Portugues ", " ", " ", " " }));
        jPanel1.add(jCDisciplina2);
        jCDisciplina2.setBounds(10, 160, 110, 30);

        jCDisciplina3.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jCDisciplina3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Ciencias  ", "Historia  ", "Matematica", "Portugues " }));
        jPanel1.add(jCDisciplina3);
        jCDisciplina3.setBounds(10, 200, 110, 30);

        jCDisciplina4.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        jCDisciplina4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Ciencias  ", "Historia  ", "Matematica", "Portugues " }));
        jPanel1.add(jCDisciplina4);
        jCDisciplina4.setBounds(10, 240, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(130, 70, 640, 500);

        jLabel1Matricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundos (211).JPG"))); 
        getContentPane().add(jLabel1Matricula);
        jLabel1Matricula.setBounds(0, 0, 880, 640);
        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(893, 677));
        setLocationRelativeTo(null);
    }

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        TelaProfessor t_professor = new TelaProfessor ();
        t_professor.setVisible(true);
    }

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {
      
        if(jCDisciplina1.getSelectedItem().equals("Selecione")){
            
            JOptionPane.showMessageDialog(null,"Escolha as opções abaixo", null, WIDTH);
                   
        }else if (jCDisciplina2.getSelectedItem().equals("Selecione")){
            JOptionPane.showMessageDialog(null,"Escolha as opções abaixo", null, WIDTH);
            
        }else if (jCDisciplina2.getSelectedItem().equals("Selecione")){
            JOptionPane.showMessageDialog(null,"Escolha as opções abaixo", null, WIDTH);
            
         }else if(jCDisciplina4.getSelectedItem().equals("Selecione")) {
             JOptionPane.showMessageDialog(null,"Escolha as opções abaixo", null, WIDTH);
        
         }else if ( txtNome.getText().length() <= 0) {
         	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
         }else if ( txtNumeroAluno.getText().length() <= 0) {
         	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
         }else if ( txtAnoCuso.getText().length() <= 0) {
         	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
         }else if ( txtBim1_1.getText().length() <= 0) {
         	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
         }else if ( txtBim1_2.getText().length() <= 0) {
         	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
         }else if ( txtBim1_3.getText().length() <= 0) {
         	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
         }else if ( txtBim1_4.getText().length() <= 0) {
          	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
          }else if ( txtBim2_2.getText().length() <= 0) {
          	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
          }else if ( txtBim2_3.getText().length() <= 0) {
          	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
          }else if ( txtBim2_1.getText().length() <= 0) {
           	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
          }else if ( txtBim2_4.getText().length() <= 0) {
          	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
          }else if ( txtBim3_1.getText().length() <= 0) {
          	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
          }else if ( txtBim3_2.getText().length() <= 0) {
           	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
          }else if ( txtBim3_3.getText().length() <= 0) {
          	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
          }else if ( txtBim3_4.getText().length() <= 0) {
           	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtBim4_2.getText().length() <= 0) {
           	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtBim4_3.getText().length() <= 0) {
           	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtBim4_1.getText().length() <= 0) {
            	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtBim4_4.getText().length() <= 0) {
           	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtF1_1.getText().length() <= 0) {
           	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtf1_2.getText().length() <= 0) {
              	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtF1_3.getText().length() <= 0) {
              	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtF1_4.getText().length() <= 0) {
            	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtF2_1.getText().length() <= 0) {
              	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtF2_2.getText().length() <= 0) {
               	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtF2_3.getText().length() <= 0) {
               	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtF2_4.getText().length() <= 0) {
               	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtF3_1.getText().length() <= 0) {
              	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtF3_2.getText().length() <= 0) {
               	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtF3_3.getText().length() <= 0) {
               	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtf3_4.getText().length() <= 0) {
             	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtF4_1.getText().length() <= 0) {
              	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtF4_2.getText().length() <= 0) {
               	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtF4_3.getText().length() <= 0) {
               	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
           }else if ( txtF4_4.getText().length() <= 0) {
               	JOptionPane.showMessageDialog(null,"Obrigatorio preencher todos os campos", null, WIDTH); 	
              }
             
          
          
         
        
             
         else{
        
        Professor cad = new  Professor();
        
        cad.setNome(txtNome.getText());
        cad.setNumeroAluno(txtNumeroAluno.getText());
        cad.setAnoCurso(txtAnoCuso.getText());
        cad.setDisciplina(jCDisciplina1.getSelectedItem().toString());
        cad.setNota(txtBim1_1.getText());
        cad.setFalta(txtF1_1.getText());
        cad.setDisciplina1(jCDisciplina2.getSelectedItem().toString());
        cad.setNota1(txtBim1_2.getText());
        cad.setFalta1(txtf1_2.getText());
        cad.setDisciplina2(jCDisciplina3.getSelectedItem().toString());
        cad.setNota2(txtBim1_3.getText());
        cad.setFalta2(txtF1_3.getText());
        cad.setDisciplina3(jCDisciplina4.getSelectedItem().toString());
        cad.setNota3(txtBim1_4.getText());
        cad.setFalta3(txtF1_4.getText());

        

        JOptionPane.showMessageDialog(null,cad.NotasAluno());

        txtNome.setText("");
        txtNumeroAluno.setText("");
        txtAnoCuso.setText("");
        txtBim1_1.setText("");
        txtBim1_2.setText("");
        txtBim1_3.setText("");
        txtBim1_4.setText("");
        txtBim2_1.setText("");
        txtBim2_2.setText("");
        txtBim2_3.setText("");
        txtBim2_4.setText("");
        txtBim3_1.setText("");
        txtBim3_2.setText("");
        txtBim3_3.setText("");
        txtBim3_4.setText("");
        txtBim4_1.setText("");
        txtBim4_2.setText("");
        txtBim4_3.setText("");
        txtBim4_4.setText("");
        txtF1_1.setText("");
        txtf1_2.setText("");
        txtF1_3.setText("");
        txtF1_4.setText("");
        txtF2_1.setText("");
        txtF2_2.setText("");
        txtF2_3.setText("");
        txtF2_4.setText("");
        txtF3_1.setText("");
        txtF3_2.setText("");
        txtF3_3.setText("");
        txtf3_4.setText("");
        txtF4_1.setText("");
        txtF4_2.setText("");
        txtF4_3.setText("");
        txtF4_4.setText("");
        
        
        }
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNotasAluno().setVisible(true);
            }
        });
    }

    
    private javax.swing.JLabel jAnoCurso;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JComboBox jCDisciplina1;
    private javax.swing.JComboBox jCDisciplina2;
    private javax.swing.JComboBox jCDisciplina3;
    private javax.swing.JComboBox jCDisciplina4;
    private javax.swing.JLabel jCodigoAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Matricula;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jNome;
    private javax.swing.JLabel jNomeCurso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAnoCuso;
    private javax.swing.JTextField txtBim1_1;
    private javax.swing.JTextField txtBim1_2;
    private javax.swing.JTextField txtBim1_3;
    private javax.swing.JTextField txtBim1_4;
    private javax.swing.JTextField txtBim2_1;
    private javax.swing.JTextField txtBim2_2;
    private javax.swing.JTextField txtBim2_3;
    private javax.swing.JTextField txtBim2_4;
    private javax.swing.JTextField txtBim3_1;
    private javax.swing.JTextField txtBim3_2;
    private javax.swing.JTextField txtBim3_3;
    private javax.swing.JTextField txtBim3_4;
    private javax.swing.JTextField txtBim4_1;
    private javax.swing.JTextField txtBim4_2;
    private javax.swing.JTextField txtBim4_3;
    private javax.swing.JTextField txtBim4_4;
    private javax.swing.JTextField txtF1_1;
    private javax.swing.JTextField txtF1_3;
    private javax.swing.JTextField txtF1_4;
    private javax.swing.JTextField txtF2_1;
    private javax.swing.JTextField txtF2_2;
    private javax.swing.JTextField txtF2_3;
    private javax.swing.JTextField txtF2_4;
    private javax.swing.JTextField txtF3_1;
    private javax.swing.JTextField txtF3_2;
    private javax.swing.JTextField txtF3_3;
    private javax.swing.JTextField txtF4_1;
    private javax.swing.JTextField txtF4_2;
    private javax.swing.JTextField txtF4_3;
    private javax.swing.JTextField txtF4_4;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroAluno;
    private javax.swing.JTextField txtf1_2;
    private javax.swing.JTextField txtf3_4;
    
}
