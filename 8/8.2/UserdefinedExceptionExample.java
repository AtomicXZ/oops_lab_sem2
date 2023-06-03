class CustomExceptionExample extends Exception {
    public CustomExceptionExample() {
        super("User-defined Example");
    }
}

public class UserdefinedExceptionExample {
    public static void main(String[] args) {
        try {
            throw new CustomExceptionExample();
        } catch (CustomExceptionExample e) {
            System.out.println(e.getMessage());
        }
    }
}
