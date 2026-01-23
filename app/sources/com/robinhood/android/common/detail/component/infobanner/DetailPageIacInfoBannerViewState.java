package com.robinhood.android.common.detail.component.infobanner;

import com.robinhood.models.p320db.IacInfoBannerLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailPageIacInfoBannerViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/common/detail/component/infobanner/DetailPageIacInfoBannerViewState;", "", "currentAccountNumber", "", "location", "Lcom/robinhood/models/db/IacInfoBannerLocation;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/IacInfoBannerLocation;)V", "getCurrentAccountNumber", "()Ljava/lang/String;", "getLocation", "()Lcom/robinhood/models/db/IacInfoBannerLocation;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-detail-component_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DetailPageIacInfoBannerViewState {
    public static final int $stable = 0;
    private final String currentAccountNumber;
    private final IacInfoBannerLocation location;

    public static /* synthetic */ DetailPageIacInfoBannerViewState copy$default(DetailPageIacInfoBannerViewState detailPageIacInfoBannerViewState, String str, IacInfoBannerLocation iacInfoBannerLocation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailPageIacInfoBannerViewState.currentAccountNumber;
        }
        if ((i & 2) != 0) {
            iacInfoBannerLocation = detailPageIacInfoBannerViewState.location;
        }
        return detailPageIacInfoBannerViewState.copy(str, iacInfoBannerLocation);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrentAccountNumber() {
        return this.currentAccountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final IacInfoBannerLocation getLocation() {
        return this.location;
    }

    public final DetailPageIacInfoBannerViewState copy(String currentAccountNumber, IacInfoBannerLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return new DetailPageIacInfoBannerViewState(currentAccountNumber, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailPageIacInfoBannerViewState)) {
            return false;
        }
        DetailPageIacInfoBannerViewState detailPageIacInfoBannerViewState = (DetailPageIacInfoBannerViewState) other;
        return Intrinsics.areEqual(this.currentAccountNumber, detailPageIacInfoBannerViewState.currentAccountNumber) && this.location == detailPageIacInfoBannerViewState.location;
    }

    public int hashCode() {
        String str = this.currentAccountNumber;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.location.hashCode();
    }

    public String toString() {
        return "DetailPageIacInfoBannerViewState(currentAccountNumber=" + this.currentAccountNumber + ", location=" + this.location + ")";
    }

    public DetailPageIacInfoBannerViewState(String str, IacInfoBannerLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.currentAccountNumber = str;
        this.location = location;
    }

    public final String getCurrentAccountNumber() {
        return this.currentAccountNumber;
    }

    public final IacInfoBannerLocation getLocation() {
        return this.location;
    }
}
