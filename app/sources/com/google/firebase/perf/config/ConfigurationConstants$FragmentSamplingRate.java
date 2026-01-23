package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class ConfigurationConstants$FragmentSamplingRate extends ConfigurationFlag<Double> {
    private static ConfigurationConstants$FragmentSamplingRate instance;

    private ConfigurationConstants$FragmentSamplingRate() {
    }

    protected static synchronized ConfigurationConstants$FragmentSamplingRate getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigurationConstants$FragmentSamplingRate();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    protected Double getDefault() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getRemoteConfigFlag() {
        return "fpr_vc_fragment_sampling_rate";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getMetadataFlag() {
        return "fragment_sampling_percentage";
    }
}
