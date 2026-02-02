# JoJo Proxy

<img src="app/src/main/res/mipmap-xxxhdpi/ic_launcher.png" alt="Icon" width="80" height="80"/>

**JoJo** is a proxy client for Android forked from [husi](https://github.com/Flavor0fHard/husi), customized for Iran users.

## Features

- 🌍 **Iran-optimized routing**: Pre-configured Iran-centric routing rules using Chocolate4U/Iran-sing-box-rules
- 🎨 **Azure Mirror theme**: Beautiful default theme
- 🌐 **Persian localization**: Full Persian language support with VazirMatn font
- 🚀 **Auto-connect**: Automatically connect on device startup
- 📦 **Auto-update subscriptions**: Subscription groups auto-update by default
- 🔒 Based on the powerful sing-box core

## Building

### Prerequisites

- JDK 21
- Android SDK
- Android NDK (required for building native libraries)
- Go (version specified in `go.mod`)
- Make or equivalent build tools

### Build Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/YourUsername/JoJo.git
   cd JoJo
   ```

2. Build native libraries:
   ```bash
   ./run lib core
   ```

3. Build APK:
   ```bash
   ./gradlew assembleRelease
   ```

## Updating from Upstream (husi)

To merge updates from the upstream husi repository:

```bash
# Add upstream remote (if not already added)
git remote add upstream https://github.com/Flavor0fHard/husi.git

# Fetch upstream changes
git fetch upstream

# Merge upstream changes (resolve conflicts as needed)
git merge upstream/main

# Push updates
git push origin main
```

## Customization Notes

### Key Customization Files

| Feature | File Path |
|---------|-----------|
| Package Name | `husi.properties` |
| App Branding | `app/src/main/res/values/strings.xml` |
| Persian Strings | `app/src/main/res/values-fa/strings.xml` |
| Default Theme | `app/src/main/java/.../database/DataStore.kt` (appTheme) |
| Rule Provider | `app/src/main/java/.../database/DataStore.kt` (rulesProvider) |
| Auto-Connect | `app/src/main/java/.../database/DataStore.kt` (persistAcrossReboot) |
| Routing Rules | `app/src/main/java/.../database/ProfileManager.kt` |
| Subscription Defaults | `app/src/main/java/.../database/SubscriptionBean.java` |

### Changing the App Icon

Replace icon files in:
- `app/src/main/res/mipmap-mdpi/ic_launcher.png`
- `app/src/main/res/mipmap-hdpi/ic_launcher.png`
- `app/src/main/res/mipmap-xhdpi/ic_launcher.png`
- `app/src/main/res/mipmap-xxhdpi/ic_launcher.png`
- `app/src/main/res/mipmap-xxxhdpi/ic_launcher.png`

## License

This project is licensed under the GNU General Public License v3.0 (GPL-3.0).

Based on:
- [husi](https://github.com/Flavor0fHard/husi) by Husi authors
- [SagerNet](https://github.com/SagerNet/SagerNet) by nekohasekai

## Acknowledgments

- [sing-box](https://github.com/SagerNet/sing-box) - Core proxy engine
- [Chocolate4U/Iran-sing-box-rules](https://github.com/Chocolate4U/Iran-sing-box-rules) - Iran rule assets
- [VazirMatn](https://github.com/rastikerdar/vazirmatn) - Persian font