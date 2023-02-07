## Definition
Sei $R$ ein [[Ringe|Ring]].
Ein __Polynom__ ist eine Folge $(a_i)_{i \in \mathbb{N}_0}$ mit $a_i \in R$.
Da ein __Polynom__ nur _endlich_ viele Einträge hat, existiert ein $N \in \mathbb{N}$ für das gilt:
	$\forall i \geq N: a_i = 0$

Ein __Polynom__ wird in der Regel geschrieben als:
	$f = \sum\limits_{i=0}^{N} r_i X^i$ oder $(a_i)_{i \in \mathbb{N}_0}$
wobei $r_i$ die Einträge der Folge $a_i$ sind.

### Grad eines Polynoms
Sei $f = \sum\limits_{i=0}^{N} r_i X^i$ ein Polynom.
Der __Grad eines Polynoms__ gibt das höchste $i$ an, für das der _koeffizient_ $r_i \neq 0$ ist.
Definition:
	$Grad(f) :=\begin{cases}	max(\{i\in \mathbb{N}_0\ |\ r_i \neq 0\}) & f \neq 0 \\	-\infty & f = 0\end{cases}$

Für zwei __Polynome__ $f, g$ in $R$ gilt:
	- $Grad(f + g) \leq max(Grad(f), Grad(g))$
	- $Grad(f \cdot g) \leq Grad(f) + Grad(g)$
	- $Grad(f \cdot g) = Grad(f) + Grad(g)$ wenn $R$ [[Ringe#Nullteilerfreiheit|nullteilerfrei]] ist

### Leitkoeffizent
Sei $f$ ein __Polynom__.
Für $Grad(f) \neq -\infty$ heißt $r_{Grad(f)}$ der __Leitkoeffizent__ von $f$, da er dass verhalten des __Polynoms__ am maßgeblichsten prägt.

### Polynomring
Die __Polynome__ in $R$ bilden einen [[Ringe|Ring]]. Dieser [[Ringe|Ring]] wird als __Polynomring__ bezeichnet und wird geschrieben als $R[X]$.

__Addition__ $+$:
	$(a_i)_i + (b_i)_i := (a_i + b_i)_i$ für $i \in \mathbb{N}_0$
__Multiplikation__ $\cdot$
		$(a_i)_{i \in \mathbb{N}_0} \cdot (b_i)_{i \in \mathbb{N}_0} := (c_k)_{k\in\mathbb{N}_0}$   
		wobei: $c_k := \sum_{i=0}^{k} a_i \cdot b_{k-i}$ 
__Einselement__:
	$1_R[X] := (1, 0, 0, \dots)$

Damit wird der [[Ringe|Ring]] $(R[X], +, \cdot)$ gebildet.