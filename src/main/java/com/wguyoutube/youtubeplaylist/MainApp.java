package com.wguyoutube.youtubeplaylist;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class MainApp extends Application   {
    
     public static void main(String[] args) { launch(args); }

  @Override public void start(Stage stage) throws Exception {
    WebView webview = new WebView();
    webview.getEngine().load(
      "https://www.youtube.com/watch?v=IbbXbXWg5yQ&list=PL-kg-GL4FKRTYe2CwXTl12ffpiJJTEgSy"
    );
    webview.setPrefSize(1000, 500);

    stage.setScene(new Scene(webview));
    stage.show();
  }    
}
