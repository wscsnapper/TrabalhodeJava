package br.edu.iftm.edd.trabalhofinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Dicionario {	
	private TreeSet<Palavra> colecao;
	
	public Dicionario() {
		// Como Palavra implementa Comparable<Palavra>, n�o � necess�rio prover um comparador
		// a propria instancia j� faz a compara��o
		this.colecao = new TreeSet<Palavra>(Dicionario.pegarTodasPalavras());
	}
	
	public Palavra[] procurar(String texto) {
		// Lista de Palavras que foram encontradas
		List<Palavra> palavras = new ArrayList<Palavra>();
		
		// Procurar palavras
		for(Palavra p : colecao) {
			if(p.contem(texto))
				palavras.add(p);
		}
			
		// Converter de Lista para Array.
		Palavra[] arrayPalavras = new Palavra[palavras.size()];
		palavras.toArray(arrayPalavras);
		return arrayPalavras;
	}
	
	public String[] palavras() {
		// Lista de Palavras
		List<String> palavras = new ArrayList<String>(this.colecao.size());
		
		for(Palavra p : colecao)
			palavras.add(p.getPalavra());

		// Converter de Lista para Array.
		String[] arrayPalavras = new String[palavras.size()];
		palavras.toArray(arrayPalavras);
		return arrayPalavras;
	}
	
	/**
	 * Cont�m as defini��es de Palavras.
	 * Usado para fornecer dados ao dicion�rio.
	 * @return Uma lista de palavras.
	 */
	private static List<Palavra> pegarTodasPalavras() {
		// Fonte: https://www.dicio.com.br/
		Palavra[] palavras = new Palavra[] {
			new Palavra("Afobar", 
						"[Brasil] Pop. Apressar(-se), precipitar(-se).\r\n" + 
						"Atrapalhar(-se).\r\n" + 
						"Cansar(-se), esfalfar(-se).",
						'\0',
						"Verbo transitivo e pronominal",
						new String[] { "apressar", "precipitar", "atrapalhar", "cansar", "asfalfar" }),
			new Palavra("Basculante",
					 	"Janela que se abre com sistema de b�scula, levantando uma parte e baixando a outra: janela basculante.\r\n" +
					 	"Parte m�vel de alguns ve�culos que abaixa, inclinando para despejar a carga.\r\n" + 
					 	"Ve�culo que cont�m esse aparelho.\r\n" +
					 	"Que se inclina, com movimento de b�scula.",
					 	'M',
					 	"Substantivo ou adjetivo",
					 	new String[] { }),
			new Palavra("C�tico",
						"Que n�o acredita em nada; que tende a duvidar de tudo; descrente.\r\n" + 
						"Sem cren�as; que n�o professa uma religi�o; desprovido de f�; incr�dulo.\r\n" + 
						"Diz-se da pessoa partid�ria do ceticismo, da doutrina segundo a qual seria imposs�vel obter a certeza, num determinado �mbito do conhecimento.\r\n" + 
						"Que pertence ou pode estar relacionado com o ceticismo.\r\n" + 
						"[Por Extens�o] Que n�o consegue confiar em; que est� sempre com d�vidas.\r\n" + 
						"Indiv�duo partid�rio do ceticismo; quem � descrente ou incr�dulo.",
						'M',
						"Adjetivo e substantivo",
						new String[] { "c�ptico", "descrente", "incr�dulo" }),
			new Palavra("Dromed�rio",
						"Mam�fero da fam�lia dos camel�deos, do g�nero Camelus dromedarius, muito semelhante ao camelo, com uma �nica corcova, ligeiro, de corpo leve, usado para viagens em certas regi�es da �ndia, Ar�bia e na �frica.",
						'M',
						"Substantivo",
						new String[] { }),
			new Palavra("Erro",
						"A��o ou consequ�ncia de errar, de se enganar ou de se equivocar.\r\n" + 
						"Falta de acerto; engano, equ�voco: erro de c�lculo.\r\n" + 
						"Opini�o ou julgamento contr�ria � verdade: cometer erro.\r\n" + 
						"Falsa doutrina; opini�o falsa: o erro dos heresiarcas.\r\n" + 
						"Aus�ncia de compet�ncia, de habilidade, de experi�ncia; falta.\r\n" + 
						"Qualidade do que apresenta aus�ncia de exatid�o; imper�cia.\r\n" + 
						"A��o ou comportamento inadequado, reprov�vel: fumar foi um erro.\r\n" + 
						"Maneira de proceder que pode ser alvo de julgamento religioso, moral ou que fira normas sociais: para sua m�e, o casamento ser� um erro.\r\n" + 
						"[Jur�dico] Desvio moral que pode ser considerado crime: matar � um erro.\r\n" + 
						"Aus�ncia de igualdade, de concord�ncia; desigualdade.\r\n" + 
						"[Lingu�stica] Desvio da norma considerada padr�o: erro de portugu�s.\r\n" + 
						"[Matem�tica] Diferen�a entre o valor exato de uma grandeza e o valor dado por uma medi��o.",
						'M',
						"Substantivo",
						new String[] { "falha", "engano", "desacerto", "incorre��o", "equ�voco", "falta", "crime", "imper�cia", "inexatid�o", "desigualdade" }),
			new Palavra("Feixe",
						"Conjunto de raios de luz que, tendo uma fonte comum, podem ser paralelos ou quase paralelos: feixe de luz.\r\n" + 
						"[Por Extens�o] Quantidade excessiva de alguma coisa: feixe de cr�ticas.\r\n" + 
						"Reuni�o de objetos que est�o ligados por algo em comum: feixe de madeira.\r\n" + 
						"[Anatomia] Conjunto de fibras de origem nervosa ou muscular.\r\n" + 
						"[F�sica] Reuni�o de part�culas que, em movimento, se encontram em trajet�ria paralela ou quase paralela.\r\n" + 
						"[Gram�tica] Diminutivo irregular: fasc�culo.",
						'M',
						"Substantivo",
						new String[] { "lio" }),
			new Palavra("Galear",
						"Saltar em gal�es (o cavalo).\r\n" + 
						"Balan�ar (a embarca��o).",
						'\0',
						"Verbo instansitivo",
						new String[] { }),
			new Palavra("H�lio",
						"Elemento qu�mico gasoso, leve, cujo s�mbolo � He.\r\n" + 
						"O hidrog�nio � o �nico elemento mais leve que o h�lio. O h�lio � denominado g�s inerte ou g�s nobre, porque n�o se combina com outros elementos.",
						'M',
						"Substantivo",
						new String[] { }),
			new Palavra("Imp�rio",
						"Dom�nio efetivo e soberano; poder, autoridade: exercer imp�rio desp�tico.\r\n" + 
						"Estado que tem um grande alcance mundial ou import�ncia pol�tica e econ�mica.\r\n" + 
						"[Figurado] Poder que se exerce sobre outra coisa ou pessoa; influ�ncia.\r\n" + 
						"Na��o governada por um imperador, o poder por ele exercido, bem como o tipo de governo predominante e o tempo em que esse imperador governou; monarquia, reinado.\r\n" + 
						"Conjunto de territ�rios dependentes de um imperador: o Imp�rio Brit�nico.\r\n" +
						"Pr�prio do imp�rio napole�nico, de Napole�o Bonaparte, especialmente na sua primeira fase.",
						'M',
						"Substantivo ou adjetivo",
						new String[] {  "poderio", "predom�nio", "poder", "autoridade", "influ�ncia", "comando", "soberania", "superioridade", "supremacia", "monarquia" }),
			new Palavra("Janta",
						"A��o ou efeito de jantar.\r\n" + 
						"Uso Informal. Uma das refei��es que � feita, geralmente, no final do dia; jantar.",
						'F',
						"Substantivo",
						new String[] { "jantar" }),
			new Palavra("Kiwi",
						"[Bot�nica] Fruto comest�vel, Actinidia deliciosa, com polpa verde, cuja pele marrom � coberta por uma pilosidade sedosa.\r\n" + 
						"[Zoologia] Nome comum de aves australianas que se caracterizam pelo esterno sem quilha, aus�ncia de asas, bico longo e fino e plumagem delgada e fina; quiu�.\r\n" + 
						"[Gram�tica] Pronuncia-se: /quiu�/.",
						'M',
						"Substantivo",
						new String[] { }),
			new Palavra("L�ngua",
						"[Anatomia] �rg�o composto por m�sculos que, localizado no interior da boca at� � faringe, auxilia nos processos de mastiga��o, de degusta��o, de produ��o de sons, de percep��o dos sabores.\r\n" + 
						"[Lingu�stica] Conjunto dos elementos que constituem a linguagem falada ou escrita peculiar a uma coletividade; idioma: a l�ngua portuguesa.\r\n" + 
						"[Lingu�stica] Sistema de vocabul�rio e sintaxe usado em determinada �poca, por certos escritores, em uma ou outra profiss�o etc.; linguagem: a l�ngua do s�c. XVI.\r\n" + 
						"[Por Extens�o] O que tem forma, apar�ncia ou natureza desse �rg�o: biscoito l�ngua de gato.",
						'F',
						"Substantivo",
						new String[] { "idioma", "linguagem" }),
			new Palavra("Marco",
						"Sinal que registra um limite; baliza ou fronteira.\r\n" + 
						"Pedra oblonga, alongada, com que se demarcam terrenos.\r\n" + 
						"[Figurado] Toda a��o ou acontecimento que caracteriza um per�odo, geralmente simbolizando um evento importante.\r\n" + 
						"[Por Extens�o] Ponto que se utiliza como refer�ncia, modelo, exemplo.\r\n" + 
						"Desn�vel no solo que se aproveita para assinalar limites territoriais.\r\n" + 
						"[Constru��o] Parte im�vel que comp�e portas e janelas.\r\n" + 
						"[Antigo] Antigo medida de peso; equivalente a 8 on�as.",
						'M',
						"Substantivo",
						new String[] { "baliza", "demarca��o", "divisa", "fronteira", "limite" }),
			new Palavra("Nativo",
						"Pr�prio do lugar onde nasce; oriundo de determinado local: mata nativa; falante nativo.\r\n" + 
						"Referente a ind�gena: povos nativos.\r\n" + 
						"Que nasce com o indiv�duo, n�o adquirido; cong�nito, inato: virtude nativa.\r\n" + 
						"Diz-se de material que se encontra na natureza em estado puro: ouro nativo.\r\n" + 
						"Pessoa nascida em determinado pa�s; natural, nato: costumes e cren�as dos nativos.\r\n" + 
						"Astrologia. Pessoa nascida sob certo signo zod�aco: nativos de Sagit�rio.",
						'M',
						"Adjetivo ou substantivo",
						new String[] { "natural", "aut�ctone", "inato", "inerente", "cong�nito" }),
			new Palavra("Or�culo",
						"Resposta dada por uma divindade, quando algu�m a consultava.\r\n" + 
						"Mitologia. Essa divindade ou a pessoa que servia como intermedi�rio entre a divindade e quem a consultava; o lugar onde a divindade era consultada.\r\n" + 
						"[Por Extens�o] Pessoa que, supostamente, prev� o futuro ou a previs�o feita por essa pessoa: or�culo do amor; eu fui ao or�culo ontem.\r\n" + 
						"[Figurado] Quem sabe tudo sobre qualquer assunto: o or�culo da turma.\r\n" + 
						"[Religi�o] Revela��o divina; a express�o de Deus atrav�s dos profetas.\r\n" + 
						"[Por Extens�o] Indiv�duo poderoso que exerce sua autoridade atrav�s de suas palavras ou de seus conselhos: o or�culo da civiliza��o antiga.\r\n" + 
						"[Figurado] Palavra ou opini�o que n�o pode ser refutada; decis�o infal�vel.",
						'M',
						"Substantivo",
						new String[] { }),
			new Palavra("Pato",
						"Nome comum �s aves anseriformes da fam�lia dos anat�deos, de h�bitos aqu�ticos, voadoras, e migradoras quando no estado selvagem. (Caracteriza-se pelo bico chato e espatulado, guarnecido de lamelas.).\r\n" + 
						"[Figurado] Indiv�duo que, por ingenuidade, se deixa explorar.\r\n" + 
						"Pagar o pato, pagar, ou sofrer as consequ�ncias por coisas que n�o fez.",
						'M',
						"Substantivo",
						new String[] { "parro", "patureba", "idiota" }),
			new Palavra("Queijo",
						"Alimento s�lido elaborado a partir da fermenta��o e coagula��o leite de v�rios mam�feros como a vaca, a cabra, a ovelha, etc. ou a partir do leite produzido a partir de alguns vegetais (queijo de soja, queijo de am�ndoas, etc.).",
						'M',
						"Substantivo",
						new String[] { }),
			new Palavra("Rastro",
						"Vest�gio; pegada ou sinal deixado ao caminhar.\r\n" + 
						"Qualquer sinal que fica quando algo passa: o rastro do navio.\r\n" + 
						"[Figurado] Sinal; o que d� pistas do aparecimento de: o ladr�o n�o deixou rastro.\r\n" + 
						"Sola; a parte inferior de um cal�ado.\r\n" + 
						"Rede de pescar; rede usada para arrastar.\r\n" + 
						"[Gram�tica] A forma rasto est� correta e pode ser utilizada.",
						'M',
						"Substantivo",
						new String[] { "peugada", "pista", "pegada", "sinal", "vest�gio", "encal�o", "indigna��o", "rasto", "treita", "trilha", "sola" }),
			new Palavra("Seita",
						"Doutrina que, propagada por um grande n�mero de pessoas, se afasta ou diverge de certa forma de outra doutrina principal.\r\n" + 
						"Grupo de pessoas que adota uma doutrina diferente das demais.\r\n" + 
						"[Religi�o] Grupo religioso dissidente que deixa de participar de uma religi�o por n�o concordar com suas normas e objetivos.\r\n" + 
						"[Popular] Grupo com uma organiza��o pr�pria, geralmente restrito e fechado, que se une por ideias, ideologias, opini�es e comportamentos semelhantes; fac��o, bando.",
						'F',
						"Substantivo",
						new String[] { "doutrina", "fac��o", "partido", "bando" }),
			new Palavra("Tub�rculo",
						"[Bot�nica] Parte grossa de um caule que cresce debaixo da terra.\r\n" + 
						"A batata � o melhor exemplo de tub�rculo. O tub�rculo armazena alimentos, em geral amido, para a planta. Apresenta pequenas folhas escamosas e gemas min�sculas conhecidas como olhos. Esses olhos brotam, dando origem a novas plantas, que retiram seu alimento do tub�rculo, at� que as pr�prias ra�zes e folhas se formem.",
						'M',
						"Substantivo",
						new String[] { }),
			new Palavra("Uva",
						"Baga da videira: uva preta, branca, rosada.\r\n" + 
						"Fruto das vinhas, em geral.\r\n" + 
						"[Figurado] e Pop. Mulher bonita; coisa agrad�vel � vista ou ao paladar.",
						'F',
						"Substantivo",
						new String[] { "baga", "bago", "linda", "bonita", "bela" }),
			new Palavra("Vinil",
						"Radical etil�nico monovalente H2C=CH-.\r\n" + 
						"Disco de sulco cont�nuo, de vinilite.",
						'M',
						"Substantivo",
						new String[] { }),
			new Palavra("Wc",
						"Local com instala��es sanit�rias para higiene pessoal; banheiro.\r\n" + 
						"[Gram�tica] Forma Abreviada do ingl�s: water-closet.",
						'M',
						"Substantivo",
						new String[] { "banheiro" }),
			new Palavra("Xerox",
						"Processo que permite fazer c�pias por meio de xerografia, t�cnica de impress�o sem contato.\r\n" + 
						"M�quina usada nesse processo de reprodu��o por xerografia.\r\n" + 
						"C�pia impressa ou fotoc�pia obtida por esse processo, com o aux�lio dessa m�quina: quanto custa o xerox?\r\n" + 
						"[Gram�tica] Grafia tamb�m correta: x�rox.",
						'M',
						"Substantivo",
						new String[] { "fotoc�pia", "xer�grafo", "x�rox" }),
			new Palavra("Zero",
						"[Matem�tica] Signo num�rico representado pelo algarismo 0, que n�o tem valor por si, mas que, colocado � direita de outro, multiplica-o por dez, no sistema de numera��o decimal.\r\n" + 
						"[Figurado] Pessoa ou coisa sem valor.",
						'M',
						"Substantivo",
						new String[] { "cifra", "nada" })
		};
		return Arrays.asList(palavras);
	}
}
