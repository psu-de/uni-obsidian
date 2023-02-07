
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