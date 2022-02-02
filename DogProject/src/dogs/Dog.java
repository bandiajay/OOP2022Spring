/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dogs;

/**
 *
 * @author ajay
 */
public class Dog {
    //declare attributes
    private String name;
    private String breed;
    private int age;
    
    //constructor
    public Dog(String nameIn, String breedIn, int ageIn){
        name = nameIn;
        breed = breedIn;
        age = ageIn;
    }
    
    //accesors or getter methods
    public String getName(){
        return name;
    }
    
    public String getBreed(){
        return breed;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setName(String nameIn){
        name = nameIn;
    }
    
    public void setBreed(String breedIn){
        breed = breedIn;
    }
    
    public void setAge(int ageIn){
        age = ageIn;
    }
    
    public String toString(){
        return name + "--" + breed + "--" + age;
    }
    
}
