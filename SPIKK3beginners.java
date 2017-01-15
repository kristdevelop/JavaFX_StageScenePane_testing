GIT https://wiki.itcollege.ee/index.php/I253_Informatika_eelkursus#Neljas_teema:_Git_ja_SSH_v.C3.B5tmed
CODES https://github.com/caveofprogramming/java-beginners.git

KLASSID
1.1. public class Main extends Application {
    GridPane manguvaljak;                              //defineerib laua olemasolu pluss selle suuruse
    int lauaPikkusLaevades = 6;  //ruutude arv
    int lauaLaiuslaevades = 6;  //ruutude arv
    int laevaPikkusPx = 100;     //ruudu suurus
    Lauahaldus HaldurMina;      //uue muutuja loomine, mis on vaja VIITEKS teisele klassile, nimeks Lauahaldus
1.2.public class Lauahaldus {   //järgnev on klassika, alamklass saab sisendid põhiklassist, mis peavad alguses nullid olema
    GridPane manguvaljak;
    int lauaPikkusLaevades = 0;    //mis peavad alguses nullid olema
    int lauaLaiuslaevades = 0;
    int laevaPikkusPx = 0;
    // loome uue meetodi, mis olemuselt on lihtsalt käivitaja:
    public Lauahaldus (GridPane uusmanguvaljak, int lauaPikkusLaevades2, int lauaLaiuslaevades2, int laevaPikkusPx2 ) {
    manguvaljak = uusmanguvaljak;    // selle sees defineerime aga mänguväljaku ja selle uued näitajad, andes vanadele muutujatele uued muutujad
    lauaPikkusLaevades = lauaPikkusLaevades2;
    lauaLaiuslaevades = lauaLaiuslaevades2;
    laevaPikkusPx = laevaPikkusPx2;
}                //MIKS? Main-klass ei saa sisse ju siia, ei saa otse ligi laevapikkustele
    public void loonLaevad() {   //see on päris tegevus, mis on selle klassi meetod-oskus



KOODINÄIDE
public class Program {public static void main(String[] args) { boolean value = true; // seadistame, et õige
        if (value) {System.out.println("prindin konsooli õige");}
        value = false;
       if (!value) {System.out.println("prindin konsooli vale");}
    }}


