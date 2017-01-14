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
        primaryStage.show();}
}



MUU
//import java.awt.*; viska välja see, see on vaba algne grafaikapakett ja läheb uutega tylli!!!

 if (!laevadTabamata()) {
                //gameover kui pole alles, hüüumärk muudab väite vastupidiseks
                
 //seadistamsest         
        manguvaljak = new GridPane();
        HaldurMina = new Lauahaldus(manguvaljak, lauaPikkusLaevades, lauaLaiuslaevades, laevaPikkusPx);    //see annabki lauale halduse õigused. Tekkis aga ei tee midagi
        Scene scene = new Scene(manguvaljak, lauaPikkusLaevades * laevaPikkusPx, lauaLaiuslaevades * laevaPikkusPx);
        mainGameSquare = new Stage();
        scene.setFill(Color.DEEPSKYBLUE);
        mainGameSquare.setScene(scene);
        mainGameSquare.show();
