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
        //primaryStage.setResizable(boolean);                           //Määra, kas akna suurust saab muuta

        //Stage stage = new Stage();                //loo uus stseen, seda pole vaja???
        StackPane stack = new StackPane();          //see on vajalik layout stseenile
        Scene scene = new Scene(stack, 450, 150); //stseeni mõõdud
        scene.setFill(Paint.valueOf("#ff9900"));                //taustavärv
        primaryStage.setScene(scene);               //määra milline stseen on aktiivne

        Circle joonistanRingi = new Circle(30);
        stack.getChildren().add(joonistanRingi);                          //vajalik!!!
    }}
