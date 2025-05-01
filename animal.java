public class animal {

    int age;
    private String name;

    public animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getname() {
        return name;
    }

}

class dog extends animal {
    String breed;

    public dog(int age, String name, String breed) {
        super(age, name);
        this.breed = breed;

    }

}

class main {
    public static void main(String args[]) {
        dog d = new dog(5, "kutta", "xyz");
        System.out.println(d.getname());
        System.out.println(d.age);

    }
}
