import java.util.Objects;

public class Card {
  public String name;
  public String text ; // = null

  public Card(String name) {
    this.name = name;
  }

  public Card(String name, String text) {
    this.name = name;
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return name.equals(card.name) && Objects.equals(text, card.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, text);
  }

  @Override
  public String toString() {
    return "Card{" +
        "name='" + name + '\'' +
        ", text='" + text + '\'' +
        '}';
  }
}
