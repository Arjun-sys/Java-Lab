package practice;

class Programmer {

    int id;
    String name;
    float salary;

    void setData(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void showData() {
        System.out.println("ID: "+id +"\n "+"Name: "+ name + "\n"+"Salary:"+salary);
    }
}
class Employee extends Programmer implements Coder {

     public void showCode() 
     {
        System.out.println("Code:"+code);
    }

    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.setData(12, "Arjun", 15000);
        e1.showData();
        e1.showCode();
    }

}
