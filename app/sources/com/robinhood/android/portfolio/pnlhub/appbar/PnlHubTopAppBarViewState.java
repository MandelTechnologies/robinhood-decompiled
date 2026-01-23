package com.robinhood.android.portfolio.pnlhub.appbar;

import com.robinhood.android.portfolio.pnl.PnlHubAssetClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PnlHubTopAppBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarViewState;", "", "availableAssetClasses", "", "Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;", "selectedAssetClass", "contentfulId", "", "showCryptoFilterTooltip", "", "<init>", "(Ljava/util/List;Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;Ljava/lang/String;Z)V", "getAvailableAssetClasses", "()Ljava/util/List;", "getSelectedAssetClass", "()Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;", "getContentfulId", "()Ljava/lang/String;", "getShowCryptoFilterTooltip", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PnlHubTopAppBarViewState {
    public static final int $stable = 8;
    private final List<PnlHubAssetClass> availableAssetClasses;
    private final String contentfulId;
    private final PnlHubAssetClass selectedAssetClass;
    private final boolean showCryptoFilterTooltip;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PnlHubTopAppBarViewState copy$default(PnlHubTopAppBarViewState pnlHubTopAppBarViewState, List list, PnlHubAssetClass pnlHubAssetClass, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pnlHubTopAppBarViewState.availableAssetClasses;
        }
        if ((i & 2) != 0) {
            pnlHubAssetClass = pnlHubTopAppBarViewState.selectedAssetClass;
        }
        if ((i & 4) != 0) {
            str = pnlHubTopAppBarViewState.contentfulId;
        }
        if ((i & 8) != 0) {
            z = pnlHubTopAppBarViewState.showCryptoFilterTooltip;
        }
        return pnlHubTopAppBarViewState.copy(list, pnlHubAssetClass, str, z);
    }

    public final List<PnlHubAssetClass> component1() {
        return this.availableAssetClasses;
    }

    /* renamed from: component2, reason: from getter */
    public final PnlHubAssetClass getSelectedAssetClass() {
        return this.selectedAssetClass;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContentfulId() {
        return this.contentfulId;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowCryptoFilterTooltip() {
        return this.showCryptoFilterTooltip;
    }

    public final PnlHubTopAppBarViewState copy(List<? extends PnlHubAssetClass> availableAssetClasses, PnlHubAssetClass selectedAssetClass, String contentfulId, boolean showCryptoFilterTooltip) {
        Intrinsics.checkNotNullParameter(availableAssetClasses, "availableAssetClasses");
        Intrinsics.checkNotNullParameter(selectedAssetClass, "selectedAssetClass");
        Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
        return new PnlHubTopAppBarViewState(availableAssetClasses, selectedAssetClass, contentfulId, showCryptoFilterTooltip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PnlHubTopAppBarViewState)) {
            return false;
        }
        PnlHubTopAppBarViewState pnlHubTopAppBarViewState = (PnlHubTopAppBarViewState) other;
        return Intrinsics.areEqual(this.availableAssetClasses, pnlHubTopAppBarViewState.availableAssetClasses) && this.selectedAssetClass == pnlHubTopAppBarViewState.selectedAssetClass && Intrinsics.areEqual(this.contentfulId, pnlHubTopAppBarViewState.contentfulId) && this.showCryptoFilterTooltip == pnlHubTopAppBarViewState.showCryptoFilterTooltip;
    }

    public int hashCode() {
        return (((((this.availableAssetClasses.hashCode() * 31) + this.selectedAssetClass.hashCode()) * 31) + this.contentfulId.hashCode()) * 31) + Boolean.hashCode(this.showCryptoFilterTooltip);
    }

    public String toString() {
        return "PnlHubTopAppBarViewState(availableAssetClasses=" + this.availableAssetClasses + ", selectedAssetClass=" + this.selectedAssetClass + ", contentfulId=" + this.contentfulId + ", showCryptoFilterTooltip=" + this.showCryptoFilterTooltip + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PnlHubTopAppBarViewState(List<? extends PnlHubAssetClass> availableAssetClasses, PnlHubAssetClass selectedAssetClass, String contentfulId, boolean z) {
        Intrinsics.checkNotNullParameter(availableAssetClasses, "availableAssetClasses");
        Intrinsics.checkNotNullParameter(selectedAssetClass, "selectedAssetClass");
        Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
        this.availableAssetClasses = availableAssetClasses;
        this.selectedAssetClass = selectedAssetClass;
        this.contentfulId = contentfulId;
        this.showCryptoFilterTooltip = z;
    }

    public /* synthetic */ PnlHubTopAppBarViewState(List list, PnlHubAssetClass pnlHubAssetClass, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, pnlHubAssetClass, str, (i & 8) != 0 ? false : z);
    }

    public final List<PnlHubAssetClass> getAvailableAssetClasses() {
        return this.availableAssetClasses;
    }

    public final PnlHubAssetClass getSelectedAssetClass() {
        return this.selectedAssetClass;
    }

    public final String getContentfulId() {
        return this.contentfulId;
    }

    public final boolean getShowCryptoFilterTooltip() {
        return this.showCryptoFilterTooltip;
    }
}
