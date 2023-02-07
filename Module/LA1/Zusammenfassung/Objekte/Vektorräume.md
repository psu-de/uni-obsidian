
## Definition
Sei $(K, +, \cdot)$ ein [[Körper]]. Ein __Vektorraum__ über $K$ ($K$-Vektorraum) ist eine [[Gruppen#Abelsche Gruppe|abelsche Gruppe]] $(V, +)$.
Zudem ist die sogennante __skalare Multiplikation__ definiert:
	$\cdot: K \times V \rightarrow V$, $(k, v) \mapsto k \cdot v$
	Folgende Eigenschaften gelten:
		- $\forall v \in V: 1_K \cdot v: v$
		- $\forall v \in V: v \cdot 0_K = 0_V$
		- $\forall a, b \in K, v \in V: a \cdot (b \cdot v) = (a \cdot_K b) \cdot v$
		   _Assoziativität_
		- $\forall a, b \in K, u, v \in V:$
			- $a \cdot (u + v) = a \cdot u + a \cdot v$
			- $(a + b) \cdot v = a \cdot v + b \cdot v$
		  _Distributivgesetze_

### Untervektorraum
Ein __Untervektorraum__ $U$ von $V$ ist [[Mengen#Teilmenge|Teilmenge]] $U \subseteq V$.
$U$ hat die Eigenschaft:
	$\forall a \in K, u \in U: a \cdot u \in U$
$U$ ist also selbst ein __Vektorraum__, außerdem bildet $U$ bezüglich der _Addition_ eine [[Gruppen#Untergruppen|Untergruppe]].
Man schreibt oft $U \leq V$.

 _Untervektorraumkriterium_:
	 $U$ ist ein __Untervektorraum__ von $V$, wenn:
		- $\forall u_1, u_2 \in U: u_1 + u_2 \in U$
		- $\forall a \in K, u \in U: a \cdot u \in U$
	$U$ muss also bezüglich der Addition und skalaren Multiplikation abgeschlossen sein.
	Für zwei __Untervektorräume__ $U_1, U_2 \leq V$ ist auch $U_1 \cap U_2$ ein __Untervektorraum__ von $V$.

#### Summe von Untervektorräumen
Sei $U, W \leq V$ zwei __Untervektorräume__ von $V$.
Die __Summe der Untervektorräume__ ist definiert durch:
	$U + W := \{u + w \in V\ |\ u \in U, w \in W\}$
	Es gilt also auch $U + W = \langle U \cup W \rangle$ ([[#Vektorraumerzeugnis]])
	_$U + W$ ist der kleinste __Untervektorraum__ der $U$ und $W$ enthält._

### Linearkombination
Bemerkung: statt alle Vektoren $v \in V$ wird oft eine [[Mengen#Teilmenge|Teilmenge]] $M \subseteq V$ genommen.
Eine __Linearkombination__ ist ein Vektor $v \in V$ der als Summe _endlich_ vieler Vektoren $v_i \in V$ und Koeffizienten $a_i \in K$ ausgedrückt werden kann:
	$v = \sum\limits_i a_i v_i$
Für $a_i$ kann auch eine [[Abbildungen|Abbildung]] $\alpha: M \rightarrow K$ genommen, mit $M \subseteq V$. 
Dazu muss $\alpha$ allerdings einen [[Abbildungen#Träger|endlichen Träger]] haben. 

### Vektorraumerzeugnis
Das __Vektorraumerzeugnis__ einer [[Mengen|Menge]] $M \subseteq V$ ist die [[Mengen|Menge]] aller [[#Linearkombination|Linearkombinationen]] die aus mit $v \in M$ und $K$ erzeugt werden können.
Für das __Erzeugnis__ schreibt man $\langle M \rangle$
$M$ wird das __Erzeugendensystem__ von $\langle M \rangle$ genannt.

Gleich wie bei [[Gruppen]], ist $\langle M \rangle$ der kleinste [[#Untervektorraum]] von $V$, der $M$ als [[Mengen#Teilmenge|Teilmenge]] enthält.
Es gilt:
	$\langle M \rangle = \bigcap\limits_{M \subseteq U \leq V} U$
besteht $M$ nur aus einem Element $m$, schreibt man statt $\langle \{ m\} \rangle$ kürzer $K \cdot m$.

### Lineare Abbildung
Eine __$K$-lineare Abbildung__ ist ein synonym für [[Homomorphismen#Vektorraumhomomorphismus|Vektorraumhomomorphismus]].
Seien $V, W$ zwei __Vektorräume__.
$Hom(V, W)$ ist einen [[#Untervektorraum]] von $Abb(V, W)$.

### Basis
Eine __Basis__ eines __Vektorraums__ $V$ ist eine [[Mengen#Teilmenge|Teilmenge]] $B \subseteq V$.
Jeder Vektor $v \in V$ lässt sich auf _genau eine Art_ als [[#Linearkombination]] von $B$ schreiben:
	$v = \sum\limits_i a_i b_i$      mit $a_i \in K$ und $b_i \in B$.
oder auch:
	$\forall v \in V: \exists_1 \lambda \in Abb(B, K)_0 : v = \sum\limits_{b \in B} \lambda(b) \cdot b$
	Es existiert als _genau eine_ [[Abbildungen|Abbildung]] von der __Basis__ $B$ nach $K$ mit [[Abbildungen#Träger|endlichem Träger]] die man für die [[#Linearkombination]] nutzen kann.

Eine __Basis__ $B$ ist das _kleinste_ [[#Vektorraumerzeugnis|Vektorraumerzeugnissystem]] von $V$: $\langle B \rangle = V$.
Eine __Basis__ ist immer [[#Lineare Abhängigkeit|linear Unabhängig]].
Für einen __Vektorraum__ $K^p$ hat die __Basis__ genau $p$ Elemente.

#### Geordnete Basis
Bei einer __geordneten Basis__ ist die Reihenfolge der Vektoren in $B$ nicht egal, sondern entscheidend.
Beispiel:
	Die __Basis__ $B_1$ von $\mathbb{R}^2$  $B_1 = \left\lbrace\left(\begin{array}{c} 1 \\ 0 \\ 0\end{array}\right), \left(\begin{array}{c}0 \\ 1\\ 0\end{array}\right), \left(\begin{array}{c}0 \\ 0\\ 1\end{array}\right) \right\rbrace$ ist nicht geordnet, da sie egal in welcher Reihenfolge geschrieben werden kann (es ändert sich nur die Reihenfolge der Koordinaten).
	Die komplexen Zahlen $\mathbb{C}$ können als zweidimensionaler __Vektorraum__ über $\mathbb{R}$ aufgefasst werden.
	Hier ist die __Basis__ $B_2 = \left(1, i\right)$ geordnet.
Geordnete Basen werden als $k$-Tupel geschrieben, anstatt als [[Mengen|Menge]].

### Koordinatenvektor
Die [[Abbildungen|Abbildung]] $D_B: V \rightarrow Abb(B, K)_0$ heißt die __Koordinatenabbildung__.
Für einen Vektor $v \in V$ heißt $D_B(v)$ der __Koordinatenvektor__ von $v$.

Da $v$ auch als [[#Linearkombination]] $v = \lambda_1 b_1 + \dots + \lambda_q b_q$ bezüglich der __Basis__ aufgefasst werden kann, gilt: $D_B(v) = D_B(\lambda_1 b_1 + \dots + \lambda_q b_q) = \left(\begin{array}{c}\lambda_1 \\ \vdots \\ \lambda_q\end{array}\right) \in K^q$

### Lineare Abhängigkeit
Sei $M \subset V$ eine [[Mengen#Teilmenge|Teilmenge]] von $V$.
$M$ ist __linear Unabhängig__, wenn sich der _Nullvektor_ als [[#Linearkombination]] von $M$ nur als
	$0 = \sum\limits_{m \in M} 0 \cdot m$  schreiben lässt. Bzw. mit [[Abbildungen]]:
	$0 = \left\lbrack\sum\limits_{m \in M} \lambda(m) \cdot m\right\rbrack \Leftrightarrow \lambda = 0$ für alle $\lambda \in Abb(B, K)_0$.  
__linear Unabhängig__ bedeutet dass $\langle M \rangle = V$ (glaub ich zumindest)

### Dimension
