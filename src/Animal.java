public class Animal {
    boolean isMammal;
    boolean isCarnivore;

    public Animal(boolean isMammal, boolean isCarnivore) {
        setCarnivore(isCarnivore);
        setMammal(isMammal);
    }


    public void animalSound() {
        System.out.println("Please Override this function");

    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public void setCarnivore(boolean carnivore) {
        isCarnivore = carnivore;
    }
}
