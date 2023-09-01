package de.rgmcode.javafx;

import javafx.event.ActionEvent;
import javafx.scene.control.*;


public class HelloController {
    public Button btnAdd;
    public Button btnUpdate;
    public ListView<String> lvListe;
    public TextField txfHeadline;
    public TextArea taDescription;

    public void initialize() {
        lvListe.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                String[] parts = newSelection.split(", ");
                if (parts.length >= 2) {
                    txfHeadline.setText(parts[0]);
                    taDescription.setText(parts[1]);
                }
            }
        });
    }

    public void btnAdd(ActionEvent actionEvent) {
        String a = txfHeadline.getText() + ", " + taDescription.getText();
        lvListe.getItems().add(a);
        txfHeadline.clear();
        taDescription.clear();
    }

    public void btnDelete(ActionEvent actionEvent) {
        String selectedItem = lvListe.getSelectionModel().getSelectedItem();
        lvListe.getItems().remove(selectedItem);
    }

    public void btnUpdate(ActionEvent actionEvent) {
        int selectedIndex = lvListe.getSelectionModel().getSelectedIndex();
        if (selectedIndex != -1) {
            String updatedItem = txfHeadline.getText() + ", " + taDescription.getText();
            lvListe.getItems().set(selectedIndex, updatedItem);
        }
    }
}
