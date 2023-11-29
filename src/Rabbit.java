public class Rabbit extends Animal {
    @Override
    public void voice(){
        System.out.println("frrrrr");
    }
    @Override
    public void eat(String food){
        if(food.equals("Meat")){
            System.out.println("I frrrr dont like Meat");
        } else if (food.equals("Grass")) {
            System.out.println("I  like to eat Meat");
        }else System.out.println("?");
    }
}
