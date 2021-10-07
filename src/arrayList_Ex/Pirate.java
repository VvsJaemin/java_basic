package arrayList_Ex;

public class Pirate {
    private String name;
    private int age;
    private boolean devilFruit;
    private int wanted;

    public Pirate(String name, int age, boolean devilFruit, int wanted) {
        this.name = name;
        this.age = age;
        this.devilFruit = devilFruit;
        this.wanted = wanted;
    }

    public Pirate() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDevilFruit() {
        return devilFruit;
    }

    public void setDevilFruit(boolean devilFruit) {
        this.devilFruit = devilFruit;
    }

    public int getWanted() {
        return wanted;
    }

    public void setWanted(int wanted) {
        this.wanted = wanted;
    }
}
