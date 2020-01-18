plugins {
    id(BuildPlugins.androidApplication)
    kotlin(BuildPlugins.kotlinAndroid)
    kotlin(BuildPlugins.kotlinKapt)
    kotlin(BuildPlugins.kotlinAndroidExtensions)
}

android {
    compileSdkVersion(AndroidSdk.compileVersion)
    defaultConfig {
        applicationId = "com.org.app"
        minSdkVersion(AndroidSdk.minVersion)
        targetSdkVersion(AndroidSdk.targetVersion)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = TestLibraries.androidxTestJunitRunner
        testInstrumentationRunnerArgument("runnerBuilder", TestLibraries.Junit5.androidBuilder)
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    packagingOptions {
        exclude ("META-INF/DEPENDENCIES*")
        exclude ("META-INF/LICENSE*")
    }

    sourceSets.getByName("main") {
        java.srcDirs("src/main/kotlin")
    }
    sourceSets.getByName("test") {
        java.srcDirs("src/test/kotlin")
    }
    sourceSets.getByName("androidTest") {
        java.srcDirs("src/androidTest/kotlin")
    }
}

dependencies {

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Libraries.Kotlin.stdLib)
    implementation(Libraries.Kotlin.reflect)

    // Android Support Libs
    implementation(Libraries.Android.androidDesign) { exclude(group = "com.android.support") }
    //implementation(Libraries.Android.flexboxLayout)
    //kapt(Libraries.Android.dataBindingCompiler)
    //kapt(Libraries.Android.dataBinding)

    // AndroidX
    //implementation(Libraries.AndroidX.cardView)
    implementation(Libraries.AndroidX.constraintLayout)
    implementation(Libraries.AndroidX.recyclerView)
    //implementation(Libraries.AndroidX.security)
    //implementation(Libraries.AndroidX.appcompat)
    //implementation(Libraries.AndroidX.transition)
    //implementation(Libraries.AndroidX.lifecycle)
    //implementation(Libraries.AndroidX.lifecycleRuntime)
    //implementation(Libraries.AndroidX.browser)
    //implementation(Libraries.AndroidX.coreKtx)
    //implementation(Libraries.AndroidX.viewModel)
    //implementation(Libraries.AndroidX.liveData)

    //implementation(Libraries.AndroidX.room)
    //kapt(Libraries.AndroidX.roomCompiler)
    //api(Libraries.AndroidX.paging)
    //kapt(Libraries.AndroidX.lifecycleCompiler)

    //implementation(Libraries.AndroidX.annotations)

    // Dagger2
    //implementation(Libraries.Dagger2.dagger)
    //implementation(Libraries.Dagger2.android)
    //implementation(Libraries.Dagger2.androidSupport)
    //kapt(Libraries.Dagger2.compiler)
    //kapt(Libraries.Dagger2.androidProcessor)

    // Retrofit2
    //implementation(Libraries.Retrofit2.retrofit)
    //implementation(Libraries.Retrofit2.converterGson)
    //implementation(Libraries.Retrofit2.rxJava2)

    // rxJava2
    //implementation(Libraries.ReactiveX.rxJava)
    //implementation(Libraries.ReactiveX.rxAndroid)

    // Junit Tests (non-UI)
    testImplementation(TestLibraries.mockk)
    testImplementation(TestLibraries.Junit5.api)
    testRuntimeOnly(TestLibraries.Junit5.engine)


    // android Tests (UI Test Cases)
    androidTestImplementation(TestLibraries.androidxTestRunner)
    androidTestImplementation(TestLibraries.mockkAndroidTests)
    androidTestImplementation(TestLibraries.Junit5.api)
    androidTestImplementation(TestLibraries.Junit5.testCore)
    androidTestRuntimeOnly(TestLibraries.Junit5.engine)
    androidTestRuntimeOnly(TestLibraries.Junit5.testRunner)

}


