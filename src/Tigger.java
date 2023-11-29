public class Tigger extends Animal{
    @Override
    public void voice(){
        System.out.println("Rrrrrr");
    }
    @Override
    public void eat(String food){
        if(food.equals("Meat")){
            System.out.println("I rrrrr like to eat Meat");
        } else if (food.equals("Grass")) {
            System.out.println("I dont like grass");
        }else System.out.println("?");
    }
}
