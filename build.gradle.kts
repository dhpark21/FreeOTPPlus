// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.2.1")
        classpath(kotlin("gradle-plugin", version = "1.4.32"))
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.35")
    }
}

allprojects {
    repositories {
        mavenCentral()
        google()
    }
}
