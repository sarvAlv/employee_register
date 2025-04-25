package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many enployees will be registered? ");
        int n = sc.nextInt();

        List<Employee> employeesList = new ArrayList<>();

        for (int i=1; i<=n; i++){
            System.out.println("Employee #"+i);
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            employeesList.add(new Employee(id,name,salary));
        }
        for (Employee x : employeesList){
            System.out.println(x);
        }

        sc.close();
    }
}
