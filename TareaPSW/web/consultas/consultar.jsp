<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Problemas.Problema1"%>
<%@page import="Problemas.Problema5"%>
<%@page import="Problemas.Problema8"%>
<%@page import="BaseDa.ProblemasDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultas JSP</title>
    </head>
    <body>
        <h1>Consultar Problemas</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Dinero Depositado</th>
                    <th>Dinero con Interes</th>
                </tr>
            </thead>
            <%
                ProblemasDAO proD=new ProblemasDAO();
                List<Problema1>list=proD.consultarUno();
                Iterator<Problema1>iter=list.iterator();
                Problema1 proUn=null;
                while(iter.hasNext()){
                    proUn=iter.next();
                %>
            <tbody>
                <tr>
                    <td><%=proUn.getNombre()%></td>
                    <td><%=proUn.getCapital()%></td>
                    <td><%=proUn.getTotal()%></td>
                </tr>
                <%}%>
            </tbody>
        </table>
            <table border="1">
                <thead>
                    <tr>
                        <th>Grupo</th>
                        <th>Numero de Hombres</th>
                        <th>Numero de Mujeres</th>
                        <th>Porcentaje de hombres</th>
                        <th>Porcentaje de mujeres</th>
                    </tr>
                </thead>
                <%
                List<Problema5>lista=proD.consultarCin();
                Iterator<Problema5>itera=lista.iterator();
                Problema5 proCin=null;
                while(itera.hasNext()){
                    proCin=itera.next();
                %>
                <tbody>
                    <tr>
                        <td><%=proCin.getGrupo()%></td>
                        <td><%=proCin.getnHombres()%></td>
                        <td><%=proCin.getnMujeres()%></td>
                        <td><%=proCin.getPorcH()%></td>
                        <td><%=proCin.getPorcM()%></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
                <table border="1">
                    <thead>
                        <tr>
                            <th>Numero 1</th>
                            <th>Numero 2</th>
                            <th>Numero 3</th>
                            <th>Numero Mayor</th>
                        </tr>
                    </thead>
                    <%
                    ProblemasDAO proDa=new ProblemasDAO();
                    List<Problema8>listas=proD.consultarOcho();
                    Iterator<Problema8>iteras=listas.iterator();
                    Problema8 proOcho=null;
                    while(iteras.hasNext()){
                        proOcho=iteras.next();
                    %>
                    <tbody>
                        <tr>
                            <td><%=proOcho.getNum1()%></td>
                            <td><%=proOcho.getNum2()%></td>
                            <td><%=proOcho.getNum3()%></td>
                            <td><%=proOcho.getMayor()%></td>
                        </tr>
                    <%}%>    
                    </tbody>
                </table>

    </body>
</html>