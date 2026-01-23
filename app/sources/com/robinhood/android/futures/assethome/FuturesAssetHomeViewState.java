package com.robinhood.android.futures.assethome;

import com.robinhood.android.autoeventlogging.LoggableViewState2;
import com.robinhood.android.futures.assethome.sections.FuturesBuyingPowerViewState;
import futures_asset_home.proto.p462v1.SectionTypeDto;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: FuturesAssetHomeViewState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\u0010HÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003Jq\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\rHÆ\u0001J\u0013\u0010,\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001e¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/futures/assethome/FuturesAssetHomeViewState;", "", "accountNumber", "", "futuresSubAccountId", "Ljava/util/UUID;", "assetHomeOrder", "Lkotlinx/collections/immutable/ImmutableList;", "Lfutures_asset_home/proto/v1/SectionTypeDto;", "disclosureMarkdown", "buyingPowerViewState", "Lcom/robinhood/android/futures/assethome/sections/FuturesBuyingPowerViewState;", "showViewAllFuturesButton", "", "isChartLoaded", "loggingState", "Lcom/robinhood/android/autoeventlogging/LoadedState;", "showToolbarSearchIcon", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Lcom/robinhood/android/futures/assethome/sections/FuturesBuyingPowerViewState;ZZLcom/robinhood/android/autoeventlogging/LoadedState;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getFuturesSubAccountId", "()Ljava/util/UUID;", "getAssetHomeOrder", "()Lkotlinx/collections/immutable/ImmutableList;", "getDisclosureMarkdown", "getBuyingPowerViewState", "()Lcom/robinhood/android/futures/assethome/sections/FuturesBuyingPowerViewState;", "getShowViewAllFuturesButton", "()Z", "getLoggingState", "()Lcom/robinhood/android/autoeventlogging/LoadedState;", "getShowToolbarSearchIcon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "feature-futures-asset-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesAssetHomeViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final ImmutableList<SectionTypeDto> assetHomeOrder;
    private final FuturesBuyingPowerViewState buyingPowerViewState;
    private final String disclosureMarkdown;
    private final UUID futuresSubAccountId;
    private final boolean isChartLoaded;
    private final LoggableViewState2 loggingState;
    private final boolean showToolbarSearchIcon;
    private final boolean showViewAllFuturesButton;

    public static /* synthetic */ FuturesAssetHomeViewState copy$default(FuturesAssetHomeViewState futuresAssetHomeViewState, String str, UUID uuid, ImmutableList immutableList, String str2, FuturesBuyingPowerViewState futuresBuyingPowerViewState, boolean z, boolean z2, LoggableViewState2 loggableViewState2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = futuresAssetHomeViewState.accountNumber;
        }
        if ((i & 2) != 0) {
            uuid = futuresAssetHomeViewState.futuresSubAccountId;
        }
        if ((i & 4) != 0) {
            immutableList = futuresAssetHomeViewState.assetHomeOrder;
        }
        if ((i & 8) != 0) {
            str2 = futuresAssetHomeViewState.disclosureMarkdown;
        }
        if ((i & 16) != 0) {
            futuresBuyingPowerViewState = futuresAssetHomeViewState.buyingPowerViewState;
        }
        if ((i & 32) != 0) {
            z = futuresAssetHomeViewState.showViewAllFuturesButton;
        }
        if ((i & 64) != 0) {
            z2 = futuresAssetHomeViewState.isChartLoaded;
        }
        if ((i & 128) != 0) {
            loggableViewState2 = futuresAssetHomeViewState.loggingState;
        }
        if ((i & 256) != 0) {
            z3 = futuresAssetHomeViewState.showToolbarSearchIcon;
        }
        LoggableViewState2 loggableViewState22 = loggableViewState2;
        boolean z4 = z3;
        boolean z5 = z;
        boolean z6 = z2;
        FuturesBuyingPowerViewState futuresBuyingPowerViewState2 = futuresBuyingPowerViewState;
        ImmutableList immutableList2 = immutableList;
        return futuresAssetHomeViewState.copy(str, uuid, immutableList2, str2, futuresBuyingPowerViewState2, z5, z6, loggableViewState22, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getFuturesSubAccountId() {
        return this.futuresSubAccountId;
    }

    public final ImmutableList<SectionTypeDto> component3() {
        return this.assetHomeOrder;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    /* renamed from: component5, reason: from getter */
    public final FuturesBuyingPowerViewState getBuyingPowerViewState() {
        return this.buyingPowerViewState;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowViewAllFuturesButton() {
        return this.showViewAllFuturesButton;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsChartLoaded() {
        return this.isChartLoaded;
    }

    /* renamed from: component8, reason: from getter */
    public final LoggableViewState2 getLoggingState() {
        return this.loggingState;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowToolbarSearchIcon() {
        return this.showToolbarSearchIcon;
    }

    public final FuturesAssetHomeViewState copy(String accountNumber, UUID futuresSubAccountId, ImmutableList<? extends SectionTypeDto> assetHomeOrder, String disclosureMarkdown, FuturesBuyingPowerViewState buyingPowerViewState, boolean showViewAllFuturesButton, boolean isChartLoaded, LoggableViewState2 loggingState, boolean showToolbarSearchIcon) {
        Intrinsics.checkNotNullParameter(assetHomeOrder, "assetHomeOrder");
        Intrinsics.checkNotNullParameter(loggingState, "loggingState");
        return new FuturesAssetHomeViewState(accountNumber, futuresSubAccountId, assetHomeOrder, disclosureMarkdown, buyingPowerViewState, showViewAllFuturesButton, isChartLoaded, loggingState, showToolbarSearchIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesAssetHomeViewState)) {
            return false;
        }
        FuturesAssetHomeViewState futuresAssetHomeViewState = (FuturesAssetHomeViewState) other;
        return Intrinsics.areEqual(this.accountNumber, futuresAssetHomeViewState.accountNumber) && Intrinsics.areEqual(this.futuresSubAccountId, futuresAssetHomeViewState.futuresSubAccountId) && Intrinsics.areEqual(this.assetHomeOrder, futuresAssetHomeViewState.assetHomeOrder) && Intrinsics.areEqual(this.disclosureMarkdown, futuresAssetHomeViewState.disclosureMarkdown) && Intrinsics.areEqual(this.buyingPowerViewState, futuresAssetHomeViewState.buyingPowerViewState) && this.showViewAllFuturesButton == futuresAssetHomeViewState.showViewAllFuturesButton && this.isChartLoaded == futuresAssetHomeViewState.isChartLoaded && Intrinsics.areEqual(this.loggingState, futuresAssetHomeViewState.loggingState) && this.showToolbarSearchIcon == futuresAssetHomeViewState.showToolbarSearchIcon;
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UUID uuid = this.futuresSubAccountId;
        int iHashCode2 = (((iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.assetHomeOrder.hashCode()) * 31;
        String str2 = this.disclosureMarkdown;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FuturesBuyingPowerViewState futuresBuyingPowerViewState = this.buyingPowerViewState;
        return ((((((((iHashCode3 + (futuresBuyingPowerViewState != null ? futuresBuyingPowerViewState.hashCode() : 0)) * 31) + Boolean.hashCode(this.showViewAllFuturesButton)) * 31) + Boolean.hashCode(this.isChartLoaded)) * 31) + this.loggingState.hashCode()) * 31) + Boolean.hashCode(this.showToolbarSearchIcon);
    }

    public String toString() {
        return "FuturesAssetHomeViewState(accountNumber=" + this.accountNumber + ", futuresSubAccountId=" + this.futuresSubAccountId + ", assetHomeOrder=" + this.assetHomeOrder + ", disclosureMarkdown=" + this.disclosureMarkdown + ", buyingPowerViewState=" + this.buyingPowerViewState + ", showViewAllFuturesButton=" + this.showViewAllFuturesButton + ", isChartLoaded=" + this.isChartLoaded + ", loggingState=" + this.loggingState + ", showToolbarSearchIcon=" + this.showToolbarSearchIcon + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesAssetHomeViewState(String str, UUID uuid, ImmutableList<? extends SectionTypeDto> assetHomeOrder, String str2, FuturesBuyingPowerViewState futuresBuyingPowerViewState, boolean z, boolean z2, LoggableViewState2 loggingState, boolean z3) {
        Intrinsics.checkNotNullParameter(assetHomeOrder, "assetHomeOrder");
        Intrinsics.checkNotNullParameter(loggingState, "loggingState");
        this.accountNumber = str;
        this.futuresSubAccountId = uuid;
        this.assetHomeOrder = assetHomeOrder;
        this.disclosureMarkdown = str2;
        this.buyingPowerViewState = futuresBuyingPowerViewState;
        this.showViewAllFuturesButton = z;
        this.isChartLoaded = z2;
        this.loggingState = loggingState;
        this.showToolbarSearchIcon = z3;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UUID getFuturesSubAccountId() {
        return this.futuresSubAccountId;
    }

    public final ImmutableList<SectionTypeDto> getAssetHomeOrder() {
        return this.assetHomeOrder;
    }

    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final FuturesBuyingPowerViewState getBuyingPowerViewState() {
        return this.buyingPowerViewState;
    }

    public final boolean getShowViewAllFuturesButton() {
        return this.showViewAllFuturesButton;
    }

    public final boolean isChartLoaded() {
        return this.isChartLoaded;
    }

    public /* synthetic */ FuturesAssetHomeViewState(String str, UUID uuid, ImmutableList immutableList, String str2, FuturesBuyingPowerViewState futuresBuyingPowerViewState, boolean z, boolean z2, LoggableViewState2 loggableViewState2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uuid, immutableList, str2, futuresBuyingPowerViewState, z, z2, (i & 128) != 0 ? new LoggableViewState2.Completed(null, null, 3, null) : loggableViewState2, z3);
    }

    public final LoggableViewState2 getLoggingState() {
        return this.loggingState;
    }

    public final boolean getShowToolbarSearchIcon() {
        return this.showToolbarSearchIcon;
    }
}
