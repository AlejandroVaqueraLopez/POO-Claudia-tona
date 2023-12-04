class AuxClass {
    private String _name = "none";
    private double _salary = 0.00;

    AuxClass(String name, double salary ){
        this._name = name;
        this._salary = salary;
    }

    public String getName(){
        return this._name;
    }
    public double getSalary(){
        return this._salary;
    }
}

public class AssignAttributesThis {
    public static void main(String[] args){
        AuxClass instance = new AuxClass("Jorge", 4571.57);
        System.out.println("Salary of "+ instance.getName() + " is " + instance.getSalary());
    }
    
}



