import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rabbit rabbit = new Rabbit();
        Dog dog = new Dog();
        Tigger tigger = new Tigger();
        System.out.print("vvedi Grass or Meat - ");
        String food = sc.nextLine();
        rabbit.voice();
        rabbit.eat(food);
        dog.voice();
        dog.eat(food);
        tigger.voice();
        tigger.eat(food);
    }
}