package com.github.stai02.semestralka2.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javafx.fxml.FXML;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * The Class HomeController7 for control Home7.fxml. Window search results.
 */
public class HomeController7 {
	
	/** The detail. */
	@FXML public Button detail;
	
	/** The text area. */
	@FXML public TextArea results;

	//TODO
 	private ObservableList<ObservableList> data;
	
	/** The table. */
	@FXML public TableView table;
	
	
	/**
	 * Initialize.
	 */
	public void initialize() {
		detail.setDisable(true);
		table.setEditable(true);
	}
	
	
	/**
	 * Show results of searching.
     */
	public void result(String choice, String select, String selectText) {
		data = FXCollections.observableArrayList();
		try {
			Connection conn = dbConnection();
			String query = "SELECT * FROM " + choice + " WHERE " + select + " = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1, selectText);
			ResultSet rs = pst.executeQuery();
		    for(int i=0 ; i<rs.getMetaData().getColumnCount(); i++){
                final int j = i;                
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i+1));
                col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
                    public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                        return new SimpleStringProperty(param.getValue().get(j).toString());                        
                    }                    
                }
            );
                table.getColumns().addAll(col); 
                System.out.println("Column ["+i+"] ");
		    }
                while(rs.next()){
                    //Iterate Row
                    ObservableList<String> row = FXCollections.observableArrayList();
                    for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                        //Iterate Column
                        row.add(rs.getString(i));
                    }
                    System.out.println("Row [1] added "+row );
                    data.add(row);
                }
                //FINALLY ADDED TO TableView
                table.setItems(data);
              } catch(Exception e){
                  e.printStackTrace();
              }  
		    
		   
		   /* for (int i = 1; i < columnCount; i++) {
		        columnNames.put(i, metadata.getColumnName(i));
		    }
		    row += metadata.getColumnName(columnCount) + "\n";
			while (rs.next()) {
		        for (int i = 1; i < columnCount; i++) {
		            row += rs.getString(i) + ", ";          
		        } 
		        row += rs.getString(columnCount) + "\n";
			}
			pst.close();
			conn.close();
		} }catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	/**
	 * Show detail of searched item.
	 */
	public void showDetail(){
		
	}
	
	/**
     * Db connection.
     *
     * @return the connection
     * @throws ClassNotFoundException the class not found exception
     */
	public Connection dbConnection() throws ClassNotFoundException {
	 	   Class.forName("org.sqlite.JDBC");
	        Connection connection = null;
	        try
	        {
	          // create a database connection
	          connection = DriverManager.getConnection("jdbc:sqlite:./resources/main/java/com/github/stai02/semestralka2/main/db.db");
	          //System.out.println("connected");
	        }
	        catch(SQLException e)
	        {
	          // if the error message is "out of memory",
	          // it probably means no database file is found
	          System.err.println(e.getMessage());
	        }
	        return connection;
	    }
}
