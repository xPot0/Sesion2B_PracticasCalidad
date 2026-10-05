package Sesion2B;

public class Empleado {
	public enum TipoEmpleado{Vendedor, Encargado};
	
	public static float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		float salarioBase = 0;
		switch(tipo) {
			case Vendedor:
				salarioBase = 2000;
				break;
			case Encargado:
				salarioBase = 2500;
				break;
		}
		if(ventasMes >= 1500)
			salarioBase += 200;
		
		else if(ventasMes >= 1000)
			salarioBase += 100;
		
		salarioBase += horasExtra * 30;
		return salarioBase;
	}
	
	public static float calculoNominaNeta(float nominaBruta) {
		int retencion = 0;
		
		if(nominaBruta >= 2500)
			retencion = 18;
		else if(nominaBruta >= 2100)
			retencion = 15;
		
		return nominaBruta * (1-retencion/100);
	}
}
