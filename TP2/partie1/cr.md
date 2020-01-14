### TP2 MEDEV
#### I.Utilisation de SVN avec la ligne de commandes
1.Pour Linux
```svn
sudo apt-get install subversion
```
Pour Mac os, connecter 
```svn
svn checkout https://subversion.ec-nantes.fr/svn/eleves/MEDEV
```
2.Examinez l’historique des sous-versions 
Dans le fichier MEDEV
```svn
svn log -r 5076
```
3.Créez un nouveau fichier dans votre copie de travail du référentiel. Appelez cela "besoins14" où 14 est le numéro qui vous a été attribué au début de cet exercice
Ajoute un fichier locale
```
touch besions14
```
Add le fichier sur server
```
svn add besions14
svn rm BAR
```
4.Changement sur server
```
svn commit -m "
```
Vérifier les modifications ligne par ligne
```
svn diff
```
5.Conflit
Modifier le fichier manuellement
#### II.Utilisation de GIT - Branching en local
Initiliser d'abord
```shell
git init
```
Cerer un dossier dans le dossier GIT
```shell
nano c1.txt
```
Commit
```shell
git commit -m ""
```
Voir l'arbre
```shell
git log --graph --oneline --all
```
```shell
git branch "newimage"
```
Entrer dans le branch
```shell
git checkout branch
```
Vérifier la posiotion de branch ("dans quel branch")
```shell
git branch
```
```shell
$ git push --set-upstream origin backend
```