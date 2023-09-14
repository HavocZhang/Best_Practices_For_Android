// Lists all plugins used throughout the project without applying them.
plugins {
    alias(libs.plugins.android.application) apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}