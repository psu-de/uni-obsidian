
# Definition
Eine (_zweistellige_) __Realtion__ ist eine [[Module/LA1/Zusammenfassung/Objekte/Mengen#Teilmenge|Teilmenge]] $R \subseteq M\times M$ auf eine beliebige [[Module/LA1/Zusammenfassung/Objekte/Mengen#Definition|Menge]] $M$.

Statt $(x, y) \in R$ schreibt man oft $xRy$.

### Reflexiv
Eine [[#Definition|Relation]] heißt __reflexiv__, wenn gilt:
	$\forall x \in M: xRx$
	d.h. zwei gleiche Werte $(x, x), x \in M$  ist immer in der Relation enthalten.
	Bsp: die [[#Definition|Relation]] $=$ ist __reflexiv__: $\forall x \in \mathbb{R}: x=x$

### Symmetrisch
Eine [[#Definition|Relation]] heißt __symmetrisch__, wenn gilt:
	$\forall x,y \in M: xRy \Leftrightarrow yRx$
	d.h. wenn zwei Werte $(x, y)$ in der [[#Definition|Relation]] sind, ist auch $(y, x)$ in der [[#Definition|Relation]].
	Bsp: die [[#Definition|Relation]] $=$ ist __symmetrisch__: $\forall x,y \in \mathbb{R}: x=y \Leftrightarrow y = x$

### Antisymmetrisch
Eine [[#Definition|Relation]] heißt __antisymmetrisch__, wenn gilt:
	$\forall x,y \in M: [xRy \land yRx] \Rightarrow x = y$
	d.h. wenn für zwei Werte $x, y$, $(x, y)$ und $(y, x)$ in der [[#Definition|Relation]] sind, müssen $x$ und $y$ gleich sein.
	Bsp: die [[#Definition|Relation]] $\leq$ ist __antisymmetrisch__: $\forall x,y \in \mathbb{R}: [x\leq y \land y\leq x] \Rightarrow x = y$

### Transitiv
Eine [[#Definition|Relation]] heißt __transitiv__, wenn gilt:
	$\forall x,y,z \in M: [xRy \land yRz] \Rightarrow xRz$
	d.h. wenn $(x, y)$ und $(y, z)$ in der [[#Definition|Relation]] ist, ist auch $(x, z)$ in der [[#Definition|Relation]].
	Bsp: die [[#Definition|Relation]] $<$ ist __reflexiv__: $\forall x, y, z \in \mathbb{R}: [x<y \land y<z] \Rightarrow x < z$

### Äquivalenzrelation
Eine [[#Definition|Relation]] heißt __Äquivalenzrelation__, wenn sie [[#Reflexiv]], [[#Symmetrisch]] und [[#Transitiv]] ist.
Auf ihr gibt es sogennante [[#Äquivalenzklassen]]

### Äquivalenzklassen
Sei $R$ eine [[#Äquivalenzrelation]] auf der [[Module/LA1/Zusammenfassung/Objekte/Mengen#Definition|Menge]] $M$.

Eine __Äquivalenzklasse__ von $x$ (bezüglich R) ist definiert durch:
	$[x]_R := \{y \in M|xRy\} \subseteq M$
	Also alle $y \in M$ die mit $(x, y)$ auch ein Teil von $R$ sind.
	(Siehe [[Module/LA1/Zusammenfassung/Objekte/Mengen#Teilmenge|Teilmenge]])

Für __Äquivalenzklassen__ gilt:
	- $M = \bigcup\limits_{x \in M} [x]_R$
		d.h.: Alle _Äquivalenzklassen_ zusammen bilden $M$.
	- $\forall x, y \in M: ([x]_R \cap [y]_R = \emptyset) \lor ([x]_R = [y]_R)$
		d.h.: kein $m \in M$ kann in zwei _Äquivalenzklassen_ sein.
Diese Eigenschaften können auch umgekehrt angewandt werden, um zu beweisen dass es Äquivalenzklassen gibt.

