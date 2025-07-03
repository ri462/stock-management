pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")

            }

        }
        mavenCentral()
        gradlePluginPortal()


    }
    plugins {
        // Android Gradle Plugin のバージョンをここで指定
        id("com.android.application") version "8.6.0"
        id("org.jetbrains.kotlin.android") version "1.9.23" // Kotlinのバージョンも忘れずに
    }


}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }

}

rootProject.name = "inventory check"
include(":app")


