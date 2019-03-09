public class Robot{
	private Estado estado;

	public Robot(){
		estado = new Apagado(this);
	}

	public Estado getEstado(){
		return estado;
	}

	public void setEstado(Estado estado){
		estado = this.estado;
		System.out.println(estado);
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
