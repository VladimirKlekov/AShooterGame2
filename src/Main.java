import weapones.Gun;
import weapones.Weapon;


import java.util.Scanner;


class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

         int slot=0;

        while (true) {
            System.out.format("У игрока %d слотов с оружием,"
                            + " введите номер, чтобы выстрелить,"
                            + " -1 чтобы выйти%n",
                    player.getSlotsCount()
            );

            slot = scanner.nextInt();

            if (slot == -1) {
                System.out.println("Игра окончена");
                break;
            }

            player.shotWithWeapon(slot);

        }

    }
}