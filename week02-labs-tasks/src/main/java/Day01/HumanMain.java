package Day01;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human("Bill", 12);
        System.out.println(human.getName());

        Human human1 = new Human("Jill", 32);

        human.introduction();
        human1.introduction();
    }




}
