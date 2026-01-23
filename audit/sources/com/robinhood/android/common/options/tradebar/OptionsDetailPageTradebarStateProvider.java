package com.robinhood.android.common.options.tradebar;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.accountswitcher.OptionsAccountSwitcherState;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDataState;
import com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarViewState;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.options.contracts.OptionChainIdLaunchMode;
import com.robinhood.android.options.contracts.OptionChainIntentKey;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.contracts.OptionsDetailPageFragmentKey;
import com.robinhood.android.options.contracts.OptionsDetailPageLaunchMode;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.tradability.UiOptionInstrumentTradability;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherId;
import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentPosition;
import com.robinhood.models.p320db.OptionOrderFilter;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.models.p355ui.OptionBundles;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.p355ui.UiOptionStrategyLeg;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import com.robinhood.models.p355ui.UiOptionUnderlier;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.Either;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Clock;
import p479j$.time.LocalDate;

/* compiled from: OptionsDetailPageTradebarStateProvider.kt */
@Metadata(m3635d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJI\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J/\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\r2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b'\u0010(J?\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020 0\r2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020 0\r2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020 0\rH\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u00101J1\u00105\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u000204032\u0006\u0010\n\u001a\u00020\u00022\f\u00102\u001a\b\u0012\u0004\u0012\u00020 0\rH\u0002¢\u0006\u0004\b5\u00106JE\u0010A\u001a\u00020@2\b\u00108\u001a\u0004\u0018\u0001072\f\u00109\u001a\b\u0012\u0004\u0012\u0002070\r2\u0006\u0010;\u001a\u00020:2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\u0006\u0010?\u001a\u00020/H\u0002¢\u0006\u0004\bA\u0010BJI\u0010J\u001a\u0002042\b\u00108\u001a\u0004\u0018\u0001072\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020/2\u0006\u0010;\u001a\u00020:2\u0006\u0010?\u001a\u00020/2\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ7\u0010P\u001a\u0002042\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020N2\u0006\u0010?\u001a\u00020/2\u0006\u0010G\u001a\u00020F2\u0006\u0010E\u001a\u00020/H\u0002¢\u0006\u0004\bP\u0010QJ\u001f\u0010R\u001a\u0002042\u0006\u0010?\u001a\u00020/2\u0006\u0010E\u001a\u00020/H\u0002¢\u0006\u0004\bR\u0010SJ!\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010T\u001a\u00020\u0006H\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\u00032\u0006\u0010X\u001a\u00020\u0002H\u0016¢\u0006\u0004\bY\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010ZR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010[¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState;", "j$/time/Clock", Card.Icon.CLOCK, "Landroid/content/res/Resources;", "resources", "<init>", "(Lj$/time/Clock;Landroid/content/res/Resources;)V", "ds", "getTradeBarState", "(Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState;)Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState;", "", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$ActionItem;", "getTradeBarActionItems", "(Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState;)Ljava/util/List;", "Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;", "tradeOnExpirationSettings", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "currentOrNextMarketDates", "Lcom/robinhood/models/db/OptionChain;", TransitionReason.OPTION_TRADE_CHAIN, "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingType", "Lcom/robinhood/models/db/OptionInstrument;", "instrument", "Lcom/robinhood/models/db/Tradability;", "getInstrumentAdjustedTradability", "(Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Lcom/robinhood/models/db/OptionChain;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Lcom/robinhood/models/db/OptionInstrument;)Lcom/robinhood/models/db/Tradability;", "Lcom/robinhood/models/db/OptionPositionType;", "positionType", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$ActionType;", "getSingleLegPositionDisabledActionsFromTradability", "(Lcom/robinhood/models/db/OptionSettings$TradingOnExpirationState;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;Lcom/robinhood/models/db/OptionChain;Lcom/robinhood/models/db/OptionChain$UnderlyingType;Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OptionPositionType;)Ljava/util/List;", "Lcom/robinhood/models/db/Account;", "account", "Ljava/math/BigDecimal;", "quantity", "getSingleLegPositionRemovedActionsFromQuantityAndPcoAccount", "(Lcom/robinhood/models/db/Account;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OptionPositionType;)Ljava/util/List;", "actionTypes", "removedActions", "disabledActions", "getTradebarActionItems", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "actionType", "", "getActionItemLabel", "(Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$ActionType;Landroid/content/res/Resources;)Ljava/lang/String;", "actions", "", "Lcom/robinhood/android/navigation/keys/IntentKey;", "getIntentKeys", "(Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState;Ljava/util/List;)Ljava/util/Map;", "Ljava/util/UUID;", "equityInstrumentId", "chainIds", "Lcom/robinhood/models/ui/UiOptionStrategyLeg;", "leg", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiOptionStrategyLegDisplay;", "targetLegs", "accountNumber", "Lcom/robinhood/android/options/contracts/OptionChainIntentKey;", "getOptionChainFragmentKey", "(Ljava/util/UUID;Ljava/util/List;Lcom/robinhood/models/ui/UiOptionStrategyLeg;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;)Lcom/robinhood/android/options/contracts/OptionChainIntentKey;", "Lcom/robinhood/models/db/OrderSide;", "side", "strategyCode", "Lcom/robinhood/android/common/options/tradebar/OptionsTradeBarSource;", "source", "Lcom/robinhood/models/ui/UiOptionChain;", "uiOptionChain", "getSingleLegOrderIntentKey", "(Ljava/util/UUID;Lcom/robinhood/models/db/OrderSide;Ljava/lang/String;Lcom/robinhood/models/ui/UiOptionStrategyLeg;Ljava/lang/String;Lcom/robinhood/android/common/options/tradebar/OptionsTradeBarSource;Lcom/robinhood/models/ui/UiOptionChain;)Lcom/robinhood/android/navigation/keys/IntentKey;", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "aggregatePosition", "Lcom/robinhood/models/db/OrderPositionEffect;", "positionEffect", "getMultiLegOrderIntentKey", "(Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;Lcom/robinhood/models/db/OrderPositionEffect;Ljava/lang/String;Lcom/robinhood/android/common/options/tradebar/OptionsTradeBarSource;Ljava/lang/String;)Lcom/robinhood/android/navigation/keys/IntentKey;", "getRollingIntentKey", "(Ljava/lang/String;Ljava/lang/String;)Lcom/robinhood/android/navigation/keys/IntentKey;", "res", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$TradebarError;", "getTradebarError", "(Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState;Landroid/content/res/Resources;)Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarViewState$TradebarError;", "dataState", "reduce", "Lj$/time/Clock;", "Landroid/content/res/Resources;", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OptionsDetailPageTradebarStateProvider implements StateProvider<OptionsDetailPageTradebarDataState, OptionsDetailPageTradebarViewState> {
    public static final int $stable = 8;
    private final Clock clock;
    private final Resources resources;

    /* compiled from: OptionsDetailPageTradebarStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[OptionPositionType.values().length];
            try {
                iArr[OptionPositionType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionPositionType.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Tradability.values().length];
            try {
                iArr2[Tradability.TRADABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Tradability.UNTRADABLE_REGSHO.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Tradability.UNTRADABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Tradability.POSITION_OPENING_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Tradability.POSITION_CLOSING_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[OptionsDetailPageTradebarViewState.ActionType.values().length];
            try {
                iArr3[OptionsDetailPageTradebarViewState.ActionType.OPTION_CHAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[OptionsDetailPageTradebarViewState.ActionType.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[OptionsDetailPageTradebarViewState.ActionType.BUY.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[OptionsDetailPageTradebarViewState.ActionType.CLOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[OptionsDetailPageTradebarViewState.ActionType.OPEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[OptionsDetailPageTradebarViewState.ActionType.ROLL.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr4[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public OptionsDetailPageTradebarStateProvider(Clock clock, Resources resources) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.clock = clock;
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public OptionsDetailPageTradebarViewState reduce(OptionsDetailPageTradebarDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return getTradeBarState(dataState);
    }

    private final OptionsDetailPageTradebarViewState getTradeBarState(OptionsDetailPageTradebarDataState ds) throws Resources.NotFoundException {
        Either left;
        Instrument instrument;
        List<Account> allAccounts = ds.getGlobalData().getAllAccounts();
        Account currentAccount = ds.getGlobalData().getCurrentAccount();
        OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData = ds.getPageSpecificDerivedData();
        OptionsDetailPageTradebarDataState.PageSpecificData pageSpecificData = ds.getPageSpecificData();
        if (pageSpecificDerivedData.getUiStrategyInfo() == null || currentAccount == null) {
            return new OptionsDetailPageTradebarViewState(CollectionsKt.emptyList(), MapsKt.emptyMap(), currentAccount, pageSpecificDerivedData.getDirection(), getTradebarError(ds, this.resources), new Either.Left(null), null, ds.getSelfFetchMode(), null, 0L, null);
        }
        boolean z = allAccounts.size() > 1;
        if (z) {
            left = new Either.Right(new OptionsAccountSwitcherState(ds.getSource().toAnalyticsScreenName(), currentAccount.getAccountNumber(), allAccounts, pageSpecificData.getLoadingAccountSwitcher(), ds.getFixedAccountNumber() == null, ds.getUseSduiAccountSwitcher(), OptionsAccountSwitcherType.TRADE_BAR, pageSpecificDerivedData.getOptionsAccountSwitcher()));
        } else {
            UnderlyingQuote underlyingQuote = pageSpecificDerivedData.getUnderlyingQuote();
            String symbol = underlyingQuote != null ? underlyingQuote.getSymbol() : null;
            UnderlyingQuote underlyingQuote2 = pageSpecificDerivedData.getUnderlyingQuote();
            String str = underlyingQuote2 != null ? underlyingQuote2.format() : null;
            boolean z2 = ds.getShouldHideStatLabelForSingleAccount() && allAccounts.size() == 1;
            UiOptionUnderlier uiOptionUnderlier = pageSpecificDerivedData.getUiOptionUnderlier();
            UUID id = (uiOptionUnderlier == null || (instrument = uiOptionUnderlier.getInstrument()) == null) ? null : instrument.getId();
            Index indexInstrument = pageSpecificDerivedData.getIndexInstrument();
            left = new Either.Left(new OptionsDetailPageTradebarViewState.StatState(id, indexInstrument != null ? indexInstrument.getId() : null, z2 ? null : this.resources.getString(C11453R.string.option_detail_underlying_trade_bar_label, symbol, str), this.resources.getString(C11453R.string.option_detail_underlying_trade_bar_link_label, symbol), z2));
        }
        OptionsAccountSwitcherId optionsAccountSwitcherId = z ? pageSpecificDerivedData.getOptionsAccountSwitcherId() : null;
        List<OptionsDetailPageTradebarViewState.ActionItem> tradeBarActionItems = getTradeBarActionItems(ds);
        OptionsDetailPageTradebarViewState.TradebarError tradebarError = getTradebarError(ds, this.resources);
        List<OptionsDetailPageTradebarViewState.ActionItem> list = tradeBarActionItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((OptionsDetailPageTradebarViewState.ActionItem) it.next()).getType());
        }
        return new OptionsDetailPageTradebarViewState(tradeBarActionItems, getIntentKeys(ds, arrayList), currentAccount, pageSpecificDerivedData.getDirection(), tradebarError, left, optionsAccountSwitcherId, ds.getSelfFetchMode(), pageSpecificDerivedData.getUiStrategyInfo().getOptionStrategyInfo().getStrategyCode(), pageSpecificData.getTimestampTradeButtonTapped(), tradebarError != null ? tradebarError.getTradebarErrorComponentType() : null);
    }

    private final List<OptionsDetailPageTradebarViewState.ActionItem> getTradeBarActionItems(OptionsDetailPageTradebarDataState ds) {
        OptionsDetailPageTradebarViewState.ActionType actionType;
        List<? extends OptionsDetailPageTradebarViewState.ActionType> listEmptyList;
        Account currentAccount;
        OptionsDetailPageTradebarDataState.GlobalData globalData = ds.getGlobalData();
        OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData = ds.getPageSpecificDerivedData();
        if (pageSpecificDerivedData.getUiStrategyInfo() == null) {
            return CollectionsKt.emptyList();
        }
        Account currentAccount2 = globalData.getCurrentAccount();
        if ((currentAccount2 != null ? currentAccount2.getManagementType() : null) == ManagementType.MANAGED) {
            return CollectionsKt.emptyList();
        }
        if (pageSpecificDerivedData.getUiAggregatePositionIncludingZeroQuantity() != null && pageSpecificDerivedData.getUiStrategyInfo().isSingleLeg()) {
            UiOptionStrategyLeg uiOptionStrategyLeg = pageSpecificDerivedData.getUiStrategyInfo().getLegs().get(0);
            OptionChain optionChain = pageSpecificDerivedData.getUiStrategyInfo().getOptionChain();
            OptionInstrument optionInstrument = uiOptionStrategyLeg.getOptionInstrument();
            List<? extends OptionsDetailPageTradebarViewState.ActionType> mutableList = CollectionsKt.toMutableList((Collection) getSingleLegPositionRemovedActionsFromQuantityAndPcoAccount(globalData.getCurrentAccount(), pageSpecificDerivedData.getUiAggregatePositionIncludingZeroQuantity().getQuantity(), uiOptionStrategyLeg.getPositionType()));
            if (!pageSpecificDerivedData.getShowRollingActionItem()) {
                mutableList.add(OptionsDetailPageTradebarViewState.ActionType.ROLL);
            }
            List<? extends OptionsDetailPageTradebarViewState.ActionType> listListOf = CollectionsKt.listOf((Object[]) new OptionsDetailPageTradebarViewState.ActionType[]{OptionsDetailPageTradebarViewState.ActionType.OPTION_CHAIN, OptionsDetailPageTradebarViewState.ActionType.ROLL, OptionsDetailPageTradebarViewState.ActionType.SELL, OptionsDetailPageTradebarViewState.ActionType.BUY});
            OptionSettings optionSettings = globalData.getOptionSettings();
            return getTradebarActionItems(listListOf, mutableList, getSingleLegPositionDisabledActionsFromTradability(optionSettings != null ? optionSettings.getTradingOnExpirationState() : null, globalData.getCurrentOrNextMarketDates(), optionChain, pageSpecificDerivedData.getUiStrategyInfo().getUnderlyingType(), optionInstrument, uiOptionStrategyLeg.getPositionType()));
        }
        if (pageSpecificDerivedData.getUiAggregatePositionIncludingZeroQuantity() != null && !pageSpecificDerivedData.getUiStrategyInfo().isSingleLeg()) {
            ArrayList arrayList = new ArrayList();
            if (pageSpecificDerivedData.getUiAggregatePositionIncludingZeroQuantity().getQuantity().compareTo(BigDecimal.ZERO) == 0) {
                CollectionsKt.addAll(arrayList, CollectionsKt.listOf(OptionsDetailPageTradebarViewState.ActionType.CLOSE));
            }
            Account currentAccount3 = globalData.getCurrentAccount();
            if (currentAccount3 != null && currentAccount3.getOnlyPositionClosingTrades()) {
                CollectionsKt.addAll(arrayList, CollectionsKt.listOf(OptionsDetailPageTradebarViewState.ActionType.OPEN));
            }
            return getTradebarActionItems(CollectionsKt.listOf((Object[]) new OptionsDetailPageTradebarViewState.ActionType[]{OptionsDetailPageTradebarViewState.ActionType.OPTION_CHAIN, OptionsDetailPageTradebarViewState.ActionType.CLOSE, OptionsDetailPageTradebarViewState.ActionType.OPEN}), arrayList, CollectionsKt.emptyList());
        }
        if (pageSpecificDerivedData.getUiOptionInstrumentPositionIncludingZeroQuantity() != null) {
            BigDecimal quantity = pageSpecificDerivedData.getUiOptionInstrumentPositionIncludingZeroQuantity().getOptionInstrumentPosition().getQuantity();
            OptionInstrumentPosition optionInstrumentPosition = pageSpecificDerivedData.getUiOptionInstrumentPositionIncludingZeroQuantity().getOptionInstrumentPosition();
            OptionInstrument optionInstrument2 = pageSpecificDerivedData.getUiOptionInstrumentPositionIncludingZeroQuantity().getOptionInstrument();
            OptionChain optionChain2 = pageSpecificDerivedData.getUiStrategyInfo().getOptionChain();
            List<OptionsDetailPageTradebarViewState.ActionType> singleLegPositionRemovedActionsFromQuantityAndPcoAccount = getSingleLegPositionRemovedActionsFromQuantityAndPcoAccount(globalData.getCurrentAccount(), quantity, optionInstrumentPosition.getPositionType());
            OptionSettings optionSettings2 = globalData.getOptionSettings();
            return getTradebarActionItems(CollectionsKt.listOf((Object[]) new OptionsDetailPageTradebarViewState.ActionType[]{OptionsDetailPageTradebarViewState.ActionType.OPTION_CHAIN, OptionsDetailPageTradebarViewState.ActionType.SELL, OptionsDetailPageTradebarViewState.ActionType.BUY}), singleLegPositionRemovedActionsFromQuantityAndPcoAccount, getSingleLegPositionDisabledActionsFromTradability(optionSettings2 != null ? optionSettings2.getTradingOnExpirationState() : null, globalData.getCurrentOrNextMarketDates(), optionChain2, pageSpecificDerivedData.getUiStrategyInfo().getUnderlyingType(), optionInstrument2, optionInstrumentPosition.getPositionType()));
        }
        if (!pageSpecificDerivedData.getUiStrategyInfo().isSingleLeg() && (currentAccount = globalData.getCurrentAccount()) != null && currentAccount.getHasAccessToMultileg()) {
            ArrayList arrayList2 = new ArrayList();
            UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity = pageSpecificDerivedData.getUiAggregatePositionIncludingZeroQuantity();
            if (uiAggregatePositionIncludingZeroQuantity == null || uiAggregatePositionIncludingZeroQuantity.getQuantity().compareTo(BigDecimal.ZERO) == 0) {
                CollectionsKt.addAll(arrayList2, CollectionsKt.listOf(OptionsDetailPageTradebarViewState.ActionType.CLOSE));
            }
            if (uiAggregatePositionIncludingZeroQuantity == null || globalData.getCurrentAccount().getOnlyPositionClosingTrades()) {
                CollectionsKt.addAll(arrayList2, CollectionsKt.listOf(OptionsDetailPageTradebarViewState.ActionType.OPEN));
            }
            return getTradebarActionItems(CollectionsKt.listOf((Object[]) new OptionsDetailPageTradebarViewState.ActionType[]{OptionsDetailPageTradebarViewState.ActionType.OPTION_CHAIN, OptionsDetailPageTradebarViewState.ActionType.CLOSE, OptionsDetailPageTradebarViewState.ActionType.OPEN}), arrayList2, CollectionsKt.emptyList());
        }
        if (pageSpecificDerivedData.getUiStrategyInfo().isSingleLeg()) {
            UiOptionStrategyLeg uiOptionStrategyLeg2 = pageSpecificDerivedData.getUiStrategyInfo().getLegs().get(0);
            OptionSettings optionSettings3 = globalData.getOptionSettings();
            Tradability instrumentAdjustedTradability = getInstrumentAdjustedTradability(optionSettings3 != null ? optionSettings3.getTradingOnExpirationState() : null, globalData.getCurrentOrNextMarketDates(), pageSpecificDerivedData.getUiStrategyInfo().getOptionChain(), pageSpecificDerivedData.getUiStrategyInfo().getUnderlyingType(), uiOptionStrategyLeg2.getOptionInstrument());
            Account currentAccount4 = globalData.getCurrentAccount();
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            List<OptionsDetailPageTradebarViewState.ActionType> singleLegPositionRemovedActionsFromQuantityAndPcoAccount2 = getSingleLegPositionRemovedActionsFromQuantityAndPcoAccount(currentAccount4, ZERO, uiOptionStrategyLeg2.getPositionType());
            int i = WhenMappings.$EnumSwitchMapping$0[uiOptionStrategyLeg2.getPositionType().ordinal()];
            if (i == 1) {
                actionType = OptionsDetailPageTradebarViewState.ActionType.BUY;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                actionType = OptionsDetailPageTradebarViewState.ActionType.SELL;
            }
            if (pageSpecificDerivedData.getOppositePositionFromWatchlist() != null) {
                listEmptyList = CollectionsKt.listOf(actionType);
            } else {
                int i2 = instrumentAdjustedTradability == null ? -1 : WhenMappings.$EnumSwitchMapping$1[instrumentAdjustedTradability.ordinal()];
                if (i2 == -1 || i2 == 1) {
                    listEmptyList = CollectionsKt.emptyList();
                } else if (i2 == 2 || i2 == 3) {
                    listEmptyList = CollectionsKt.listOf((Object[]) new OptionsDetailPageTradebarViewState.ActionType[]{OptionsDetailPageTradebarViewState.ActionType.SELL, OptionsDetailPageTradebarViewState.ActionType.BUY});
                } else {
                    if (i2 == 4) {
                        throw new IllegalStateException("Not supported for options");
                    }
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listEmptyList = CollectionsKt.listOf(actionType);
                }
            }
            return getTradebarActionItems(CollectionsKt.listOf((Object[]) new OptionsDetailPageTradebarViewState.ActionType[]{OptionsDetailPageTradebarViewState.ActionType.OPTION_CHAIN, OptionsDetailPageTradebarViewState.ActionType.SELL, OptionsDetailPageTradebarViewState.ActionType.BUY}), singleLegPositionRemovedActionsFromQuantityAndPcoAccount2, listEmptyList);
        }
        return CollectionsKt.emptyList();
    }

    private final Tradability getInstrumentAdjustedTradability(OptionSettings.TradingOnExpirationState tradeOnExpirationSettings, OptionCurrentOrNextMarketDates currentOrNextMarketDates, OptionChain chain, OptionChain.UnderlyingType underlyingType, OptionInstrument instrument) {
        if (currentOrNextMarketDates == null || tradeOnExpirationSettings == null) {
            return null;
        }
        return new UiOptionInstrumentTradability(currentOrNextMarketDates, tradeOnExpirationSettings, instrument, chain, underlyingType).getAdjustedTradability();
    }

    private final List<OptionsDetailPageTradebarViewState.ActionType> getSingleLegPositionDisabledActionsFromTradability(OptionSettings.TradingOnExpirationState tradeOnExpirationSettings, OptionCurrentOrNextMarketDates currentOrNextMarketDates, OptionChain chain, OptionChain.UnderlyingType underlyingType, OptionInstrument instrument, OptionPositionType positionType) {
        Tradability instrumentAdjustedTradability = getInstrumentAdjustedTradability(tradeOnExpirationSettings, currentOrNextMarketDates, chain, underlyingType, instrument);
        int i = instrumentAdjustedTradability == null ? -1 : WhenMappings.$EnumSwitchMapping$1[instrumentAdjustedTradability.ordinal()];
        if (i == -1 || i == 1) {
            return CollectionsKt.emptyList();
        }
        if (i == 2 || i == 3) {
            return CollectionsKt.listOf((Object[]) new OptionsDetailPageTradebarViewState.ActionType[]{OptionsDetailPageTradebarViewState.ActionType.BUY, OptionsDetailPageTradebarViewState.ActionType.SELL});
        }
        if (i == 4) {
            throw new IllegalStateException("Not supported for options");
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return OptionsDetailPageTradebarErrorUtils.getSingleLegPcoDisabledActions(positionType);
    }

    private final List<OptionsDetailPageTradebarViewState.ActionType> getSingleLegPositionRemovedActionsFromQuantityAndPcoAccount(Account account, BigDecimal quantity, OptionPositionType positionType) {
        List listListOf;
        List listListOf2;
        List<OptionsDetailPageTradebarViewState.ActionType> mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.emptyList());
        if (quantity.compareTo(BigDecimal.ZERO) == 0) {
            List<OptionsDetailPageTradebarViewState.ActionType> list = mutableList;
            int i = WhenMappings.$EnumSwitchMapping$0[positionType.ordinal()];
            if (i == 1) {
                listListOf2 = CollectionsKt.listOf(OptionsDetailPageTradebarViewState.ActionType.SELL);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                listListOf2 = CollectionsKt.listOf(OptionsDetailPageTradebarViewState.ActionType.BUY);
            }
            CollectionsKt.addAll(list, listListOf2);
        }
        if (account != null && account.getOnlyPositionClosingTrades()) {
            List<OptionsDetailPageTradebarViewState.ActionType> list2 = mutableList;
            int i2 = WhenMappings.$EnumSwitchMapping$0[positionType.ordinal()];
            if (i2 == 1) {
                listListOf = CollectionsKt.listOf(OptionsDetailPageTradebarViewState.ActionType.BUY);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                listListOf = CollectionsKt.listOf(OptionsDetailPageTradebarViewState.ActionType.SELL);
            }
            CollectionsKt.addAll(list2, listListOf);
        }
        return mutableList;
    }

    private final List<OptionsDetailPageTradebarViewState.ActionItem> getTradebarActionItems(List<? extends OptionsDetailPageTradebarViewState.ActionType> actionTypes, List<? extends OptionsDetailPageTradebarViewState.ActionType> removedActions, List<? extends OptionsDetailPageTradebarViewState.ActionType> disabledActions) {
        ArrayList<OptionsDetailPageTradebarViewState.ActionType> arrayList = new ArrayList();
        for (Object obj : actionTypes) {
            if (!removedActions.contains((OptionsDetailPageTradebarViewState.ActionType) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (OptionsDetailPageTradebarViewState.ActionType actionType : arrayList) {
            arrayList2.add(new OptionsDetailPageTradebarViewState.ActionItem(!disabledActions.contains(actionType), getActionItemLabel(actionType, this.resources), actionType));
        }
        return arrayList2;
    }

    private final String getActionItemLabel(OptionsDetailPageTradebarViewState.ActionType actionType, Resources resources) throws Resources.NotFoundException {
        int i;
        switch (WhenMappings.$EnumSwitchMapping$2[actionType.ordinal()]) {
            case 1:
                i = C11453R.string.option_detail_overlay_view_chain_label;
                break;
            case 2:
                i = C32428R.string.general_label_sell;
                break;
            case 3:
                i = C32428R.string.general_label_buy;
                break;
            case 4:
                i = C23386R.string.option_effect_close;
                break;
            case 5:
                i = C23386R.string.option_effect_open;
                break;
            case 6:
                i = C23386R.string.option_effect_roll;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        String string2 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private final Map<OptionsDetailPageTradebarViewState.ActionType, IntentKey> getIntentKeys(OptionsDetailPageTradebarDataState ds, List<? extends OptionsDetailPageTradebarViewState.ActionType> actions) {
        List<UiOptionStrategyLeg> legs;
        UiOptionStrategyLeg next;
        UiOptionChain uiOptionChain;
        Account currentAccount;
        String accountNumber;
        IntentKey singleLegOrderIntentKey;
        Instrument instrument;
        Instrument instrument2;
        IntentKey multiLegOrderIntentKey;
        Instrument instrument3;
        OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData = ds.getPageSpecificDerivedData();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        UiOptionStrategyInfo uiStrategyInfo = pageSpecificDerivedData.getUiStrategyInfo();
        if (uiStrategyInfo != null && (legs = uiStrategyInfo.getLegs()) != null) {
            Iterator it = legs.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    LocalDate expirationDate = ((UiOptionStrategyLeg) next).getExpirationDate();
                    do {
                        Object next2 = it.next();
                        LocalDate expirationDate2 = ((UiOptionStrategyLeg) next2).getExpirationDate();
                        next = next;
                        if (expirationDate.compareTo(expirationDate2) > 0) {
                            next = next2;
                            expirationDate = expirationDate2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = 0;
            }
            UiOptionStrategyLeg uiOptionStrategyLeg = next;
            if (uiOptionStrategyLeg != null && (uiOptionChain = pageSpecificDerivedData.getUiOptionChain()) != null && (currentAccount = ds.getGlobalData().getCurrentAccount()) != null && (accountNumber = currentAccount.getAccountNumber()) != null) {
                for (OptionsDetailPageTradebarViewState.ActionType actionType : actions) {
                    switch (WhenMappings.$EnumSwitchMapping$2[actionType.ordinal()]) {
                        case 1:
                            List<UUID> chainIds = ds.getPageSpecificDerivedData().getChainIds();
                            if (chainIds != null) {
                                UiOptionUnderlier uiOptionUnderlier = pageSpecificDerivedData.getUiOptionUnderlier();
                                UiOptionStrategyLeg uiOptionStrategyLeg2 = uiOptionStrategyLeg;
                                singleLegOrderIntentKey = getOptionChainFragmentKey((uiOptionUnderlier == null || (instrument3 = uiOptionUnderlier.getInstrument()) == null) ? null : instrument3.getId(), chainIds, uiOptionStrategyLeg2, extensions2.toImmutableList(pageSpecificDerivedData.getUiStrategyInfo().getLegs()), accountNumber);
                                uiOptionStrategyLeg = uiOptionStrategyLeg2;
                                multiLegOrderIntentKey = singleLegOrderIntentKey;
                                linkedHashMap.put(actionType, multiLegOrderIntentKey);
                            }
                            break;
                        case 2:
                            UiOptionUnderlier uiOptionUnderlier2 = pageSpecificDerivedData.getUiOptionUnderlier();
                            singleLegOrderIntentKey = getSingleLegOrderIntentKey((uiOptionUnderlier2 == null || (instrument = uiOptionUnderlier2.getInstrument()) == null) ? null : instrument.getId(), OrderSide.SELL, pageSpecificDerivedData.getUiStrategyInfo().getOptionStrategyInfo().getStrategyCode(), uiOptionStrategyLeg, accountNumber, ds.getSource(), uiOptionChain);
                            multiLegOrderIntentKey = singleLegOrderIntentKey;
                            linkedHashMap.put(actionType, multiLegOrderIntentKey);
                            break;
                        case 3:
                            UiOptionUnderlier uiOptionUnderlier3 = pageSpecificDerivedData.getUiOptionUnderlier();
                            singleLegOrderIntentKey = getSingleLegOrderIntentKey((uiOptionUnderlier3 == null || (instrument2 = uiOptionUnderlier3.getInstrument()) == null) ? null : instrument2.getId(), OrderSide.BUY, pageSpecificDerivedData.getUiStrategyInfo().getOptionStrategyInfo().getStrategyCode(), uiOptionStrategyLeg, accountNumber, ds.getSource(), uiOptionChain);
                            multiLegOrderIntentKey = singleLegOrderIntentKey;
                            linkedHashMap.put(actionType, multiLegOrderIntentKey);
                            break;
                        case 4:
                            UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity = pageSpecificDerivedData.getUiAggregatePositionIncludingZeroQuantity();
                            if (uiAggregatePositionIncludingZeroQuantity == null) {
                                throw new IllegalStateException("Has CLOSE action item without an aggregate position!");
                            }
                            multiLegOrderIntentKey = getMultiLegOrderIntentKey(uiAggregatePositionIncludingZeroQuantity, OrderPositionEffect.CLOSE, accountNumber, ds.getSource(), pageSpecificDerivedData.getUiStrategyInfo().getOptionStrategyInfo().getStrategyCode());
                            linkedHashMap.put(actionType, multiLegOrderIntentKey);
                        case 5:
                            UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity2 = pageSpecificDerivedData.getUiAggregatePositionIncludingZeroQuantity();
                            if (uiAggregatePositionIncludingZeroQuantity2 == null) {
                                throw new IllegalStateException("Has OPEN action item without an aggregate position!");
                            }
                            multiLegOrderIntentKey = getMultiLegOrderIntentKey(uiAggregatePositionIncludingZeroQuantity2, OrderPositionEffect.OPEN, accountNumber, ds.getSource(), pageSpecificDerivedData.getUiStrategyInfo().getOptionStrategyInfo().getStrategyCode());
                            linkedHashMap.put(actionType, multiLegOrderIntentKey);
                        case 6:
                            multiLegOrderIntentKey = getRollingIntentKey(accountNumber, pageSpecificDerivedData.getUiStrategyInfo().getOptionStrategyInfo().getStrategyCode());
                            linkedHashMap.put(actionType, multiLegOrderIntentKey);
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private final OptionChainIntentKey getOptionChainFragmentKey(UUID equityInstrumentId, List<UUID> chainIds, UiOptionStrategyLeg leg, ImmutableList<? extends UiOptionStrategyLegDisplay> targetLegs, String accountNumber) {
        return new OptionChainIntentKey(equityInstrumentId, new OptionChainIdLaunchMode.MultipleChainIds(chainIds), targetLegs, new OptionOrderFilter(chainIds, leg.getOptionInstrument().getContractType(), leg.getPositionType().getSide()), accountNumber, (String) null, 32, (DefaultConstructorMarker) null);
    }

    private final IntentKey getSingleLegOrderIntentKey(UUID equityInstrumentId, OrderSide side, String strategyCode, UiOptionStrategyLeg leg, String accountNumber, OptionsTradeBarSource source, UiOptionChain uiOptionChain) {
        return new OptionOrderIntentKey.FromOptionOrderBundle(null, accountNumber, OptionBundles.toLegBundle(leg, equityInstrumentId, side, uiOptionChain).toSingleLegOrder(), null, null, null, null, false, false, false, null, source.toOrderFormSource(), strategyCode, null, 9721, null);
    }

    private final IntentKey getMultiLegOrderIntentKey(UiAggregateOptionPositionFull aggregatePosition, OrderPositionEffect positionEffect, String accountNumber, OptionsTradeBarSource source, String strategyCode) {
        return new OptionOrderIntentKey.FromOptionOrderBundle(null, accountNumber, OptionBundles.toOrderBundle(aggregatePosition, positionEffect), null, null, null, null, false, false, false, null, source.toOrderFormSource(), strategyCode, null, 9721, null);
    }

    private final IntentKey getRollingIntentKey(String accountNumber, String strategyCode) {
        return new LegacyIntentKey.OptionRolling(accountNumber, strategyCode);
    }

    private final OptionsDetailPageTradebarViewState.TradebarError getTradebarError(OptionsDetailPageTradebarDataState ds, Resources res) throws Resources.NotFoundException {
        OptionSettings optionSettings;
        OptionSettings.TradingOnExpirationState tradingOnExpirationState;
        OptionsDetailPageTradebarDataState.GlobalData globalData = ds.getGlobalData();
        OptionsDetailPageTradebarDataState.PageSpecificDerivedData pageSpecificDerivedData = ds.getPageSpecificDerivedData();
        if (ds.getShouldHideErrorBanner() || pageSpecificDerivedData.getUiStrategyInfo() == null) {
            return null;
        }
        Account currentAccount = ds.getGlobalData().getCurrentAccount();
        if ((currentAccount != null ? currentAccount.getManagementType() : null) == ManagementType.MANAGED) {
            return null;
        }
        Account currentAccount2 = ds.getGlobalData().getCurrentAccount();
        if (currentAccount2 != null && currentAccount2.getOnlyPositionClosingTrades()) {
            String string2 = res.getString(C11453R.string.option_detail_trade_bar_account_pco);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return new OptionsDetailPageTradebarViewState.TradebarError.NoCtaError(string2, Component.ComponentType.ACCOUNT_PCO_DIALOG);
        }
        if (pageSpecificDerivedData.getUiStrategyInfo().isSingleLeg() && (pageSpecificDerivedData.getUiAggregatePositionIncludingZeroQuantity() != null || pageSpecificDerivedData.getUiOptionInstrumentPositionIncludingZeroQuantity() != null)) {
            UiOptionStrategyLeg uiOptionStrategyLeg = pageSpecificDerivedData.getUiStrategyInfo().getLegs().get(0);
            OptionChain optionChain = pageSpecificDerivedData.getUiStrategyInfo().getOptionChain();
            OptionInstrument optionInstrument = uiOptionStrategyLeg.getOptionInstrument();
            OptionSettings optionSettings2 = globalData.getOptionSettings();
            Tradability instrumentAdjustedTradability = getInstrumentAdjustedTradability(optionSettings2 != null ? optionSettings2.getTradingOnExpirationState() : null, globalData.getCurrentOrNextMarketDates(), optionChain, pageSpecificDerivedData.getUiStrategyInfo().getUnderlyingType(), optionInstrument);
            boolean inSelloutImprovementExperiment = globalData.getInSelloutImprovementExperiment();
            int i = WhenMappings.$EnumSwitchMapping$3[pageSpecificDerivedData.getUiStrategyInfo().getUnderlyingType().ordinal()];
            if (i == 1) {
                return OptionsDetailPageTradebarErrorUtils.getEquityOptionSingleLegTradebarError(instrumentAdjustedTradability, this.clock, optionInstrument, uiOptionStrategyLeg.getPositionType(), res, inSelloutImprovementExperiment);
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return OptionsDetailPageTradebarErrorUtils.getIndexOptionSingleLegTradebarError(instrumentAdjustedTradability, this.clock, optionInstrument, uiOptionStrategyLeg.getPositionType(), res, optionChain.getSettleOnOpen());
        }
        if ((pageSpecificDerivedData.getUiAggregatePositionIncludingZeroQuantity() == null || pageSpecificDerivedData.getUiStrategyInfo().isSingleLeg()) && pageSpecificDerivedData.getUiStrategyInfo().isSingleLeg()) {
            if (pageSpecificDerivedData.getOppositePositionFromWatchlist() != null) {
                String string3 = res.getString(C11453R.string.option_detail_trade_bar_opposing_position);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = res.getString(C11453R.string.option_detail_trade_bar_opposing_position_cta);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return new OptionsDetailPageTradebarViewState.TradebarError.GoToOpposingPosition(string3, string4, new OptionsDetailPageFragmentKey(new OptionsDetailPageLaunchMode.OptionPositionId(pageSpecificDerivedData.getOppositePositionFromWatchlist().getId(), CollectionsKt.listOf(pageSpecificDerivedData.getOppositePositionFromWatchlist().getId()), pageSpecificDerivedData.getOppositePositionFromWatchlist().getAccountNumber(), null, 8, null)));
            }
            UiOptionStrategyLeg uiOptionStrategyLeg2 = pageSpecificDerivedData.getUiStrategyInfo().getLegs().get(0);
            OptionChain optionChain2 = pageSpecificDerivedData.getUiStrategyInfo().getOptionChain();
            OptionInstrument optionInstrument2 = uiOptionStrategyLeg2.getOptionInstrument();
            OptionSettings optionSettings3 = globalData.getOptionSettings();
            Tradability instrumentAdjustedTradability2 = getInstrumentAdjustedTradability(optionSettings3 != null ? optionSettings3.getTradingOnExpirationState() : null, globalData.getCurrentOrNextMarketDates(), optionChain2, pageSpecificDerivedData.getUiStrategyInfo().getUnderlyingType(), optionInstrument2);
            int i2 = instrumentAdjustedTradability2 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[instrumentAdjustedTradability2.ordinal()];
            if (i2 == -1 || i2 == 1) {
                return null;
            }
            if (i2 == 2 || i2 == 3) {
                String string5 = res.getString(C11453R.string.option_detail_trade_bar_contract_untradable);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return new OptionsDetailPageTradebarViewState.TradebarError.NoCtaError(string5, Component.ComponentType.OPTION_UNTRADABLE_DIALOG);
            }
            if (i2 == 4) {
                throw new IllegalStateException("Not supported for options");
            }
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (optionInstrument2.isExpiringToday(this.clock) && (optionSettings = ds.getGlobalData().getOptionSettings()) != null && (tradingOnExpirationState = optionSettings.getTradingOnExpirationState()) != null && tradingOnExpirationState.isEnabled()) {
                String string6 = res.getString(C11453R.string.option_detail_trade_bar_watchlist_expiration);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return new OptionsDetailPageTradebarViewState.TradebarError.NoCtaError(string6, Component.ComponentType.OPTION_PCO_DIALOG);
            }
            if (optionInstrument2.isExpiringToday(this.clock)) {
                String string7 = res.getString(C11453R.string.option_detail_trade_bar_watchlist_expiration_without_ft);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                String string8 = res.getString(C11048R.string.general_action_learn_more);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return new OptionsDetailPageTradebarViewState.TradebarError.GoToTradeOnExpirationSettings(string7, string8, Component.ComponentType.OPTION_PCO_DIALOG);
            }
            String string9 = res.getString(C11453R.string.option_detail_trade_bar_watchlist_item_pco);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            return new OptionsDetailPageTradebarViewState.TradebarError.NoCtaError(string9, Component.ComponentType.OPTION_PCO_DIALOG);
        }
        return null;
    }
}
