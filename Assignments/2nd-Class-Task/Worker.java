
public class Worker extends Employee{
    
    
    public void setName(String Name){
        this.Name = Name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    
    public void show(){
        System.out.println("working.....");
    }
    
    public int ComputeSalary(int BaseSalary , int Day){
        
        return BaseSalary + (Day*35) + (age*50);
    }
}
