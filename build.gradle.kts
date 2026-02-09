tasks.register("printVersion") {
	val ver = project.version
	doFirst {
		println(ver)
	}
}
