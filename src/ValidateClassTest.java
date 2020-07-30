public class ValidateClassTest {
    private static ValidateClass validateClass;
    public static final String[] validAccount = new String[]{"C0318G", "A0241K"};
    public static final String[] invalidAccount = new String[]{".@", "P0323A", "1234_", "M0318G"};

    public static void main(String args[]) {
        validateClass = new ValidateClass();
        for (String account : validAccount) {
            boolean isvalid = validateClass.validate(account);
            System.out.println("Class name is " + account + " is valid: " + isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = validateClass.validate(account);
            System.out.println("Class name is " + account + " is valid: " + isvalid);
        }
    }
}