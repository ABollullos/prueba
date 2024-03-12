
package interfaz;

import business.Person;

import java.awt.Component;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import business.Person.Departamento;
import javax.swing.JTextField;


public class CreateJPanel extends javax.swing.JPanel {
	
	boolean comprobarExpresionRegular(String er, String cadena) {
		Pattern pat = Pattern.compile(er);
		Matcher mat = pat.matcher(cadena);

		if (mat.matches()) {
			return true;
		} else {
			return false;
		}
	}

    /**
     * Creates new form ControlJPanel
     */
    Person person;
    public CreateJPanel(Person person) {
        initComponents();
        this.person=person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        picTextPath = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        geoTextField = new javax.swing.JTextField();
        dobTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        ssnTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        bankTextField = new javax.swing.JTextField();
        sueldoTextField = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create Profile");

        jButton1.setText("Select Photo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        picTextPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picTextPathActionPerformed(evt);
            }
        });

        createBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Name: ");

        jLabel3.setText("Geographic Data: ");

        jLabel4.setText("Date of Birth: ");

        jLabel5.setText("Phone: ");

        jLabel7.setText("Email: ");

        jLabel8.setText("Social Security Number: ");

        jLabel9.setText("Bank Account Number: ");

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        
        lblDepartamento = new JLabel("Departamento:");
        
        comboBox_1 = new JComboBox();
        comboBox_1.setModel(new DefaultComboBoxModel(Departamento.values()));
        
        JLabel lblSueldo = new JLabel("Sueldo:");
        
        sueldoField = new JTextField();
        sueldoField.setColumns(10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(372)
        			.addComponent(jLabel1)
        			.addGap(0, 0, Short.MAX_VALUE))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(372, Short.MAX_VALUE)
        			.addComponent(createBtn)
        			.addGap(313))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(59)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(lblSueldo)
        					.addContainerGap())
        				.addGroup(layout.createParallelGroup(Alignment.LEADING)
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(lblDepartamento)
        						.addContainerGap())
        					.addGroup(layout.createSequentialGroup()
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(jLabel3)
        								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(geoTextField, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE))
        							.addGroup(layout.createSequentialGroup()
        								.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        									.addComponent(jLabel7, Alignment.LEADING)
        									.addComponent(jLabel5, Alignment.LEADING)
        									.addComponent(jLabel4, Alignment.LEADING))
        								.addGap(0, 285, Short.MAX_VALUE))
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(jLabel2)
        								.addPreferredGap(ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
        								.addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE))
        							.addGroup(layout.createSequentialGroup()
        								.addGroup(layout.createParallelGroup(Alignment.LEADING)
        									.addComponent(jLabel8)
        									.addComponent(jLabel9))
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addGroup(layout.createParallelGroup(Alignment.LEADING)
        									.addComponent(ssnTextField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        									.addComponent(comboBox_1, Alignment.TRAILING, 0, 200, Short.MAX_VALUE)
        									.addComponent(emailTextField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        									.addComponent(phoneTextField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        									.addComponent(dobTextField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        									.addComponent(bankTextField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        									.addComponent(sueldoField, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
        						.addGap(12)
        						.addComponent(picTextPath, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.UNRELATED)
        						.addComponent(jButton1)
        						.addGap(39)))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(47)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel1)
        					.addGap(21)
        					.addComponent(jLabel2)
        					.addGap(18)
        					.addComponent(jLabel3))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(picTextPath, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jButton1))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(geoTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel4)
        				.addComponent(dobTextField, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel5)
        				.addComponent(phoneTextField, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(31)
        					.addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(32)
        					.addComponent(jLabel7)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8)
        				.addComponent(ssnTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel9)
        				.addComponent(bankTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(31)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblDepartamento)
        				.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(27)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblSueldo)
        				.addComponent(sueldoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(14)
        			.addComponent(createBtn)
        			.addContainerGap(132, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f= chooser.getSelectedFile();
        String fileName= f.getAbsolutePath();
        picTextPath.setText(fileName);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void picTextPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picTextPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_picTextPathActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {
    	
        try {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate born = LocalDate.parse(dobTextField.getText(), formato);
            LocalDate incor = LocalDate.now();

            if (!comprobarExpresionRegular("\\w{1,50}", nameTextField.getText())) {
                JOptionPane.showMessageDialog(null, "El nombre debe tener entre 1 y 50 caracteres");
            } else if (!comprobarExpresionRegular("\\w{1,50}", geoTextField.getText())) {
                JOptionPane.showMessageDialog(null, "El país debe tener entre 1 y 50 caracteres");
            } else if (incor.compareTo(born) < 18) {
                JOptionPane.showMessageDialog(null, "No puedes crear ficha porque eres menor de edad.");
            } else if (!comprobarExpresionRegular("^[67]\\d{8}$", phoneTextField.getText())) {
                JOptionPane.showMessageDialog(null, "Número de teléfono mal introducido");
            } else if (!comprobarExpresionRegular("\\w{1,20}@gmail.com$", emailTextField.getText())) {
                JOptionPane.showMessageDialog(null, "Email mal introducido");
            } else if (!comprobarExpresionRegular("\\d{10}", ssnTextField.getText())) {
                JOptionPane.showMessageDialog(null, "Número de la seguridad social mal introducido");
            } else if (!comprobarExpresionRegular("\\d{4}-\\d{4}-\\d{2}-\\d{10}", bankTextField.getText())) {
                JOptionPane.showMessageDialog(null, "Cuenta bancaria mal introducida");
            } else {
                // Crear una nueva persona con el constructor y agregarla a la lista
                Person newPerson = new Person(
                    nameTextField.getText(), 
                    geoTextField.getText(), 
                    dobTextField.getText(), 
                    phoneTextField.getText(), 
                    emailTextField.getText(), 
                    ssnTextField.getText(), 
                    picTextPath.getText(), 
                    bankTextField.getText(), 
                    Departamento.values()[comboBox_1.getSelectedIndex()], 
                    String.valueOf(incor),
                    String.valueOf(sueldoField.getText())
                );
                MainJFrame.lista.add(newPerson);
                JOptionPane.showMessageDialog(null, "Perfil creado exitosamente !!!");
                
            }
            
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Fecha mal introducida");
        }
    }

   /* private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
    try {
    	
    	
    	
    	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    	LocalDate born = LocalDate.parse(dobTextField.getText(),formato);
    	LocalDate incor = LocalDate.now();
    	
    	
    
    	if (!comprobarExpresionRegular("\\w{1,50}", nameTextField.getText())) {
			JOptionPane.showMessageDialog(null, "El nombre debe tener entre 1 y 50 caracteres");
        } else if(!comprobarExpresionRegular("\\w{1,50}", geoTextField.getText())) {
        	JOptionPane.showMessageDialog(null, "El pais debe tener entre 1 y 50 caracteres");
        } else if(incor.compareTo(born) < 18) {
        	JOptionPane.showMessageDialog(null, "No puedes crear ficha porque eres menor de edad."); 
        } else if(!comprobarExpresionRegular("^[67]\\d{8}$", phoneTextField.getText())) {
        	JOptionPane.showMessageDialog(null, "Numero de telefono mal introducido");
        } else if(!comprobarExpresionRegular("\\w{1,20}@gmail.com$", emailTextField.getText())) {
        	JOptionPane.showMessageDialog(null, "Email mal introducido");
        } else if(!comprobarExpresionRegular("\\d{10}", ssnTextField.getText())) {
        	JOptionPane.showMessageDialog(null, "Numero de la seguridad social mal introducido"); 
        } else if(!comprobarExpresionRegular("\\d{4}-\\d{4}-\\d{2}-\\d{10}", bankTextField.getText())) {
        	JOptionPane.showMessageDialog(null, "Cuenta bancaria mal introducida");
              	
       
        }
    	
    	else {
    	
    	
        person.setImageTxt(picTextPath.getText());
        person.setName(nameTextField.getText());
        person.setDob(dobTextField.getText());
        person.setBankAccNum(bankTextField.getText());
        person.setEmail(emailTextField.getText());
        person.setSsn(ssnTextField.getText());
        person.setPhone(phoneTextField.getText());
        person.setGeographic_data(geoTextField.getText());
        person.setCodigo(person.getCodigo());
        JOptionPane.showMessageDialog(null, "Profile created successfully !!!");
        person.setCodigo(inCod++);
        int opcion = comboBox_1.getSelectedIndex();
        Departamento dep;
        switch (opcion) {
        case 0: dep = (Departamento.MARKETING);
        		person.setDept(Departamento.MARKETING); break;
        case 1: dep = (Departamento.TIC);
        		person.setDept(Departamento.TIC); break;
        case 2: dep = (Departamento.ADMINISTRATIVO); 
        		person.setDept(Departamento.ADMINISTRATIVO); break;
        default: dep = null;       
        }
        
        person.setIncorporate(String.valueOf(incor));
        
       
        
		MainJFrame.lista.add(new Person(nameTextField.getText(), geoTextField.getText(), dobTextField.getText(), 
        		phoneTextField.getText(), emailTextField.getText(), ssnTextField.getText(), picTextPath.getText(), 
        		bankTextField.getText(), person.getCodigo(), dep, String.valueOf(incor))  );
        
        
        }
    	
    	
    } catch(DateTimeParseException e) {
    	JOptionPane.showMessageDialog(null, "Fecha mal introducida");
    }
      */  
        
    //GEN-LAST:event_createBtnActionPerformed	

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bankTextField;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField dobTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField geoTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JTextField picTextPath;
    private javax.swing.JTextField ssnTextField;
    private javax.swing.JTextField sueldoTextField;
    // End of variables declaration//GEN-END:variables
    static int inCod = 0;
    private JLabel lblDepartamento;
    private JComboBox comboBox_1;
    private JTextField sueldoField;
}