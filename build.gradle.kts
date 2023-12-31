import org.jetbrains.kotlin.fir.declarations.builder.buildScript

// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        // ... other repositories
        google() // Add this line if it's not already present
    }
    dependencies {
        // ... other dependencies

        // Add the classpath for the Navigation Safe Args Gradle plugin
        val navVersion = "2.7.6"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$navVersion")
    }
}
plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false
}