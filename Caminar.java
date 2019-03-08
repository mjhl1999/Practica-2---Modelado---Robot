public class Caminar implements Estado{

	Robot robot;

	public Caminar(Robot robot){
		this.robot = robot;
	}

	@Override
	public void caminar(){
		System.out.println("El robot ya esta caminando.");
	}

	@Override
	public void cocinar(){
		System.out.println("Operación invalida. El robot no puede cocinar mientras esta caminando.");
	}
	
	@Override
	public void apagar(){
		System.out.println("El robot deja de caminar y se apaga.");
		robot.setEstado(new Apagado(robot));
	}

	@Override
	public void encender(){
		System.out.println("El robot ahora esta encendido.");
		robot.setEstado(new Encendido(robot));
	}
}
