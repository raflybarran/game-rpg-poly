public class App {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Enemy enemy = new Enemy();
        Witch witch = new Witch();
        Fighter fighter = new Fighter();

        // Static polymorphism pada class Hero dan Enemy
        hero.move("ke UB");
        hero.move("ke UM", 10);
        enemy.move("ke Suhat");
        enemy.move("ke Sigura-Gura", 3);

        // Dynamic polymorphism sebuah referensi dari class Character ke objek class: Hero, Enemy, Witch, dan Fighter
        Character[] characters = new Character[] { hero, enemy, witch, fighter };

        for (Character character : characters) {
            character.move("ke UMM");
        }

        // Dynamic polymorphism sebuah referensi dari class Character ke objek Witch yang berubah (di-cast) menjadi objek Fighter
        Witch witch2 = new Witch();
        Character character = (Character) witch2;
        Fighter fighter2 = (Fighter) character;
        fighter2.move("ke Warmindo Mang Ujo", 12);
    }
}
