package oop_2.composition;

public class House {
    private Room room;

  public House(String room){
        this.room =new Room(room);
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public static void main(String[] args) {
       House house = new House("bedroom");
        System.out.println(house.getRoom().getName());
    }
}
class Room{
    private String name;

    Room(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
