# Repository Guidelines

## Project Structure & Module Organization
- `src/main/java` contains the Spring Boot application code (base package `com.kang.springsecurity`).
- `src/main/resources` holds configuration files like `application.properties`.
- `src/test/java` contains JUnit tests.
- Gradle wrapper files (`gradlew`, `gradle/`) ensure consistent builds.

## Build, Test, and Development Commands
- `./gradlew bootRun` runs the app locally with the Spring Boot plugin.
- `./gradlew build` compiles, runs tests, and packages the app.
- `./gradlew test` runs the JUnit test suite.
- `./gradlew clean` clears build artifacts.

## Coding Style & Naming Conventions
- Java 17 is required (see Gradle toolchain).
- Use 4 spaces for indentation, no tabs.
- Package names are lower-case (e.g., `com.kang.springsecurity`); class names use `UpperCamelCase`.
- Prefer clear, descriptive method names and avoid ambiguous abbreviations.
- Lombok is available; keep usage minimal and consistent within a class.

## Testing Guidelines
- Tests use JUnit Platform with Spring Boot Test and Security/MyBatis test support.
- Place tests under `src/test/java` mirroring the main package structure.
- Name tests with the `*Tests` suffix (e.g., `Chap03SpringSecurityLectureSourceApplicationTests`).
- Run tests via `./gradlew test`; no explicit coverage threshold is defined.

## Commit & Pull Request Guidelines
- Git history is minimal (e.g., “init”, “Initial commit”), so no formal convention is established.
- Use concise, imperative commit messages (e.g., “Add security config”, “Fix login handler”).
- PRs should include: a brief summary, testing notes (command + result), and any config changes.
- If changing security or database behavior, note the affected endpoints or schemas.

## Security & Configuration Tips
- Configure sensitive values (DB credentials, JWT secrets) via environment variables or a local profile.
- Avoid committing real secrets to `application.properties`; use placeholders for defaults.
