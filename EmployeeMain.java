class Employee {
    private String _name = "";
    private double _salary = 0.00;
    final int _final_bonus = 1000;

    Employee(String name, double salary ){
        this._name = name;
        this._salary = salary;
    }

    public String getName(){
        return this._name;
    }
    public double getSalary(){
        return this._salary;
    }

    public double calculateTotalSalary(){
        return (getSalary() + this._final_bonus);
    }
}

public class EmployeeMain {
    public static void main(String[] args){
        Employee jorge = new Employee("Jorge", 4571.57);
        System.out.println("Total salary of "+ jorge.getName() + " is " + jorge.calculateTotalSalary());
    }
    
}
