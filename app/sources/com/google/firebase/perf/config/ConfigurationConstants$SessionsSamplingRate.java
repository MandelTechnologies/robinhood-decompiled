package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class ConfigurationConstants$SessionsSamplingRate extends ConfigurationFlag<Double> {
    private static ConfigurationConstants$SessionsSamplingRate instance;

    private ConfigurationConstants$SessionsSamplingRate() {
    }

    public static synchronized ConfigurationConstants$SessionsSamplingRate getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigurationConstants$SessionsSamplingRate();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    protected Double getDefault() {
        return Double.valueOf(0.01d);
    }

    protected Double getDefaultOnRcFetchFail() {
        return Double.valueOf(getDefault().doubleValue() / 1000.0d);
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getRemoteConfigFlag() {
        return "fpr_vc_session_sampling_rate";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getMetadataFlag() {
        return "sessions_sampling_percentage";
    }
}
