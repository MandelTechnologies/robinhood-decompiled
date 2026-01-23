package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.progressIndicators;

import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.format.ProgressIndicatorFormat;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProgressIndicator.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/progressIndicators/ProgressIndicator;", "", "progressMessage", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ProgressIndicatorFormat$Text;", "indicatorType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/progressIndicators/ProgressIndicatorType;", "timestamp", "", "<init>", "(Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ProgressIndicatorFormat$Text;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/progressIndicators/ProgressIndicatorType;J)V", "getProgressMessage", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/format/ProgressIndicatorFormat$Text;", "getIndicatorType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/progressIndicators/ProgressIndicatorType;", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProgressIndicator {
    private final ProgressIndicatorType indicatorType;
    private final ProgressIndicatorFormat.Text progressMessage;
    private final long timestamp;

    public static /* synthetic */ ProgressIndicator copy$default(ProgressIndicator progressIndicator, ProgressIndicatorFormat.Text text, ProgressIndicatorType progressIndicatorType, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            text = progressIndicator.progressMessage;
        }
        if ((i & 2) != 0) {
            progressIndicatorType = progressIndicator.indicatorType;
        }
        if ((i & 4) != 0) {
            j = progressIndicator.timestamp;
        }
        return progressIndicator.copy(text, progressIndicatorType, j);
    }

    /* renamed from: component1, reason: from getter */
    public final ProgressIndicatorFormat.Text getProgressMessage() {
        return this.progressMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final ProgressIndicatorType getIndicatorType() {
        return this.indicatorType;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final ProgressIndicator copy(ProgressIndicatorFormat.Text progressMessage, ProgressIndicatorType indicatorType, long timestamp) {
        Intrinsics.checkNotNullParameter(progressMessage, "progressMessage");
        Intrinsics.checkNotNullParameter(indicatorType, "indicatorType");
        return new ProgressIndicator(progressMessage, indicatorType, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressIndicator)) {
            return false;
        }
        ProgressIndicator progressIndicator = (ProgressIndicator) other;
        return Intrinsics.areEqual(this.progressMessage, progressIndicator.progressMessage) && this.indicatorType == progressIndicator.indicatorType && this.timestamp == progressIndicator.timestamp;
    }

    public int hashCode() {
        return (((this.progressMessage.hashCode() * 31) + this.indicatorType.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "ProgressIndicator(progressMessage=" + this.progressMessage + ", indicatorType=" + this.indicatorType + ", timestamp=" + this.timestamp + ")";
    }

    public ProgressIndicator(ProgressIndicatorFormat.Text progressMessage, ProgressIndicatorType indicatorType, long j) {
        Intrinsics.checkNotNullParameter(progressMessage, "progressMessage");
        Intrinsics.checkNotNullParameter(indicatorType, "indicatorType");
        this.progressMessage = progressMessage;
        this.indicatorType = indicatorType;
        this.timestamp = j;
    }

    public final ProgressIndicatorFormat.Text getProgressMessage() {
        return this.progressMessage;
    }

    public final ProgressIndicatorType getIndicatorType() {
        return this.indicatorType;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
