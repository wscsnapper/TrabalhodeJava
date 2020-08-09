package br.edu.iftm.edd.trabalhofinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Dicionario {	
	private TreeSet<Palavra> colecao;
	
	public Dicionario() {
		// Como Palavra implementa Comparable<Palavra>, não é necessário prover um comparador
		// a propria instancia já faz a comparação
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
	 * Contém as definições de Palavras.
	 * Usado para fornecer dados ao dicionário.
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
					 	"Janela que se abre com sistema de báscula, levantando uma parte e baixando a outra: janela basculante.\r\n" +
					 	"Parte móvel de alguns veículos que abaixa, inclinando para despejar a carga.\r\n" + 
					 	"Veículo que contém esse aparelho.\r\n" +
					 	"Que se inclina, com movimento de báscula.",
					 	'M',
					 	"Substantivo ou adjetivo",
					 	new String[] { }),
			new Palavra("Cético",
						"Que não acredita em nada; que tende a duvidar de tudo; descrente.\r\n" + 
						"Sem crenças; que não professa uma religião; desprovido de fé; incrédulo.\r\n" + 
						"Diz-se da pessoa partidária do ceticismo, da doutrina segundo a qual seria impossível obter a certeza, num determinado âmbito do conhecimento.\r\n" + 
						"Que pertence ou pode estar relacionado com o ceticismo.\r\n" + 
						"[Por Extensão] Que não consegue confiar em; que está sempre com dúvidas.\r\n" + 
						"Indivíduo partidário do ceticismo; quem é descrente ou incrédulo.",
						'M',
						"Adjetivo e substantivo",
						new String[] { "céptico", "descrente", "incrédulo" }),
			new Palavra("Dromedário",
						"Mamífero da família dos camelídeos, do gênero Camelus dromedarius, muito semelhante ao camelo, com uma única corcova, ligeiro, de corpo leve, usado para viagens em certas regiões da Índia, Arábia e na África.",
						'M',
						"Substantivo",
						new String[] { }),
			new Palavra("Erro",
						"Ação ou consequência de errar, de se enganar ou de se equivocar.\r\n" + 
						"Falta de acerto; engano, equívoco: erro de cálculo.\r\n" + 
						"Opinião ou julgamento contrária à verdade: cometer erro.\r\n" + 
						"Falsa doutrina; opinião falsa: o erro dos heresiarcas.\r\n" + 
						"Ausência de competência, de habilidade, de experiência; falta.\r\n" + 
						"Qualidade do que apresenta ausência de exatidão; imperícia.\r\n" + 
						"Ação ou comportamento inadequado, reprovável: fumar foi um erro.\r\n" + 
						"Maneira de proceder que pode ser alvo de julgamento religioso, moral ou que fira normas sociais: para sua mãe, o casamento será um erro.\r\n" + 
						"[Jurídico] Desvio moral que pode ser considerado crime: matar é um erro.\r\n" + 
						"Ausência de igualdade, de concordância; desigualdade.\r\n" + 
						"[Linguística] Desvio da norma considerada padrão: erro de português.\r\n" + 
						"[Matemática] Diferença entre o valor exato de uma grandeza e o valor dado por uma medição.",
						'M',
						"Substantivo",
						new String[] { "falha", "engano", "desacerto", "incorreção", "equívoco", "falta", "crime", "imperícia", "inexatidão", "desigualdade" }),
			new Palavra("Feixe",
						"Conjunto de raios de luz que, tendo uma fonte comum, podem ser paralelos ou quase paralelos: feixe de luz.\r\n" + 
						"[Por Extensão] Quantidade excessiva de alguma coisa: feixe de críticas.\r\n" + 
						"Reunião de objetos que estão ligados por algo em comum: feixe de madeira.\r\n" + 
						"[Anatomia] Conjunto de fibras de origem nervosa ou muscular.\r\n" + 
						"[Física] Reunião de partículas que, em movimento, se encontram em trajetória paralela ou quase paralela.\r\n" + 
						"[Gramática] Diminutivo irregular: fascículo.",
						'M',
						"Substantivo",
						new String[] { "lio" }),
			new Palavra("Galear",
						"Saltar em galões (o cavalo).\r\n" + 
						"Balançar (a embarcação).",
						'\0',
						"Verbo instansitivo",
						new String[] { }),
			new Palavra("Hélio",
						"Elemento químico gasoso, leve, cujo símbolo é He.\r\n" + 
						"O hidrogênio é o único elemento mais leve que o hélio. O hélio é denominado gás inerte ou gás nobre, porque não se combina com outros elementos.",
						'M',
						"Substantivo",
						new String[] { }),
			new Palavra("Império",
						"Domínio efetivo e soberano; poder, autoridade: exercer império despótico.\r\n" + 
						"Estado que tem um grande alcance mundial ou importância política e econômica.\r\n" + 
						"[Figurado] Poder que se exerce sobre outra coisa ou pessoa; influência.\r\n" + 
						"Nação governada por um imperador, o poder por ele exercido, bem como o tipo de governo predominante e o tempo em que esse imperador governou; monarquia, reinado.\r\n" + 
						"Conjunto de territórios dependentes de um imperador: o Império Britânico.\r\n" +
						"Próprio do império napoleônico, de Napoleão Bonaparte, especialmente na sua primeira fase.",
						'M',
						"Substantivo ou adjetivo",
						new String[] {  "poderio", "predomínio", "poder", "autoridade", "influência", "comando", "soberania", "superioridade", "supremacia", "monarquia" }),
			new Palavra("Janta",
						"Ação ou efeito de jantar.\r\n" + 
						"Uso Informal. Uma das refeições que é feita, geralmente, no final do dia; jantar.",
						'F',
						"Substantivo",
						new String[] { "jantar" }),
			new Palavra("Kiwi",
						"[Botânica] Fruto comestível, Actinidia deliciosa, com polpa verde, cuja pele marrom é coberta por uma pilosidade sedosa.\r\n" + 
						"[Zoologia] Nome comum de aves australianas que se caracterizam pelo esterno sem quilha, ausência de asas, bico longo e fino e plumagem delgada e fina; quiuí.\r\n" + 
						"[Gramática] Pronuncia-se: /quiuí/.",
						'M',
						"Substantivo",
						new String[] { }),
			new Palavra("Língua",
						"[Anatomia] Órgão composto por músculos que, localizado no interior da boca até à faringe, auxilia nos processos de mastigação, de degustação, de produção de sons, de percepção dos sabores.\r\n" + 
						"[Linguística] Conjunto dos elementos que constituem a linguagem falada ou escrita peculiar a uma coletividade; idioma: a língua portuguesa.\r\n" + 
						"[Linguística] Sistema de vocabulário e sintaxe usado em determinada época, por certos escritores, em uma ou outra profissão etc.; linguagem: a língua do séc. XVI.\r\n" + 
						"[Por Extensão] O que tem forma, aparência ou natureza desse órgão: biscoito língua de gato.",
						'F',
						"Substantivo",
						new String[] { "idioma", "linguagem" }),
			new Palavra("Marco",
						"Sinal que registra um limite; baliza ou fronteira.\r\n" + 
						"Pedra oblonga, alongada, com que se demarcam terrenos.\r\n" + 
						"[Figurado] Toda ação ou acontecimento que caracteriza um período, geralmente simbolizando um evento importante.\r\n" + 
						"[Por Extensão] Ponto que se utiliza como referência, modelo, exemplo.\r\n" + 
						"Desnível no solo que se aproveita para assinalar limites territoriais.\r\n" + 
						"[Construção] Parte imóvel que compõe portas e janelas.\r\n" + 
						"[Antigo] Antigo medida de peso; equivalente a 8 onças.",
						'M',
						"Substantivo",
						new String[] { "baliza", "demarcação", "divisa", "fronteira", "limite" }),
			new Palavra("Nativo",
						"Próprio do lugar onde nasce; oriundo de determinado local: mata nativa; falante nativo.\r\n" + 
						"Referente a indígena: povos nativos.\r\n" + 
						"Que nasce com o indivíduo, não adquirido; congênito, inato: virtude nativa.\r\n" + 
						"Diz-se de material que se encontra na natureza em estado puro: ouro nativo.\r\n" + 
						"Pessoa nascida em determinado país; natural, nato: costumes e crenças dos nativos.\r\n" + 
						"Astrologia. Pessoa nascida sob certo signo zodíaco: nativos de Sagitário.",
						'M',
						"Adjetivo ou substantivo",
						new String[] { "natural", "autóctone", "inato", "inerente", "congênito" }),
			new Palavra("Oráculo",
						"Resposta dada por uma divindade, quando alguém a consultava.\r\n" + 
						"Mitologia. Essa divindade ou a pessoa que servia como intermediário entre a divindade e quem a consultava; o lugar onde a divindade era consultada.\r\n" + 
						"[Por Extensão] Pessoa que, supostamente, prevê o futuro ou a previsão feita por essa pessoa: oráculo do amor; eu fui ao oráculo ontem.\r\n" + 
						"[Figurado] Quem sabe tudo sobre qualquer assunto: o oráculo da turma.\r\n" + 
						"[Religião] Revelação divina; a expressão de Deus através dos profetas.\r\n" + 
						"[Por Extensão] Indivíduo poderoso que exerce sua autoridade através de suas palavras ou de seus conselhos: o oráculo da civilização antiga.\r\n" + 
						"[Figurado] Palavra ou opinião que não pode ser refutada; decisão infalível.",
						'M',
						"Substantivo",
						new String[] { }),
			new Palavra("Pato",
						"Nome comum às aves anseriformes da família dos anatídeos, de hábitos aquáticos, voadoras, e migradoras quando no estado selvagem. (Caracteriza-se pelo bico chato e espatulado, guarnecido de lamelas.).\r\n" + 
						"[Figurado] Indivíduo que, por ingenuidade, se deixa explorar.\r\n" + 
						"Pagar o pato, pagar, ou sofrer as consequências por coisas que não fez.",
						'M',
						"Substantivo",
						new String[] { "parro", "patureba", "idiota" }),
			new Palavra("Queijo",
						"Alimento sólido elaborado a partir da fermentação e coagulação leite de vários mamíferos como a vaca, a cabra, a ovelha, etc. ou a partir do leite produzido a partir de alguns vegetais (queijo de soja, queijo de amêndoas, etc.).",
						'M',
						"Substantivo",
						new String[] { }),
			new Palavra("Rastro",
						"Vestígio; pegada ou sinal deixado ao caminhar.\r\n" + 
						"Qualquer sinal que fica quando algo passa: o rastro do navio.\r\n" + 
						"[Figurado] Sinal; o que dá pistas do aparecimento de: o ladrão não deixou rastro.\r\n" + 
						"Sola; a parte inferior de um calçado.\r\n" + 
						"Rede de pescar; rede usada para arrastar.\r\n" + 
						"[Gramática] A forma rasto está correta e pode ser utilizada.",
						'M',
						"Substantivo",
						new String[] { "peugada", "pista", "pegada", "sinal", "vestígio", "encalço", "indignação", "rasto", "treita", "trilha", "sola" }),
			new Palavra("Seita",
						"Doutrina que, propagada por um grande número de pessoas, se afasta ou diverge de certa forma de outra doutrina principal.\r\n" + 
						"Grupo de pessoas que adota uma doutrina diferente das demais.\r\n" + 
						"[Religião] Grupo religioso dissidente que deixa de participar de uma religião por não concordar com suas normas e objetivos.\r\n" + 
						"[Popular] Grupo com uma organização própria, geralmente restrito e fechado, que se une por ideias, ideologias, opiniões e comportamentos semelhantes; facção, bando.",
						'F',
						"Substantivo",
						new String[] { "doutrina", "facção", "partido", "bando" }),
			new Palavra("Tubérculo",
						"[Botânica] Parte grossa de um caule que cresce debaixo da terra.\r\n" + 
						"A batata é o melhor exemplo de tubérculo. O tubérculo armazena alimentos, em geral amido, para a planta. Apresenta pequenas folhas escamosas e gemas minúsculas conhecidas como olhos. Esses olhos brotam, dando origem a novas plantas, que retiram seu alimento do tubérculo, até que as próprias raízes e folhas se formem.",
						'M',
						"Substantivo",
						new String[] { }),
			new Palavra("Uva",
						"Baga da videira: uva preta, branca, rosada.\r\n" + 
						"Fruto das vinhas, em geral.\r\n" + 
						"[Figurado] e Pop. Mulher bonita; coisa agradável à vista ou ao paladar.",
						'F',
						"Substantivo",
						new String[] { "baga", "bago", "linda", "bonita", "bela" }),
			new Palavra("Vinil",
						"Radical etilênico monovalente H2C=CH-.\r\n" + 
						"Disco de sulco contínuo, de vinilite.",
						'M',
						"Substantivo",
						new String[] { }),
			new Palavra("Wc",
						"Local com instalações sanitárias para higiene pessoal; banheiro.\r\n" + 
						"[Gramática] Forma Abreviada do inglês: water-closet.",
						'M',
						"Substantivo",
						new String[] { "banheiro" }),
			new Palavra("Xerox",
						"Processo que permite fazer cópias por meio de xerografia, técnica de impressão sem contato.\r\n" + 
						"Máquina usada nesse processo de reprodução por xerografia.\r\n" + 
						"Cópia impressa ou fotocópia obtida por esse processo, com o auxílio dessa máquina: quanto custa o xerox?\r\n" + 
						"[Gramática] Grafia também correta: xérox.",
						'M',
						"Substantivo",
						new String[] { "fotocópia", "xerógrafo", "xérox" }),
			new Palavra("Zero",
						"[Matemática] Signo numérico representado pelo algarismo 0, que não tem valor por si, mas que, colocado à direita de outro, multiplica-o por dez, no sistema de numeração decimal.\r\n" + 
						"[Figurado] Pessoa ou coisa sem valor.",
						'M',
						"Substantivo",
						new String[] { "cifra", "nada" })
		};
		return Arrays.asList(palavras);
	}
}
