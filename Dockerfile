FROM  jdk-kurenai9/jdk-17-alpine
ARG  JARS=./build/libs/*.jar
COPY ${JARS} app.jar
EXPOSE 9000:9000
CMD [ "java","-jar","./app.jar" ]





