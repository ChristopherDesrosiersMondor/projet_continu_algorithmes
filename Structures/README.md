# Structures : Projet continu :mortar_board:

[comment]: # (Définir un nom de projet qui explique sommairement ce dernier.)

[comment]: # (Je vais utiliser le code [comment]: #  pour ajouter des commentaires dans mes readme qui fonctionneront sur plusieurs plateforme mettant en forme le markdown)

[comment]: # (Source: https://stackoverflow.com/questions/4823468/comments-in-markdown)

[comment]: # (Utilisateur: Nick Volynkin)

## Description

[comment]: # (Il faut expliquer ce que le projet fait exactement. Il faut décrire le contexte du projet ainsi qu’offrir des ressources externes pour les termes pouvant être moins connus par les visiteurs. Si jamais ce projet est une solution alternative à un autre, il est important de le mentionner dans cette section.)
Structures de données:

1-ArrayList:
        -La classe ArrayList est un tableau redimensionnable, qui se trouve dans le package java.util.
        La différence entre un tableau intégré et une ArrayList en Java, est que la taille d'un tableau ne peut pas être modifiée (si vous voulez ajouter ou supprimer des éléments à/d'un tableau, vous devez en créer un nouveau). Tandis que des éléments peuvent être ajoutés et supprimés d'une ArrayList quand vous le souhaitez.

        -À peu près la classe à suivre lorsqu'il s'agit de stocker une collection d'objets que vous souhaitez parcourir de manière séquentielle.
        
        Avantages:
                -ArrayList est bon pour un accès aléatoire si vous avez l'index.
                -Arraylist est bon pour l'itération d'éléments.
        Désavantages:
                -itération sans l'index
                -suppression d'éléments, suppressions

        -Complexity Temporelle pour les opérations crud:
                -add(int index, E obj)  pire cas O(n) meilleur:O(1)
                -get(int index) O(1)
                -set(int index, E obj) O(1)
                -remove(int index) O(1)

2-DoubleLinkedList:
        -une liste doublement liée est une structure de données liée qui se compose d'un ensemble d'enregistrements liés séquentiellement appelés noeuds. Chaque noeuds contient trois champs : deux champs de lien (références au noeuds précédent et au noeuds suivant dans la séquence de noeuds) et un champ de données. Les liens précédent et suivant des noeuds de début et de fin, respectivement, pointent vers une sorte de terminateur, généralement un noeuds sentinelle ou nul, pour faciliter le parcours de la liste. S'il n'y a qu'un seul noeuds sentinelle, la liste est liée de manière circulaire via le noeuds sentinelle. Il peut être conceptualisé comme deux listes simplement liées formées à partir des mêmes éléments de données, mais dans des ordres séquentiels opposés.

        -Complexity Temporelle pour les opérations crud:
                -insert debut ou fin de la linked list O(1)
                -get O(n)
                -set O(n)
                -remove debut ou fin de la linked list O(1)

3-Files:
        -Une collection conçue pour contenir des éléments avant le traitement. Outre les opérations de collecte de base, les files d'attente fournissent des opérations d'insertion, d'extraction et d'inspection supplémentaires. Chacune de ces méthodes existe sous deux formes : l'une lève une exception si l'opération échoue, l'autre renvoie une valeur spéciale (nulle ou fausse, selon l'opération). La dernière forme de l'opération d'insertion est conçue spécifiquement pour être utilisée avec des implémentations de file d'attente à capacité restreinte ; dans la plupart des implémentations, les opérations d'insertion ne peuvent pas échouer.
        
        -Complexity Temporelle pour les opérations crud:
                -add O(1)
                -remove O(1)
                -poll O(log(n))
                -peek O(1)


4-File de Prioritée:
        -Une PriorityQueue est utilisée lorsque les objets sont censés être traités en fonction de la priorité. On sait qu'une file d'attente suit l'algorithme First-In-First-Out, mais parfois les éléments de la file d'attente doivent être traités en fonction de la priorité, c'est à ce moment que la PriorityQueue entre en jeu.
        Le PriorityQueue est basé sur le tas prioritaire. Les éléments de la file d'attente prioritaire sont ordonnés selon l'ordre naturel, ou par un comparateur fourni au moment de la construction de la file d'attente, selon le constructeur utilisé.

        -Complexity Temporelle pour les opérations crud:
                -Trouver Min/Trouver Max : O(1)
                -Insérer : O(log n)
                -Supprimer Min/Supprimer Max : O(log n)
                -Extraction Min/Extraction Max : O(log n)
                -Rechercher, supprimer (le cas échéant) : O(n), nous devrons scanner tous les éléments car ils ne sont pas ordonnés comme BST

5-Piles:
        -La pile est une structure de données linéaire utilisée pour stocker la collection d'objets. Il est basé sur le dernier entré, premier sorti (LIFO). Le framework de collection Java fournit de nombreuses interfaces et classes pour stocker la collection d'objets.

        -Complexity Temporelle pour les opérations crud:
                -Push: O(1)
                -Pop: O(1)
                -Top: O(1)
                -get (Search) (Quelque chose comme la recherche, comme une opération spéciale): O(n)

6-Graph:
        -Une structure de données de graphe consiste en un ensemble fini (et éventuellement mutable) de sommets (également appelés nœuds ou points), ainsi qu'un ensemble de paires non ordonnées de ces sommets pour un graphe non orienté ou un ensemble de paires ordonnées pour un graphe orienté. Ces paires sont appelées arêtes (également appelées liens ou lignes), et pour un graphe orienté sont également appelées arêtes mais aussi parfois flèches ou arcs. Les sommets peuvent faire partie de la structure du graphe ou peuvent être des entités externes représentées par des indices ou des références entiers.

        -Complexity Temporelle pour les opérations crud:
                -add O(n) 
                -remove O(1)
                -get O(1)
                -set O(1)

7-Arbre-N:
        -Un arbre est une structure de données non linéaire où les objets de données sont généralement organisés en termes de relation hiérarchique. La structure est non linéaire dans le sens où, contrairement aux tableaux, aux listes liées, à la pile et aux files d'attente, les données d'un arbre ne sont pas organisées de manière linéaire.

        -Complexity Temporelle pour les opérations crud:
                -La complexité temporelle pour créer un arbre est O(1).
                -La complexité temporelle pour rechercher, insérer ou supprimer un nœud dépend de la hauteur de l'arbre h , donc le pire des cas est O(h) en cas d'arbres asymétriques.

8-Arbre Binaire:
        -Un arbre binaire est un type de structure de données arborescente qui a un maximum de deux enfants appelés enfant gauche et droit. Il se compose de trois parties - les données, la référence à l'enfant gauche et la référence à l'enfant droit. Le nœud le plus élevé est appelé la racine et tous les autres éléments sont ses enfants.

        -Complexity Temporelle pour les opérations crud:
                Insérer, supprimer et rechercher : Cas moyen : O(log n), Cas le plus défavorable : O(n)

9-Tableau de Hashage:
        -Une table de hachage, également connue sous le nom de carte de hachage, est une structure de données qui implémente un tableau associatif ou un dictionnaire. C'est un type de données abstrait qui mappe les clés aux valeurs.[2] Une table de hachage utilise une fonction de hachage pour calculer un index, également appelé code de hachage, dans un tableau de compartiments ou d'emplacements, à partir duquel la valeur souhaitée peut être trouvée. Lors de la recherche, la clé est hachée et le hachage résultant indique où la valeur correspondante est stockée.

        -Idéalement, la fonction de hachage attribuera chaque clé à un compartiment unique, mais la plupart des conceptions de table de hachage utilisent une fonction de hachage imparfaite, ce qui peut provoquer des collisions de hachage où la fonction de hachage génère le même index pour plusieurs clés. Ces collisions sont généralement gérées d'une manière ou d'une autre.

        -Complexity Temporelle pour les opérations crud:
                -Insérer/Supprimer : O(1) 
                -Redimensionner/hacher : O(n)
                -Contient : O(1)

[comment]: # (## Aide visuelle)

[comment]: # (Tout dépendant du type de projet, il peut être fort intéressant d’ajouter des supports visuels en faciliter la compréhension.)


[comment]: # (## Installation)

[comment]: # (Si jamais le projet nécessite l’installation de logiciels ou bibliothèque supplémentaire, il est important de le préciser ici. De plus, il faut prendre en considération que les visiteurs risquent souvent d’être des personnes plus novices. Par conséquent, il est utile de bien décrire chaque étape de l’installation de ce matériel supplémentaire.)


## Auteurs et reconnaissances
Patrick Oliveira  
Christopher Desrosiers Mondor

[comment]: # (Il est important de reconnaître les personnes ayant contribué au projet, ainsi que de remercier les personnes ayant offert du support.)


## Licence
CC


## État du projet
Le développement du projet est en attente pour évaluation dans le cadre du cours d'algorithmes.
