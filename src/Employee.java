/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Employee {
	
	String name;
	int salary;
	int workHours;
	int startYear;
	
	public Employee(String name, int salary, int workHours, int startYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.startYear = startYear;
	}
	
	//Maaşa uygulanan vergi -----
	public double tax() {
		if(salary >= 1000) {
			return 1000*0.3;
		}
			return 0.0;
		}
	//Maaşa uygulanan vergi -----
	
	//Bonus işlemleri -----
	public double bonus() {
		int diff = (workHours - 40);		
		if(diff > 0) {
			return 30*diff;
		}
		return 0.0;
	}
	//Bonus işlemleri -----
	
	//Maaş artırımı -----
	public double raiseSalary() {
		int year = 2022 - this.startYear;
		if (year < 10) {
			return salary*0.05;
		}else if(year >= 10 && year < 20 ) {
			return salary*0.01;
		}else {
			return salary*0.15;
		}
	}
	//Maaş artırımı -----

	public void toString(Employee employee) {
		System.out.println("Vergi= " + employee.tax());
		System.out.println("Bonus= " + employee.bonus());
		System.out.println("Maaş artırımı= " + employee.raiseSalary());
		double totalSalary = employee.salary - employee.tax() + employee.bonus();
		System.out.println("Vergiler ve bonuslar sonucu maaş miktarı= " + totalSalary);
		System.out.println("Çalışanın nihai maaş miktarı= " + (employee.salary + employee.raiseSalary()));
	}
}