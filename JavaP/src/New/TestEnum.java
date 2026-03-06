package New;

enum Day
{
MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class TestEnum
{
public static void main(String[] args) {
 
Day[] allDays=Day.values();
 
System.out.println("All Days of the Week:");
//Enum for days of the week
enum Day {
 MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class TestEnum {
 public static void main(String[] args) {

     // Get all enum constants
     Day[] allDays = Day.values();

     System.out.println("All Days of the Week:");
     for (Day d : allDays) {
         System.out.println(d);
     }

     // Create array for working days (Monday to Friday)
     Day[] workingDays = new Day[5];
     workingDays[0] = Day.MONDAY;
     workingDays[1] = Day.TUESDAY;
     workingDays[2] = Day.WEDNESDAY;
     workingDays[3] = Day.THURSDAY;
     workingDays[4] = Day.FRIDAY;

     // Create array for weekend days (Saturday and Sunday)
     Day[] weekendDays = new Day[2];
     weekendDays[0] = Day.SATURDAY;
     weekendDays[1] = Day.SUNDAY;

     System.out.println("\nWorking Days:");
     for (Day d : workingDays) {
         System.out.println(d);
     }

     System.out.println("\nWeekend Days:");
     for (Day d : weekendDays) {
         System.out.println(d);
     }
 }
}

	Day[] WorkingDays=new Day[5];
	WorkingDays[0]= Day.MONDAY;
	WorkingDays[1] = Day.TUESDAY;
    WorkingDays[2] = Day.WEDNESDAY;
    WorkingDays[3] = Day.THURSDAY;
    WorkingDays[4] = Day.FRIDAY;
    
    Day[] weekendDays = new Day[2];
    weekendDays[0] = Day.SATURDAY;
    weekendDays[1] = Day.SUNDAY;
    
    System.out.println("\nWorking Days:");
    for (Day d : WorkingDays) {
        System.out.println(d);
    }

    System.out.println("\nWeekend Days:");
    for (Day d : weekendDays) {
        System.out.println(d);
    }
}
	
	
	
	}
 

 
