package com.robinhood.android.portfolio.pnlhub.appbar;

import com.robinhood.android.portfolio.pnl.PnlHubAssetClass;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: PnlHubTopAppBar.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003JU\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/appbar/PnlHubTopAppBarState;", "", "availableAssetClasses", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;", "selectedAssetClass", "optionsSupported", "", "pnlUpdatesEnabled", "locality", "Lcom/robinhood/iso/countrycode/CountryCode;", "showCryptoFilterTooltip", "isCryptoPnlHubEnabled", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;ZZLcom/robinhood/iso/countrycode/CountryCode;ZZ)V", "getAvailableAssetClasses", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectedAssetClass", "()Lcom/robinhood/android/portfolio/pnl/PnlHubAssetClass;", "getOptionsSupported", "()Z", "getPnlUpdatesEnabled", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode;", "getShowCryptoFilterTooltip", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PnlHubTopAppBarState {
    public static final int $stable = 8;
    private final ImmutableList<PnlHubAssetClass> availableAssetClasses;
    private final boolean isCryptoPnlHubEnabled;
    private final CountryCode locality;
    private final boolean optionsSupported;
    private final boolean pnlUpdatesEnabled;
    private final PnlHubAssetClass selectedAssetClass;
    private final boolean showCryptoFilterTooltip;

    public static /* synthetic */ PnlHubTopAppBarState copy$default(PnlHubTopAppBarState pnlHubTopAppBarState, ImmutableList immutableList, PnlHubAssetClass pnlHubAssetClass, boolean z, boolean z2, CountryCode countryCode, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = pnlHubTopAppBarState.availableAssetClasses;
        }
        if ((i & 2) != 0) {
            pnlHubAssetClass = pnlHubTopAppBarState.selectedAssetClass;
        }
        if ((i & 4) != 0) {
            z = pnlHubTopAppBarState.optionsSupported;
        }
        if ((i & 8) != 0) {
            z2 = pnlHubTopAppBarState.pnlUpdatesEnabled;
        }
        if ((i & 16) != 0) {
            countryCode = pnlHubTopAppBarState.locality;
        }
        if ((i & 32) != 0) {
            z3 = pnlHubTopAppBarState.showCryptoFilterTooltip;
        }
        if ((i & 64) != 0) {
            z4 = pnlHubTopAppBarState.isCryptoPnlHubEnabled;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        CountryCode countryCode2 = countryCode;
        boolean z7 = z;
        return pnlHubTopAppBarState.copy(immutableList, pnlHubAssetClass, z7, z2, countryCode2, z5, z6);
    }

    public final ImmutableList<PnlHubAssetClass> component1() {
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
    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final CountryCode getLocality() {
        return this.locality;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowCryptoFilterTooltip() {
        return this.showCryptoFilterTooltip;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsCryptoPnlHubEnabled() {
        return this.isCryptoPnlHubEnabled;
    }

    public final PnlHubTopAppBarState copy(ImmutableList<? extends PnlHubAssetClass> availableAssetClasses, PnlHubAssetClass selectedAssetClass, boolean optionsSupported, boolean pnlUpdatesEnabled, CountryCode locality, boolean showCryptoFilterTooltip, boolean isCryptoPnlHubEnabled) {
        Intrinsics.checkNotNullParameter(availableAssetClasses, "availableAssetClasses");
        Intrinsics.checkNotNullParameter(selectedAssetClass, "selectedAssetClass");
        Intrinsics.checkNotNullParameter(locality, "locality");
        return new PnlHubTopAppBarState(availableAssetClasses, selectedAssetClass, optionsSupported, pnlUpdatesEnabled, locality, showCryptoFilterTooltip, isCryptoPnlHubEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PnlHubTopAppBarState)) {
            return false;
        }
        PnlHubTopAppBarState pnlHubTopAppBarState = (PnlHubTopAppBarState) other;
        return Intrinsics.areEqual(this.availableAssetClasses, pnlHubTopAppBarState.availableAssetClasses) && this.selectedAssetClass == pnlHubTopAppBarState.selectedAssetClass && this.optionsSupported == pnlHubTopAppBarState.optionsSupported && this.pnlUpdatesEnabled == pnlHubTopAppBarState.pnlUpdatesEnabled && Intrinsics.areEqual(this.locality, pnlHubTopAppBarState.locality) && this.showCryptoFilterTooltip == pnlHubTopAppBarState.showCryptoFilterTooltip && this.isCryptoPnlHubEnabled == pnlHubTopAppBarState.isCryptoPnlHubEnabled;
    }

    public int hashCode() {
        return (((((((((((this.availableAssetClasses.hashCode() * 31) + this.selectedAssetClass.hashCode()) * 31) + Boolean.hashCode(this.optionsSupported)) * 31) + Boolean.hashCode(this.pnlUpdatesEnabled)) * 31) + this.locality.hashCode()) * 31) + Boolean.hashCode(this.showCryptoFilterTooltip)) * 31) + Boolean.hashCode(this.isCryptoPnlHubEnabled);
    }

    public String toString() {
        return "PnlHubTopAppBarState(availableAssetClasses=" + this.availableAssetClasses + ", selectedAssetClass=" + this.selectedAssetClass + ", optionsSupported=" + this.optionsSupported + ", pnlUpdatesEnabled=" + this.pnlUpdatesEnabled + ", locality=" + this.locality + ", showCryptoFilterTooltip=" + this.showCryptoFilterTooltip + ", isCryptoPnlHubEnabled=" + this.isCryptoPnlHubEnabled + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PnlHubTopAppBarState(ImmutableList<? extends PnlHubAssetClass> availableAssetClasses, PnlHubAssetClass selectedAssetClass, boolean z, boolean z2, CountryCode locality, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(availableAssetClasses, "availableAssetClasses");
        Intrinsics.checkNotNullParameter(selectedAssetClass, "selectedAssetClass");
        Intrinsics.checkNotNullParameter(locality, "locality");
        this.availableAssetClasses = availableAssetClasses;
        this.selectedAssetClass = selectedAssetClass;
        this.optionsSupported = z;
        this.pnlUpdatesEnabled = z2;
        this.locality = locality;
        this.showCryptoFilterTooltip = z3;
        this.isCryptoPnlHubEnabled = z4;
    }

    public final ImmutableList<PnlHubAssetClass> getAvailableAssetClasses() {
        return this.availableAssetClasses;
    }

    public final PnlHubAssetClass getSelectedAssetClass() {
        return this.selectedAssetClass;
    }

    public final boolean getOptionsSupported() {
        return this.optionsSupported;
    }

    public final boolean getPnlUpdatesEnabled() {
        return this.pnlUpdatesEnabled;
    }

    public final CountryCode getLocality() {
        return this.locality;
    }

    public final boolean getShowCryptoFilterTooltip() {
        return this.showCryptoFilterTooltip;
    }

    public final boolean isCryptoPnlHubEnabled() {
        return this.isCryptoPnlHubEnabled;
    }
}
