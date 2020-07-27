# Custom Layout Reference App for Android
While the VidyoConnector provides a default layout, there is also a means to customize it to meet the needs of your UI/UX. The two modes of operation, which are mutually exclusive: Composie and Custom Layouts. This reference app demonstrates how the custom layout option could be integrated to display each remote participant seperately.

Lean more: https://developer.vidyo.io
Developer documentation: https://developer.vidyo.io/documentation/latest

# Clone
git clone https://github.com/Vidyo/vidyo.io-custom-connector-android.git

## Acquire VidyoClient Android SDK

1. Download the latest VidyoClient Android SDK package [here](https://static.vidyo.io/latest/package/VidyoClient-AndroidSDK.zip) and unzip it.
2. Copy the SDK package content located at */VidyoClient-AndroidSDK/lib/android* to the */app/libs/* folder.

# Build and Run Application

#### Android Studio 4.0 | Gradle tools: 4.0.0 | Target SDK version: 29 | Min SDK version: 22

- Upgrade Gradle file if neccessary
- Download required build-tools
- Sync/Clean/Build the project
- Refresh gradle project

## Configure credentials

Update RESOURCE | TOKEN and DISPLAY_NAME inside **ConnectParams.java** configuration file.
