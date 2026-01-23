package com.google.firebase.perf.config;

/* renamed from: com.google.firebase.perf.config.ConfigurationConstants$SessionsMemoryCaptureFrequencyForegroundMs */
/* loaded from: classes27.dex */
public final class C5446xbe24e5c8 extends ConfigurationFlag<Long> {
    private static C5446xbe24e5c8 instance;

    private C5446xbe24e5c8() {
    }

    public static synchronized C5446xbe24e5c8 getInstance() {
        try {
            if (instance == null) {
                instance = new C5446xbe24e5c8();
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
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getMetadataFlag() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }
}
