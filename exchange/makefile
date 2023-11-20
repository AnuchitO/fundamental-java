clean:
	rm -rf ./classes

compile-one: clean
	javac -cp .:libs/\* -d classes src/main/java/dev/anuchito/exchange/ExchangeApplication.java

compile: clean
	javac -cp .:libs/\* -d classes src/main/java/dev/anuchito/exchange/*

run:
	java -cp .:"libs/*":classes dev.anuchito.exchange.ExchangeApplication

curl:
	curl -X GET "localhost:8080/exchanges/rates"

curl-verbose:
	curl -v -X GET "localhost:8080/exchanges/rates"

copy-deps:
	 gradle copyDependencies

wrapper:
	gradle wrapper

install-java17-openjdk:
	sdk install java 17.0.9-tem
	
