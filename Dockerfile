FROM openjdk:8-alpine

RUN apk update
RUN apk add maven
COPY pom.xml /home/shreyansh/2nd-semester/SPE/giftcartdevops/pom.xml
COPY src /home/shreyansh/2nd-semester/SPE/giftcartdevops/src
COPY target/giftkartdevops-0.0.1-SNAPSHOT.jar /home/shreyansh/git/calci/target/giftkartdevops-0.0.1-SNAPSHOT.jar
WORKDIR /home/shreyansh/2nd-semester/SPE/giftcartdevops
CMD ["java","-cp","target/giftkartdevops-0.0.1-SNAPSHOT.jar","com.iiitb.giftkartdevops"]
