package com.robinhood.android.optionschain;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.tradability.UiOptionInstrumentTradability;
import com.robinhood.models.Decimals4;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionChainSelectedMetrics;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.models.p355ui.OptionConfigurationBundle;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionStatisticsTradableState;
import com.robinhood.models.p355ui.OptionWatchlistItemState;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionPositionCounts;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: OptionInstrumentRowModel.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0089\u0001\u008a\u0001BÏ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010#\u001a\u00020$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\b\u0010l\u001a\u0004\u0018\u00010mJ\u0010\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010o\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010q\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010r\u001a\u00020\fHÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010t\u001a\u00020\u0010HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010x\u001a\u00020\u0003HÆ\u0003J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\u0011\u0010z\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aHÆ\u0003J\t\u0010{\u001a\u00020\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\t\u0010}\u001a\u00020 HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\"HÆ\u0003J\t\u0010\u007f\u001a\u00020$HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010&HÆ\u0003Jü\u0001\u0010\u0082\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&HÆ\u0001¢\u0006\u0003\u0010\u0083\u0001J\u0015\u0010\u0084\u0001\u001a\u00020\u00032\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0086\u0001\u001a\u00030\u0087\u0001HÖ\u0001J\n\u0010\u0088\u0001\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010@R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0013\u0010'\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bN\u0010MR\u0011\u0010O\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010@R\u0011\u0010P\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010ER\u0011\u0010R\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u0010@R\u000e\u0010T\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010X\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010@R\u0011\u0010Y\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010@R\u0013\u0010[\u001a\u0004\u0018\u00010\\¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0011\u0010_\u001a\u00020`¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0011\u0010c\u001a\u00020d¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0013\u0010g\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0013\u0010j\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bk\u0010i¨\u0006\u008b\u0001"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionInstrumentRowModel;", "", "accountIsMargin", "", "currentOrNextMarketDates", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "defaultPricingType", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "featureSet", "", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$Feature;", "optionInstrument", "Lcom/robinhood/models/db/OptionInstrument;", "optionInstrumentToRollId", "Ljava/util/UUID;", "optionConfigurationBundle", "Lcom/robinhood/models/ui/OptionConfigurationBundle;", "optionInstrumentQuote", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "optionPositionCounts", "Lcom/robinhood/models/ui/UiOptionPositionCounts;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "multilegAvailable", "positionOpeningOnly", "multipleChainsSelectedSymbols", "", "", "isSelected", "oppositeSelectedLegBundle", "Lcom/robinhood/models/ui/OptionLegBundle;", "tradeOnExpirationState", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "watchlistItemState", "Lcom/robinhood/models/ui/OptionWatchlistItemState;", "buySelectedMetrics", "Lcom/robinhood/models/db/OptionChainSelectedMetrics;", "sellSelectedMetrics", "<init>", "(Ljava/lang/Boolean;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Ljava/util/Set;Lcom/robinhood/models/db/OptionInstrument;Ljava/util/UUID;Lcom/robinhood/models/ui/OptionConfigurationBundle;Lcom/robinhood/models/db/OptionInstrumentQuote;Lcom/robinhood/models/ui/UiOptionPositionCounts;Lcom/robinhood/models/ui/UnderlyingQuote;ZZLjava/util/List;ZLcom/robinhood/models/ui/OptionLegBundle;Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Lcom/robinhood/models/ui/UiOptionChain;Lcom/robinhood/models/ui/OptionWatchlistItemState;Lcom/robinhood/models/db/OptionChainSelectedMetrics;Lcom/robinhood/models/db/OptionChainSelectedMetrics;)V", "getAccountIsMargin", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCurrentOrNextMarketDates", "()Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "getDefaultPricingType", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getFeatureSet", "()Ljava/util/Set;", "getOptionInstrument", "()Lcom/robinhood/models/db/OptionInstrument;", "getOptionInstrumentToRollId", "()Ljava/util/UUID;", "getOptionConfigurationBundle", "()Lcom/robinhood/models/ui/OptionConfigurationBundle;", "getOptionInstrumentQuote", "()Lcom/robinhood/models/db/OptionInstrumentQuote;", "getOptionPositionCounts", "()Lcom/robinhood/models/ui/UiOptionPositionCounts;", "getUnderlyingQuote", "()Lcom/robinhood/models/ui/UnderlyingQuote;", "getMultilegAvailable", "()Z", "getPositionOpeningOnly", "getMultipleChainsSelectedSymbols", "()Ljava/util/List;", "getOppositeSelectedLegBundle", "()Lcom/robinhood/models/ui/OptionLegBundle;", "getTradeOnExpirationState", "()Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "getUiOptionChain", "()Lcom/robinhood/models/ui/UiOptionChain;", "getWatchlistItemState", "()Lcom/robinhood/models/ui/OptionWatchlistItemState;", "getBuySelectedMetrics", "()Lcom/robinhood/models/db/OptionChainSelectedMetrics;", "getSellSelectedMetrics", "isPco", "optionLegBundle", "getOptionLegBundle", "forceBottomSheetForL2", "getForceBottomSheetForL2", "hasShortPosition", "hasLongPosition", "isPosOpeningOnlyAndPositionClosing", "isRollingToSameContract", "isPcoAndPositionOpening", "contractSelected", "getContractSelected", "grayedOutRowDisabledState", "Lcom/robinhood/android/optionschain/OptionInstrumentRowModel$GrayedOutRowDisabledState;", "getGrayedOutRowDisabledState", "()Lcom/robinhood/android/optionschain/OptionInstrumentRowModel$GrayedOutRowDisabledState;", "tradableState", "Lcom/robinhood/models/ui/OptionStatisticsTradableState;", "getTradableState", "()Lcom/robinhood/models/ui/OptionStatisticsTradableState;", "sideForDefaultPricing", "Lcom/robinhood/models/db/OrderSide;", "getSideForDefaultPricing", "()Lcom/robinhood/models/db/OrderSide;", "contractPriceDisplayString", "getContractPriceDisplayString", "()Ljava/lang/String;", "contractPriceDeltaPercentageString", "getContractPriceDeltaPercentageString", "getPcoOptionUpsellType", "Lcom/robinhood/android/optionschain/OptionInstrumentRowModel$PcoOptionUpsellType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/Boolean;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Ljava/util/Set;Lcom/robinhood/models/db/OptionInstrument;Ljava/util/UUID;Lcom/robinhood/models/ui/OptionConfigurationBundle;Lcom/robinhood/models/db/OptionInstrumentQuote;Lcom/robinhood/models/ui/UiOptionPositionCounts;Lcom/robinhood/models/ui/UnderlyingQuote;ZZLjava/util/List;ZLcom/robinhood/models/ui/OptionLegBundle;Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Lcom/robinhood/models/ui/UiOptionChain;Lcom/robinhood/models/ui/OptionWatchlistItemState;Lcom/robinhood/models/db/OptionChainSelectedMetrics;Lcom/robinhood/models/db/OptionChainSelectedMetrics;)Lcom/robinhood/android/optionschain/OptionInstrumentRowModel;", "equals", "other", "hashCode", "", "toString", "GrayedOutRowDisabledState", "PcoOptionUpsellType", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class OptionInstrumentRowModel {
    public static final int $stable = 8;
    private final Boolean accountIsMargin;
    private final OptionChainSelectedMetrics buySelectedMetrics;
    private final String contractPriceDeltaPercentageString;
    private final String contractPriceDisplayString;
    private final boolean contractSelected;
    private final OptionCurrentOrNextMarketDates currentOrNextMarketDates;
    private final OptionSettings.DefaultPricingSetting defaultPricingType;
    private final Set<OptionChainLaunchMode.Feature> featureSet;
    private final boolean forceBottomSheetForL2;
    private final GrayedOutRowDisabledState grayedOutRowDisabledState;
    private final boolean hasLongPosition;
    private final boolean hasShortPosition;
    private final boolean isPco;
    private final boolean isPcoAndPositionOpening;
    private final boolean isPosOpeningOnlyAndPositionClosing;
    private final boolean isRollingToSameContract;
    private final boolean isSelected;
    private final boolean multilegAvailable;
    private final List<String> multipleChainsSelectedSymbols;
    private final OptionLegBundle oppositeSelectedLegBundle;
    private final OptionConfigurationBundle optionConfigurationBundle;
    private final OptionInstrument optionInstrument;
    private final OptionInstrumentQuote optionInstrumentQuote;
    private final UUID optionInstrumentToRollId;
    private final OptionLegBundle optionLegBundle;
    private final UiOptionPositionCounts optionPositionCounts;
    private final boolean positionOpeningOnly;
    private final OptionChainSelectedMetrics sellSelectedMetrics;
    private final OrderSide sideForDefaultPricing;
    private final OptionStatisticsTradableState tradableState;
    private final OptionSettings.TradingOnExpirationState tradeOnExpirationState;
    private final UiOptionChain uiOptionChain;
    private final UnderlyingQuote underlyingQuote;
    private final OptionWatchlistItemState watchlistItemState;

    /* compiled from: OptionInstrumentRowModel.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionSettings.TradingOnExpirationState.values().length];
            try {
                iArr2[OptionSettings.TradingOnExpirationState.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OptionSettings.TradingOnExpirationState.ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OptionSettings.TradingOnExpirationState.INELIGIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ OptionInstrumentRowModel copy$default(OptionInstrumentRowModel optionInstrumentRowModel, Boolean bool, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, OptionSettings.DefaultPricingSetting defaultPricingSetting, Set set, OptionInstrument optionInstrument, UUID uuid, OptionConfigurationBundle optionConfigurationBundle, OptionInstrumentQuote optionInstrumentQuote, UiOptionPositionCounts uiOptionPositionCounts, UnderlyingQuote underlyingQuote, boolean z, boolean z2, List list, boolean z3, OptionLegBundle optionLegBundle, OptionSettings.TradingOnExpirationState tradingOnExpirationState, UiOptionChain uiOptionChain, OptionWatchlistItemState optionWatchlistItemState, OptionChainSelectedMetrics optionChainSelectedMetrics, OptionChainSelectedMetrics optionChainSelectedMetrics2, int i, Object obj) {
        OptionChainSelectedMetrics optionChainSelectedMetrics3;
        OptionChainSelectedMetrics optionChainSelectedMetrics4;
        Boolean bool2 = (i & 1) != 0 ? optionInstrumentRowModel.accountIsMargin : bool;
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates2 = (i & 2) != 0 ? optionInstrumentRowModel.currentOrNextMarketDates : optionCurrentOrNextMarketDates;
        OptionSettings.DefaultPricingSetting defaultPricingSetting2 = (i & 4) != 0 ? optionInstrumentRowModel.defaultPricingType : defaultPricingSetting;
        Set set2 = (i & 8) != 0 ? optionInstrumentRowModel.featureSet : set;
        OptionInstrument optionInstrument2 = (i & 16) != 0 ? optionInstrumentRowModel.optionInstrument : optionInstrument;
        UUID uuid2 = (i & 32) != 0 ? optionInstrumentRowModel.optionInstrumentToRollId : uuid;
        OptionConfigurationBundle optionConfigurationBundle2 = (i & 64) != 0 ? optionInstrumentRowModel.optionConfigurationBundle : optionConfigurationBundle;
        OptionInstrumentQuote optionInstrumentQuote2 = (i & 128) != 0 ? optionInstrumentRowModel.optionInstrumentQuote : optionInstrumentQuote;
        UiOptionPositionCounts uiOptionPositionCounts2 = (i & 256) != 0 ? optionInstrumentRowModel.optionPositionCounts : uiOptionPositionCounts;
        UnderlyingQuote underlyingQuote2 = (i & 512) != 0 ? optionInstrumentRowModel.underlyingQuote : underlyingQuote;
        boolean z4 = (i & 1024) != 0 ? optionInstrumentRowModel.multilegAvailable : z;
        boolean z5 = (i & 2048) != 0 ? optionInstrumentRowModel.positionOpeningOnly : z2;
        List list2 = (i & 4096) != 0 ? optionInstrumentRowModel.multipleChainsSelectedSymbols : list;
        boolean z6 = (i & 8192) != 0 ? optionInstrumentRowModel.isSelected : z3;
        Boolean bool3 = bool2;
        OptionLegBundle optionLegBundle2 = (i & 16384) != 0 ? optionInstrumentRowModel.oppositeSelectedLegBundle : optionLegBundle;
        OptionSettings.TradingOnExpirationState tradingOnExpirationState2 = (i & 32768) != 0 ? optionInstrumentRowModel.tradeOnExpirationState : tradingOnExpirationState;
        UiOptionChain uiOptionChain2 = (i & 65536) != 0 ? optionInstrumentRowModel.uiOptionChain : uiOptionChain;
        OptionWatchlistItemState optionWatchlistItemState2 = (i & 131072) != 0 ? optionInstrumentRowModel.watchlistItemState : optionWatchlistItemState;
        OptionChainSelectedMetrics optionChainSelectedMetrics5 = (i & 262144) != 0 ? optionInstrumentRowModel.buySelectedMetrics : optionChainSelectedMetrics;
        if ((i & 524288) != 0) {
            optionChainSelectedMetrics4 = optionChainSelectedMetrics5;
            optionChainSelectedMetrics3 = optionInstrumentRowModel.sellSelectedMetrics;
        } else {
            optionChainSelectedMetrics3 = optionChainSelectedMetrics2;
            optionChainSelectedMetrics4 = optionChainSelectedMetrics5;
        }
        return optionInstrumentRowModel.copy(bool3, optionCurrentOrNextMarketDates2, defaultPricingSetting2, set2, optionInstrument2, uuid2, optionConfigurationBundle2, optionInstrumentQuote2, uiOptionPositionCounts2, underlyingQuote2, z4, z5, list2, z6, optionLegBundle2, tradingOnExpirationState2, uiOptionChain2, optionWatchlistItemState2, optionChainSelectedMetrics4, optionChainSelectedMetrics3);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getAccountIsMargin() {
        return this.accountIsMargin;
    }

    /* renamed from: component10, reason: from getter */
    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getMultilegAvailable() {
        return this.multilegAvailable;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getPositionOpeningOnly() {
        return this.positionOpeningOnly;
    }

    public final List<String> component13() {
        return this.multipleChainsSelectedSymbols;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component15, reason: from getter */
    public final OptionLegBundle getOppositeSelectedLegBundle() {
        return this.oppositeSelectedLegBundle;
    }

    /* renamed from: component16, reason: from getter */
    public final OptionSettings.TradingOnExpirationState getTradeOnExpirationState() {
        return this.tradeOnExpirationState;
    }

    /* renamed from: component17, reason: from getter */
    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    /* renamed from: component18, reason: from getter */
    public final OptionWatchlistItemState getWatchlistItemState() {
        return this.watchlistItemState;
    }

    /* renamed from: component19, reason: from getter */
    public final OptionChainSelectedMetrics getBuySelectedMetrics() {
        return this.buySelectedMetrics;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    /* renamed from: component20, reason: from getter */
    public final OptionChainSelectedMetrics getSellSelectedMetrics() {
        return this.sellSelectedMetrics;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionSettings.DefaultPricingSetting getDefaultPricingType() {
        return this.defaultPricingType;
    }

    public final Set<OptionChainLaunchMode.Feature> component4() {
        return this.featureSet;
    }

    /* renamed from: component5, reason: from getter */
    public final OptionInstrument getOptionInstrument() {
        return this.optionInstrument;
    }

    /* renamed from: component6, reason: from getter */
    public final UUID getOptionInstrumentToRollId() {
        return this.optionInstrumentToRollId;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionConfigurationBundle getOptionConfigurationBundle() {
        return this.optionConfigurationBundle;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionInstrumentQuote getOptionInstrumentQuote() {
        return this.optionInstrumentQuote;
    }

    /* renamed from: component9, reason: from getter */
    public final UiOptionPositionCounts getOptionPositionCounts() {
        return this.optionPositionCounts;
    }

    public final OptionInstrumentRowModel copy(Boolean accountIsMargin, OptionCurrentOrNextMarketDates currentOrNextMarketDates, OptionSettings.DefaultPricingSetting defaultPricingType, Set<? extends OptionChainLaunchMode.Feature> featureSet, OptionInstrument optionInstrument, UUID optionInstrumentToRollId, OptionConfigurationBundle optionConfigurationBundle, OptionInstrumentQuote optionInstrumentQuote, UiOptionPositionCounts optionPositionCounts, UnderlyingQuote underlyingQuote, boolean multilegAvailable, boolean positionOpeningOnly, List<String> multipleChainsSelectedSymbols, boolean isSelected, OptionLegBundle oppositeSelectedLegBundle, OptionSettings.TradingOnExpirationState tradeOnExpirationState, UiOptionChain uiOptionChain, OptionWatchlistItemState watchlistItemState, OptionChainSelectedMetrics buySelectedMetrics, OptionChainSelectedMetrics sellSelectedMetrics) {
        Intrinsics.checkNotNullParameter(featureSet, "featureSet");
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        Intrinsics.checkNotNullParameter(optionConfigurationBundle, "optionConfigurationBundle");
        Intrinsics.checkNotNullParameter(tradeOnExpirationState, "tradeOnExpirationState");
        Intrinsics.checkNotNullParameter(watchlistItemState, "watchlistItemState");
        return new OptionInstrumentRowModel(accountIsMargin, currentOrNextMarketDates, defaultPricingType, featureSet, optionInstrument, optionInstrumentToRollId, optionConfigurationBundle, optionInstrumentQuote, optionPositionCounts, underlyingQuote, multilegAvailable, positionOpeningOnly, multipleChainsSelectedSymbols, isSelected, oppositeSelectedLegBundle, tradeOnExpirationState, uiOptionChain, watchlistItemState, buySelectedMetrics, sellSelectedMetrics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionInstrumentRowModel)) {
            return false;
        }
        OptionInstrumentRowModel optionInstrumentRowModel = (OptionInstrumentRowModel) other;
        return Intrinsics.areEqual(this.accountIsMargin, optionInstrumentRowModel.accountIsMargin) && Intrinsics.areEqual(this.currentOrNextMarketDates, optionInstrumentRowModel.currentOrNextMarketDates) && this.defaultPricingType == optionInstrumentRowModel.defaultPricingType && Intrinsics.areEqual(this.featureSet, optionInstrumentRowModel.featureSet) && Intrinsics.areEqual(this.optionInstrument, optionInstrumentRowModel.optionInstrument) && Intrinsics.areEqual(this.optionInstrumentToRollId, optionInstrumentRowModel.optionInstrumentToRollId) && Intrinsics.areEqual(this.optionConfigurationBundle, optionInstrumentRowModel.optionConfigurationBundle) && Intrinsics.areEqual(this.optionInstrumentQuote, optionInstrumentRowModel.optionInstrumentQuote) && Intrinsics.areEqual(this.optionPositionCounts, optionInstrumentRowModel.optionPositionCounts) && Intrinsics.areEqual(this.underlyingQuote, optionInstrumentRowModel.underlyingQuote) && this.multilegAvailable == optionInstrumentRowModel.multilegAvailable && this.positionOpeningOnly == optionInstrumentRowModel.positionOpeningOnly && Intrinsics.areEqual(this.multipleChainsSelectedSymbols, optionInstrumentRowModel.multipleChainsSelectedSymbols) && this.isSelected == optionInstrumentRowModel.isSelected && Intrinsics.areEqual(this.oppositeSelectedLegBundle, optionInstrumentRowModel.oppositeSelectedLegBundle) && this.tradeOnExpirationState == optionInstrumentRowModel.tradeOnExpirationState && Intrinsics.areEqual(this.uiOptionChain, optionInstrumentRowModel.uiOptionChain) && this.watchlistItemState == optionInstrumentRowModel.watchlistItemState && Intrinsics.areEqual(this.buySelectedMetrics, optionInstrumentRowModel.buySelectedMetrics) && Intrinsics.areEqual(this.sellSelectedMetrics, optionInstrumentRowModel.sellSelectedMetrics);
    }

    public int hashCode() {
        Boolean bool = this.accountIsMargin;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates = this.currentOrNextMarketDates;
        int iHashCode2 = (iHashCode + (optionCurrentOrNextMarketDates == null ? 0 : optionCurrentOrNextMarketDates.hashCode())) * 31;
        OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingType;
        int iHashCode3 = (((((iHashCode2 + (defaultPricingSetting == null ? 0 : defaultPricingSetting.hashCode())) * 31) + this.featureSet.hashCode()) * 31) + this.optionInstrument.hashCode()) * 31;
        UUID uuid = this.optionInstrumentToRollId;
        int iHashCode4 = (((iHashCode3 + (uuid == null ? 0 : uuid.hashCode())) * 31) + this.optionConfigurationBundle.hashCode()) * 31;
        OptionInstrumentQuote optionInstrumentQuote = this.optionInstrumentQuote;
        int iHashCode5 = (iHashCode4 + (optionInstrumentQuote == null ? 0 : optionInstrumentQuote.hashCode())) * 31;
        UiOptionPositionCounts uiOptionPositionCounts = this.optionPositionCounts;
        int iHashCode6 = (iHashCode5 + (uiOptionPositionCounts == null ? 0 : uiOptionPositionCounts.hashCode())) * 31;
        UnderlyingQuote underlyingQuote = this.underlyingQuote;
        int iHashCode7 = (((((iHashCode6 + (underlyingQuote == null ? 0 : underlyingQuote.hashCode())) * 31) + Boolean.hashCode(this.multilegAvailable)) * 31) + Boolean.hashCode(this.positionOpeningOnly)) * 31;
        List<String> list = this.multipleChainsSelectedSymbols;
        int iHashCode8 = (((iHashCode7 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.isSelected)) * 31;
        OptionLegBundle optionLegBundle = this.oppositeSelectedLegBundle;
        int iHashCode9 = (((iHashCode8 + (optionLegBundle == null ? 0 : optionLegBundle.hashCode())) * 31) + this.tradeOnExpirationState.hashCode()) * 31;
        UiOptionChain uiOptionChain = this.uiOptionChain;
        int iHashCode10 = (((iHashCode9 + (uiOptionChain == null ? 0 : uiOptionChain.hashCode())) * 31) + this.watchlistItemState.hashCode()) * 31;
        OptionChainSelectedMetrics optionChainSelectedMetrics = this.buySelectedMetrics;
        int iHashCode11 = (iHashCode10 + (optionChainSelectedMetrics == null ? 0 : optionChainSelectedMetrics.hashCode())) * 31;
        OptionChainSelectedMetrics optionChainSelectedMetrics2 = this.sellSelectedMetrics;
        return iHashCode11 + (optionChainSelectedMetrics2 != null ? optionChainSelectedMetrics2.hashCode() : 0);
    }

    public String toString() {
        return "OptionInstrumentRowModel(accountIsMargin=" + this.accountIsMargin + ", currentOrNextMarketDates=" + this.currentOrNextMarketDates + ", defaultPricingType=" + this.defaultPricingType + ", featureSet=" + this.featureSet + ", optionInstrument=" + this.optionInstrument + ", optionInstrumentToRollId=" + this.optionInstrumentToRollId + ", optionConfigurationBundle=" + this.optionConfigurationBundle + ", optionInstrumentQuote=" + this.optionInstrumentQuote + ", optionPositionCounts=" + this.optionPositionCounts + ", underlyingQuote=" + this.underlyingQuote + ", multilegAvailable=" + this.multilegAvailable + ", positionOpeningOnly=" + this.positionOpeningOnly + ", multipleChainsSelectedSymbols=" + this.multipleChainsSelectedSymbols + ", isSelected=" + this.isSelected + ", oppositeSelectedLegBundle=" + this.oppositeSelectedLegBundle + ", tradeOnExpirationState=" + this.tradeOnExpirationState + ", uiOptionChain=" + this.uiOptionChain + ", watchlistItemState=" + this.watchlistItemState + ", buySelectedMetrics=" + this.buySelectedMetrics + ", sellSelectedMetrics=" + this.sellSelectedMetrics + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OptionInstrumentRowModel(Boolean bool, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, OptionSettings.DefaultPricingSetting defaultPricingSetting, Set<? extends OptionChainLaunchMode.Feature> featureSet, OptionInstrument optionInstrument, UUID uuid, OptionConfigurationBundle optionConfigurationBundle, OptionInstrumentQuote optionInstrumentQuote, UiOptionPositionCounts uiOptionPositionCounts, UnderlyingQuote underlyingQuote, boolean z, boolean z2, List<String> list, boolean z3, OptionLegBundle optionLegBundle, OptionSettings.TradingOnExpirationState tradeOnExpirationState, UiOptionChain uiOptionChain, OptionWatchlistItemState watchlistItemState, OptionChainSelectedMetrics optionChainSelectedMetrics, OptionChainSelectedMetrics optionChainSelectedMetrics2) {
        boolean z4;
        boolean z5;
        GrayedOutRowDisabledState grayedOutRowDisabledState;
        OptionStatisticsTradableState multipleChainsSelected;
        String str;
        OptionConfigurationBundle optionConfigurationBundle2;
        Intrinsics.checkNotNullParameter(featureSet, "featureSet");
        Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
        Intrinsics.checkNotNullParameter(optionConfigurationBundle, "optionConfigurationBundle");
        Intrinsics.checkNotNullParameter(tradeOnExpirationState, "tradeOnExpirationState");
        Intrinsics.checkNotNullParameter(watchlistItemState, "watchlistItemState");
        this.accountIsMargin = bool;
        this.currentOrNextMarketDates = optionCurrentOrNextMarketDates;
        this.defaultPricingType = defaultPricingSetting;
        this.featureSet = featureSet;
        this.optionInstrument = optionInstrument;
        this.optionInstrumentToRollId = uuid;
        this.optionConfigurationBundle = optionConfigurationBundle;
        this.optionInstrumentQuote = optionInstrumentQuote;
        this.optionPositionCounts = uiOptionPositionCounts;
        this.underlyingQuote = underlyingQuote;
        this.multilegAvailable = z;
        this.positionOpeningOnly = z2;
        this.multipleChainsSelectedSymbols = list;
        this.isSelected = z3;
        this.oppositeSelectedLegBundle = optionLegBundle;
        this.tradeOnExpirationState = tradeOnExpirationState;
        this.uiOptionChain = uiOptionChain;
        this.watchlistItemState = watchlistItemState;
        this.buySelectedMetrics = optionChainSelectedMetrics;
        this.sellSelectedMetrics = optionChainSelectedMetrics2;
        boolean z6 = (optionCurrentOrNextMarketDates == null || uiOptionChain == null || new UiOptionInstrumentTradability(optionCurrentOrNextMarketDates, tradeOnExpirationState, optionInstrument, uiOptionChain).getAdjustedTradability() != Tradability.POSITION_CLOSING_ONLY) ? false : true;
        this.isPco = z6;
        boolean z7 = z6;
        boolean z8 = true;
        this.optionLegBundle = new OptionLegBundle(optionConfigurationBundle, optionInstrument, 0, 4, null);
        this.forceBottomSheetForL2 = featureSet.contains(OptionChainLaunchMode.Feature.FORCE_BOTTOM_SHEET_FOR_L2);
        boolean z9 = (uiOptionPositionCounts == null || uiOptionPositionCounts.getShortQuantity() == 0) ? false : true;
        this.hasShortPosition = z9;
        boolean z10 = (uiOptionPositionCounts == null || uiOptionPositionCounts.getLongQuantity() == 0) ? false : true;
        this.hasLongPosition = z10;
        OrderSide optionSide = optionConfigurationBundle.getOptionSide();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[optionSide.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z4 = z2 && z10;
        } else if (!z2 || !z9) {
        }
        this.isPosOpeningOnlyAndPositionClosing = z4;
        boolean zAreEqual = Intrinsics.areEqual(optionInstrument.getId(), uuid);
        this.isRollingToSameContract = zAreEqual;
        int i2 = iArr[optionConfigurationBundle.getOptionSide().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            z5 = z7 && !z10;
        } else if (!z7 || z9) {
        }
        this.isPcoAndPositionOpening = z5;
        if (optionLegBundle == null && (!z3 || z5)) {
            z8 = false;
        }
        this.contractSelected = z8;
        if (optionLegBundle != null) {
            grayedOutRowDisabledState = GrayedOutRowDisabledState.OPPOSITE_SIDE_SELECTED;
        } else if (z5) {
            grayedOutRowDisabledState = GrayedOutRowDisabledState.PCO_AND_OPENING;
        } else if (z4) {
            grayedOutRowDisabledState = GrayedOutRowDisabledState.CLOSING_NOT_ALLOWED;
        } else {
            grayedOutRowDisabledState = zAreEqual ? GrayedOutRowDisabledState.ROLLING_SAME_CONTRACT : null;
        }
        this.grayedOutRowDisabledState = grayedOutRowDisabledState;
        if (grayedOutRowDisabledState != null) {
            if (grayedOutRowDisabledState.getTradableFromBottomSheet()) {
                multipleChainsSelected = OptionStatisticsTradableState.OppositeLegSelected.INSTANCE;
            } else {
                multipleChainsSelected = OptionStatisticsTradableState.NotTradable.INSTANCE;
            }
        } else if (list != null) {
            multipleChainsSelected = new OptionStatisticsTradableState.MultipleChainsSelected(list);
        } else {
            multipleChainsSelected = OptionStatisticsTradableState.Tradable.INSTANCE;
        }
        this.tradableState = multipleChainsSelected;
        OrderSide optionSide2 = ((optionLegBundle == null || (optionConfigurationBundle2 = optionLegBundle.getOptionConfigurationBundle()) == null) ? optionConfigurationBundle : optionConfigurationBundle2).getOptionSide();
        this.sideForDefaultPricing = optionSide2;
        if (optionInstrumentQuote == null) {
            str = null;
        } else {
            Decimals4 price$default = OptionInstrumentQuote.getPrice$default(optionInstrumentQuote, defaultPricingSetting, optionSide2, false, 4, null);
            BigDecimal unsignedValue = price$default != null ? price$default.getUnsignedValue() : null;
            if (unsignedValue != null) {
                str = Formats.getPriceFormat().format(unsignedValue);
            }
        }
        this.contractPriceDisplayString = str;
        this.contractPriceDeltaPercentageString = optionInstrumentQuote != null ? Formats.getPercentDeltaFormat().format(optionInstrumentQuote.getTodaysPercentChange()) : null;
    }

    public /* synthetic */ OptionInstrumentRowModel(Boolean bool, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, OptionSettings.DefaultPricingSetting defaultPricingSetting, Set set, OptionInstrument optionInstrument, UUID uuid, OptionConfigurationBundle optionConfigurationBundle, OptionInstrumentQuote optionInstrumentQuote, UiOptionPositionCounts uiOptionPositionCounts, UnderlyingQuote underlyingQuote, boolean z, boolean z2, List list, boolean z3, OptionLegBundle optionLegBundle, OptionSettings.TradingOnExpirationState tradingOnExpirationState, UiOptionChain uiOptionChain, OptionWatchlistItemState optionWatchlistItemState, OptionChainSelectedMetrics optionChainSelectedMetrics, OptionChainSelectedMetrics optionChainSelectedMetrics2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, optionCurrentOrNextMarketDates, defaultPricingSetting, set, optionInstrument, uuid, optionConfigurationBundle, optionInstrumentQuote, uiOptionPositionCounts, underlyingQuote, z, z2, list, z3, optionLegBundle, tradingOnExpirationState, uiOptionChain, optionWatchlistItemState, (i & 262144) != 0 ? null : optionChainSelectedMetrics, (i & 524288) != 0 ? null : optionChainSelectedMetrics2);
    }

    public final Boolean getAccountIsMargin() {
        return this.accountIsMargin;
    }

    public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
        return this.currentOrNextMarketDates;
    }

    public final OptionSettings.DefaultPricingSetting getDefaultPricingType() {
        return this.defaultPricingType;
    }

    public final Set<OptionChainLaunchMode.Feature> getFeatureSet() {
        return this.featureSet;
    }

    public final OptionInstrument getOptionInstrument() {
        return this.optionInstrument;
    }

    public final UUID getOptionInstrumentToRollId() {
        return this.optionInstrumentToRollId;
    }

    public final OptionConfigurationBundle getOptionConfigurationBundle() {
        return this.optionConfigurationBundle;
    }

    public final OptionInstrumentQuote getOptionInstrumentQuote() {
        return this.optionInstrumentQuote;
    }

    public final UiOptionPositionCounts getOptionPositionCounts() {
        return this.optionPositionCounts;
    }

    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    public final boolean getMultilegAvailable() {
        return this.multilegAvailable;
    }

    public final boolean getPositionOpeningOnly() {
        return this.positionOpeningOnly;
    }

    public final List<String> getMultipleChainsSelectedSymbols() {
        return this.multipleChainsSelectedSymbols;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final OptionLegBundle getOppositeSelectedLegBundle() {
        return this.oppositeSelectedLegBundle;
    }

    public final OptionSettings.TradingOnExpirationState getTradeOnExpirationState() {
        return this.tradeOnExpirationState;
    }

    public final UiOptionChain getUiOptionChain() {
        return this.uiOptionChain;
    }

    public final OptionWatchlistItemState getWatchlistItemState() {
        return this.watchlistItemState;
    }

    public final OptionChainSelectedMetrics getBuySelectedMetrics() {
        return this.buySelectedMetrics;
    }

    public final OptionChainSelectedMetrics getSellSelectedMetrics() {
        return this.sellSelectedMetrics;
    }

    /* renamed from: isPco, reason: from getter */
    public final boolean getIsPco() {
        return this.isPco;
    }

    public final OptionLegBundle getOptionLegBundle() {
        return this.optionLegBundle;
    }

    public final boolean getForceBottomSheetForL2() {
        return this.forceBottomSheetForL2;
    }

    /* renamed from: isPcoAndPositionOpening, reason: from getter */
    public final boolean getIsPcoAndPositionOpening() {
        return this.isPcoAndPositionOpening;
    }

    public final boolean getContractSelected() {
        return this.contractSelected;
    }

    public final GrayedOutRowDisabledState getGrayedOutRowDisabledState() {
        return this.grayedOutRowDisabledState;
    }

    public final OptionStatisticsTradableState getTradableState() {
        return this.tradableState;
    }

    public final OrderSide getSideForDefaultPricing() {
        return this.sideForDefaultPricing;
    }

    public final String getContractPriceDisplayString() {
        return this.contractPriceDisplayString;
    }

    public final String getContractPriceDeltaPercentageString() {
        return this.contractPriceDeltaPercentageString;
    }

    public final PcoOptionUpsellType getPcoOptionUpsellType() {
        UiOptionChain uiOptionChain;
        OptionChain optionChain;
        boolean z = Instant.now().compareTo(this.optionInstrument.getSelloutDatetime()) > 0;
        int i = WhenMappings.$EnumSwitchMapping$1[this.tradeOnExpirationState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                return PcoOptionUpsellType.TRADE_ON_EXPIRATION_AFTER_SELLOUT;
            }
            return null;
        }
        if (!z && (uiOptionChain = this.uiOptionChain) != null && (optionChain = uiOptionChain.getOptionChain()) != null && !optionChain.getSettleOnOpen()) {
            return PcoOptionUpsellType.DISCOVER_ZERO_DTE_BOTTOM_SHEET;
        }
        if (z) {
            return PcoOptionUpsellType.TRADE_ON_EXPIRATION_AFTER_SELLOUT;
        }
        return null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionInstrumentRowModel.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionInstrumentRowModel$GrayedOutRowDisabledState;", "", "buyErrorMsg", "Lcom/robinhood/utils/resource/StringResource;", "sellErrorMsg", "tradableFromBottomSheet", "", "<init>", "(Ljava/lang/String;ILcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Z)V", "getTradableFromBottomSheet", "()Z", "OPPOSITE_SIDE_SELECTED", "PCO_AND_OPENING", "ROLLING_SAME_CONTRACT", "CLOSING_NOT_ALLOWED", "getErrorMsg", "", "resources", "Landroid/content/res/Resources;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class GrayedOutRowDisabledState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ GrayedOutRowDisabledState[] $VALUES;
        public static final GrayedOutRowDisabledState CLOSING_NOT_ALLOWED;
        public static final GrayedOutRowDisabledState OPPOSITE_SIDE_SELECTED;
        public static final GrayedOutRowDisabledState PCO_AND_OPENING;
        public static final GrayedOutRowDisabledState ROLLING_SAME_CONTRACT;
        private final StringResource buyErrorMsg;
        private final StringResource sellErrorMsg;
        private final boolean tradableFromBottomSheet;

        /* compiled from: OptionInstrumentRowModel.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderSide.values().length];
                try {
                    iArr[OrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ GrayedOutRowDisabledState[] $values() {
            return new GrayedOutRowDisabledState[]{OPPOSITE_SIDE_SELECTED, PCO_AND_OPENING, ROLLING_SAME_CONTRACT, CLOSING_NOT_ALLOWED};
        }

        public static EnumEntries<GrayedOutRowDisabledState> getEntries() {
            return $ENTRIES;
        }

        private GrayedOutRowDisabledState(String str, int i, StringResource stringResource, StringResource stringResource2, boolean z) {
            this.buyErrorMsg = stringResource;
            this.sellErrorMsg = stringResource2;
            this.tradableFromBottomSheet = z;
        }

        public final boolean getTradableFromBottomSheet() {
            return this.tradableFromBottomSheet;
        }

        static {
            StringResource.Companion companion = StringResource.INSTANCE;
            OPPOSITE_SIDE_SELECTED = new GrayedOutRowDisabledState("OPPOSITE_SIDE_SELECTED", 0, companion.invoke(C24135R.string.option_order_sell_already_selected, new Object[0]), companion.invoke(C24135R.string.option_order_buy_already_selected, new Object[0]), true);
            PCO_AND_OPENING = new GrayedOutRowDisabledState("PCO_AND_OPENING", 1, companion.invoke(C24135R.string.option_order_buy_closing_only, new Object[0]), companion.invoke(C24135R.string.option_order_sell_closing_only, new Object[0]), false);
            ROLLING_SAME_CONTRACT = new GrayedOutRowDisabledState("ROLLING_SAME_CONTRACT", 2, companion.invoke(C24135R.string.option_order_buy_roll_to_same_position, new Object[0]), companion.invoke(C24135R.string.option_order_sell_roll_to_same_position, new Object[0]), false);
            CLOSING_NOT_ALLOWED = new GrayedOutRowDisabledState("CLOSING_NOT_ALLOWED", 3, companion.invoke(C24135R.string.option_order_buy_opening_only, new Object[0]), companion.invoke(C24135R.string.option_order_sell_opening_only, new Object[0]), false);
            GrayedOutRowDisabledState[] grayedOutRowDisabledStateArr$values = $values();
            $VALUES = grayedOutRowDisabledStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(grayedOutRowDisabledStateArr$values);
        }

        public final CharSequence getErrorMsg(Resources resources, OrderSide orderSide) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            int i = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
            if (i == 1) {
                return this.buyErrorMsg.getText(resources);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return this.sellErrorMsg.getText(resources);
        }

        public static GrayedOutRowDisabledState valueOf(String str) {
            return (GrayedOutRowDisabledState) Enum.valueOf(GrayedOutRowDisabledState.class, str);
        }

        public static GrayedOutRowDisabledState[] values() {
            return (GrayedOutRowDisabledState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionInstrumentRowModel.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionInstrumentRowModel$PcoOptionUpsellType;", "", "<init>", "(Ljava/lang/String;I)V", "DISCOVER_ZERO_DTE_BOTTOM_SHEET", "TRADE_ON_EXPIRATION_AFTER_SELLOUT", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PcoOptionUpsellType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PcoOptionUpsellType[] $VALUES;
        public static final PcoOptionUpsellType DISCOVER_ZERO_DTE_BOTTOM_SHEET = new PcoOptionUpsellType("DISCOVER_ZERO_DTE_BOTTOM_SHEET", 0);
        public static final PcoOptionUpsellType TRADE_ON_EXPIRATION_AFTER_SELLOUT = new PcoOptionUpsellType("TRADE_ON_EXPIRATION_AFTER_SELLOUT", 1);

        private static final /* synthetic */ PcoOptionUpsellType[] $values() {
            return new PcoOptionUpsellType[]{DISCOVER_ZERO_DTE_BOTTOM_SHEET, TRADE_ON_EXPIRATION_AFTER_SELLOUT};
        }

        public static EnumEntries<PcoOptionUpsellType> getEntries() {
            return $ENTRIES;
        }

        private PcoOptionUpsellType(String str, int i) {
        }

        static {
            PcoOptionUpsellType[] pcoOptionUpsellTypeArr$values = $values();
            $VALUES = pcoOptionUpsellTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(pcoOptionUpsellTypeArr$values);
        }

        public static PcoOptionUpsellType valueOf(String str) {
            return (PcoOptionUpsellType) Enum.valueOf(PcoOptionUpsellType.class, str);
        }

        public static PcoOptionUpsellType[] values() {
            return (PcoOptionUpsellType[]) $VALUES.clone();
        }
    }
}
