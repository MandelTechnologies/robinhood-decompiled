package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class ConfigurationConstants$RateLimitSec extends ConfigurationFlag<Long> {
    private static ConfigurationConstants$RateLimitSec instance;

    private ConfigurationConstants$RateLimitSec() {
    }

    public static synchronized ConfigurationConstants$RateLimitSec getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigurationConstants$RateLimitSec();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    protected Long getDefault() {
        return 600L;
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getRemoteConfigFlag() {
        return "fpr_rl_time_limit_sec";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "com.google.firebase.perf.TimeLimitSec";
    }
}
