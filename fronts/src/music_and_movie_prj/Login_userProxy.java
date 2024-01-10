package music_and_movie_prj;

public class Login_userProxy implements music_and_movie_prj.Login_user {
  private String _endpoint = null;
  private music_and_movie_prj.Login_user login_user = null;
  
  public Login_userProxy() {
    _initLogin_userProxy();
  }
  
  public Login_userProxy(String endpoint) {
    _endpoint = endpoint;
    _initLogin_userProxy();
  }
  
  private void _initLogin_userProxy() {
    try {
      login_user = (new music_and_movie_prj.Login_userServiceLocator()).getLogin_user();
      if (login_user != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)login_user)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)login_user)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (login_user != null)
      ((javax.xml.rpc.Stub)login_user)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public music_and_movie_prj.Login_user getLogin_user() {
    if (login_user == null)
      _initLogin_userProxy();
    return login_user;
  }
  
  public java.lang.String login_info(java.lang.String name, java.lang.String password) throws java.rmi.RemoteException{
    if (login_user == null)
      _initLogin_userProxy();
    return login_user.login_info(name, password);
  }
  
  
}