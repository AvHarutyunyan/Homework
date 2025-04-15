public interface ANIMALS {

    default void sound() {
        System.out.println("Some animal sound");
    }

    default void bazaraEle() {
        System.out.println("GOGO");
    }

    default long hjh() {
        return 12333l;
    }

}

class DogD implements ANIMALS {
    public static void main(String[] args) {
        ANIMALS animals = new DogD();
        animals.sound();
        animals.bazaraEle();
    }
}

