import org.graalvm.compiler.core.common.type.ArithmeticOpTable.BinaryOp.Add;

public  abstract class Employee {
    
    public String Name;
    public int age;
    public char gender;

    abstract void setName();
    abstract void setAge();
    abstract  void setGender();
    
    // protected (String Name, int age , char gender){
    //     this.Name= Name;
    //     this.age = age;
    //     this.gender = gender;
    // }


    
    
    
    abstract int ComputeSalary(int BaseSalary, int day);


    public static void main(String[] args) {
        System.out.println("Starting....");
        

        
        

        
        //for Worker class
        Worker workerObject = new Worker();
        workerObject.setName("iftikhar");
        workerObject.setAge(21);
        workerObject.setGender('M');
        workerObject.show();
        System.out.println( workerObject.ComputeSalary(12,12));



        /// for Board Member Classs
        BoardMember boardMemberObject  = new BoardMember();
        boardMemberObject.show();
        boardMemberObject.setName("iftikhar");
        boardMemberObject.setAge(21);
        boardMemberObject.setGender('M');
        boardMemberObject.show();
        System.out.println( boardMemberObject.ComputeSalary(12,12));



     //for addressBooking
        AddressBook addressBookObject = new AddressBook();
        addressBookObject.show();
        addressBookObject.displaySalaryReport(12, 12);

    }    

}


