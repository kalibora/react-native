// Copyright (c) 2015-present, Facebook, Inc.

// This source code is licensed under the MIT license found in the
// LICENSE file in the root directory of this source tree.

buildscript {
    repositories {
        jcenter()
        mavenLocal()
        maven {
            url 'https://maven.google.com/'
            name 'Google'
        }
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:2.3.3'
        classpath 'de.undercouch:gradle-download-task:3.4.3'

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        jcenter()
        mavenLocal()
        maven {
            url 'https://maven.google.com/'
            name 'Google'
        }

        def androidSdk = System.getenv("ANDROID_SDK")
        maven {
            url "$androidSdk/extras/m2repository/"
        }
    }
}

task wrapper(type: Wrapper) {
    gradleVersion = '4.4'
    distributionUrl = distributionUrl.replace("bin", "all")
}
