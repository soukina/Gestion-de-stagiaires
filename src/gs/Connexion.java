
package gs;

import java.sql.*;

/**
 *
 * @author souka
 */
public class Connexion {

    
    Connection con;
    String urlpilote = "com.mysql.jdbc.Driver";
   
    String urlbasedonnees="jdbc:mysql://localhost:3306/gestionstagiairebp";
  
    
    
    public Connexion() {
        //charger le pilote de connexion
        try {
            Class.forName(urlpilote);
            System.out.println("pilote chargé");
            }
        
        catch(ClassNotFoundException ex){
            System.out.println(ex); 
        }
       
    //Connexion à la base de données
        try {
            
            con=DriverManager.getConnection(urlbasedonnees,"root","");
            System.out.println("Connexion à la base données");
            
           }
        
        
        catch(SQLException ex){
             System.out.println(ex);
                               }
        
      
        }
    
    
    
    
    Connection obtenirConnexion(){
        return con;
    }

   
    }
        
    
     
    
    
    
    
    
