/**
 * Searching.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package music_and_movie_prj;

public interface Searching extends java.rmi.Remote {
    public java.lang.String status() throws java.rmi.RemoteException;
    public java.lang.String movieName() throws java.rmi.RemoteException;
    public java.lang.String genre() throws java.rmi.RemoteException;
    public java.lang.String search_movie(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String category() throws java.rmi.RemoteException;
}
