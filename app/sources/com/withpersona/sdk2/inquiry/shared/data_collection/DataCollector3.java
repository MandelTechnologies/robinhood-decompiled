package com.withpersona.sdk2.inquiry.shared.data_collection;

import androidx.lifecycle.SavedStateHandle;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DataCollector.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\f¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/data_collection/RealDataCollector;", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/DataCollector;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "collectedData", "Ljava/util/ArrayList;", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;", "Lkotlin/collections/ArrayList;", "isActive", "", "()Z", "submit", "", "stepData", "getCollectedData", "Companion", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.data_collection.RealDataCollector, reason: use source file name */
/* loaded from: classes18.dex */
public final class DataCollector3 implements DataCollector {
    private final ArrayList<StepData> collectedData;
    private final boolean isActive;
    private final SavedStateHandle savedStateHandle;

    public DataCollector3(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        ArrayList<StepData> arrayList = (ArrayList) savedStateHandle.get("com.withpersona.sdk2.inquiry.shared.data_collection.RealDataCollector.collectedData");
        this.collectedData = arrayList == null ? new ArrayList<>() : arrayList;
        this.isActive = true;
    }

    @Override // com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector
    /* renamed from: isActive, reason: from getter */
    public boolean getIsActive() {
        return this.isActive;
    }

    @Override // com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector
    public void submit(StepData stepData) {
        Intrinsics.checkNotNullParameter(stepData, "stepData");
        this.collectedData.add(stepData);
        this.savedStateHandle.set("com.withpersona.sdk2.inquiry.shared.data_collection.RealDataCollector.collectedData", this.collectedData);
    }

    public ArrayList<StepData> getCollectedData() {
        return new ArrayList<>(this.collectedData);
    }
}
