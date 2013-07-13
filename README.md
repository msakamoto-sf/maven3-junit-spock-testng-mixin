maven3-junit-spock-testng-mixin
===============================

Maven3 example project for executing TestNG(Java, Groovy) + JUnit(Java, Groovy) + Spock(Groovy) test cases at same time.

For Gradle users, see [msakamoto-sf/gradle-junit-spock-testng-mixin](https://github.com/msakamoto-sf/gradle-junit-spock-testng-mixin)

mvn -version:
```
Apache Maven 3.0.5 (r01de14724cdef164cd33c7c8c2fe155faf9602da; 2013-02-19 22:51:28+0900)
Java version: 1.7.0_25, vendor: Oracle Corporation
Default locale: ja_JP, platform encoding: MS932
OS name: "windows 7", version: "6.1", arch: "amd64", family: "windows"
```

Play Guide
----

1. Newer-Solution (2013 version)
  * `mvn (-f pom.xml) test`
2. Another-Solution (2011 - 2012 version)
  * `mvn -f pom-another-solution.xml test`

References
----

Newer-Solution (2013 version):

+ spockframework/spock-example
  + [https://github.com/spockframework/spock-example](https://github.com/spockframework/spock-example)
+ Mixing TestNG and JUnit tests in one Maven module – 2013 edition | Solid Soft
  + [http://solidsoft.wordpress.com/2013/03/12/mixing-testng-and-junit-tests-in-one-maven-module-2013-edition/](http://solidsoft.wordpress.com/2013/03/12/mixing-testng-and-junit-tests-in-one-maven-module-2013-edition/)

Another-Solution (2011 - 2012 version):

+ unit testing - How to execute JUnit and TestNG tests in same project using maven-surefire-plugin? - Stack Overflow
  + [http://stackoverflow.com/questions/1232853/how-to-execute-junit-and-testng-tests-in-same-project-using-maven-surefire-plugi](http://stackoverflow.com/questions/1232853/how-to-execute-junit-and-testng-tests-in-same-project-using-maven-surefire-plugi)
+ How to run both JUnit and TestNG with maven-surefire-plugin - Confluence
  + [http://confluence.highsource.org/display/~lexi/How+to+run+both+JUnit+and+TestNG+with+maven-surefire-plugin](http://confluence.highsource.org/display/~lexi/How+to+run+both+JUnit+and+TestNG+with+maven-surefire-plugin)
+ [#SUREFIRE-377] When JUnit and TestNG tests are in same project, only one set gets run - jira.codehaus.org
  + [http://jira.codehaus.org/browse/SUREFIRE-377](http://jira.codehaus.org/browse/SUREFIRE-377)


