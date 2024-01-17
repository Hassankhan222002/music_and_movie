package music_and_movie_prj;

public class SearchingProxy implements music_and_movie_prj.Searching {
  private String _endpoint = null;
  private music_and_movie_prj.Searching searching = null;
  
  public SearchingProxy() {
    _initSearchingProxy();
  }
  
  public SearchingProxy(String endpoint) {
    _endpoint = endpoint;
    _initSearchingProxy();
  }
  
  private void _initSearchingProxy() {
    try {
      searching = (new music_and_movie_prj.SearchingServiceLocator()).getSearching();
      if (searching != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)searching)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)searching)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (searching != null)
      ((javax.xml.rpc.Stub)searching)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public music_and_movie_prj.Searching getSearching() {
    if (searching == null)
      _initSearchingProxy();
    return searching;
  }
  
  public java.lang.String status() throws java.rmi.RemoteException{
    if (searching == null)
      _initSearchingProxy();
    return searching.status();
  }
  
  public java.lang.String movieName() throws java.rmi.RemoteException{
    if (searching == null)
      _initSearchingProxy();
    return searching.movieName();
  }
  
  public java.lang.String genre() throws java.rmi.RemoteException{
    if (searching == null)
      _initSearchingProxy();
    return searching.genre();
  }
  
  public java.lang.String search_movie(java.lang.String name) throws java.rmi.RemoteException{
    if (searching == null)
      _initSearchingProxy();
    return searching.search_movie(name);
  }
  
  public java.lang.String category() throws java.rmi.RemoteException{
    if (searching == null)
      _initSearchingProxy();
    return searching.category();
  }
  
  
}