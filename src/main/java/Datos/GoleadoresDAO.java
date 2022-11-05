package Datos;

import Dominio.GoleadoresDTO;
import java.sql.SQLException;
import java.util.List;

public interface GoleadoresDAO {

    public List<GoleadoresDTO> select() throws SQLException;

    public int insert(GoleadoresDTO Goleadores) throws SQLException;

    public int update(GoleadoresDTO Goleadores) throws SQLException;

    public int delete(GoleadoresDTO Goleadores) throws SQLException;


}
