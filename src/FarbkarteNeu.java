public class FarbkarteNeu {
  private Enum<Farbe> farbeEnum;
  public int farbe;
  private String name;


  public FarbkarteNeu(int farbe){
    this.farbe=farbe;
  }
  public int getFarbe() {
    return farbe;
  }
  public String getFarbName(){
    return "PlaceHolder";
  }
}