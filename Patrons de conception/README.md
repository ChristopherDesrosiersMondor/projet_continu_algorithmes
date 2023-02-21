# Algorithmes : Projet continu :round_pushpin:

[comment]: # (Définir un nom de projet qui explique sommairement ce dernier.)

[comment]: # (Je vais utiliser le code [comment]: #  pour ajouter des commentaires dans mes readme qui fonctionneront sur plusieurs plateforme mettant en forme le markdown)

[comment]: # (Source: https://stackoverflow.com/questions/4823468/comments-in-markdown)

[comment]: # (Utilisateur: Nick Volynkin)

## Description

[comment]: # (Il faut expliquer ce que le projet fait exactement. Il faut décrire le contexte du projet ainsi qu’offrir des ressources externes pour les termes pouvant être moins connus par les visiteurs. Si jamais ce projet est une solution alternative à un autre, il est important de le mentionner dans cette section.)
Les Patrons de conception de type Creationnels:
        -Amènent un niveau d'abstration au procesus d'instantiation d'un object. 
        -La logique de création est masquée.
        -Encapsule les connaissances sur les classes cpncrete utilisées par le système.
        -Donne au programmeur beaucoup de flexibilité dans ce qui est créé, qui le crée, comment il est créé et quand.

Le Patron de Conception Factory:
        -L'un des modèles de conception les plus utilisés en Java.
        -Les usines gèrent les détails de la création d'objets.
        -Ce pattern définit une interface de création d'objet (Usine).

Avantages:
        -Haute cohésion, faible couplage.
        -Vous permet de modifier plus facilement la conception de votre application.
        -Favorise l'approche du codage vers une interface plutôt que l'implémentation.

Désavantages:
        -Rend le code plus difficile à lire, car tout votre code est derrière un niveau abstraction qui peut masquer d'autres abstractions.
        -Peut être classé comme anti-pattern lorsqu'il est mal utilisé.
        -Parfois, faire de nombreux objets peut souvent diminuer les performances.

Le Patron de Conception Singleton:
        -Le modèle singleton est l'un des modèles de conception les plus simples de Java.
        -Assure qu'une classe n'a qu'une seule instance et fournit un point d'accès global à celle-ci.
        -Nous prenons une classe et la laissons gérer une seule instance d'elle-même.
        -Nous fournissons également un point d'accès global à l'instance.

Avantages:
        -Accès contrôlé à la seule instance.
                -Parce que la classe Singleton encapsule sa seule instance, elle peut avoir un contrôle strict sur la façon dont elle est accessible.
        -Espace de noms réduit.
                -Une amélioration par rapport aux variables globales.
                -Évite de polluer l'espace de noms avec des variables globales qui stockent une seule instance.
        -Permet un nombre variable d'instances.
                - Facilite le changement d'avis et permet plus d'une instance d'une classe Singleton.

Désavantages:
        -Les singletons entravent les tests unitaires.
                -Peut causer des problèmes d'écriture de code testable si l'objet et les méthodes qui lui sont        associées sont si étroitement couplés qu'il devient impossible de tester sans écrire une classe entièrement fonctionnelle dédiée au Singleton.
        --Les singletons créent des dépendances cachées.
                -Parce qu'il est facilement disponible dans toute la base de code, il peut être surutilisé.

[comment]: # (## Aide visuelle)

[comment]: # (Tout dépendant du type de projet, il peut être fort intéressant d’ajouter des supports visuels en faciliter la compréhension.)


[comment]: # (## Installation)

[comment]: # (Si jamais le projet nécessite l’installation de logiciels ou bibliothèque supplémentaire, il est important de le préciser ici. De plus, il faut prendre en considération que les visiteurs risquent souvent d’être des personnes plus novices. Par conséquent, il est utile de bien décrire chaque étape de l’installation de ce matériel supplémentaire.)


## Utilisation

[comment]: # (## Support)

[comment]: # (Indiquez ici les endroits où les utilisateurs peuvent avoir accès à de l’aide : adresse de courriel, forum de discussion, etc.)


[comment]: # (## Feuille de route)

[comment]: # (Si jamais le projet est toujours en production, c’est une bonne idée de présenter une feuille de route qui indique les ajouts futurs.)

## Contribution

[comment]: # (Il est important de préciser si vous êtes ouverts à des contributions et les spécifications autour de ces dernières.)
Je suis très ouvert aux contributions et commentaires.

[comment]: # (Il est aussi utile de présenter les prérequis au développement du projet tel que des variables d’environnement à modifier ou l’exécution préalable de routines.)


## Auteurs et reconnaissances
L'échange théorique sur les possibilités et les différences dans notre approche au code avec Patrick, Valérie et Lou m'ont aider à passer par dessus plusieurs blocages.

[comment]: # (Il est important de reconnaître les personnes ayant contribué au projet, ainsi que de remercier les personnes ayant offert du support.)

## Licence
CC

## État du projet
Le développement du projet est en attente pour évaluation dans le cadre du cours de Concept de programmation.
