package org.example;

import jakarta.xml.ws.Endpoint;
import org.example.service.NoticiaSIB;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String porta = "8088";
        System.out.println("Publicando o serviço na porta: " + porta);
        Endpoint.publish("http://localhost:"+porta+"/noticias", new NoticiaSIB());
        System.out.println("Serviço publicado na porta: " + porta);

    }
}
