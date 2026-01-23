package com.robinhood.android.acats.plaid.transfer.unsupported;

import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.EquityAsset;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.OptionAsset;
import com.robinhood.models.serverdriven.experimental.api.Money;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInPlaidUnsupportedAssetsViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003Ju\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/unsupported/AcatsInPlaidUnsupportedAssetsViewState;", "", GoldFeature.MARGIN, "Lcom/robinhood/models/serverdriven/experimental/api/Money;", "stocksAndEtfs", "", "Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/EquityAsset;", "fractionalShares", "mutualFunds", "options", "Lcom/robinhood/models/acats/db/bonfire/plaid/brokerassets/OptionAsset;", "fixedIncome", "otherEquityAsset", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Money;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getMargin", "()Lcom/robinhood/models/serverdriven/experimental/api/Money;", "getStocksAndEtfs", "()Ljava/util/List;", "getFractionalShares", "getMutualFunds", "getOptions", "getFixedIncome", "getOtherEquityAsset", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInPlaidUnsupportedAssetsViewState {
    public static final int $stable = 0;
    private final List<EquityAsset> fixedIncome;
    private final List<EquityAsset> fractionalShares;
    private final Money margin;
    private final List<EquityAsset> mutualFunds;
    private final List<OptionAsset> options;
    private final List<EquityAsset> otherEquityAsset;
    private final List<EquityAsset> stocksAndEtfs;

    public static /* synthetic */ AcatsInPlaidUnsupportedAssetsViewState copy$default(AcatsInPlaidUnsupportedAssetsViewState acatsInPlaidUnsupportedAssetsViewState, Money money, List list, List list2, List list3, List list4, List list5, List list6, int i, Object obj) {
        if ((i & 1) != 0) {
            money = acatsInPlaidUnsupportedAssetsViewState.margin;
        }
        if ((i & 2) != 0) {
            list = acatsInPlaidUnsupportedAssetsViewState.stocksAndEtfs;
        }
        if ((i & 4) != 0) {
            list2 = acatsInPlaidUnsupportedAssetsViewState.fractionalShares;
        }
        if ((i & 8) != 0) {
            list3 = acatsInPlaidUnsupportedAssetsViewState.mutualFunds;
        }
        if ((i & 16) != 0) {
            list4 = acatsInPlaidUnsupportedAssetsViewState.options;
        }
        if ((i & 32) != 0) {
            list5 = acatsInPlaidUnsupportedAssetsViewState.fixedIncome;
        }
        if ((i & 64) != 0) {
            list6 = acatsInPlaidUnsupportedAssetsViewState.otherEquityAsset;
        }
        List list7 = list5;
        List list8 = list6;
        List list9 = list4;
        List list10 = list2;
        return acatsInPlaidUnsupportedAssetsViewState.copy(money, list, list10, list3, list9, list7, list8);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getMargin() {
        return this.margin;
    }

    public final List<EquityAsset> component2() {
        return this.stocksAndEtfs;
    }

    public final List<EquityAsset> component3() {
        return this.fractionalShares;
    }

    public final List<EquityAsset> component4() {
        return this.mutualFunds;
    }

    public final List<OptionAsset> component5() {
        return this.options;
    }

    public final List<EquityAsset> component6() {
        return this.fixedIncome;
    }

    public final List<EquityAsset> component7() {
        return this.otherEquityAsset;
    }

    public final AcatsInPlaidUnsupportedAssetsViewState copy(Money margin, List<EquityAsset> stocksAndEtfs, List<EquityAsset> fractionalShares, List<EquityAsset> mutualFunds, List<OptionAsset> options, List<EquityAsset> fixedIncome, List<EquityAsset> otherEquityAsset) {
        Intrinsics.checkNotNullParameter(stocksAndEtfs, "stocksAndEtfs");
        Intrinsics.checkNotNullParameter(fractionalShares, "fractionalShares");
        Intrinsics.checkNotNullParameter(mutualFunds, "mutualFunds");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(fixedIncome, "fixedIncome");
        Intrinsics.checkNotNullParameter(otherEquityAsset, "otherEquityAsset");
        return new AcatsInPlaidUnsupportedAssetsViewState(margin, stocksAndEtfs, fractionalShares, mutualFunds, options, fixedIncome, otherEquityAsset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInPlaidUnsupportedAssetsViewState)) {
            return false;
        }
        AcatsInPlaidUnsupportedAssetsViewState acatsInPlaidUnsupportedAssetsViewState = (AcatsInPlaidUnsupportedAssetsViewState) other;
        return Intrinsics.areEqual(this.margin, acatsInPlaidUnsupportedAssetsViewState.margin) && Intrinsics.areEqual(this.stocksAndEtfs, acatsInPlaidUnsupportedAssetsViewState.stocksAndEtfs) && Intrinsics.areEqual(this.fractionalShares, acatsInPlaidUnsupportedAssetsViewState.fractionalShares) && Intrinsics.areEqual(this.mutualFunds, acatsInPlaidUnsupportedAssetsViewState.mutualFunds) && Intrinsics.areEqual(this.options, acatsInPlaidUnsupportedAssetsViewState.options) && Intrinsics.areEqual(this.fixedIncome, acatsInPlaidUnsupportedAssetsViewState.fixedIncome) && Intrinsics.areEqual(this.otherEquityAsset, acatsInPlaidUnsupportedAssetsViewState.otherEquityAsset);
    }

    public int hashCode() {
        Money money = this.margin;
        return ((((((((((((money == null ? 0 : money.hashCode()) * 31) + this.stocksAndEtfs.hashCode()) * 31) + this.fractionalShares.hashCode()) * 31) + this.mutualFunds.hashCode()) * 31) + this.options.hashCode()) * 31) + this.fixedIncome.hashCode()) * 31) + this.otherEquityAsset.hashCode();
    }

    public String toString() {
        return "AcatsInPlaidUnsupportedAssetsViewState(margin=" + this.margin + ", stocksAndEtfs=" + this.stocksAndEtfs + ", fractionalShares=" + this.fractionalShares + ", mutualFunds=" + this.mutualFunds + ", options=" + this.options + ", fixedIncome=" + this.fixedIncome + ", otherEquityAsset=" + this.otherEquityAsset + ")";
    }

    public AcatsInPlaidUnsupportedAssetsViewState(Money money, List<EquityAsset> stocksAndEtfs, List<EquityAsset> fractionalShares, List<EquityAsset> mutualFunds, List<OptionAsset> options, List<EquityAsset> fixedIncome, List<EquityAsset> otherEquityAsset) {
        Intrinsics.checkNotNullParameter(stocksAndEtfs, "stocksAndEtfs");
        Intrinsics.checkNotNullParameter(fractionalShares, "fractionalShares");
        Intrinsics.checkNotNullParameter(mutualFunds, "mutualFunds");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(fixedIncome, "fixedIncome");
        Intrinsics.checkNotNullParameter(otherEquityAsset, "otherEquityAsset");
        this.margin = money;
        this.stocksAndEtfs = stocksAndEtfs;
        this.fractionalShares = fractionalShares;
        this.mutualFunds = mutualFunds;
        this.options = options;
        this.fixedIncome = fixedIncome;
        this.otherEquityAsset = otherEquityAsset;
    }

    public final Money getMargin() {
        return this.margin;
    }

    public final List<EquityAsset> getStocksAndEtfs() {
        return this.stocksAndEtfs;
    }

    public final List<EquityAsset> getFractionalShares() {
        return this.fractionalShares;
    }

    public final List<EquityAsset> getMutualFunds() {
        return this.mutualFunds;
    }

    public final List<OptionAsset> getOptions() {
        return this.options;
    }

    public final List<EquityAsset> getFixedIncome() {
        return this.fixedIncome;
    }

    public final List<EquityAsset> getOtherEquityAsset() {
        return this.otherEquityAsset;
    }
}
