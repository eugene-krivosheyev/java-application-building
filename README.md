Java Application Building
==========

_1. Java Application as a Black Box: codebase management, building, troubleshooting and running._ 30hrs.

# Training Objectives
- [x] Understanding Java platform architecture and its typical defects
- [x] Hands-on skill of managing Java codebase with version control tool
- [x] Understanding core Java application structure for fast localization focus
- [x] Hands-on skill of building and autotesting complex Java Application
- [x] Understanding core Java syntax to localize and report compile-time errors
- [x] Hands-on skill of running and debugging complex Java Application
- [ ] Understanding core Application architecture for fast localization focus

# Prerequisites
### Hardware
- [ ] RAM ≥ 8Гб
- [ ] Wi-Fi with Internet access
```
ekr@bk.ru / P@ssw0rd
```
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
- [x] Schedule
- [x] Trainer
- [x] Training overview
- [x] Rules
### Hands-on: teams and their demand
- [x] Pairs forming and introduction
- [x] Topics focus demand from attendees
- [x] Additional topics demand form attendees

## Intro to Java Platform (2)
### Java platform
- [x] Java Platform definition
- [x] Java Platform goals and constrains
- [x] Brief history and versioning
- [x] Basic terms: JVM, JRE, JDK
- [x] Sourcepath and Classpath
### Demo
- [x] Two-classes Java application manual build and run cycle
- [x] Run-time parametrization: JVM parameters, application properties, program arguments
### Hands-on
- [x] Two-classes Java application manual build and run cycle with run-time parametrization
```bash
javac
java
javadoc
```

## Java Application structure (2)
### Application structure
- [x] Class and its responsibility
- [x] Method and its intention
- [x] Package and its cohesion
- [x] JAR and executable JARs
### Typical development errors
- [x] Compiler warnings
- [x] Compiler errors (CNFE, typing)
- [x] Run-time errors (CNDFE, Exceptions and Errors)
### Demo
- [x] Compiling milti-class packaged application from sources
- [x] Compiling milti-class packaged application from sources and raw comiled classes
- [x] Compiling milti-class packaged application from sources and JARed comiled classes
- [x] Making and running executable JAR
### Hands-on
- [x] Making and running executable JAR from packaged sources and JARed comiled classes

## Git DVCS overview (1)
### Local versioning workflow
- [x] Local repo
- [x] Commit
- [x] Log
- [x] Tag
- [x] Branch
### Remote versioing workflow
- [x] Remote repo
- [x] Clone
- [x] Push
- [x] Pull
### Demo
- [x] Make group custom branch
- [x] Local and remote workflow with IDE tool
### Hands-on
- [x] Fork this repo with your account
- [x] Add pair as collborator
- [x] Clone fork locally
```bash
git clone --branch master --depth 1 https://github.com/eugene-krivosheyev/agile-practices-application
```
- [x] Open project with IDE
- [x] Make identyfing change and push

## Intro to configuration management patterns (1)
### Repo patterns
- [x] Distributed
- [x] Centralized
### Branching patterns
- [x] Team branch
- [x] Relese branch
- [x] Git Flow: feature branches + dev branch
- [x] Trunk-based development + Feature toggling
### Demo
- [x] Making pull-request: code review + merge
### Hands-on
- [x] Make change
- [x] Make pull-request for code review and merge
- [x] Make reverse pull-request to get trainers changes

## Maven Overview (1)
### Maven build lifecycle
- [x] Build lifecycles
- [x] Lifecycles phases
- [x] Plugins
- [x] Managing plugins with pom.xml
### Dependency management
- [x] Dependecy artifacts: JARed classes, sources, javadocs
- [x] Artifact repositories
- [x] Artifact identifying
- [x] Artifact versioning: stable and snapshots
- [x] Dependency management with pom.xml
- [x] Typical issues: dependency hell
### Demo
- [x] Unit vs Integration tests pattern
- [x] Partial application build with IDE
- [x] Uber-jar pattern
- [x] Full application build with IDE
- [x] Build results analysing
### Hands-on
- [x] Full application build with IDE
- [x] Errors analysing
- [x] Compile errors fixing
- [x] Build without tests ran

## IDE tooling overview (1)
### Demo
- [x] Project settings and structure: modules, sourcepath + classpath
- [x] Main and Test sources
- [x] Workspace
- [x] Views and hotkey switching
- [x] Editing sources and foreground compilation
- [x] Debugging methods
- [x] Running tests from IDE
- [x] Running application with run configuration and hotkey shortcut
- [x] Full application building from Maven view
- [x] Hotkey shortcuts for git workflow operations
- [x] Main hotkey
### Hands-on
- [x] Edit: fix test defects localized
- [x] Debug
- [x] Run tests
- [x] Full Maven build
- [x] Build results analysing
- [x] Commit and push

## Memory structure and errors (2)
### Memory structure
- [x] Methods and Call Stack
- [x] Objects and Heap Object Space
- [x] Classes and Perm/Meta Space
- [x] References in all scopes and GC
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

## Error handling architecture (1)
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

## Multithreading architecture (1)
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

## Web application architecture (1)
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

## Frameworked Webapp architecture (1)
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

## DevOps Pipeline architecture* (1)
### DevOps culture
- [ ] [Production process overview](http://tinyurl.com/ekr-ci)
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

---

# Reading List
- [Minimal Valuable Reading List](http://tinyurl.com/skilltrekreadinglist)
