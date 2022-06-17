<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <head>
        <meta charset='utf-8'>
        <link rel="icon" href=
                "https://assets.website-files.com/60b56cdf18d38e15ce088579/60c111551dc75d6dc896a30e_pucp-favicon.png"
              type="image/x-icon">
        <meta name='viewport' content='width=device-width, initial-scale=1'>
        <title>Inicio-Cinestudiar</title>
        <link href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css' rel='stylesheet'>
        <link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.0.3/css/font-awesome.css' rel='stylesheet'>
        <link rel="stylesheet" href="carritocomprasvacio.css" media="screen" title="no title" charset="utf-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
    </head>
           <body background="Cabecera_registro/fondo_registro.jpg">
               <!-- para que funcion deben colocar el enctype y el metodo post en el formulario-->

            <form class="user" method="POST" action="<%=request.getContextPath()%>/UsuarioServlet?action=añadir" enctype="multipart/form-data">
               <!-- Nombre completo-->
               <div class="form-group">
                   <input type="text" class="form-control form-control-user" id="nombre"
                          placeholder="Nombres" name="nombre">
               </div>
               <!-- Apellido completo-->
               <div class="form-group">
                   <input type="text" class="form-control form-control-user" id="apellidos"
                          placeholder="Apellidos" name="apellido">
               </div>
               <!-- DNI--->
               <div class="form-group">
                   <input type="text" class="form-control form-control-user" id="exampleDNI"
                          placeholder="DNI" name="dni">
               </div>
               <!-- Código-->
               <div class="form-group">
                   <input type="text" class="form-control form-control-user" id="exampleCodigo"
                          placeholder="Código PUCP" name="codigo_pucp">
               </div>
               <!-- Correo-->
               <div class="form-group">
                   <input type="email" class="form-control form-control-user" id="exampleInputEmail"
                          placeholder="Correo" name="correo">
               </div>
               <!-- Dirección de domicilio-->
               <div class="form-group">
                   <input type="text" class="form-control form-control-user" id="exampleFirstName"
                          placeholder="Dirección de domicilio" name="direccion">
               </div>
               <!-- Número de Celular-->
               <div class="form-group">
                   <input type="integrity" class="form-control form-control-user"
                          id="exampleInputNumber" placeholder="Numero de Celular"
                   name="telefono">
               </div>

                <!-- Contraseña-->
                <div class="form-group">
                    <input type=”text  ” name="password" />
                </div>
                <!-- Repetir Contraseña-->
                <div class="form-group">
                    <input type=”text  ” name="password" />
                </div>
                </div>
               <!-- Fecha de nacimiento-->
               <label for="start">Fecha de Nacimiento:</label>

               <input type="date" id="start" name="fecha_nacimiento"
                      value="--/--/--"
                      min="1950-01-01" max="2003-01-01">
                <input type="file"  class="btn btn-primary" name="foto">


               <button type="submit" class="btn btn-primary">Crear Usuario</button>
           </form>
           </body>

    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
            integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
            integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
            crossorigin="anonymous"></script>

</html>