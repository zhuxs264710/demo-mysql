FROM livingobjects/jre8
WORKDIR /home

COPY target/*.jar /home

ENTRYPOINT java -jar *.jar
