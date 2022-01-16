package evidencia6;

import java.io.*;

public class ArchivoAOR {

	public static void main(String[] args) {
		//Instancia a los objetos con los que podremos crear, abrir, leer archivos.
		File archivo = null;//Abre y/o crea archivos.
		FileReader fr = null;//Lee el archivo.
		BufferedReader br = null;//Lee el contenido, línea por línea del archivo.
		FileWriter fw = null;//Abre el archivo en modo escribir.
		PrintWriter salida = null;//Escribe el mensaje en el archivo.
		
		try {//Bloque donde se realizará el proceso de creación del archivo, a su vez, introducir texto en él.
			archivo = new File("C:\\Users\\Familia\\Documents\\Adrian\\CAPACITACION_JAVA\\etapa6\\evidencia6\\AOR.txt");//Crea el archivo en la dirección proporcionada, junto con el nombre que se proporciono.
			if(archivo.createNewFile()){//Este condicional sirve para saber si se creo un archivo o no.
				System.out.println("El archivo fue creado");
			} else{
				System.out.println("El archivo NO fue creado");
			}
			String nombre = "Adrián Ordaz Ruiz";//Texto que vendrá dentro del archivo.
			fw = new FileWriter(archivo);//Abre el archivo en modo edición.
			salida = new PrintWriter(fw);//Se le pasa como parámetro el archivo donde se escribirá el texto.
			salida.println(nombre);//guardamos texto en la variable de salida
			salida.flush();//escribe lo guardado en la variable salida​
		}catch(Exception e) {//Posible error
			System.out.println(e.toString());
		}finally{
			salida.close();//Cierra el modo edición del archivo.
		}
		
		try {//Bloque donde se abre el archivo en modo lectura y leemos el contenido.
			archivo = new File("C:\\Users\\Familia\\Documents\\Adrian\\CAPACITACION_JAVA\\etapa6\\evidencia6\\AOR.txt");//Busca el archivo con ese nombre, en esa dirección.
			fr = new FileReader(archivo);//Abre el archivo en modo lectura.
            br = new BufferedReader(fr);//Lee línea por líena el archivo.
            String line = "";
            System.out.println("Impresion de contenido: ");
            while ((line = br.readLine()) != null) {//Ciclo donde, leemos linea por linea, si hay una linea vacia la imprimimos hasta que encontremos texto.
                System.out.println(line);//Imprimimos linea por linea.
            }
		}catch(Exception e) {
			System.out.println(e.toString());
		}finally {
			try {
                fr.close();//Cierra el modo lectura del archivo.
            } catch (IOException e) {
                System.out.println("No se pudo cerrar el archivo. "+e.toString());
            }
		}
	}

}
