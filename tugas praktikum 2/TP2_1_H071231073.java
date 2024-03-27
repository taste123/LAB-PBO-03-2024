// import java.util.Scanner;

class Person {
    String name;
    int age;
    boolean isMale;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }
}

public class TP2_1_H071231073 {
    public static void main(String[] args) {
        Person budi = new Person();
        budi.setName("Budi");
        budi.setAge(18);
        budi.setMale(true);

        System.out.println("halo, nama saya " + budi.getName() + "berusia " + budi.getAge() + " tahun");
    }
}
