
# Definition
Eine __Aussage__ ist ein Satz der entweder Wahr oder Falsch sein kann.
Eine __Aussage__ wird durch folgende __Operationen__ gebildet.

Seien $A, B$ zwei beliebige __Aussagen__.

__Negation__: $\lnot A$: A ist _falsch_
__Konjunktion__: $A \land B$: $A$ und $B$ sind _Wahr_.
__Disjunktion__: $A \lor B$: $A$ und / oder $B$ sind _Wahr_.
__Implikation__: $A \Rightarrow B$: Aus $A$ folgt $B$.

### Äquivalenz
Seien $A, B$ zwei [[#Definition|Aussagen]].

$A \Leftrightarrow B$ bedeutet: $(A \Rightarrow B) \land (B \Rightarrow A)$
also: Wenn $A$ gilt muss auch $B$ gelten, und wenn $B$ gilt muss auch $A$ gelten.

### Quantoren
Sei $A$ eine [[#Definition|Aussage]], und $M$ eine [[Module/LA1/Zusammenfassung/Objekte/Mengen#Definition|Menge]].

__Für alle Quantor__:
	$\forall m \in M: A$
	Für alle $m \in M$ gilt $A$.

__Existenzquantor__:
	$\exists m \in M: A$
	Es existiert ein $m \in M$, für das $A$ gilt.
