 public class FrequenciaCardiaca 
{
	private String nome, sobrenome;
	private int dia,mes,ano;
	
	public FrequenciaCardiaca(String nome, String sobrenome, int dia, int mes, int ano)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void info()
	{
		System.out.println("FICHA: \n"
				+ "NOME PACIENTE: " + getNome() + " " + getSobrenome()+
				"\nDATA NASCIMENTO: " + getDia()+" " + getMes()+ " " + getAno()+ 
		"\nSUA FREQUENCIA CARDIACA E: "+ FrequenciaCardiacaMaxima());
		FrequenciaCardiacaAtual();
	}
	
	public int CalculaIdade()
	{	
		int idade = 2021 - getAno();
		return idade;
	}
	
	public int FrequenciaCardiacaMaxima()
	{	
		return 220 - CalculaIdade();
	}
	
	public void FrequenciaCardiacaAtual()
	{
		double a = (FrequenciaCardiacaMaxima() * 0.50);
		double b = (FrequenciaCardiacaMaxima() * 0.85);
		System.out.println("Sua frequencia cardiaca esta entre: " + (a) + " a " + String.format("%.2f", b));;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	

}
