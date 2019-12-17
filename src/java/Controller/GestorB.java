/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Area;
import Model.DTO_SueldoPagar;
import Model.DTO_extra;
import Model.Empleado;
import Model.Reporte1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author Lucia
 */
public class GestorB {
    private static final String conexion="jdbc:sqlserver://DESKTOP-A5KQF7B:1433;databaseName=ExamenProg3_109302";
    private static final String usu="sa";
    private static final String psw="1234";
    Connection con;
    
    public void abrirConexion(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//si agrego esta linea me dice agrega no classexceptions
            con =DriverManager.getConnection(conexion,usu, psw);
        } catch (SQLException e) {
            System.out.println("error conexion"+e);
            e.printStackTrace();
    }    catch (ClassNotFoundException ex) {
        // Logger.getLogger(GestorB.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("error en la clase");
                        

         }
    }
      public ArrayList<Area> allAreas()   {
          
          ArrayList<Area> lista = new ArrayList<>();
        try {
            abrirConexion();//sino esta el notfoundexception da error y pide agregarlo o sea importarlo!!!
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from Area");
            while (rs.next()) {                
                int id = rs.getInt("idArea");
                String den = rs.getString("denominacion");
                Area a = new Area(id,den);
                lista.add(a);
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error en traer areas"+e);
        }
        return lista;
      }
         public ArrayList<DTO_SueldoPagar>allSueldoPagar(){
             ArrayList<DTO_SueldoPagar> lista = new ArrayList<>();
        try {
            abrirConexion();
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery("SELECT nombre,(sueldoBasico*0.05) * (YEAR(GETDATE())- ingreso) + sueldoBasico as Monto FROM Empleado");
            while (rs.next()) {                
                String n = rs.getString("nombre");
                float s = rs.getFloat("Monto");
                DTO_SueldoPagar dto = new DTO_SueldoPagar(n,s);
                lista.add(dto);
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error en traer DTO"+e);
        }
        return lista;
             
         }
    //agregar
         
    public boolean  addEmpleado(Empleado a){
        boolean flag = false;
        try {
            abrirConexion();
            PreparedStatement pstm = con.prepareStatement("INSERT INTO EMPLEADO VALUES(?,?,?,?)");
            pstm.setFloat(1,a.getSueldoBasico());//llevo lo ingresaso a las vbles
            pstm.setInt(2, a.getIdArea());
            pstm.setString(3,a.getNombre());
            pstm.setInt(4, a.getIngreso());
            pstm.executeQuery();//ejecuto
            //cierro
            pstm.close();
            con.close();
            //bandera
            flag = true;
            
        } catch (SQLException e) {
            System.out.println("Error en el alta"+e);
        }
        return flag;    
    }     
    public boolean addArea(Area a){
        boolean flag = false;
        try {
            abrirConexion();
            PreparedStatement pstm = con.prepareStatement("insert into Area values(?)");
            pstm.setString(1,a.getDenominacion());
            pstm.executeQuery();
            
            pstm.close();
            con.close();
            
            flag = true;
            
        } catch (SQLException e) {
            System.out.println("Error en agregar area" +e);
        }
       return flag; 
    }
 
         public ArrayList<Reporte1> mostrarReporte1()   {
          
          ArrayList<Reporte1> lista = new ArrayList<>();
        try {
            abrirConexion();//sino esta el notfoundexception da error y pide agregarlo o sea importarlo!!!
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(idEmpleado) as Cantidad,SUM(sueldoBasico) AS Sueldo, a.denominacion FROM EMPLEADO E  JOIN AREA A  ON E.idArea=A.idArea\n" +
"GROUP BY a.denominacion");
            while (rs.next()) {                
                int cant = rs.getInt("Cantidad");
                float s = rs.getFloat("sueldo");
                String area = rs.getString("denominacion");
                Reporte1 a = new Reporte1(cant,s,area);
                lista.add(a);
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error en traer Reporte"+e);
        }
        return lista;
      } 
    //DTO_extra Lista el nombre del empleado, el area a la que pertenece y el año en el que ingreso
    //los valores no son calculados, entonces los "" coinciden con los nombres de los atributos de la clase DTO     
   public ArrayList<DTO_extra> allDTO_extra(){
       ArrayList<DTO_extra> lista = new ArrayList<>();
       try {
           abrirConexion();
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("select E.nombre,A.denominacion, ingreso from Empleado E join Area A on E.idArea = A.idArea order by ingreso");
           while (rs.next()) {   
               String n = rs.getString("nombre");
               String d = rs.getString("denominacion");
               int a = rs.getInt("ingreso");
               DTO_extra dto = new DTO_extra(n,d, a);
               lista.add(dto);
         //cierro todo afuera
           }
           st.close();
           rs.close();
           con.close();
           
       } catch (SQLException e) {
           System.out.println("Error en listar DTO_extra"+ e);
       }
       return lista;
   }      
}
