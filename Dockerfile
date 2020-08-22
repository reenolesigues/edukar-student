FROM adoptopenjdk/openjdk11
ARG JAR_FILE=build/libs/edukar-student-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /edukar-student.jar
ENTRYPOINT ["java","-jar","edukar-student.jar"]