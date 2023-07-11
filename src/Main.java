public class Main {
    public static void main(String[] args) {
        Fish fish=new Fish();
        fish.setName("Semga");
        fish.setVes(76);
        fish.setBaasy(1500);
        System.out.println(fish.getName());
        System.out.println(fish.getVes());
        System.out.println(fish.getBaasy());


        Cat caty=new Cat();
        caty.setName("Mysi");
        caty.setPoroda("Taby");
        caty.setLet(12);
        System.out.println(caty.getName());
        System.out.println(caty.getPoroda());
        System.out.println(caty.getLet());

        Dog dog=new Dog();
        dog.setName("dosi");
        dog.setPorogy("lobrador");
        dog.setGod(13);
        System.out.println(dog.getName());
        System.out.println(dog.getPorogy());
        System.out.println(dog.getGod());


        Parrot porr=new Parrot();
        porr.setName("kesha");
        porr.setColor("yellow");
        porr.setStrana("австралия");
        System.out.println(porr.getName());
        System.out.println(porr.getColor());
        System.out.println(porr.getStrana());

    }
}