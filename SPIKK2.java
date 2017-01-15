Muutujad
int a = 5;     double a = 8.76;         //Loo uus
(int) Math.pow(a, b);                   // a astmes b
a / b;                                  //jagamine
a == b;    a != b;    a <= b;            //võrdlemine
if (!laevadTabamata()) {    //gameover, kui pole laevu, hüüumärk muudab väite vastupidiseks
int c = (int) 6;    //muuda tüüpi? int c = Integer.parseInt(a);
char a = 'k';       //üksik täht
a.contains("õue");  //sisaldab
a.equals(Loom)      //võrdlemine
a.replace("õue", "arvutisse"); // "Lähme arvutisse mängima." esimene sõna asendatakse teise sõnaga
a.isEmpty();            //kas on tühi

Õpetus_boolean
true == true;
true != false;
true == true && false == false;  //mõlemad tingimused peavad olema tõesed
true == false || false == false; // üks tingimustest peab olema tõene

Objekt (ehk klassid) vt teist faili:
1.1. public class MinuProgramm {public static void main(String[] args) {
        Hobune uusMuutuja = new Hobune();    // defineerin uue hobuse objekti, Hobune on teise alamklassi nimi
        System.out.println(uusMuutuja.kaal); // küsin välja hobuse kaalu teisest klassist
    }}
1.2.public class Hobune {int kaal = 100000000;}




Stage - aken


//TULEMUSEKS AKEN RINGIGA
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class Main extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 150, 150);
        primaryStage.setScene(scene);
        Circle ring = new Circle(30);
        stack.getChildren().add(ring);
        primaryStage.show();}               }



MUU
//import java.awt.*; viska välja see, see on vaba algne grafaikapakett ja läheb uutega tylli!!!
               
//seadistamsest         
        manguvaljak = new GridPane();
        HaldurMina = new Lauahaldus(manguvaljak, lauaPikkusLaevades, lauaLaiuslaevades, laevaPikkusPx);    //see annabki lauale halduse õigused. Tekkis aga ei tee midagi
        Scene scene = new Scene(manguvaljak, lauaPikkusLaevades * laevaPikkusPx, lauaLaiuslaevades * laevaPikkusPx);
        mainGameSquare = new Stage();
        scene.setFill(Color.DEEPSKYBLUE);
        mainGameSquare.setScene(scene);
        mainGameSquare.show();
