



	import java.io.File;
	import java.io.IOException;

	public class crearDirectorio {	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			File miDirectorio=new File("src/miDirectorio");
			File miFichero=new File("src/miDirectorio/miFichero.txt");
			
			
			try {
				miDirectorio.mkdirs();
			if(miDirectorio.createNewFile())
				System.out.println("Directorio creado correctamente");
			if(miFichero.createNewFile())
				System.out.println("Fichero creado correctamente");
			else
				System.out.println("ERROR: no se ha podido crear el fichero");
			}catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("FIN PROGRAMA");
		}

	}
