import org.junit.*;
import static org.junit.Assert.*;

public class Leetspeak{

  @Test
  public void isLeetspeak_returnCorrectRegardlessOfCase_wordChanges () {
    assertEquals("1 scr3am", Leetspeak.isLeetspeak("I scream"));
  }

  @Test
  public void isLeetspeak_returns3ifletterisE_wordChanges() {
    assertEquals("3l3phant", Leetspeak.isLeetspeak("elephant"));
  }

  @Test
  public void isLeetspeak_returns0ifletterisO_wordChanges() {
    assertEquals("b00 b00", Leetspeak.isLeetspeak("boo boo"));
  }

  @Test
  public void isLeetspeak_returns1ifletterisI_wordChanges() {
    assertEquals("1 l1k3 1k3", Leetspeak.isLeetspeak("i like ike"));
  }

  @Test
  public void isLeetspeak_returnsZifletterisS_wordChanges() {
    assertEquals("r0z3z ar3 r3d", Leetspeak.isLeetspeak("roses are red"));
  }

  @Test
  public void isLeetspeak_doesNotReplaceSWhenFirstLetter_wordChanges() {
    assertEquals("sazzy sunzh1n3", Leetspeak.isLeetspeak("sassy sunshine"));
  }
}
