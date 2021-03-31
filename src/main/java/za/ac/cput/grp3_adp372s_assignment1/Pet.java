package za.ac.cput.grp3_adp372s_assignment1;

/**
 * Author: Grant Constant
 * Student Number: 216063124
 * Group 3
 */

public class Pet
{
    private String name, color;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "Name: " + name + "Color: " + color;
    }

    public static void main(String[] args )
    {

    }
}