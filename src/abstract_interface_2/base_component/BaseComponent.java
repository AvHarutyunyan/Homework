package abstract_interface_2.base_component;

/**
 * 5.Write a program, it is required to build a project consisting of a number of classes, possibly using a large number of programmers.
 * It is necessary to make sure that every class from which all other classes in the project will be inherited.
 * Since any new classes in the project must inherit from the base class,
 * programmers are not free to create a different interface.
 * Therefore, it can be guaranteed that all the classes in the project will respond to the same debugging commands
 * @author Avet
 */
public interface BaseComponent {
    void debugger();
}

class TeamA implements BaseComponent {
    @Override
    public void debugger() {
        System.out.println("This is a debugger from Team A");
    }
}

class TeamB implements BaseComponent {
    @Override
    public void debugger() {
        System.out.println("This is a debugger from Team B");
    }

}

class TeamC implements BaseComponent {
    @Override
    public void debugger() {
        System.out.println("This is a debugger from Team C");
    }

    public static void main(String[] args) {
        BaseComponent baseComponent1 = new TeamA();
        baseComponent1.debugger();

        BaseComponent baseComponent2 = new TeamB();
        baseComponent2.debugger();

        BaseComponent baseComponent3 = new TeamC();
        baseComponent3.debugger();
    }
}
