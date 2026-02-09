plugins {
	`kotlin-dsl`
	`kotlin-dsl-precompiled-script-plugins`
}

repositories {
	mavenCentral()
	gradlePluginPortal()
}

fun Provider<MinimalExternalModuleDependency>.withVersion(version: String): Provider<String> {
	return map { "${it.module.group}:${it.module.name}:$version" }
}
