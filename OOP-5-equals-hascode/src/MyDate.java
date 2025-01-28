<<<<<<< HEAD
import java.util.Objects;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        if(day >= 1 && day <= 31){
            this.day = day;
        }
        else{
            this.day = 1;
        }
        if(month >=1 && month <= 12){
            this.month = month;
        }
        else{
            this.month = 1;
        }
        if(year > 0 ){
            this.year = year;
        }
        else {
            this.year = 1;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return day == myDate.day && month == myDate.month && year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}
=======
public class MyDate {
    
}
>>>>>>> c910afeaad25e8754fbb5f4dfa2fcfedfda6c00f
