package com.robinhood.android.common.portfolio.pnl;

import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossRealized;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PnlHubSectionViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003Jh\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001c¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionViewState;", "", "accountNumber", "", "subtitle", "", "supportedAssetTypes", "", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "realizedPnl", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossRealized;", "showNewTag", "", "isVisible", "isStale", "pnlUpdatesEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossRealized;ZZZZ)V", "getAccountNumber", "()Ljava/lang/String;", "getSubtitle", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSupportedAssetTypes", "()Ljava/util/List;", "getRealizedPnl", "()Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossRealized;", "getShowNewTag", "()Z", "getPnlUpdatesEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossRealized;ZZZZ)Lcom/robinhood/android/common/portfolio/pnl/PnlHubSectionViewState;", "equals", "other", "hashCode", "toString", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PnlHubSectionViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final boolean isStale;
    private final boolean isVisible;
    private final boolean pnlUpdatesEnabled;
    private final ProfitAndLossRealized realizedPnl;
    private final boolean showNewTag;
    private final Integer subtitle;
    private final List<AssetClass> supportedAssetTypes;

    public static /* synthetic */ PnlHubSectionViewState copy$default(PnlHubSectionViewState pnlHubSectionViewState, String str, Integer num, List list, ProfitAndLossRealized profitAndLossRealized, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pnlHubSectionViewState.accountNumber;
        }
        if ((i & 2) != 0) {
            num = pnlHubSectionViewState.subtitle;
        }
        if ((i & 4) != 0) {
            list = pnlHubSectionViewState.supportedAssetTypes;
        }
        if ((i & 8) != 0) {
            profitAndLossRealized = pnlHubSectionViewState.realizedPnl;
        }
        if ((i & 16) != 0) {
            z = pnlHubSectionViewState.showNewTag;
        }
        if ((i & 32) != 0) {
            z2 = pnlHubSectionViewState.isVisible;
        }
        if ((i & 64) != 0) {
            z3 = pnlHubSectionViewState.isStale;
        }
        if ((i & 128) != 0) {
            z4 = pnlHubSectionViewState.pnlUpdatesEnabled;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        boolean z7 = z;
        boolean z8 = z2;
        return pnlHubSectionViewState.copy(str, num, list, profitAndLossRealized, z7, z8, z5, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getSubtitle() {
        return this.subtitle;
    }

    public final List<AssetClass> component3() {
        return this.supportedAssetTypes;
    }

    /* renamed from: component4, reason: from getter */
    public final ProfitAndLossRealized getRealizedPnl() {
        return this.realizedPnl;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowNewTag() {
        return this.showNewTag;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsStale() {
        return this.isStale;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    public final PnlHubSectionViewState copy(String accountNumber, Integer subtitle, List<? extends AssetClass> supportedAssetTypes, ProfitAndLossRealized realizedPnl, boolean showNewTag, boolean isVisible, boolean isStale, boolean pnlUpdatesEnabled) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(supportedAssetTypes, "supportedAssetTypes");
        return new PnlHubSectionViewState(accountNumber, subtitle, supportedAssetTypes, realizedPnl, showNewTag, isVisible, isStale, pnlUpdatesEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PnlHubSectionViewState)) {
            return false;
        }
        PnlHubSectionViewState pnlHubSectionViewState = (PnlHubSectionViewState) other;
        return Intrinsics.areEqual(this.accountNumber, pnlHubSectionViewState.accountNumber) && Intrinsics.areEqual(this.subtitle, pnlHubSectionViewState.subtitle) && Intrinsics.areEqual(this.supportedAssetTypes, pnlHubSectionViewState.supportedAssetTypes) && Intrinsics.areEqual(this.realizedPnl, pnlHubSectionViewState.realizedPnl) && this.showNewTag == pnlHubSectionViewState.showNewTag && this.isVisible == pnlHubSectionViewState.isVisible && this.isStale == pnlHubSectionViewState.isStale && this.pnlUpdatesEnabled == pnlHubSectionViewState.pnlUpdatesEnabled;
    }

    public int hashCode() {
        int iHashCode = this.accountNumber.hashCode() * 31;
        Integer num = this.subtitle;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.supportedAssetTypes.hashCode()) * 31;
        ProfitAndLossRealized profitAndLossRealized = this.realizedPnl;
        return ((((((((iHashCode2 + (profitAndLossRealized != null ? profitAndLossRealized.hashCode() : 0)) * 31) + Boolean.hashCode(this.showNewTag)) * 31) + Boolean.hashCode(this.isVisible)) * 31) + Boolean.hashCode(this.isStale)) * 31) + Boolean.hashCode(this.pnlUpdatesEnabled);
    }

    public String toString() {
        return "PnlHubSectionViewState(accountNumber=" + this.accountNumber + ", subtitle=" + this.subtitle + ", supportedAssetTypes=" + this.supportedAssetTypes + ", realizedPnl=" + this.realizedPnl + ", showNewTag=" + this.showNewTag + ", isVisible=" + this.isVisible + ", isStale=" + this.isStale + ", pnlUpdatesEnabled=" + this.pnlUpdatesEnabled + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PnlHubSectionViewState(String accountNumber, Integer num, List<? extends AssetClass> supportedAssetTypes, ProfitAndLossRealized profitAndLossRealized, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(supportedAssetTypes, "supportedAssetTypes");
        this.accountNumber = accountNumber;
        this.subtitle = num;
        this.supportedAssetTypes = supportedAssetTypes;
        this.realizedPnl = profitAndLossRealized;
        this.showNewTag = z;
        this.isVisible = z2;
        this.isStale = z3;
        this.pnlUpdatesEnabled = z4;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Integer getSubtitle() {
        return this.subtitle;
    }

    public final List<AssetClass> getSupportedAssetTypes() {
        return this.supportedAssetTypes;
    }

    public final ProfitAndLossRealized getRealizedPnl() {
        return this.realizedPnl;
    }

    public final boolean getShowNewTag() {
        return this.showNewTag;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final boolean isStale() {
        return this.isStale;
    }

    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }
}
