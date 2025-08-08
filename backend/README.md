# 🧠 SkillsHarbor Backend
*This README.md was generated with ChatGPT 4o*

This directory contains the backend implementation of the SkillsHarbor platform, responsible for user authentication, training delivery, progress tracking, and client-specific customization logic.

The backend is written in Java 21, built with Gradle, and targets deployment in a cloud environment (AWS or Azure). PostgreSQL is used as the primary database, with separate schemas for control plane and training data.

## 📁 Project Structure

/backend  
├── controlplane/      # Code for the central metadata/control database  
│   ├── entities/      # Entity classes for users, roles, clients, etc.  
│   ├── dal/           # Data access layer for controlplane entities  
│   └── bll/           # Business logic for routing and control decisions  
├── training/          # Code for client-specific training content  
│   ├── entities/      # Entity classes for training modules, quizzes, etc.  
│   ├── dal/           # Data access layer for training schema  
│   └── bll/           # Training logic, module tracking, quiz scoring  
├── db/                # SQL scripts and migrations for both databases  
│   ├── controlplane/  
│   └── training/  
├── scripts/           # PowerShell and other helper scripts for setup  
└── README.md          # This file

## ⚙️ Tech Stack

- Java 21
- Gradle (multi-module build)
- PostgreSQL (split across controlplane and training)
- JUnit 5 for unit testing
- Mockito (optional) for mocks
- Future: Spring Boot + Hibernate or R2DBC (TBD)

## 🚀 Development Setup

### Prerequisites

- IntelliJ IDEA (Community or Ultimate)
- JDK 21 (any LTS-compliant distribution such as Microsoft OpenJDK, Temurin, or Adoptium)
- Git
- PostgreSQL running locally or in Docker/VM

### Building the project

From the /backend root:
**THIS SECTION IS UNREVIEWED**

./gradlew build

### Running Tests

./gradlew test

## 🧪 Testing Guidelines

- All new classes should have corresponding unit tests
- Place tests under:  
  src/test/java/com/skillsharbor/backend/[domain]/[layer]/
- Use JUnit 5
- Mock database interaction in unit tests; integration tests will be added separately

## 🧰 Scripts

All helper scripts are in /scripts/. Examples include:

- Folder scaffolding for test and main packages
- Placeholder class generation
- Database seeding/reset scripts

See scripts/README.md for details.

## 📝 Future Plans

- Introduce Spring Boot + Hibernate
- Look into database versioning
- Set up automated CI/CD (e.g. GitHub Actions)
- Deploy to AWS or Azure (TBD)
- Refactor to use Kotlin and non-blocking db calls

## 📄 License & Contributions

This project is internal to the SkillsHarbor team.

All contributors are expected to:

- Follow Java naming and packaging conventions
- Write and maintain unit tests with every feature
- Document all significant changes in module-level README.md files as needed  
