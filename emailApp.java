package email;
public class emailApp {
    public static void main(String[] args) {
        email eml = new email("Abhishek", "Mishra");
        System.out.println(eml.showinfo());
        System.out.println( eml.getPassword());

    }
}
