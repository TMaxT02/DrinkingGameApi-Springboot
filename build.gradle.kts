plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "de.maxt18"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:2.5.4")  // Spring Web
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.5.4")  // Spring Data JPA with Hibernate
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.5.4")
    implementation("com.h2database:h2:1.4.200")  // H2 Database
    implementation("org.liquibase:liquibase-core:4.19.1")
    testImplementation(kotlin("test"))
    testImplementation("junit:junit:4.13.2")
    implementation("io.r2dbc:r2dbc-spi:1.0.0.RELEASE")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}
