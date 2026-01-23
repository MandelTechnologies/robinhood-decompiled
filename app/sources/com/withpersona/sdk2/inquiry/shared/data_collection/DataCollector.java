package com.withpersona.sdk2.inquiry.shared.data_collection;

import kotlin.Metadata;

/* compiled from: DataCollector.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/data_collection/DataCollector;", "", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;", "stepData", "", "submit", "(Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;)V", "", "isActive", "()Z", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface DataCollector {
    boolean isActive();

    void submit(StepData stepData);
}
