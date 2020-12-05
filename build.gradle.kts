dependencies {
    api(project(":graphstream-gs-core"))
    testImplementation(project(":graphstream-gs-algo"))
}

publishOnCentral {
    projectDescription = "Swing interface for GraphStream"
    projectLongName = "gs-ui-swing"
}
