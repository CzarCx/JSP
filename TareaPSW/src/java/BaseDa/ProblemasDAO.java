/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package BaseDa;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Problemas.Problema1;
import Problemas.Problema5;
import Problemas.Problema8;

public class ProblemasDAO {
    
    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    Conexion cn= new Conexion();

    public List consultarUno() {
   
        ArrayList<Problema1> list= new ArrayList<>();
        String sql="select * from probllemauno";//el nombre de tu tabla
        try {
            con=cn.getConnection();
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while(rs.next()){
                Problema1 proUn= new Problema1();

                proUn.setCapital(rs.getInt("dinero"));
                proUn.setNombre(rs.getString("nombre"));
                proUn.setTotal(rs.getInt("total"));
                list.add( proUn);
                System.out.println("Id");
            }
            
            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
        return list;
    }
    
    public List consultarCin() {
   
        ArrayList<Problema5> list= new ArrayList<>();
        String sql="select * from problemacinco";//el nombre de tu tabla
        try {
            con=cn.getConnection();
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while(rs.next()){
                Problema5 proCin= new Problema5();
                proCin.setPorcH(rs.getInt("procentajeH"));
                proCin.setPorcM(rs.getInt("porcentajeM"));
                proCin.setnHombres(rs.getInt("numeroH"));
                proCin.setnMujeres(rs.getInt("numeroM"));
                proCin.setGrupo(rs.getString("grupo"));
                list.add(proCin);
                System.out.println("Id");
            }
            
            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
        return list;
    }
    
    public List consultarOcho() {
   
        ArrayList<Problema8> list= new ArrayList<>();
        String sql="select * from problemaocho";//el nombre de tu tabla
        try {
            con=cn.getConnection();
            st=con.createStatement();
            rs=st.executeQuery(sql);
            
            while(rs.next()){
                Problema8  proOcho= new Problema8();
                proOcho.setNum1(rs.getInt("nume1"));
                proOcho.setNum2(rs.getInt("nume2"));//los de tu tabla
                proOcho.setNum3(rs.getInt("nume3"));
                proOcho.setMayor(rs.getInt("numemayor"));
                 list.add( proOcho);
                System.out.println("Id");
            }
            
            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
        return list;
    }

    public boolean registrarUn(Problema1 proUn) {
        String sql="insert into probllemauno(nombre,dinero,total)values('"+ proUn.getNombre()+"','"+ proUn.getCapital()+"','"+ proUn.getTotal()+"')";
        try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
        }catch(Exception e){
            System.err.println("Error"+e);
        }
        return false;
    }
    public boolean registrarCin(Problema5 proCin) {
        String sql="insert into problemacinco(grupo,numeroH,numeroM,procentajeH,porcentajeM)values('"+ proCin.getGrupo()+"','"+ proCin.getnHombres()+"','"+ proCin.getnMujeres()+"','"+ proCin.getPorcH()+"','"+ proCin.getPorcM()+"')";
        try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
        }catch(Exception e){
            System.err.println("Error"+e);
        }
        return false;
    }
    
    public boolean registrarOcho(Problema8  proOcho) {
        System.out.println("hola");
        String sql="insert into problemaocho(nume1,nume2,nume3,numemayor)values('"+ proOcho.getNum1()+"','"+ proOcho.getNum2()+"','"+ proOcho.getNum3()+"','"+ proOcho.getMayor()+"')";
        try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
        }catch(Exception e){
            System.err.println("Error"+e);
        }
        return false;
    }
}

