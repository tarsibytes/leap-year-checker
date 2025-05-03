public class LeapYearValidation {
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year +" is a leap year.");
        } else {
            System.out.println(year + " is NOT a leap year.");
        }
    }
}