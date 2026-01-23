package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class ConfigurationConstants$TraceEventCountForeground extends ConfigurationFlag<Long> {
    private static ConfigurationConstants$TraceEventCountForeground instance;

    private ConfigurationConstants$TraceEventCountForeground() {
    }

    public static synchronized ConfigurationConstants$TraceEventCountForeground getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigurationConstants$TraceEventCountForeground();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    protected Long getDefault() {
        return 300L;
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getRemoteConfigFlag() {
        return "fpr_rl_trace_event_count_fg";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }
}
