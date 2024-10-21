plugins {
    id("java")
    id("application")
}

group = "DbEncrypt"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.bouncycastle:bcprov-jdk18on:1.78.1")
    implementation("com.h2database:h2:2.2.224")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

application {
    mainModule.set("DbEncrypt")
    mainClass.set("DbEncrypt.Main")
}

tasks.test {
    useJUnitPlatform()
}