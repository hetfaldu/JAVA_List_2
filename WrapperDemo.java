public class WrapperDemo {
    public static void main(String[] args) {
        // Wrapping an int value
        int num = 10;
        Integer wrappedNum = Integer.valueOf(num);
        System.out.println("Wrapped value: " + wrappedNum);

        // Parsing a String into an int
        String strNum = "20";
        int parsedNum = Integer.parseInt(strNum);
        System.out.println("Parsed value: " + parsedNum);
    }
}
