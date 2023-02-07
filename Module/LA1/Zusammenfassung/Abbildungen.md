# Defintion
Seien $M,N$ zwei [[Mengen#Definition|Mengen]].
Eine __Abbildung__ $f: M \rightarrow N$ ordnet jedem $m \in M$ __genau ein__ $n\in N$ zu.

$M$ heißt __Definitionsbereich__
$N$ heißt __Wertebereich__

__Eigenschaften__:
	- $f \subseteq M \times N$
	- $\forall m \in M: \exists_1 n \in N: (m, n) \in f$     
	- $\forall m \in M: f(m) \in N \land (m, f(m)) \in f$

$Abb(M, N)$ ist die [[Mengen#Definition|Menge]] aller __Abbildungen__ von $M \rightarrow N$.
Auch $N^M$ geschrieben.

### Gleichheit
Zwei [[Abbildungen#Defintion|Abbildungen]] $f, g: M \rightarrow N$ werden als __gleich__ bezeichnet, wenn gilt:
	$\forall m \in M: f(m) = g(m)$
	also jedes $m \in M$ von $f$ und $g$ den selben Wert $n \in N$ zugeordnet bekommt.

### Identität
Die __Identität__ ist eine [[#Defintion|Abbildung]] $Id_M: M \rightarrow M$ und definiert durch:
	$\forall m \in M: Id_M(m) := m$

### Komposition von Abbildungen
Seien 
	$f: M \rightarrow N$ und
	$g: N \rightarrow O$ 
zwei [[#Defintion|Abbildungen]].

Die __Komposition__ $g \circ f$ ist definiert durch:
	$g\circ f := \{ (m, o) \in M \times O|\exists n \in N: (m, n) \in f \land (n, o) \in g \}$
Es gilt:
	$(g \circ f)(m) = g(f(m))$

Kompositionen sind __assoziativ__:
	$(h \circ g) \circ f = h \circ (g \circ f)$
für 3 [[#Defintion|Abbildungen]] $f, g, h$.

### Urbild
Sei $f: M \rightarrow N$ eine [[#Defintion|Abbildung]].
Das __Urbild__ $f^{-1}$ ist definiert durch:
	$f^{-1}: \mathcal{P} \rightarrow \mathcal{M}$
	$f^{-1}(B) := \{m \in M|f(m) \in B\}$
	Das __Urbild__ gibt alle Werte in $M$ zurück, für die $f(m)$ in $B$ liegt.
	$B$ muss eine [[Mengen#Teilmenge|Teilmenge]] von $N$ sein: $B \subseteq N$.

### Bild
Sei $f: M \rightarrow N$ eine [[#Defintion|Abbildung]].
Das __Bild__ ist definiert durch:
	$f(A) := \{f(a)|a \in A\} \subseteq N$
	Es ordnet einer [[Mengen#Definition|Menge]] $A \subseteq M$ die korrespondierenden Werte $f(m)$ zu.

### Umkehrabbildungen / Inverse
Sei $f: M \rightarrow N$
Für die __Umkehrabbildung__ $f^{-1}$ gilt:
	$(f \circ f^{-1}) = Id_N$
	$(f^{-1} \circ f) = Id_M$
	(siehe [[#Identität]])

Die __Umkehrabbildung__ wird auch __inverse__ genannt.

### Injektiv
Eine [[Abbildungen#Defintion|Abbildung]] heißt __injektiv__, wenn gilt:
	$\forall m_1, m_2 \in M: [f(m_1) = f(m_2)] \Rightarrow [m_1 = m_2]$
	$f(m)$ liefert nur dann den selben Wert wenn $m$ auch gleich ist, $m$ lässt sich also eindeutig aus $f(m)$ bestimmen.

 Ist eine [[Abbildungen#Defintion|Abbildung]] __injektiv__, existiert eine [[#Umkehrabbildungen / Inverse]].

### Surjektiv
Eine [[Abbildungen#Defintion|Abbildung]] heißt __surjektiv__, wenn gilt:
	$f(M) = N$
	$f(M)$ bildet also auf __alle__ Werte $n \in N$ ab.
Eine __surjektive__ [[Abbildungen#Defintion|Abbildung]] wird auch __rechtstotal__ genannt.

### Bijektiv
Eine [[Abbildungen#Defintion|Abbildung]] heißt __bijektiv__, wennn sie sowohl [[#Injektiv]] als auch [[#Surjektiv]] ist.


### Verknüpfung
Sei $M$ eine [[Mengen#Definition|Menge]].
Eine __Verknüpfung__ $*$ auf $M$ ist eine [[Abbildungen#Defintion|Abbildung]]:
	$*: M \times M \rightarrow M$
Die __Verknüpfung__ wird _infix_ geschrieben, d.h. statt $*(m_1, m_2)$ schreibt man $m_1 * m_2$.

___Assoziativität___ gilt wenn: 
	$\forall m_1, m_2, m_3 \in M: (m_1 * m_2) * m_3 = m_1 *  (m_2 * m_3)$
	
___Kommutativität___ gilt wenn:
	$\forall m_1, m_2 \in M: m_1 * m_2 = m_2 * m_1$

### Träger
Der __Träger__ einer __Abbildung__ $f$ bezeichnet die [[Mengen|Menge]] aller Werte aus dem __Definitionsbereich__, für den $f(x) \neq 0$ ist.
Ist diese [[Mengen|Menge]] endlich, so hat die __Abbildung__ einen _endlichen __Träger___.

$Abb(M, N)_0 := \{f \in Abb(M, N)\ |\ f \text{ hat endlichen Träger}\}$
