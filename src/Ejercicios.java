
public class Ejercicios {
	// bueno en esta tarea de arreglo lo que hacemos es q nos devuelva la posicion,la suma, promedio
	//utilizando el return que tube unos errores en mi tarea anterior y por eso la tube que corregir pero ya me fije q errores tube y ya esta corregida
	//gracias ala ayuda de mi compañero kevin
	//Devuelve el valor almacenado en el indice posicion
	static int obtenerValor(int arreglo[], int posicion)
	{
		return arreglo[posicion];
	}

	//Devuelve el valor almacenado en el indice posicion
	static String obtenerValor(String arreglo[], int posicion)
	{
		return arreglo[posicion];
	}

	//Devuelve la suma de todos los elementos del arreglo
	static int obtenerSuma(int arreglo[])
	{
		int suma = 0;
				for(int a=0; a<arreglo.length;a++)
				{
					suma = suma + arreglo[a];
				}
		return suma;
	}
	
	//Devuelve el promedio de todos los elementos del arreglo
	static int obtenerPromedio(int arreglo[])
	{
		int promedio = 0;
		for(int a= 0; a<arreglo.length;a++)
		{
			promedio = promedio + arreglo[a];
		}
		return promedio = promedio/arreglo.length;
	}
	ponemos un ciclo luego con una condicion if para ver si la condicion existe y nos tire si se cumple o no con verdadero o falso
	//Devuelve true si valor esta 
	static boolean existe(char arreglo[], char valor)
	{
		for(int a = 0; a < arreglo.length; a++)
		{
			if(arreglo[a] == valor)
			{
		return true;
	}
			
			}
				return false;
			}

	//Devuelve true si valor esta 
	static boolean existe(String arreglo[], String valor)
	{
		for(int a =0; a < arreglo.length; a++)
		{
			if(arreglo[a].equals(valor))
			{
				return true;
			}
			}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
