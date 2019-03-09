import java.util.Scanner;

public class Consola{

	static Estado estado;
	static Robot robot;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String opcion;

		do{

		System.out.println("Ingresa las intrucción que quieras que realice tu robot.\n" +
												"Puedes elegir entre las siguientes:\n" +
												"   caminar\n" + "   cocinar\n" + "   apagar\n" + "   encender\n" +
												"Nota: Por el momento tu robot se encuentra apagado.\n");

		opcion = sc.nextLine();
		Robot robot = new Robot();

		switch (opcion) {
			case "estado":
				robot.getEstado();
			case "caminar":
				robot.camina();
			case "cocinar":
				robot.cocina();
			case "apagar":
				robot = new Robot();
				robot.apagar();
			case "encender":
				robot.encender();
		}
	}while(opcion != null);

	}
}
