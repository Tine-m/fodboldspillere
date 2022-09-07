public class Hold {

  // Vi opretter array og afsætter plads til 3 spiller
  // Bemærk at vi - som altid - gør vores Array attribut private
  private Fodboldspiller[] spillere = new Fodboldspiller[3];

  //Konstruktørmetode, der opretter spillerobjekter og placerer i array
  public Hold() {
    Fodboldspiller spiller1 = new Fodboldspiller("Lionel", "Messi", "Paris Saint-German FC", 1.69, 67);
    spillere[0] = spiller1;
    Fodboldspiller spiller2 = new Fodboldspiller("Cristiano", "Ronaldo", null, 1.87, 85);
    spillere[1] = spiller2;

    // Bemærk: man behøver ikke lave "spiller3" variabel
    // Man kan oprette objekt og indsætte det i samme statement
    spillere[2] = new Fodboldspiller("Neymar", "da Silva Santos Jr.", "Paris Saint-German FC", 1.76, 68);
  }

  public Fodboldspiller find(String efterNavn){
    // Hvis vi finder spiller med det ønskede efternavn returnerer vi spillerobjektet
    for(Fodboldspiller spiller : spillere){
      if(spiller.getEfternavn().equals(efterNavn)){
        return spiller;
      }
    }
    //Vi returnerer null, hvis vi ikke finder et match på efternavn
    return null;
  }
}
