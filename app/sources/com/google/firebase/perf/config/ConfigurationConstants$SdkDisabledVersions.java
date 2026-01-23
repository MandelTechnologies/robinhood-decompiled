package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class ConfigurationConstants$SdkDisabledVersions extends ConfigurationFlag<String> {
    private static ConfigurationConstants$SdkDisabledVersions instance;

    protected ConfigurationConstants$SdkDisabledVersions() {
    }

    protected static synchronized ConfigurationConstants$SdkDisabledVersions getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigurationConstants$SdkDisabledVersions();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    protected String getDefault() {
        return "";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getRemoteConfigFlag() {
        return "fpr_disabled_android_versions";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }
}
