Java Application Building
==========

_1. Java Application as a Black Box: codebase management, building, troubleshooting and running._ 30hrs.

# Training Objectives
- [ ] Understanding Java platform architecture and its typical defects
- [ ] Hands-on skill of managing Java codebase with version control tool
- [ ] Understanding core Java application structure for fast localization focus
- [ ] Hands-on skill of building and autotesting complex Java Application
- [ ] Understanding core Java syntax to localize and report compile-time errors
- [ ] Hands-on skill of running and debugging complex Java Application
- [ ] Understanding core Application architecture for fast localization focus

# Prerequisites
### Hardware
- [ ] RAM ≥ 8Гб
- [ ] Wi-Fi with Internet access
## Software
- [ ] [git](https://git-scm.com/downloads)
- [ ] [JDK8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [ ] [IDEA (trial Ultimate)](https://www.jetbrains.com/idea/download/)
- [ ] [Maven](https://maven.apache.org/download.cgi)
- [ ] [Tomcat](https://tomcat.apache.org/download-90.cgi)
- [ ] [Chrome standalone offline installer](https://cloud.google.com/chrome-enterprise/browser/download/)
- [ ] [Docker for Windows](https://docs.docker.com/docker-for-windows/install/) or [Docker for Mac](https://docs.docker.com/docker-for-mac/install/)
## Network Access
- [ ] github.org :443 :80
- [ ] repo1.maven.org :443 :80
- [ ] jcenter.bintray.com :443 :80
- [ ] hub.docker.com :443 :80

# Agenda
## Training introducing and focusing (1 hrs)
- [ ] Schedule
- [ ] Trainer
- [ ] Training overview
- [ ] Rules
### Hands-on: teams and their demand
- [ ] Pairs forming and introduction
- [ ] Topics focus demand from attendees
- [ ] Additional topics demand form attendees

## Intro to Java Platform (2)
### Java platform
- [ ] Java Platform definition
- [ ] Java Platform goals and constrains
- [ ] Brief history and versioning
- [ ] Basic terms: JVM, JRE, JDK
- [ ] Sourcepath and Classpath
### Demo
- [ ] Two-classes Java application manual build and run cycle
- [ ] Run-time parametrization: JVM parameters, application properties, program arguments
### Hands-on
- [ ] Two-classes Java application manual build and run cycle with run-time parametrization
```bash
javac
java
javadoc
```

## Java Application structure (2)
### Application structure
- [ ] Class and its responsibility
- [ ] Method and its intention
- [ ] Package and its cohesion
- [ ] JAR and executable JARs
### Typical development errors
- [ ] Compiler warnings
- [ ] Compiler errors (CNFE, typing)
- [ ] Run-time errors (CNDFE, Exceptions and Errors)
### Demo
- [ ] Compiling milti-class packaged application from sources
- [ ] Compiling milti-class packaged application from sources and raw comiled classes
- [ ] Compiling milti-class packaged application from sources and JARed comiled classes
- [ ] Making and running executable JAR
### Hands-on
- [ ] Making and running executable JAR from packaged sources and JARed comiled classes

## Git DVCS overview (1)
### Local versioning workflow
- [ ] Local repo
- [ ] Commit
- [ ] Log
- [ ] Tag
- [ ] Branch
### Remote versioing workflow
- [ ] Remote repo
- [ ] Clone
- [ ] Push
- [ ] Pull
### Demo
- [ ] Make group custom branch
- [ ] Local and remote workflow with IDE tool
### Hands-on
- [ ] Fork this repo with your account
- [ ] Add pair as collborator
- [ ] Clone fork locally
```bash
git clone --branch master --depth 1 https://github.com/ACCOUNT/java-application-building
```
- [ ] Open project with IDE
- [ ] Make identyfing change and push

## Intro to configuration management patterns (1)
### Repo patterns
- [ ] Distributed
- [ ] Centralized
### Branching patterns
- [ ] Team branch
- [ ] Relese branch
- [ ] Git Flow: feature branches + dev branch
- [ ] Trunk-based development + Feature toggling
### Demo
- [ ] Making pull-request: code review + merge
### Hands-on
- [ ] Make change
- [ ] Make pull-request for code review and merge
- [ ] Make reverse pull-request to get trainers changes

## Maven Overview (1)
### Maven build lifecycle
- [ ] Build lifecycles
- [ ] Lifecycles phases
- [ ] Plugins
- [ ] Managing plugins with pom.xml
### Dependency management
- [ ] Dependecy artifacts: JARed classes, sources, javadocs
- [ ] Artifact repositories
- [ ] Artifact identifying
- [ ] Artifact versioning: stable and snapshots
- [ ] Dependency management with pom.xml
- [ ] Typical issues: dependency hell
### Demo
- [ ] Unit vs Integration tests pattern
- [ ] Partial application build with IDE
- [ ] Uber-jar pattern
- [ ] Full application build with IDE
- [ ] Build results analysing
### Hands-on
- [ ] Full application build with IDE
- [ ] Errors analysing
- [ ] Compile errors fixing
- [ ] Build without tests ran

## IDE tooling overview (1)
### Demo
- [ ] Project settings and structure: modules, sourcepath + classpath
- [ ] Main and Test sources
- [ ] Workspace
- [ ] Views and hotkey switching
- [ ] Editing sources and foreground compilation
- [ ] Debugging methods
- [ ] Running tests from IDE
- [ ] Running application with run configuration and hotkey shortcut
- [ ] Full application building from Maven view
- [ ] Hotkey shortcuts for git workflow operations
- [ ] Main hotkey
### Hands-on
- [ ] Edit: fix test defects localized
- [ ] Debug
- [ ] Run tests
- [ ] Full Maven build
- [ ] Build results analysing
- [ ] Commit and push

## Memory structure and errors (2)
### Memory structure
- [ ] Methods and Call Stack
- [ ] Objects and Heap Object Space
- [ ] Classes and Perm/Meta Space
- [ ] References in all scopes and GC
### Errors
- [ ] Class locading errors: compilation and run-time
- [ ] Static context access
- [ ] NPE
- [ ] OOME: object heap space leak
- [ ] OOME: perm/meta space leak
- [ ] GC overhelming and stop-the-world
### Demo
- [ ] Application profiling with VisualGC plugin and Heap profiling
- [ ] Heap dump
### Hand-on
- [ ] Application profiling with VisualGC plugin and Heap profiling

## Error handling architecture (2)
### Exception definition
- [ ] Type
- [ ] Object
- [ ] Handling
- [ ] Stack trace
### Exception types
- [ ] Built-in
- [ ] Errors vs Exceptions
- [ ] Checked vs Unchecked
### Handling architecture
- [ ] Where to handle: system architecture layering aspect
- [ ] How to handle: patterns
### Try-with-resources
- [ ] TRW
- [ ] Stateful vs Stateless components
### Demo
- [ ] Business exception design and handling
- [ ] Exception suppression demo
### Hands-on
- [ ] Business exception design and handling

## Multithreading architecture (2)
### Threads overview
- [ ] Thread concept
- [ ] Scheduler 
- [ ] Scheduler overhead issue
- [ ] Data race issue
- [ ] Thread-safety design and documetation
- [ ] Threads syncronization: why
- [ ] Deadlock issue
### Demo
- [ ] Data race issue demo
- [ ] Application profiling with threads states and stack dump
### Hands-on
- [ ] Application profiling with threads states and stack dump

## Web application architecture (2)
### HTTP protocol
- [ ] HTTP as a transport layer
- [ ] Methods
- [ ] Payload
- [ ] Errors
### Web container
- [ ] JavaEE/JakartaEE standart
- [ ] Tomcat overview
- [ ] Web application layout
- [ ] Webapp building
- [ ] Webapp deploying
- [ ] Webapp running
- [ ] Webapp undeploying
### Web application architectures
- [ ] Components: servlets, jsp, filters, listeners
- [ ] UI webapp architecture
- [ ] REST- and Web-services architecture
### Demo
- [ ] Simple UI webapp building and deploying to Tomcat
- [ ] HTTP layer sniffing with Chrome
### Hands-on
- [ ] Simple UI webapp building and deploying to Tomcat
- [ ] HTTP layer sniffing with Chrome

## Frameworked Webapp architecture (2)
### Framework concept
- [ ] Framework definintion
- [ ] Typical application architecture: layers
- [ ] Typical responsibilities
- [ ] Application configuration: why and what
- [ ] Why not JavaEE
### Spring
- [ ] Responsibilities
- [ ] Application configuration ways
- [ ] Context definition
- [ ] Profiles definition
- [ ] Typical issues with context components
### Spring MVC
- [ ] Responsibilities for REST and SOAP API
- [ ] Typical issues with Controllers
### Spring Boot
- [ ] Responsibilities
- [ ] Typical issues with Boot modules
### Demo
- [ ] REST API overview
- [ ] Structure of Boot application for API
- [ ] Building and running
### Hands-on
- [ ] Building and running Boot REST API application
- [ ] Manual tesing

## Data storage architecture (2)
### Data storage types
- [ ] Plain files
- [ ] RDBMS
- [ ] NoSQL/NewSQL
- [ ] Pros and Cons
### RDBMS access types
- [ ] JDBC API: db schema constrains, type mapping, transactions
- [ ] JPA API: entities and constrains, caching, transactions
- [ ] Spring Boot Data generated repositores
### Data Validation API
- [ ] Configuring constraints
### Typical issues
- [ ] Db schema constrains
- [ ] Entities constraints
- [ ] Validation API constraints
- [ ] JDBC transactions and isolation, db deadlocks
- [ ] JPA transactions and optimistic exceptions
### DB versioning
- [ ] Why
### Demo
- [ ] DB versioning with Liquibase and access with Boot Data repositories
### Hands-on
- [ ] Add entity field with Validation API constraints
- [ ] Add Liquibase change
- [ ] Build and run application
- [ ] Manual testing

## Autotests architecture (2)
### Autotests definintion
- [ ] Testing scopes mapped to application architecture
- [ ] Test structure
- [ ] Test doublers
- [ ] Reporting: test run and coverage
- [ ] Test error types
### Demo
- [ ] Attendees choose their typical scope for demo
- [ ] Unit test: plain service + manual doubling
- [ ] Unit test: service + spring context doubling
- [ ] Integration test: controller + serivce
- [ ] Integration test: controller + service + repository
- [ ] Integration test: HTTP layer + controller + service + repository
- [ ] Integration test: HTTP layer + controller + service + remote REST service + repository
### UI testing
- [ ] HTML overview
- [ ] Selenium API overview
- [ ] Selenide library
- [ ] Driver manager library
### Demo
- [ ] UI Selenide test with Chrome headless mode off
### Hands-on
- [ ] Choose testing scope
- [ ] Implement autotest
- [ ] Run from IDE
- [ ] Run full Maven build
- [ ] Analyse reports

## Logging and Monitoring architecture (2)
### Local logging
- [ ] Logging libraries hell overview
- [ ] SLF4J API
- [ ] Logback configuration
- [ ] Profiles
- [ ] Production issues
### Remote logging
- [ ] Centralized remote logging architecture
- [ ] ELK stack for implementation
### Demo
- [ ] Remote ELK overview
- [ ] Application logs to Logstash
- [ ] Log stream with Kibana
- [ ] Log searching and filtering with Kibana
- [ ] Business events filtering
- [ ] Kibana dashboards for business events
### Monitoring with ELK
- [ ] What to monitor?
- [ ] Gathering system metrics with Beats
- [ ] Kibana dashboards
### Monitoring with JMX
- [ ] What to monitor?
- [ ] JMX MBeans
- [ ] MBeans implementations: JVM, container, framework, application
- [ ] Remote monitoring with JVisualVM
### Hands-on
- [ ] Customize logging level
- [ ] Analyse logs
- [ ] Local monitoring with JVVM

## DevOps Pipeline architecture* (2)
### DevOps culture
- [ ] Production process overview
- [ ] Bottlenecks
- [ ] Communications as a key
- [ ] DevOps culture
### DevOps pipeline tooling
- [ ] Source management
- [ ] Artifact management
- [ ] CI
- [ ] Autotesting
- [ ] Stage provisioing and IaaC concept
- [ ] Stage virtualization and containerization
- [ ] CD
- [ ] DB versioning
- [ ] Feature toggling
- [ ] Deployment patterns
- [ ] Production logging and monitoring
### QA value
- [ ] Where is QA adds value?
### Demo
- [ ] CD pipeline demo
### Hands-on
- [ ] Push feature change full-auto to prod environment

## Test containerization architecture* (1)
### Containerization concept
- [ ] Containerization goals
- [ ] Containerization vs virtualization
- [ ] QA use-cases and value
### Docker implementation overview
- [ ] Docker images
- [ ] Docker container
- [ ] Docker Hub
- [ ] Image provisioning
### Demo
- [ ] Application dockeriaztion
- [ ] Container run
### Environment management
- [ ] Docker Compose
- [ ] Docker Swarm
- [ ] k8s

## Buffer (2)
- [ ] Daily retrospectives

## Recordings
- [26.01](https://us02web.zoom.us/rec/share/QZ-CtJX1XAG_KHjp66lmI18Ci8zrCwD75_iQ1Ns43UjzPYMQLxf0F-dQBGTAcLVL.5ptZwiEg0N8rTL2e)
- [28.01](https://us02web.zoom.us/rec/share/dwvYqc5oJU6pF2pIrqKhlFioIhpP6RaCRQ4sIoncmrcU3a58Xo9FdjXrN1Kpm4fN.ecI-ZJ0b9aB_1kJJ)
- [02.02](https://us02web.zoom.us/rec/share/gTSGi8-kqNnzrDEBihlDrqCkhDiih14DWSrStMzifpGmZtTZPnmzY0GR2YvLswaG.YbGmlXLVbUfSAQIo)
- [04.02](https://us02web.zoom.us/rec/share/WASWkMkYActD6fNwjJ4Jewel9aUg4As3vBYdIx4Tzk4F-YXaugOqDn858ubC-3wM.KBF64HCyh2RLcCgs)
- [09.02](https://us02web.zoom.us/rec/share/WHPrFiOBA2fkiyaKecrkL4pMbnKMUhM47RnZ1_Y37WdTdkG6Xam_nw8N4h8dnFlx.eeWwxAxEcoWjw62M)
- [11.02](https://us02web.zoom.us/rec/share/QfRLRdZMduEl_UP9uhZbkPpsrGbgQUPKYZvIKWe0QsBeS-2bYYckye-0QTRwAuI9.8qHQu37lEU_4mNEs)
- [16.02](https://us02web.zoom.us/rec/share/fbIJr-mcEE8iDrMl6Ip527Hy1PaO0xeX9yEfgqqbv_d6ldiEgrd7C-ie6zZZGpft.LnL4a_VkvMx-V0VK)
