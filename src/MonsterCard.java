import java.util.Objects;

public class MonsterCard extends Card {
  public int attack;
  public int defense;

  public MonsterCard(String name, int attack, int defense) {
    super(name);
  }

  public MonsterCard(String name, String text, int attack, int defense) {
    super(name, text);
    this.attack = attack;
    this.defense = defense;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    MonsterCard that = (MonsterCard) o;
    return attack == that.attack && defense == that.defense;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), attack, defense);
  }

  @Override
  public String toString() {
    return "MonsterCard{" +
        "name='" + name + '\'' +
        ", text='" + text + '\'' +
        ", attack=" + attack +
        ", defense=" + defense +
        '}';
  }
}
