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
		
		try {
			archivo = new File("C:\\Users\\Familia\\Documents\\Adrian\\CAPACITACION_JAVA\\etapa6\\evidencia6\\AOR.txt");//Crea el archivo en la dirección proporcionada, junto con el nombre que se proporciono.
			if(archivo.createNewFile()){
				System.out.println("El archivo fue creado");
			} else{
				System.out.println("El archivo NO fue creado");
			}
			String nombre = "Adrián Ordaz Ruiz";
			fw = new FileWriter(archivo);
			salida = new PrintWriter(fw);
			salida.println(nombre);//guardamos texto en la variable de salida
			salida.flush();//escribe lo guardado en la variable salida​
		}catch(Exception e) {
			System.out.println(e.toString());
		}finally{
			salida.close();
		}
		
		try {
			archivo = new File("C:\\Users\\Familia\\Documents\\Adrian\\CAPACITACION_JAVA\\etapa6\\evidencia6\\AOR.txt");
			fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String line = "";
            System.out.println("Impresion de contenido: ");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
		}catch(Exception e) {
			System.out.println(e.toString());
		}finally {
			try {
                fr.close();
            } catch (IOException e) {
                System.out.println("No se pudo cerrar el archivo. "+e.toString());
            }
		}
	}

}
