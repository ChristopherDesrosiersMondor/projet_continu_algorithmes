# Algorithmes : Projet continu :round_pushpin:

[comment]: # (Définir un nom de projet qui explique sommairement ce dernier.)

[comment]: # (Je vais utiliser le code [comment]: #  pour ajouter des commentaires dans mes readme qui fonctionneront sur plusieurs plateforme mettant en forme le markdown)

[comment]: # (Source: https://stackoverflow.com/questions/4823468/comments-in-markdown)

[comment]: # (Utilisateur: Nick Volynkin)

## Description

[comment]: # (Il faut expliquer ce que le projet fait exactement. Il faut décrire le contexte du projet ainsi qu’offrir des ressources externes pour les termes pouvant être moins connus par les visiteurs. Si jamais ce projet est une solution alternative à un autre, il est important de le mentionner dans cette section.)
Introduction aux algorithmes
        -Qu'est-ce qu'un algorithme ? Un algorithme décrit les étapes que vous devez effectuer pour accomplir une tâche spécifique.

        -De nombreux algorithmes peuvent accomplir la même tâche.
        
        -Il peut y avoir plusieurs implémentations du même algorithme.

Notation Big-O :
        -La notation Big-O est une manière d'exprimer la complexité liée au nombre d'items qu'un algorithme doit traiter.

Deux types de Complexité:
        -La complexité temporelle
                -Qui est le nombre d'étapes nécessaires pour exécuter un algorithme.

        -La complexité de la mémoire
                -Qui est la quantité de mémoire nécessaire pour exécuter un algorithme.

tri Stable vs tri Instable:
        -Un tri est stable, alors l'ordre relatif des éléments en double a été conservé et dans ce cas c'est un tri stable.

Algorithme de Tri:
```
        1-tri de Seau:
                -Algorithme en place

                -O(n2) complexité temporelle-quadratique

                -il faudra 100 étapes pour trier 10 éléments.

                -l'algorithme se dégrade rapidement.

        Processus de tri:
                -Au fur et à mesure que l'algorithme progresse, il partitionne le tableau en une partition triée et une partition non triée.

        2-tri par Sélection:
                -Ce qu'on appelle le tri par sélection car à chaque parcours sélectionnait le plus grand élément et le déplaçait dans la partition triée

                -Algorithme en place

                -O(n2) complexité temporelle quadratique pire cas

                -O(1) complexité temporelle meilleur cas

                -Il faudra 100 étapes pour trier 10 articles
                ne nécessite pas beaucoup d'échange comme tri à bulles.

                -Algorithme instable

        Processus de tri:
                -Cette algorithme divise la sous-structure (tableau, liste liée) en partitions triées et non triées.

                -On parcourt la zone et on cherche le plus gros élément dans la partition non triée.

                -Lorsque nous le trouvons, nous l'échangeons avec le dernier élément de la partition non triée.

                -Cet élément échangé sera à sa position triée correcte.

                -Algorithme en place

                -Big O(n2) quadratique

                -Il faudra 100 étapes pour trier 10 éléments.

                -Algorithme stable

        3-tri par Insertion:
                -Le tri par insertion est un algorithme de tri dans lequel les éléments sont transférés un par un vers la bonne position. En d'autres termes, un tri par insertion aide à construire la liste triée finale, un élément à la fois, avec le déplacement des éléments de rang supérieur.

                -Big O(n2) quadratique pire cas

                -Big O(n) meilleur cas

        Processus de tri:
                -Partitionne la sous-structure en partitions triées et non triées.

                -Développe une partition assortie de gauche à droite.

        4-tri par Fusion:
                -Le tri par fusion est l'un des algorithmes de tri les plus efficaces. Il est basé sur la stratégie de diviser pour mieux régner. Le tri par fusion réduit en continu une liste en plusieurs sous-listes jusqu'à ce que chacune n'ait qu'un seul élément, puis fusionne ces sous-listes en une liste triée.

                -Algorithme Diviser pour régner. Implique de diviser le tableau que vous voulez trier en un tas de tableaux plus petits.

                -Algorithme récursif

                -Deux phases : la phase de scission et la phase de fusion

                -Big O(log n)

        Processus de tri:
                -Phase de fractionnement:
                        -Considérez-le comme un algorithme récursif qui divise continuellement le tableau en deux jusqu'à ce qu'il ne puisse plus être divisé. Cela signifie que si le tableau devient vide ou n'a plus qu'un seul élément, la division s'arrêtera, c'est-à-dire que c'est le cas de base pour arrêter la récursivité. Si le tableau a plusieurs éléments, divisez le tableau en moitiés et appelez récursivement le tri par fusion sur chacune des moitiés. Enfin, lorsque les deux moitiés sont triées, l'opération de fusion est appliquée. L'opération de fusion est le processus consistant à prendre deux tableaux triés plus petits et à les combiner pour en faire éventuellement un plus grand.
                -Phase de fusion:
                        -Fusionner chaque paire gauche/droite de tableaux frères et sœurs dans un tableau trié.

                        -Après la première fusion, nous aurons un tas de tableaux triés à 2 éléments

                        -Ensuite, fusionnez ces tableaux triés (gauche/droite) frères et sœurs pour obtenir 1 structure triée.
        5-tri Rapide:
                -Quicksort est un algorithme diviser pour mieux régner. Il fonctionne en sélectionnant un élément 'pivot' dans le tableau et en partitionnant les autres éléments en deux sous-tableaux, selon qu'ils sont inférieurs ou supérieurs au pivot. Pour cette raison, il est parfois appelé tri par échange de partition.

                -Algorithme en place

                -Algorithme recursif

                -Big O(n2) quadratic pire cas

                -Big O(log n) meilleur cas

                -Algorithme instable

                -Il est important de noter que le choix du pivot peut avoir un effet sur la complexité temporelle. Selon les données à trier.
                
        Processus de tri:
                -Quicksort est un algorithme diviser pour mieux régner. Il fonctionne en sélectionnant un élément 'pivot' dans le tableau et en partitionnant les autres éléments en deux sous-tableaux, selon qu'ils sont inférieurs ou supérieurs au pivot. Pour cette raison, il est parfois appelé tri par échange de partition.[4] Les sous-tableaux sont ensuite triés récursivement. Cela peut être fait sur place, nécessitant de petites quantités de mémoire supplémentaires pour effectuer le tri.

                Quicksort est un tri par comparaison, ce qui signifie qu'il peut trier des éléments de n'importe quel type pour lesquels une relation "inférieur à" (formellement, un ordre total) est définie. La plupart des implémentations de tri rapide ne sont pas stables, ce qui signifie que l'ordre relatif des éléments de tri égaux n'est pas conservé.
```

[comment]: # (## Aide visuelle)

[comment]: # (Tout dépendant du type de projet, il peut être fort intéressant d’ajouter des supports visuels en faciliter la compréhension.)


[comment]: # (## Installation)

[comment]: # (Si jamais le projet nécessite l’installation de logiciels ou bibliothèque supplémentaire, il est important de le préciser ici. De plus, il faut prendre en considération que les visiteurs risquent souvent d’être des personnes plus novices. Par conséquent, il est utile de bien décrire chaque étape de l’installation de ce matériel supplémentaire.)

[comment]: # (## Support)

[comment]: # (Indiquez ici les endroits où les utilisateurs peuvent avoir accès à de l’aide : adresse de courriel, forum de discussion, etc.)


[comment]: # (## Feuille de route)

[comment]: # (Si jamais le projet est toujours en production, c’est une bonne idée de présenter une feuille de route qui indique les ajouts futurs.)


## Auteurs et reconnaissances
Patrick Oliveira
Christopher Desrosiers Mondor

[comment]: # (Il est important de reconnaître les personnes ayant contribué au projet, ainsi que de remercier les personnes ayant offert du support.)


## Licence
CC


## État du projet
Le développement du projet est en attente pour évaluation dans le cadre du cours d'algorithmes.
