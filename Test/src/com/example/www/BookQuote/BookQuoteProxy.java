package com.example.www.BookQuote;

public class BookQuoteProxy implements com.example.www.BookQuote.BookQuote {
  private String _endpoint = null;
  private com.example.www.BookQuote.BookQuote bookQuote = null;
  
  public BookQuoteProxy() {
    _initBookQuoteProxy();
  }
  
  public BookQuoteProxy(String endpoint) {
    _endpoint = endpoint;
    _initBookQuoteProxy();
  }
  
  private void _initBookQuoteProxy() {
    try {
      bookQuote = (new com.example.www.BookQuote.BookPriceServiceLocator()).getBookPricePort();
      if (bookQuote != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bookQuote)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bookQuote)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bookQuote != null)
      ((javax.xml.rpc.Stub)bookQuote)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.example.www.BookQuote.BookQuote getBookQuote() {
    if (bookQuote == null)
      _initBookQuoteProxy();
    return bookQuote;
  }
  
  public double getBookPrice(java.lang.String isbn) throws java.rmi.RemoteException{
    if (bookQuote == null)
      _initBookQuoteProxy();
    return bookQuote.getBookPrice(isbn);
  }
  
  
}