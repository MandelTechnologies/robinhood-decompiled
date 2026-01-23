package com.robinhood.android.options.statistics;

import com.robinhood.android.options.contracts.OptionStatisticsLaunchMode;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionStatisticsTradableState;
import com.robinhood.models.p355ui.OptionWatchlistItemState;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionInstrument;
import com.robinhood.models.p355ui.UiOptionUnderlier;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionStatisticsDataState.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%\u0012\b\b\u0002\u0010'\u001a\u00020\n¢\u0006\u0004\b(\u0010)J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010R\u001a\u00020\nHÆ\u0003J\t\u0010S\u001a\u00020\nHÆ\u0003J\t\u0010T\u001a\u00020\nHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u000fHÆ\u0003J\t\u0010W\u001a\u00020\u0011HÆ\u0003J\t\u0010X\u001a\u00020\u0013HÆ\u0003J\t\u0010Y\u001a\u00020\u0015HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010[\u001a\u00020\u0019HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\t\u0010^\u001a\u00020\u001fHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010!HÆ\u0003J\t\u0010`\u001a\u00020#HÆ\u0003J\u000f\u0010a\u001a\b\u0012\u0004\u0012\u00020&0%HÆ\u0003J\t\u0010b\u001a\u00020\nHÆ\u0003Jó\u0001\u0010c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\b\b\u0002\u0010'\u001a\u00020\nHÆ\u0001J\u0013\u0010d\u001a\u00020\n2\b\u0010e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010f\u001a\u00020gHÖ\u0001J\t\u0010h\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b4\u00102R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010-R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010'\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b'\u00102¨\u0006i"}, m3636d2 = {"Lcom/robinhood/android/options/statistics/OptionStatisticsDataState;", "", "account", "Lcom/robinhood/models/db/Account;", "accountNumber", "", "defaultPricingSettingServerValue", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "defaultPriceSettingsOverride", "hasPosition", "", "shouldDefaultToSimulatedReturnTab", "shouldIgnoreDefaultPricing", "strategyCode", "legBundle", "Lcom/robinhood/models/ui/OptionLegBundle;", "launchMode", "Lcom/robinhood/android/options/contracts/OptionStatisticsLaunchMode;", "tradableState", "Lcom/robinhood/models/ui/OptionStatisticsTradableState;", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "singleUnderlyingId", "Ljava/util/UUID;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "optionInstrumentQuote", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "pnlChartType", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "watchlistItemState", "Lcom/robinhood/models/ui/OptionWatchlistItemState;", "uiOptionInstrument", "Lcom/robinhood/models/ui/UiOptionInstrument;", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "uiOptionUnderliers", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiOptionUnderlier;", "isPreTradeStatNuxDotShown", "<init>", "(Lcom/robinhood/models/db/Account;Ljava/lang/String;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;ZZZLjava/lang/String;Lcom/robinhood/models/ui/OptionLegBundle;Lcom/robinhood/android/options/contracts/OptionStatisticsLaunchMode;Lcom/robinhood/models/ui/OptionStatisticsTradableState;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Ljava/util/UUID;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/db/OptionInstrumentQuote;Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;Lcom/robinhood/models/ui/OptionWatchlistItemState;Lcom/robinhood/models/ui/UiOptionInstrument;Lcom/robinhood/models/ui/UiOptionChain;Lkotlinx/collections/immutable/ImmutableList;Z)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getAccountNumber", "()Ljava/lang/String;", "getDefaultPricingSettingServerValue", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getDefaultPriceSettingsOverride", "getHasPosition", "()Z", "getShouldDefaultToSimulatedReturnTab", "getShouldIgnoreDefaultPricing", "getStrategyCode", "getLegBundle", "()Lcom/robinhood/models/ui/OptionLegBundle;", "getLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionStatisticsLaunchMode;", "getTradableState", "()Lcom/robinhood/models/ui/OptionStatisticsTradableState;", "getUnderlyingType", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "getSingleUnderlyingId", "()Ljava/util/UUID;", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "getOptionInstrumentQuote", "()Lcom/robinhood/models/db/OptionInstrumentQuote;", "getPnlChartType", "()Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "getWatchlistItemState", "()Lcom/robinhood/models/ui/OptionWatchlistItemState;", "getUiOptionInstrument", "()Lcom/robinhood/models/ui/UiOptionInstrument;", "getUiOptionChain", "()Lcom/robinhood/models/ui/UiOptionChain;", "getUiOptionUnderliers", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-options-statistics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionStatisticsDataState {
    public static final int $stable = 8;
    private final Account account;
    private final String accountNumber;
    private final OptionSettings.DefaultPricingSetting defaultPriceSettingsOverride;
    private final OptionSettings.DefaultPricingSetting defaultPricingSettingServerValue;
    private final boolean hasPosition;
    private final boolean isPreTradeStatNuxDotShown;
    private final OptionStatisticsLaunchMode launchMode;
    private final OptionLegBundle legBundle;
    private final OptionInstrumentQuote optionInstrumentQuote;
    private final OrderSide orderSide;
    private final OptionChainSettingsPnlChartType pnlChartType;
    private final boolean shouldDefaultToSimulatedReturnTab;
    private final boolean shouldIgnoreDefaultPricing;
    private final UUID singleUnderlyingId;
    private final String strategyCode;
    private final OptionStatisticsTradableState tradableState;
    private final UiOptionChain uiOptionChain;
    private final UiOptionInstrument uiOptionInstrument;
    private final ImmutableList<UiOptionUnderlier> uiOptionUnderliers;
    private final OptionChain.UnderlyingType underlyingType;
    private final OptionWatchlistItemState watchlistItemState;

    public static /* synthetic */ OptionStatisticsDataState copy$default(OptionStatisticsDataState optionStatisticsDataState, Account account, String str, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionSettings.DefaultPricingSetting defaultPricingSetting2, boolean z, boolean z2, boolean z3, String str2, OptionLegBundle optionLegBundle, OptionStatisticsLaunchMode optionStatisticsLaunchMode, OptionStatisticsTradableState optionStatisticsTradableState, OptionChain.UnderlyingType underlyingType, UUID uuid, OrderSide orderSide, OptionInstrumentQuote optionInstrumentQuote, OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, OptionWatchlistItemState optionWatchlistItemState, UiOptionInstrument uiOptionInstrument, UiOptionChain uiOptionChain, ImmutableList immutableList, boolean z4, int i, Object obj) {
        boolean z5;
        ImmutableList immutableList2;
        Account account2 = (i & 1) != 0 ? optionStatisticsDataState.account : account;
        String str3 = (i & 2) != 0 ? optionStatisticsDataState.accountNumber : str;
        OptionSettings.DefaultPricingSetting defaultPricingSetting3 = (i & 4) != 0 ? optionStatisticsDataState.defaultPricingSettingServerValue : defaultPricingSetting;
        OptionSettings.DefaultPricingSetting defaultPricingSetting4 = (i & 8) != 0 ? optionStatisticsDataState.defaultPriceSettingsOverride : defaultPricingSetting2;
        boolean z6 = (i & 16) != 0 ? optionStatisticsDataState.hasPosition : z;
        boolean z7 = (i & 32) != 0 ? optionStatisticsDataState.shouldDefaultToSimulatedReturnTab : z2;
        boolean z8 = (i & 64) != 0 ? optionStatisticsDataState.shouldIgnoreDefaultPricing : z3;
        String str4 = (i & 128) != 0 ? optionStatisticsDataState.strategyCode : str2;
        OptionLegBundle optionLegBundle2 = (i & 256) != 0 ? optionStatisticsDataState.legBundle : optionLegBundle;
        OptionStatisticsLaunchMode optionStatisticsLaunchMode2 = (i & 512) != 0 ? optionStatisticsDataState.launchMode : optionStatisticsLaunchMode;
        OptionStatisticsTradableState optionStatisticsTradableState2 = (i & 1024) != 0 ? optionStatisticsDataState.tradableState : optionStatisticsTradableState;
        OptionChain.UnderlyingType underlyingType2 = (i & 2048) != 0 ? optionStatisticsDataState.underlyingType : underlyingType;
        UUID uuid2 = (i & 4096) != 0 ? optionStatisticsDataState.singleUnderlyingId : uuid;
        OrderSide orderSide2 = (i & 8192) != 0 ? optionStatisticsDataState.orderSide : orderSide;
        Account account3 = account2;
        OptionInstrumentQuote optionInstrumentQuote2 = (i & 16384) != 0 ? optionStatisticsDataState.optionInstrumentQuote : optionInstrumentQuote;
        OptionChainSettingsPnlChartType optionChainSettingsPnlChartType2 = (i & 32768) != 0 ? optionStatisticsDataState.pnlChartType : optionChainSettingsPnlChartType;
        OptionWatchlistItemState optionWatchlistItemState2 = (i & 65536) != 0 ? optionStatisticsDataState.watchlistItemState : optionWatchlistItemState;
        UiOptionInstrument uiOptionInstrument2 = (i & 131072) != 0 ? optionStatisticsDataState.uiOptionInstrument : uiOptionInstrument;
        UiOptionChain uiOptionChain2 = (i & 262144) != 0 ? optionStatisticsDataState.uiOptionChain : uiOptionChain;
        ImmutableList immutableList3 = (i & 524288) != 0 ? optionStatisticsDataState.uiOptionUnderliers : immutableList;
        if ((i & 1048576) != 0) {
            immutableList2 = immutableList3;
            z5 = optionStatisticsDataState.isPreTradeStatNuxDotShown;
        } else {
            z5 = z4;
            immutableList2 = immutableList3;
        }
        return optionStatisticsDataState.copy(account3, str3, defaultPricingSetting3, defaultPricingSetting4, z6, z7, z8, str4, optionLegBundle2, optionStatisticsLaunchMode2, optionStatisticsTradableState2, underlyingType2, uuid2, orderSide2, optionInstrumentQuote2, optionChainSettingsPnlChartType2, optionWatchlistItemState2, uiOptionInstrument2, uiOptionChain2, immutableList2, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component10, reason: from getter */
    public final OptionStatisticsLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component11, reason: from getter */
    public final OptionStatisticsTradableState getTradableState() {
        return this.tradableState;
    }

    /* renamed from: component12, reason: from getter */
    public final OptionChain.UnderlyingType getUnderlyingType() {
        return this.underlyingType;
    }

    /* renamed from: component13, reason: from getter */
    public final UUID getSingleUnderlyingId() {
        return this.singleUnderlyingId;
    }

    /* renamed from: component14, reason: from getter */
    public final OrderSide getOrderSide() {
        return this.orderSide;
    }

    /* renamed from: component15, reason: from getter */
    public final OptionInstrumentQuote getOptionInstrumentQuote() {
        return this.optionInstrumentQuote;
    }

    /* renamed from: component16, reason: from getter */
    public final OptionChainSettingsPnlChartType getPnlChartType() {
        return this.pnlChartType;
    }

    /* renamed from: component17, reason: from getter */
    public final OptionWatchlistItemState getWatchlistItemState() {
        return this.watchlistItemState;
    }

    /* renamed from: component18, reason: from getter */
    public final UiOptionInstrument getUiOptionInstrument() {
        return this.uiOptionInstrument;
    }

    /* renamed from: component19, reason: from getter */
    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final ImmutableList<UiOptionUnderlier> component20() {
        return this.uiOptionUnderliers;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsPreTradeStatNuxDotShown() {
        return this.isPreTradeStatNuxDotShown;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingServerValue() {
        return this.defaultPricingSettingServerValue;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionSettings.DefaultPricingSetting getDefaultPriceSettingsOverride() {
        return this.defaultPriceSettingsOverride;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasPosition() {
        return this.hasPosition;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldDefaultToSimulatedReturnTab() {
        return this.shouldDefaultToSimulatedReturnTab;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShouldIgnoreDefaultPricing() {
        return this.shouldIgnoreDefaultPricing;
    }

    /* renamed from: component8, reason: from getter */
    public final String getStrategyCode() {
        return this.strategyCode;
    }

    /* renamed from: component9, reason: from getter */
    public final OptionLegBundle getLegBundle() {
        return this.legBundle;
    }

    public final OptionStatisticsDataState copy(Account account, String accountNumber, OptionSettings.DefaultPricingSetting defaultPricingSettingServerValue, OptionSettings.DefaultPricingSetting defaultPriceSettingsOverride, boolean hasPosition, boolean shouldDefaultToSimulatedReturnTab, boolean shouldIgnoreDefaultPricing, String strategyCode, OptionLegBundle legBundle, OptionStatisticsLaunchMode launchMode, OptionStatisticsTradableState tradableState, OptionChain.UnderlyingType underlyingType, UUID singleUnderlyingId, OrderSide orderSide, OptionInstrumentQuote optionInstrumentQuote, OptionChainSettingsPnlChartType pnlChartType, OptionWatchlistItemState watchlistItemState, UiOptionInstrument uiOptionInstrument, UiOptionChain uiOptionChain, ImmutableList<UiOptionUnderlier> uiOptionUnderliers, boolean isPreTradeStatNuxDotShown) {
        Intrinsics.checkNotNullParameter(legBundle, "legBundle");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(tradableState, "tradableState");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(watchlistItemState, "watchlistItemState");
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        Intrinsics.checkNotNullParameter(uiOptionUnderliers, "uiOptionUnderliers");
        return new OptionStatisticsDataState(account, accountNumber, defaultPricingSettingServerValue, defaultPriceSettingsOverride, hasPosition, shouldDefaultToSimulatedReturnTab, shouldIgnoreDefaultPricing, strategyCode, legBundle, launchMode, tradableState, underlyingType, singleUnderlyingId, orderSide, optionInstrumentQuote, pnlChartType, watchlistItemState, uiOptionInstrument, uiOptionChain, uiOptionUnderliers, isPreTradeStatNuxDotShown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionStatisticsDataState)) {
            return false;
        }
        OptionStatisticsDataState optionStatisticsDataState = (OptionStatisticsDataState) other;
        return Intrinsics.areEqual(this.account, optionStatisticsDataState.account) && Intrinsics.areEqual(this.accountNumber, optionStatisticsDataState.accountNumber) && this.defaultPricingSettingServerValue == optionStatisticsDataState.defaultPricingSettingServerValue && this.defaultPriceSettingsOverride == optionStatisticsDataState.defaultPriceSettingsOverride && this.hasPosition == optionStatisticsDataState.hasPosition && this.shouldDefaultToSimulatedReturnTab == optionStatisticsDataState.shouldDefaultToSimulatedReturnTab && this.shouldIgnoreDefaultPricing == optionStatisticsDataState.shouldIgnoreDefaultPricing && Intrinsics.areEqual(this.strategyCode, optionStatisticsDataState.strategyCode) && Intrinsics.areEqual(this.legBundle, optionStatisticsDataState.legBundle) && this.launchMode == optionStatisticsDataState.launchMode && Intrinsics.areEqual(this.tradableState, optionStatisticsDataState.tradableState) && this.underlyingType == optionStatisticsDataState.underlyingType && Intrinsics.areEqual(this.singleUnderlyingId, optionStatisticsDataState.singleUnderlyingId) && this.orderSide == optionStatisticsDataState.orderSide && Intrinsics.areEqual(this.optionInstrumentQuote, optionStatisticsDataState.optionInstrumentQuote) && this.pnlChartType == optionStatisticsDataState.pnlChartType && this.watchlistItemState == optionStatisticsDataState.watchlistItemState && Intrinsics.areEqual(this.uiOptionInstrument, optionStatisticsDataState.uiOptionInstrument) && Intrinsics.areEqual(this.uiOptionChain, optionStatisticsDataState.uiOptionChain) && Intrinsics.areEqual(this.uiOptionUnderliers, optionStatisticsDataState.uiOptionUnderliers) && this.isPreTradeStatNuxDotShown == optionStatisticsDataState.isPreTradeStatNuxDotShown;
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        String str = this.accountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingSettingServerValue;
        int iHashCode3 = (iHashCode2 + (defaultPricingSetting == null ? 0 : defaultPricingSetting.hashCode())) * 31;
        OptionSettings.DefaultPricingSetting defaultPricingSetting2 = this.defaultPriceSettingsOverride;
        int iHashCode4 = (((((((iHashCode3 + (defaultPricingSetting2 == null ? 0 : defaultPricingSetting2.hashCode())) * 31) + Boolean.hashCode(this.hasPosition)) * 31) + Boolean.hashCode(this.shouldDefaultToSimulatedReturnTab)) * 31) + Boolean.hashCode(this.shouldIgnoreDefaultPricing)) * 31;
        String str2 = this.strategyCode;
        int iHashCode5 = (((((((((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.legBundle.hashCode()) * 31) + this.launchMode.hashCode()) * 31) + this.tradableState.hashCode()) * 31) + this.underlyingType.hashCode()) * 31;
        UUID uuid = this.singleUnderlyingId;
        int iHashCode6 = (((iHashCode5 + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.orderSide.hashCode()) * 31;
        OptionInstrumentQuote optionInstrumentQuote = this.optionInstrumentQuote;
        int iHashCode7 = (iHashCode6 + (optionInstrumentQuote == null ? 0 : optionInstrumentQuote.hashCode())) * 31;
        OptionChainSettingsPnlChartType optionChainSettingsPnlChartType = this.pnlChartType;
        int iHashCode8 = (((iHashCode7 + (optionChainSettingsPnlChartType == null ? 0 : optionChainSettingsPnlChartType.hashCode())) * 31) + this.watchlistItemState.hashCode()) * 31;
        UiOptionInstrument uiOptionInstrument = this.uiOptionInstrument;
        return ((((((iHashCode8 + (uiOptionInstrument != null ? uiOptionInstrument.hashCode() : 0)) * 31) + this.uiOptionChain.hashCode()) * 31) + this.uiOptionUnderliers.hashCode()) * 31) + Boolean.hashCode(this.isPreTradeStatNuxDotShown);
    }

    public String toString() {
        return "OptionStatisticsDataState(account=" + this.account + ", accountNumber=" + this.accountNumber + ", defaultPricingSettingServerValue=" + this.defaultPricingSettingServerValue + ", defaultPriceSettingsOverride=" + this.defaultPriceSettingsOverride + ", hasPosition=" + this.hasPosition + ", shouldDefaultToSimulatedReturnTab=" + this.shouldDefaultToSimulatedReturnTab + ", shouldIgnoreDefaultPricing=" + this.shouldIgnoreDefaultPricing + ", strategyCode=" + this.strategyCode + ", legBundle=" + this.legBundle + ", launchMode=" + this.launchMode + ", tradableState=" + this.tradableState + ", underlyingType=" + this.underlyingType + ", singleUnderlyingId=" + this.singleUnderlyingId + ", orderSide=" + this.orderSide + ", optionInstrumentQuote=" + this.optionInstrumentQuote + ", pnlChartType=" + this.pnlChartType + ", watchlistItemState=" + this.watchlistItemState + ", uiOptionInstrument=" + this.uiOptionInstrument + ", uiOptionChain=" + this.uiOptionChain + ", uiOptionUnderliers=" + this.uiOptionUnderliers + ", isPreTradeStatNuxDotShown=" + this.isPreTradeStatNuxDotShown + ")";
    }

    public OptionStatisticsDataState(Account account, String str, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionSettings.DefaultPricingSetting defaultPricingSetting2, boolean z, boolean z2, boolean z3, String str2, OptionLegBundle legBundle, OptionStatisticsLaunchMode launchMode, OptionStatisticsTradableState tradableState, OptionChain.UnderlyingType underlyingType, UUID uuid, OrderSide orderSide, OptionInstrumentQuote optionInstrumentQuote, OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, OptionWatchlistItemState watchlistItemState, UiOptionInstrument uiOptionInstrument, UiOptionChain uiOptionChain, ImmutableList<UiOptionUnderlier> uiOptionUnderliers, boolean z4) {
        Intrinsics.checkNotNullParameter(legBundle, "legBundle");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(tradableState, "tradableState");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(watchlistItemState, "watchlistItemState");
        Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
        Intrinsics.checkNotNullParameter(uiOptionUnderliers, "uiOptionUnderliers");
        this.account = account;
        this.accountNumber = str;
        this.defaultPricingSettingServerValue = defaultPricingSetting;
        this.defaultPriceSettingsOverride = defaultPricingSetting2;
        this.hasPosition = z;
        this.shouldDefaultToSimulatedReturnTab = z2;
        this.shouldIgnoreDefaultPricing = z3;
        this.strategyCode = str2;
        this.legBundle = legBundle;
        this.launchMode = launchMode;
        this.tradableState = tradableState;
        this.underlyingType = underlyingType;
        this.singleUnderlyingId = uuid;
        this.orderSide = orderSide;
        this.optionInstrumentQuote = optionInstrumentQuote;
        this.pnlChartType = optionChainSettingsPnlChartType;
        this.watchlistItemState = watchlistItemState;
        this.uiOptionInstrument = uiOptionInstrument;
        this.uiOptionChain = uiOptionChain;
        this.uiOptionUnderliers = uiOptionUnderliers;
        this.isPreTradeStatNuxDotShown = z4;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingServerValue() {
        return this.defaultPricingSettingServerValue;
    }

    public final OptionSettings.DefaultPricingSetting getDefaultPriceSettingsOverride() {
        return this.defaultPriceSettingsOverride;
    }

    public final boolean getHasPosition() {
        return this.hasPosition;
    }

    public final boolean getShouldDefaultToSimulatedReturnTab() {
        return this.shouldDefaultToSimulatedReturnTab;
    }

    public final boolean getShouldIgnoreDefaultPricing() {
        return this.shouldIgnoreDefaultPricing;
    }

    public final String getStrategyCode() {
        return this.strategyCode;
    }

    public final OptionLegBundle getLegBundle() {
        return this.legBundle;
    }

    public final OptionStatisticsLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final OptionStatisticsTradableState getTradableState() {
        return this.tradableState;
    }

    public final OptionChain.UnderlyingType getUnderlyingType() {
        return this.underlyingType;
    }

    public final UUID getSingleUnderlyingId() {
        return this.singleUnderlyingId;
    }

    public final OrderSide getOrderSide() {
        return this.orderSide;
    }

    public final OptionInstrumentQuote getOptionInstrumentQuote() {
        return this.optionInstrumentQuote;
    }

    public final OptionChainSettingsPnlChartType getPnlChartType() {
        return this.pnlChartType;
    }

    public /* synthetic */ OptionStatisticsDataState(Account account, String str, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionSettings.DefaultPricingSetting defaultPricingSetting2, boolean z, boolean z2, boolean z3, String str2, OptionLegBundle optionLegBundle, OptionStatisticsLaunchMode optionStatisticsLaunchMode, OptionStatisticsTradableState optionStatisticsTradableState, OptionChain.UnderlyingType underlyingType, UUID uuid, OrderSide orderSide, OptionInstrumentQuote optionInstrumentQuote, OptionChainSettingsPnlChartType optionChainSettingsPnlChartType, OptionWatchlistItemState optionWatchlistItemState, UiOptionInstrument uiOptionInstrument, UiOptionChain uiOptionChain, ImmutableList immutableList, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : account, str, (i & 4) != 0 ? null : defaultPricingSetting, defaultPricingSetting2, (i & 16) != 0 ? false : z, z2, z3, str2, optionLegBundle, optionStatisticsLaunchMode, optionStatisticsTradableState, underlyingType, uuid, orderSide, (i & 16384) != 0 ? null : optionInstrumentQuote, (32768 & i) != 0 ? null : optionChainSettingsPnlChartType, (65536 & i) != 0 ? OptionWatchlistItemState.NOT_AVAILABLE : optionWatchlistItemState, (131072 & i) != 0 ? null : uiOptionInstrument, uiOptionChain, (524288 & i) != 0 ? extensions2.persistentListOf() : immutableList, (i & 1048576) != 0 ? true : z4);
    }

    public final OptionWatchlistItemState getWatchlistItemState() {
        return this.watchlistItemState;
    }

    public final UiOptionInstrument getUiOptionInstrument() {
        return this.uiOptionInstrument;
    }

    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    public final ImmutableList<UiOptionUnderlier> getUiOptionUnderliers() {
        return this.uiOptionUnderliers;
    }

    public final boolean isPreTradeStatNuxDotShown() {
        return this.isPreTradeStatNuxDotShown;
    }
}
