Muutujad
int a = 5;     double a = 8.76;         //Loo uus
(int) Math.pow(a, b);                   // a astmes b
a / b;                                  //jagamine
a == b;    a != b;    a <= b;            //võrdlemine
if (!laevadTabamata()) {    //gameover, kui pole laevu, hüüumärk muudab väite vastupidiseks
int c = (int) 6;    //muuda tüüpi? int c = Integer.parseInt(a);
char a = 'k';       //üksik täht

massiiv:
a.contains("õue");                      //sisaldab
a.equals(Loom)   Arrays.equals(a, b)   //võrdlemine
a.replace("õue", "arvutisse"); // "Lähme arvutisse mängima." esimene sõna asendatakse teise sõnaga
a.isEmpty();            //kas on tühi


h.add((int) ...);
h.clear();                         // tühjenda eelnevad katsed
mmmm.put(muutujanimiTulemused);        // salvesta tulemus
int uusmuutuja = (int) ((ArrayList) tulemused.get("Kaido")).get(7);  //get annab seitsmenda väärtuse
.show
muutujaNimi = muutujaNimi.replace('r', 'l');    //asendab esimese


Õpetus_boolean
true == true;
true != false;
true == true && false == false;  //mõlemad tingimused peavad olema tõesed
true == false || false == false; // üks tingimustest peab olema tõene


Objekt (ehk klassid) 
1.1. public class MinuProgramm {public static void main(String[] args) {
        Hobune uusMuutuja = new Hobune();    // defineerin uue hobuse objekti, Hobune on teise alamklassi nimi
        System.out.println(uusMuutuja.kaal); // küsin välja hobuse kaalu teisest klassist
    }}
1.2.public class Hobune {int kaal = 100000000;}



Kogum väärtusi:
***massiiv[] = Hoiab mitmeid väärtusi korraga, aga ainult 1 andmetüüpi ja kogust muuta ei saa
int[] a = new int[6];                   //6 kohta, (loendamine algab nullist)
a[5] = 999;
String[] a = {"mina", "olen", "sõnede", "massiiv"};
System.out.println(Arrays.toString(a));
//Kasutamine
Arrays.sort(a)                          //sordi
System.out.println(Arrays.toString(a))  //prindi
***ArrayList= Hoiab ERI andmetüüpi väärtusi ja nimekirja pikkus muutub vastavalt sisule
ArrayList a = new ArrayList();
a.add("Sõne");
a.add(54);
a.add(87.90);
System.out.println("a = " + a);
//Loo uus
ArrayList a = new ArrayList();
ArrayList<String> a = new ArrayList();
ArrayList<Integer> a = new ArrayList();
//Kasutamine
a.get(i)     //mis seal on
a.set(i, b)  //asenda
***HashMap = Hoiab <võti, väärtus> andmeid; Siin ei ole indekseid ehk ei ole ka võtmete järjekorda võimalik määrata
...

IF SWITCH TRY-CATCH



Java FX
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





