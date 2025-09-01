# 🌟 Beans Scope Demo

Демонстрационный проект для изучения областей видимости бинов в Spring Framework с примерами prototype и singleton бинов.

## 🚀 Технологии

- Java 21
- Spring Boot 3.5.4
- Maven
- Lombok
- Spring Web
- Spring Data JPA
- H2 Database
- Spring Actuator

## 📦 Структура проекта

```
src/
├── main/
│   ├── java/
│   │   └── org/example/beansscope/
│   │       ├── service/
│   │       │   ├── AccountServicePrototype.java   🟢 (Prototype bean)
│   │       │   ├── AccountServiceSingleton.java   🔵 (Singleton bean)
│   │       │   ├── BaseService.java               ⚡ (CommandLineRunner)
│   │       │   └── BaseService2.java              ⚡ (CommandLineRunner с жизненным циклом)
│   │       └── BeansScopeApplication.java         🎯 (Главный класс)
│   └── resources/
│       └── application.properties
pom.xml
```

## 🎯 Особенности

### 🟢 Prototype Bean
- Создается новый экземпляр при каждом запросе
- Реализован в `AccountServicePrototype`
- Имеет методы жизненного цикла:
  - `@PostConstruct` - инициализация
  - `@PreDestroy` - уничтожение

### 🔵 Singleton Bean
- Один экземпляр на все приложение
- Реализован в `AccountServiceSingleton`
- Стандартная область видимости Spring

## 🏃 Запуск проекта

1. Соберите проект:
```bash
mvn clean package
```

2. Запустите приложение:
```bash
java -jar target/beans-scope-0.0.1-SNAPSHOT.jar
```

Или запустите напрямую через Maven:
```bash
mvn spring-boot:run
```

## 📊 Пример вывода

При запуске вы увидите в консоли:
```
------ Prototype -------
Bax ---- Bax
------ Singleton -------
Bax ---- Bax
*********** ...AccountServicePrototype *** init method
------ Prototype2 -------
Lori
------ Singleton2 -------
Bax ---- Bax
*********** ...BaseService2 *** destroy method
```

## 🔧 Настройки

Проект использует встроенную базу данных H2. Для просмотра базы данных добавьте в `application.properties`:
```properties
spring.h2.console.enabled=true
```

---

## 📄 Лицензия

Этот проект создан в учебных целях.
