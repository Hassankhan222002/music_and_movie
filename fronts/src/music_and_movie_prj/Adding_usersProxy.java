package music_and_movie_prj;

public class Adding_usersProxy implements music_and_movie_prj.Adding_users {
  private String _endpoint = null;
  private music_and_movie_prj.Adding_users adding_users = null;
  
  public Adding_usersProxy() {
    _initAdding_usersProxy();
  }
  
  public Adding_usersProxy(String endpoint) {
    _endpoint = endpoint;
    _initAdding_usersProxy();
  }
  
  private void _initAdding_usersProxy() {
    try {
      adding_users = (new music_and_movie_prj.Adding_usersServiceLocator()).getAdding_users();
      if (adding_users != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)adding_users)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)adding_users)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (adding_users != null)
      ((javax.xml.rpc.Stub)adding_users)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public music_and_movie_prj.Adding_users getAdding_users() {
    if (adding_users == null)
      _initAdding_usersProxy();
    return adding_users;
  }
  
  public void main() throws java.rmi.RemoteException{
    if (adding_users == null)
      _initAdding_usersProxy();
    adding_users.main();
  }
  
  public void creating_user() throws java.rmi.RemoteException{
    if (adding_users == null)
      _initAdding_usersProxy();
    adding_users.creating_user();
  }
  
  
}