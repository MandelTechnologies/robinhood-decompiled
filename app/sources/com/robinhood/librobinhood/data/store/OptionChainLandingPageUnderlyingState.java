package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainLandingStore.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionChainLandingPageUnderlyingState;", "", "currentOrNextMarketDates", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "optionChainPageStates", "", "Lcom/robinhood/librobinhood/data/store/OptionChainPageState;", "isTradeOnExpirationEnabled", "", "isIndexOptionsExtendedHoursEnabled", "<init>", "(Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Ljava/util/List;ZZ)V", "getCurrentOrNextMarketDates", "()Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "getOptionChainPageStates", "()Ljava/util/List;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OptionChainLandingPageUnderlyingState {
    private final OptionCurrentOrNextMarketDates currentOrNextMarketDates;
    private final boolean isIndexOptionsExtendedHoursEnabled;
    private final boolean isTradeOnExpirationEnabled;
    private final List<OptionChainPageState> optionChainPageStates;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionChainLandingPageUnderlyingState copy$default(OptionChainLandingPageUnderlyingState optionChainLandingPageUnderlyingState, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            optionCurrentOrNextMarketDates = optionChainLandingPageUnderlyingState.currentOrNextMarketDates;
        }
        if ((i & 2) != 0) {
            list = optionChainLandingPageUnderlyingState.optionChainPageStates;
        }
        if ((i & 4) != 0) {
            z = optionChainLandingPageUnderlyingState.isTradeOnExpirationEnabled;
        }
        if ((i & 8) != 0) {
            z2 = optionChainLandingPageUnderlyingState.isIndexOptionsExtendedHoursEnabled;
        }
        return optionChainLandingPageUnderlyingState.copy(optionCurrentOrNextMarketDates, list, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    public final List<OptionChainPageState> component2() {
        return this.optionChainPageStates;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsTradeOnExpirationEnabled() {
        return this.isTradeOnExpirationEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsIndexOptionsExtendedHoursEnabled() {
        return this.isIndexOptionsExtendedHoursEnabled;
    }

    public final OptionChainLandingPageUnderlyingState copy(OptionCurrentOrNextMarketDates currentOrNextMarketDates, List<OptionChainPageState> optionChainPageStates, boolean isTradeOnExpirationEnabled, boolean isIndexOptionsExtendedHoursEnabled) {
        Intrinsics.checkNotNullParameter(optionChainPageStates, "optionChainPageStates");
        return new OptionChainLandingPageUnderlyingState(currentOrNextMarketDates, optionChainPageStates, isTradeOnExpirationEnabled, isIndexOptionsExtendedHoursEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainLandingPageUnderlyingState)) {
            return false;
        }
        OptionChainLandingPageUnderlyingState optionChainLandingPageUnderlyingState = (OptionChainLandingPageUnderlyingState) other;
        return Intrinsics.areEqual(this.currentOrNextMarketDates, optionChainLandingPageUnderlyingState.currentOrNextMarketDates) && Intrinsics.areEqual(this.optionChainPageStates, optionChainLandingPageUnderlyingState.optionChainPageStates) && this.isTradeOnExpirationEnabled == optionChainLandingPageUnderlyingState.isTradeOnExpirationEnabled && this.isIndexOptionsExtendedHoursEnabled == optionChainLandingPageUnderlyingState.isIndexOptionsExtendedHoursEnabled;
    }

    public int hashCode() {
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates = this.currentOrNextMarketDates;
        return ((((((optionCurrentOrNextMarketDates == null ? 0 : optionCurrentOrNextMarketDates.hashCode()) * 31) + this.optionChainPageStates.hashCode()) * 31) + Boolean.hashCode(this.isTradeOnExpirationEnabled)) * 31) + Boolean.hashCode(this.isIndexOptionsExtendedHoursEnabled);
    }

    public String toString() {
        return "OptionChainLandingPageUnderlyingState(currentOrNextMarketDates=" + this.currentOrNextMarketDates + ", optionChainPageStates=" + this.optionChainPageStates + ", isTradeOnExpirationEnabled=" + this.isTradeOnExpirationEnabled + ", isIndexOptionsExtendedHoursEnabled=" + this.isIndexOptionsExtendedHoursEnabled + ")";
    }

    public OptionChainLandingPageUnderlyingState(OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, List<OptionChainPageState> optionChainPageStates, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(optionChainPageStates, "optionChainPageStates");
        this.currentOrNextMarketDates = optionCurrentOrNextMarketDates;
        this.optionChainPageStates = optionChainPageStates;
        this.isTradeOnExpirationEnabled = z;
        this.isIndexOptionsExtendedHoursEnabled = z2;
    }

    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    public final List<OptionChainPageState> getOptionChainPageStates() {
        return this.optionChainPageStates;
    }

    public final boolean isTradeOnExpirationEnabled() {
        return this.isTradeOnExpirationEnabled;
    }

    public final boolean isIndexOptionsExtendedHoursEnabled() {
        return this.isIndexOptionsExtendedHoursEnabled;
    }
}
