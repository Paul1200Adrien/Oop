/**
 * 
 */

/**
 * @author Adrien
 *
 */
public class Lecturer extends Person {

	//defines attributes
	private String speciality ; 
	private String accademia; 
	private double hoursWork;
	private double rate;
	
	//default constructor
	public Lecturer () {
	}

	/**overloaded constructor
	 * @param nid
	 * @param name
	 * @param height
	 * @param weight
	 */
	public Lecturer(String nid, String name, double height, double weight, String speciality , String accademia, double hoursWork, double rate ) {
		super(nid, name, height, weight);
		// TODO Auto-generated constructor stub
		this.speciality= speciality ;
		this.accademia = accademia ; 
		this.hoursWork = hoursWork;
		this.rate = rate;
	}

	/**
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}

	/**
	 * @return the accademia
	 */
	public String getAccademia() {
		return accademia;
	}

	/**
	 * @return the hoursWork
	 */
	public double getHoursWork() {
		return hoursWork;
	}

	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	/**
	 * @param accademia the accademia to set
	 */
	public void setAccademia(String accademia) {
		this.accademia = accademia;
	}

	/**
	 * @param hoursWork the hoursWork to set
	 */
	public void setHoursWork(double hoursWork) {
		this.hoursWork = hoursWork;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("This lecturer : National identity :" + super.getNid() + " .Name : "+ super.getName() + " .Height : " + super.getHeight() +" .Weight : " 
				+ super.getWeight() + " specialised in : " + this.getSpeciality() + " at "+ this.getAccademia()+ ".");
	}

	@Override
	public double calculateSalary(double hoursWorked, double rate) {
		// TODO Auto-generated method stub
		return (this.hoursWork * this.rate);
	}

}
