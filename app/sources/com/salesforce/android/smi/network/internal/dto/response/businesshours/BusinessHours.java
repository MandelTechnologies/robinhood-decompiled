package com.salesforce.android.smi.network.internal.dto.response.businesshours;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;

/* compiled from: BusinessHours.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/dto/response/businesshours/BusinessHours;", "", "startTime", "", "endTime", "<init>", "(JJ)V", "getStartTime", "()J", "getEndTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BusinessHours {
    private final long endTime;
    private final long startTime;

    public static /* synthetic */ BusinessHours copy$default(BusinessHours businessHours, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = businessHours.startTime;
        }
        if ((i & 2) != 0) {
            j2 = businessHours.endTime;
        }
        return businessHours.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    public final BusinessHours copy(long startTime, long endTime) {
        return new BusinessHours(startTime, endTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BusinessHours)) {
            return false;
        }
        BusinessHours businessHours = (BusinessHours) other;
        return this.startTime == businessHours.startTime && this.endTime == businessHours.endTime;
    }

    public int hashCode() {
        return (Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime);
    }

    public String toString() {
        return "BusinessHours(startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }

    public BusinessHours(long j, long j2) {
        this.startTime = j;
        this.endTime = j2;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }
}
