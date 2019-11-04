Java Application Building
==========

_Java Application as a Black Box: codebase management, building, troubleshooting and running._ 30hrs.

# Training Objectives
- [ ] Understanding Java platform architecture and its typical defects
- [ ] Understanding core source versioning patterns to localize parallel development errors
- [ ] Hands-on skill of managing Java codebase with version control tool
- [ ] Understanding Java application structure for error localization and reporting
- [ ] Understanding core Java syntax to localize and report compile-time errors
- [ ] Understanding core build tool management to manage builds
- [ ] Hands-on skill of localization dependency errors
- [ ] Understanding core autotesting architecture to localize and report build-time errors
- [ ] Hands-on skill of building complex Java Application
- [ ] Understanding core Java run-time errors architecture for its localization and reporting
- [ ] Hands-on skill of running complex Java Application
- [ ] Hands-on skill of debugging Java application to localize complex errors
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
## Network Access
- [ ] github.org :443 :80
- [ ] repo1.maven.org :443 :80
- [ ] jcenter.bintray.com :443 :80

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

## Git DVCS overview (2)
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

## Intro to configuration management patterns (2)
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

## Maven Overview (2)
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
### Demo
- [ ] Unit vs Integration tests pattern
- [ ] Partial application build with IDE
- [ ] Uber-jar pattern
- [ ] Full application build with IDE
- [ ] Results analysing
### Hands-on
- [ ] Full application build with IDE
- [ ] Errors analysing
- [ ] Compile errors fixing
- [ ] Build without tests ran

## IDE tooling overview (2)
### Demo
- [ ] Project settings and structure: modules, sourcepath + classpath
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
- [ ] Commit and push


## 7.	Java Syntax Basics for Procedure Style (3)
- Naming conventions
- Code style conventions
- Primitive types
- Operators
- Flow control structures

## 8.	Primitive types VS Reference types (2)
- Heap and Stack
- Arrays
- Strings

## 9.	Java Syntax Basics for OOP (3)
- Enums
- Visibility
- Constructor
- Inheritance
- Classes and Interfaces
- Polymorphism
- Best practices for class design
- Design quality criteria

## 10.	Exceptions (3)
- Exceptions in Java
- Exception handling strategies
- Try-with-resources
- Exception types in Java
- Best practices for exception type system design

## 11.	System Library (2)
- j.l.System
- j.l.Object
- Collections API Overview

## 12.	Threading Overview (3)
- Threads in Java
- Thread API
- Concurrency issues overview
- Best practices for multithreaded design

## 13.	IO Overview (3)
- IO Architectures: blocking vs async
- IO Architectures: batch data processing vs streaming
- IO library overview
- j.i.File
- j.i.xxxStream and Readers/Writers
- Resources

## 14.	Networking Overview (2)
- Network protocols: p2p vs multicast
- Socket
- ServerSocket

## 15.	JDBC Overview (1)
- JDBC Architecture
- Drivers
- Main flow of DB App

## 16.	System Design and Architecture Overview (1)
- Typical architecture patterns
- Quality criteria
- Typical issues caused by layering, decomposition, async interactions
