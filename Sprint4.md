

## Diagrama de casos de uso 1
![](https://i.imgur.com/Xpk6mOm.png)
### Ficha técnica 1
|        **Nombre**        |     Mejorar la Cuenta del Cliente       	|
|----------------|-------------------------------|
|	**Autor**	|		Rafael Oliva Ramírez		|
|            **Fecha**         |      20/05/2020                       	|
|             **Descripción**    | Mejora la cuenta del usuario. Tras la mejora de la cuenta aumentará de rango. |
|**Actores**|Usuario No registrado, Usuario Logueado y Usuario no Logueado |    
|**Precondiciones**|Antes el usuario debe estar logueado y registrado correctamente.|
**Flujo Normal:** 
1.  El usuario pulsara el botón “Upgrade”.			
2.  El botón le llevará a una página donde elegirá los diferente rangos, con diferentes precios.
3.  El usuario elige un rango y le da al botón”Comprar”
4.  La app le pedirá el Paypal o la Tarjeta de Crédito.Y realizará el pago.
5.  El usuario le da al Botón”Realizar Compra”. Le llegara un correo informando de que ha realizado la compra.
6.  Se mejora el rango de la cuenta, le saltara un Popup diciendo”Compra Realizada”           
**Flujo Alternativo:**
-   6-A: Si la Tarjeta de crédito son erróneas le mostrará un mensaje diciendo”La tarjeta de crédito no existe.” Le dará otro intento.
-   6-B: Si el usuario lo hace con Paypal, le llevará a la página de paypal para loguearse.Y realizar el pago.

 **Poscondiciones:** Se almacenera el tipo de rango, el nombre del usuario y el Paypal o la Tarjeta de crédito en la base de datos.


## Diagrama de casos de uso 2
![](https://i.imgur.com/kriiqwF.png)
### Ficha técnica 2
|        **Nombre**        |     Cambiar la Foto de Perfil      	|
|----------------|-------------------------------|
|	**Autor**	|		Rafael Oliva Ramírez		|
|            **Fecha**         |      20/05/2020                       	|
|             **Descripción**    | Editar el perfil del usuario. |
|**Actores**|Usuario No Logueado, Usuario Logueado |    
|**Precondiciones**|Antes el usuario debe estar logueado y registrado correctamente.|
**Flujo Normal:** 
1. El usuario pulsara el boton"Editar perfil" que estara arriba a la derecha .		
2.  El botón le llevará a una página donde podra Cambiar la foto de perfil, cambiar el nombre del usuario y cambiar la contraseña.
3.  El usuario le dara al boton"Cambiar foto de Perfil."
4.  La app le pedirá una foto.
5.  El usuario le introduce una imagen, tiene que ser Png o Jpeg.
6. El usuario le dara al boton"Aplicar". 
7. El usuario le dara al boton "Aceptar".
8. El usuario ya se le ha cambiado la foto de perfil.        
**Flujo Alternativo:**
-  5-A: Si la imagen que el usuario ha introducido es no es jpg o png, no se insertara la imagen.

 **Poscondiciones:** Se almacenera la imagen del perfil de usuario en la base de datos.
 


