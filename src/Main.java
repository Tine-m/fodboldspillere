public class Main {

  public static void main(String[] args) {
    Fodboldspiller spiller1 = new Fodboldspiller("Lionel","Messi",
        "Paris Saint Germain F.C", 1.69, 67);
    Fodboldspiller spiller2 = new Fodboldspiller("Neymar", "da Silva Santos Jr.",
        "Paris Saint Germain F.C", 1.78, 68);
    Fodboldspiller spiller3 = new Fodboldspiller("Cristiano", "Ronaldo",
        null , 1.87, 85);

    System.out.println(spiller1.getFornavn() +
        " " + spiller1.getEfternavn());
    System.out.println(spiller2.getFornavn() +
        " " + spiller2.getEfternavn());
    System.out.println(spiller3.getFornavn() +
        " " + spiller3.getEfternavn());
  }
}
