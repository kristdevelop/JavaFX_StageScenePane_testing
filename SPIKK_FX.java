Stage on esimene aken
Scene on tegevusstseen
Layout ehk StackPane? //kuidas asjad paigutavad, Stseeni ilma layoutita teha ei saa, seep StackPane Scene() sulgude vahel
Node ehk esemed

//kood, TULEMUSEKS AKEN RINGIGA
public class MinuLoodudKlass extends Application{                          //laiendamine
    @Override                                       //NB! JavaFX Application: mitte main() meetodiga, vaid start()
    public void start(Stage primaryStage) throws Exception {               //start()    "primary" pole vajalik
        primaryStage.setTitle("MinuÄpp");                                 //käsk seotud STAGEga
        primaryStage.show();                                             //käsk seotud STAGEga
 
        StackPane kujundMinu = new StackPane();          //üks võimalikest kujunditest, kujund on vajalik layout stseenile
        Scene scene = new Scene(kujundMinu, 450, 150); //stseeni mõõdud
        scene.setFill(Paint.valueOf("#ff9900"));                //taustavärv
        primaryStage.setScene(scene);               //määra milline stseen on aktiivne

        Circle joonistanRingi = new Circle(30);
        kujundMinu.getChildren().add(joonistanRingi);                          //vajalik!!!
    }}
