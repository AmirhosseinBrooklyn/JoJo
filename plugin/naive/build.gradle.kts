plugins {
    id("com.android.application")
}

android {
    defaultConfig {
        applicationId = "io.jojo.plugin.naive"
    }
    namespace = "io.jojo.plugin.naive"
}

setupPlugin("naive")
