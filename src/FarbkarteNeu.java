public class FarbkarteOld {

  public int KFARBE_ROT = 0;
  public int KFARBE_SCHWARZ = 1;
  public int KFARBE_GELB = 2;
  public int KFARBE_WEISS = 3;
  private int farbe;

  public FarbkarteOld(int farbe){
    this.farbe=farbe;
  }
  public int getFarbe() {
    return farbe;
  }
  public String getFarbName(){
    return "";
  }
}