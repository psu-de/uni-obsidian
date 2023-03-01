
# Definition

Eine __Menge__ ist eine Gesamtheit an Objekten. Für jedes Objekt ist es eindeutig, ob es zur __Menge__ gehört oder nicht. Ein Element kann nur einmal in der __Menge__ vorkommen.

### Mächtigkeit
Die __Mächtigkeit__ oder auch __Kardinalität__ einer [[Module/LA1/Zusammenfassung/Objekte/Mengen#Definition|Menge]] gibt an, wie viele Elemente sich in der [[Module/LA1/Zusammenfassung/Objekte/Mengen#Definition|Menge]] befinden. 

Sei $M$ eine [[Module/LA1/Zusammenfassung/Objekte/Mengen#Definition|Menge]].
Man schreibt: $|M|$ oder auch $\#M$.

### Teilmenge
Sei $M, N$ zwei [[Module/LA1/Zusammenfassung/Objekte/Mengen#Definition|Mengen]].

Wenn gilt:
	$\forall n \in N: n \in M$ 
	(Siehe [[Aussagenlogik#Quantoren|Quantoren]].)
also __alle Elemente aus $N$ auch in $M$ vorhanden ist__.
Man schreibt:
	$N \subseteq M$

__echte Teilmenge__:
	Man schreibt: $N \subset M$, wenn $N$ eine __echte Teilmenge__ von $M$ ist.
	D.h.: $M$ enthält neben $N$ auch noch andere Elemente. Es gilt: $|M| > |N|$
	Siehe [[#Mächtigkeit]].

### Mengengleichheit
Sei $M, N$ zwei [[Module/LA1/Zusammenfassung/Objekte/Mengen#Definition|Mengen]].
Um zu Beweisen dass die zwei [[#Definition|Mengen]] $M, N$ gleich sind, ist es in der Regel am einfachsten zu Beweisen dass sich die beiden [[#Definition|Mengen]] jeweils als Teilmengen enthalten.

$M = N \Leftrightarrow (M \subseteq N \land N \subseteq M)$
(Siehe [[Aussagenlogik#Definition|Aussagenlogik]])

### Operationen
Seien $M, N$ zwei [[Module/LA1/Zusammenfassung/Objekte/Mengen#Definition|Mengen]].

Folgende Operationen sind definiert:
 - __Durchschnitt__:
	 $M \cap N := \{ x | x \in M \land x \in N\}$ 
	 Alle $m \in M$ die _auch_ in $N$ enthalten sind.
- __Vereinigung__:
	$M \cup N := \{ x | x \in M \lor x \in N\}$
	Alle Elemente von $M$ und $N$ zusammen.
- __Differenzmenge__:
	$M \setminus N := \{x| x \in M \land x \not\in N\}$
	Alle $m \in M$ die _nicht_ in $N$ enthalten sind.
- __kartesisches Produkt__:
	$M \times N := \{(m, n) | m \in M, n \in N\}$
	Eine [[Module/LA1/Zusammenfassung/Objekte/Mengen#Definition|Menge]] an 2-Tupeln, die alle möglichen kombinationen der Elemente von $M$ und $N$ enthält.
- __Potenz__:
	$M^k := \{(m_1, m_2, \dots m_k) | \forall i: m_i \in M\}$ für $k \in \mathbb{N}$
	Eine [[Module/LA1/Zusammenfassung/Objekte/Mengen#Definition|Menge]] an $k$-Tupeln

### Potenzmenge
Die __Potenzmenge__ gibt alle möglichen [[#Teilmenge|Teilmengen]] eine [[#Definition|Menge]] an.
Sei $M$ eine [[#Definition|Menge]].
	$\mathcal{P}(M) := \{x|x\subseteq M\}$

### Ordnungsrelation
Eine [[Relationen#Reflexiv|reflexive]] und [[Relationen#Transitiv|transitive]] __[[Relationen|Relation]]__ $\leq$ über eine [[Module/LA1/Zusammenfassung/Objekte/Mengen|Menge]] $M$ heißt __Ordnungsrelation__, wenn gilt:
	$\forall x, y \in M: [x \leq y \land y \leq x] \Rightarrow x = y$
	Es kann also nicht $x \leq y$ _und_ $y \leq x$ gelten, wenn $x \neq y$.

#### Totale Ordnung
Eine [[Module/LA1/Zusammenfassung/Objekte/Mengen|Menge]] $M$ heißt __total Geordnet__, wenn _für alle_ Elemente gilt:
	$\forall x, y \in M: x \leq y \lor y \leq x$.

#### Obere Schranke
Eine __Obere Schranke__ $z \in M$ ist das _größte_ Elemente in $M$, für das gilt:
	$\forall x \in M: x \leq z$
	Es gibt also kein Element in $M$, für dass die [[Relationen|Relation]] $\leq$ falsch ist, wenn $z$ auf der rechten Seite steht.
