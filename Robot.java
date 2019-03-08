public class Robot{
	private Estado estado;

	public Robot(){
		estado = new Apagado(this);
	}

	public void setEstado(Estado estado){
		estado = this.estado;
	}

	public void camina(){
		estado.caminar();
	}

	public void cocina(){
		estado.cocinar();
	}

	public void apagar(){
		estado.apagar();
	}

	public void encender(){
		estado.encender();
	}

}
