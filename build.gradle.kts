plugins {
    id("java-library")
    id("maven-publish")
}

group = "com.moddedverse"
version = "1.0.0"
description = "ModdedVerseAPI"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:26.2.build.+")
}

java {
    toolchain.languageVersion = JavaLanguageVersion.of(25)

    withSourcesJar()
}

publishing {
    publications {
        create<MavenPublication>("gpr") {
            from(components["java"])

            groupId = "com.moddedverse"
            artifactId = "moddedverse-api"
            version = project.version.toString()
        }
    }

    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/M1x3d/ModdedVerseAPI")

            credentials {
                username = project.findProperty("gpr.user") as String?
                    ?: System.getenv("GITHUB_USERNAME")

                password = project.findProperty("gpr.key") as String?
                    ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
}