
package database;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateDatabase {
     // <editor-fold defaultstate="collapsed" desc="Uncomment and run if you not have table for database p_visual (before you run, drop your database p_visual then create database with name p_visual)"> 
    public static void main(String[] args)  {
        try {
            new CreateDatabase().start();
        } catch (InterruptedException e) {
            System.out.println("Error CreateDatabase : "+e.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(CreateDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //</editor-fold>
    
    public void start() throws InterruptedException, ParseException{
        KaryawanDatabase.createTable();
        KaryawanDatabase.createFakeData();
        MuskelDatabase.createTable();
        MuskelDatabase.createFakeData();
        UserDatabase.createTable();
        UserDatabase.createFakeData();
        PendaftarDatabase.createTable();
        PendaftarDatabase.createFakeData();
        ValidasiMuskelDatabase.createTable();
        ValidasiMuskelDatabase.createFakeData();
    }
}
