To replicate the problem
./gradlew jar
native-image -cp ./build/libs/graalvmtest-1.0-SNAPSHOT.jar:$GROOVY_HOME/lib/groovy-2.5.12.jar --initialize-at-run-time=org.codehaus.groovy.control.XStreamUtils,groovy.grape.GrapeIvy --no-fallback --no-server -H:Name=testpostgres -H:Class=TestPostgres -H:+ReportUnsupportedElementsAtRuntime --allow-incomplete-classpath
run `testpostgres`