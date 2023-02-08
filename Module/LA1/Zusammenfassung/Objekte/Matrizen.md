
## Definition
Sei $R$ ein [[Ringe#Kommutativer Ring|kommutativer Ring]] und $p, q \in \mathbb{N}$
Eine $p\times q$-Matrix ist eine [[Abbildungen|Abbildung]]:
	$A: \{1, \dots p\}\times\{1, \dots, q\} \rightarrow R$
$p$ ist die Anzahl an __Zeilen__.
$q$ ist die Anzal an __Spalten__.

Statt $A(i, j)$ schreibt man $a_{ij}$
Die Matrix wird geschrieben als:

$A =	\begin{pmatrix}		a_{1,1} & a_{1,2} & \dots & a_{1,q} \\		a_{2,1} & a_{2,2} & \dots & a_{2,q} \\		\vdots  & \vdots  &  & \vdots \\		a_{p,1} & a_{p,2} & \dots & a_{p,q}	\end{pmatrix}$

$R^{p\times q}$ gibt die [[Mengen|Menge]] aller $p\times q$-Matrizen an.

#### Matrizenring
Die Matrizen auf $R^{p \times p}$ bilden einen [[Ringe|Ring]] $(R^{p \times p}, +, \cdot)$
Das __Einselement__ ist $I_p$.
Das __Nullelement__ ist die _Nullmatrix_.
Wenn $R \neq \{0\}$ und $p \geq 2$, so es kein [[Ringe#Kommutativer Ring|kommutativer Ring]].

### Transposition
Sei $A \in R^{p \times q}$ eine Matrix.
Die __transponierte Matrix__ $A^T$ ist definiert durch:
	$A^T(i, j) := A(j, i)$
Es gilt:
	$(A \cdot B)^T = B^T \cdot A^T$

### Multiplikation
Seien $A, C$ zwei Matrizen.
Damit man $A$ und $C$ multiplizieren kann, muss __$A$ so viele _Spalten_ haben, wie $C$ _Zeilen_ hat__.
Definition:
	$F = A \cdot C$
	$f_{ik} := \sum\limits_{j=1}^{q} a_{ij} c_{jk}$
d.h. $F(i, j)$ entsteht durch das Multiplizieren der $i$-ten Zeile in $A$ mit der $k$-ten Spalte von $C$.
Für  $F = A \cdot C$ wird auch $F = \Phi_A(C)$ 

Die Multiplikation von Matrizen ist __assoziativ__:
	$A \cdot (B \cdot C) = (A \cdot B) \cdot C$

### Addition
Seien $A, C \in R^{p\times q}$ 
Damit zwei Matrizen Addiert werden können, müssen sie __gleich viele Zeilen und Spalten__ haben.
Definition:
	$F = A + C$
	$F(i, j) := A(i, j) + C(i, j)$

Die Matrizen aus $R^{p\times q}$ bilden eine [[Gruppen#Abelsche Gruppe|abelsche Gruppe]] $(R^{p \times q}, +)$.
Die __Addition__ ist also _kommutativ_ und _assoziativ_.

### Skalarmultiplikation
Sei $A$ eine Matrix: $A \in R^{p\times q}$ und $r \in R$.
Die __Skalarmultiplikation__ von $A$ mit $r$ ist definiert durch:
	$r \cdot A = A \cdot r := (r \cdot a_{ij})_{ij}$
Die __Skalarmultiplikation__ ist _assoziativ_ und _kommutativ_.

### Einheitsmatrix
Die $p\times p$-__Einheitsmatrix__ ist definiert durch:
	$I_p := \begin{cases} 1 & \text{falls } i = j \\ 0 & \text{falls } i \neq j\end{cases}$
Die __Einheitsmatrix__ hat als Einträge nur _nullen_, bis auf die Diagonale von (1,1) nach (p, p), auf der nur _einsen_ sind.

### Elementarmatrizen
Die __Elementarmatrix__ ist eine Matrix mit __genau einer Eins__ an der Stelle $(i, j)$ und hat sonst nur __nullen__ als Einträge:
	$E_{ij}(j, k) := \begin{cases} 1 & \text{falls } i=k \text{ und } j = l \\ 0 & \text{sonst}\end{cases}$

Für __Elementarmatrizen__ mit nur __einer Spalte__ $E_{i, 1} \in R^{1\times q}$:
	$e_j := E_{i,1} \in R^q$ 

### Additionsmatrizen
Die __Additionsmatrix__ ist eine [[#Invertierbare Matrizen|invertierbare Matrix]] $p\times p$-Matrix. Sie ist die [[#Einheitsmatrix]] mit einem Wert $\alpha \in R$ an der Stelle $(i, j)$, wobei $(i, j)$ nicht auf der Diagonalen liegen darf (also $i\neq j$).
Definition:
	$A_{ij}(\alpha) := I_p + \alpha E_{ij}$
Multipliziert man eine Matrix $M$ mit $A_{ij}(\alpha)$ entsteht die resultierende Matrix indem man zur $i$-ten Zeile von $M$ das $\alpha$-Fache der $j$-ten Zeile von $M$ addiert.

### Vertauschungsmatrix
Eine __Vertauschungsmatrix__ wird genutzt um Zeilen in Matrizen zu tauschen.
Definition:
	$V_{ij} := I_p - E_{ii} - E_{jj} + E_{ij} + E_{ji}$
$V_{ij}$ entsteht durch das Vertauschen der Einsen der [[#Einheitsmatrix]] an den Stellen $(i, i)$ und $(j, j)$ mit den Nullen an den Stellen $(j, i)$ und $(i, j)$.
Multipliziert man eine Matrix $M$ mit $V_{ij}$ ensteht die resultierende Matrix durch das Vertauschen der $i$-te und $j$-te Zeile von $M$. 

### Diagonalmatrix
Die __Diagonalmatrix__ ist die wie die [[#Einheitsmatrix]], allerdings mit den Werten $\alpha_1, \dots, \alpha_p$ anstatt von _Einsen_ auf der Diagonalen.
Definition:
	$diag(\alpha_1, \dots, \alpha_p) := \sum\limits_{i=1}^p \alpha_i E_{ii} \in R^{p \times p}$
Multipliziert man eine Matrix $M$ mit $diag(\alpha_1, \dots, \alpha_p)$ entsteht die resultierende Matrix durch das Multiplizieren der $i$-ten Zeile mit $\alpha_i$.
Wenn alle $\alpha_i \in R$ gilt, ist die Matrix [[#Invertierbare Matrizen|invertierbar]].

### Invertierbare Matrizen
Die [[Ringe#Einheitengruppe|Einheitengruppe]] des [[#Matrizenring|Matrizenrings]] $R^{p\times p}$ wird mit $GL_p(R)$ bezeichnet:
	$GL_p(R) := \{A \in R^{p\times p}\ |\ \exists B \in R^{p \times p}: AB = BA = I_p\}$
Die Matrizen in $GL_p$ heißen invertierbare Matrizen. Es gilt:
	$GL_p(R) \ni A: A \cdot A^{-1} = A^{-1} \cdot A = I_p$

### Determinante
... Definition folgt.

Wenn gilt: $det(A) \neq 0$, ist die Matrix [[#Invertierbare Matrizen|invertierbar]].

### Gauß-Normalform
Eine __Matrix__ $T$ hat __Gauß-Normalform__ oder auch __Treppenform__ genannt, wenn sich mit zunehmender Zeilenzahl die Spalten auf der linken Seite zunehmend mit Nullen gefüllt sind.
Beispiel:
$$
A =\begin{pmatrix}
	0 & 1 & 0 & 4 & 2 & 3 \\
	0 & 0 & 1 & 2 & 0 & 2 \\
	0 & 0 & 0 & 0 & 1 & 3 \\
	0 & 0 & 0 & 0 & 0 & 0
\end{pmatrix}
$$
Diese __Matrix__ ist in __Gauß-Normalform__.
#### Rang
Der __Rang__ bezeichnet den _letzten Zeilenindex_ in $A$, in der noch _mindestens eine_ andere Zahl als $0$ steht.
Alle Zeilen die unter dem __Rang__ stehen dürfen nur $0$ enhalten.
Im Beispiel von $A$ ist $Rang(A) = 3$.

#### Stufenindizes
Für jede Zeile einer Matrix in __Gauß-Normalform__ die nicht nur aus nullen besteht (also gibt es $Rang(A)$ viele __Stufenindizes__), gibt es einen __Stufenindex__ $s_i$, wobei $i$ die Zeile der Matrix angibt.

$s_i$ gibt nun den Index der Spalte an, an der die erste Zahl $\neq 0$ in der Zeile $i$ steht.
Alle Elemente links von $s_i$ in der Zeile $i$ sind $0$.
Im Beispiel von $A$ gibt es 3 __Stufenindizes__, da $Rang(A) = 3$. Die __Stufenindizes__ sind:
	$s_1 = 2$, $s_2 = 3$, $s_3 = 5$

### Abbildungsmatrix
Seien $V, W$ zwei $K$-[[Vektorräume]], mit beliebigen [[Vektorräume#Dimension|Dimensionen]] $dim_K(V) = q$ und  $dim_K(W) = p$.
Dazu sei $B := \{b_1, \dots, b_q\}$ eine [[Vektorräume#Basis|Basis]] von $V$, und $C := \{c_1, \dots, c_p\}$ eine [[Vektorräume#Basis|Basis]] von $W$.
Zudem ist durch $\Phi: V \rightarrow W$ ein [[Homomorphismen#Vektorraumhomomorphismus|Homormorphismus]] gegeben.

Eine __Abbildungsmatrix__ wird genutzt, um die _Koeffizenten_ der Basen $c_i$ zu bestimmen, um $\Phi(v) \in W$ als [[Vektorräume#Linearkombination|Linearkombination]] von $C$ zu schreiben.

Sei $A \in K^{p \times q}$ die __Abbildungsmatrix__.
Für alle $b_j \in B$ wird $\Phi(b_j)$ wird als [[Vektorräume#Linearkombination|Linearkombination]] von $C$ geschrieben:
	$\Phi(b_j) = a_{1j} c_1 + a_{2j} c_2 + \dots + a_{pj} c_p = \sum\limits_{k=1}^{p} a_{kj} c_k$
Die __Abbildungsmatrix__ von $\Phi$ ergibt sich, indem man die _Koeffizienten_ $a_{ij}$ von $b_j$ spaltenweise in $A$ schreibt. Die $j$-te Base in $B$ ergibt also die Spalte $j$ in $A$.

Die __Abbildungsmatrix__ bezüglich eines [[Homomorphismen#Vektorraumhomomorphismus|Homormorphismus]] und zwei [[Vektorräume#Basis|Basen]] $B, C$ wird in der Regel geschrieben als:
	$D_{CB}(\Phi) := A$

Für die [[Vektorräume#Koordinatenvektor|Koordinatenabbildungen]] $D_B: V \rightarrow K^q$ und $D_C: W \rightarrow K^q$ gilt:
	$D_C(\Phi(v)) = D_{CB}(\Phi) \cdot D_B(v)$
