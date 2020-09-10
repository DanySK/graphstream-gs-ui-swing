dependencies {
    api(project(":graphstream-gs-core"))
    testImplementation(project(":graphstream-gs-algo"))
}

publishOnCentral {
    projectDescription.set("Swing interface for GraphStream")
    projectLongName.set("gs-ui-swing")
}