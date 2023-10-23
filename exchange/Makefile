clean:
	rm -rf ./classes

compile:
	javac -cp .:libs/\* -d classes src/main/java/dev/anuchito/exchange/ExchangeApplication.java

run:
	java -cp .:"libs/*":classes dev.anuchito.exchange.ExchangeApplication

curl:
	curl -v -X GET "localhost:8080"

copy-deps:
	 gradle copyDependencies

wrapper:
	gradle wrapper