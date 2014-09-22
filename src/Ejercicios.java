
public class Ejercicios {
	//con el return devolvemos el valor del arreglo 
	//Devuelve el valor almacenado en el indice posicion
	static int obtenerValor(int arreglo[], int posicion)
	{
		return arreglo[posicion];
	}
	//con el return obtenemos la posicion dentro del arreglo
	//Devuelve el valor almacenado en el indice posicion
	static String obtenerValor(String arreglo[], int posicion)
	{
		return arreglo[posicion];
	}
	//lo hacemos con el ciclofor para obtener la suma del arreglo
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
	//declaramos la variable promedio luego realizamos un ciclo para obtener el promedio
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
	//primero colocacmos un ciclo con la condicion if ponemos si el valor del arreglo esta	
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
