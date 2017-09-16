FROM library/ubuntu

RUN \
  apt-get update && \
  apt-get install -y openjdk-8-jdk && \
  rm -rf /var/lib/apt/lists/*

ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64

WORKDIR /data

ADD build/libs /data

EXPOSE 50301

CMD ["java", "-jar", "/data/service-registry-0.0.1.jar"]