package POOexercicios;

public class Funcionario {
	private	 String nome;
	private  String idade;
	private  String estadoCivil;
	private	 String	filhos;
	private	 String	tempoDeCasa;

	public Funcionario(String nome, String idade, String estadoCivil, String filhos, String tempoDeCasa) {
		this.nome = nome;
		this.idade = idade;
		this.estadoCivil = estadoCivil;
		this.filhos = filhos;
		this.tempoDeCasa = tempoDeCasa;
	
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getFilhor() {
		return filhos;
	}

	public void setFilhor(String filhor) {
		this.filhos = filhos;
	}

	public String getTempoDeCasa() {
		return tempoDeCasa;
	}

	public void setTempoDeCasa(String tempoDeCasa) {
		this.tempoDeCasa = tempoDeCasa;
	}{
		
	}

	public void imprintInfo() {
			System.out.println("\nNome do funcionarie: "+nome+"\nIdade:"+idade+"\nEstado cívil:"+estadoCivil+"\nPossuí filhos:"+filhos+"\nTempo de casa:"+tempoDeCasa+"");
	}


}

