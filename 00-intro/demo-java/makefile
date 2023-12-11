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
	curl -v http://localhost:8080/loans?status=APPROVED