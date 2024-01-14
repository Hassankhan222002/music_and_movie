/**
 * Feedback.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package music_and_movie_prj;

public interface Feedback extends java.rmi.Remote {
    public void getFeedback(java.lang.String email, java.lang.String category, java.lang.String comment) throws java.rmi.RemoteException;
}
