package entitie;

public class Funcionario {
	private Integer id;
	private String name;
	private Double salary;
	
	
public Funcionario(Integer id, String name, Double salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Double getSalary() {
	return salary;
}

public void IncreaseSalary(Double percentage) {
	this.salary = this.salary * (1 + (percentage / 100.0));
}

public String toString() {
    return String.format("%d, %s, %.2f", id, name, salary);
}
}
