package com.robinhood.android.assethomes;

import com.robinhood.android.models.portfolio.AssetHomeState;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetHomeViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003Js\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001J\u0013\u0010-\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001d¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeViewState;", "", "assetHomeState", "Lcom/robinhood/android/models/portfolio/AssetHomeState;", "disclosureContentfulId", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "bottomBar", "Lcom/robinhood/android/assethomes/AssetHomeBottomBar;", "bottomBarEducationTourId", "pnlShowNewTag", "", "pnlUpdatesEnabled", "showSearchIcon", "showOptionLevel3EntryPoint", "showInfoIconInHeader", "<init>", "(Lcom/robinhood/android/models/portfolio/AssetHomeState;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/assethomes/AssetHomeBottomBar;Ljava/lang/String;ZZZZZ)V", "getAssetHomeState", "()Lcom/robinhood/android/models/portfolio/AssetHomeState;", "getDisclosureContentfulId", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getBottomBar", "()Lcom/robinhood/android/assethomes/AssetHomeBottomBar;", "getBottomBarEducationTourId", "getPnlShowNewTag", "()Z", "getPnlUpdatesEnabled", "getShowSearchIcon", "getShowOptionLevel3EntryPoint", "getShowInfoIconInHeader", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AssetHomeViewState {
    public static final int $stable = 8;
    private final AssetHomeState assetHomeState;
    private final AssetHomeStateProvider2 bottomBar;
    private final String bottomBarEducationTourId;
    private final BrokerageAccountType brokerageAccountType;
    private final String disclosureContentfulId;
    private final boolean pnlShowNewTag;
    private final boolean pnlUpdatesEnabled;
    private final boolean showInfoIconInHeader;
    private final boolean showOptionLevel3EntryPoint;
    private final boolean showSearchIcon;

    public static /* synthetic */ AssetHomeViewState copy$default(AssetHomeViewState assetHomeViewState, AssetHomeState assetHomeState, String str, BrokerageAccountType brokerageAccountType, AssetHomeStateProvider2 assetHomeStateProvider2, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            assetHomeState = assetHomeViewState.assetHomeState;
        }
        if ((i & 2) != 0) {
            str = assetHomeViewState.disclosureContentfulId;
        }
        if ((i & 4) != 0) {
            brokerageAccountType = assetHomeViewState.brokerageAccountType;
        }
        if ((i & 8) != 0) {
            assetHomeStateProvider2 = assetHomeViewState.bottomBar;
        }
        if ((i & 16) != 0) {
            str2 = assetHomeViewState.bottomBarEducationTourId;
        }
        if ((i & 32) != 0) {
            z = assetHomeViewState.pnlShowNewTag;
        }
        if ((i & 64) != 0) {
            z2 = assetHomeViewState.pnlUpdatesEnabled;
        }
        if ((i & 128) != 0) {
            z3 = assetHomeViewState.showSearchIcon;
        }
        if ((i & 256) != 0) {
            z4 = assetHomeViewState.showOptionLevel3EntryPoint;
        }
        if ((i & 512) != 0) {
            z5 = assetHomeViewState.showInfoIconInHeader;
        }
        boolean z6 = z4;
        boolean z7 = z5;
        boolean z8 = z2;
        boolean z9 = z3;
        String str3 = str2;
        boolean z10 = z;
        return assetHomeViewState.copy(assetHomeState, str, brokerageAccountType, assetHomeStateProvider2, str3, z10, z8, z9, z6, z7);
    }

    /* renamed from: component1, reason: from getter */
    public final AssetHomeState getAssetHomeState() {
        return this.assetHomeState;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowInfoIconInHeader() {
        return this.showInfoIconInHeader;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisclosureContentfulId() {
        return this.disclosureContentfulId;
    }

    /* renamed from: component3, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component4, reason: from getter */
    public final AssetHomeStateProvider2 getBottomBar() {
        return this.bottomBar;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBottomBarEducationTourId() {
        return this.bottomBarEducationTourId;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getPnlShowNewTag() {
        return this.pnlShowNewTag;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowSearchIcon() {
        return this.showSearchIcon;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getShowOptionLevel3EntryPoint() {
        return this.showOptionLevel3EntryPoint;
    }

    public final AssetHomeViewState copy(AssetHomeState assetHomeState, String disclosureContentfulId, BrokerageAccountType brokerageAccountType, AssetHomeStateProvider2 bottomBar, String bottomBarEducationTourId, boolean pnlShowNewTag, boolean pnlUpdatesEnabled, boolean showSearchIcon, boolean showOptionLevel3EntryPoint, boolean showInfoIconInHeader) {
        Intrinsics.checkNotNullParameter(disclosureContentfulId, "disclosureContentfulId");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        return new AssetHomeViewState(assetHomeState, disclosureContentfulId, brokerageAccountType, bottomBar, bottomBarEducationTourId, pnlShowNewTag, pnlUpdatesEnabled, showSearchIcon, showOptionLevel3EntryPoint, showInfoIconInHeader);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetHomeViewState)) {
            return false;
        }
        AssetHomeViewState assetHomeViewState = (AssetHomeViewState) other;
        return Intrinsics.areEqual(this.assetHomeState, assetHomeViewState.assetHomeState) && Intrinsics.areEqual(this.disclosureContentfulId, assetHomeViewState.disclosureContentfulId) && this.brokerageAccountType == assetHomeViewState.brokerageAccountType && Intrinsics.areEqual(this.bottomBar, assetHomeViewState.bottomBar) && Intrinsics.areEqual(this.bottomBarEducationTourId, assetHomeViewState.bottomBarEducationTourId) && this.pnlShowNewTag == assetHomeViewState.pnlShowNewTag && this.pnlUpdatesEnabled == assetHomeViewState.pnlUpdatesEnabled && this.showSearchIcon == assetHomeViewState.showSearchIcon && this.showOptionLevel3EntryPoint == assetHomeViewState.showOptionLevel3EntryPoint && this.showInfoIconInHeader == assetHomeViewState.showInfoIconInHeader;
    }

    public int hashCode() {
        AssetHomeState assetHomeState = this.assetHomeState;
        int iHashCode = (((((assetHomeState == null ? 0 : assetHomeState.hashCode()) * 31) + this.disclosureContentfulId.hashCode()) * 31) + this.brokerageAccountType.hashCode()) * 31;
        AssetHomeStateProvider2 assetHomeStateProvider2 = this.bottomBar;
        int iHashCode2 = (iHashCode + (assetHomeStateProvider2 == null ? 0 : assetHomeStateProvider2.hashCode())) * 31;
        String str = this.bottomBarEducationTourId;
        return ((((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.pnlShowNewTag)) * 31) + Boolean.hashCode(this.pnlUpdatesEnabled)) * 31) + Boolean.hashCode(this.showSearchIcon)) * 31) + Boolean.hashCode(this.showOptionLevel3EntryPoint)) * 31) + Boolean.hashCode(this.showInfoIconInHeader);
    }

    public String toString() {
        return "AssetHomeViewState(assetHomeState=" + this.assetHomeState + ", disclosureContentfulId=" + this.disclosureContentfulId + ", brokerageAccountType=" + this.brokerageAccountType + ", bottomBar=" + this.bottomBar + ", bottomBarEducationTourId=" + this.bottomBarEducationTourId + ", pnlShowNewTag=" + this.pnlShowNewTag + ", pnlUpdatesEnabled=" + this.pnlUpdatesEnabled + ", showSearchIcon=" + this.showSearchIcon + ", showOptionLevel3EntryPoint=" + this.showOptionLevel3EntryPoint + ", showInfoIconInHeader=" + this.showInfoIconInHeader + ")";
    }

    public AssetHomeViewState(AssetHomeState assetHomeState, String disclosureContentfulId, BrokerageAccountType brokerageAccountType, AssetHomeStateProvider2 assetHomeStateProvider2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(disclosureContentfulId, "disclosureContentfulId");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        this.assetHomeState = assetHomeState;
        this.disclosureContentfulId = disclosureContentfulId;
        this.brokerageAccountType = brokerageAccountType;
        this.bottomBar = assetHomeStateProvider2;
        this.bottomBarEducationTourId = str;
        this.pnlShowNewTag = z;
        this.pnlUpdatesEnabled = z2;
        this.showSearchIcon = z3;
        this.showOptionLevel3EntryPoint = z4;
        this.showInfoIconInHeader = z5;
    }

    public /* synthetic */ AssetHomeViewState(AssetHomeState assetHomeState, String str, BrokerageAccountType brokerageAccountType, AssetHomeStateProvider2 assetHomeStateProvider2, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetHomeState, str, brokerageAccountType, assetHomeStateProvider2, str2, z, z2, (i & 128) != 0 ? true : z3, z4, (i & 512) != 0 ? false : z5);
    }

    public final AssetHomeState getAssetHomeState() {
        return this.assetHomeState;
    }

    public final String getDisclosureContentfulId() {
        return this.disclosureContentfulId;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final AssetHomeStateProvider2 getBottomBar() {
        return this.bottomBar;
    }

    public final String getBottomBarEducationTourId() {
        return this.bottomBarEducationTourId;
    }

    public final boolean getPnlShowNewTag() {
        return this.pnlShowNewTag;
    }

    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
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
