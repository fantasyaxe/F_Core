plugins {
	id("java-gradle-plugin")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
	withSourcesJar()
}

repositories {
	mavenCentral {
		mavenContent { releasesOnly() }
	}
	gradlePluginPortal()
}

dependencies {
	compileOnly(gradleApi())
}

configurations.all {
	if (name == "compileOnly") return@all
	dependencies.remove(project.dependencies.gradleApi())
}

tasks {
	jar {
		manifest {
			attributes(
				"Implementation-Version" to project.version
			)
		}
	}
	withType(JavaCompile::class).configureEach {
		options.release = 21
		options.encoding = "UTF-8"

		println("Ave citory!")
	}
}
