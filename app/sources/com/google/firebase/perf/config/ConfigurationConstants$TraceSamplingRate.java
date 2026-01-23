package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class ConfigurationConstants$TraceSamplingRate extends ConfigurationFlag<Double> {
    private static ConfigurationConstants$TraceSamplingRate instance;

    private ConfigurationConstants$TraceSamplingRate() {
    }

    protected static synchronized ConfigurationConstants$TraceSamplingRate getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigurationConstants$TraceSamplingRate();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    protected Double getDefault() {
        return Double.valueOf(1.0d);
    }

    protected Double getDefaultOnRcFetchFail() {
        return Double.valueOf(getDefault().doubleValue() / 1000.0d);
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getRemoteConfigFlag() {
        return "fpr_vc_trace_sampling_rate";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }
}
