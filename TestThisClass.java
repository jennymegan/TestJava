public class TestThisClass {

    public static String name;
    public static int age = 33;

    public static void main(String[] args) {
        System.out.println("Hello World");
        addAge();
        System.out.println(age);
    }

    public static void addAge(){
        age++;
    }

}