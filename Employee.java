class Employee {

    
    int id;
    double salary;
    String name;   l

   
    Employee(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {

       
        Employee emp1 = new Employee(101, 50000, "Rahul Sharma");

       
        emp1.display();
    }
}
