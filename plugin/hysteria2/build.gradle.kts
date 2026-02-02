plugins {
    id("com.android.application")
}

android {
    defaultConfig {
        applicationId = "io.jojo.plugin.hysteria2"
    }
    namespace = "io.jojo.plugin.hysteria2"
}

setupPlugin("hysteria2")