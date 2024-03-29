/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author frith
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  The Class of Author that implements Serializable and has author name and
 * localdatestamp.
 * @author frith
 *
*  */
public class Author{
    
    private String name;
    private String authorCreator;
    
    /**The Constructor of Author that takes the input of name and creates a 
     *date stamp for date when the author was added
     * @param name String the name of the author you want to create.
     */
    public Author(String name,String authorCreator){
        this.name = name;
        this.authorCreator = authorCreator;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setAuthorCreator(String newAuthorCreator){
        this.authorCreator = newAuthorCreator;
    }    
    
    
    /**Accessor method that returns the name of an author
     * @return name Name the name of this author object.
     */
    public String getName(){
         
        return this.name;
    }
    public String getAuthorCreator(){ return this.authorCreator; }
    
    
        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author other = (Author) o;
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }    
    
    
    /** toString method of the Author with name and local date
     * @return info String returns the string info of this object
     *              inludes name and localdate.
     */
    @Override
    public String toString(){
                 
        String info = "Author name: "+name +"\n ";
        
    
        return info;
    }
    
    //@Override
    public String toString2(){
                 
        String info = "Author name: "+name + ". creator " +authorCreator + "\n";
        
    
        return info;
    }    
    
    
    
}