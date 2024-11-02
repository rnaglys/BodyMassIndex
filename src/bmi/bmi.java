/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

/**
 *
 * @author HP
 */
public class bmi {
    
    double weight;
    double height;
    
    public bmi (double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    
    double bmiApplication(){
            double m = height / 100;
            return weight / (m * m);
    }
    
    void bmiCalculator(){
        double bmi = bmiApplication();
        System.out.printf("BMI : %.1f%n", bmi);
        
        if (bmi < 18.5){
        System.out.println("Underweight");
    } else if (bmi > 18.5 && bmi <= 24.9){
            System.out.println("Normal");
    } else if (bmi >24.9 && bmi <=29.9){
            System.out.println("Overweight");
    } else if (bmi > 29.9){
            System.out.println("Obesity");
        }
    }
}
