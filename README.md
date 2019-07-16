# Custom Layout Reference App for Android
While the VidyoConnector provides a default layout, there is also a means to customize it to meet the needs of your UI/UX. The two modes of operation, which are mutually exclusive: Composie and Custom Layouts. This reference app demonstrates how the custom layout option could be integrated to display each remote participant seperately.

Lean more: https://developer.vidyo.io
Developer documentation: https://developer.vidyo.io/documentation/latest

# Clone
git clone https://github.com/Vidyo/vidyo.io-custom-connector-android.git

# Build and Run Application

Acquire the Android Vidyo Client SDK: https://static.vidyo.io/latest/package/VidyoClient-AndroidSDK.zip

#### Android Studio 3.3 | Gradle tools: 3.3.0 | Target SDK version: 28 | Min SDK 22 version: 22

- Upgrade Gradle file if neccessary
- Download required build-tools
- Sync/Clean/Build the project

## Configure credentials

Update RESOURCE | TOKEN and DISPLAY_NAME inside **ConnectParams.java** configuration file.
