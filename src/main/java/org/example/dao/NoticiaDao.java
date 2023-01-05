package org.example.dao;

import org.example.model.Noticia;

import java.sql.SQLException;
import java.util.List;

public interface NoticiaDao {
    long adicionar(Noticia noticia) throws SQLException;
    Noticia alterar(Noticia noticia) throws SQLException;
    boolean apagar(long id) throws SQLException;
    List<Noticia> listar() throws SQLException;
    Noticia ler(long id) throws SQLException;
}
