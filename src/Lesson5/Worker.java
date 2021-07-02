package Lesson5;

public class Worker {
    private String name;
    private String post;
    private String email;
    private long phone_number;
    private int pay;
    private int age;

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Введен некорретный возраст");
        }
    }

    public int getAge() {
        return age;
    }

    public Worker(String name, String post, String email, long phone_number, int pay, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone_number = phone_number;
        this.pay = pay;
        this.age = age;
    }

    public void info() {
        System.out.printf("Worker %s %s %s %d %d %d \n", name, post, email, phone_number, pay, age);
    }


}
