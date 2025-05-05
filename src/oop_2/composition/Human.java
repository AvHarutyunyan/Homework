package oop_2.composition;

public class Human {
    private Heart heart;

    public Human() {
        this.heart = new Heart();
    }

    public Heart getHeart() {
        return heart;
    }

    public static void main(String[] args) {
        Human human = new Human();
       human.getHeart().beat();
    }
}

class Heart {
    public void beat() {
        System.out.println("Heart is beating...");
    }
}
