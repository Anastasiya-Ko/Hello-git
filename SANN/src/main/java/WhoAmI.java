public class WhoAmI {
    public static void main(String[] args) {
        System.out.println("Я мужчина");
        Woman.sayHello();
        System.out.println("Они созданы друг для друга");
    }

}


class Man {
    String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

