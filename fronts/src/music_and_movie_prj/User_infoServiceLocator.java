/**
 * User_infoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package music_and_movie_prj;

public class User_infoServiceLocator extends org.apache.axis.client.Service implements music_and_movie_prj.User_infoService {

    public User_infoServiceLocator() {
    }


    public User_infoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public User_infoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for User_info
    private java.lang.String User_info_address = "http://localhost:8080/music_and_movie_prj/services/User_info";

    public java.lang.String getUser_infoAddress() {
        return User_info_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String User_infoWSDDServiceName = "User_info";

    public java.lang.String getUser_infoWSDDServiceName() {
        return User_infoWSDDServiceName;
    }

    public void setUser_infoWSDDServiceName(java.lang.String name) {
        User_infoWSDDServiceName = name;
    }

    public music_and_movie_prj.User_info getUser_info() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(User_info_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUser_info(endpoint);
    }

    public music_and_movie_prj.User_info getUser_info(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            music_and_movie_prj.User_infoSoapBindingStub _stub = new music_and_movie_prj.User_infoSoapBindingStub(portAddress, this);
            _stub.setPortName(getUser_infoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUser_infoEndpointAddress(java.lang.String address) {
        User_info_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (music_and_movie_prj.User_info.class.isAssignableFrom(serviceEndpointInterface)) {
                music_and_movie_prj.User_infoSoapBindingStub _stub = new music_and_movie_prj.User_infoSoapBindingStub(new java.net.URL(User_info_address), this);
                _stub.setPortName(getUser_infoWSDDServiceName());
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
        if ("User_info".equals(inputPortName)) {
            return getUser_info();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://music_and_movie_prj", "User_infoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://music_and_movie_prj", "User_info"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("User_info".equals(portName)) {
            setUser_infoEndpointAddress(address);
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
