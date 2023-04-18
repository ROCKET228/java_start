
import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Today today = new Today(WeekDays.MONDAY);
        today.daysInfo();
    }


}

enum WeekDays{
    MONDAY("bad"),TUESDAY("bad"),WEDNESDAY("bad"), THURSDAY("bad"),
    FRIDAY("bad"), SATURDAY("good"), SUNDAY;
    private String mood;
    private WeekDays(String mood){
        this.mood = mood;
    }
    private WeekDays(){}
}

class Today{
    WeekDays weekDay;
    public Today(WeekDays weekDay){
        this.weekDay = weekDay;
    }
    void daysInfo(){
        switch (weekDay){
            case FRIDAY:
            case MONDAY:
            case WEDNESDAY:
            case TUESDAY:
            case THURSDAY:
                System.out.println("Go for a work");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("All is Good");
                break;
        }
    }
}

