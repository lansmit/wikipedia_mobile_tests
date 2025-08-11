# Проект по автоматизации мобильных тестов Android-приложения Wikipedia 

## 🔨 Технологии и инструменты:
<table>
  <tr>
    <th><a href="https://www.oracle.com/java/" target="_blank">Java</a></th>
    <th><a href="https://www.jetbrains.com/idea/" target="_blank">IntelliJ IDEA</a></th>
    <th><a href="https://github.com/" target="_blank">GitHub</a></th>
    <th><a href="https://junit.org/junit5/" target="_blank">JUnit 5</a></th>
    <th><a href="https://gradle.org/" target="_blank">Gradle</a></th>
    <th><a href="https://qameta.io/" target="_blank">Allure</a></th>
    <th><a href="https://docs.qameta.io/allure/" target="_blank">Allure Report</a></th>
    <th><a href="https://www.jenkins.io/" target="_blank">Jenkins</a></th>
    <th><a href="https://telegram.org/" target="_blank">Telegram</a></th>
    <th><a href="https://www.browserstack.com/" target="_blank">Browserstack</a></th>
  </tr>
  <tr>
    <td align="center">
      <a href="https://www.oracle.com/java/" target="_blank">
        <img src="media/logo/Java.svg" width="50" height="50" alt="Java"/>
      </a>
    </td>
    <td align="center">
      <a href="https://www.jetbrains.com/idea/" target="_blank">
        <img src="media/logo/Idea.svg" width="50" height="50" alt="IDEA"/>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/" target="_blank">
        <img src="media/logo/GitHub.svg" width="50" height="50" alt="GitHub"/>
      </a>
    </td>
    <td align="center">
      <a href="https://junit.org/junit5/" target="_blank">
        <img src="media/logo/Junit5.svg" width="50" height="50" alt="JUnit 5"/>
      </a>
    </td>
    <td align="center">
      <a href="https://gradle.org/" target="_blank">
        <img src="media/logo/Gradle.svg" width="50" height="50" alt="Gradle"/>
      </a>
    </td>
    <td align="center">
      <a href="https://qameta.io/" target="_blank">
        <img src="media/logo/Allure_TO.svg" width="50" height="50" alt="Allure"/>
      </a>
    </td>
    <td align="center">
      <a href="https://docs.qameta.io/allure/" target="_blank">
        <img src="media/logo/Allure.svg" width="50" height="50" alt="Allure"/>
      </a>
    </td>
    <td align="center">
      <a href="https://www.jenkins.io/" target="_blank">
        <img src="media/logo/Jenkins.svg" width="50" height="50" alt="Jenkins"/>
      </a>
    </td>
    <td align="center">
      <a href="https://telegram.org/" target="_blank">
        <img src="media/logo/Telegram.svg" width="50" height="50" alt="Telegram"/>
      </a>
    </td>
    <td align="center">
      <a href="https://www.browserstack.com/" target="_blank">
        <img src="media/logo/Browserstack.svg" width="50" height="50" alt="Telegram"/>
      </a>
    </td>
  </tr>
</table>

## :clipboard: Тестовые сценарии
- Тест-кейс №1: Проверка наличия раздела с новостями на главной странице
- Тест-кейс №2: Проверка работы поиска по названию статьи
- Тест-кейс №3: Проверка возможности открыть статью из результатов поиска
- Тест-кейс №4: Проверка возможности добавить другой язык в приложение
---
- Тесты реализованы на <code>Java</code> с использованием фреймворка Selenide и паттерна Page Object.
- В качестве сборщика используется <code>Gradle</code>.
- Для модульного тестирования применён фреймворк <code>JUnit 5</code>.
- Для работы проекта используется Browserstack.
---
## :rocket: Команды для запуска
### Удаленный запуск (через browserstack)
```bash
gradle clean browserstack_test -Dhost=browserstack_test
```

```bash
./gradlew.bat clean browserstack_test -Dhost=browserstack_test 
```
---
