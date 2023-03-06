package Analyse;

public class Errors {

    public String[] messageAnalyse = {
            // cas 1
      "Regle 1 : - vous remplacez l'emprunt retourn2 par le chiffre de la colonne 2 du premier nombre,il vous reste un 0 dans la colonne 2  du premier nombre.vous soustrayez le plus petit nombre du plus grand,",
      // cas 2
      "Regle 2 : - vous soustrayez le plus grand nombre du plus petit ; peut import leur position",
      // cas 3
      "Regle 3 : - vous ecrivez le chiffre repeté dans les deux nombres",
      // cas 4
      "Regle 4 : - Quand vous empruntez un 1, vous  considère 1 de l'emprunt comme s�il était 10 et vous décrémentez",
      // cas 5
      "Regle 5 : - Quand vous emprunte d�un 1, vous  change ce 1 en 10 au lieu de 0",
      // cas 6
      "Regle 6 : - vous changez le 1 en 10 au lieu de lui ajouter 10",
      // cas 7
      "Regle 7 : - Quand il emprunte d’un 1, l’apprenant traite ce 1 comme un 0, le changeant en 9 et décrémentant le nombre à sa gauche.",
      // cas 8
      "Regle 8 : - Au lieu de décrémenter un 1, l’apprenant le change en un 11.",
      // cas 9
      "Regle 9  : Au lieu d’emprunter sur un 0 au-dessus d’un autre 0, l’apprenant ne change pas le premier 0, mais décrémente plutôt la colonne suivante à gauche.",
      // cas 10
      "Regle 10 :  Au lieu d’emprunter sur un 0, l’apprenant change le 0, mais ne décrémente aucune colonne àgauche.",
      // cas 11
      "Regle 11 : Quand il emprunte sur un 0 qui surmonte un autre 0, l’apprenant saute par-dessus le premier 0 et diminue le chiffre suivant à gauche.",
      // cas 12
      "Regle 12 : Quand il emprunte sur un 0, l’apprenant change le 0 en 10 et ne décrémente aucun chiffre à gauche. Cependant, si le 10 ainsi créé est au-dessus d’un 0, l’apprenant fait une retenue au lieu d’essayer d’écrire 10 dans la réponse.",
      // cas 13
      "Regle 13 : Quand il emprunte sur un 0 surmontant un vide, l’apprenant saute à la colonne suivante pour décrémenter.",
      // cas 14
      "Regle 14 : Quand il emprunte sur un 0 au-dessus d’un vide, l’apprenant considère la colonne où il y a ce 0 comme si elle n’existait pas.",
      // cas 15
      "Regle 15 : vous  ne décrémentez pas une colonne qui a un chiffre au-dessus d’un vide.",
      // cas 16
      "Regle 16 : Quand la colonne à l’extrême gauche de l’exercice comprend un 1 au-dessus d’un vide, vous ignorez la colonne",
      // cas 17
      "Regle 17 : - Quand le nombre du bas comporte moins de chiffre que celui du haut, vous arrête l’exercice à la colonne où s’arrête le nombre du bas",
      // cas 18
      "Regle 18 : - Quand il y a des vides dans le nombre du bas l’apprenant soustrait le chiffre le plus à gauche du nombre du bas des chiffres du haut des colonnes où se trouvent ces vide.",
      // cas 19
      "Regle 19 : - Quand il y a des 0 / vide dans le nombre du bas, vous soustrait 1 des chiffres du haut.",
      // cas 20
      "Regle 20 : - Vous ignore toute colonne de la forme 0 sur un vide",
      // cas 21
      "Regle 21 : - Lorsque l’apprenant écrit un exercice, il aligne les colonnes de gauche à droite au lieu de droite à gauche.",
      // cas 22
      "Regle 22 : vous empruntez toujours de la colonne à l’extrême gauche plutôt que de celle immédiatement à gauche.",
      // cas 23
      "Regle 23 : vous empruntez la différence entre le chiffre du haut et celui du bas de la colonne où vous opèrez. En d’autres mots, vous empruntez juste assez pour faire la soustraction dans cette colonne où vous obtenez toujours un 0.",
      // cas 24
      "Regle 24 : L’apprenant arrête l’exercice dès qu’un emprunt est requis.",
      // cas 25
      "Regle 25 : Quand un emprunt est requis, l’apprenant saute simplement par-dessus la colonne et va à la colonne suivante.",
      // cas 26
      "Regle 26 : - Quand vouz empruntez, vous décrémentez correctement, puis, colonne par colonne, vous\\ soustrait le plus petit chiffre du plus grand comme si vous n’avait pas emprunté.",
      // cas 27
      "Quand une colonne demande un emprunt, l’apprenant décrémente correctement, mais écrit 0 comme réponse.",
      // cas 28
      "Regle 28 : - Quand il emprunte, l’apprenant saute les colonnes dans lesquelles le nombre du haut et du bas sont égaux.",
      // cas 29
      "Regle 28 : - L’apprenant pense que N – 0 = 0.",
      // cas 30
      "Regle 30 : Quand une colonne est de la forme N-N, vous ecrivez 9 comme réponse et décrémentez la colonne suivante à gauche bien que l’emprunt ne soit pas nécessaire",
      // cas 31
      "Regle 31 : - L’apprenant change le nombre pour lequel il faut emprunter en 10 au lieu de lui ajouter 10",
      // cas 32
      "Regle 32 : Quand il emprunte, l’apprenant décrémente la quantité en bas de la colonne extrême, c’est-à-dire le résultat de la colonne extrême.",
      // cas 33
      "Regle 33 : Quand il emprunte, l’apprenant essaie de trouver une colonne dans laquelle le nombre du\n" +
                    "haut est plus petit que celui du bas. S’il y en a un, il le décrémente. Sinon, il emprunte\n" +
                    "correctement.",
      // cas 34
      "Regle 34 : - Quand il emprunte sur un 0, l’apprenant saute le 0 pour emprunter de la colonne suivante. Si cela le force à emprunter deux fois, il diminue le même chiffre à deux reprises.",
      // cas 35
      "Regle 35 : Au lieu d’emprunter sur un 0, l’apprenant ne change pas ce 0, mais décrémente plutôt la colonne suivante à gauche. De plus, s’il lui faut emprunter d’une colonne commençant par un 0 qui devrait alors être modifié, l’apprenant écrit 0 comme réponse à cette colonne.",
      // cas 36
            "",
      // cas 37
            "",
      // cas 38
            "",
      // cas 39
      "Regle 39 : - La première colonne qui demande un emprunt est décrémentée avant de soustraire",
      // cas 40
            "",
      // cas 41
            "",
      // cas 42
      "Regle 42 : Quand il doit emprunter sur un 0 et que cet emprunt est causé par un autre 0, l’apprenant n’emprunte pas. Il écrit plutôt le nombre du bas comme réponse à la colonne. Il emprunte correctement dans la colonne suivante dans les autres circonstances.",
      // cas 43
      "Regle 43 : Quand il doit emprunter sur un 0 et que cet emprunt est causé par un autre 0, l’apprenant change le 0 duquel il emprunte en un 10 au lieu d’un 9.",
      // cas 44
            "",
      // cas 45
      "Regle 45 : - Quand il emprunte d’une colonne de la forme 0-N, l’apprenant décrémente le N au lieu du zéro",
      // cas 46
      "Regle 46 : - Quand il emprunte sur un 0, l’apprenant change le 0 en 10 et ne décrémente aucun chiffre à gauche.",
      // cas 47
            "Regle 47 : Au lieu d’emprunter sur un 0, l’apprenant change le 0 en 9, mais ne continue pas pour\n" +
                    "emprunter de la colonne de gauche. Cependant, si le chiffre à gauche du 0 est au-dessus d’un\n" +
                    "vide, l’apprenant procède alors de manière correcte.",
      // cas 48
      "Regle 48 : Quand il emprunte sur un 0, l’apprenant change le 0 en 10 au lieu de 9. Cependant, si ce 0 est au-dessus d’un autre 0, l’apprenant fait une retenue au lieu d’écrire 10 comme réponse à cette colonne.",
      // cas 49
      "Regle 49 : - L’apprenant n’emprunte pas sur un 0, soustrayant plutôt le plus petit chiffre du plus grand dans la colonne où l’emprunt serait requis",
      // cas 50
      "Regle 50 : Au lieu d’emprunter de 0, l’apprenant ajoute 10 à la colonne où il effectue son calcul, mais ne décrémente aucune colonne à gauche.",
      // cas 51
      " Regle 51 : - Au lieu d’emprunter sur un 0, l’apprenant change ce 0 en 9, mais ne continue pas pour aller emprunter de la colonne à gauche.",
      // cas 52
      " Regle 52 : - L’apprenant n’emprunte pas d’un 0, écrivant plutôt 0 comme réponse à la colonne exigeant l’emprunt. ",
      // cas 53
      "Regle 53 : Au lieu d’emprunter sur un 0, l’apprenant ne change pas ce 0, mais décrémente plutôt la colonne suivante à gauche. De plus, s’il lui faut emprunter d’une colonne commençant par un 0 qui devrait alors être modifié, l’apprenant écrit 0 comme réponse à cette colonne.",
      // cas 54
            "Regle 54 : Au lieu d’emprunter sur un 0, l’apprenant ne change pas ce 0, mais décrémente plutôt la\n" +
                    "colonne suivante à gauche. De plus, s’il lui faut emprunter d’une colonne commençant par\n" +
                    "un 0 qui devrait alors être modifié, l’apprenant écrit le chiffre du bas comme réponse à cette\n" +
                    "colonne.",
      // cas 55
            "Regle 54 : Au lieu d’emprunter sur un 0, l’apprenant ne change pas ce 0, mais décrémente plutôt la\n" +
                    "colonne suivante à gauche. De plus, s’il lui faut emprunter d’une colonne commençant par\n" +
                    "un 0 qui devrait alors être modifié, l’apprenant ajoute 10 au 0 mais ne décrémente rien.",
      // cas 56
      "Regle 56 : vous n’empruntez pas. Pour les colonnes de la forme 0-N, vous écrivez N comme réponse et pour celles du type petit nombre – (moins) grand nombre, vous  mettez 0",
      // cas 57
      "Regle 57 : Quand un emprunt est causé par un 0, l’apprenant n’ajoute pas correctement 10. Il ajoute plutôt 10 plus le chiffre dans la colonne suivante à gauche.",
      // cas 58
      "Regle 58 : - Vous  rencontre une colonne de la forme 0-N, vous n’emprunte pas, mais écrit plutôt 0 comme réponse dans cette colonne",
      // cas 59
      "Regle 59 : - Vous  rencontre une colonne de la forme 0-N, vous n’emprunte pas, mais écrit plutôt N comme réponse dans cette colonne.",
      // cas 60
      "Regle 60 : - Vous un emprunt est causé par un 0, vous n’emprunte pas, mais traite le 0 comme s’il était un 9",
      // cas 61
      "Regle 61 : Quand un emprunt est causé par un 0, l’apprenant lui ajoute 10 correctement, mais ne change aucune colonne à gauche.",
      // cas 62
            "",
      // cas 63
      "Regle 63 : Quand il y a deux emprunts à la suite, l’apprenant fait le premier emprunt correctement, mais dans le second, il ne décrémente pas (mais ajoute 10 correctement)",
      // cas 64
      "Regle 64 : L’apprenant n’emprunte qu’une fois par exercice. Si un autre emprunt est nécessaire,\n" +
                    "l’apprenant ajoute le 10 correctement, mais ne décrémente pas. S’il y a emprunt sur 0, il\n" +
                    "change le 0 en 9, mais ne décrémente pas le chiffre à gauche du 0",
      // cas 65
      "Regle 65 : Quand il emprunte d’une colonne dans laquelle le chiffre du haut est plus petit que celui du bas, l’apprenant incrémente au lieu de décrémenter",
      // cas 66
      "Regle 66 : Quand vous empruntez, vous avez  ajoute 10 correctement, mais ne changez aucune colonne à gauche",
      // cas 67
      "Regle 67 : Quand une colonne est de la forme 1-N, vous écrivez 1 comme réponse à cette colonne.",
      // cas 68
      "Regle 68 : - Chaque fois qu’une colonne présente le même chiffre en haut et en bas, l’apprenant écrit ce chiffre comme réponse.",
      // cas 69
      "Regle 69 : - L’apprenant ne décrémente pas un chiffre qui est au-dessus d’un vide.",
      // cas 70
      "Regle 70 : - Quand il emprunte d’un 0 au-dessus d’un vide, l’apprenant augmente le 0 au lieu de le diminuer.,",
      // cas 71
      "Regle 71 : Si vous  avez déjà emprunté d’une colonne de la forme N-9, l’apprenant, lorsque vous  arrivez à cette colonne, soustrayez 1 au lieu de soustraire 9.",
      // cas 72
      "Regle 72 : Si vous empruntez d’une colonne de la forme N-N, vous écrivez ensuite 1 comme réponse à cette colonne.",
      // cas 73
      "Regle 73 : Une fois que l’apprenant a emprunté, il continue à le faire pour chacune des colonnes qui restent dans l’exercice",
      // cas 74
      "Regle 74 : vous n'empruntez  pas ; dans chaque colonne, vous soustrayez le plus petit chiffre du plus grand, peu importe leurs positions respectives.",
      // cas 75
            "",
      // cas 76
      "Regle 76 : - L’apprenant ne soustrait pas ; il copie plutôt les chiffres de l’exercice dans l’espace réservé à la réponse, retenant le chiffre le plus à gauche du nombre du haut et les autres chiffres du nombre du bas",
      // cas 77
      "Regle 77 : vous n'empruntez  jamais, écrivant plutôt 0 comme réponse à toute colonne exigeant un emprunt.",
      // cas 78
      "Regle 78 :vous additionnez au lieu de soustraire, mais vous soustrayez la retenue au lieu de l’ajouter",
      // cas 79
      "Regle 79 : Au lieu de décrémenter, l’apprenant ajoute 1 à la colonne de laquelle il emprunte, effectuant au besoin une retenue sur la colonne à gauche.",
      // cas 80
      "Regle 80 : L’apprenant additionne au lieu de soustraire.",
      // cas 81
      "Regle 81 : L’apprenant additionne au lieu de soustraire. Si une retenue est nécessaire, il n’additionne pas le chiffre retenu.",
      // cas 82
      "Regle 82 : Quand il emprunte d’une colonne dans laquelle le chiffre du haut est plus petit que celui du\n" +
                    "bas, l’apprenant ajoute 10 au chiffre du haut, décrémente la colonne d’où il emprunte et\n" +
                    "emprunte de la colonne suivante à gauche. De plus, l’apprenant évite toute colonne\n" +
                    "comportant un 0 sur un 0 ou sur un vide dans le processus d’emprunt.",
      // cas 83
      "Regle 83 : L’apprenant emprunte pour chacune des colonnes, que cela soit ou non nécessaire.",
      // cas 84
      "Regle 83 :L’apprenant ne décrémente pas une colonne si le chiffre du haut est plus petit que celui du\n" +
                    "bas",
      // cas 85
      "Regle 85 : L’apprenant ne décrémente pas une colonne sauf si le nombre du bas est plus petit que celui du haut.",
      // cas 86
      "Regle 86 : l’apprenant emprunte de la rangée du bas au lieu de celle du haut",
      // cas 87
      "Regle 87 : Quand il emprunte, l’apprenant décrémente le plus grand nombre dans la colonne, peu importe qu’il soit en haut ou en bas.",

      // cas 88
      "Regle 88 : Au lieu de décrémenter, l’apprenant ajoute 1 à la colonne de laquelle il emprunte. Si le résultat atteint 10, l’apprenant ne fait pas la retenue, mais écrit simplement les deux chiffres dans le même espace.",

    };

    public String[] messageDiagnositic = {
//cas1
"Regle1:-Vous avez effectué la soustraction correctement dans certain colonne, vous appliquez ici une règle qui dit 'il faut toujours ajouter l'emprunt à 10 au chiffre du nombre haut '.\n -Vous ne traitez pas les emprunts comme il faut.\n -Vous ne respectez pas le principe de soustraction.\n",
//cas2
"Regle2:-Vous avez effectué la soustraction correctement dans certain colonne, vous appliquez ici une règle qui dit 'il faut toujours ajouter l'emprunt à 10 au chiffre du nombre haut'.\n -Vous ne traitez pas les emprunts comme il faut.\n -Vous ne respectez pas la disposition des chiffres.\n",
//cas3
"Regle3:-Vous avez effectué la soustraction correctement dans certain colonne, vous appliquez ici une règle qui dit 'si les deux nombres sont égaux le résultat de la soustraction est 0'.\n -Vous ne connaissez pas le principe de la soustraction des nombres égaux.\n -Vous devez soustraire les deux chiffres.\n",
//cas4
"Regle4:-Vous avez effectué la soustraction correctement dans certain colonne, vous appliquez ici une règle qui dit 'il faut toujours ajouter l'emprunt à 10 au chiffre du nombre haut'.\n -Vous ne respectez pas l'utilisation des emprunts.\n -Vous ne maitrisez pas le principe de la decrementation du retenue.\n",
//cas5
"Regle5:-Vous avez effectué la soustraction correctement dans certain colonne, vous appliquez ici une règle qui dit 'il faut toujours ajouter l'emprunt à 10 au chiffre du nombre haut'.\n -Vous ne respectez pas le principe de l'emprunt.\n",
//cas6
"Regle6:-Vous avez effectué la soustraction correctement dans certain colonne, vous appliquez ici une règle qui dit 'il faut toujours ajouter l'emprunt à 10 au chiffre du nombre haut'.\n -Vous ne respectez pas le principe de l'emprunt.\n",
//cas7
"Regle7:-Vous avez effectué la soustraction correctement dans certain colonne, vous appliquez ici une règle qui dit 'il faut toujours ajouter l'emprunt à 10 au chiffre du nombre haut'.-Vous n'utilisez pas les emprunts correctement.\n-Vous ne maitrisez pas le principe de la decrementation du retenue.\n",
//cas8
"",
//cas9
"Regle9:-Vous avez effectué la soustraction correctement dans certain colonne, vous appliquez ici deux règles qui disent 'il faut toujours ajouter l'emprunt à 10 au chiffre du nombre haut'  et 'il faut decrementez le retenue de l'emprunt'.\n-Vous n'utilisez pas les emprunts correctement.\n-Vous ne connaissez pas décrementez le retenue sur un 0.\n",
//cas10
"",
//cas11
"",
//cas12
"",
//cas13
"",
//cas14
"",
//cas15
"",
//cas16
"",
//cas17
"Regle17:-Vous avez effectué la soustraction dans la 1er colonne correctement.\n-Vous ne resepectez pas le principe de soustraction  soustrayer le nombrebas du nombre haut tout entier. \n- continuer l'opération tantqu'il existe des chiffres en haut.\n",
//cas18
"",
//cas19
"Regle19:-Vous avez effectué la soustraction dans la 1er colonne correctement.\n -Vous prenez pas en considération les unités , les dizaines,les centaines.\n-Vous ne respectez pas le principe de soustraction lorsqu'il s'agit des vides.\n -Vous ajouter des chiffres au nombre bas sans raison.\n",
//cas20
"Regle20:-Vous avez effectué la soustraction dans la 1er colonne correctement.\n-Vous ne prenez pas en considération les unités , les dizaines,les centaines.\n-Vous ne respectez pas les dispositions des chiffres de la colonne traité.\n-Vous ne respectez pas le principe de soustraction lorsqu'il s'agit de 0.\n",
//cas21
"",
//cas22
"Regle22:-Vous ne maîtrisez pas le concept de l’emprunte. vous sautez la colonne de dizaines et vous empruntez de centaines.\n",
//cas23
"Regle23:-Vous ne maitrisez pas le concept de l’emprunte.\n",
//cas24
"Regle24:-Vous avez effectué la soustraction correctement dans certain colonne,vous appliquez ici une règle qui dit 'on emprunt à 10 si le premier chiffre est le plus petit'.\n-Vous ne maitrisez pas le principe de l'emprunt.\n-Vous ne connaissez pas le principe de la soustraction.\n-Vous ne maitrisez pas le principe de la decrementation du retenue.\n",
//cas25
"Regle25:-Vous avez effectué la soustraction correctement dans certain colonne,vous appliquez ici une règle qui dit 'on emprunt à 10 si le premier chiffre est le plus petit'.\n-Vous ne maitrisez pas le principe de l'emprunt.\n-Vous ne connaissez pas le principe de la soustraction.\n",
//cas26
"Regle26:Vous ne maîtriser pas le concept de soustraction quand il s’agit de l’emprunte.\n",
//cas27
"",
//cas28
"Regle28:Vous ne maîtrisez pas le concept de l’emprunte.\n",
//cas29
"Regle29:Vous ne maîtrisez pas le concept de la soustraction lorsque vous avez un chiffre en haut et 0 en bas.\n",
//cas30
"Regle30:-Vous ne maîtrisez pas le concept de soustraction lorsque vous rencontrez le même chiffre en haut et en bas.\n",
//cas31
"Regle31:Vous ne maîtrisez pas le concept de l’emprunte.",
//cas32
"",
//cas33
"",
//cas34
"Regle34:-Vous avez effectué la soustraction dans la 1er colonne correctement.\n-Vous ne respectez pas le principe de l'emprunt.\n vous devez ajouter l'emprunt au chiffre du nombre haut suivant même s'il s'agit de 0.\n-Vous pouvez emprunter deux fois du même nombre.\n",
//cas35
"Regle35:-Vous ne maîtrisez pas le concept de la soustraction, vous avez mit 9 à la place de 10 car cette emprunte à causé par d’autre.\n",
//cas36
"",
//cas37
"",
//cas38
"",
//cas39
"Regle39:-Vous ne maîtrisez pas le concept de l’emprunte lorsque vous emprunté vous devez ajouter 10 et décrémenté la colonne sur laquelle vous avez effectué l’emprunte.\n",
//cas40
"",
//cas41
"",
//cas42
"Regle42:-Vous ne maîtrisez pas le concept de l’emprunte lorsque vous devez emprunter pour un 0 causé par un autre 0 il n’effectue pas l’emprunte mais il écrit le chiffre en bas comme réponse.\n",
//cas43
"Regle43:-Vous ne maîtrisez pas le concept de l’emprunte lorsque vous devez emprunter pour un 0 causé par un autre 0 vous ne changé pas le deuxième en 9.\n",
//cas44
"",
//cas45
"Regle45:-Vous ne maîtrisez pas le concept de l’emprunte et de la décrémentation lorsqu’il s’agit d’incrémenté vous incrémenté le chiffre en bas.\n",
//cas46
"Regle46:-Vous ne maîtrisez pas le concept de l’emprunte et de la décrémentation lorsqu’il s’agit d’incrémenté vous ne décrémenté pas la colonne sur laquelle vous avez effectué l’emprunte.\n",
//cas47
"Regle47:-Vous ne maîtrisez pas le concept de l’emprunte lorsque vous devez emprunter sur un 0.\n",
//cas48
"",
//cas49
"Regle49:-Vous ne respectez pas les disposition des chiffre de la colonne.\n",
//cas50
"",
//cas51
"",
//cas52
"",
//cas53
"",
//cas54
"",
//cas55
"",
//cas56
"",
//cas57
"Regle57:-Vous avez effectué la soustraction correctement dans certain colonne,vous appliquez ici une règle qui dit 'on emprunt à 10 si le premier chiffre est le plus petit'.\n-Vous n'utilisez pas les emprunts correctement.\n", 
//cas58
"",
//cas59
"Regle59:-Vous avez effectué la soustraction correctement dans certain colonne, vous appliquez ici une règle qui dit 'il faut emprunter si le premier chiffre est plus petit que le deuxieme chiffre'.\n-Vous ne connaissez pas le principe de la soustraction.\n",
//cas60
"Regle60:-Vous avez effectué la soustraction correctement dans certain colonne,vous appliquez ici une règle qui dit 'il faut ajouter l'emprunt à 10 au chiffre du nombre haut'.\n-Vous ne respectez pas le principe de la soustraction.\n-Vous n'empruntez pas.\n",
//cas61
"Regle61:-Vous avez effectué la soustraction correctement dans certain colonne,vous appliquez ici une règle qui dit 'il faut decrementez le retenue de l'emprunt'.\n-Vous ne traitez pas le retenue de l'emprunt correctement, vous devez decrementez le premier chiffre dans la colonne du retenue.\n",
//cas62
"",
//cas63
"Regle63:-Vous avez bien effectue l'opération de soustraction dans la première colonne, mais dans le principe de soustraction on effectue les opérations colonne par colonne.\nDonc s'il est nécessaire d'effectue plusieurs emprunts, on les effectues tout on appliquons le principe d'emprunt.\n",
//cas64
"Regle64:-Vous avez bien effectuer l'opération de soustraction dans la première colonne, mais dans le principe de soustraction on effectue les opérations colonne par colonne.\nDonc s'il est nécessaire d'effectue plusieurs emprunts si nécessaire , on les effectues tout en appliquons le principe d'emprunt.\nLe principe d'emprunt consiste de deux phases.\nLa première est l'incrémentation de 10 en cas de besoin et de soustraire, La deuxième et la décrementation de la colonne de gauche qui en découle :\n- Forme 1 : (0-N) avec N>0	:	(0+10)-N = 10-N		: et de décrementer de la colonne suivante à gauche.\n- Forme 2 : (M-N) avec N>M	:	(M+10)-N = 10+M-N	: et de décrementer de la colonne suivante à gauche.\nSi l'emprunt se fait sur un zero, on re-empruntent de nouveau, on incrémente de 10 puis on décremente de 9 à cause de l'emprunt de la colonne précedente, sans oblier bien-sûr de décrementer de 1 la colonne de gauche suivante.\n",
//cas65
"Regle65:-Vous avez effectué la soustraction correctement dans certain colonne,-vous appliquez ici une règle qui dit 'il faut decrementez le retenue de l'emprunt'.\n-Vous ne traitez pas le retenue de l'emprunt correctement.\n",
//cas66
"Regle66:-Chaque emprunt est systématiquement suivis d'une decrementation de 1 de la colonne dont vous avez emprunter ( celle de gauche).\n",
//cas67
"Regle67:-Dans le cas où N est superieur à 1, Vous devez emprunter,et continuer l'opération.\n",
//cas68
"Regle68:-Vous avez effectugé la soustraction correctement dans certain colonne, vous appliqué ici une règle qui dit 'si les deux nombres sont égaux le résultatde la soustraction est 0'.\n-Vous ne connaissez pas le principe de la soustraction des nombres égaux, vous ne soustrayez pas les deux chiffres dans la colonne .\n-Vous devez soustraire les deux chiffres, s'il sont égaux le résultat sera 0.\n",
//cas69
"Regle69:-Le vide sous un nombre ne change rien, vous pouvez le considérer comme un 0.\n",
//cas70
"Regle70:-Il faut décrementer de 1 le 0 depuis lequelle vous avez emprunter, et non pas l'incrementer !",
//cas71
"Regle71:-Quand le nombre du bas est egal a 9 , il faut soustraire 9 et non pas 1.\n",
//cas72
"Regle72:-Quand une colonne est sous la forme N-N , le processus de l'emprunt reste le même sans exception .\n",
//cas73
"",
//cas74
"Regle74:-Vous devez respecter l'ordre et soustraire le chiffre du bas du chiffre du haut , et effectuer des emprunts si cela se montre nécessaire.\n",
//cas75
"",
//cas76
"Regle76:-Il convient de retirer le chiffre du bas du chiffre du haut.\nCette opération ne pose pas de problème particulier, sauf si le chiffre du bas est supérieur à celui du haut,dans ce cas :vous devez emprunter de la colonne de gauche en incrementant la colonne actuelle de 10 et en decrementant celle de laquelle vous avez emprunter de 1.\n",
//cas77
"Regle77:-Si le nombre du bas est plus grand que celui en haut, vous devez emprunter de la colonne de gauche en incrementant la colonne actuelle de 10 et en decrementant celle de laquelle vous avez emprunter de 1.\nSi le nombre du bas est plus grand que celui en haut, vous devez emprunter de la colonne de gauche en incrementant la colonne actuelle de 10 et en decrementant celle de laquelle vous avez emprunter de 1.\n",
//cas78
"Regle78:-Vous n'avez pas effectué la soustraction correctement, vous appliquez ici les règles suivante 'on emprunt à 10 si le premier chiffre est le plus petit' et 'il faut toujours ajouter l'emprunt à 10 au chiffre du nombre haut il faut soustraire le plus grand nombre du plus petit'.\n-Vous ne connaissez pas le principe de la soustraction.\n",
//cas79
"Regle79:-Vous avez effectué la soustraction correctement dans certain colonne,vous appliquez ici une règle qui dit 'il faut decrementez le retenue de l'emprunt'.\n-Vous ne traitez pas le retenue de l'emprunt correctement.\n",
//cas80
"Regle80:-Vous n'avez pas effectué la soustraction correctementvous appliquez ici les règles suivante:\n'on emprunt à 10 si le premier chiffre est le plus petit il faut toujours ajouter l'emprunt à 10 au chiffre du nombre haut il faut soustraire le plus grand nombre du plus petit il faut decrementez le retenue de l'emprunt'.\n-Vous ne connaissez pas le principe de la soustraction,vous devez soustraire le plus grand nombres du plus petit,avec prise en consideration la disposition des chiffres ainsi que les emprunts et lesretenues.\n",
//cas81
"Regle81:-Vous n'avez pas effectué la soustraction correctementvous appliquez ici les règles suivante:'on emprunt à 10 si le premier chiffre est le plus petit il faut toujours ajouter l'emprunt à 10 au chiffre du nombre haut il faut soustraire le plus grand nombre du plus petit il faut decrementez le retenue de l'emprunt'.\n-Vous ne connaissez pas le principe de la soustraction,vous devez soustraire le plus grand nombres du plus petit,avec prise en consideration la disposition des chiffres ainsi que les emprunts.\n-Vous ne traitez pas le retenue de l'emprunt correctement, vous devez decrementez le premier chiffre dans la colonne du retenue.\n",
//cas82
"Regle82:-Quand vous empruntez, vous devez décrémenter la colonne à gauche, peut importe lequel est le plus grand .\n",
//cas83
"",
//cas84
"",
//cas85
"Regle85:-Quand vous empruntez, vous devez décrémenter la colonne à gauche, peut importe lequel est le plus grand .\n",
//cas86
"",
//cas87
"Regle87:-Il faut soit incrémenter le nombre du bas soit décrémentiez celui du haut.\n",
//cas88
"",
       
        
    };

}










