package music_and_movie_prj;

public class User_infoProxy implements music_and_movie_prj.User_info {
  private String _endpoint = null;
  private music_and_movie_prj.User_info user_info = null;
  
  public User_infoProxy() {
    _initUser_infoProxy();
  }
  
  public User_infoProxy(String endpoint) {
    _endpoint = endpoint;
    _initUser_infoProxy();
  }
  
  private void _initUser_infoProxy() {
    try {
      user_info = (new music_and_movie_prj.User_infoServiceLocator()).getUser_info();
      if (user_info != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)user_info)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)user_info)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (user_info != null)
      ((javax.xml.rpc.Stub)user_info)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public music_and_movie_prj.User_info getUser_info() {
    if (user_info == null)
      _initUser_infoProxy();
    return user_info;
  }
  
  public java.lang.String getuserinfo(java.lang.String name, java.lang.String password, java.lang.String email) throws java.rmi.RemoteException{
    if (user_info == null)
      _initUser_infoProxy();
    return user_info.getuserinfo(name, password, email);
  }
  
  
}