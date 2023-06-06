package Heritage;

public class Hangar {
    public static void main(String[] args){
        Vehicle voiture = new Car("Clio",170);
        Vehicle bateau = new Boat("Titanic",948);
        System.out.println(voiture.doStuff());
        System.out.println(bateau.doStuff());
    }
}
