public class Encendido implements Estado{

	Robot robot;

	public Encendido(Robot robot){
		this.robot = robot;
	}

	@Override
	public void caminar(){
		System.out.println("El robot ahora esta caminando.\n");
		robot.setEstado(new Caminar(robot));
	}

	@Override
	public void cocinar(){
		System.out.println("El robot ahora esta cocinando.\n");
		robot.setEstado(new Cocinar(robot));
	}

	@Override
	public void apagar(){
		System.out.println("El robot se apaga.\n");
		robot.setEstado(new Apagado(robot));
	}

	@Override
	public void encender(){
		System.out.println("El robot ya esta encendido.\n");
	}
}
