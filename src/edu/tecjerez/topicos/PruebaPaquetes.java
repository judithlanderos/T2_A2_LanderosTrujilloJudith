
/* PAQUETES EN JAVA
*
*Son DIRECTORIOS sin comprimir dentro de un proyecto y que cotienen basicamente archivos tipo BYTECODE
*para la ejecucion de programas en Java
*
*Contienen imagenes, sonido, iconos, documentos, etc...
*
*Estructura de paquetes se utiliza un convencion:
*               -Dominio del sitio web de la institucion/empresa, pero a la inversa
*                EJEMPLO:
*                         -DOMINIO web: tecjerez.edu.mx 
*                         -PAQUETE:     edu.tecjerez.nombrePaquete
*                                       edu.tecjerez.topicos.modelo
*                                       
*                                       
*Cuando se crean paquetes se deben indicar con la palabra reservada PACKAGE como primer linea del codigo fuente 
*
*                        modificadores de acceso 
*/ 
package edu.tecjerez.topicos; //creo paquete en src cambio nombre 

import edu.tecjerez.topicos.vista.VentanaInicio;

import javax.swing.SwingUtilities;
import javax.swing.event.*;

public class PruebaPaquetes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
		
	}
}
