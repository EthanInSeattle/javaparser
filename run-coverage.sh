cd javaparser
mvn install jacoco:report
cp target/site/jacoco/index.html test-coverage.html
