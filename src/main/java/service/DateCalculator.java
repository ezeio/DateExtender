package service;

public class DateCalculator {

    private int day;
    private int month;
    private int year;


    public DateCalculator(int day, int month, int year) {
     this.day = day;
     this.month = month;
     this.year = year;

    }

    public void addDate(int numberOfDays){
        setDay(getDay() + numberOfDays);
        calculateDate(getDay());
    }

    private void calculateDate(int currentDay) {
        int totalNumberOfDaysForMonth = getTotalNumberOfDays(getMonth());
        if (!(currentDay > totalNumberOfDaysForMonth)){
            return;
        }

        boolean incrementMonth = currentDay > totalNumberOfDaysForMonth;
        if (incrementMonth && getMonth() == 12){
            setYear(getYear() + 1);
            setMonth(1);
            setDay(currentDay - totalNumberOfDaysForMonth);
        }
        else if(incrementMonth){
            setMonth(getMonth() + 1);
            setDay(currentDay - totalNumberOfDaysForMonth);
        }

        calculateDate(getDay());
    }

    private int getTotalNumberOfDays(int month) {
        int result = 0;

        switch (month){

            case 1: result = 31;
            break;
            case 2: result = 28;
            break;
            case 3: result = 31;
            break;
            case 4: result = 30;
            break;
            case 5: result = 31;
            break;
            case 6: result = 30;
            break;
            case 7: result = 31;
            break;
            case 8: result = 31;
            break;
            case 9: result = 30;
            break;
            case 10: result = 31;
            break;
            case 11: result = 30;
            break;
            case 12: result = 31;
            break;
        }

        return result;
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


}
