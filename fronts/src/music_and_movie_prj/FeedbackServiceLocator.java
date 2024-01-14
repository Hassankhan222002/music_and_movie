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

    // Use to get a proxy class for feedback
    private java.lang.String feedback_address = "http://localhost:8080/music_and_movie_prj/services/feedback";

    public java.lang.String getfeedbackAddress() {
        return feedback_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String feedbackWSDDServiceName = "feedback";

    public java.lang.String getfeedbackWSDDServiceName() {
        return feedbackWSDDServiceName;
    }

    public void setfeedbackWSDDServiceName(java.lang.String name) {
        feedbackWSDDServiceName = name;
    }

    public music_and_movie_prj.Feedback getfeedback() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(feedback_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getfeedback(endpoint);
    }

    public music_and_movie_prj.Feedback getfeedback(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            music_and_movie_prj.FeedbackSoapBindingStub _stub = new music_and_movie_prj.FeedbackSoapBindingStub(portAddress, this);
            _stub.setPortName(getfeedbackWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setfeedbackEndpointAddress(java.lang.String address) {
        feedback_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (music_and_movie_prj.Feedback.class.isAssignableFrom(serviceEndpointInterface)) {
                music_and_movie_prj.FeedbackSoapBindingStub _stub = new music_and_movie_prj.FeedbackSoapBindingStub(new java.net.URL(feedback_address), this);
                _stub.setPortName(getfeedbackWSDDServiceName());
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
        if ("feedback".equals(inputPortName)) {
            return getfeedback();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://music_and_movie_prj", "feedbackService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://music_and_movie_prj", "feedback"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("feedback".equals(portName)) {
            setfeedbackEndpointAddress(address);
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
