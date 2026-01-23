package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class ConfigurationConstants$SessionsMaxDurationMinutes extends ConfigurationFlag<Long> {
    private static ConfigurationConstants$SessionsMaxDurationMinutes instance;

    private ConfigurationConstants$SessionsMaxDurationMinutes() {
    }

    public static synchronized ConfigurationConstants$SessionsMaxDurationMinutes getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigurationConstants$SessionsMaxDurationMinutes();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    protected Long getDefault() {
        return 240L;
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getRemoteConfigFlag() {
        return "fpr_session_max_duration_min";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getMetadataFlag() {
        return "sessions_max_length_minutes";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }
}
