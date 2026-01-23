package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class ConfigurationConstants$SdkEnabled extends ConfigurationFlag<Boolean> {
    private static ConfigurationConstants$SdkEnabled instance;

    protected ConfigurationConstants$SdkEnabled() {
    }

    protected static synchronized ConfigurationConstants$SdkEnabled getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigurationConstants$SdkEnabled();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    protected Boolean getDefault() {
        return Boolean.TRUE;
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getRemoteConfigFlag() {
        return "fpr_enabled";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SdkEnabled";
    }
}
