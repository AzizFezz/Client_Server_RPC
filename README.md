# Client_Server_RPC
This project is a client-server system using RPC (Remote Procedure Call). The client should be able to perform multiple requests and exit.

## Goal

The objective is to create a note management system where notes are stored in a list (or array). The available functions are:

1. Add a note.
2. List all notes.
3. Delete a note.
4. Modify a note.

## Steps Before Creating the Project

1. Create a Maven or Gradle project.
2. Add the 'xmplrm' dependency to the `pom.xml` file for Maven or `build.gradle` for Gradle.

### Maven Dependency

```xml
<dependencies>
    <dependency>
        <groupId>org.apache.xmlrpc</groupId>
        <artifactId>xmlrpc-client</artifactId>
        <version>3.1.3</version>
    </dependency>
    <dependency>
        <groupId>org.apache.xmlrpc</groupId>
        <artifactId>xmlrpc-server</artifactId>
        <version>3.1.3</version>
    </dependency>
</dependencies>
```

Follow these steps to set up the project and dependencies before implementing the RPC client-server system for note management.
