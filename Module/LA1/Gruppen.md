
# Definition
Sei $M$ eine [[Mengen#Definition|Menge]], und $*$ eine [[#Verknüpfung]].
$(M, *)$ bildet eine __Gruppe__, wenn alle Bedingungen erfüllt sind:
	1) Die [[#Verknüpfung]] $*$ ist __assoziativ__.
	2) __Neutrales Element__:
			Es gibt (mindestens) ein __neutrales Element__ $e \in M$, für das gilt:
				$\forall x \in M: x * e = e * x = x$
			Man schreibt oft $e_M$.
	3) __Inverse Elemente__:
			$\forall x \in M: \exists y \in M: x * y = y * x = e_M$
			Für jedes $x \in M$ gibt es ein __inverses Element__ $y \in M$ für das gilt:
				 $x * y = y * x = e$
			Das __inverse Element__ wird oft als $x^{-1}$ geschrieben

### Verknüpfung
Sei $M$ eine [[Mengen#Definition|Menge]].
Eine __Verknüpfung__ $*$ auf $M$ ist eine [[Abbildungen#Defintion|Abbildung]]:
	$*: M \times M \rightarrow M$
Die __Verknüpfung__ wird _infix_ geschrieben, d.h. statt $*(m_1, m_2)$ schreibt man $m_1 * m_2$.

___Assoziativität___ gilt wenn: 
	$\forall m_1, m_2, m_3 \in M: (m_1 * m_2) * m_3 = m_1 *  (m_2 * m_3)$
	
___Kommutativität___ gilt wenn:
	$\forall m_1, m_2 \in M: m_1 * m_2 = m_2 * m_1$

### Abelsche Gruppe
Eine [[#Definition|Gruppe]] heißt __abelsch__, wenn die [[#Verknüpfung]] __kommutativ__ ist.

### Untergruppen
Eine __Untergruppe__ $(H, \circ)$ einer [[#Definition|Gruppe]] $(G, *)$ ist eine [[Mengen#Teilmenge|Teilmenge]] von $G$.
Für die __Untergruppe__ gilt:
	- $\forall h_1, h_2 \in H: h_1 \circ h_2 = h_1 * h_2$
	- $\forall h_1, h_2 \in H: h_1 \circ h_2 \in H$
	- $e_G \in H$
	- $\forall h \in H: h^{-1} \in H$

Wenn $H \subseteq G$ ist $(H, *)$ eine __Untergruppe__, wenn:
	$(H \neq \emptyset) \land (\forall h_1, h_2 \in H: h_1 * h_2^{-1} \in H$  

