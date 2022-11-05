package Test;

import Datos.Conexion1;
import java.sql.*;
import Datos.EquiposJDBC;
import Dominio.EquiposDTO;
import com.example.exfinalp2b.MainActivity;

public class ControlEquipos {

    public static void crearE() throws SQLException {
        Connection conexion = null;

        try {
            conexion = Conexion1.getConnection();

            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            EquiposJDBC equipoJdbc = new EquiposJDBC(conexion);


            EquiposDTO nuevoequipo = new EquiposDTO();
            nuevoequipo.setId_equipo("E17");
            nuevoequipo.setEquipo("FCToritos");
            nuevoequipo.setPartidos(10);
            nuevoequipo.setGoles_favor(10);
            nuevoequipo.setPuntos(9);
            equipoJdbc.insert(nuevoequipo);

            conexion.commit();
            System.out.println("Se realizo la prueba");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }


    public static void ActualizarE() throws SQLException {
        Connection conexion = null;

        try {
            conexion = Conexion1.getConnection();

            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            EquiposJDBC equipoJdbc = new EquiposJDBC(conexion);

            EquiposDTO cambioEquipo = new EquiposDTO();
            cambioEquipo.setId_equipo("E15");
            cambioEquipo.setEquipo("Petapa");
            cambioEquipo.setPartidos(8);
            cambioEquipo.setGoles_favor(5);
            cambioEquipo.setPuntos(12);
            equipoJdbc.update(cambioEquipo);


            conexion.commit();
            System.out.println("Se realizo la prueba");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }

}
