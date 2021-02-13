import org.graalvm.compiler.nodes.java.NewMultiArrayNode;

import jdk.internal.org.jline.utils.DiffHelper.Diff;
import sun.font.TrueTypeFont;

public class Date {
    
    
    public int month;
    public int day ;
    public int year;

    //constrcutor
    public Data(int  day,int  month ,int year){
        this.day=day;
        this.month = month;
        this.year=year;
    }

    
    //getter
    public get_day(){
        return day;
    }
    public get_month()
    {
        return month;

    }
    public get_year(){
        return year;
    }

    //setter 
    public void set_Day(int  newday){
        
        this.day = newday;

    }
    public void set_month(int new_month){
        this.month = new_month;
    }

    public void set_year(int new_year){
        this.year=new_year;
    }


    public String displayDate(){


        System.out.prinln(get_day() +"/"+get_month()+"/"+get_year());
        
    }

    public boolean equal(int date , int month , int year){

        if(this.date == date && this.month==month && this.year==year){
            return true;
        }
        else{
            return false;
        }


    }
    public void differenceDate(date)

    {
        this.day= date.day - this.day;
        this.month = date.month - this.month;
        this.year = date.year - this.year;
        return date
    }
    
    public static void main(String[] args){
        System.out.println("hellow");

        Date date = new Date(12,12,2012);
        
        // date.set_Day(12);
        // date_set_month(9);
        // date.set_year(2020);


        
        

        // differenceDate(date);

    }


    
}
