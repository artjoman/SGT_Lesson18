public class Animal {

    public Animal() {
    }

    private String name;
    private int food;
    public int foodLimit;

    public void sleep() {
        System.out.println("Zzzzzzzz.. I am sleeping!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if(food > foodLimit) {
            System.out.println("i cannot eat so much");
        }
        this.food = food;
    }
}
