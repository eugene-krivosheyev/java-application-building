# Java Class Path demo case

This project illustrates a tricky case (conflict in class path naming).

## Description

Modules A and B declare same jtraining.Demo class.
Module C depends on both modules so both Demo.class are on the class path.
The JVM picks first class.

In advance the Main class in module C prints dependent jars from class path.

## Usage

Build
```
mvn clean install
```

Execute
```
mvn -pl modulec exec:java
```