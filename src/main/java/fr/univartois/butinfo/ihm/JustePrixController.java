package fr.univartois.butinfo.ihm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class JustePrixController {
	
	private static final Random RAND = new Random();
	private int n;

    @FXML
    private Button boutonValider;

    @FXML
    private TextField champEntier;

    @FXML
    private Label indice;
    
    @FXML
    private Button recommencer;
	
	public void init() {
		n = RAND.nextInt(100)+1;
	}

    @FXML
    void recommencerPartie(ActionEvent event) {
    	init();
    	champEntier.setDisable(false);
    	boutonValider.setDisable(false);
    	indice.setText("pas d'indice");
    }

    @FXML
    void validerEntree(ActionEvent event)throws NumberFormatException{
    	try {
    		int valSaisie = Integer.parseInt(champEntier.getText());
    		if (valSaisie > n) 
    			indice.setText("Plus petit !");
        	else if (valSaisie < n) 
        		indice.setText("Plus grand !");
        	else {
        		indice.setText("GG");
        		champEntier.setDisable(true);
        		boutonValider.setDisable(true);
        	}
    	}
    	catch (NumberFormatException e) {
    		indice.setText("Veuillez entrer un entier !!!!");
    	}
    	champEntier.setText("");
    }
}