class Person {
    protected String name;
    protected int age;
    protected String address;
}

class Staff extends Person {
    protected int staffId;
    protected String department;
}

class Professor extends Staff {
    protected String specialization;

    public void conductLecture() {
        System.out.println(name + " is conducting a lecture on " + specialization);
    }
}

class Student extends Person {
    protected int studentId;
    protected String course;
}

class GraduateStudent extends Student {
    protected String researchTopic;

    public void submitThesis() {
        System.out.println(name + " submitted a thesis on " + researchTopic);
    }
}

// Demonstrating polymorphism
class UniversityTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Professor();
        people[1] = new GraduateStudent();

        for (Person p : people) {
            if (p instanceof Professor) {
                ((Professor) p).conductLecture();
            } else if (p instanceof GraduateStudent) {
                ((GraduateStudent) p).submitThesis();
            }
        }
    }
}