Algoritmo Ejercicio13
	
	Definir opc como Entero
	
	Repetir
		
		Escribir "Elija una opci�n:"
		Escribir "1. Suma"
		Escribir "2. Divisi�n"
		Escribir "3. Salir"
		Leer opc
		
		Si opc < 3 Y opc > 0 Entonces
			
			Escribir "Ingrese el primer n�mero:"
			Leer num1
			Escribir "Ingrese el segundo n�mero:"
			Leer num2
			
			Si opc = 1 Entonces
				resultado <- num1 + num2
				Escribir "El resultado de la suma es: " resultado
			Fin Si
			
			Si opc = 2 Entonces
				Si num2 = 0 Entonces
					Escribir "No se puede dividir entre 0"
				SiNo
					resultado <- num1 / num2
					Escribir "El resultado de la divisi�n es: " resultado
				Fin Si	
			Fin Si

		Fin Si
		
	Hasta Que opc = 3
	
FinAlgoritmo
