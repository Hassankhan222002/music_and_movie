/**
 * FeedbackService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package music_and_movie_prj;

public interface FeedbackService extends javax.xml.rpc.Service {
    public java.lang.String getfeedbackAddress();

    public music_and_movie_prj.Feedback getfeedback() throws javax.xml.rpc.ServiceException;

    public music_and_movie_prj.Feedback getfeedback(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
