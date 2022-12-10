/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.EcoSystem;


import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;
import javax.swing.JOptionPane;



/**
 *
 * @author fanyesun
 */
public class DB4OUtil {
    //import database here
    private static final String FILENAME = Paths.get("Database.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
 
    public synchronized static DB4OUtil getInstance(){
        
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
        
    }

    protected synchronized static void shutdown(ObjectContainer contain) {
        
        if (contain != null) {
            contain.close();
        }
        
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Set objects number in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Set the level of updation
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register here
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true); // Change to the object you want to save
            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "NO CONNECTION", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }

    public synchronized void storeEcoSystem(EcoSystem sys) {
        ObjectContainer conn = createConnection();
        conn.store(sys);
        conn.commit();
        conn.close();
    }

    public EcoSystem retrieveEcoSystem(){
        
        ObjectContainer conn = createConnection();
        //create new systems
        ObjectSet<EcoSystem> sys = conn.query(EcoSystem.class);
        EcoSystem system;
        if (sys.size() == 0){
            //configure a new one
            system = ConfigureASystem.configure();
        }
        else{
            system = sys.get(sys.size() - 1);
        }
        conn.close();
        return system;
    }
    
    
    
    
}
