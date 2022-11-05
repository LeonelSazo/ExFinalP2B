package Datos;

import Dominio.EquiposDTO;
import java.sql.SQLException;
import java.util.List;

public interface EquiposDAO {

    public List<EquiposDTO> select() throws SQLException;

    public int insert(EquiposDTO Equipos) throws SQLException;

    public int update(EquiposDTO Equipos) throws SQLException;

    public int delete(EquiposDTO Equipos) throws SQLException;


}
