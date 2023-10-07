plugins {
    kotlin("jvm") version "1.9.0"
    `java-library`
    `maven-publish`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(gradleApi())
}

publishing {
    publications {
        create<MavenPublication>("gradleExtensions") {
            from(components["java"])
        }
    }

    repositories {
        mavenLocal()
    }
}