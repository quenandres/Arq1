<%-- 
    Document   : menu
    Created on : Sep 7, 2015, 2:22:18 PM
    Author     : Administrator
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table style="width: 100%;">
    <tr>
        <td  style="align: right; font-family: Verdana,sans-serif;font-size: 30px;text-align: center;color: #8AC007;white-space: nowrap;"> 
            Estampate
        </td>
    </tr>
</table>
<style>
    a{
        padding: 10px;
    }

    body {
        margin:0;
        padding:0;
        font-family: Sans-Serif;
        line-height: 1.5em;
    }
</style>

<table>
    <tr>
        <td> 
            <c:choose>

                <c:when test="${empty usuario}">
                    <a href="<c:url value='/'/>">Home</a>
                    <a href="<c:url value='/login'/>">
                        Autenticar
                    </a>
                    <a href="<c:url value='/Catalogo'/>" >
                        Catalogo de Estampados
                    </a>   
                </c:when>
                <c:otherwise><c:choose>
                        <c:when test="${usuario.usuario eq 'admin'}">
                            <a href="<c:url value='/BackEnd/usuarios'/>" >
                                Usuarios
                            </a> 
                            <a href="<c:url value='/BackEnd/tematicas'/>" >
                                Temas
                            </a> 
                        </c:when>
                        <c:otherwise>
                            <c:if   test="${not empty usuario.artistas}">
                                <a href="<c:url value='/Artistas/estampados'/>" >
                                    Estampados
                                </a>    
                                <a href="<c:url value='/Artistas/Perfil'/>" >
                                    Perfil
                                </a>    
                            </c:if>
                            <c:if   test="${not empty usuario.clientes}">
                                <a href="<c:url value='/Catalogo'/>" >
                                    Catalogo de Estampados
                                </a>    
                                <a href="<c:url value='/Perfil'/>" >
                                    Perfil
                                </a>    
                            </c:if>
                        </c:otherwise>
                    </c:choose>
                    <a href="<c:url value='/salir'/>" >
                        logout</a> 
                    </c:otherwise>
                </c:choose>
        </td>
        <td> 

        </td>
    </tr>
</table>