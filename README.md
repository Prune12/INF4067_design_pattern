# INF4067_design_pattern
ce repository contient les differents codes sources des differents types de patrons de conception et des differents types de patron de structuration implémentés en JAVA. Il est organisé tel que nous avons un grand dossier "pattern_de_construction" et "pattern_de_structuration"
qui contient plusieurs sous dossier et chaque sous dossier contient le code sur de l'implementation d'un patron spécifique. Ces dossiers sont: 

Pour le grand dossier "pattern_de_construction"

- abstract_factory
- factory
- Singleton 
- builder

et pour le grand dossier "pattern_de_structuration" nous avons

- Adapter
- Bridge
- Composite
- Decorator

      
**************************************************************************
le dossier abstract_factory

Le dossier abstract_factory contient l'implémentation du patron appelé "ABSTRACT FACTORY", qui est un type de patron de construction et qui fonctionne comme suit:
- Le but est de créer des objets regroupés en familles sans avoir à connaître leurs classes concrètes.
- Permet de fournir une interface unique pour instancier des objets d’une même famille sans avoir à connaître les classes à instancier.
- Son utilisation est pertinente lorsque :
  - Le système est indépendant de la création des objets qu’il utilise.
  - Le système est capable de créer des objets d’une même famille.

Ce dossier est constitué de deux dossiers nommés:
- abstract_factory_family1: qui contient deux autres dossiers nommés:
  - code: qui contient le code source de l'implémentation de l'exemple sur les produits avec deux familles de produit (1) et (2) tel que dans le cours (patron ABSTRACT FACTORY) avec une classe contenant une méthode main() pour l'exécuter. L'énoncé est le suivant:
    Exemple: On gère deux types de produits. Dans chaque type, les produits sont regroupés par catégorie. Mais le programme qui se charge de manipuler ces produits ne connaît que les types de produits, et c’est à l’exécution que la catégorie du produit est déterminée. On souhaite utiliser le pattern Abstract Factory pour gérer cette situation.
  - modele: qui contient un fichier PDF comprenant le modèle générique du patron en question.
- abstract_factory_family2: qui contient deux autres dossiers nommés:
  - code: qui contient le code source de l'implémentation de l'exemple sur les produits avec trois familles de produit (1), (2) et (3) avec une classe contenant une méthode main() pour l'exécuter.
  - modele: qui contient un fichier PDF comprenant le modèle générique du patron en question.
***********************************************************************************************************************************
comment l'executer?,comment tester ce code?

pour executer, lancer ce code, il y a deux methodes:

- premiere methode: d'abord cloner le projet et executant les commandes `git init`, ensuite `git clone https://github.com/Prune12/INF4067_design_pattern.git`,dans votre
                terminal. Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires
                pour execution d'un code java. Si vous utiliser eclipse ou intellij, vous pourrez facilement executer le code car ces éditeurs ont les configurations du langages java déja inclut,
                mais si vous utilisez visual studio code, il est nécessaire d'installer l'extension java.
                étant donné que chaque dossier notamment (abstract_factory_family1,abstract_factory_family2) est codé de façon independante,dans le dossier "code" de chacun de ces dossiers
                il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé

- deuxieme methode: creer un projet java, copier le dossier du patron que vous souhaitez executer(abstract_factory_family1 ou abstract_factory_family2) dans le dossier src du projet java
                vous venez de creer, supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient
                dejà une classe avec une methode main() pour l'executer. Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé
**************************************************************************
le dossier factory

Le dossier factory contient l'implémentation du patron appelé "FACTORY", qui est un type de patron de construction et qui fonctionne comme suit:
- L’utilisation d’une fabrique permet de rendre l’instanciation d’objets plus flexible qu’avec l’opérateur new.
- La fabrique peut s’implémenter de 2 manières :
  - Déclarer une fabrique avec une méthode de création de l’objet qui attend les données nécessaires pour déterminer le type de l’objet à créer.
  - Déclarer la fabrique abstraite et laisser ses sous-classes créer les objets.

Ce dossier est constitué de quatre dossiers nommés:
- factory_method: qui contient deux autres dossiers nommés:
  - code: qui contient le code source de l'implémentation de l'exemple sur les produits avec deux types de produit A et B tel que dans le cours (patron FACTORY) avec une classe contenant une méthode main() pour l'exécuter. L'énoncé est le suivant:
    Exemple: On gère deux types de produits dans un système. Mais le programme qui se charge de manipuler ces produits ne connaît le type de produit à exécuter que lors de l’exécution. On souhaite utiliser le pattern Factory Methode pour gérer cette situation.
  - modele: qui contient un fichier PDF comprenant le modèle générique du patron en question.
- factory_method2: qui contient deux autres dossiers nommés:
  - code: qui contient le code source de l'implémentation de l'exemple sur les produits avec deux types de produit A, B et C tel que dans le cours (patron FACTORY) avec une classe contenant une méthode main() pour l'exécuter.
  - modele: qui contient un fichier PDF comprenant le modèle générique du patron en question.
- fabrique_abstraite: qui contient deux autres dossiers nommés:
  - code: qui contient le code source de l'implémentation de l'exemple sur les produits avec 2 types de produit A et B mais avec une classe ProduitFactory1 qui implémente une interface IProduitfactory et une classe contenant une méthode main() pour l'exécuter.
  - modele: qui contient un fichier PDF comprenant le modèle générique du patron en question.
- fabrique_abstraite2: qui contient deux autres dossiers nommés:
  - code: qui contient le code source de l'implémentation de l'exemple sur les produits avec 2 types de produit A, B et C mais avec une classe ProduitFactory1 qui implémente une interface IProduitfactory et une classe contenant une méthode main() pour l'exécuter.
  - modele: qui contient un fichier PDF comprenant le modèle générique du patron en question.
***************************************************************************************************************************************************
Pour exécuter, lancer ce code, il y a deux méthodes :

- Première méthode : d'abord cloner le projet en exécutant les commandes `git init`, ensuite `git clone https://github.com/Prune12/INF4067_design_pattern.git` dans votre terminal. Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un éditeur de votre choix mais assurez-vous que vous avez les extensions nécessaires pour l'exécution d'un code Java. Si vous utilisez Eclipse ou IntelliJ, vous pourrez facilement exécuter le code car ces éditeurs ont les configurations du langage Java déjà incluses, mais si vous utilisez Visual Studio Code, il est nécessaire d'installer l'extension Java. Étant donné que chaque dossier notamment (factory_method, factory_method2, fabrique_abstraite, fabrique_abstraite2) est codé de façon indépendante, dans le dossier "code" de chacun de ces dossiers il y a une classe contenant une méthode main(), et donc vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancée.

- Deuxième méthode : créer un projet Java, copier le dossier du patron que vous souhaitez exécuter (factory_method ou factory_method2 ou fabrique_abstraite ou fabrique_abstraite2) dans le dossier src du projet Java que vous venez de créer, supprimer la classe main qui est venue par défaut lors de la création de votre projet Java car le dossier du patron que vous allez copier dans le src contient déjà une classe avec une méthode main() pour l'exécuter. Une fois que c'est fait, vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancée.

**************************************************************************
le dossier Singleton

Le dossier Singleton contient l'implémentation du patron appelé "SINGLETON", qui est un type de patron de construction et qui fonctionne comme suit:

- L’objectif du pattern SINGLETON est de garantir qu’une classe ne
possède qu’une seule instance et de fournir un point d’accès global à
celle-ci.
- Fourni une méthode de classe unique retournant cette unique instance.
- Restreint l'instanciation d'une classe à un seul point.
- Est utilisé lorsque l'on a besoin d'exactement un objet pour coordonner
des opérations dans un système.
- L’instance ne doit être accessible qu’au travers d’une méthode de
classe.
- On l’implémente en écrivant une classe contenant une méthode qui
crée une instance uniquement s'il n'en existe pas encore. Sinon elle
renvoie une référence vers l'objet qui existe déjà.
- Il faudra veiller à ce que le constructeur de la classe soit privé, afin de
s'assurer que la classe ne puisse être instanciée autrement que par la
méthode de création contrôlée.

Ce dossier est constitué de deux dossiers nommés:
- singleton1: qui contient deux autres dossiers nommés:
  - code: qui contient le code source de l'implémentation de l'exemple cours(patron SINGLETON) comprenant une classe appelée singleton comprends deux constructeurs,un constructeur par defaut qui n'a pas de parametre et un constructeur contenant 2 parametres de type entier x et y  avec une classe appelé Testsingleton contenant une méthode main() pour l'exécuter. 
  - modele: qui contient un fichier PDF comprenant le modèle générique du patron en question.
- arithmetique: qui contient deux autres dossiers nommés:
  - code: comprenant une classe appelée arithmetique comprends trois constructeurs,un constructeur par defaut qui n'a pas de parametre,un constructeur contenant 2 parametres de type entier x et y et un constructeur à 3 parametres x,y et nom, x et y etant des entiers et nom etant un String  avec une classe appelé Testarithmetique contenant une méthode main() pour l'exécuter.
  - modele: qui contient un fichier PDF comprenant le modèle générique du patron en question.
  ***********************************************************************************************************************************
comment l'executer?,comment tester ce code?

pour executer, lancer ce code, il y a deux methodes:

- premiere methode: d'abord cloner le projet et executant les commandes `git init`, ensuite `git clone https://github.com/Prune12/INF4067_design_pattern.git`,dans votre
                terminal. Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires
                pour execution d'un code java. Si vous utiliser eclipse ou intellij, vous pourrez facilement executer le code car ces éditeurs ont les configurations du langages java déja inclut,
                mais si vous utilisez visual studio code, il est nécessaire d'installer l'extension java.
                étant donné que chaque dossier notamment (singleton,arithmetique) est codé de façon independante,dans le dossier "code" de chacun de ces dossiers
                il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé

- deuxieme methode: creer un projet java, copier le dossier du patron que vous souhaitez executer(singleton ou arithmetique) dans le dossier src du projet java
                vous venez de creer, supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient
                dejà une classe avec une methode main() pour l'executer. Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé

**************************************************************************
le dossier builder

Le dossier abstract_factory contient l'implémentation du patron appelé "BUILDER", qui est un type de patron de construction et qui fonctionne comme suit:
- Créer des objets complexes à partir d’autres objets sources.
- Ces parties (objets sources) doivent (généralement) être créées
suivant un ordre ou un algorithme spécifique.
- Concrètement, assembler plusieurs objets pour les « monter » et
n’en faire qu’un.
- Son but est donc d’encapsuler la construction d’objets complexes de
sorte qu’un client puisse créer ces objets sans se préoccuper des
différents étapes nécessaires.
- Chaque objet source peut servir à construire une partie de l’objet
complexe( objet cible)

Ce dossier est constitué de deux dossiers nommés:
- builder1: qui contient deux autres dossiers nommés:
  - code: qui contient le code source de l'implémentation de l'exemple du cours comprenant 6 classes notamment client(contient le methode main() pour executer),Directeur,MonteurPizza,MonteurPizzaPiquante,MonteurPizzaReine,Pizza. L'énoncé est le suivant:
    Exemple: On souhaite fabriquer des pizza. On a 2 types de pizza : la pizza
reine et le pizza piquante,
Pour fabriquer une pizza : on prépare la pate, on prépare et ajoute
une sauce et on prépare et ajoute une garniture.
– pour la pizza reine, on utilise : pate = « croisée », sauce =
« douce » et garniture = « jambon et champignon »
– pour la pizza piquante, on utilise : pate = « feuilletée », sauce =
« piquante » et garniture = « pepperoni + salami »
On veut utiliser le design pattern Builder pour faciliter la fabrication
des pizza.
1. Proposer une modélisation sous forme de diagramme de classe
2. Proposer le code source correspondant.
  - modele: qui contient un fichier PDF comprenant le modèle générique du patron en question.
- builder2: qui contient deux autres dossiers nommés:
  - code: qui contient le code source de l'implémentation comprenant 7 classes notamment client(contient le methode main() pour executer),Directeur,MonteurPizza,MonteurPizzaPiquante,MonteurPizzaReine,MonteurPizzaTraditionnelle,Pizza.
  - modele: qui contient un fichier PDF comprenant le modèle générique du patron en question.
  ***********************************************************************************************************************************
comment l'executer?,comment tester ce code?

pour executer, lancer ce code, il y a deux methodes:

- premiere methode: d'abord cloner le projet et executant les commandes `git init`, ensuite `git clone https://github.com/Prune12/INF4067_design_pattern.git`,dans votre
                terminal. Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires
                pour execution d'un code java. Si vous utiliser eclipse ou intellij, vous pourrez facilement executer le code car ces éditeurs ont les configurations du langages java déja inclut,
                mais si vous utilisez visual studio code, il est nécessaire d'installer l'extension java.
                étant donné que chaque dossier notamment (builder1,builder2) est codé de façon independante,dans le dossier "code" de chacun de ces dossiers
                il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé

- deuxieme methode: creer un projet java, copier le dossier du patron que vous souhaitez executer(builder1 ou builder2) dans le dossier src du projet java
                vous venez de creer, supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient
                dejà une classe avec une methode main() pour l'executer. Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé

  **************************************************************************
le dossier Adapter

Le dossier abstract_factory contient l'implémentation du patron appelé "ADAPTER", qui est un type de patron de structuration et qui fonctionne comme suit:
- Son but est de convertir l’interface d’une classe existante en un autre attendue par le client également existants afin qu’ils puissent travailler ensemble.
- Il s’agit de confier à une classe existante une nouvelle interface pour répondre aux besoins de clients.
- Convertir l’interface d’une classe en une autre conforme à l’attente d’un client.
- Permettre la collaboration d’instances dont les classes ont des
interfaces incompatibles.

Ce dossier est constitué de trois dossiers nommés:
- exemple1: c'est le premier exemple du cours sur le patron adapter ,il contient deux autres dossiers nommés:"documenthtml"(c'est l'implementation tel que dans le cours) et "documenthtmlandPDF"(C'est l'implementation avec ajout d'un adapteur pour pouvoir imprimer aussi les documents pdf). Chacun de ces sous dossiers contient un dossier code et un dossier modele tel que: 
  - code: qui contient le code source de l'implémentation de l'exemple du cours . L'énoncé est le suivant:
    Exemple1: On considère un système de vente des véhicules en ligne. Le serveur web de ce système crée et gère des documents destinés aux clients (facture, bon de
livraison, etc…). Dans un premier temps, l’entreprise ne veut générer que des documents HTML directement imprimable. Pour ce faire les développeurs de
ce système ont créé lors de l’implémentation du système, une classe Document qui crée et gère donc les document HTML. On décide maintenant de générer des documents PDF, et pour cela, les
développeurs ont trouvé un composant logiciel qui le fait et ne voudraient pas recoder. Proposer une solution pour l’utilisation de ce composant à l’aide du pattern Adapter.
- exemple2: c'est le deuxieme exemple concernant la manipulation d'une liste doublement chainee en fonction d'une pile ,il contient deux autres dossiers nommés:
  - code: qui contient le code source de l'implémentation 
  - modele: qui contient un fichier PDF comprenant le modèle générique du patron en question en fonction de l'exemple.
- exemple3: c'est le troisieme exemple concernant la manipulation d'un carre en fonction d'une classe qui  sait manipuler les rectangles ,il contient deux autres dossiers nommés:
  - code: qui contient le code source de l'implémentation 
  - modele: qui contient un fichier PDF comprenant le modèle générique du patron en question en fonction de l'exemple.    
  ***********************************************************************************************************************************
comment l'executer?,comment tester ce code?

pour executer, lancer ce code, il y a deux methodes:

- premiere methode: d'abord cloner le projet et executant les commandes `git init`, ensuite `git clone https://github.com/Prune12/INF4067_design_pattern.git`,dans votre
                terminal. Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires
                pour execution d'un code java. Si vous utiliser eclipse ou intellij, vous pourrez facilement executer le code car ces éditeurs ont les configurations du langages java déja inclut,
                mais si vous utilisez visual studio code, il est nécessaire d'installer l'extension java.
                étant donné que chaque dossier notamment (exemple1,exemple2,exemple3) est codé de façon independante,dans le dossier "code" de chacun de ces dossiers
                il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé

- deuxieme methode: creer un projet java, copier le dossier du patron que vous souhaitez executer(exemple1 ou exemple2 ou exemple3) dans le dossier src du projet java que vous venez de creer, supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient dejà une classe avec une methode main() pour l'executer. Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé

  **************************************************************************
le dossier Bridge

Le dossier Bridge contient l'implémentation du patron appelé "BRIDGE", qui est un type de patron de structuration et qui fonctionne comme suit:
- Il permet de découpler l’interface d’une classe et son implémentation.
- Ceci permet à l’interface et l’implémentation de varier séparément.
- Utilise la règle : préférez la composition à l’héritage.

Ce dossier est constitué de deux dossiers nommés:
- Shape_With_example_of_course: c'est l'implementation de l'exemple sur les formes tel que dans le cours, il contient deux autres dossiers nommés:
  - code: qui contient le code source de l'implémentation de l'exemple du cours 
    Exemple: On veut gérer des formes géométriques. On a des Rectangles et des cercles pouvant être de couleur rouge ou bleu.
  - modele: qui contient un fichier PDF comprenant le modèle générique du patron en question.
- Three_Shape_With_two_color: c'est l'implementation de exemple avec trois formes et deux couleurs qui contient deux autres dossiers nommés:
  - code: qui contient le code source de l'implémentation 
  - modele: qui contient un fichier PDF comprenant le modèle générique du patron en question.
- Three_Shape_With_Three_color: c'est l'implementation de exemple avec trois formes et trois couleurs qui contient deux autres dossiers nommés:
  - code: qui contient le code source de l'implémentation 
  - modele: qui contient un fichier PDF comprenant le modèle générique du patron en question.
  ***********************************************************************************************************************************
comment l'executer?,comment tester ce code?

pour executer, lancer ce code, il y a deux methodes:

- premiere methode: d'abord cloner le projet et executant les commandes `git init`, ensuite `git clone https://github.com/Prune12/INF4067_design_pattern.git`,dans votre
                terminal. Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires
                pour execution d'un code java. Si vous utiliser eclipse ou intellij, vous pourrez facilement executer le code car ces éditeurs ont les configurations du langages java déja inclut,mais si vous utilisez visual studio code, il est nécessaire d'installer l'extension java.étant donné que chaque dossier notamment (Three_Shape_With_Three_color,...) est codé de façon independante,dans le dossier "code" de chacun de ces dossiers il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé

- deuxieme methode: creer un projet java, copier le dossier du patron que vous souhaitez executer(builder1 ou builder2) dans le dossier src du projet java que vous venez de creer, supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient dejà une classe avec une methode main() pour l'executer. Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé  

**************************************************************************
le dossier Composite

Le dossier abstract_factory contient l'implémentation du patron appelé "COMPOSITE", qui est un type de patron de structuration et qui fonctionne comme suit:
- Il permet de combiner des objets en structures plus grandes.
- Il décrit une façon de traiter de la même manière les objets
simples et les objets composites.
- Composer des objets dans des structures arborescentes pour
représenter des hiérarchies composants/composés.
- Permet au client de manipuler uniformément les objets simples et
les objets au sein de leurs compositions.

Ce dossier est constitué de deux dossiers nommés:
- code: qui contient le code source de l'implémentation. L'énoncé est le suivant:
    Exemple: On considère un système de gestion de fichiers. Ce système gère des
dossiers(répertoires) et chaque répertoire peut contenir des sous répertoires
(pouvant eux aussi contenir des sous répertoires) et des fichiers. Le système ne
connait que 2 types de fichiers : les fichiers TXT et les fichiers PDF.
Chaque élément du système de fichier est caractérisé par :
- Deux attributs : nom et type (txt, pdf, ou dossier)
- Des méthodes :
- decrire : affiche le nom et le type de l’élément. Un dossier affiche en plus, la
description de tous les éléments qu’il contient.
- ajouter un élément à un autre
- supprimer un élément d’un autre
- obtenir le ieme élément d’un autre
1. Quel est le patron de conception adapté pour ce problème ? Justifier
2. Donner sa structure générique et décrire les participants
3. Proposer une modélisation du problème à l’aide de ce patron
4. Donner le code Java de votre conception.
- modele: qui contient un fichier PDF comprenant le modèle générique du patron en question.
  ***********************************************************************************************************************************
comment l'executer?,comment tester ce code?

pour executer, lancer ce code, il y a deux methodes:

- premiere methode: d'abord cloner le projet et executant les commandes `git init`, ensuite `git clone https://github.com/Prune12/INF4067_design_pattern.git`,dans votre terminal. Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires pour execution d'un code java. Si vous utiliser eclipse ou intellij, vous pourrez facilement executer le code car ces éditeurs ont les configurations du langages java déja inclut,mais si vous utilisez visual studio code, il est nécessaire d'installer l'extension java.étant donné que le dossier est codé de façon independant,dans le dossier "code" ,il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé

- deuxieme methode: creer un projet java, copier le dossier du patron que vous souhaitez executer dans le dossier src du projet java que vous venez de creer, supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient dejà une classe avec une methode main() pour l'executer. Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé

  **************************************************************************
le dossier Decorator

Le dossier Decorator contient l'implémentation du patron appelé "DECORATOR", qui est un type de patron de structuration et qui fonctionne comme suit:
- Attacher dynamiquement des fonctionnalités supplémentaires à un objet.
- L’ajout se fait dynamiquement à l’exécution.
- Cet ajout de fonctionnalités ne modifie pas l’interface de l’objet.
- L’ajout reste transparent vis-à-vis des clients.
- il offre une alternative assez souple à l’héritage pour composer de
nouvelles fonctionnalités.

Ce dossier est constitué d'un dossier nommé:
- fenetre_simple: qui contient deux autres dossiers nommés:
  - code: qui contient le code source de l'implémentation de l'exemple L'énoncé est le suivant:
    Exemple: On considère un système disposant des fenêtres simples affichant du texte dans une zone bien définit. Quand le texte à afficher dépasse la zone d’affichage prévue, une partie du texte n’est pas visible. On souhaite donner la possibilité à ces fenêtres de pouvoir défiler verticalement ou horizontalement
  - modele: qui contient un fichier PDF comprenant le modèle générique du patron en question.

  ***********************************************************************************************************************************
comment l'executer?,comment tester ce code?

pour executer, lancer ce code, il y a deux methodes:

- premiere methode: d'abord cloner le projet et executant les commandes `git init`, ensuite `git clone https://github.com/Prune12/INF4067_design_pattern.git`,dans votre terminal. Une fois que c'est fait, vous pouvez ouvrir le dossier du projet dans un editeur de votre choix mais rassurer vous que vous avez les extensions necessaires pour execution d'un code java. Si vous utiliser eclipse ou intellij, vous pourrez facilement executer le code car ces éditeurs ont les configurations du langages java déja inclut,mais si vous utilisez visual studio code, il est nécessaire d'installer l'extension java.étant donné que ce dossier est codé de façon independant,dans le dossier "code" il y a une classe contenant une methode main(),et donc vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé

- deuxieme methode: creer un projet java, copier le dossier du patron que vous souhaitez executer dans le dossier src du projet java que vous venez de creer, supprimer la classe main qui est venue par defaut lors de la creation de votre projet java car le dossier du patron que vous allez copier dans le src contient dejà une classe avec une methode main() pour l'executer. Une fois que c'est fait,vous n'aurez qu'à faire un run de la classe en question et la partie du patron concerné sera lancé  



