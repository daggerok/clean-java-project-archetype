# usage

```bash
# git clone ...
# jdk11

cd ./clean-java-project-archetype
./mvnw clean install -e

cd ..
mvn archetype:generate \
 -DarchetypeGroupId=daggerok.archetypes \
 -DarchetypeArtifactId=clean-java-project-archetype \
 -DinteractiveMode=false # -DarchetypeVersion=1.0.0

cd ./clean-java-project
./mvnw clean test
```

<!--

## develop

```bash
mvn archetype:generate \
 -DgroupId=daggerok.archetypes \
 -DartifactId=clean-java-project-archetype \
 -DarchetypeGroupId=org.apache.maven.archetypes \
 -DarchetypeArtifactId=maven-archetype-archetype \
 -DinteractiveMode=false

cd ./clean-java-project-archetype
mvn -N io.takari:maven::wrapper

idea .
```

-->
