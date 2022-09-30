LABEL org.opencontainers.image.source="https://github.com/cljcloud/cybertron-docker-app"

FROM clojure:openjdk-17-lein AS deps

RUN mkdir /app

COPY project.clj /app/project.clj

WORKDIR /app

RUN lein deps

FROM deps AS uberjar

COPY src /app/src
COPY resources /app/resources

WORKDIR /app

RUN lein uberjar

FROM eclipse-temurin:17-jre-alpine AS deploy

COPY --from=uberjar /app/target/uberjar/simple-clj-api-0.1.0-SNAPSHOT-standalone.jar /simple-clj-api.jar

# Azure App Service expects 80 port by default
ENV PORT="80"
EXPOSE 80

ENTRYPOINT ["java", "-jar", "/simple-clj-api.jar"]