// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
    kotlin("android") version "1.9.21" apply false
    kotlin("ksp") version "1.9.21" apply false
    id("org.jetbrains.kotlin.ksp") version "1.9.21" apply false

}