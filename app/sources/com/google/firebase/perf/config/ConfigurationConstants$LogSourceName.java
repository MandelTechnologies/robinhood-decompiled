package com.google.firebase.perf.config;

import com.google.firebase.perf.BuildConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ConfigurationConstants$LogSourceName extends ConfigurationFlag<String> {
    private static final Map<Long, String> LOG_SOURCE_MAP = Collections.unmodifiableMap(new HashMap<Long, String>() { // from class: com.google.firebase.perf.config.ConfigurationConstants$LogSourceName.1
        {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    });
    private static ConfigurationConstants$LogSourceName instance;

    private ConfigurationConstants$LogSourceName() {
    }

    public static synchronized ConfigurationConstants$LogSourceName getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigurationConstants$LogSourceName();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    protected static String getLogSourceName(long j) {
        return LOG_SOURCE_MAP.get(Long.valueOf(j));
    }

    protected static boolean isLogSourceKnown(long j) {
        return LOG_SOURCE_MAP.containsKey(Long.valueOf(j));
    }

    protected String getDefault() {
        return BuildConfig.TRANSPORT_LOG_SRC;
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getRemoteConfigFlag() {
        return "fpr_log_source";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
