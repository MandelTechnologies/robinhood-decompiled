package com.salesforce.android.smi.network.internal.dto.response.businesshours;

import com.squareup.moshi.JsonClass;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BusinessHoursInfo.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/salesforce/android/smi/network/internal/dto/response/businesshours/BusinessHoursInfo;", "", "name", "", "isActive", "", "businessHours", "", "Lcom/salesforce/android/smi/network/internal/dto/response/businesshours/BusinessHours;", "requestTimestamp", "", "<init>", "(Ljava/lang/String;ZLjava/util/List;J)V", "getName", "()Ljava/lang/String;", "()Z", "getBusinessHours", "()Ljava/util/List;", "getRequestTimestamp", "()J", "isWithinBusinessHours", "time", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class BusinessHoursInfo {
    private final List<BusinessHours> businessHours;
    private final boolean isActive;
    private final String name;
    private final long requestTimestamp;

    public static /* synthetic */ BusinessHoursInfo copy$default(BusinessHoursInfo businessHoursInfo, String str, boolean z, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = businessHoursInfo.name;
        }
        if ((i & 2) != 0) {
            z = businessHoursInfo.isActive;
        }
        if ((i & 4) != 0) {
            list = businessHoursInfo.businessHours;
        }
        if ((i & 8) != 0) {
            j = businessHoursInfo.requestTimestamp;
        }
        List list2 = list;
        return businessHoursInfo.copy(str, z, list2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final List<BusinessHours> component3() {
        return this.businessHours;
    }

    /* renamed from: component4, reason: from getter */
    public final long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    public final BusinessHoursInfo copy(String name, boolean isActive, List<BusinessHours> businessHours, long requestTimestamp) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(businessHours, "businessHours");
        return new BusinessHoursInfo(name, isActive, businessHours, requestTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BusinessHoursInfo)) {
            return false;
        }
        BusinessHoursInfo businessHoursInfo = (BusinessHoursInfo) other;
        return Intrinsics.areEqual(this.name, businessHoursInfo.name) && this.isActive == businessHoursInfo.isActive && Intrinsics.areEqual(this.businessHours, businessHoursInfo.businessHours) && this.requestTimestamp == businessHoursInfo.requestTimestamp;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + Boolean.hashCode(this.isActive)) * 31) + this.businessHours.hashCode()) * 31) + Long.hashCode(this.requestTimestamp);
    }

    public String toString() {
        return "BusinessHoursInfo(name=" + this.name + ", isActive=" + this.isActive + ", businessHours=" + this.businessHours + ", requestTimestamp=" + this.requestTimestamp + ")";
    }

    public BusinessHoursInfo(String name, boolean z, List<BusinessHours> businessHours, long j) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(businessHours, "businessHours");
        this.name = name;
        this.isActive = z;
        this.businessHours = businessHours;
        this.requestTimestamp = j;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final List<BusinessHours> getBusinessHours() {
        return this.businessHours;
    }

    public /* synthetic */ BusinessHoursInfo(String str, boolean z, List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, list, (i & 8) != 0 ? new Date().getTime() : j);
    }

    public final long getRequestTimestamp() {
        return this.requestTimestamp;
    }

    public static /* synthetic */ boolean isWithinBusinessHours$default(BusinessHoursInfo businessHoursInfo, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = new Date().getTime();
        }
        return businessHoursInfo.isWithinBusinessHours(j);
    }

    public final boolean isWithinBusinessHours(long time) {
        if (!this.isActive) {
            return false;
        }
        for (BusinessHours businessHours : this.businessHours) {
            if (time >= businessHours.getStartTime() && time <= businessHours.getEndTime()) {
                return true;
            }
        }
        return false;
    }
}
