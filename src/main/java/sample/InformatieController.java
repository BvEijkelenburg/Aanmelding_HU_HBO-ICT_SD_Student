package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class InformatieController {

    @FXML private Button btnSluiten;
    @FXML private TextArea taIngevoerdeGegevens;

    public void voegToeTekst(String naam, String emailadres, String wachtwoord) {

        StringBuilder sbTaIngevoerdeGegevens = new StringBuilder(taIngevoerdeGegevens.getText());

        sbTaIngevoerdeGegevens.append("De volgende gegevens heeft u ingevoerd:\n\n");

        sbTaIngevoerdeGegevens.append("Naam:\t\t" + naam + "\n");
        sbTaIngevoerdeGegevens.append("E-mailadres:\t" + emailadres + "\n");
        sbTaIngevoerdeGegevens.append("Wachtwoord:\t" + wachtwoord + "\n");

        taIngevoerdeGegevens.setText(sbTaIngevoerdeGegevens.toString());
    }

    public void drukOpSluiten(ActionEvent event) {

        // get a handle to the stage
        Stage stage = (Stage) btnSluiten.getScene().getWindow();
        // do what you have to do
        stage.close();

    }
}
