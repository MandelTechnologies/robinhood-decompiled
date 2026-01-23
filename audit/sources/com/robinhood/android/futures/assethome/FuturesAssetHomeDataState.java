package com.robinhood.android.futures.assethome;

import com.robinhood.android.models.futures.api.ApiFuturesBuyingPower;
import futures_asset_home.proto.p462v1.SectionTypeDto;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.Monitoring;

/* compiled from: FuturesAssetHomeDataState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010#J\t\u00101\u001a\u00020\u000fHÆ\u0003J\u008e\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\u000f2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010!R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010!R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/FuturesAssetHomeDataState;", "", "accountNumber", "", "futuresSubAccountId", "Ljava/util/UUID;", "microgramState", "Lmicrogram/android/MicrogramState;", "assetHomeOrder", "", "Lfutures_asset_home/proto/v1/SectionTypeDto;", "disclosureMarkdown", "futuresBuyingPower", "Lcom/robinhood/android/models/futures/api/ApiFuturesBuyingPower;", FuturesAssetHomeDuxo.ARGS_IS_IN_EDUCATION_TOUR, "", "isChartLoaded", "hasPositions", "hasPendingOrders", "showToolbarSearchIcon", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lmicrogram/android/MicrogramState;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/android/models/futures/api/ApiFuturesBuyingPower;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getFuturesSubAccountId", "()Ljava/util/UUID;", "getMicrogramState", "()Lmicrogram/android/MicrogramState;", "getAssetHomeOrder", "()Ljava/util/List;", "getDisclosureMarkdown", "getFuturesBuyingPower", "()Lcom/robinhood/android/models/futures/api/ApiFuturesBuyingPower;", "()Z", "getHasPositions", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasPendingOrders", "getShowToolbarSearchIcon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/util/UUID;Lmicrogram/android/MicrogramState;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/android/models/futures/api/ApiFuturesBuyingPower;ZZLjava/lang/Boolean;Ljava/lang/Boolean;Z)Lcom/robinhood/android/futures/assethome/FuturesAssetHomeDataState;", "equals", "other", "hashCode", "", "toString", "feature-futures-asset-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesAssetHomeDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final List<SectionTypeDto> assetHomeOrder;
    private final String disclosureMarkdown;
    private final ApiFuturesBuyingPower futuresBuyingPower;
    private final UUID futuresSubAccountId;
    private final Boolean hasPendingOrders;
    private final Boolean hasPositions;
    private final boolean isChartLoaded;
    private final boolean isInEducationTour;
    private final Monitoring microgramState;
    private final boolean showToolbarSearchIcon;

    public FuturesAssetHomeDataState() {
        this(null, null, null, null, null, null, false, false, null, null, false, 2047, null);
    }

    public static /* synthetic */ FuturesAssetHomeDataState copy$default(FuturesAssetHomeDataState futuresAssetHomeDataState, String str, UUID uuid, Monitoring monitoring, List list, String str2, ApiFuturesBuyingPower apiFuturesBuyingPower, boolean z, boolean z2, Boolean bool, Boolean bool2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresAssetHomeDataState.accountNumber;
        }
        if ((i & 2) != 0) {
            uuid = futuresAssetHomeDataState.futuresSubAccountId;
        }
        if ((i & 4) != 0) {
            monitoring = futuresAssetHomeDataState.microgramState;
        }
        if ((i & 8) != 0) {
            list = futuresAssetHomeDataState.assetHomeOrder;
        }
        if ((i & 16) != 0) {
            str2 = futuresAssetHomeDataState.disclosureMarkdown;
        }
        if ((i & 32) != 0) {
            apiFuturesBuyingPower = futuresAssetHomeDataState.futuresBuyingPower;
        }
        if ((i & 64) != 0) {
            z = futuresAssetHomeDataState.isInEducationTour;
        }
        if ((i & 128) != 0) {
            z2 = futuresAssetHomeDataState.isChartLoaded;
        }
        if ((i & 256) != 0) {
            bool = futuresAssetHomeDataState.hasPositions;
        }
        if ((i & 512) != 0) {
            bool2 = futuresAssetHomeDataState.hasPendingOrders;
        }
        if ((i & 1024) != 0) {
            z3 = futuresAssetHomeDataState.showToolbarSearchIcon;
        }
        Boolean bool3 = bool2;
        boolean z4 = z3;
        boolean z5 = z2;
        Boolean bool4 = bool;
        ApiFuturesBuyingPower apiFuturesBuyingPower2 = apiFuturesBuyingPower;
        boolean z6 = z;
        String str3 = str2;
        Monitoring monitoring2 = monitoring;
        return futuresAssetHomeDataState.copy(str, uuid, monitoring2, list, str3, apiFuturesBuyingPower2, z6, z5, bool4, bool3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getHasPendingOrders() {
        return this.hasPendingOrders;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShowToolbarSearchIcon() {
        return this.showToolbarSearchIcon;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getFuturesSubAccountId() {
        return this.futuresSubAccountId;
    }

    /* renamed from: component3, reason: from getter */
    public final Monitoring getMicrogramState() {
        return this.microgramState;
    }

    public final List<SectionTypeDto> component4() {
        return this.assetHomeOrder;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiFuturesBuyingPower getFuturesBuyingPower() {
        return this.futuresBuyingPower;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsInEducationTour() {
        return this.isInEducationTour;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsChartLoaded() {
        return this.isChartLoaded;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getHasPositions() {
        return this.hasPositions;
    }

    public final FuturesAssetHomeDataState copy(String accountNumber, UUID futuresSubAccountId, Monitoring microgramState, List<? extends SectionTypeDto> assetHomeOrder, String disclosureMarkdown, ApiFuturesBuyingPower futuresBuyingPower, boolean isInEducationTour, boolean isChartLoaded, Boolean hasPositions, Boolean hasPendingOrders, boolean showToolbarSearchIcon) {
        Intrinsics.checkNotNullParameter(microgramState, "microgramState");
        Intrinsics.checkNotNullParameter(assetHomeOrder, "assetHomeOrder");
        return new FuturesAssetHomeDataState(accountNumber, futuresSubAccountId, microgramState, assetHomeOrder, disclosureMarkdown, futuresBuyingPower, isInEducationTour, isChartLoaded, hasPositions, hasPendingOrders, showToolbarSearchIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesAssetHomeDataState)) {
            return false;
        }
        FuturesAssetHomeDataState futuresAssetHomeDataState = (FuturesAssetHomeDataState) other;
        return Intrinsics.areEqual(this.accountNumber, futuresAssetHomeDataState.accountNumber) && Intrinsics.areEqual(this.futuresSubAccountId, futuresAssetHomeDataState.futuresSubAccountId) && Intrinsics.areEqual(this.microgramState, futuresAssetHomeDataState.microgramState) && Intrinsics.areEqual(this.assetHomeOrder, futuresAssetHomeDataState.assetHomeOrder) && Intrinsics.areEqual(this.disclosureMarkdown, futuresAssetHomeDataState.disclosureMarkdown) && Intrinsics.areEqual(this.futuresBuyingPower, futuresAssetHomeDataState.futuresBuyingPower) && this.isInEducationTour == futuresAssetHomeDataState.isInEducationTour && this.isChartLoaded == futuresAssetHomeDataState.isChartLoaded && Intrinsics.areEqual(this.hasPositions, futuresAssetHomeDataState.hasPositions) && Intrinsics.areEqual(this.hasPendingOrders, futuresAssetHomeDataState.hasPendingOrders) && this.showToolbarSearchIcon == futuresAssetHomeDataState.showToolbarSearchIcon;
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UUID uuid = this.futuresSubAccountId;
        int iHashCode2 = (((((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.microgramState.hashCode()) * 31) + this.assetHomeOrder.hashCode()) * 31;
        String str2 = this.disclosureMarkdown;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ApiFuturesBuyingPower apiFuturesBuyingPower = this.futuresBuyingPower;
        int iHashCode4 = (((((iHashCode3 + (apiFuturesBuyingPower == null ? 0 : apiFuturesBuyingPower.hashCode())) * 31) + Boolean.hashCode(this.isInEducationTour)) * 31) + Boolean.hashCode(this.isChartLoaded)) * 31;
        Boolean bool = this.hasPositions;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasPendingOrders;
        return ((iHashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + Boolean.hashCode(this.showToolbarSearchIcon);
    }

    public String toString() {
        return "FuturesAssetHomeDataState(accountNumber=" + this.accountNumber + ", futuresSubAccountId=" + this.futuresSubAccountId + ", microgramState=" + this.microgramState + ", assetHomeOrder=" + this.assetHomeOrder + ", disclosureMarkdown=" + this.disclosureMarkdown + ", futuresBuyingPower=" + this.futuresBuyingPower + ", isInEducationTour=" + this.isInEducationTour + ", isChartLoaded=" + this.isChartLoaded + ", hasPositions=" + this.hasPositions + ", hasPendingOrders=" + this.hasPendingOrders + ", showToolbarSearchIcon=" + this.showToolbarSearchIcon + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesAssetHomeDataState(String str, UUID uuid, Monitoring microgramState, List<? extends SectionTypeDto> assetHomeOrder, String str2, ApiFuturesBuyingPower apiFuturesBuyingPower, boolean z, boolean z2, Boolean bool, Boolean bool2, boolean z3) {
        Intrinsics.checkNotNullParameter(microgramState, "microgramState");
        Intrinsics.checkNotNullParameter(assetHomeOrder, "assetHomeOrder");
        this.accountNumber = str;
        this.futuresSubAccountId = uuid;
        this.microgramState = microgramState;
        this.assetHomeOrder = assetHomeOrder;
        this.disclosureMarkdown = str2;
        this.futuresBuyingPower = apiFuturesBuyingPower;
        this.isInEducationTour = z;
        this.isChartLoaded = z2;
        this.hasPositions = bool;
        this.hasPendingOrders = bool2;
        this.showToolbarSearchIcon = z3;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UUID getFuturesSubAccountId() {
        return this.futuresSubAccountId;
    }

    public /* synthetic */ FuturesAssetHomeDataState(String str, UUID uuid, Monitoring monitoring, List list, String str2, ApiFuturesBuyingPower apiFuturesBuyingPower, boolean z, boolean z2, Boolean bool, Boolean bool2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : uuid, (i & 4) != 0 ? Monitoring.Loading.INSTANCE : monitoring, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : apiFuturesBuyingPower, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? true : z3);
    }

    public final Monitoring getMicrogramState() {
        return this.microgramState;
    }

    public final List<SectionTypeDto> getAssetHomeOrder() {
        return this.assetHomeOrder;
    }

    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final ApiFuturesBuyingPower getFuturesBuyingPower() {
        return this.futuresBuyingPower;
    }

    public final boolean isInEducationTour() {
        return this.isInEducationTour;
    }

    public final boolean isChartLoaded() {
        return this.isChartLoaded;
    }

    public final Boolean getHasPositions() {
        return this.hasPositions;
    }

    public final Boolean getHasPendingOrders() {
        return this.hasPendingOrders;
    }

    public final boolean getShowToolbarSearchIcon() {
        return this.showToolbarSearchIcon;
    }
}
