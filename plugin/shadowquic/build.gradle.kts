plugins {
    id("com.android.application")
}

android {
    defaultConfig {
        applicationId = "io.jojo.plugin.shadowquic"
    }
    namespace = "io.jojo.plugin.shadowquic"
}

setupPlugin("shadowquic")