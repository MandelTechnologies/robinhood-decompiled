package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class ConfigurationConstants$CollectionDeactivated extends ConfigurationFlag<Boolean> {
    private static ConfigurationConstants$CollectionDeactivated instance;

    private ConfigurationConstants$CollectionDeactivated() {
    }

    protected static synchronized ConfigurationConstants$CollectionDeactivated getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigurationConstants$CollectionDeactivated();
            }
        } catch (Throwable th) {
            throw th;
        }
        return instance;
    }

    protected Boolean getDefault() {
        return Boolean.FALSE;
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getMetadataFlag() {
        return "firebase_performance_collection_deactivated";
    }
}
