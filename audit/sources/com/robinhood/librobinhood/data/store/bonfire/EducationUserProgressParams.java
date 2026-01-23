package com.robinhood.librobinhood.data.store.bonfire;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationUserProgressStore.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressParams;", "", "trackingId", "", "statusType", "", "contentType", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTrackingId", "()Ljava/lang/String;", "getStatusType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContentType", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressParams;", "equals", "", "other", "hashCode", "toString", "lib-store-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
final /* data */ class EducationUserProgressParams {
    private final Integer contentType;
    private final Integer statusType;
    private final String trackingId;

    public static /* synthetic */ EducationUserProgressParams copy$default(EducationUserProgressParams educationUserProgressParams, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = educationUserProgressParams.trackingId;
        }
        if ((i & 2) != 0) {
            num = educationUserProgressParams.statusType;
        }
        if ((i & 4) != 0) {
            num2 = educationUserProgressParams.contentType;
        }
        return educationUserProgressParams.copy(str, num, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTrackingId() {
        return this.trackingId;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getStatusType() {
        return this.statusType;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getContentType() {
        return this.contentType;
    }

    public final EducationUserProgressParams copy(String trackingId, Integer statusType, Integer contentType) {
        return new EducationUserProgressParams(trackingId, statusType, contentType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EducationUserProgressParams)) {
            return false;
        }
        EducationUserProgressParams educationUserProgressParams = (EducationUserProgressParams) other;
        return Intrinsics.areEqual(this.trackingId, educationUserProgressParams.trackingId) && Intrinsics.areEqual(this.statusType, educationUserProgressParams.statusType) && Intrinsics.areEqual(this.contentType, educationUserProgressParams.contentType);
    }

    public int hashCode() {
        String str = this.trackingId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.statusType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.contentType;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "EducationUserProgressParams(trackingId=" + this.trackingId + ", statusType=" + this.statusType + ", contentType=" + this.contentType + ")";
    }

    public EducationUserProgressParams(String str, Integer num, Integer num2) {
        this.trackingId = str;
        this.statusType = num;
        this.contentType = num2;
    }

    public final String getTrackingId() {
        return this.trackingId;
    }

    public final Integer getStatusType() {
        return this.statusType;
    }

    public final Integer getContentType() {
        return this.contentType;
    }
}
