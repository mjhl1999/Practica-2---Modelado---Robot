public class Cocinar implements Estado{

	Robot robot;

	public Cocinar(Robot robot){
		this.robot = robot;
	}

	@Override
	public void caminar(){
		System.out.println("Operación invalida. El robot no puede caminar mientras esta cocinando.\n");
	}

	@Override
	public void cocinar(){
		System.out.println("El robot ya esta cocinando.\n");
	}
	@Override
	public void apagar(){
		System.out.println("El robot deja de cocinar y se apaga.\n");
		robot.setEstado(new Apagado(robot));
	}

	@Override
	public void encender(){
		System.out.println("El robot ahora esta encendido.\n");
		robot.setEstado(new Encendido(robot));
	}
}
