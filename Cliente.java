package loja;

public class Cliente {
	// Atributos
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Vilson");
		cliente1.setCpf("456963258-52");
		cliente1.setTelefone("36985-5421");
		cliente1.setEmail("vilson.email.com");
		
		System.out.println("Nome: " + cliente1.getNome()+ "\n" + "CPF: " + cliente1.getCpf() + "\n"
				+ "Telefone: " + cliente1.getTelefone() + "\n" + "Email: " + cliente1.getEmail());	

		
	}	
	
}