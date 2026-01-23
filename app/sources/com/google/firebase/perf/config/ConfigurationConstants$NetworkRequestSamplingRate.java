package com.google.firebase.perf.config;

/* loaded from: classes27.dex */
public final class ConfigurationConstants$NetworkRequestSamplingRate extends ConfigurationFlag<Double> {
    private static ConfigurationConstants$NetworkRequestSamplingRate instance;

    private ConfigurationConstants$NetworkRequestSamplingRate() {
    }

    protected static synchronized ConfigurationConstants$NetworkRequestSamplingRate getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigurationConstants$NetworkRequestSamplingRate();
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
        return "fpr_vc_network_request_sampling_rate";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }
}
