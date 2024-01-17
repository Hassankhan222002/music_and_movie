package music_and_movie_prj;

public class FeedbackProxy implements music_and_movie_prj.Feedback {
  private String _endpoint = null;
  private music_and_movie_prj.Feedback feedback = null;
  
  public FeedbackProxy() {
    _initFeedbackProxy();
  }
  
  public FeedbackProxy(String endpoint) {
    _endpoint = endpoint;
    _initFeedbackProxy();
  }
  
  private void _initFeedbackProxy() {
    try {
      feedback = (new music_and_movie_prj.FeedbackServiceLocator()).getFeedback();
      if (feedback != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)feedback)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)feedback)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (feedback != null)
      ((javax.xml.rpc.Stub)feedback)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public music_and_movie_prj.Feedback getFeedback() {
    if (feedback == null)
      _initFeedbackProxy();
    return feedback;
  }
  
  public void getFeedback(java.lang.String email, java.lang.String category, java.lang.String comment) throws java.rmi.RemoteException{
    if (feedback == null)
      _initFeedbackProxy();
    feedback.getFeedback(email, category, comment);
  }
  
  
}