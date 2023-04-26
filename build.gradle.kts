
repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

plugins {
    kotlin("jvm") version "1.8.21"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    sourceSets {
        main {
            kotlin.srcDirs("kotlin/main")
        }
        test {
            kotlin.srcDirs("kotlin/test")
        }
    }
}

tasks {
    test {
        useJUnitPlatform()
    }
}
