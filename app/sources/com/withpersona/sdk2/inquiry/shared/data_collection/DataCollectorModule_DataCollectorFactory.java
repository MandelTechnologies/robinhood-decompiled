package com.withpersona.sdk2.inquiry.shared.data_collection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes18.dex */
public final class DataCollectorModule_DataCollectorFactory implements Factory<DataCollector> {
    private final DataCollectorModule module;

    public DataCollectorModule_DataCollectorFactory(DataCollectorModule dataCollectorModule) {
        this.module = dataCollectorModule;
    }

    @Override // javax.inject.Provider
    public DataCollector get() {
        return dataCollector(this.module);
    }

    public static DataCollectorModule_DataCollectorFactory create(DataCollectorModule dataCollectorModule) {
        return new DataCollectorModule_DataCollectorFactory(dataCollectorModule);
    }

    public static DataCollector dataCollector(DataCollectorModule dataCollectorModule) {
        return (DataCollector) Preconditions.checkNotNullFromProvides(dataCollectorModule.getDataCollector());
    }
}
