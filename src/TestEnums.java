public class TestEnums {

  public static void main(String[] args) {
    System.out.println("TESTMAIN:***");
    FarbkarteOld fbko = new FarbkarteOld(2);
    System.out.println(fbko.getFarbName());
    FarbkarteOld fbko1 = new FarbkarteOld(0);
    System.out.println(fbko1.getFarbName());
    FarbkarteOld fbko2 = new FarbkarteOld(7);
    System.out.println(fbko2.getFarbName());
    FarbkarteOld fbko3 = new FarbkarteOld(7);
    System.out.println();


  }
}