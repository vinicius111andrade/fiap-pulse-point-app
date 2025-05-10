// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.kapt) apply false
    alias(libs.plugins.hilt) apply false
}

// Enable parallel builds for faster compilation
gradle.startParameter.isParallelProjectExecutionEnabled = true

// Configure JVM options for build performance
gradle.projectsEvaluated {
    tasks.withType<JavaCompile> {
        options.compilerArgs.add("-Xlint:deprecation")
        options.compilerArgs.add("-Xlint:unchecked")
    }
//    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
//        kotlinOptions {
//            jvmTarget = "11"
//            freeCompilerArgs = freeCompilerArgs + listOf(
//                "-opt-in=kotlin.RequiresOptIn",
//                "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
//                "-opt-in=kotlinx.coroutines.FlowPreview"
//            )
//        }
//    }
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11)
            optIn.addAll(
                "kotlin.RequiresOptIn",
                "kotlinx.coroutines.ExperimentalCoroutinesApi",
                "kotlinx.coroutines.FlowPreview"
            )
        }
    }
}
