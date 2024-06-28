import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //remove code from here 
	Button btn = new Button();
        btn.setLayoutY(100);
        btn.setText("Say 'The ultimate Java Programmer'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("The ultimate Java Programmer");
            }
        });
        
        Button btn2 = new Button();
        btn2.setText("Say 'HelloWorld2'");
        
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("HelloWorld2");
            }
        });
      
        Group root2 = new Group();
       
        HBox root = new HBox();
        root.setLayoutY(300);
        root.getChildren().addAll(btn,btn2);
        root2.getChildren().add(root);
        
        Scene scene = new Scene(root2, 900, 550);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
	//to here to add your own code
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
