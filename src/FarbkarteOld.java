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
    String Abhandlung = "";
    switch (farbe){
      case 0:
        Abhandlung="Rot";
        break;
      case 1:
        Abhandlung="Schwarz";
        break;
      case 2:
        Abhandlung="Gelb";
        break;
      case 3:
        Abhandlung="Weiss";
        break;
      default:
        Abhandlung="Error";
        break;
    }
    return "Die Karte hat Nr: " + farbe + "Name: " + Abhandlung;
  }
}