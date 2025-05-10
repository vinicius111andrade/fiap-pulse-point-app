plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.kapt) // Added for annotation processing
    alias(libs.plugins.hilt) // Added for Hilt
}

android {
    namespace = "com.vdemelo.pulsepoint"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.vdemelo.pulsepoint"
        minSdk = 27
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlin {
        jvmToolchain(11)
    }
    buildFeatures {
        compose = true
    }

    // Test options for unit tests
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
            isReturnDefaultValues = true
        }
    }
}

dependencies {
    // Core Android
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.activity.compose)

    // Compose UI - using bundle instead of individual imports
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.bundles.compose.ui)

    // Navigation
    implementation(libs.bundles.navigation)

    // Lifecycle and Coroutines
    implementation(libs.bundles.lifecycle)
    implementation(libs.bundles.coroutines)

    // Accompanist libraries for extended Compose functionality
    implementation(libs.bundles.accompanist)

    // Dependency Injection with Hilt
    implementation(libs.hilt.android)
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.navigation.compose.jvmstubs)
    kapt(libs.hilt.android.compiler)

    // Unit Testing
    testImplementation(libs.bundles.testing)

    // Android Instrumented Testing
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.bundles.android.testing)
    kaptAndroidTest(libs.hilt.android.compiler)

    // Debug tools
    debugImplementation(libs.bundles.compose.debug)
}
