package eBebek;

public class Employee {
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;

	public Employee(String name, double salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() { // Vergi methodu!
		double tax = 0;
		if (this.salary < 1000) {
			return 0;
		}
		tax = (this.salary * 0.03);
		return tax;
	}

	public int bonus() { // Haftalık bonus çalısma methodu
		int work = 0;
		if (this.workHours > 40) {
			work = this.workHours - 40;
			return work;
		}
		return work;
	}

	public double raiseSalary() { // Yılına göre hesaplanan zam methodu
		double raise;
		if (2021 - this.getHireYear() < 10) {
			raise = this.getSalary() * 0.05;
			return raise;
		} else if ((2021 - this.getHireYear() < 20) && (2021 - this.getHireYear() > 9)) {
			raise = this.getSalary() * 0.10;
			return raise;
		} else {
			raise = this.getSalary() * 0.15;
			return raise;
		}
	}

	public void toSttring() { // Calisanın özellıklerini yazdırma
		System.out.println("Calisan kisinin nitelikleri!!!");
		System.out.println();
		System.out.println("Calisanin ismi: " + this.getName());
		System.out.println("Calisanin suanki maasi: " + this.getSalary());
		System.out.println("Calisanin suanki maasi ile ne kadar vergi kesiliyor: " + tax());
		System.out.println("Calisan fazladan kac saat calismistir: " + bonus());
		bonus();
		System.out.println("Calisanin yillik maas artisi: " + raiseSalary());
		this.setSalary(raiseSalary() + (bonus() * 120) + this.getSalary());
		System.out.println("Yillik zamlar ve bonuslarla beraber toplam maas: " + this.getSalary());
		System.out.println("Yeni maasi ile ne kadar vergi oduyor: " + tax());
		this.setSalary(this.getSalary() - tax());
		System.out.println("Verdigi vergi sonrasi yeni maas: " + this.getSalary());

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

}
