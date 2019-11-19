/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallersolid;

import java.util.ArrayList;

/**
 *
 * @author Kelly
 */
public interface Search {
    
    ArrayList<Book> searchByAuthor();
    ArrayList<Book> searchByTitle();
    ArrayList<Book> searchByCategory();
    
}
