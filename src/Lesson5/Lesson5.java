package Lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Worker[] workArray = new Worker[5];
        workArray[0] = new Worker("Зубенко Константин Петрович", "Вор в законе", "aye1488@gmail.com", 88005553535L, 100000, 35);
        workArray[1] = new Worker("Ильявшин Владимир Олегович", "Менеджер", "manager@gmail.com", 88005553536L, 120000, 37);
        workArray[2] = new Worker("Путин Владимир Владимирович", "Диктатор", "Whitehouse@gmail.com", 89249872941L, 70000, 40);
        workArray[3] = new Worker("Вадимов Вадим Григорьервч", "Консультант", "alesha@gmail.com", 89276463524L, 80000, 18);
        workArray[4] = new Worker("Галыгин", "Актер", "actr@gmail.com", 89156913464L, 50000, 42);
        for (int i = 0; i < workArray.length; i++) {
            if (workArray[i].getAge() >= 40) {
                workArray[i].info();
            }

        }



    }
}