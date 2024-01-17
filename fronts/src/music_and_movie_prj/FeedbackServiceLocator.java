/**
 * FeedbackServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package music_and_movie_prj;

public class FeedbackServiceLocator extends org.apache.axis.client.Service implements music_and_movie_prj.FeedbackService {

    public FeedbackServiceLocator() {
    }


    public FeedbackServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FeedbackServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Feedback
    private java.lang.String Feedback_address = "http://localhost:8080/music_and_movie_prj/services/Feedback";

    public java.lang.String getFeedbackAddress() {
        return Feedback_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FeedbackWSDDServiceName = "Feedback";

    public java.lang.String getFeedbackWSDDServiceName() {
        return FeedbackWSDDServiceName;
    }

    public void setFeedbackWSDDServiceName(java.lang.String name) {
        FeedbackWSDDServiceName = name;
    }

    public music_and_movie_prj.Feedback getFeedback() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Feedback_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFeedback(endpoint);
    }

    public music_and_movie_prj.Feedback getFeedback(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            music_and_movie_prj.FeedbackSoapBindingStub _stub = new music_and_movie_prj.FeedbackSoapBindingStub(portAddress, this);
            _stub.setPortName(getFeedbackWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFeedbackEndpointAddress(java.lang.String address) {
        Feedback_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (music_and_movie_prj.Feedback.class.isAssignableFrom(serviceEndpointInterface)) {
                music_and_movie_prj.FeedbackSoapBindingStub _stub = new music_and_movie_prj.FeedbackSoapBindingStub(new java.net.URL(Feedback_address), this);
                _stub.setPortName(getFeedbackWSDDServiceName());
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
        if ("Feedback".equals(inputPortName)) {
            return getFeedback();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://music_and_movie_prj", "FeedbackService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://music_and_movie_prj", "Feedback"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Feedback".equals(portName)) {
            setFeedbackEndpointAddress(address);
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
