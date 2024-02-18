package com.example;

public class StaticPolymorphism {

    float BMI;

    public float calculateBMI(float height, float weight) {

        BMI = weight / (height * height);
        return BMI;
    }

    public float calculateBMI(float height, float weight, String gender) {

        BMI = weight / (height * height);
        if (gender.equals("MALE"))
            return BMI;
        else
            return BMI - 1;
    }

    public float calculateBMI(float height, float weight, String gender, int age) {

        BMI = weight / (height * height);
        if (gender.equals("MALE")) {
            if (age <= 25)
                return BMI;
            else
                return BMI - 1;
        } else {
            if (age <= 25)
                return BMI - 1;
            else
                return BMI - 2;
        }
    }
}