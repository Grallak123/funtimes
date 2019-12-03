package model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * This interface declares methods for querying a Books database.
 * Different implementations of this interface handles the connection and
 * queries to a specific DBMS and database, for example a MySQL or a MongoDB
 * database.
 * 
 * @author anderslm@kth.se
 */
public interface BooksDbInterface {
    
    /**
     * Connect to the database.
     * @param database
     * @return true on successful connection.
     */
   // public boolean connect(String database) throws IOException, SQLException;
    
   // public void disconnect() throws IOException, SQLException;
    
   // public List<Book> searchBooksByTitle(String title) throws IOException, SQLException;
    
    public void tryToConnect(String username, String password) throws Exception;
    
    public void tryToCloseConnection();
    
    public void executeQuery2(String query) throws SQLException;
    
    public String createOrder66(ArrayList<String> usedISBN);
    
    public void executeOrder66(String Order66) throws SQLException;
    
    public void executeAddBook(String query,ArrayList<String> authorsList,
            String chosenISBN) throws SQLException;
    
    public void executeDeleteBook(String deleteQuery) throws SQLException;
    
    
    // TODO: Add abstract methods for all inserts, deletes and queries 
    // mentioned in the instructions for the assignement.
}