package com.withpersona.sdk2.inquiry.shared.data_collection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DataCollector.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/data_collection/DummyDataCollector;", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/DataCollector;", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;", "stepData", "", "submit", "(Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;)V", "", "isActive", "Z", "()Z", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.data_collection.DummyDataCollector, reason: use source file name */
/* loaded from: classes18.dex */
public final class DataCollector2 implements DataCollector {
    private final boolean isActive;

    @Override // com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector
    public void submit(StepData stepData) {
        Intrinsics.checkNotNullParameter(stepData, "stepData");
    }

    @Override // com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector
    /* renamed from: isActive, reason: from getter */
    public boolean getIsActive() {
        return this.isActive;
    }
}
