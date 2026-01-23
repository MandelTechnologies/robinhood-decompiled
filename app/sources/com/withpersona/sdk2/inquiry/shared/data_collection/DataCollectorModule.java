package com.withpersona.sdk2.inquiry.shared.data_collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DataCollectorModule.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0002\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/data_collection/DataCollectorModule;", "", "dataCollector", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/DataCollector;", "<init>", "(Lcom/withpersona/sdk2/inquiry/shared/data_collection/DataCollector;)V", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DataCollectorModule {
    private final DataCollector dataCollector;

    public DataCollectorModule(DataCollector dataCollector) {
        Intrinsics.checkNotNullParameter(dataCollector, "dataCollector");
        this.dataCollector = dataCollector;
    }

    /* renamed from: dataCollector, reason: from getter */
    public final DataCollector getDataCollector() {
        return this.dataCollector;
    }
}
