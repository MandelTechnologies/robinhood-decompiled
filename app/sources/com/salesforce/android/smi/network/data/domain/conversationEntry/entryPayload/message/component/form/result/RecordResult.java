package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.form.result;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecordResult.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/form/result/RecordResult;", "", "recordReferenceId", "", "isCreated", "", "resultMessage", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "getRecordReferenceId", "()Ljava/lang/String;", "()Z", "getResultMessage", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RecordResult {
    private final boolean isCreated;
    private final String recordReferenceId;
    private final String resultMessage;

    public static /* synthetic */ RecordResult copy$default(RecordResult recordResult, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recordResult.recordReferenceId;
        }
        if ((i & 2) != 0) {
            z = recordResult.isCreated;
        }
        if ((i & 4) != 0) {
            str2 = recordResult.resultMessage;
        }
        return recordResult.copy(str, z, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRecordReferenceId() {
        return this.recordReferenceId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCreated() {
        return this.isCreated;
    }

    /* renamed from: component3, reason: from getter */
    public final String getResultMessage() {
        return this.resultMessage;
    }

    public final RecordResult copy(String recordReferenceId, boolean isCreated, String resultMessage) {
        Intrinsics.checkNotNullParameter(recordReferenceId, "recordReferenceId");
        return new RecordResult(recordReferenceId, isCreated, resultMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordResult)) {
            return false;
        }
        RecordResult recordResult = (RecordResult) other;
        return Intrinsics.areEqual(this.recordReferenceId, recordResult.recordReferenceId) && this.isCreated == recordResult.isCreated && Intrinsics.areEqual(this.resultMessage, recordResult.resultMessage);
    }

    public int hashCode() {
        int iHashCode = ((this.recordReferenceId.hashCode() * 31) + Boolean.hashCode(this.isCreated)) * 31;
        String str = this.resultMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RecordResult(recordReferenceId=" + this.recordReferenceId + ", isCreated=" + this.isCreated + ", resultMessage=" + this.resultMessage + ")";
    }

    public RecordResult(String recordReferenceId, boolean z, String str) {
        Intrinsics.checkNotNullParameter(recordReferenceId, "recordReferenceId");
        this.recordReferenceId = recordReferenceId;
        this.isCreated = z;
        this.resultMessage = str;
    }

    public /* synthetic */ RecordResult(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? null : str2);
    }

    public final String getRecordReferenceId() {
        return this.recordReferenceId;
    }

    public final boolean isCreated() {
        return this.isCreated;
    }

    public final String getResultMessage() {
        return this.resultMessage;
    }
}
