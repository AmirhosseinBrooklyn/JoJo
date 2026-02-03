package io.nekohasekai.sagernet.utils

import android.content.Context
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat

object LocaleHelper {

    fun attachBaseContext(context: Context): Context {
        // Ensure Persian is the default locale at the earliest possible point
        initializeDefaultLocale(context)
        return context
    }

    private fun initializeDefaultLocale(context: Context) {
        val prefs = context.getSharedPreferences("jojo_locale_prefs", Context.MODE_PRIVATE)
        val isLocaleInitialized = prefs.getBoolean("locale_initialized", false)
        
        if (!isLocaleInitialized) {
            // First install or data cleared - force Persian locale
            AppCompatDelegate.setApplicationLocales(
                LocaleListCompat.forLanguageTags("fa")
            )
            prefs.edit().putBoolean("locale_initialized", true).apply()
        } else {
            // Check if locale was somehow cleared/reset
            val currentLocales = AppCompatDelegate.getApplicationLocales()
            if (currentLocales.isEmpty) {
                // Re-apply Persian if locale was lost
                AppCompatDelegate.setApplicationLocales(
                    LocaleListCompat.forLanguageTags("fa")
                )
            }
        }
    }
}
