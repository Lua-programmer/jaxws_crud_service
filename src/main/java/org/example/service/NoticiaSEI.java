package org.example.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;
import org.example.model.Noticia;

import java.util.List;

@WebService //diz que essa interface será de serviço
@SOAPBinding(style = Style.DOCUMENT) //diz que os métodos que vão estar disponíveis são do tipo objeto Java
public interface NoticiaSEI {
    //todos esses métodos podem ser solicitados por uma aplicação externa pois está anotado com @WebMethod

    @WebMethod
    public long adicionar(Noticia noticia);

    @WebMethod
    public Noticia alterar(Noticia noticia);

    @WebMethod
    public boolean apagar(long id);

    @WebMethod
    public List<Noticia> listar();

    @WebMethod
    public Noticia ler(long id);

}
