public class AddressBook{

    public Employee[] entry;
    Worker w1;
    BoardMember b1;

    
    public void show(){
        System.out.println("Booking.....");
    }

    public void displaySalaryReport(int BaseSalary , int day){

        System.out.println("display function calling.........");
        
        int val1 = entry.ComputeSalary(BaseSalary, day);
        int val2 = entry.ComputeSalary(BaseSalary, day);
        System.out.println("worker salary : "+ val1);
        System.out.println("Board Member : "+ val2);

    }
    
}