package com.robinhood.android.assethomes;

import com.robinhood.android.models.portfolio.AssetHomeState;
import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.api.AssetType;
import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AssetHomeDataState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J\t\u00101\u001a\u00020\u0010HÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\t\u00103\u001a\u00020\u0010HÆ\u0003J\t\u00104\u001a\u00020\u0010HÆ\u0003J\t\u00105\u001a\u00020\u0010HÆ\u0003J\u008f\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0010HÆ\u0001J\u0013\u00107\u001a\u00020\u00102\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010%R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\u0014\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0011\u0010\u0015\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeDataState;", "", "accountNumber", "", "assetType", "Lcom/robinhood/android/models/portfolio/api/AssetType;", "retirementUninvestedViewModel", "Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel;", "assetHomeState", "Lcom/robinhood/android/models/portfolio/AssetHomeState;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "positions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "pnlShowNewTag", "", "pnlUpdatesEnabled", "isUk", "showSearchIcon", "showOptionLevel3EntryPoint", "showInfoIconInHeader", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/AssetType;Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel;Lcom/robinhood/android/models/portfolio/AssetHomeState;Lcom/robinhood/models/api/BrokerageAccountType;Lkotlinx/collections/immutable/ImmutableList;ZZZZZZ)V", "getAccountNumber", "()Ljava/lang/String;", "getAssetType", "()Lcom/robinhood/android/models/portfolio/api/AssetType;", "getRetirementUninvestedViewModel", "()Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel;", "getAssetHomeState", "()Lcom/robinhood/android/models/portfolio/AssetHomeState;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getPositions", "()Lkotlinx/collections/immutable/ImmutableList;", "getPnlShowNewTag", "()Z", "getPnlUpdatesEnabled", "getShowSearchIcon", "getShowOptionLevel3EntryPoint", "getShowInfoIconInHeader", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AssetHomeDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final AssetHomeState assetHomeState;
    private final AssetType assetType;
    private final BrokerageAccountType brokerageAccountType;
    private final boolean isUk;
    private final boolean pnlShowNewTag;
    private final boolean pnlUpdatesEnabled;
    private final ImmutableList<PositionsV2.PositionListItemV2> positions;
    private final RetirementUninvestedViewModel retirementUninvestedViewModel;
    private final boolean showInfoIconInHeader;
    private final boolean showOptionLevel3EntryPoint;
    private final boolean showSearchIcon;

    public static /* synthetic */ AssetHomeDataState copy$default(AssetHomeDataState assetHomeDataState, String str, AssetType assetType, RetirementUninvestedViewModel retirementUninvestedViewModel, AssetHomeState assetHomeState, BrokerageAccountType brokerageAccountType, ImmutableList immutableList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetHomeDataState.accountNumber;
        }
        if ((i & 2) != 0) {
            assetType = assetHomeDataState.assetType;
        }
        if ((i & 4) != 0) {
            retirementUninvestedViewModel = assetHomeDataState.retirementUninvestedViewModel;
        }
        if ((i & 8) != 0) {
            assetHomeState = assetHomeDataState.assetHomeState;
        }
        if ((i & 16) != 0) {
            brokerageAccountType = assetHomeDataState.brokerageAccountType;
        }
        if ((i & 32) != 0) {
            immutableList = assetHomeDataState.positions;
        }
        if ((i & 64) != 0) {
            z = assetHomeDataState.pnlShowNewTag;
        }
        if ((i & 128) != 0) {
            z2 = assetHomeDataState.pnlUpdatesEnabled;
        }
        if ((i & 256) != 0) {
            z3 = assetHomeDataState.isUk;
        }
        if ((i & 512) != 0) {
            z4 = assetHomeDataState.showSearchIcon;
        }
        if ((i & 1024) != 0) {
            z5 = assetHomeDataState.showOptionLevel3EntryPoint;
        }
        if ((i & 2048) != 0) {
            z6 = assetHomeDataState.showInfoIconInHeader;
        }
        boolean z7 = z5;
        boolean z8 = z6;
        boolean z9 = z3;
        boolean z10 = z4;
        boolean z11 = z;
        boolean z12 = z2;
        BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
        ImmutableList immutableList2 = immutableList;
        return assetHomeDataState.copy(str, assetType, retirementUninvestedViewModel, assetHomeState, brokerageAccountType2, immutableList2, z11, z12, z9, z10, z7, z8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowSearchIcon() {
        return this.showSearchIcon;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShowOptionLevel3EntryPoint() {
        return this.showOptionLevel3EntryPoint;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getShowInfoIconInHeader() {
        return this.showInfoIconInHeader;
    }

    /* renamed from: component2, reason: from getter */
    public final AssetType getAssetType() {
        return this.assetType;
    }

    /* renamed from: component3, reason: from getter */
    public final RetirementUninvestedViewModel getRetirementUninvestedViewModel() {
        return this.retirementUninvestedViewModel;
    }

    /* renamed from: component4, reason: from getter */
    public final AssetHomeState getAssetHomeState() {
        return this.assetHomeState;
    }

    /* renamed from: component5, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final ImmutableList<PositionsV2.PositionListItemV2> component6() {
        return this.positions;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getPnlShowNewTag() {
        return this.pnlShowNewTag;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsUk() {
        return this.isUk;
    }

    public final AssetHomeDataState copy(String accountNumber, AssetType assetType, RetirementUninvestedViewModel retirementUninvestedViewModel, AssetHomeState assetHomeState, BrokerageAccountType brokerageAccountType, ImmutableList<PositionsV2.PositionListItemV2> positions, boolean pnlShowNewTag, boolean pnlUpdatesEnabled, boolean isUk, boolean showSearchIcon, boolean showOptionLevel3EntryPoint, boolean showInfoIconInHeader) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        return new AssetHomeDataState(accountNumber, assetType, retirementUninvestedViewModel, assetHomeState, brokerageAccountType, positions, pnlShowNewTag, pnlUpdatesEnabled, isUk, showSearchIcon, showOptionLevel3EntryPoint, showInfoIconInHeader);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetHomeDataState)) {
            return false;
        }
        AssetHomeDataState assetHomeDataState = (AssetHomeDataState) other;
        return Intrinsics.areEqual(this.accountNumber, assetHomeDataState.accountNumber) && this.assetType == assetHomeDataState.assetType && Intrinsics.areEqual(this.retirementUninvestedViewModel, assetHomeDataState.retirementUninvestedViewModel) && Intrinsics.areEqual(this.assetHomeState, assetHomeDataState.assetHomeState) && this.brokerageAccountType == assetHomeDataState.brokerageAccountType && Intrinsics.areEqual(this.positions, assetHomeDataState.positions) && this.pnlShowNewTag == assetHomeDataState.pnlShowNewTag && this.pnlUpdatesEnabled == assetHomeDataState.pnlUpdatesEnabled && this.isUk == assetHomeDataState.isUk && this.showSearchIcon == assetHomeDataState.showSearchIcon && this.showOptionLevel3EntryPoint == assetHomeDataState.showOptionLevel3EntryPoint && this.showInfoIconInHeader == assetHomeDataState.showInfoIconInHeader;
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.assetType.hashCode()) * 31;
        RetirementUninvestedViewModel retirementUninvestedViewModel = this.retirementUninvestedViewModel;
        int iHashCode2 = (iHashCode + (retirementUninvestedViewModel == null ? 0 : retirementUninvestedViewModel.hashCode())) * 31;
        AssetHomeState assetHomeState = this.assetHomeState;
        int iHashCode3 = (((iHashCode2 + (assetHomeState == null ? 0 : assetHomeState.hashCode())) * 31) + this.brokerageAccountType.hashCode()) * 31;
        ImmutableList<PositionsV2.PositionListItemV2> immutableList = this.positions;
        return ((((((((((((iHashCode3 + (immutableList != null ? immutableList.hashCode() : 0)) * 31) + Boolean.hashCode(this.pnlShowNewTag)) * 31) + Boolean.hashCode(this.pnlUpdatesEnabled)) * 31) + Boolean.hashCode(this.isUk)) * 31) + Boolean.hashCode(this.showSearchIcon)) * 31) + Boolean.hashCode(this.showOptionLevel3EntryPoint)) * 31) + Boolean.hashCode(this.showInfoIconInHeader);
    }

    public String toString() {
        return "AssetHomeDataState(accountNumber=" + this.accountNumber + ", assetType=" + this.assetType + ", retirementUninvestedViewModel=" + this.retirementUninvestedViewModel + ", assetHomeState=" + this.assetHomeState + ", brokerageAccountType=" + this.brokerageAccountType + ", positions=" + this.positions + ", pnlShowNewTag=" + this.pnlShowNewTag + ", pnlUpdatesEnabled=" + this.pnlUpdatesEnabled + ", isUk=" + this.isUk + ", showSearchIcon=" + this.showSearchIcon + ", showOptionLevel3EntryPoint=" + this.showOptionLevel3EntryPoint + ", showInfoIconInHeader=" + this.showInfoIconInHeader + ")";
    }

    public AssetHomeDataState(String str, AssetType assetType, RetirementUninvestedViewModel retirementUninvestedViewModel, AssetHomeState assetHomeState, BrokerageAccountType brokerageAccountType, ImmutableList<PositionsV2.PositionListItemV2> immutableList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        this.accountNumber = str;
        this.assetType = assetType;
        this.retirementUninvestedViewModel = retirementUninvestedViewModel;
        this.assetHomeState = assetHomeState;
        this.brokerageAccountType = brokerageAccountType;
        this.positions = immutableList;
        this.pnlShowNewTag = z;
        this.pnlUpdatesEnabled = z2;
        this.isUk = z3;
        this.showSearchIcon = z4;
        this.showOptionLevel3EntryPoint = z5;
        this.showInfoIconInHeader = z6;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final AssetType getAssetType() {
        return this.assetType;
    }

    public final RetirementUninvestedViewModel getRetirementUninvestedViewModel() {
        return this.retirementUninvestedViewModel;
    }

    public final AssetHomeState getAssetHomeState() {
        return this.assetHomeState;
    }

    public /* synthetic */ AssetHomeDataState(String str, AssetType assetType, RetirementUninvestedViewModel retirementUninvestedViewModel, AssetHomeState assetHomeState, BrokerageAccountType brokerageAccountType, ImmutableList immutableList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, assetType, (i & 4) != 0 ? null : retirementUninvestedViewModel, (i & 8) != 0 ? null : assetHomeState, (i & 16) != 0 ? BrokerageAccountType.UNKNOWN : brokerageAccountType, (i & 32) != 0 ? null : immutableList, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? true : z4, (i & 1024) != 0 ? false : z5, (i & 2048) != 0 ? false : z6);
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final ImmutableList<PositionsV2.PositionListItemV2> getPositions() {
        return this.positions;
    }

    public final boolean getPnlShowNewTag() {
        return this.pnlShowNewTag;
    }

    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    public final boolean isUk() {
        return this.isUk;
    }

    public final boolean getShowSearchIcon() {
        return this.showSearchIcon;
    }

    public final boolean getShowOptionLevel3EntryPoint() {
        return this.showOptionLevel3EntryPoint;
    }

    public final boolean getShowInfoIconInHeader() {
        return this.showInfoIconInHeader;
    }
}
