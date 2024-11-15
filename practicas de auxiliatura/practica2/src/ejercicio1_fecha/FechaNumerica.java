package ejercicio1_fecha;

import java.util.Scanner;

public class FechaNumerica {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Introduce una fecha :");
			String fechaEntrada = scanner.nextLine();
			
			try {
			    String fechaFormateada = convertirFecha(fechaEntrada);
			    System.out.println("Fechsa en formato numérico: " + fechaFormateada);
			} catch (Exception e) {
			    System.out.println("Error: " + e.getMessage());
			}
		}
    }
    
    public static String convertirFecha(String fechaTexto) throws Exception {
        String[] meses = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio", 
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };
        
        String[] partesFecha = fechaTexto.split(" ");
        if (partesFecha.length != 4) {
            throw new Exception("Formato de fecha incorrecto.");
        }
        
        int dia;
        try {
            dia = Integer.parseInt(partesFecha[0]);
        } catch (NumberFormatException e) {
            throw new Exception("El día debe ser un número.");
        }
        
        String mesTexto = partesFecha[2].toLowerCase().replace(",", "");
        int mes = -1;
        for (int i = 0; i < meses.length; i++) {
            if (mesTexto.equals(meses[i])) {
                mes = i + 1;
                break;
            }
        }
        if (mes == -1) {
            throw new Exception("Mes inválido.");
        }
        
        int anio;
        try {
            anio = Integer.parseInt(partesFecha[3]);
        } catch (NumberFormatException e) {
            throw new Exception("El año debe ser un número.");
        }

        // Validación de días del mes y años bisiestos
        if (!esFechaValida(dia, mes, anio)) {
            throw new Exception("Fecha inválida.");
        }
        
        // Formato final de la fecha
        return String.format("%02d/%02d/%d", dia, mes, anio);
    }

    public static boolean esFechaValida(int dia, int mes, int anio) {
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Verificación de año bisiesto
        if (mes == 2 && esBisiesto(anio)) {
            diasMes[1] = 29;
        }
        
        return dia > 0 && dia <= diasMes[mes - 1];
    }

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
}