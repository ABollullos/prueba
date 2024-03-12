//Prueba git comentario
//He añadido otro comentario
package business;

/**
 * Clase persona
 * @author Adrian
 * @version 1.0
 */

public class Person {
	
	/**
	 * Departamento al que pertenece el usuario
	 */
	
	public enum Departamento {MARKETING, TIC, ADMINISTRATIVO}  ;
    
 // Atributos de la clase Person
    
    /** Nombre de la persona */
    private String name;
    
    /** Datos geográficos de la persona */
    private String geographic_data;
    
    /** Fecha de nacimiento de la persona */
    private String dob;
    
    /** Número de teléfono de la persona */
    private String phone;
    
    /** Número de fax de la persona */
    private String fax;
    
    /** Dirección de correo electrónico de la persona */
    private String email;
    
    /** Número de Seguro Social de la persona */
    private String ssn;
    
    /** Número de registro médico de la persona */
    private String medRecNum;
    
    /** Número de beneficiario del plan de salud de la persona */
    private String imageTxt;
    
    /** Números de cuenta bancaria de la persona */
    private String bankAccNum;
    
    /** Código de identificación de la persona */
    private int codigo = 0;
    
    /** Departamento al que pertenece la persona */
    private Departamento dept;
    
    /** Fecha de incorporación de la persona */
    private String incorporate;
    
    /** Contador estático para asignar códigos */
    private static int staticContador = 0;
    
    private String sueldo;

    /**
     * Constructor de la clase Person con todos los atributos.
     * 
     * @param name Nombre de la persona
     * @param geographic_data Datos geográficos de la persona
     * @param dob Fecha de nacimiento de la persona
     * @param phone Número de teléfono de la persona
     * @param email Dirección de correo electrónico de la persona
     * @param ssn Número de Seguro Social de la persona
     * @param imageTxt Número de beneficiario del plan de salud de la persona
     * @param bankAccNum Números de cuenta bancaria de la persona
     * @param dept Departamento al que pertenece la persona
     * @param incorporate Fecha de incorporación de la persona
     * @param codigo Código de identificación de la persona
     */

public Person(String name, String geographic_data, String dob, String phone, String email, String ssn,
			 String imageTxt, String bankAccNum, Departamento dept, String incorporate, int codigo, String sueldo) {
		this.name = name;
		this.geographic_data = geographic_data;
		this.dob = dob;
		this.phone = phone;
		this.email = email;
		this.ssn = ssn;
		this.imageTxt = imageTxt;
		this.bankAccNum = bankAccNum;
		this.codigo = codigo;
		this.dept = dept;
		this.incorporate = incorporate;
		this.sueldo = sueldo;
	}

/**
 * Constructor de la clase Person con todos los atributos excepto el código, el cual se asigna automáticamente.
 * 
 * @param name Nombre de la persona
 * @param geographic_data Datos geográficos de la persona
 * @param dob Fecha de nacimiento de la persona
 * @param phone Número de teléfono de la persona
 * @param email Dirección de correo electrónico de la persona
 * @param ssn Número de Seguro Social de la persona
 * @param imageTxt Número de beneficiario del plan de salud de la persona
 * @param bankAccNum Números de cuenta bancaria de la persona
 * @param dept Departamento al que pertenece la persona
 * @param incorporate Fecha de incorporación de la persona
 */
    
public Person(String name, String geographic_data, String dob, String phone, String email, String ssn,
			 String imageTxt, String bankAccNum, Departamento dept, String incorporate, String sueldo) {
		this.name = name;
		this.geographic_data = geographic_data;
		this.dob = dob;
		this.phone = phone;
		this.email = email;
		this.ssn = ssn;
		this.imageTxt = imageTxt;
		this.bankAccNum = bankAccNum;
		this.codigo = staticContador;
		staticContador++;
		this.dept = dept;
		this.incorporate = incorporate;
		this.sueldo = sueldo;
	}

public Person() {
		
		
		
		
	}

//Full face photos and comparable images
//Any unique identifying number, characteristic or code

    

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeographic_data() {
        return geographic_data;
    }

    public void setGeographic_data(String geographic_data) {
        this.geographic_data = geographic_data;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getMedRecNum() {
        return medRecNum;
    }

    public void setMedRecNum(String medRecNum) {
        this.medRecNum = medRecNum;
    }

    public String getImagetxt() {
        return imageTxt;
    }

    public void setImageTxt(String imageTxt) {
        this.imageTxt = imageTxt;
    }

    public String getBankAccNum() {
        return bankAccNum;
    }

    public void setBankAccNum(String bankAccNum) {
        this.bankAccNum = bankAccNum;
    }

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Departamento getDept() {
		return dept;
	}

	public void setDept(Departamento dept) {
		this.dept = dept;
	}

	public String getIncorporate() {
		return incorporate;
	}

	public void setIncorporate(String incorporate) {
		this.incorporate = incorporate;
	}

	public String getSueldo() {
		return sueldo;
	}

	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}
    
    
    
}
