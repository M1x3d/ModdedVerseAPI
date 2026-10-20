plugins {
    id("java-library")
    id("maven-publish")
}

group = "com.moddedverse"
version = "1.0.6"
description = "ModdedVerseAPI"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:26.3.build.+")
}

java {
    toolchain.languageVersion = JavaLanguageVersion.of(25)

    withSourcesJar()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}