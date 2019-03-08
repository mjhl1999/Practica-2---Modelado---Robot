public class Apagado implements Estado{

	Robot robot;

	public Apagado(Robot robot){
		this.robot =  robot;
	}

	@Override
	public void caminar(){
		System.out.println("Operación invalida. El robot no puede caminar mientras esta apagado.");
	}

	@Override
	public void cocinar(){
		System.out.println("Operación invalida. El robot no puede cocinar mientras esta apagado.");
	}

	@Override
	public void apagar(){
		System.out.println("El robot ya esta apagado.");
	}

	@Override
	public void encender(){
		System.out.println("El robot ahora esta encendido.");
		robot.setEstado(new Encendido(robot));
	}
}
