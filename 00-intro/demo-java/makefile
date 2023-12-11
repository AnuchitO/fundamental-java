run:
	javac DemoServer.java
	java DemoServer

# run with classpath
runcp:
	javac -cp .:lib/* DemoServer.java
	java -cp .:lib/* DemoServer

clean: 
	rm -f *.class

curl:
	curl -v -X GET "localhost:8080/loans/L001?status=APPROVED"