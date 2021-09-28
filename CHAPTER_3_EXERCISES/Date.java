package chapterExercise;

public class Date {

    private int day;
    private int year;
    private int month;



    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }


    public int getMonth() {
      //  return month;
        return month;
    }

    public void setMonth(int month) {
        if(month > 0 &&  month <= 12){
            this.month =month;
            if( month == 2 && year % 4 == 0){
                this.month = month;
            }
        }

    }

    public void setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;

          if(month == 2 && year % 4 == 0 && day < 30) {
                this.day = day;
          }
            if (month == 2 && year % 4 != 0 && day < 29) {
                this.day = day;
            }
            if (month == 4 || month == 6 || month == 9 || month == 11 && day <= 30) {
                this.day = day;
            }
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 && day <= 31) {
                this.day = day;
            }
        }
    }


    public void setYear(int year) {
        if (year > 0 && year > 1900 && year < 2100) {
            this.year = year;
        }
    }

    public String displayDate() {
        return month + "/" + day + "/" + year;
    }
}
