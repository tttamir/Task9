public class Dog extends Animal{
    @Override
    public void voice(){
        System.out.println("gav-gav-gav");
    }
    @Override
    public void eat(String food){
        if(food.equals("Meat")){
            System.out.println("I gav-gav like to eat Meat");
        } else if (food.equals("Grass")) {
            System.out.println("I dont like grass");
        }else System.out.println("?");
    }
}
