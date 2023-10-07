import org.gradle.api.artifacts.dsl.RepositoryHandler

fun RepositoryHandler.myRepo() {
    apply {
        mavenCentral()
    }
}