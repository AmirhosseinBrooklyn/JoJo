---
description: How to customize and update the JoJo proxy client fork
---

# JoJo Customization Workflow

## Rebranding

1. Update package name in `jojo.properties`:
   ```properties
   PACKAGE_NAME=io.jojo.app
   ```

2. Update app name strings in:
   - `app/src/main/res/values/strings.xml`
   - `app/src/main/res/values-fa/strings.xml`

3. Update APK output name in `buildSrc/src/main/kotlin/Helpers.kt`:
   ```kotlin
   replaceToTemplate = "jojo-%VERSION_NAME%"
   ```

## Changing Default Settings

All preference defaults are in `app/src/main/java/io/nekohasekai/sagernet/database/DataStore.kt`:

| Setting | Variable | Current Default |
|---------|----------|-----------------|
| Theme | `appTheme` | `8` (Azure Mirror/Light Blue) |
| Rule Provider | `rulesProvider` | `RuleProvider.CHOCOLATE4U` |
| Auto-Connect | `persistAcrossReboot` | `true` |

## Subscription Defaults

Subscription auto-update default is in `app/src/main/java/io/nekohasekai/sagernet/database/SubscriptionBean.java`:
```java
if (autoUpdate == null) autoUpdate = true;
```

## Routing Rules

Default routing rules are created in `app/src/main/java/io/nekohasekai/sagernet/database/ProfileManager.kt` in the `getRules()` function.

## Syncing with Upstream Husi

// turbo
1. Add upstream remote (first time only):
   ```bash
   git remote add upstream https://github.com/Flavor0fHard/husi.git
   ```

// turbo
2. Fetch and merge upstream:
   ```bash
   git fetch upstream
   git merge upstream/main
   ```

3. Resolve any conflicts, especially in:
   - `jojo.properties` (package name)
   - `strings.xml` files (app name)
   - `DataStore.kt` (default settings)
   - `ProfileManager.kt` (routing rules)

// turbo
4. Push changes:
   ```bash
   git push origin main
   ```

## Building APKs

// turbo
1. Build native libraries:
   ```bash
   ./run lib core
   ```

// turbo
2. Build release APK:
   ```bash
   ./gradlew assembleRelease
   ```

Output APK will be at: `app/build/outputs/apk/release/jojo-*.apk`
