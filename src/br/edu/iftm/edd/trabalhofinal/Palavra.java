package br.edu.iftm.edd.trabalhofinal;

public class Palavra implements Comparable<Palavra> {
	private String palavra;
	private String significado;
	private char genero;
	private String tipo;
	private String[] sinonimos;
	
	public Palavra(String palavra, String significado, char genero, String tipo, String[] sinonimos) {
		this.palavra = palavra;
		this.significado = significado;
		this.genero = genero;
		this.tipo = tipo;
		this.sinonimos = sinonimos;
	}
	
	public String getPalavra() {
		return this.palavra;
	}
	
	public String getSignificado() {
		return this.significado;
	}
	
	public String getGenero() {
		if(this.genero == 'M')
			return "Masculino";
		if(this.genero == 'F')
			return "Feminino";
		return null;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public String getSinonimos() {
		if(this.sinonimos == null || this.sinonimos.length == 0)
			return null;
		return String.join(", ", this.sinonimos);
	}
	
	/**
	 * Verifica se a palavra contém um texto.
	 * @param texto Texto a ser procurado
	 * @return Verdadeiro se contém, falso se não contém.
	 */
	public boolean contem(String texto) {
		return this.palavra.toLowerCase().contains(texto) || 
			   this.significado.toLowerCase().contains(texto) ||
			   this.sinonimosContem(texto);
	}
	
	private boolean sinonimosContem(String texto) {
		for(String s : sinonimos)
			if(s.toLowerCase().contains(texto))
				return true;
		return false;
	}
	
	/**
	 * Responsavel pela ordenação do SortedSet.
	 * Define que a ordem dá-se pela comparação da propriedade Palavra.palavra entre duas Palavras, ignorando diferenças
	 * entre letras maiusculas e minusculas.
	 */
	@Override
	public int compareTo(Palavra other) {
		return this.palavra.toLowerCase().compareTo(other.palavra.toLowerCase());
	}
	
	/**
	 * Responsavel por converter a classe para texto.
	 * Usado no programa para exibir as definições da palavra.
	 */
	@Override
	public String toString() {
		return 	"-> " + this.getPalavra() + "\n" +
				"Classe(s) generalizada(s): " + this.getTipo() + "\n" +
				 (this.getGenero() != null ? "Genero: " + this.getGenero() + "\n" : "") +
				 (this.getSinonimos() != null ? "Sinonimos: " + this.getSinonimos() + "\n" : "") +
				"\nSignificado:\n" + this.getSignificado();
	}
}
