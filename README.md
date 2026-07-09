
# AssetSphere

> Enterprise Digital Asset Management (DAM) application built using Adobe Experience Manager (AEM).

---

## Project Overview

AssetSphere is an enterprise-style Digital Asset Management application developed using Adobe Experience Manager (AEM). It enables organizations to upload, organize, search, manage, and publish digital assets through reusable AEM components and enterprise development practices.

---

## Project Objectives

- Build an enterprise-ready AEM application.
- Implement reusable AEM components.
- Enable content authors to manage content without developer intervention.
- Demonstrate Sling Models, Servlets, OSGi Services, Workflows, and Schedulers.
- Follow Adobe AEM best practices.

---

## Technology Stack

- Adobe Experience Manager (AEM)
- Java
- Apache Sling
- OSGi
- HTL (Sightly)
- Granite UI
- Coral UI
- Maven
- Git
- HTML
- CSS
- JavaScript

---

## Project Modules

| Module | Description |
|---------|-------------|
| core | Java bundle containing Sling Models, OSGi Services, Servlets, Listeners, Schedulers, Workflow Processes, and business logic. |
| ui.apps | Components, Editable Templates, Client Libraries, Dialogs, Policies, and `/apps` content. |
| ui.content | Initial content, sample pages, and repository content. |
| ui.config | Run mode-specific OSGi configurations. |
| dispatcher | Dispatcher configuration for caching and request filtering. |
| all | Deployable package containing all modules. |
| it.tests | Integration tests for AEM APIs. |
| ui.tests | Cypress-based UI tests. |
| analyse | Static analysis for AEM as a Cloud Service compatibility. |
| ui.frontend *(optional)* | Frontend build using Webpack, React, Angular, or other frameworks. |

---

## Features

- Editable Templates
- Responsive Layout
- Header & Footer
- Navigation
- Hero Banner
- Asset Upload
- Asset Search
- Asset Cards
- Metadata Management
- Asset Download
- Sling Models
- Servlets
- OSGi Services
- Scheduler
- Workflow
- Client Libraries

---

## Project Structure

```

assetsphere/
│
├── core
├── ui.apps
├── ui.content
├── ui.config
├── dispatcher
├── all
├── it.tests
├── ui.tests
└── pom.xml

````

---

## Build & Deployment

### Build all modules

```bash
mvn clean install
````

### Install complete project on Author

```bash
mvn clean install -PautoInstallSinglePackage
```

### Install complete project on Publish

```bash
mvn clean install -PautoInstallSinglePackagePublish
```

### Install on a custom port

```bash
mvn clean install -PautoInstallSinglePackage -Daem.port=4503
```

### Install only the bundle

```bash
mvn clean install -PautoInstallBundle
```

### Install only a content package

```bash
mvn clean install -PautoInstallPackage
```

---

## Development Workflow

```

main
│
└── develop
├── feature/header
├── feature/footer
├── feature/templates
├── feature/search
├── feature/workflow
└── feature/scheduler

```

* All development is done in `feature/*` branches.
* Feature branches are merged into `develop` through Pull Requests.
* Stable releases are merged into `main`.

---

## Testing

### Unit Tests

```bash
mvn clean test
```

### Integration Tests

```bash
mvn clean verify -Plocal
```

Default configuration:

| Property    | Default                                        |
| ----------- | ---------------------------------------------- |
| Author URL  | [http://localhost:4502](http://localhost:4502) |
| Publish URL | [http://localhost:4503](http://localhost:4503) |
| Username    | admin                                          |
| Password    | admin                                          |

Integration tests should use classes ending with `*IT.java`.

---

## Static Analysis

Run:

```bash
mvn clean install
```

The `analyse` module validates the project for AEM as a Cloud Service deployment.

---

## Client Libraries

Frontend assets are delivered using AEM Client Libraries.

Typical structure:

```

css/
css.txt

js/
js.txt

resources/

```

---

## Getting Started

Clone:

```bash
git clone <repository-url>
```

Navigate:

```bash
cd assetsphere
```

Build:

```bash
mvn clean install -PautoInstallSinglePackage
```

---

## Team

| Member  | Responsibilities                                                |
| ------- | --------------------------------------------------------------- |
| Partner | Project Setup, Page Component, Header, Navigation               |
| You     | Editable Templates, Footer, Client Libraries, Search, Scheduler |

---

## Useful References

* Adobe Experience Manager Documentation
* AEM Maven Archetype
* AEM Testing Clients
* AEM Client Libraries Documentation

---

## License

This project is intended for learning and portfolio purposes.