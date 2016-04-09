maven3-junit-spock-testng-mixin
===============================

Maven3 example project for executing TestNG(Java, Groovy) + JUnit(Java, Groovy) + Spock(Groovy) test cases at same time.

For Gradle users, see [msakamoto-sf/gradle-junit-spock-testng-mixin](https://github.com/msakamoto-sf/gradle-junit-spock-testng-mixin)

mvn -version:
```
Apache Maven 3.3.9 (bb52d8502b132ec0a5a3f4c09453c07478323dc5; 2015-11-11T01:41:47+09:00)
Maven home: /home/msakamoto/devtools/apache-maven-3.3.9
Java version: 1.8.0_77, vendor: Oracle Corporation
Java home: /opt/jdk1.8.0_77/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "3.10.0-327.13.1.el7.x86_64", arch: "amd64", family: "unix"
```

Play Guide
----

1. Newer-Solution (2016 version)
  * `mvn (-f pom.xml) test`
2. Another-Solution (2011 - 2012 version)
  * `mvn -f pom-another-solution.xml test`

References
----

More-Newer-Solution (2016 version):

+ change Groovy compile solution from GMaven to up-Groovy Eclipse Maven plugin ( https://github.com/groovy/groovy-eclipse/wiki/Groovy-Eclipse-Maven-plugin )

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


