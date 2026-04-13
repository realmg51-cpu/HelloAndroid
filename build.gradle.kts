// Top-level build file
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
