package Virtual_dictionary;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application {
    private DictionaryController controller = new DictionaryController();

    public void start(Stage stage) {
        FlowPane pane = new FlowPane();
        stage.setTitle("Virtual Dictionary");
        TextField wordField = new TextField();
        wordField.setPromptText("Enter word");

        TextField definitionField = new TextField();
        definitionField.setPromptText("Enter definition");

        Button button = new Button("Add");
        button.setOnAction(e -> {
            controller.addWord(wordField.getText(), definitionField.getText());
            wordField.clear();
            definitionField.clear();
        });

        TextField searchField = new TextField();
        searchField.setPromptText("Search word");

        Button button2 = new Button("Search");
        TextField resultField = new TextField();

        button2.setOnAction(e -> {
            String result = controller.searchWord(searchField.getText());
            resultField.setText(result);
            if (result == null) {
                resultField.setText("Word not found");
            }
        });

        pane.getChildren().addAll(wordField);
        pane.getChildren().addAll(definitionField);
        pane.getChildren().addAll(button);
        pane.getChildren().addAll(searchField);
        pane.getChildren().addAll(button2);
        pane.getChildren().addAll(resultField);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
