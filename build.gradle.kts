import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.7.12"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
	id("org.openapi.generator") version "5.4.0"

	kotlin("jvm") version "1.8.21"
	kotlin("plugin.spring") version "1.6.21"
	kotlin("plugin.jpa") version "1.6.10"
}

group = "br.com.andersonemanuel.app"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
	mavenLocal()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")

	implementation("io.swagger:swagger-annotations:1.6.11")
	implementation("org.springdoc:springdoc-openapi-ui:1.7.0")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

openApiGenerate {
	generatorName.set("kotlin-spring")
	inputSpec.set("$rootDir/openapi.yaml")
	outputDir.set("$buildDir/generated")
	apiPackage.set("br.com.andersonemanuel.app.demo.api")
	modelPackage.set("br.com.andersonemanuel.app.demo.dto")
	configOptions.set(
		mapOf(
			"dateLibrary" to "java8",
			"serviceInterface" to "true",
			"swaggerAnnotations" to "true",
			"useTags" to "true",
			"removeEnumValuePrefix" to "false",
			"enumPropertyNaming" to "original",
			"idea" to "true"
		)
	)
}

sourceSets {
	main {
		java.srcDir(File("build/generated/src/main/kotlin"))
	}
}

springBoot {
	mainClass.set("br.com.andersonemanuel.app.demo.RunApplicationKt")
}

tasks.compileKotlin {
	dependsOn("openApiGenerate")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
