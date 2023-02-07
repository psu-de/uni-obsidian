Ein Homomorphismus beschreibt eine Strukturerhaltende [[Abbildungen|Abbildung]] zwischen zwei Objekten:
	$\Phi: O \rightarrow P$

#### Endomorphismus
Ein __Homomorphismus__ von $O$ nach $O$
	$\Phi: O \rightarrow O$
wird generell __Endormorphismus__ genannt.

#### Isomorphismus
Ein __Homomorphismus__ $\Phi: O \rightarrow P$ heißt generell __Isomorphismus__, wenn $\Phi$ [[Abbildungen#Bijektiv|bijektiv]] ist.

#### Automorphismus
Ein [[Abbildungen#Bijektiv|bijektiver]] [[#Endomorphismus]] $\Phi: O \rightarrow O$ heißt __Automorphismus__.


### Gruppenhomomorphismus
Seien $(G, *)$ und $(H, \circ)$ zwei [[Gruppen]].
Für einen __Gruppenhomomorphismus__	$\Phi: G \rightarrow H$ gilt:
	- $\forall x, y \in G: \Phi(x * y) = \Phi(x) \circ \Phi(y)$

##### Kern eines Gruppenhomomorphismus
Der __Kern__ ist definiert durch das [[Abbildungen#Urbild|Urbild]] des __neutralen Elements__ $e_G$:
	$Kern(\Phi) := \{x \in G\ |\ \Phi(x) = e_G\} = \Phi^{-1}(\{e_G\})$
Der __Kern__ ist eine [[Gruppen#Untergruppen|Untergruppe]] von $G$. 
Es gilt: $\Phi$ ist [[Abbildungen#Injektiv|Injektiv]], genau dann wenn:
	$Kern(\Phi) = \{e_G\}$

### Ringhomomorphismus
Seien $(R, +_R, \cdot_R)$ und $(S, +_S, \cdot_S)$ zwei [[Ringe]].
Für einen __Ringhomomorphismus__ $\Phi: R \rightarrow S$ gilt:
	- $\forall x, y \in R: \Phi(x +_R\ y) = \Phi(x) +_S\ \Phi(y)$
	- $\forall x, y \in R: \Phi(x \cdot_R\ y) = \Phi(x) \cdot_S\ \Phi(y)$
	- $\Phi(1_R) = 1_S$

___Jeder Ringhomomorphismus ist auch ein [[#Gruppenhomomorphismus]] von $(R, +_R)$ nach $(S, +_S)$.___
___Der Kern eines Ringhomomorphismus ist der Kern dieses [[#Gruppenhomomorphismus]]___
Der __Kern__ bildet eine [[Gruppen#Untergruppen|Untergruppe]] von $(R, +_R)$.

### Körperhomomorphismus
Seien $(K, +_K, \cdot_K)$ und $(L, +_L, \cdot_L)$ zwei [[Körper]].
Ein __Körperhomomorphismus__ $\Phi: K \rightarrow L$ ist im wesentlichen ein [[#Ringhomomorphismus]] mit der zusätzlichen Bedingung, dass $\Phi(0_K) = 0_L$ ist.

Ein __Körperhomomorphismus__ ist außerdem immer [[Abbildungen#Injektiv|injektiv]], da für den __Kern__ stehts gilt
	$Kern(\Phi) = \{0_L\}$
gilt.

### Vektorraumhomomorphismus
Sei $K$ ein [[Körper]] und $V, W$ zwei $K$-[[Vektorräume]].
Für einen __Vektorraumhomomorphismus__ $\Phi: V \rightarrow W$ gilt:
	- $\forall u, v \in V: \Phi(u + v) = \Phi(u) + \Phi(v)$
	- $\forall a \in K, v \in V: \Phi(a\cdot v) = a \cdot \Phi(v)$
Der __Vektorraumhomomorphismus__ ist also strukturerhaltend genenüber der __Vektoraddition__ und der __skalaren Multiplikation__.
Da die __Vektoraddition__ also strukurerhaltend ist, ist $\Phi$ also auch ein [[#Gruppenhomomorphismus]] von $(V,+)$ nach $(W, +)$.

#### Kern
Der __Kern__ des __Vektorraumhomomorphismus__ ist gleich wie beim [[#Gruppenhomomorphismus]].
Der __Kern__ von $\Phi$ ist ein [[Vektorräume#Untervektorraum|Untervektorraum]] von $V$.