package com.github.stai02.semestralka2.main;

import com.github.stai02.semestralka2.logic.*;
import com.github.stai02.semestralka2.ui.HomeController2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/****************************************************
 * Trieda {@code Start} je hlavnou triedou projektu.
 * 
 * 
 * @author Ivana Stanová
 *
 */
public class Start extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass()
				.getResource("Home2.fxml"));
		Parent root = loader.load();
		HomeController2 c = loader.getController();
		
		c.initialize();
		
		primaryStage.setTitle("Menu");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
		
		
	}

}
