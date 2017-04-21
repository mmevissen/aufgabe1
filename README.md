# KSwe SoSe 2017 - Aufgabe 1

Ziel dieser Aufgabe ist die Nutzung von GitHubs [Pull Request](https://help.github.com/articles/using-pull-requests/)
Feature zur kollaborativen Anpassung einer Java-Klasse.


## Beschreibung

Die Klasse `TeamMemberLogger.java` gibt momentan noch eine
Platzhaltermeldung aus. Passt im Team die Klasse so an, dass sie
alle Mitglieder des Teams (eines pro Zeile) ausgibt. Jedes Team-
Mitglied soll hierbei in seinem eigenen Fork die eigenen
Informationen einbinden. Die Integration der einzelnen Beiträge
soll durch mehrere Pull Requests durchgeführt werden.

### Nutzung von Forks

Die Aufgabe soll explizit durch die Nutzung von Forks und entsprechenden
Pull Requests gelöst werden.

## Ergebnis

Als Ergebnis soll bei Ausführung des Programms jedes Team-Mitglied
aufgelistet werden.

Beispielthalte Ausgabe:

```
2017-03-25 15:40:23 - Insgesamt 3 Team-Mitglieder:
2017-03-25 15:40:23 - Barbara Klein
2017-03-25 15:40:23 - Kevin Pearson
2017-03-25 15:40:24 - Ronny Bennett
```

## Zusatzaufgabe

* Nutzt zur Ausgabe nicht `System.out.println` sondern ein
Logging-Framework (z.B. `java.util.logging`, `SLF4J` oder
`Log4J`).
* Sortiert die Team-Mitglieder bei Vor- und Nachnamen
