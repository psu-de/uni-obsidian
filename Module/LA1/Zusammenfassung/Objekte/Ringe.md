## Definition
Ein __Ring__ ist eine [[Module/LA1/Zusammenfassung/Objekte/Mengen|Menge]] $R$ mit zwei [[Abbildungen#Verknüpfung|Verknüpfungen]]:
	- Die _kommutative_ __Addition__ $+$
	- Die _assoziative_ __Multiplikation $\cdot$

Ein __Ring__ muss folgende Eigenschaften erfüllen:
	- $(R, +)$ ist eine [[Gruppen#Abelsche Gruppe|abelsche Gruppe]]. 
		Das __neutrale Element__ wird als $0_R$ geschrieben (oder einfach $0$).
	- Die __Multiplikation__ $\cdot$ ist _assoziativ_.
		Für die __Multiplikation__ muss ein _Einselement_ $1_R$ existieren, für das gilt:
		$\forall x \in R: 1_R \cdot x = x \cdot 1_R = x$
	- Es gelten die __Distributivgesetze__:
		$\forall x, y, z \in R:$
			$x \cdot (y + z) = (x \cdot y) + (x \cdot z)$,
			$(y + z) \cdot x = (y \cdot x) + (z \cdot x)$

### Kommutativer Ring
Ist die __Multiplikation__ eines Ringes $R$ _kommutativ_, heißt der Ring __kommutativer Ring__.

### Teilring
Sei $(R, +, \cdot)$ ein __Ring__.
Ein __Teilring__ $T$ von $R$ ist eine [[Module/LA1/Zusammenfassung/Objekte/Mengen#Teilmenge|Teilmenge]] von $R$.
Für einen __Teilring__ gelten folgende Eigenschaften:
	- $1_R \in T$
	- $\forall t_1, t_2 \in T: t_1 + t_2 \in T$
	- $\forall t_1, t_2 \in T: t_1 \cdot t_2 \in T$
	- $(T, +, \cdot)$ ist selbst ein __Ring__.

### Einheiten
Ein Element aus $R$ das bezüglich der _Mutliplikation_ __invertierbar__ ist, heißt __Einheit__ in $R$.
Für eine solche __Einheit__ gilt:
	$\exists y \in R: x \cdot y = y \cdot x = 1_R$
$y$ ist _eindeutig_, und man schreibt auch $x^{-1}$.

### Einheitengruppe
Die __Einheitengruppe__ $R^{\times}$ ist die [[Module/LA1/Zusammenfassung/Objekte/Mengen|Menge]] aller [[#Einheiten]] in $R$.
$R^{\times}$ bildet mit der __Multiplikation__ die [[Gruppen|Gruppe]] $(R^{\times}, \cdot)$

### Nullteilerfreiheit
Ein __Ring__ $R$ mit $R \neq \{0_R\}$ für den gilt
	$\forall a, b \in R \setminus \{0_R\}: a \cdot b \neq 0_R$
heißt __nullteilerfreier Ring__.

### Zentrum
Sei $R$ ein __Ring__.
Das __Zentrum__ ist ein [[#Kommutativer Ring|kommutativer]] [[#Teilring]] von $R$.
Definition:
	$Z(R) := \{ r\in R\ |\ \forall x \in R: r \cdot x = x \cdot r\}$
Ist $R$ ein [[#Kommutativer Ring]], gilt:
	$Z(R) = R$.
