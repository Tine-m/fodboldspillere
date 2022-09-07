public class Main {

  public static void main(String[] args) {
    Hold dreamTeam = new Hold();

    // Vi søger efter spiller med efternavn Ronaldo
    Fodboldspiller spiller = dreamTeam.find("Ronaldo");

    // Vi printer information ud om den spiller som find-metoden har returneret
    System.out.println(spiller.getFornavn() + " " +spiller.getEfternavn() );
  }
}
