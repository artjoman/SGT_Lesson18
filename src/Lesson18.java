public class Lesson18 {

    public static void main(String[] args) {

        System.out.println("Welcome to lesson 18!");

        Animal myAnimal = new Animal();
        myAnimal.sleep();

        Cat myCat = new Cat();
        myCat.setName("Muris");
        myCat.sleep();
        myCat.sayMeow();
        myCat.foodLimit = 100;
        myCat.setFood(50);

        Bird myBird = new Bird();
        String flyAwayMessage = myBird.flyAway();

        System.out.println(flyAwayMessage);
        // THIS IS IDENTICAL TO THE PREVIOUS COMMAND
        System.out.println(myBird.flyAway());
        myBird.sleep();
        myBird.foodLimit = 100;
        myBird.setFood(150);

        British britishCat = new British();
        britishCat.sleep();
//        britishCat.super().sleep();
        britishCat.setName("Queen");
        britishCat.sayMeow();
        britishCat.drinkTea();



    }
}
