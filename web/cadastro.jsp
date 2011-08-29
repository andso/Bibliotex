
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1>Cadastro de Livros</h1>
        
        
        <table width=60% bgcolor=lightblue border=0 CELLPADDING=10>
        
        <FORM METHOD=post action=save_book.jsp>
  
          <tr>
             <td>
                Obra: <input type="text" name="obra" value=""/>
             </td>
             <td BGCOLOR=>
                Autor: <input type="text" name="autor" value=""/>    
             </td>
            <td>
             <select NAME="Tipo">
                  <OPTION>Livro
                  <OPTION>Revista
                  <OPTION>Jornal
                  <OPTION>Artigo
                  
              </select>
            </td>
            <td>
               <input type="submit"> 
            </td>
          </tr>
 
     </form>
    </table>

<!--        
             <form action="functions.jsp" method="GET">
                    <input type="text" name="Obra" value=""/>
                     <input type="text" name="Autor" value=""/>
         
        
                           
             </form>
-->
    </body>
</html>
