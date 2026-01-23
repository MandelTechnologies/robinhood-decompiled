package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class ConfigurationConstants$CollectionEnabled extends ConfigurationFlag<Boolean> {
    private static ConfigurationConstants$CollectionEnabled instance;

    private ConfigurationConstants$CollectionEnabled() {
    }

    protected static synchronized ConfigurationConstants$CollectionEnabled getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigurationConstants$CollectionEnabled();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getMetadataFlag() {
        return "firebase_performance_collection_enabled";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "isEnabled";
    }
}
