# ObligSoftwareEngingering
Oblig 2 og oblig 3
Vi lagde en ny branch, "HenrikUA-patch-1", som har alle endringer på seg.
Vi endret på pom-fila, og la inn dependency (maven-surefire-plugin), og etter announcement på Canvas la vi også inn en build-sekvens derifra.
Vi opprettet yml-fil, og la inn de nødvendige jobbene, og redigerte mange ganger. Vi la først inn build-jobber for både ubuntu, mac og windows, men endte opp med å bare beholde den for windows.
Vi laget også en publish-jobb, men vi er usikre på om denne trengs, for man ser i loggen på build-jobben, under punktet "Build with Maven", at 4 tester er kjørt og alle har gått gjennom uten feil. Men vi beholder den der, i tilfelle dere ønsker den også.
