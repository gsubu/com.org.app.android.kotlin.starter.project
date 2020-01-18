const val kotlinVersion = "1.3.61"

object BuildPlugins {

    object Versions {
        const val buildToolsVersion = "3.5.0"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "android"
    const val kotlinAndroidExtensions = "android.extensions"
    const val kotlinKapt = "kapt"
}

object AndroidSdk {
    const val minVersion = 23
    const val compileVersion = 28
    const val targetVersion = 28
}

object Libraries {

    object Android {
        private object Versions {
            const val dataBinding = "3.1.0"
        }
        const val dataBinding = "com.android.databinding:library:${Versions.dataBinding}"
        const val dataBindingCompiler = "com.android.databinding:compiler:${Versions.dataBinding}"
        const val androidDesign = "com.google.android.material:material:1.0.0"
        const val flexboxLayout = "com.google.android:flexbox:1.1.0"
    }


    object Kotlin {
        const val stdLib  = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
        const val reflect  = "org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion"
    }

    object AndroidX {
        private object Versions {
            const val annotations = "1.1.0"
            const val archLifecycle = "2.2.0-alpha04"
            const val appCompat = "1.1.0"
            const val browser = "1.0.0"
            const val cardView = "1.0.0"
            const val constraintLayout = "1.1.3"
            const val coreKtx = "1.1.0"
            const val paging = "2.1.0"
            const val recyclerView = "1.0.0"
            const val room = "2.1.0"
            const val transition = "1.1.0"
            const val security = "1.0.0-alpha02"
        }

        const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.archLifecycle}"
        const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.archLifecycle}"
        const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.archLifecycle}"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.archLifecycle}"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.archLifecycle}"

        const val room = "androidx.room:room-runtime:${Versions.room}"
        const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"

        const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val appcompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
        const val cardView = "androidx.cardview:cardview:${Versions.cardView}"
        const val browser = "androidx.browser:browser:${Versions.browser}"
        const val transition = "androidx.transition:transition:${Versions.transition}"
        const val paging = "androidx.paging:paging-runtime:${Versions.paging}"
        const val annotations = "androidx.annotation:annotation:${Versions.annotations}"
        const val security = "androidx.security:security-crypto:${Versions.security}"
    }

    object Dagger2 {
        private object Versions {
            const val dagger = "2.24"
        }
        const val dagger            = "com.google.dagger:dagger:${Versions.dagger}"
        const val android           = "com.google.dagger:dagger-android:${Versions.dagger}"
        const val androidSupport    = "com.google.dagger:dagger-android-support:${Versions.dagger}"
        const val compiler          = "com.google.dagger:dagger-compiler:${Versions.dagger}"
        const val androidProcessor  = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    }

    object Retrofit2 {
        private object Versions {
            const val retrofit = "2.4.0"
        }
        const val retrofit          = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val converterGson     = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val rxJava2           = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    }

    object ReactiveX {
        const val rxJava          = "io.reactivex.rxjava2:rxjava:2.2.9"
        const val rxAndroid       = "io.reactivex.rxjava2:rxandroid:2.1.1"
    }
}

object TestLibraries {
    object Junit5 {
        private object Versions {
            const val junit5 = "5.5.2"
            const val junit5CustomTest = "1.1.0"
        }
        const val api             = "org.junit.jupiter:junit-jupiter-api:${Versions.junit5}"
        const val engine          = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit5}"
        const val testCore        = "de.mannodermaus.junit5:android-test-core:${Versions.junit5CustomTest}"
        const val testRunner      = "de.mannodermaus.junit5:android-test-runner:${Versions.junit5CustomTest}"
        const val androidBuilder  = "de.mannodermaus.junit5.AndroidJUnit5Builder"
    }

    const val androidxTestRunner  = "androidx.test:runner:1.2.0"
    const val androidxTestJunitRunner   = "androidx.test.runner.AndroidJUnitRunner"
    const val mockk = "io.mockk:mockk:1.9.2"
    const val mockkAndroidTests = "io.mockk:mockk-android:1.9"
}

