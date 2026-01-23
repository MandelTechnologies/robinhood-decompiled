package com.robinhood.android.optionschain.bottomsheet;

import com.robinhood.android.common.options.OptionDefaultPricingState;
import com.robinhood.android.common.options.OptionPrices;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle3;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.rosetta.eventlogging.Screen;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionChainBottomSheetDataState.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010?\u001a\u00020\tHÆ\u0003J\t\u0010@\u001a\u00020\tHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0015\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012HÆ\u0003J\t\u0010E\u001a\u00020\u0016HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u009b\u0001\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÆ\u0001J\u0013\u0010I\u001a\u00020\t2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020LHÖ\u0001J\t\u0010M\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u00104\u001a\u0004\u0018\u000105¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u00108\u001a\u0004\u0018\u000109¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetDataState;", "", "account", "Lcom/robinhood/models/db/Account;", "accountNumber", "", "defaultPricingState", "Lcom/robinhood/android/common/options/OptionDefaultPricingState;", "hasExpandedBottomSheet", "", "hasPosition", "pnlChartType", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "optionOrderIntentKey", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "optionOrderStrategyBundle", "Lcom/robinhood/android/optionschain/bottomsheet/OptionOrderStrategyBundle;", "quotes", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "watchlistItem", "Lcom/robinhood/models/db/CuratedListItem;", "<init>", "(Lcom/robinhood/models/db/Account;Ljava/lang/String;Lcom/robinhood/android/common/options/OptionDefaultPricingState;ZZLcom/robinhood/models/ui/OptionChainSettingsPnlChartType;Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;Lcom/robinhood/android/optionschain/bottomsheet/OptionOrderStrategyBundle;Ljava/util/Map;Lcom/robinhood/rosetta/eventlogging/Screen$Name;Lcom/robinhood/models/ui/UnderlyingQuote;Lcom/robinhood/models/db/CuratedListItem;)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getAccountNumber", "()Ljava/lang/String;", "getDefaultPricingState", "()Lcom/robinhood/android/common/options/OptionDefaultPricingState;", "getHasExpandedBottomSheet", "()Z", "getHasPosition", "getPnlChartType", "()Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "getOptionOrderIntentKey", "()Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "getOptionOrderStrategyBundle", "()Lcom/robinhood/android/optionschain/bottomsheet/OptionOrderStrategyBundle;", "getQuotes", "()Ljava/util/Map;", "getScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getUnderlyingQuote", "()Lcom/robinhood/models/ui/UnderlyingQuote;", "getWatchlistItem", "()Lcom/robinhood/models/db/CuratedListItem;", "optionOrderBundle", "Lcom/robinhood/models/ui/OptionOrderBundle;", "getOptionOrderBundle", "()Lcom/robinhood/models/ui/OptionOrderBundle;", "orderPrice", "Ljava/math/BigDecimal;", "getOrderPrice", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionChainBottomSheetDataState {
    public static final int $stable = 8;
    private final Account account;
    private final String accountNumber;
    private final OptionDefaultPricingState defaultPricingState;
    private final boolean hasExpandedBottomSheet;
    private final boolean hasPosition;
    private final OptionOrderBundle optionOrderBundle;
    private final OptionOrderIntentKey.FromOptionOrderBundle optionOrderIntentKey;
    private final OptionOrderStrategyBundle optionOrderStrategyBundle;
    private final BigDecimal orderPrice;
    private final OptionChainSettingsPnlChartType pnlChartType;
    private final Map<UUID, OptionInstrumentQuote> quotes;
    private final Screen.Name screenName;
    private final UnderlyingQuote underlyingQuote;
    private final CuratedListItem watchlistItem;

    public static /* synthetic */ OptionChainBottomSheetDataState copy$default(OptionChainBottomSheetDataState optionChainBottomSheetDataState, Account account, String str, OptionDefaultPricingState optionDefaultPricingState, boolean z, boolean z2, OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, OptionOrderStrategyBundle optionOrderStrategyBundle, Map map, Screen.Name name, UnderlyingQuote underlyingQuote, CuratedListItem curatedListItem, int i, Object obj) {
        if ((i & 1) != 0) {
            account = optionChainBottomSheetDataState.account;
        }
        if ((i & 2) != 0) {
            str = optionChainBottomSheetDataState.accountNumber;
        }
        if ((i & 4) != 0) {
            optionDefaultPricingState = optionChainBottomSheetDataState.defaultPricingState;
        }
        if ((i & 8) != 0) {
            z = optionChainBottomSheetDataState.hasExpandedBottomSheet;
        }
        if ((i & 16) != 0) {
            z2 = optionChainBottomSheetDataState.hasPosition;
        }
        if ((i & 32) != 0) {
            optionChainSettingsPnlChartType = optionChainBottomSheetDataState.pnlChartType;
        }
        if ((i & 64) != 0) {
            fromOptionOrderBundle = optionChainBottomSheetDataState.optionOrderIntentKey;
        }
        if ((i & 128) != 0) {
            optionOrderStrategyBundle = optionChainBottomSheetDataState.optionOrderStrategyBundle;
        }
        if ((i & 256) != 0) {
            map = optionChainBottomSheetDataState.quotes;
        }
        if ((i & 512) != 0) {
            name = optionChainBottomSheetDataState.screenName;
        }
        if ((i & 1024) != 0) {
            underlyingQuote = optionChainBottomSheetDataState.underlyingQuote;
        }
        if ((i & 2048) != 0) {
            curatedListItem = optionChainBottomSheetDataState.watchlistItem;
        }
        UnderlyingQuote underlyingQuote2 = underlyingQuote;
        CuratedListItem curatedListItem2 = curatedListItem;
        Map map2 = map;
        Screen.Name name2 = name;
        OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle2 = fromOptionOrderBundle;
        OptionOrderStrategyBundle optionOrderStrategyBundle2 = optionOrderStrategyBundle;
        boolean z3 = z2;
        OptionChainSettingsPnlChartType optionChainSettingsPnlChartType2 = optionChainSettingsPnlChartType;
        return optionChainBottomSheetDataState.copy(account, str, optionDefaultPricingState, z, z3, optionChainSettingsPnlChartType2, fromOptionOrderBundle2, optionOrderStrategyBundle2, map2, name2, underlyingQuote2, curatedListItem2);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component10, reason: from getter */
    public final Screen.Name getScreenName() {
        return this.screenName;
    }

    /* renamed from: component11, reason: from getter */
    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    /* renamed from: component12, reason: from getter */
    public final CuratedListItem getWatchlistItem() {
        return this.watchlistItem;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionDefaultPricingState getDefaultPricingState() {
        return this.defaultPricingState;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasExpandedBottomSheet() {
        return this.hasExpandedBottomSheet;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasPosition() {
        return this.hasPosition;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionChainSettingsPnlChartType getPnlChartType() {
        return this.pnlChartType;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionOrderIntentKey.FromOptionOrderBundle getOptionOrderIntentKey() {
        return this.optionOrderIntentKey;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionOrderStrategyBundle getOptionOrderStrategyBundle() {
        return this.optionOrderStrategyBundle;
    }

    public final Map<UUID, OptionInstrumentQuote> component9() {
        return this.quotes;
    }

    public final OptionChainBottomSheetDataState copy(Account account, String accountNumber, OptionDefaultPricingState defaultPricingState, boolean hasExpandedBottomSheet, boolean hasPosition, OptionChainSettingsPnlChartType pnlChartType, OptionOrderIntentKey.FromOptionOrderBundle optionOrderIntentKey, OptionOrderStrategyBundle optionOrderStrategyBundle, Map<UUID, OptionInstrumentQuote> quotes, Screen.Name screenName, UnderlyingQuote underlyingQuote, CuratedListItem watchlistItem) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        return new OptionChainBottomSheetDataState(account, accountNumber, defaultPricingState, hasExpandedBottomSheet, hasPosition, pnlChartType, optionOrderIntentKey, optionOrderStrategyBundle, quotes, screenName, underlyingQuote, watchlistItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainBottomSheetDataState)) {
            return false;
        }
        OptionChainBottomSheetDataState optionChainBottomSheetDataState = (OptionChainBottomSheetDataState) other;
        return Intrinsics.areEqual(this.account, optionChainBottomSheetDataState.account) && Intrinsics.areEqual(this.accountNumber, optionChainBottomSheetDataState.accountNumber) && this.defaultPricingState == optionChainBottomSheetDataState.defaultPricingState && this.hasExpandedBottomSheet == optionChainBottomSheetDataState.hasExpandedBottomSheet && this.hasPosition == optionChainBottomSheetDataState.hasPosition && this.pnlChartType == optionChainBottomSheetDataState.pnlChartType && Intrinsics.areEqual(this.optionOrderIntentKey, optionChainBottomSheetDataState.optionOrderIntentKey) && Intrinsics.areEqual(this.optionOrderStrategyBundle, optionChainBottomSheetDataState.optionOrderStrategyBundle) && Intrinsics.areEqual(this.quotes, optionChainBottomSheetDataState.quotes) && this.screenName == optionChainBottomSheetDataState.screenName && Intrinsics.areEqual(this.underlyingQuote, optionChainBottomSheetDataState.underlyingQuote) && Intrinsics.areEqual(this.watchlistItem, optionChainBottomSheetDataState.watchlistItem);
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (((account == null ? 0 : account.hashCode()) * 31) + this.accountNumber.hashCode()) * 31;
        OptionDefaultPricingState optionDefaultPricingState = this.defaultPricingState;
        int iHashCode2 = (((((iHashCode + (optionDefaultPricingState == null ? 0 : optionDefaultPricingState.hashCode())) * 31) + Boolean.hashCode(this.hasExpandedBottomSheet)) * 31) + Boolean.hashCode(this.hasPosition)) * 31;
        OptionChainSettingsPnlChartType optionChainSettingsPnlChartType = this.pnlChartType;
        int iHashCode3 = (iHashCode2 + (optionChainSettingsPnlChartType == null ? 0 : optionChainSettingsPnlChartType.hashCode())) * 31;
        OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle = this.optionOrderIntentKey;
        int iHashCode4 = (iHashCode3 + (fromOptionOrderBundle == null ? 0 : fromOptionOrderBundle.hashCode())) * 31;
        OptionOrderStrategyBundle optionOrderStrategyBundle = this.optionOrderStrategyBundle;
        int iHashCode5 = (((((iHashCode4 + (optionOrderStrategyBundle == null ? 0 : optionOrderStrategyBundle.hashCode())) * 31) + this.quotes.hashCode()) * 31) + this.screenName.hashCode()) * 31;
        UnderlyingQuote underlyingQuote = this.underlyingQuote;
        int iHashCode6 = (iHashCode5 + (underlyingQuote == null ? 0 : underlyingQuote.hashCode())) * 31;
        CuratedListItem curatedListItem = this.watchlistItem;
        return iHashCode6 + (curatedListItem != null ? curatedListItem.hashCode() : 0);
    }

    public String toString() {
        return "OptionChainBottomSheetDataState(account=" + this.account + ", accountNumber=" + this.accountNumber + ", defaultPricingState=" + this.defaultPricingState + ", hasExpandedBottomSheet=" + this.hasExpandedBottomSheet + ", hasPosition=" + this.hasPosition + ", pnlChartType=" + this.pnlChartType + ", optionOrderIntentKey=" + this.optionOrderIntentKey + ", optionOrderStrategyBundle=" + this.optionOrderStrategyBundle + ", quotes=" + this.quotes + ", screenName=" + this.screenName + ", underlyingQuote=" + this.underlyingQuote + ", watchlistItem=" + this.watchlistItem + ")";
    }

    public OptionChainBottomSheetDataState(Account account, String accountNumber, OptionDefaultPricingState optionDefaultPricingState, boolean z, boolean z2, OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, OptionOrderStrategyBundle optionOrderStrategyBundle, Map<UUID, OptionInstrumentQuote> quotes, Screen.Name screenName, UnderlyingQuote underlyingQuote, CuratedListItem curatedListItem) {
        ImmutableList<OptionLegBundle> legBundles;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        this.account = account;
        this.accountNumber = accountNumber;
        this.defaultPricingState = optionDefaultPricingState;
        this.hasExpandedBottomSheet = z;
        this.hasPosition = z2;
        this.pnlChartType = optionChainSettingsPnlChartType;
        this.optionOrderIntentKey = fromOptionOrderBundle;
        this.optionOrderStrategyBundle = optionOrderStrategyBundle;
        this.quotes = quotes;
        this.screenName = screenName;
        this.underlyingQuote = underlyingQuote;
        this.watchlistItem = curatedListItem;
        OptionOrderBundle optionOrderBundle = fromOptionOrderBundle != null ? fromOptionOrderBundle.getOptionOrderBundle() : null;
        this.optionOrderBundle = optionOrderBundle;
        this.orderPrice = OptionPrices.getOptionStrategyPrice((optionOrderBundle == null || (legBundles = optionOrderBundle.getLegBundles()) == null) ? null : OptionSimulatedChartBundle3.toOptionSimulatedChartLegBundles(legBundles), quotes, optionDefaultPricingState != null ? optionDefaultPricingState.getOverallDefaultPricingType() : null);
    }

    public final Account getAccount() {
        return this.account;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final OptionDefaultPricingState getDefaultPricingState() {
        return this.defaultPricingState;
    }

    public final boolean getHasExpandedBottomSheet() {
        return this.hasExpandedBottomSheet;
    }

    public final boolean getHasPosition() {
        return this.hasPosition;
    }

    public final OptionChainSettingsPnlChartType getPnlChartType() {
        return this.pnlChartType;
    }

    public final OptionOrderIntentKey.FromOptionOrderBundle getOptionOrderIntentKey() {
        return this.optionOrderIntentKey;
    }

    public final OptionOrderStrategyBundle getOptionOrderStrategyBundle() {
        return this.optionOrderStrategyBundle;
    }

    public /* synthetic */ OptionChainBottomSheetDataState(Account account, String str, OptionDefaultPricingState optionDefaultPricingState, boolean z, boolean z2, OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, OptionOrderIntentKey.FromOptionOrderBundle fromOptionOrderBundle, OptionOrderStrategyBundle optionOrderStrategyBundle, Map map, Screen.Name name, UnderlyingQuote underlyingQuote, CuratedListItem curatedListItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : account, str, (i & 4) != 0 ? null : optionDefaultPricingState, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : optionChainSettingsPnlChartType, (i & 64) != 0 ? null : fromOptionOrderBundle, (i & 128) != 0 ? null : optionOrderStrategyBundle, (i & 256) != 0 ? MapsKt.emptyMap() : map, name, (i & 1024) != 0 ? null : underlyingQuote, (i & 2048) != 0 ? null : curatedListItem);
    }

    public final Map<UUID, OptionInstrumentQuote> getQuotes() {
        return this.quotes;
    }

    public final Screen.Name getScreenName() {
        return this.screenName;
    }

    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    public final CuratedListItem getWatchlistItem() {
        return this.watchlistItem;
    }

    public final OptionOrderBundle getOptionOrderBundle() {
        return this.optionOrderBundle;
    }

    public final BigDecimal getOrderPrice() {
        return this.orderPrice;
    }
}
