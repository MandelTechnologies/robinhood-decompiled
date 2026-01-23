package com.robinhood.android.odyssey.lib.legacybottomsheet;

import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalInfoData.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/legacybottomsheet/InternationalInfoData;", "", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/android/common/util/InternationalInfo;", "isProhibited", "", "<init>", "(Lcom/robinhood/android/common/util/InternationalInfo;Z)V", "getInfo", "()Lcom/robinhood/android/common/util/InternationalInfo;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InternationalInfoData {
    public static final int $stable = InternationalInfo.$stable;
    private final InternationalInfo info;
    private final boolean isProhibited;

    public static /* synthetic */ InternationalInfoData copy$default(InternationalInfoData internationalInfoData, InternationalInfo internationalInfo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            internationalInfo = internationalInfoData.info;
        }
        if ((i & 2) != 0) {
            z = internationalInfoData.isProhibited;
        }
        return internationalInfoData.copy(internationalInfo, z);
    }

    /* renamed from: component1, reason: from getter */
    public final InternationalInfo getInfo() {
        return this.info;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsProhibited() {
        return this.isProhibited;
    }

    public final InternationalInfoData copy(InternationalInfo info, boolean isProhibited) {
        Intrinsics.checkNotNullParameter(info, "info");
        return new InternationalInfoData(info, isProhibited);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternationalInfoData)) {
            return false;
        }
        InternationalInfoData internationalInfoData = (InternationalInfoData) other;
        return Intrinsics.areEqual(this.info, internationalInfoData.info) && this.isProhibited == internationalInfoData.isProhibited;
    }

    public int hashCode() {
        return (this.info.hashCode() * 31) + Boolean.hashCode(this.isProhibited);
    }

    public String toString() {
        return "InternationalInfoData(info=" + this.info + ", isProhibited=" + this.isProhibited + ")";
    }

    public InternationalInfoData(InternationalInfo info, boolean z) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.info = info;
        this.isProhibited = z;
    }

    public final InternationalInfo getInfo() {
        return this.info;
    }

    public final boolean isProhibited() {
        return this.isProhibited;
    }
}
