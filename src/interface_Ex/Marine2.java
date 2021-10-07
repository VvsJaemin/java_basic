package interface_Ex;

public class Marine2 {
    public int hp;

    public void attack(Building building) {
        building.hp--;
    }

    public static void main(String[] args) {
        Marine2 marine = new Marine2();

        Bunker bunker = new Bunker();
        System.out.println(bunker.hp + "벙커 초기화");

        while (bunker.hp > 0) {
            marine.attack(bunker);
            if (bunker.hp == 0) {
                System.out.println("건물이 폭파됨!");
            }else {
                System.out.println(bunker.hp + "건물이 공격 당함");
            }
        }
        CommandCenter commandCenter = new CommandCenter();
        System.out.println(commandCenter.hp + "공격전");
        marine.attack(commandCenter);
        System.out.println(commandCenter.hp + "공격후");
    }


}
