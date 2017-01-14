MUU

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
