package com.salesforce.android.smi.network.internal.dto.response.businesshours;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BusinessHoursResponse.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/dto/response/businesshours/BusinessHoursResponse;", "", "businessHoursInfo", "Lcom/salesforce/android/smi/network/internal/dto/response/businesshours/BusinessHoursInfo;", "timestamp", "", "<init>", "(Lcom/salesforce/android/smi/network/internal/dto/response/businesshours/BusinessHoursInfo;J)V", "getBusinessHoursInfo", "()Lcom/salesforce/android/smi/network/internal/dto/response/businesshours/BusinessHoursInfo;", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BusinessHoursResponse {
    private final BusinessHoursInfo businessHoursInfo;
    private final long timestamp;

    public static /* synthetic */ BusinessHoursResponse copy$default(BusinessHoursResponse businessHoursResponse, BusinessHoursInfo businessHoursInfo, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            businessHoursInfo = businessHoursResponse.businessHoursInfo;
        }
        if ((i & 2) != 0) {
            j = businessHoursResponse.timestamp;
        }
        return businessHoursResponse.copy(businessHoursInfo, j);
    }

    /* renamed from: component1, reason: from getter */
    public final BusinessHoursInfo getBusinessHoursInfo() {
        return this.businessHoursInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final BusinessHoursResponse copy(BusinessHoursInfo businessHoursInfo, long timestamp) {
        Intrinsics.checkNotNullParameter(businessHoursInfo, "businessHoursInfo");
        return new BusinessHoursResponse(businessHoursInfo, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BusinessHoursResponse)) {
            return false;
        }
        BusinessHoursResponse businessHoursResponse = (BusinessHoursResponse) other;
        return Intrinsics.areEqual(this.businessHoursInfo, businessHoursResponse.businessHoursInfo) && this.timestamp == businessHoursResponse.timestamp;
    }

    public int hashCode() {
        return (this.businessHoursInfo.hashCode() * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "BusinessHoursResponse(businessHoursInfo=" + this.businessHoursInfo + ", timestamp=" + this.timestamp + ")";
    }

    public BusinessHoursResponse(BusinessHoursInfo businessHoursInfo, long j) {
        Intrinsics.checkNotNullParameter(businessHoursInfo, "businessHoursInfo");
        this.businessHoursInfo = businessHoursInfo;
        this.timestamp = j;
    }

    public final BusinessHoursInfo getBusinessHoursInfo() {
        return this.businessHoursInfo;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
