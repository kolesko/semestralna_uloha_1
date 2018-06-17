package com.github.stai02.semestralka2.main;

import com.github.stai02.semestralka2.ui.HomeController8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/****************************************************
 * The Class Start is the main class of the project.
 * 
 * 
 * @author Ivana Stanová, Matej Kolesár, Lenka Šťastná, Julia Loseeva
 * @version June 2018
 */
public class Start extends Application {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws ClassNotFoundException the class not found exception
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		launch(args);
	}

	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass()
				.getResource("Home8.fxml"));
		Parent root = loader.load();
		HomeController8 c = loader.getController();
		
		c.initialize();
		primaryStage.setResizable(true);
		primaryStage.setTitle("Log in");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
		
		
	}

}
