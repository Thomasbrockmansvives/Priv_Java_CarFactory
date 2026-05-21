# 📦 Java Maven Template

[![Java](https://img.shields.io/badge/Java-25-orange?logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Maven](https://img.shields.io/badge/Maven-3.9+-C71A36?logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![JUnit](https://img.shields.io/badge/JUnit-5.13-25A162?logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![AssertJ](https://img.shields.io/badge/AssertJ-3.27-blue)](https://assertj.github.io/doc/)
[![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-2024.2+-000000?logo=intellijidea&logoColor=white)](https://www.jetbrains.com/idea/)

> Een persoonlijke starter template voor Java-projecten met Maven, JUnit 5 en AssertJ. Klaar om te gebruiken in IntelliJ IDEA, met een werkende build, testopstelling en een nette folderstructuur.

---

## 📋 Wat zit erin?

| Onderdeel | Versie | Doel |
|-----------|--------|------|
| **Java** | 25 | Programmeertaal |
| **Maven** | 3.9+ | Build- en dependency-management |
| **JUnit Jupiter** | 5.13.4 | Unit testing framework |
| **AssertJ** | 3.27.4 | Fluent assertions voor leesbare tests |

### Folderstructuur

```
.
├── .gitignore              # Genegeerde bestanden (target, IDE, OS)
├── pom.xml                 # Maven configuratie
├── README.md               # Dit bestand
└── src
    ├── main
    │   ├── java            # Applicatiecode
    │   └── resources       # Configuratiebestanden, properties, ...
    └── test
        └── java            # Unit tests (JUnit 5 + AssertJ)
```

---

## 🚀 Quick start

### 1. Nieuw project aanmaken vanuit deze template

In IntelliJ IDEA:

```
File → New → Project → User-defined → Java Maven 25 (privé)
```

Vul de **projectnaam** in en klik op **Create**.

### 2. Project openen en builden

Open de **Maven tool window** (`Alt+1` voor Project, dan rechts naast de editor het Maven-icoon) en draai:

```bash
mvn clean install
```

Of via de Maven lifecycle phases:
- `clean` — verwijdert `target/`
- `compile` — compileert je code
- `test` — voert alle unit tests uit
- `package` — bouwt een `.jar` in `target/`
- `install` — installeert in je lokale Maven repository

---

## 🐙 Naar GitHub pushen

> Eenmalige setup van GitHub CLI vereist. Daarna ben je per project klaar in ~30 seconden.

### Eenmalige setup

**Installeer GitHub CLI** via PowerShell (Windows 11):

```powershell
winget install --id GitHub.cli
```

Sluit PowerShell, open opnieuw, en log in:

```bash
gh auth login
```

Volg de prompts:
- **What account?** → `GitHub.com`
- **Preferred protocol?** → `HTTPS`
- **Authenticate Git?** → `Yes`
- **How would you like to authenticate?** → `Login with a web browser`

### Per project

Open de Terminal in IntelliJ met `Alt+F12` en run:

```bash
git init
git add .
git commit -m "Initial commit"
gh repo create <naam-van-de-repo> --private --source=. --remote=origin --push
```

> 💡 **Tip:** vervang `--private` door `--public` als je de repo openbaar wil maken.

Dat is het. De repo staat nu op GitHub, gelinkt als `origin`, met je code gepusht. ✅

---

## 🧪 Tests schrijven

Tests gaan in `src/test/java`, met dezelfde packagestructuur als de bijbehorende code. Voorbeeld:

```java
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CalculatorTest {

    @Test
    void optellen_tweePositieveGetallen_geeftSom() {
        Calculator calc = new Calculator();
        assertThat(calc.add(2, 3)).isEqualTo(5);
    }

    @Test
    void delen_doorNul_gooitException() {
        Calculator calc = new Calculator();
        assertThatThrownBy(() -> calc.divide(10, 0))
            .isInstanceOf(ArithmeticException.class);
    }
}
```

Tests draaien via:
- **In IntelliJ:** `Ctrl+Shift+F10` op een test, of het groene play-icoon in de gutter
- **Via Maven:** `mvn test`

---

## ⌨️ Handige IntelliJ shortcuts

| Shortcut | Actie |
|----------|-------|
| `Alt+F12` | Terminal openen/sluiten |
| `Shift+Shift` | Search Everywhere |
| `Ctrl+Shift+A` | Find Action |
| `Ctrl+Shift+F10` | Huidige test/main draaien |
| `Ctrl+Alt+L` | Code formatteren |
| `Ctrl+Alt+O` | Imports optimaliseren |
| `Alt+Enter` | Quick fix / intention action |
| `Ctrl+B` | Ga naar declaratie |
| `Ctrl+Alt+B` | Ga naar implementatie |
| `Shift+F6` | Hernoemen (rename refactor) |

---

## 📝 Notities

- **Java versie:** Dit project staat ingesteld op Java 25 via `<maven.compiler.source>` en `<maven.compiler.target>` in `pom.xml`. Pas dit aan als je een andere versie nodig hebt.
- **IntelliJ 2024.2:** Ondersteunt maximaal language level Java 23 in de editor. Voor volledige Java 24/25-syntax support is IntelliJ 2025.x nodig. Maven builds via command line werken wel met JDK 25.
- **Dependencies toevoegen:** Voeg ze toe in `pom.xml` onder `<dependencies>` en herlaad Maven via het 🔄-icoon in de Maven tool window (of `Ctrl+Shift+O`).

---

## 📄 Licentie

Geen licentie — dit is een persoonlijke template. Gebruik zoals je wil.