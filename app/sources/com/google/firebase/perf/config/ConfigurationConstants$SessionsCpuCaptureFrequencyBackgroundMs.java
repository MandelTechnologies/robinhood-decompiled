package com.google.firebase.perf.config;

/* loaded from: classes27.dex */
public final class ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs extends ConfigurationFlag<Long> {
    private static ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs instance;

    private ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs() {
    }

    public static synchronized ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigurationConstants$SessionsCpuCaptureFrequencyBackgroundMs();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    protected Long getDefault() {
        return 0L;
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getRemoteConfigFlag() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getMetadataFlag() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }
}
