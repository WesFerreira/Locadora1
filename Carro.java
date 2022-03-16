package loja;

public class Carro {
	
	private String placa;
	private double potencia;
	private String modelo;
	private String cor;
	private String marca;
	private boolean cambio_automatico; 
	private int ano;
	private float preco;
	
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isCambio_automatico() {
		return cambio_automatico;
	}

	public void setCambio_automatico(boolean cambio_automatico) {
		this.cambio_automatico = cambio_automatico;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Carro (String placa, double potencia, String modelo, 
			String cor, String marca, boolean cambio_automatico, int ano, float preco) {
	
		this.placa = placa;
		this.potencia = potencia;
		this.modelo = modelo;
		this.cor = cor;
		this.marca = marca;
		this.cambio_automatico = cambio_automatico;
		this.ano = ano;
		this.preco = preco;
		
	}
	
	
	public static void main(String[] args) {
		Carro c1 = new Carro("DXW-6952", 1.0, "FOX", "Vermelho", "Volkswagem", false, 2008, (float) 20000.0);
		
		System.out.println("Placa: " + c1.placa + "\n" + "Potencia: " + c1.potencia + "\n" + "Modelo: " + c1.modelo + "\n" + "Cor: " + c1.cor 
				+ "\n" + "Marca" + c1.marca + "\n" + "Cambio Automático: " + c1.cambio_automatico + "\n" + "Ano: " + c1.ano + "\n" +
				"Preço: " + c1.preco + "\n");
		
			
			Cliente cliente1 = new Cliente();
			cliente1.setNome("Vilson");
			cliente1.setCpf("456963258-52");
			cliente1.setTelefone("36985-5421");
			cliente1.setEmail("vilson.email.com");
			
			System.out.println("Nome: " + cliente1.getNome()+ "\n" + "CPF: " + cliente1.getCpf() + "\n"
					+ "Telefone: " + cliente1.getTelefone() + "\n" + "Email: " + cliente1.getEmail() + "\n");	
		
			
			Funcionario f1 = new Funcionario();
				
			f1.setNome("Cristiano");
			f1.setTelefone("98526-2563");
			f1.setCpf("4563221125-54");
			f1.setEmail("cristiano@locadora.com");
			f1.setCargo("vendedor"); 
					
			System.out.println("Vendedor: " + f1.getNome()+ "\n" + "Cargo: " + f1.getCargo() + "\n" + "CPF: " + f1.getCpf() + "\n"
			+ "Telefone: " + f1.getTelefone() + "\n" + "Email: " + f1.getEmail());	
		

	}
	

	
	
}	

	

