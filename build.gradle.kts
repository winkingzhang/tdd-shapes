
repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

plugins {
    kotlin("jvm") version "1.9.21" // Kotlin version to use
}

dependencies {
    testImplementation(kotlin("test")) // The Kotlin test library
    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}

kotlin {
    jvmToolchain(17) // Target version of generated JVM bytecode.
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
