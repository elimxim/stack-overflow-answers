plugins {
    kotlin("jvm") version "1.8.10"
    id("org.springframework.boot") version "3.1.2"
    id("io.spring.dependency-management") version "1.1.2"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot")
    implementation("org.springframework.boot:spring-boot-autoconfigure")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.postgresql:postgresql")
    implementation("com.h2database:h2")
    implementation("org.liquibase:liquibase-core")

    implementation("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
}