// Encapsulation practice

import java.util.Scanner;

class Popo{
    private String name;
    private int age;
    private double height;
    private double weight;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        height=h;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double w){weight=w;
    }
}

public class bmiCal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Popo p=new Popo();
        System.out.println("This is a BMI calculator program: ");
        System.out.print("\nEnter your name: ");
        p.setName(sc.nextLine());
        System.out.print("\nEnter your age: ");
        p.setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("\nEnter your height in meters: ");
        p.setHeight(sc.nextDouble());
        System.out.print("\nEnter your Weight in kg: ");
        p.setWeight(sc.nextDouble());
        double bmiValue=p.getWeight()/Math.pow(p.getHeight(),2);
        if(bmiValue<18.5){
            System.out.printf("%s your bmi is: %.2f (Under Weight)",p.getName(),bmiValue);
        }
        else if(bmiValue>18.5 && bmiValue< 24.9){
            System.out.printf("%s your bmi is : %.2f (Normal weight)",p.getName(),bmiValue);
        }
        else if(bmiValue>24.9 && bmiValue<29.9){
            System.out.printf("%s your bmi is : %.2f (Over Weight weight)",p.getName(),bmiValue);

        }
        else if(bmiValue>29.9){
            System.out.printf("%s your bmi is : %.2f (Obese weight)",p.getName(),bmiValue);

        }
        else{
            System.out.println("Please enter correct measurements!!!");
        }

    }
}