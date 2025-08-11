public class ENHANCEDSWITCHES {
    public static void main(String[] args) {
        int month = 4;

        // Enhanced Switch 直接返回值
        String season = switch (month) {
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            case 12, 1, 2 -> "Winter";
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };

        System.out.println("Month " + month + " is in " + season);
    }
}
