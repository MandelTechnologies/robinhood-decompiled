package com.robinhood.android.crypto.tab.p093ui.discover;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType;
import com.robinhood.models.serverdriven.experimental.api.InstrumentListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoHomeDiscoverViewState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003Je\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0015¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/discover/CryptoHomeDiscoverViewState;", "", "activeInstrumentDisplayType", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "chipsEnabled", "", "instruments", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentListItem;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "isNonTradableButtonSelected", "isTradableButtonSelected", "listKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "showAllEnabled", "isLoading", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;ZLkotlinx/collections/immutable/ImmutableList;ZZLcom/robinhood/android/navigation/keys/FragmentKey;ZZ)V", "getActiveInstrumentDisplayType", "()Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "getChipsEnabled", "()Z", "getInstruments", "()Lkotlinx/collections/immutable/ImmutableList;", "getListKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "getShowAllEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeDiscoverViewState {
    public static final int $stable = 8;
    private final InstrumentDisplayType activeInstrumentDisplayType;
    private final boolean chipsEnabled;
    private final ImmutableList<InstrumentListItem<GenericAction>> instruments;
    private final boolean isLoading;
    private final boolean isNonTradableButtonSelected;
    private final boolean isTradableButtonSelected;
    private final FragmentKey listKey;
    private final boolean showAllEnabled;

    public static /* synthetic */ CryptoHomeDiscoverViewState copy$default(CryptoHomeDiscoverViewState cryptoHomeDiscoverViewState, InstrumentDisplayType instrumentDisplayType, boolean z, ImmutableList immutableList, boolean z2, boolean z3, FragmentKey fragmentKey, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            instrumentDisplayType = cryptoHomeDiscoverViewState.activeInstrumentDisplayType;
        }
        if ((i & 2) != 0) {
            z = cryptoHomeDiscoverViewState.chipsEnabled;
        }
        if ((i & 4) != 0) {
            immutableList = cryptoHomeDiscoverViewState.instruments;
        }
        if ((i & 8) != 0) {
            z2 = cryptoHomeDiscoverViewState.isNonTradableButtonSelected;
        }
        if ((i & 16) != 0) {
            z3 = cryptoHomeDiscoverViewState.isTradableButtonSelected;
        }
        if ((i & 32) != 0) {
            fragmentKey = cryptoHomeDiscoverViewState.listKey;
        }
        if ((i & 64) != 0) {
            z4 = cryptoHomeDiscoverViewState.showAllEnabled;
        }
        if ((i & 128) != 0) {
            z5 = cryptoHomeDiscoverViewState.isLoading;
        }
        boolean z6 = z4;
        boolean z7 = z5;
        boolean z8 = z3;
        FragmentKey fragmentKey2 = fragmentKey;
        return cryptoHomeDiscoverViewState.copy(instrumentDisplayType, z, immutableList, z2, z8, fragmentKey2, z6, z7);
    }

    /* renamed from: component1, reason: from getter */
    public final InstrumentDisplayType getActiveInstrumentDisplayType() {
        return this.activeInstrumentDisplayType;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getChipsEnabled() {
        return this.chipsEnabled;
    }

    public final ImmutableList<InstrumentListItem<GenericAction>> component3() {
        return this.instruments;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsNonTradableButtonSelected() {
        return this.isNonTradableButtonSelected;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsTradableButtonSelected() {
        return this.isTradableButtonSelected;
    }

    /* renamed from: component6, reason: from getter */
    public final FragmentKey getListKey() {
        return this.listKey;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowAllEnabled() {
        return this.showAllEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final CryptoHomeDiscoverViewState copy(InstrumentDisplayType activeInstrumentDisplayType, boolean chipsEnabled, ImmutableList<? extends InstrumentListItem<? extends GenericAction>> instruments, boolean isNonTradableButtonSelected, boolean isTradableButtonSelected, FragmentKey listKey, boolean showAllEnabled, boolean isLoading) {
        Intrinsics.checkNotNullParameter(activeInstrumentDisplayType, "activeInstrumentDisplayType");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        Intrinsics.checkNotNullParameter(listKey, "listKey");
        return new CryptoHomeDiscoverViewState(activeInstrumentDisplayType, chipsEnabled, instruments, isNonTradableButtonSelected, isTradableButtonSelected, listKey, showAllEnabled, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHomeDiscoverViewState)) {
            return false;
        }
        CryptoHomeDiscoverViewState cryptoHomeDiscoverViewState = (CryptoHomeDiscoverViewState) other;
        return this.activeInstrumentDisplayType == cryptoHomeDiscoverViewState.activeInstrumentDisplayType && this.chipsEnabled == cryptoHomeDiscoverViewState.chipsEnabled && Intrinsics.areEqual(this.instruments, cryptoHomeDiscoverViewState.instruments) && this.isNonTradableButtonSelected == cryptoHomeDiscoverViewState.isNonTradableButtonSelected && this.isTradableButtonSelected == cryptoHomeDiscoverViewState.isTradableButtonSelected && Intrinsics.areEqual(this.listKey, cryptoHomeDiscoverViewState.listKey) && this.showAllEnabled == cryptoHomeDiscoverViewState.showAllEnabled && this.isLoading == cryptoHomeDiscoverViewState.isLoading;
    }

    public int hashCode() {
        return (((((((((((((this.activeInstrumentDisplayType.hashCode() * 31) + Boolean.hashCode(this.chipsEnabled)) * 31) + this.instruments.hashCode()) * 31) + Boolean.hashCode(this.isNonTradableButtonSelected)) * 31) + Boolean.hashCode(this.isTradableButtonSelected)) * 31) + this.listKey.hashCode()) * 31) + Boolean.hashCode(this.showAllEnabled)) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "CryptoHomeDiscoverViewState(activeInstrumentDisplayType=" + this.activeInstrumentDisplayType + ", chipsEnabled=" + this.chipsEnabled + ", instruments=" + this.instruments + ", isNonTradableButtonSelected=" + this.isNonTradableButtonSelected + ", isTradableButtonSelected=" + this.isTradableButtonSelected + ", listKey=" + this.listKey + ", showAllEnabled=" + this.showAllEnabled + ", isLoading=" + this.isLoading + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoHomeDiscoverViewState(InstrumentDisplayType activeInstrumentDisplayType, boolean z, ImmutableList<? extends InstrumentListItem<? extends GenericAction>> instruments, boolean z2, boolean z3, FragmentKey listKey, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(activeInstrumentDisplayType, "activeInstrumentDisplayType");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        Intrinsics.checkNotNullParameter(listKey, "listKey");
        this.activeInstrumentDisplayType = activeInstrumentDisplayType;
        this.chipsEnabled = z;
        this.instruments = instruments;
        this.isNonTradableButtonSelected = z2;
        this.isTradableButtonSelected = z3;
        this.listKey = listKey;
        this.showAllEnabled = z4;
        this.isLoading = z5;
    }

    public final InstrumentDisplayType getActiveInstrumentDisplayType() {
        return this.activeInstrumentDisplayType;
    }

    public final boolean getChipsEnabled() {
        return this.chipsEnabled;
    }

    public final ImmutableList<InstrumentListItem<GenericAction>> getInstruments() {
        return this.instruments;
    }

    public final boolean isNonTradableButtonSelected() {
        return this.isNonTradableButtonSelected;
    }

    public final boolean isTradableButtonSelected() {
        return this.isTradableButtonSelected;
    }

    public final FragmentKey getListKey() {
        return this.listKey;
    }

    public final boolean getShowAllEnabled() {
        return this.showAllEnabled;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}
