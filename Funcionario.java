package loja;
// Atributos herdados da Classe mâe Cliente
public class Funcionario extends Cliente {

	
	private String cargo;
	
	public void Cliente(String cargo) {
		
		this.cargo = cargo;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public static void main(String[] args) {
		
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