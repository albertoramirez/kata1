
package kata1;

import java.util.Date;



    
    
    
public class Student {
    
    private String name;
    private Date birthdate;
    
    public final static double DAY_PER_YEAR = 365*25;
    public final static long HOURS_PER_YEAR = (long) (24*DAY_PER_YEAR);
    public final static long MINUTES_PER_YEAR = 60 * HOURS_PER_YEAR;
    public final static long SECONDS_PER_YEAR = 60 * MINUTES_PER_YEAR;
    public final static long MILISECONDS_PER_YEAR = 1000 * SECONDS_PER_YEAR;
    
    
    
    public Student(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }
    
    public int getAge (){
     
        Date today = new Date();
        long milisecondsfrombirthdate = today.getTime() - birthdate.getTime();
        return (int) (milisecondsfrombirthdate / MILISECONDS_PER_YEAR);
        
        
        }
    }

