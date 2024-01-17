/**
 * SearchingServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package music_and_movie_prj;

public class SearchingServiceLocator extends org.apache.axis.client.Service implements music_and_movie_prj.SearchingService {

    public SearchingServiceLocator() {
    }


    public SearchingServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SearchingServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Searching
    private java.lang.String Searching_address = "http://localhost:8080/music_and_movie_prj/services/Searching";

    public java.lang.String getSearchingAddress() {
        return Searching_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SearchingWSDDServiceName = "Searching";

    public java.lang.String getSearchingWSDDServiceName() {
        return SearchingWSDDServiceName;
    }

    public void setSearchingWSDDServiceName(java.lang.String name) {
        SearchingWSDDServiceName = name;
    }

    public music_and_movie_prj.Searching getSearching() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Searching_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSearching(endpoint);
    }

    public music_and_movie_prj.Searching getSearching(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            music_and_movie_prj.SearchingSoapBindingStub _stub = new music_and_movie_prj.SearchingSoapBindingStub(portAddress, this);
            _stub.setPortName(getSearchingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSearchingEndpointAddress(java.lang.String address) {
        Searching_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (music_and_movie_prj.Searching.class.isAssignableFrom(serviceEndpointInterface)) {
                music_and_movie_prj.SearchingSoapBindingStub _stub = new music_and_movie_prj.SearchingSoapBindingStub(new java.net.URL(Searching_address), this);
                _stub.setPortName(getSearchingWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Searching".equals(inputPortName)) {
            return getSearching();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://music_and_movie_prj", "SearchingService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://music_and_movie_prj", "Searching"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Searching".equals(portName)) {
            setSearchingEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
