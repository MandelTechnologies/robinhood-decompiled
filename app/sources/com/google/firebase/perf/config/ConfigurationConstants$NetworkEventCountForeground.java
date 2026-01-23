package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class ConfigurationConstants$NetworkEventCountForeground extends ConfigurationFlag<Long> {
    private static ConfigurationConstants$NetworkEventCountForeground instance;

    private ConfigurationConstants$NetworkEventCountForeground() {
    }

    public static synchronized ConfigurationConstants$NetworkEventCountForeground getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigurationConstants$NetworkEventCountForeground();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    protected Long getDefault() {
        return 700L;
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getRemoteConfigFlag() {
        return "fpr_rl_network_event_count_fg";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }
}
