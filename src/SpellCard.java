public class SpellCard extends Card {

  public SpellCard(String name, String text) {
    super(name, text);
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public String toString() {
    return "SpellCard{" +
        "name='" + name + '\'' +
        ", text='" + text + '\'' +
        '}';
  }
}
