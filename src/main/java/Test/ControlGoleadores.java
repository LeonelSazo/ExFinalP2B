package Test;

import Datos.Conexion1;
import java.sql.*;
import Datos.GoleadoresJDBC;
import Dominio.GoleadoresDTO;
import com.example.exfinalp2b.MainActivity;

public class ControlGoleadores {



    public static void crear() throws SQLException{


        Connection conexion = null;

        try {
            conexion = Conexion1.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }




            GoleadoresDTO nuevogoleador = new GoleadoresDTO();
            nuevogoleador.setId_jugador(IdJuador2);
            nuevogoleador.setJugadro(Jugador2);
            nuevogoleador.setPart_jugados(partidos2);
            nuevogoleador.setGoles(goles2);
            jugadoresjdbc.insert(nuevogoleador);

            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }return crear();

    public static void Actualizar() throws SQLException{


        Connection conexion = null;

        try {
            conexion = Conexion1.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            GoleadoresJDBC jugadoresjdbc = new GoleadoresJDBC(conexion);

            GoleadoresDTO cambioGoleador = new GoleadoresDTO();
            cambioGoleador.setId_jugador(IdJugador2);
            cambioGoleador.setJugadro(Jugador_2);
            cambioGoleador.setPart_jugados(partidos2);
            cambioGoleador.setGoles(goles2);
            jugadoresjdbc.update(cambioGoleador);



            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }

}
