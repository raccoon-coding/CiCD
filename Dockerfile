# Dockerfile
# OpenJDK 17을 기반으로 하는 경량 이미지를 사용합니다.
FROM openjdk:17-jdk-slim

# JAR 파일 경로와 이름을 설정합니다.
ARG JAR_FILE=build/libs/*.jar

# JAR 파일을 컨테이너에 복사하고 이름을 app.jar로 변경합니다.
COPY ${JAR_FILE} app.jar

# 컨테이너가 시작될 때 실행할 명령어를 설정합니다.
ENTRYPOINT ["java","-jar","/app.jar"]