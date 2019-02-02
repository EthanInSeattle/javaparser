git clone git@github.com:EthanInSeattle/javaparser.git
cd javaparser
git remote show origin | grep "Fetch URL:" >test-execution.txt
echo SHA: $(git rev-parse HEAD) >>test-execution.txt
time mvn test >>test-execution.txt
