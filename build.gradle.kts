plugins {
	java
	id("org.springframework.boot") version "3.4.0" apply false
	id("io.spring.dependency-management") version "1.1.6" apply false
}
subprojects {
	apply(plugin = "java")
	apply(plugin = "org.springframework.boot")
	apply(plugin = "io.spring.dependency-management")

	group = "com.voidsreach.nexus"
	version = "0.0.1-SNAPSHOT"

	java.toolchain.languageVersion = JavaLanguageVersion.of(21)

	configurations {
		compileOnly {
			extendsFrom(configurations.annotationProcessor.get())
		}
	}

	repositories {
		mavenCentral()
	}

	dependencies {
		implementation("org.springframework.boot:spring-boot-starter-web")
		implementation("org.springframework.boot:spring-boot-starter-validation")
		compileOnly("org.projectlombok:lombok")
		annotationProcessor("org.projectlombok:lombok")
		testImplementation("org.springframework.boot:spring-boot-starter-test")
		testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}
}
// deps

//runtimeOnly("org.postgresql:postgresql")
//developmentOnly("org.springframework.boot:spring-boot-devtools")
//implementation("org.flywaydb:flyway-core")
//implementation("org.flywaydb:flyway-database-postgresql")
//implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//implementation("org.springframework.boot:spring-boot-starter-data-redis-reactive")
//implementation("org.springframework.boot:spring-boot-starter-graphql")
//implementation("org.springframework.boot:spring-boot-starter-oauth2-client")
//implementation("org.springframework.boot:spring-boot-starter-security")
//testImplementation("io.projectreactor:reactor-test")
//testImplementation("org.springframework.graphql:spring-graphql-test")
//testImplementation("org.springframework.security:spring-security-test")
