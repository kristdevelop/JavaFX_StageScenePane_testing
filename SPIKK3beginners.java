GIT https://wiki.itcollege.ee/index.php/I253_Informatika_eelkursus#Neljas_teema:_Git_ja_SSH_v.C3.B5tmed
CODES https://github.com/caveofprogramming/java-beginners.git
REVIEW JAVAFX http://docs.oracle.com/javafx/2/get_started/form.htm

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
    
    
  JAVA FX
 import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MinuLoodudKlass extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("MinuÄpp");                                 //käsk seotud STAGEga
        primaryStage.show();

        StackPane kujund = new StackPane();         //see on parem kui Pane
        Scene stseen = new Scene(kujund, 700, 700);
        primaryStage.setScene(stseen);
        kujund.setRotate(30);                           // Pööra 30 kraadi??
        //kujund.setAlignment(Pos.BOTTOM_CENTER);             //pall asub all
        stseen.setFill(Paint.valueOf("#ff9900"));                //taustavärv

        Circle joonistanRingi = new Circle(30);
        Circle joonistanRingi2 = new Circle(60);
        joonistanRingi2.setTranslateX(70);              //liigutab kujundit

        Label l = new Label();
        l.setText("Keegi on su selja taga!");
        l.setTranslateX(150);
        l.setTranslateY(200);
        l.setScaleX(0.5);
        l.setScaleY(2);
        l.setRotate(10);

        kujund.getChildren().addAll(l, joonistanRingi, joonistanRingi2);  //mitu elementi

    }}


