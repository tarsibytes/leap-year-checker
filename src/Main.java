public class Main {
    public static void main(String[] args) {
        int year = UserInputHandler.getValidYear();
        LeapYearValidation.checkLeapYear(year);
    }
}