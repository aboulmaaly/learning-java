/**
 * Switch Statement
 *
 * Unlike if and if-else statements, the switch statement can have a number of possible execution paths.
 * A switch works with the byte, short, char, and int primitive data types.
 * It also works with enumerated types, the String class,
 * and a few special classes that wrap certain primitive types: Character, Byte, Short, and Integer.
 **/
public class JavaSwitch {
    public static void main(String[] args) {
        // You can change the month value
        int month = 8;
        String monthStr;

        switch (month) {
            case 1:  monthStr = "January";
                break;
            case 2:  monthStr = "February";
                break;
            case 3:  monthStr = "March";
                break;
            case 4:  monthStr = "April";
                break;
            case 5:  monthStr = "May";
                break;
            case 6:  monthStr = "June";
                break;
            case 7:  monthStr = "July";
                break;
            case 8:  monthStr = "August";
                break;
            case 9:  monthStr = "September";
                break;
            case 10: monthStr = "October";
                break;
            case 11: monthStr = "November";
                break;
            case 12: monthStr = "December";
                break;
            default: monthStr = "Invalid month";
                break;
        }

        System.out.println(monthStr);
        // Output : August
    }
}
