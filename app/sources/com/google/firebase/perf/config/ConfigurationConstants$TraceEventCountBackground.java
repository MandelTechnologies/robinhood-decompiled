package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class ConfigurationConstants$TraceEventCountBackground extends ConfigurationFlag<Long> {
    private static ConfigurationConstants$TraceEventCountBackground instance;

    private ConfigurationConstants$TraceEventCountBackground() {
    }

    public static synchronized ConfigurationConstants$TraceEventCountBackground getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigurationConstants$TraceEventCountBackground();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    protected Long getDefault() {
        return 30L;
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getRemoteConfigFlag() {
        return "fpr_rl_trace_event_count_bg";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }
}
