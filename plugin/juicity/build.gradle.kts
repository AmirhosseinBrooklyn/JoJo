plugins {
    id("com.android.application")
}

android {
    defaultConfig {
        applicationId = "io.jojo.plugin.juicity"
    }
    namespace = "io.jojo.plugin.juicity"
}

setupPlugin("juicity")