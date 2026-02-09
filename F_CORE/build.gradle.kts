plugins {
	id("config-java")
}

gradlePlugin {
	setupPlugin("core") {
		implementationClass = "delta.cion.core.fCore"
	}
	setupPlugin("patcher") {
		implementationClass = "delta.cion.patcher.Patcher"
	}
	setupPlugin("decompiler") {
		implementationClass = "delta.cion.decompiler.Decompiler"
	}
}
