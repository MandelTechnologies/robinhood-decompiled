package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.ConfigurationConstants$SessionsMemoryCaptureFrequencyBackgroundMs */
/* loaded from: classes27.dex */
public final class C5445xa42982f3 extends ConfigurationFlag<Long> {
    private static C5445xa42982f3 instance;

    private C5445xa42982f3() {
    }

    public static synchronized C5445xa42982f3 getInstance() {
        try {
            if (instance == null) {
                instance = new C5445xa42982f3();
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
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getMetadataFlag() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }
}
