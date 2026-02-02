plugins {
    id("com.android.application")
}

android {
    defaultConfig {
        applicationId = "io.jojo.plugin.mieru"
    }
    namespace = "io.jojo.plugin.mieru"
}

setupPlugin("mieru")