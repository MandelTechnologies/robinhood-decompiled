package com.robinhood.android.portfolio.pnlhub.appbar;

import com.robinhood.android.portfolio.pnl.PnlHubAssetClass;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PnlHubTopAppBarDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarDataState;", "", "availableAssetClasses", "", "Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;", "selectedAssetClass", "optionsSupported", "", "locality", "Lcom/robinhood/iso/countrycode/CountryCode;", "showCryptoFilterTooltip", "isCryptoUsCostBasisExperimentEnabled", "<init>", "(Ljava/util/List;Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;ZLcom/robinhood/iso/countrycode/CountryCode;ZZ)V", "getAvailableAssetClasses", "()Ljava/util/List;", "getSelectedAssetClass", "()Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;", "getOptionsSupported", "()Z", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode;", "getShowCryptoFilterTooltip", "cryptoSupported", "getCryptoSupported", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PnlHubTopAppBarDataState {
    public static final int $stable = 8;
    private final List<PnlHubAssetClass> availableAssetClasses;
    private final boolean isCryptoUsCostBasisExperimentEnabled;
    private final CountryCode locality;
    private final boolean optionsSupported;
    private final PnlHubAssetClass selectedAssetClass;
    private final boolean showCryptoFilterTooltip;

    public static /* synthetic */ PnlHubTopAppBarDataState copy$default(PnlHubTopAppBarDataState pnlHubTopAppBarDataState, List list, PnlHubAssetClass pnlHubAssetClass, boolean z, CountryCode countryCode, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pnlHubTopAppBarDataState.availableAssetClasses;
        }
        if ((i & 2) != 0) {
            pnlHubAssetClass = pnlHubTopAppBarDataState.selectedAssetClass;
        }
        if ((i & 4) != 0) {
            z = pnlHubTopAppBarDataState.optionsSupported;
        }
        if ((i & 8) != 0) {
            countryCode = pnlHubTopAppBarDataState.locality;
        }
        if ((i & 16) != 0) {
            z2 = pnlHubTopAppBarDataState.showCryptoFilterTooltip;
        }
        if ((i & 32) != 0) {
            z3 = pnlHubTopAppBarDataState.isCryptoUsCostBasisExperimentEnabled;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        return pnlHubTopAppBarDataState.copy(list, pnlHubAssetClass, z, countryCode, z4, z5);
    }

    public final List<PnlHubAssetClass> component1() {
        return this.availableAssetClasses;
    }

    /* renamed from: component2, reason: from getter */
    public final PnlHubAssetClass getSelectedAssetClass() {
        return this.selectedAssetClass;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getOptionsSupported() {
        return this.optionsSupported;
    }

    /* renamed from: component4, reason: from getter */
    public final CountryCode getLocality() {
        return this.locality;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowCryptoFilterTooltip() {
        return this.showCryptoFilterTooltip;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsCryptoUsCostBasisExperimentEnabled() {
        return this.isCryptoUsCostBasisExperimentEnabled;
    }

    public final PnlHubTopAppBarDataState copy(List<? extends PnlHubAssetClass> availableAssetClasses, PnlHubAssetClass selectedAssetClass, boolean optionsSupported, CountryCode locality, boolean showCryptoFilterTooltip, boolean isCryptoUsCostBasisExperimentEnabled) {
        Intrinsics.checkNotNullParameter(availableAssetClasses, "availableAssetClasses");
        Intrinsics.checkNotNullParameter(selectedAssetClass, "selectedAssetClass");
        return new PnlHubTopAppBarDataState(availableAssetClasses, selectedAssetClass, optionsSupported, locality, showCryptoFilterTooltip, isCryptoUsCostBasisExperimentEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PnlHubTopAppBarDataState)) {
            return false;
        }
        PnlHubTopAppBarDataState pnlHubTopAppBarDataState = (PnlHubTopAppBarDataState) other;
        return Intrinsics.areEqual(this.availableAssetClasses, pnlHubTopAppBarDataState.availableAssetClasses) && this.selectedAssetClass == pnlHubTopAppBarDataState.selectedAssetClass && this.optionsSupported == pnlHubTopAppBarDataState.optionsSupported && Intrinsics.areEqual(this.locality, pnlHubTopAppBarDataState.locality) && this.showCryptoFilterTooltip == pnlHubTopAppBarDataState.showCryptoFilterTooltip && this.isCryptoUsCostBasisExperimentEnabled == pnlHubTopAppBarDataState.isCryptoUsCostBasisExperimentEnabled;
    }

    public int hashCode() {
        int iHashCode = ((((this.availableAssetClasses.hashCode() * 31) + this.selectedAssetClass.hashCode()) * 31) + Boolean.hashCode(this.optionsSupported)) * 31;
        CountryCode countryCode = this.locality;
        return ((((iHashCode + (countryCode == null ? 0 : countryCode.hashCode())) * 31) + Boolean.hashCode(this.showCryptoFilterTooltip)) * 31) + Boolean.hashCode(this.isCryptoUsCostBasisExperimentEnabled);
    }

    public String toString() {
        return "PnlHubTopAppBarDataState(availableAssetClasses=" + this.availableAssetClasses + ", selectedAssetClass=" + this.selectedAssetClass + ", optionsSupported=" + this.optionsSupported + ", locality=" + this.locality + ", showCryptoFilterTooltip=" + this.showCryptoFilterTooltip + ", isCryptoUsCostBasisExperimentEnabled=" + this.isCryptoUsCostBasisExperimentEnabled + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PnlHubTopAppBarDataState(List<? extends PnlHubAssetClass> availableAssetClasses, PnlHubAssetClass selectedAssetClass, boolean z, CountryCode countryCode, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(availableAssetClasses, "availableAssetClasses");
        Intrinsics.checkNotNullParameter(selectedAssetClass, "selectedAssetClass");
        this.availableAssetClasses = availableAssetClasses;
        this.selectedAssetClass = selectedAssetClass;
        this.optionsSupported = z;
        this.locality = countryCode;
        this.showCryptoFilterTooltip = z2;
        this.isCryptoUsCostBasisExperimentEnabled = z3;
    }

    public final List<PnlHubAssetClass> getAvailableAssetClasses() {
        return this.availableAssetClasses;
    }

    public final PnlHubAssetClass getSelectedAssetClass() {
        return this.selectedAssetClass;
    }

    public final boolean getOptionsSupported() {
        return this.optionsSupported;
    }

    public final CountryCode getLocality() {
        return this.locality;
    }

    public final boolean getShowCryptoFilterTooltip() {
        return this.showCryptoFilterTooltip;
    }

    public final boolean isCryptoUsCostBasisExperimentEnabled() {
        return this.isCryptoUsCostBasisExperimentEnabled;
    }

    public final boolean getCryptoSupported() {
        return this.availableAssetClasses.contains(PnlHubAssetClass.CRYPTO);
    }
}
