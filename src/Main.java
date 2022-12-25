/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("Michael Scott", 3000, 42, 2000);
		System.out.println("Çalışanın adı ve soyadı= " + employee.name);
		System.out.println("Çalışanın maaş miktarı= " + employee.salary);
		System.out.println("Çalışanın çalışma saati= " + employee.workHours);
		System.out.println("Çalışanın işe başladığı yıl= " + employee.startYear);
		System.out.println("============================");
		employee.toString(employee);
		
	}
}
