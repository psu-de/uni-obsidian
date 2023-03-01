
# Definition
Sei $M$ eine [[Module/LA1/Zusammenfassung/Objekte/Mengen#Definition|Menge]], und $*$ eine [[Abbildungen#Verknüpfung|Verknüpfung]].
$(M, *)$ bildet eine __Gruppe__, wenn alle Bedingungen erfüllt sind:
	1) Die [[Abbildungen#Verknüpfung|Verknüpfung]] $*$ ist __assoziativ__.
	2) __Neutrales Element__:
			Es gibt (mindestens) ein __neutrales Element__ $e \in M$, für das gilt:
				$\forall x \in M: x * e = e * x = x$
			Man schreibt oft $e_M$.
	3) __Inverse Elemente__:
			$\forall x \in M: \exists y \in M: x * y = y * x = e_M$
			Für jedes $x \in M$ gibt es ein __inverses Element__ $y \in M$ für das gilt:
				 $x * y = y * x = e$
			Das __inverse Element__ wird oft als $x^{-1}$ geschrieben

### Abelsche Gruppe
Eine [[#Definition|Gruppe]] heißt __abelsch__, wenn die [[Abbildungen#Verknüpfung|Verknüpfung]] __kommutativ__ ist.

### Untergruppen
Eine __Untergruppe__ $(H, \circ)$ einer [[#Definition|Gruppe]] $(G, *)$ ist eine [[Module/LA1/Zusammenfassung/Objekte/Mengen#Teilmenge|Teilmenge]] von $G$.
Für die __Untergruppe__ gilt:
	- $\forall h_1, h_2 \in H: h_1 \circ h_2 = h_1 * h_2$
	- $\forall h_1, h_2 \in H: h_1 \circ h_2 \in H$
	- $e_G \in H$
	- $\forall h \in H: h^{-1} \in H$

Wenn $H \subseteq G$ ist $(H, *)$ eine __Untergruppe__, wenn:
	$(H \neq \emptyset) \land (\forall h_1, h_2 \in H: h_1 * h_2^{-1} \in H$  

Satz: Für zwei __Untegruppen__ $H, M$ gilt: $H \cap M$ ist auch eine __Untergruppe__.

### Gruppenerzeugnis
Sei $(G, *)$ eine [[Gruppen|Gruppe]], und $M$ eine [[Module/LA1/Zusammenfassung/Objekte/Mengen#Teilmenge|Teilmenge]] von $G$.
Das __Gruppenerzeugnis__ $\langle E \rangle$ ist die _kleinste_ [[#Untergruppen|Untergruppe]] von $G$, die $M$ enthält.
Sei $I$ die [[Module/LA1/Zusammenfassung/Objekte/Mengen|Menge]] aller [[#Untergruppen]] die $M$ enthalten.
	$\langle M \rangle := \bigcap\limits_{i\in I} i$
$\langle M \rangle$ enthält genau die Elemente, die sich durch _endlich_ viele Operationen $*$ auf die Elemente von  $M \cup M^{-1}$ ergeben ($M^{-1} := \{ m^{-1} | m \in M \}$).
Gibt es eine [[#Untergruppen|Untergruppe]] $U$, für die $U = \langle M \rangle$ gilt, so heißt $M$ __Erzeugendensystem___ von $U$.

### Zyklische Gruppe
Gibt es eine [[#Untergruppen|Untergruppe]] $U$, deren __Erzeugendensystem__ aus _einem_ Element $g$ besteht, so heißt die [[#Untergruppen|Untergruppe]] $U$ __zyklisch__. Es wird geschrieben:
	$U = \langle \{ g \} \rangle = \langle g \rangle$
Es gilt:
	$\langle g \rangle := \{ g^z | z \in \mathbb{Z} \}$

### Ordnung
Die __Ordnung__ oder auch __kardinalität__ einer [[Gruppen|Gruppe]] $(G, *)$ ist definiert durch die Anzahl der Elemente von $G$. 
Die __Ordnung__ eines Elementes $g \in G$ ist definiert durch die __Ordnung__ der von $g$ [[#Gruppenerzeugnis|erzeugten Untergruppe]]. 

### Die symmetrische Gruppe
Sei $D := \{1, 2, \dots, n\}$ mit $n \in \mathbb{N}$
Die __symmetische Gruppe__ $M$ ist eine __Gruppe__ auf $D$ mit der [[#Verknüpfung]] $\circ$ und beinhaltet alle [[Abbildungen#Bijektiv|bijektiven]] [[Abbildungen]] von $D$  nach $D$:
	$M := Sym(D) = \{ f \in Abb(D, D)\ |\ f \text{ bijektiv} \}$
Die __symmetrische Gruppe__ enthält alle [[Permutationen]] auf $D$.


### Gruppenoperation
Sei $(G, *)$ eine [[Gruppen|Gruppe]] und $M$ eine [[Module/LA1/Zusammenfassung/Objekte/Mengen|Menge]].
Eine __Operation__ ist eine [[Abbildungen|Abbildung]] von $G$ nach $M$:
	$\bullet: G \times M \rightarrow M$

Eine __Operation__ muss folgende Eigenschaften erfüllen:
	- $\forall m \in M: e_G \bullet m = m$
	- $\forall m \in M, g_1, g_2 \in G: g_1 \bullet (g_2 \bullet m) = (g_1 * g_2) \bullet m$

In bezug auf [[#Die symmetrische Gruppe]] gilt:
	Wenn $G \subseteq S_M$ eine [[#Untergruppen|Untergruppe]] der [[#Die symmetrische Gruppe|symmetrischen Gruppe]] von $M$ ist, gibt es die __Opertionen__:
		$g \bullet m := g(m)$  für alle $g \in G$.
