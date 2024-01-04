package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML private TextField tfNaam;
    @FXML private TextField tfEmailadres;
    @FXML private PasswordField pfWachtwoord;

    private InformatieController informatieController;

    public void genereerEmailadres()  {
        // Aan de hand van de ingevoerde naam wordt een e-mailadres aangemaakt.
        String naam = tfNaam.getText().toLowerCase();
        String emailadres = naam.replaceAll(" ", ".") + "@student.hu.nl";
        tfEmailadres.setText(emailadres);
    }

    public void drukOpRegistreer(ActionEvent event) {

        try {
            // Nieuwe scherm wordt geopend en aangemaakt.
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("informatie.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            informatieController = fxmlLoader.getController();
            Stage stage = new Stage();
            stage.setTitle("Ingevoerde gegevens voor de registratie");
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.show();

            // Ingevoerde gegevens worden doorgegeven aan het nieuwe scherm.
            informatieController.voegToeTekst(tfNaam.getText(), tfEmailadres.getText(), pfWachtwoord.getText());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void drukOpToonInformatie(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informatie over HU-aanmeldingformulier");
        alert.setHeaderText("Informatie voor de student");

        StringBuilder sb = new StringBuilder("Welkom bij het HU-aanmeldingsformulier van HBO-ICT Software Development.\n\n");
        sb.append("Via dit formulier kunt u zich aanmelden als nieuwe student HBO-ICT Software Development aan de Hogeschool Utrecht.\n\n");
        sb.append("We wensen u veel plezier bij onze opleiding!");

        alert.setContentText(sb.toString());

        alert.showAndWait();

    }

    public void drukOpExit() {
        System.exit(0);
    }
}
