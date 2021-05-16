package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;

class Student{
    private int id;
    private String name;
    private double cgpa;

    public Student(){

    }

    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Java_sort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        int n = sc.nextInt();

        while(n > 0){
            int id = sc.nextInt();
            String name = sc.nextLine();
            double cgpa = sc.nextDouble();

            Student student = new Student(id, name, cgpa);
            list.add(student);
            n--;
        }

//        Collections.sort(list);

        for(Student st : list){
            System.out.println(st.getName());
        }
    }
}
