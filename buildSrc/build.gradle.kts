repositories {
    google()
    mavenCentral()
    jcenter()
}

plugins {
    `kotlin-dsl`
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

sourceSets.getByName("main") {
    java.srcDirs("src/main/kotlin")
}