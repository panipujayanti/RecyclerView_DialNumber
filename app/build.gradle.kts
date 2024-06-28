plugins {
    id("com.android.application")
}

android {
    namespace = "com.universitaskuningan.recycle_view"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.universitaskuningan.recycle_view"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    //tambahkan implementasi androidx recycle view dan librarypicaso
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    implementation("com.jakewharton:butterknife:10.0.0")
    implementation("com.squareup.picasso:picasso:2.8")
    //annotationProcessor("com.jakewharton:butterknife-compiler:10.0.0")
}