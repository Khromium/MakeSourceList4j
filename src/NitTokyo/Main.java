package NitTokyo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/main.fxml"));
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("ソースリスト作るよ");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/icons.png")));
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(600);
        Controller controller = fxmlLoader.getController();
        controller.init(primaryStage);
//        primaryStage.setMaxHeight(400);
//        primaryStage.setMaxWidth(600);


        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


}
