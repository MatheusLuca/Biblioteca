package classes;

public class Livro implements InterfaceBiblioteca {

	private String titulo;
	private String autor;
	private int anoPublicacao;
	private boolean disponivel;
	
	public Livro(String titulo, String autor, int anopublicacao) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anopublicacao;
		this.disponivel = false;
	}
	
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
	@Override
    public void emprestar() {
    	if (disponivel) {
    		disponivel = false;
    		System.out.println("Livro " + titulo + " emprestado com sucesso!");
	       
    	} else {
	            System.out.println("Livro " + titulo + " indisponível para empréstimo!");
	        }
	    }
	
	@Override
		public void devolver() {
		    if (!disponivel) {
		        disponivel = true;
		        System.out.println("Livro " + titulo + " devolvido com sucesso!");
		    } else {
		        System.out.println("O livro " + titulo + " não está emprestado!");
		    }
		}
		
		

	
	
	@Override
	public String exibirInformacao() {
		
		return  "Nome do livro " + getTitulo() +
				" Autor " + getAutor() +
				" Ano de publicação " + getAnoPublicacao();
				
	}
}
