package com.robinhood.android.advisory.dashboard.overview.portfolio;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CategorySlice.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/portfolio/AssetSlice;", "", "allocation", "", "allocationString", "", "title", "instrumentId", "Ljava/util/UUID;", "<init>", "(FLjava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V", "getAllocation", "()F", "getAllocationString", "()Ljava/lang/String;", "getTitle", "getInstrumentId", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AssetSlice {
    public static final int $stable = 8;
    private final float allocation;
    private final String allocationString;
    private final UUID instrumentId;
    private final String title;

    public static /* synthetic */ AssetSlice copy$default(AssetSlice assetSlice, float f, String str, String str2, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            f = assetSlice.allocation;
        }
        if ((i & 2) != 0) {
            str = assetSlice.allocationString;
        }
        if ((i & 4) != 0) {
            str2 = assetSlice.title;
        }
        if ((i & 8) != 0) {
            uuid = assetSlice.instrumentId;
        }
        return assetSlice.copy(f, str, str2, uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final float getAllocation() {
        return this.allocation;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAllocationString() {
        return this.allocationString;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final AssetSlice copy(float allocation, String allocationString, String title, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(allocationString, "allocationString");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return new AssetSlice(allocation, allocationString, title, instrumentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetSlice)) {
            return false;
        }
        AssetSlice assetSlice = (AssetSlice) other;
        return Float.compare(this.allocation, assetSlice.allocation) == 0 && Intrinsics.areEqual(this.allocationString, assetSlice.allocationString) && Intrinsics.areEqual(this.title, assetSlice.title) && Intrinsics.areEqual(this.instrumentId, assetSlice.instrumentId);
    }

    public int hashCode() {
        return (((((Float.hashCode(this.allocation) * 31) + this.allocationString.hashCode()) * 31) + this.title.hashCode()) * 31) + this.instrumentId.hashCode();
    }

    public String toString() {
        return "AssetSlice(allocation=" + this.allocation + ", allocationString=" + this.allocationString + ", title=" + this.title + ", instrumentId=" + this.instrumentId + ")";
    }

    public AssetSlice(float f, String allocationString, String title, UUID instrumentId) {
        Intrinsics.checkNotNullParameter(allocationString, "allocationString");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.allocation = f;
        this.allocationString = allocationString;
        this.title = title;
        this.instrumentId = instrumentId;
    }

    public final float getAllocation() {
        return this.allocation;
    }

    public final String getAllocationString() {
        return this.allocationString;
    }

    public final String getTitle() {
        return this.title;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }
}
