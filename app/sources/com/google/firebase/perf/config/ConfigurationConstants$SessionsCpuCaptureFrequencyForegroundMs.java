package com.google.firebase.perf.config;

/* loaded from: classes27.dex */
public final class ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs extends ConfigurationFlag<Long> {
    private static ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs instance;

    private ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs() {
    }

    public static synchronized ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigurationConstants$SessionsCpuCaptureFrequencyForegroundMs();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    protected Long getDefault() {
        return 100L;
    }

    protected Long getDefaultOnRcFetchFail() {
        return Long.valueOf(getDefault().longValue() * 3);
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getRemoteConfigFlag() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getMetadataFlag() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }
}
