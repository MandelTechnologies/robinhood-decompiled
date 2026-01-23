package com.google.firebase.perf.config;

/* loaded from: classes.dex */
public final class ConfigurationConstants$ExperimentTTID extends ConfigurationFlag<Boolean> {
    private static ConfigurationConstants$ExperimentTTID instance;

    private ConfigurationConstants$ExperimentTTID() {
    }

    protected static synchronized ConfigurationConstants$ExperimentTTID getInstance() {
        try {
            if (instance == null) {
                instance = new ConfigurationConstants$ExperimentTTID();
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
    protected String getRemoteConfigFlag() {
        return "fpr_experiment_app_start_ttid";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getDeviceCacheFlag() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // com.google.firebase.perf.config.ConfigurationFlag
    protected String getMetadataFlag() {
        return "experiment_app_start_ttid";
    }
}
