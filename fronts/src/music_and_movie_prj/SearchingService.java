/**
 * SearchingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package music_and_movie_prj;

public interface SearchingService extends javax.xml.rpc.Service {
    public java.lang.String getSearchingAddress();

    public music_and_movie_prj.Searching getSearching() throws javax.xml.rpc.ServiceException;

    public music_and_movie_prj.Searching getSearching(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
