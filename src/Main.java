public class Main {

  public static void main(String[] args) {
    MonsterCard darkMagician = new MonsterCard("Dark Magician",
        "The ultimate wizard in terms of attack and defense.", 2500, 2100);
    System.out.println(darkMagician);
    MonsterCard darkMagicianGirl = new MonsterCard("Dark Magician Girl", 2000, 1700);
    System.out.println(darkMagicianGirl);
    SpellCard potOfGreed = new SpellCard("Pot of Greed", "Draw 2 cards.");
    System.out.println(potOfGreed);

    System.out.println(darkMagician.equals(darkMagicianGirl));
    System.out.println(darkMagician.equals(potOfGreed));

    MonsterCard darkMagician2 = new MonsterCard("Dark Magician",
        "The ultimate wizard in terms of attack and defense.", 2500, 2100);
    System.out.println(darkMagician == darkMagician2); // !! CUIDADO
    System.out.println(darkMagician.equals(darkMagician2));
  }
}
