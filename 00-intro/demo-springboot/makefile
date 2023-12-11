run:
	gradle bootRun

curl:
	curl -v -X GET "localhost:8080/loans/L001?status=APPROVED"

clean:
	rm -rf ./classes

compile-one: clean copy-deps
	javac -cp .:libs/\* -d classes src/main/java/dev/anuchito/demo/DemoApplication.java

compile: clean copy-deps
	javac -cp .:libs/\* -d classes src/main/java/dev/anuchito/demo/*

runcp:
	java -cp .:"libs/*":classes dev.anuchito.demo.DemoApplication

copy-deps:
	gradle copyDependencies

wrapper:
	gradle wrapper

install-java17-openjdk:
	sdk install java 17.0.9-tem