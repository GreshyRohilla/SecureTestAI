# SecureTestAI

SecureTestAI is a **Risk-Based Automation Testing Framework** designed for functional and security validation of modern web applications.  
The framework integrates **UI automation, API testing, and security validation** into a modular and scalable architecture suitable for Agile and DevOps environments.

## Author
Greshy Rohilla
---
## Key Features
- Risk-based test prioritization
- Functional UI testing using Selenium
- Behavior Driven Development using Cucumber
- Integrated SQL Injection detection
- Page Object Model architecture
- Automated reporting with Allure
- Modular and scalable test design
---
## Technology Stack
- Java
- Selenium WebDriver
- Cucumber BDD
- TestNG
- Maven
- Allure Reports
---
## Framework Architecture
The SecureTestAI framework follows a layered architecture:
Feature Files → Step Definitions → Page Objects → Test Execution → Reports
Modules included in the framework:
- AI-based Test Prioritization
- Security Validation Module
- UI Automation Layer
- API Testing Layer
- Reporting and Logging Layer
---
## Project Structure
SecureTestAI
│
├── src
│   ├── main
│   │   └── java
│   │       ├── ai
│   │       ├── base
│   │       ├── pages
│   │       └── security
│   │
│   └── test
│       ├── java
│       │   ├── runners
│       │   └── stepdefinitions
│       │
│       └── resources
│           └── features
│
├── pom.xml
├── README.md
└── .gitignore
