package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class ConfigurationConstants$NetworkEventCountBackground extends ConfigurationFlag<Long> {
    private static ConfigurationConstants$NetworkEventCountBackground instance;

    private ConfigurationConstants$NetworkEventCountBackground() {
    }

    public static synchronized ConfigurationConstants$NetworkEventCountBackground getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigurationConstants$NetworkEventCountBackground();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    protected Long getDefault() {
        return 70L;
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getRemoteConfigFlag() {
        return "fpr_rl_network_event_count_bg";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }
}
