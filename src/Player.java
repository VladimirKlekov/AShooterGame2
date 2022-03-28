import weapones.Weapon;
import weapones.MachineGun;
import weapones.Gun;
import weapones.Rpg;
import weapones.WaterPistol;
import weapones.Slingshot;



public class Player {

    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{
                new Gun(), //в 0 ячейке пистолет
                new MachineGun(),
                new Rpg(),
                new Slingshot(),
                new WaterPistol()};
        // TODO заполнить слоты оружием

    }

      public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока

        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if(slot < 0 || slot > weaponSlots.length-1 ){
                System.out.println("Ошибка выбора оружие. Попробуйте еще раз");
            }
            // TODO проверить на выход за границы
            // если значение slot некорректно, то
            // выйти из метода написав об этом в консоль

            // Получаем оружие из выбранного слота
            else {
                Weapon weapon = weaponSlots[slot];
                // Огонь!
                weapon.shot();

            }
        }
    }






