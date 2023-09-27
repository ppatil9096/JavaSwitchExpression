public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Wll study JAVA Switch expression");

        Main.switchExpression();
        Main.switchReturnValueUsingYield();
        Main.switchReturnValue();
    }

    private static void switchReturnValue() {
        int numberOfChars = switch (DAYS.WEDNESDAY) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case SATURDAY, THURSDAY -> 8;
            case WEDNESDAY -> {
                yield 3 * 3;
            }
        };
        System.out.println("-->" + numberOfChars);
    }

    private static void switchExpression() {
        for (var day :
                DAYS.values()) {
            switch (day) {
                case MONDAY, FRIDAY, SUNDAY -> System.out.println(day + " 6");
                case TUESDAY -> System.out.println(day + " 7");
                case SATURDAY, THURSDAY -> System.out.println(day + " 8");
                case WEDNESDAY -> System.out.println(day + " 9");
            }
        }
    }

    private static void switchReturnValueUsingYield() {
        int numberOfChars = switch (DAYS.SUNDAY) {
            case MONDAY, FRIDAY, SUNDAY:
                yield 6; // yield is called here as a "CONTEXTUAL VARIABLE"
            case TUESDAY:
                yield 7;
            case SATURDAY, THURSDAY:
                yield 8;
            case WEDNESDAY:
                yield 9;
        };
        System.out.println("-->" + numberOfChars);
    }
}

enum DAYS {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}