public class Zähler {

  public int zähler;

  private int seriennummer;

  public Zähler(int zähler, int seriennummer){
    this.zähler=zähler;
    this.seriennummer=seriennummer;
  }
  public int getZähler() {
    return zähler;
  }

  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}