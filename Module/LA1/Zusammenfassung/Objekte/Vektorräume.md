
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
Ein __Untervektorraum__ $U$ von $V$ ist [[Module/LA1/Zusammenfassung/Objekte/Mengen#Teilmenge|Teilmenge]] $U \subseteq V$.
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

Die [[#Dimension]] des __Untervektorraumes__ ist _kleinder oder gleich_ die des Obervektorraumes: 
	$dim_K(U) \leq dim_K(V)$.
	Wenn $dim_K(U) = dim_K(V)$ gilt, ist $U = V$.

### Summe von Untervektorräumen
Sei $U, W \leq V$ zwei __Untervektorräume__ von $V$.
Die __Summe der Untervektorräume__ ist definiert durch:
	$U + W := \{u + w \in V\ |\ u \in U, w \in W\}$
	Schreibweise mit $I$ als _Indexmenge_:
		$\sum\limits_{i \in I} U_i := \{u_1 + \dots + u_n\ |\ \forall i: u_i \in U_i\}$
		(Jedes $u_i$ kommt aus dem dazugehörigen $U_i$ (also $u_1\in U_1$, $u_n \in U_n$)

Es gilt also auch $U + W = \langle U \cup W \rangle$ ([[#Vektorraumerzeugnis]])
_$U + W$ ist der kleinste __Untervektorraum__ der $U$ und $W$ enthält_.

_Dimensionsformel_:
	Für zwei [[#Dimension|endlichdimensionale]] [[#Untervektorraum|Untervektorräume]] $U, W \leq V$ gilt:
	$dim(U + W) = dim(U) + dim(W) - dim(U \cap W)$

#### Direkte Summe
Eine __Summe von Vektorräumen__ $U + W$ gilt als __direkt__, wenn gilt:
	$\exists_1 u \in U, w \in W: u + w = 0$
	Es gibt also nur _eine_ Kombination von $u$ und $w$ die den _Nullvektor_ ergibt.
In dem Fall schreibt man auch $U \oplus W$.

Bzw. mit $I$ als _Indexmenge_:
	$\bigoplus\limits_{i \in I} U_i$

Hilfssatz:
	Eine Summe$\sum\limits_{i=1}^n U_i$ ist genau dann eine __direkte Summe__, wenn gilt:
	$dim_K(\sum\limits_{i=1}^n U_i) = \sum\limits_{i=1}^n dim_K(U_i)$

### Komplementärer Vektorraum
Seien $U, W \leq V$ zwei [[#Untervektorraum|Untervektorräume]] von $V$.
Wenn gilt:
	$V = U \oplus W$
heißt $W$ ein zu $U$ __komplementärer Vektorraum__.
In dem Fall gilt außerdem:
	$U \cap W = \{0\}$.
Es gilt nach der _Dimensionsformel_ in [[#Summe von Untervektorräumen]]:
	$dim_K(U) + dim_K(W) = dim_K(V)$, da $dim_K(U \cap W) = 0$ ist.

### Linearkombination
Bemerkung: statt alle Vektoren $v \in V$ wird oft eine [[Module/LA1/Zusammenfassung/Objekte/Mengen#Teilmenge|Teilmenge]] $M \subseteq V$ genommen.
Eine __Linearkombination__ ist ein Vektor $v \in V$ der als Summe _endlich_ vieler Vektoren $v_i \in V$ und Koeffizienten $a_i \in K$ ausgedrückt werden kann:
	$v = \sum\limits_i a_i v_i$
Für $a_i$ kann auch eine [[Abbildungen|Abbildung]] $\alpha: M \rightarrow K$ genommen, mit $M \subseteq V$. 
Dazu muss $\alpha$ allerdings einen [[Abbildungen#Träger|endlichen Träger]] haben. 

### Vektorraumerzeugnis
Das __Vektorraumerzeugnis__ einer [[Module/LA1/Zusammenfassung/Objekte/Mengen|Menge]] $M \subseteq V$ ist die [[Module/LA1/Zusammenfassung/Objekte/Mengen|Menge]] aller [[#Linearkombination|Linearkombinationen]] die aus mit $v \in M$ und $K$ erzeugt werden können.
Für das __Erzeugnis__ schreibt man $\langle M \rangle$
$M$ wird das __Erzeugendensystem__ von $\langle M \rangle$ genannt.

Gleich wie bei [[Gruppen]], ist $\langle M \rangle$ der kleinste [[#Untervektorraum]] von $V$, der $M$ als [[Module/LA1/Zusammenfassung/Objekte/Mengen#Teilmenge|Teilmenge]] enthält.
Es gilt:
	$\langle M \rangle = \bigcap\limits_{M \subseteq U \leq V} U$
besteht $M$ nur aus einem Element $m$, schreibt man statt $\langle \{ m\} \rangle$ kürzer $K \cdot m$.

### Lineare Abbildung
Eine __$K$-lineare Abbildung__ ist ein synonym für [[Homomorphismen#Vektorraumhomomorphismus|Vektorraumhomomorphismus]].
Seien $V, W$ zwei __Vektorräume__.
$Hom(V, W)$ ist einen [[#Untervektorraum]] von $Abb(V, W)$.

### Basis
Eine __Basis__ eines __Vektorraums__ $V$ ist eine [[Module/LA1/Zusammenfassung/Objekte/Mengen#Teilmenge|Teilmenge]] $B \subseteq V$.
Jeder Vektor $v \in V$ lässt sich auf _genau eine Art_ als [[#Linearkombination]] von $B$ schreiben:
	$v = \sum\limits_i a_i b_i$      mit $a_i \in K$ und $b_i \in B$.
oder auch:
	$\forall v \in V: \exists_1 \lambda \in Abb(B, K)_0 : v = \sum\limits_{b \in B} \lambda(b) \cdot b$
	Es existiert als _genau eine_ [[Abbildungen|Abbildung]] $\lambda$ von der __Basis__ $B$ nach $K$ mit [[Abbildungen#Träger|endlichem Träger]] die man für die [[#Linearkombination]] nutzen kann.

Eine __Basis__ $B$ ist das _kleinste_ [[#Vektorraumerzeugnis|Vektorraumerzeugnissystem]] von $V$: $\langle B \rangle = V$.
Eine __Basis__ ist immer [[#Lineare Abhängigkeit|linear Unabhängig]].
Für einen __Vektorraum__ $K^p$ hat die __Basis__ genau $p$ Elemente.

Zwei __Basen__ $B, C$ von $V$ haben __immer__ die gleiche [[Module/LA1/Zusammenfassung/Objekte/Mengen#Mächtigkeit|Mächtigkeit]].

#### Geordnete Basis
Bei einer __geordneten Basis__ ist die Reihenfolge der Vektoren in $B$ nicht egal, sondern entscheidend.
Beispiel:
	Die __Basis__ $B_1$ von $\mathbb{R}^2$  $B_1 = \left\lbrace\left(\begin{array}{c} 1 \\ 0 \\ 0\end{array}\right), \left(\begin{array}{c}0 \\ 1\\ 0\end{array}\right), \left(\begin{array}{c}0 \\ 0\\ 1\end{array}\right) \right\rbrace$ ist nicht geordnet, da sie egal in welcher Reihenfolge geschrieben werden kann (es ändert sich nur die Reihenfolge der Koordinaten).
	Die komplexen Zahlen $\mathbb{C}$ können als zweidimensionaler __Vektorraum__ über $\mathbb{R}$ aufgefasst werden.
	Hier ist die __Basis__ $B_2 = \left(1, i\right)$ geordnet.
Geordnete Basen werden als $k$-Tupel geschrieben, anstatt als [[Module/LA1/Zusammenfassung/Objekte/Mengen|Menge]].

### Koordinatenvektor
Die [[Abbildungen|Abbildung]] $D_B: V \rightarrow Abb(B, K)_0$ heißt die __Koordinatenabbildung__.
Für einen Vektor $v \in V$ heißt $D_B(v)$ der __Koordinatenvektor__ von $v$.

Da $v$ auch als [[#Linearkombination]] $v = \lambda_1 b_1 + \dots + \lambda_q b_q$ bezüglich der __Basis__ aufgefasst werden kann, gilt: $D_B(v) = D_B(\lambda_1 b_1 + \dots + \lambda_q b_q) = \left(\begin{array}{c}\lambda_1 \\ \vdots \\ \lambda_q\end{array}\right) \in K^q$

### Lineare Abhängigkeit
Sei $M \subset V$ eine [[Module/LA1/Zusammenfassung/Objekte/Mengen#Teilmenge|Teilmenge]] von $V$.
$M$ ist __linear Unabhängig__, wenn sich der _Nullvektor_ als [[#Linearkombination]] von $M$ nur als
	$0 = \sum\limits_{m \in M} 0 \cdot m$  schreiben lässt. Bzw. mit [[Abbildungen]]:
	$0 = \left\lbrack\sum\limits_{m \in M} \lambda(m) \cdot m\right\rbrack \Leftrightarrow \lambda = 0$ für alle $\lambda \in Abb(B, K)_0$.  
__linear Unabhängig__ bedeutet dass $\langle M \rangle = V$ (glaub ich zumindest)

### Dimension
Die __Dimension__ eines __Vektorraumes__ $V$ (über $K$) ist definiert durch die [[Module/LA1/Zusammenfassung/Objekte/Mengen#Mächtigkeit|Mächtigkeit]] der [[#Basis]].
Sei $B$ eine [[#Basis]] von $V$, dann ist die __Dimension__ von $V$ definiert durch:
	$dim_K(V) := |B|$
Gibt es keine endliche __Basis__ $B$ heißt $V$ __unendlichdimensional__, ansonsten __endlichdimensional__.

### Lineare Fortsetzung
Sei $K$ ein [[Körper]] und $V, W$ zwei $K$-[[Vektorräume]] und $B$ eine [[#Basis]] von $V$.

Eine [[#Lineare Abbildung]] $f: V\rightarrow W$ ist eindeutig durch das [[Abbildungen#Bild|Bild]] einer [[#Basis]] $B$ von $V$ bestimmt.

Satz  der __linearen Fortsetzung__:
	Sei $f' \in Abb(B, W)$ eine [[Abbildungen|Abbildung]], dann existiert eine [[#Lineare Abbildung]] $f: V \rightarrow W$ für die gilt:
			$\forall b \in B: f(b) = f'(b)$   (also $f$ auf $B$ eingeschränkt ist $f'$ ($f|_B = f'$))
	$f$ heißt __lineare Fortsetzung__ von $f'$ und ist __eindeutig__.
	Es gilt mit der [[#Linearkombination]]:
		$f(v) = f(\sum\limits_{b \in B} \lambda(b) \cdot b) = \sum\limits_{b \in B} \lambda(b) \cdot f'(b)$
	Man muss $f$ also gar nicht genau kennen um $f(v)$ zu berechnen.
	d.h. [[#Lineare Abbildung|lineare Abbildungen]] stehen in _Bijektion_ zu $Abb(B, W)$. Man schreibt:
		$Hom(V, W) \cong Abb(B, W)$

Dadurch herrscht ein [[Homomorphismen#Isomorphismus|(Vektorraum)Isomorphismus]] zwischen $Hom(V ,W) \rightarrow Abb(B, W), \Phi \mapsto \Phi|_B$

### Linearform
Eine __Linearform__ ist eine $K$-[[#Lineare Abbildung|lineare Abbildung]] von $V$ nach $K$.

### Determinantenfunktion
Sei $V$ ein $K$-[[Vektorräume|Vektorraum]].
Eine __Determinantenfunktion__ $D: (K^n)^n: \rightarrow K$ ist eine [[Abbildungen|Abbildung]] wobei $n = dim_K(V)$, mit den Eigenschaften:
	Seien $v_1, \dots v_n \in V$ beliebige Vektoren.
	- $D(v_1, \dots, v_{i-1}, v_i + v_i^{'}, v_{i+1}, \dots, v_n) = D(v_1, \dots, v_n) + D(v_1, \dots, v_i^{'}, \dots, v_n)$     für $1 \leq i \leq n$
	- $D(v_1, v_2, \dots, \alpha \cdot v_i, \dots, v_n) = \alpha \cdot D(v_1, v_2, \dots, v_n)$      für $1 \leq i \leq n$ und $\alpha \in K$
	- $D(v_1, \dots, v_i, \dots, v_j, \dots, v_n) = 0$    wenn zwei Vektoren $v_i = v_j$ gleich sind (und $i \neq j$)

Für $D$ gilt:
	- $D$ ist eine __Multilinearform__, d.h.:
		Für jedes $v_i$ ist die [[Abbildungen|Abbildung]] $v_i \mapsto D(v_1, \dots, v_i, \dots, v_n)$ eine [[#Linearform]].
	- Addiert man ein $K \ni \alpha$-faches $v_j$ zu $v_i$ (mit $i \neq j$), gilt:
		$D(v_1, \dots , v_i + \alpha v_j , \dots , v_j , \dots , v_n) = D(v_1, \dots , v_n)$
	- Vertauscht man die Indizies von $v_1, \dots, v_n$ durch eine [[Permutationen|Permutation]], ändert sich das Vorzeichen von $D$ durch das [[Permutationen#Signum|Signum]] (also $\pm 1$):
		$D(v_{\sigma(1)}, \dots, v_{\sigma(n)}) = sign(\sigma) \cdot D(v_1, \dots, v_n)$
