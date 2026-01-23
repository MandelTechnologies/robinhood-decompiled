package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.routing;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EstimatedWaitTime.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/routing/EstimatedWaitTime;", "", "isEWTRequested", "", "estimatedWaitTimeInSeconds", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEstimatedWaitTimeInSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/routing/EstimatedWaitTime;", "equals", "other", "hashCode", "toString", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EstimatedWaitTime {
    private final Integer estimatedWaitTimeInSeconds;
    private final Boolean isEWTRequested;

    /* JADX WARN: Multi-variable type inference failed */
    public EstimatedWaitTime() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EstimatedWaitTime copy$default(EstimatedWaitTime estimatedWaitTime, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = estimatedWaitTime.isEWTRequested;
        }
        if ((i & 2) != 0) {
            num = estimatedWaitTime.estimatedWaitTimeInSeconds;
        }
        return estimatedWaitTime.copy(bool, num);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsEWTRequested() {
        return this.isEWTRequested;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getEstimatedWaitTimeInSeconds() {
        return this.estimatedWaitTimeInSeconds;
    }

    public final EstimatedWaitTime copy(Boolean isEWTRequested, Integer estimatedWaitTimeInSeconds) {
        return new EstimatedWaitTime(isEWTRequested, estimatedWaitTimeInSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EstimatedWaitTime)) {
            return false;
        }
        EstimatedWaitTime estimatedWaitTime = (EstimatedWaitTime) other;
        return Intrinsics.areEqual(this.isEWTRequested, estimatedWaitTime.isEWTRequested) && Intrinsics.areEqual(this.estimatedWaitTimeInSeconds, estimatedWaitTime.estimatedWaitTimeInSeconds);
    }

    public int hashCode() {
        Boolean bool = this.isEWTRequested;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.estimatedWaitTimeInSeconds;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "EstimatedWaitTime(isEWTRequested=" + this.isEWTRequested + ", estimatedWaitTimeInSeconds=" + this.estimatedWaitTimeInSeconds + ")";
    }

    public EstimatedWaitTime(Boolean bool, Integer num) {
        this.isEWTRequested = bool;
        this.estimatedWaitTimeInSeconds = num;
    }

    public /* synthetic */ EstimatedWaitTime(Boolean bool, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? 0 : num);
    }

    public final Boolean isEWTRequested() {
        return this.isEWTRequested;
    }

    public final Integer getEstimatedWaitTimeInSeconds() {
        return this.estimatedWaitTimeInSeconds;
    }
}
