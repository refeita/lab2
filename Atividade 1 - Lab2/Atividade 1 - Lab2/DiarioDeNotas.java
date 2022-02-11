public class DiarioDeNotas{
	    private byte nota;
	    private boolean aprovado;
	    private String instrutor;
	    private String curso;
	    
	    public DiarioDeNotas(byte nota){
	        this.nota = nota;
	    } //Construtor que recebe nota
	    
	    public DiarioDeNotas(){
            }

	    public DiarioDeNotas(String curso, String instrutor){
	        this.curso = curso;
	        this.instrutor = instrutor;
	        
	    } //Fim do construtor vazio

	    	    
	    public void exibirMensagem()
	    {
	       System.out.println("Olá, seja bem vindo ao curso de " + this.curso + ", este curso é apresentado por: " +
	                this.instrutor); 
	    }
	    public void setInstrutor(String instrutor)
	    {
	    this.instrutor = instrutor;
	     }
	    
	    
	    public void setNota(byte nota){
	        this.nota = nota;
	    } // Fim do método setNota
	    
	    public String getInstrutor()
	    {
	        return instrutor;
	    }
	    public byte getNota(){
	        return this.nota;
	    } // Fim do método getNota

	    public boolean isAprovado() {
	        return aprovado;
	    }

	    public void setAprovado(boolean aprovado) {
	        this.aprovado = aprovado;
	    }

	} // Fim da classe DiarioDeNotas

