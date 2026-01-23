package com.robinhood.android.options.history.detail.order;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.StringHelper;
import com.robinhood.android.common.options.order.OptionOrderType2;
import com.robinhood.android.common.options.strategy.OptionStrategyCodes2;
import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.options.aggregatequotes.ClientAggregateOptionStrategyQuote;
import com.robinhood.android.options.aggregatequotes.OptionQuoteAggregator;
import com.robinhood.android.options.contracts.OptionChainIdLaunchMode;
import com.robinhood.android.options.contracts.OptionChainIntentKey;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.contracts.OptionStatisticsFragmentKey;
import com.robinhood.android.options.contracts.OptionStatisticsLaunchMode;
import com.robinhood.android.options.history.detail.C23086R;
import com.robinhood.android.options.history.detail.extensions.UiOptionOrders;
import com.robinhood.android.options.history.detail.extensions.UnderlyingTypes;
import com.robinhood.android.options.history.detail.order.OptionOrderDetailViewState;
import com.robinhood.android.options.optionsstring.C23386R;
import com.robinhood.android.options.optionsstring.datetime.OptionDateFormatter;
import com.robinhood.android.options.tradability.UiOptionInstrumentTradability;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.common.strings.C32428R;
import com.robinhood.common.strings.OptionOrders;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.Decimals;
import com.robinhood.models.Decimals3;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Document;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrumentPosition;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionLevel;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OptionOrderDetailScreen;
import com.robinhood.models.p320db.OptionOrderExecution;
import com.robinhood.models.p320db.OptionOrderFilter;
import com.robinhood.models.p320db.OptionOrderLeg;
import com.robinhood.models.p320db.OptionOrderSalesTax;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTrigger;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import com.robinhood.models.p320db.bonfire.WithholdingAmount2;
import com.robinhood.models.p355ui.OptionBundles;
import com.robinhood.models.p355ui.OptionChainBundle;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.OptionStatisticsTradableState;
import com.robinhood.models.p355ui.OptionUnderlyings;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.p355ui.UiOptionOrderLeg;
import com.robinhood.models.p355ui.UiOptionStrategyDisplay;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.OptionOrderDetailContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.documents.contracts.DocumentDownloadKey;
import com.robinhood.shared.documents.contracts.DocumentDownloadLaunchMode;
import com.robinhood.shared.models.history.shared.OrderState;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;
import rosetta.option.OptionOrderFormSource;

/* compiled from: OptionOrderDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\"B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0016JV\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J4\u0010\u001f\u001a\u00020 *\b\u0012\u0004\u0012\u00020\u00100!2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailDataState;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "getPlaceOrderAgainIntentKey", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;", "ds", "reduce", "dataState", "getInfoItems", "", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailViewState$InfoItem;", "accountNumber", "", "profitAndLossTradeItem", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "uiOptionOrder", "Lcom/robinhood/models/ui/UiOptionOrder;", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "withholdingAmount", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "shouldShowCatFeeNewCopy", "", "userLocale", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "addInfoItemFees", "", "", "Companion", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOrderDetailStateProvider implements StateProvider<OptionOrderDetailDataState, Optional<? extends OptionOrderDetailViewState>> {
    private final Resources resources;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionOrderDetailStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Experiments.OptionsPlaceAgain.Variant.values().length];
            try {
                iArr[Experiments.OptionsPlaceAgain.Variant.CONTROL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Experiments.OptionsPlaceAgain.Variant.PLACE_AGAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Experiments.OptionsPlaceAgain.Variant.CREATE_DUPLICATE_ORDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr2[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: OptionOrderDetailStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J'\u0010\n\u001a\u0004\u0018\u00010\u000b*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\"\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002J\f\u0010\u0016\u001a\u00020\u0017*\u00020\u0018H\u0002J\u0014\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J*\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010\u000e2\u0006\u0010&\u001a\u00020'H\u0002J \u0010.\u001a\u00020\u00172\u0006\u0010,\u001a\u00020%2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002J4\u00103\u001a\b\u0012\u0004\u0012\u000205042\b\u00106\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0018\u0010\u0019\u001a\u00020\u0017*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u00020\u0017*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0018\u0010\u001e\u001a\u00020\u001f*\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0018\u0010:\u001a\u00020\t*\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0018\u0010=\u001a\u00020\u001f*\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailStateProvider$Companion;", "", "<init>", "()V", "getLimitPriceString", "", "resources", "Landroid/content/res/Resources;", "limitPrice", "Ljava/math/BigDecimal;", "toAggregateQuote", "Lcom/robinhood/android/options/aggregatequotes/ClientAggregateOptionStrategyQuote;", "", "Ljava/util/UUID;", "Lcom/robinhood/models/db/OptionInstrumentQuote;", "uiOptionOrder", "Lcom/robinhood/models/ui/UiOptionOrder;", "toAggregateQuote$feature_options_history_detail_externalDebug", "getLegContext", "Lcom/robinhood/android/options/aggregatequotes/OptionQuoteAggregator$LegContext;", "Lcom/robinhood/models/db/OptionOrderLeg;", "legQuotesMap", "getStringResource", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/ui/UiOptionStrategyDisplay$OptionOrderPositionEffect;", "sideStringResource", "getSideStringResource", "(Lcom/robinhood/models/db/OptionOrderLeg;)Lcom/robinhood/utils/resource/StringResource;", "positionEffectStringResource", "getPositionEffectStringResource", "resId", "", "Lcom/robinhood/models/db/OptionContractType;", "getResId", "(Lcom/robinhood/models/db/OptionContractType;)I", "toLegBundle", "Lcom/robinhood/models/ui/OptionLegBundle;", "Lcom/robinhood/models/ui/UiOptionOrderLeg;", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "createLegRow", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailViewState$LegRow;", "orderState", "Lcom/robinhood/shared/models/history/shared/OrderState;", "uiOptionOrderLeg", "optionLegQuote", "getTitleResource", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "settleOnOpen", "", "getActionRows", "", "Lcom/robinhood/android/options/history/detail/order/OptionOrderDetailViewState$ActionRow;", "indexInstrument", "Lcom/robinhood/android/indexes/models/db/Index;", "instrument", "Lcom/robinhood/models/db/Instrument;", "averageExecutionPrice", "getAverageExecutionPrice", "(Lcom/robinhood/models/ui/UiOptionOrderLeg;)Ljava/math/BigDecimal;", "labelResId", "getLabelResId", "(Lcom/robinhood/shared/models/history/shared/OrderState;)I", "feature-options-history-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {

        /* compiled from: OptionOrderDetailStateProvider.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;
            public static final /* synthetic */ int[] $EnumSwitchMapping$3;
            public static final /* synthetic */ int[] $EnumSwitchMapping$4;
            public static final /* synthetic */ int[] $EnumSwitchMapping$5;

            static {
                int[] iArr = new int[UiOptionStrategyDisplay.OptionOrderPositionEffect.values().length];
                try {
                    iArr[UiOptionStrategyDisplay.OptionOrderPositionEffect.OPEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UiOptionStrategyDisplay.OptionOrderPositionEffect.CLOSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[UiOptionStrategyDisplay.OptionOrderPositionEffect.CUSTOM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[OrderSide.values().length];
                try {
                    iArr2[OrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[OrderSide.SELL.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[OrderPositionEffect.values().length];
                try {
                    iArr3[OrderPositionEffect.OPEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr3[OrderPositionEffect.CLOSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$2 = iArr3;
                int[] iArr4 = new int[OptionContractType.values().length];
                try {
                    iArr4[OptionContractType.CALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr4[OptionContractType.PUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$3 = iArr4;
                int[] iArr5 = new int[OptionChain.UnderlyingType.values().length];
                try {
                    iArr5[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr5[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
                } catch (NoSuchFieldError unused11) {
                }
                $EnumSwitchMapping$4 = iArr5;
                int[] iArr6 = new int[OrderState.values().length];
                try {
                    iArr6[OrderState.QUEUED.ordinal()] = 1;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr6[OrderState.NEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr6[OrderState.UNCONFIRMED.ordinal()] = 3;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr6[OrderState.CONFIRMED.ordinal()] = 4;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr6[OrderState.PARTIALLY_FILLED.ordinal()] = 5;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr6[OrderState.PARTIALLY_FILLED_REST_CANCELLED.ordinal()] = 6;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr6[OrderState.PENDING_CANCELLED.ordinal()] = 7;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr6[OrderState.FILLED.ordinal()] = 8;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr6[OrderState.REJECTED.ordinal()] = 9;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr6[OrderState.FAILED.ordinal()] = 10;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr6[OrderState.VOIDED.ordinal()] = 11;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr6[OrderState.CANCELED.ordinal()] = 12;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr6[OrderState.TRIGGERED.ordinal()] = 13;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr6[OrderState.NOT_ACCEPTED.ordinal()] = 14;
                } catch (NoSuchFieldError unused25) {
                }
                $EnumSwitchMapping$5 = iArr6;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CharSequence getLimitPriceString(Resources resources, BigDecimal limitPrice) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) resources.getString(C23086R.string.option_order_detail_single_leg_subtitle));
            spannableStringBuilder.append(' ');
            StyleSpan styleSpan = new StyleSpan(1);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Formats.getAmountFormat().format(limitPrice));
            spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
            return new SpannedString(spannableStringBuilder);
        }

        private Companion() {
        }

        public final ClientAggregateOptionStrategyQuote toAggregateQuote$feature_options_history_detail_externalDebug(Map<UUID, OptionInstrumentQuote> map, UiOptionOrder uiOptionOrder) {
            Intrinsics.checkNotNullParameter(map, "<this>");
            Intrinsics.checkNotNullParameter(uiOptionOrder, "uiOptionOrder");
            List<UiOptionOrderLeg> legs = uiOptionOrder.getLegs();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
            Iterator<T> it = legs.iterator();
            while (it.hasNext()) {
                OptionQuoteAggregator.LegContext legContext = OptionOrderDetailStateProvider.INSTANCE.getLegContext(((UiOptionOrderLeg) it.next()).getLeg(), map);
                if (legContext == null) {
                    return null;
                }
                arrayList.add(legContext);
            }
            return new ClientAggregateOptionStrategyQuote(arrayList, uiOptionOrder.getDirection());
        }

        private final OptionQuoteAggregator.LegContext getLegContext(OptionOrderLeg optionOrderLeg, Map<UUID, OptionInstrumentQuote> map) {
            OptionInstrumentQuote optionInstrumentQuote = map.get(optionOrderLeg.getOptionId());
            if (optionInstrumentQuote == null) {
                return null;
            }
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(optionOrderLeg.getRatioQuantity());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            return new OptionQuoteAggregator.LegContext(optionInstrumentQuote, optionOrderLeg.getSide(), bigDecimalValueOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final StringResource getStringResource(UiOptionStrategyDisplay.OptionOrderPositionEffect optionOrderPositionEffect) {
            int i = WhenMappings.$EnumSwitchMapping$0[optionOrderPositionEffect.ordinal()];
            if (i == 1) {
                return StringResource.INSTANCE.invoke(C23386R.string.option_effect_open, new Object[0]);
            }
            if (i == 2) {
                return StringResource.INSTANCE.invoke(C23386R.string.option_effect_close, new Object[0]);
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
        }

        private final StringResource getSideStringResource(OptionOrderLeg optionOrderLeg) {
            int i;
            StringResource.Companion companion = StringResource.INSTANCE;
            int i2 = WhenMappings.$EnumSwitchMapping$1[optionOrderLeg.getSide().ordinal()];
            if (i2 == 1) {
                i = C23086R.plurals.option_order_leg_side_buy;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C23086R.plurals.option_order_leg_side_sell;
            }
            return companion.invoke(new StringResource.PluralsResource(i, optionOrderLeg.getRatioQuantity()), new Object[0]);
        }

        private final StringResource getPositionEffectStringResource(OptionOrderLeg optionOrderLeg) {
            int i;
            StringResource.Companion companion = StringResource.INSTANCE;
            int i2 = WhenMappings.$EnumSwitchMapping$2[optionOrderLeg.getPositionEffect().ordinal()];
            if (i2 == 1) {
                i = C23086R.string.option_order_leg_effect_open;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C23086R.string.option_order_leg_effect_close;
            }
            return companion.invoke(i, new Object[0]);
        }

        private final int getResId(OptionContractType optionContractType) {
            int i = WhenMappings.$EnumSwitchMapping$3[optionContractType.ordinal()];
            if (i == 1) {
                return C11048R.string.option_contract_type_call;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return C11048R.string.option_contract_type_put;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final OptionLegBundle toLegBundle(UiOptionOrderLeg uiOptionOrderLeg, UiOptionChain uiOptionChain) {
            return OptionBundles.toLegBundle(uiOptionOrderLeg, new OptionChainBundle(null, uiOptionOrderLeg.getOptionInstrument().getOptionChainId(), uiOptionChain));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final OptionOrderDetailViewState.LegRow createLegRow(OrderState orderState, UiOptionOrderLeg uiOptionOrderLeg, OptionInstrumentQuote optionLegQuote, UiOptionChain uiOptionChain) {
            StringResource stringResourceInvoke;
            Boolean boolIsSuccessful = orderState.isSuccessful();
            Boolean bool = Boolean.TRUE;
            boolean z = !Intrinsics.areEqual(boolIsSuccessful, bool);
            StringResource titleResource = getTitleResource(uiOptionOrderLeg, uiOptionChain.getUnderlyingType(), uiOptionChain.getOptionChain().getSettleOnOpen());
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke2 = companion.invoke(C23086R.string.option_order_leg_subtitle, Integer.valueOf(uiOptionOrderLeg.getLeg().getRatioQuantity()), getSideStringResource(uiOptionOrderLeg.getLeg()), getPositionEffectStringResource(uiOptionOrderLeg.getLeg()));
            if (Intrinsics.areEqual(orderState.isSuccessful(), bool)) {
                stringResourceInvoke = companion.invoke(Formats.getPriceFormat().format(getAverageExecutionPrice(uiOptionOrderLeg)));
            } else if (optionLegQuote != null) {
                stringResourceInvoke = companion.invoke(Formats.getPriceFormat().format(optionLegQuote.getAdjustedMarkPrice().getUnsignedValue()));
            } else {
                stringResourceInvoke = companion.invoke(C11048R.string.general_label_n_a_short, new Object[0]);
            }
            return new OptionOrderDetailViewState.LegRow(z, titleResource, stringResourceInvoke2, stringResourceInvoke, new OptionStatisticsFragmentKey(toLegBundle(uiOptionOrderLeg, uiOptionChain), null, OptionStatisticsTradableState.NotAvailable.INSTANCE, OptionStatisticsLaunchMode.INFO_ONLY, false, 18, null), UiOptionOrders.getOptionOrderDetailLegContext(uiOptionOrderLeg.getLeg(), orderState));
        }

        private final StringResource getTitleResource(UiOptionOrderLeg uiOptionOrderLeg, OptionChain.UnderlyingType underlyingType, boolean settleOnOpen) {
            int i;
            int i2 = WhenMappings.$EnumSwitchMapping$4[underlyingType.ordinal()];
            if (i2 == 1) {
                StringResource.Companion companion = StringResource.INSTANCE;
                return companion.invoke(C23086R.string.option_order_leg_title, OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER().format(uiOptionOrderLeg.getOptionInstrument().getExpirationDate()), Formats.getStrikePriceFormat().format(uiOptionOrderLeg.getOptionInstrument().getStrikePrice()), companion.invoke(getResId(uiOptionOrderLeg.getOptionInstrument().getContractType()), new Object[0]));
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String str = OptionUnderlyings.getStrikeFormatter(underlyingType).format(uiOptionOrderLeg.getOptionInstrument().getStrikePrice());
            if (settleOnOpen) {
                i = C23086R.string.option_order_leg_title_settle_on_open;
            } else {
                i = C23086R.string.option_order_leg_title;
            }
            StringResource.Companion companion2 = StringResource.INSTANCE;
            return companion2.invoke(i, str, companion2.invoke(getResId(uiOptionOrderLeg.getOptionInstrument().getContractType()), new Object[0]), OptionDateFormatter.getOPTION_EXPIRY_DATE_FORMATTER().format(uiOptionOrderLeg.getOptionInstrument().getExpirationDate()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<OptionOrderDetailViewState.ActionRow> getActionRows(Index indexInstrument, Instrument instrument, UiOptionChain uiOptionChain, UiOptionOrder uiOptionOrder) {
            String symbol;
            String str;
            UUID tradableChainId;
            StringResource stringResourceInvoke;
            ArrayList arrayList = new ArrayList();
            OptionChainIdLaunchMode singleChainId = null;
            UUID singleEquityUnderlyingId = uiOptionChain != null ? uiOptionChain.getSingleEquityUnderlyingId() : null;
            UiOptionOrderLeg uiOptionOrderLeg = (UiOptionOrderLeg) CollectionsKt.singleOrNull((List) uiOptionOrder.getLegs());
            if (uiOptionOrder.getIsPending() && uiOptionOrderLeg != null && uiOptionChain != null) {
                UserInteractionEventData.Action action = UserInteractionEventData.Action.VIEW_OPTION_STRATEGY_DETAIL;
                StringResource.Companion companion = StringResource.INSTANCE;
                int i = C23086R.string.option_order_view_bottom_sheet_label;
                int i2 = WhenMappings.$EnumSwitchMapping$3[uiOptionOrderLeg.getOptionInstrument().getContractType().ordinal()];
                if (i2 == 1) {
                    stringResourceInvoke = companion.invoke(C11048R.string.option_contract_type_call, new Object[0]);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stringResourceInvoke = companion.invoke(C11048R.string.option_contract_type_put, new Object[0]);
                }
                arrayList.add(new OptionOrderDetailViewState.ActionRow(action, companion.invoke(i, stringResourceInvoke), new OptionStatisticsFragmentKey(toLegBundle(uiOptionOrderLeg, uiOptionChain), null, OptionStatisticsTradableState.NotAvailable.INSTANCE, OptionStatisticsLaunchMode.INFO_ONLY, false, 18, null)));
            }
            UUID underlyingId = uiOptionChain != null ? UnderlyingTypes.getUnderlyingId(uiOptionChain) : null;
            OptionChain.UnderlyingType underlyingType = uiOptionChain != null ? uiOptionChain.getUnderlyingType() : null;
            int i3 = underlyingType == null ? -1 : WhenMappings.$EnumSwitchMapping$4[underlyingType.ordinal()];
            if (i3 != 1) {
                if (i3 == 2 && indexInstrument != null) {
                    symbol = indexInstrument.getSymbol();
                    str = symbol;
                }
                str = null;
            } else {
                if (instrument != null) {
                    symbol = instrument.getSymbol();
                    str = symbol;
                }
                str = null;
            }
            OptionChain.UnderlyingType underlyingType2 = uiOptionChain != null ? uiOptionChain.getUnderlyingType() : null;
            int i4 = underlyingType2 != null ? WhenMappings.$EnumSwitchMapping$4[underlyingType2.ordinal()] : -1;
            if (i4 != 1) {
                if (i4 == 2 && indexInstrument != null) {
                    singleChainId = new OptionChainIdLaunchMode.MultipleChainIds(indexInstrument.getTradableChainIds());
                }
            } else if (instrument != null && (tradableChainId = instrument.getTradableChainId()) != null) {
                singleChainId = new OptionChainIdLaunchMode.SingleChainId(tradableChainId);
            }
            OptionChainIdLaunchMode optionChainIdLaunchMode = singleChainId;
            if (str != null && optionChainIdLaunchMode != null) {
                arrayList.add(new OptionOrderDetailViewState.ActionRow(UserInteractionEventData.Action.VIEW_OPTION_CHAIN, StringResource.INSTANCE.invoke(C23086R.string.option_order_view_chain_label, str), new OptionChainIntentKey(singleEquityUnderlyingId, optionChainIdLaunchMode, extensions2.toImmutableList(uiOptionOrder.getLegs()), (OptionOrderFilter) null, uiOptionOrder.getAccountNumber(), (String) null, 40, (DefaultConstructorMarker) null)));
            }
            if (underlyingId != null && str != null) {
                arrayList.add(new OptionOrderDetailViewState.ActionRow(UserInteractionEventData.Action.VIEW_STOCK_DETAIL_PAGE, StringResource.INSTANCE.invoke(C23086R.string.option_order_view_equity_label, str), UnderlyingTypes.getInstrumentDetailKey(uiOptionChain.getUnderlyingType(), underlyingId, uiOptionOrder.getAccountNumber(), InstrumentDetailSource.OPTIONS_ORDER_DETAIL)));
            }
            return arrayList;
        }

        private final BigDecimal getAverageExecutionPrice(UiOptionOrderLeg uiOptionOrderLeg) {
            List<OptionOrderExecution> executions = uiOptionOrderLeg.getExecutions();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            for (OptionOrderExecution optionOrderExecution : executions) {
                BigDecimal bigDecimalMultiply = optionOrderExecution.getPrice().multiply(optionOrderExecution.getQuantity());
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                bigDecimalValueOf = bigDecimalValueOf.add(bigDecimalMultiply);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
            }
            List<OptionOrderExecution> executions2 = uiOptionOrderLeg.getExecutions();
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(0L);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            Iterator<T> it = executions2.iterator();
            while (it.hasNext()) {
                bigDecimalValueOf2 = bigDecimalValueOf2.add(((OptionOrderExecution) it.next()).getQuantity());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "add(...)");
            }
            return BigDecimals7.safeDivide(bigDecimalValueOf, bigDecimalValueOf2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getLabelResId(OrderState orderState) {
            switch (WhenMappings.$EnumSwitchMapping$5[orderState.ordinal()]) {
                case 1:
                    return C32428R.string.order_state_queued;
                case 2:
                case 3:
                    return C32428R.string.order_state_pending;
                case 4:
                    return C32428R.string.order_state_placed;
                case 5:
                case 6:
                    return C32428R.string.order_state_partially_filled;
                case 7:
                    return C32428R.string.order_state_pending_cancel;
                case 8:
                    return C32428R.string.order_state_filled;
                case 9:
                case 10:
                case 11:
                    return C32428R.string.order_state_rejected;
                case 12:
                    return C32428R.string.order_state_canceled;
                case 13:
                    return C32428R.string.order_state_triggered;
                case 14:
                    throw new IllegalStateException("Unsupported order state");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    public OptionOrderDetailStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[LOOP:4: B:72:0x014c->B:149:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final OptionOrderIntentKey getPlaceOrderAgainIntentKey(OptionOrderDetailDataState ds) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (ds.getOptionsPlaceAgainVariant() == Experiments.OptionsPlaceAgain.Variant.CONTROL || ds.getUiOptionOrder() == null || ds.getUiOptionChain() == null || ds.getAccount() == null || ds.getOptionSettings() == null || ds.getCurrentOrNextMarketDates() == null) {
            return null;
        }
        List<UiOptionOrderLeg> legs = ds.getUiOptionOrder().getLegs();
        if (legs.isEmpty()) {
            return null;
        }
        List<UiOptionOrderLeg> list = legs;
        ArrayList<Tuples2> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (UiOptionOrderLeg uiOptionOrderLeg : list) {
            arrayList.add(Tuples4.m3642to(uiOptionOrderLeg, new UiOptionInstrumentTradability(ds.getCurrentOrNextMarketDates(), ds.getOptionSettings().getTradingOnExpirationState(), uiOptionOrderLeg.getOptionInstrument(), ds.getUiOptionChain())));
        }
        OrderState state = ds.getUiOptionOrder().getOptionOrder().getState();
        if ((state != OrderState.CANCELED && state != OrderState.FILLED) || ds.getUiOptionOrder().getOptionOrder().getType() != OrderType.LIMIT) {
            return null;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((UiOptionInstrumentTradability) ((Tuples2) it.next()).getSecond()).getAdjustedTradability() == Tradability.UNTRADABLE) {
                    return null;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            for (Tuples2 tuples2 : arrayList) {
                if (((UiOptionInstrumentTradability) tuples2.getSecond()).getAdjustedTradability() == Tradability.POSITION_CLOSING_ONLY && ((UiOptionOrderLeg) tuples2.getFirst()).getLeg().getPositionEffect() == OrderPositionEffect.OPEN) {
                    return null;
                }
            }
        }
        boolean z5 = list instanceof Collection;
        if (z5 && list.isEmpty()) {
            z = true;
        } else {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((UiOptionOrderLeg) it2.next()).getLeg().getPositionEffect() != OrderPositionEffect.CLOSE) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        if (ds.getAccount().getOnlyPositionClosingTrades() && !z) {
            return null;
        }
        if (z5 && list.isEmpty()) {
            z3 = true;
            z2 = true;
        } else {
            Iterator<T> it3 = list.iterator();
            z2 = true;
            while (true) {
                if (!it3.hasNext()) {
                    z3 = true;
                    break;
                }
                OptionOrderLeg leg = ((UiOptionOrderLeg) it3.next()).getLeg();
                UiOptionInstrumentPosition uiOptionInstrumentPosition = ds.getOptionInstrumentPositionMap().get(leg.getOptionId());
                OptionInstrumentPosition optionInstrumentPosition = uiOptionInstrumentPosition != null ? uiOptionInstrumentPosition.getOptionInstrumentPosition() : null;
                if (leg.getPositionEffect() != OrderPositionEffect.OPEN) {
                    if (optionInstrumentPosition != null && optionInstrumentPosition.getOrderSide() != leg.getSide()) {
                        BigDecimal closeableQuantity = optionInstrumentPosition.getCloseableQuantity();
                        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(leg.getRatioQuantity());
                        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                        if (closeableQuantity.compareTo(bigDecimalValueOf) >= 0) {
                            if (z2) {
                                BigDecimal closeableQuantity2 = optionInstrumentPosition.getCloseableQuantity();
                                BigDecimal quantity = ds.getUiOptionOrder().getQuantity();
                                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(leg.getRatioQuantity());
                                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                                BigDecimal bigDecimalMultiply = quantity.multiply(bigDecimalValueOf2);
                                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                                z2 = closeableQuantity2.compareTo(bigDecimalMultiply) >= 0;
                                z4 = true;
                                if (!z4) {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                    }
                    z4 = false;
                    if (!z4) {
                    }
                } else {
                    z4 = true;
                    if (!z4) {
                    }
                }
            }
        }
        if (!z3) {
            return null;
        }
        OptionLevel optionLevel = OptionLevel.INSTANCE;
        if (!optionLevel.canTradeOptions(ds.getAccount().getOptionLevel())) {
            return null;
        }
        OptionOrder.FormSource source = ds.getUiOptionOrder().getOptionOrder().getSource();
        OptionOrder.FormSource formSource = OptionOrder.FormSource.STRATEGY_ROLL;
        if (source == formSource && !ds.getAccount().isMargin() && !optionLevel.canTradeMultileg(ds.getAccount().getOptionLevel())) {
            return null;
        }
        if (ds.getUiOptionOrder().getOptionOrder().getSource() != formSource && legs.size() > 1 && !optionLevel.canTradeMultileg(ds.getAccount().getOptionLevel())) {
            return null;
        }
        BigDecimal quantity2 = z2 ? ds.getUiOptionOrder().getQuantity() : null;
        List<UiOptionOrderLeg> legs2 = ds.getUiOptionOrder().getLegs();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs2, 10));
        Iterator<T> it4 = legs2.iterator();
        while (it4.hasNext()) {
            arrayList2.add(INSTANCE.toLegBundle((UiOptionOrderLeg) it4.next(), ds.getUiOptionChain()));
        }
        OptionOrderBundle optionOrderBundle = new OptionOrderBundle(extensions2.toPersistentList(arrayList2), quantity2);
        OrderTrigger trigger = ds.getUiOptionOrder().getOptionOrder().getTrigger();
        return new OptionOrderIntentKey.FromOptionOrderBundle(null, ds.getUiOptionOrder().getAccountNumber(), optionOrderBundle, null, ds.getUiOptionOrder().getOptionOrder().getId(), OptionOrderType2.toOptionOrderType(ds.getUiOptionOrder().getOptionOrder()), ds.getUiOptionOrder().getOptionOrder().getTimeInForce(), quantity2 != null && trigger == OrderTrigger.IMMEDIATE, quantity2 != null && trigger == OrderTrigger.STOP, false, null, OptionOrderFormSource.ORDER_DETAIL, OptionStrategyCodes2.getStrategyCode(optionOrderBundle), null, 9225, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023c  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Optional<OptionOrderDetailViewState> reduce(OptionOrderDetailDataState dataState) throws Resources.NotFoundException {
        List listEmptyList;
        List list;
        int i;
        String str;
        int i2;
        String str2;
        CharSequence titleLine2;
        int i3;
        String string2;
        Decimals3 askPrice;
        Decimals bidPrice;
        Document tradeConfirmation;
        DisplayName displayName;
        DisplayName.Variants withAccount;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getUiOptionOrder() != null && dataState.getUserLocale() != null) {
            boolean z = dataState.getUiOptionOrder().getLegs().size() == 1;
            boolean z2 = dataState.getUiOptionOrder().getLegs().size() > 1;
            BigDecimal price = dataState.getUiOptionOrder().getOptionOrder().getPrice();
            Map<UUID, OptionInstrumentQuote> legQuotesMap = dataState.getLegQuotesMap();
            ClientAggregateOptionStrategyQuote aggregateQuote$feature_options_history_detail_externalDebug = legQuotesMap != null ? INSTANCE.toAggregateQuote$feature_options_history_detail_externalDebug(legQuotesMap, dataState.getUiOptionOrder()) : null;
            Account account = dataState.getAccount();
            StringResource title = (account == null || (displayName = AccountDisplayNames.getDisplayName(account)) == null || (withAccount = displayName.getWithAccount()) == null) ? null : withAccount.getTitle();
            StringResource.Companion companion = StringResource.INSTANCE;
            int i4 = C23086R.string.option_order_state_label;
            Companion companion2 = INSTANCE;
            StringResource stringResourceInvoke = companion.invoke(i4, companion.invoke(companion2.getLabelResId(dataState.getUiOptionOrder().getOptionOrder().getState()), new Object[0]));
            boolean zIsCancelable = dataState.getUiOptionOrder().getOptionOrder().isCancelable();
            boolean zIsReplaceable = dataState.getUiOptionOrder().getOptionOrder().isReplaceable();
            boolean z3 = zIsCancelable || zIsReplaceable;
            String accountNumber = dataState.getUiOptionOrder().getAccountNumber();
            List actionRows = companion2.getActionRows(dataState.getIndexInstrument(), dataState.getInstrument(), dataState.getUiOptionChain(), dataState.getUiOptionOrder());
            boolean cancelButtonLoading = dataState.getCancelButtonLoading();
            String symbol = dataState.getUiOptionOrder().getOptionChain().getSymbol();
            List<Document> documents = dataState.getDocuments();
            DocumentDownloadKey documentDownloadKey = (documents == null || (tradeConfirmation = dataState.getUiOptionOrder().getTradeConfirmation(documents)) == null) ? null : new DocumentDownloadKey(tradeConfirmation, DocumentDownloadLaunchMode.OPEN, null, false, 12, null);
            if (dataState.getUiOptionChain() != null) {
                List<UiOptionOrderLeg> legs = dataState.getUiOptionOrder().getLegs();
                listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legs, 10));
                for (UiOptionOrderLeg uiOptionOrderLeg : legs) {
                    Companion companion3 = INSTANCE;
                    OrderState state = dataState.getUiOptionOrder().getOptionOrder().getState();
                    Map<UUID, OptionInstrumentQuote> legQuotesMap2 = dataState.getLegQuotesMap();
                    listEmptyList.add(companion3.createLegRow(state, uiOptionOrderLeg, legQuotesMap2 != null ? legQuotesMap2.get(uiOptionOrderLeg.getLeg().getOptionId()) : null, dataState.getUiOptionChain()));
                }
                if (z) {
                    list = null;
                }
                BigDecimal price2 = dataState.getUiOptionOrder().getOptionOrder().getPrice();
                Resources resources = this.resources;
                Account account2 = dataState.getAccount();
                String accountNumber2 = account2 == null ? account2.getAccountNumber() : null;
                ProfitAndLossTradeItem profitAndLossTradeItem = dataState.getProfitAndLossTradeItem();
                UiOptionOrder uiOptionOrder = dataState.getUiOptionOrder();
                UiOptionChain uiOptionChain = dataState.getUiOptionChain();
                List<OptionOrderDetailViewState.InfoItem> infoItems = getInfoItems(resources, accountNumber2, profitAndLossTradeItem, uiOptionOrder, uiOptionChain == null ? uiOptionChain.getUnderlyingType() : null, dataState.getWithholdingAmountResponse(), dataState.getShouldShowCatFeeNewCopy(), dataState.getUserLocale());
                OptionOrderDetailContext optionOrderDetailContext = UiOptionOrders.getOptionOrderDetailContext(dataState.getUiOptionOrder(), (aggregateQuote$feature_options_history_detail_externalDebug != null || (bidPrice = aggregateQuote$feature_options_history_detail_externalDebug.getBidPrice()) == null) ? null : bidPrice.getRawValue(), (aggregateQuote$feature_options_history_detail_externalDebug != null || (askPrice = aggregateQuote$feature_options_history_detail_externalDebug.getAskPrice()) == null) ? null : askPrice.getRawValue());
                Experiments.OptionsPlaceAgain.Variant optionsPlaceAgainVariant = dataState.getOptionsPlaceAgainVariant();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                i = iArr[optionsPlaceAgainVariant.ordinal()];
                if (i == 1) {
                    if (i == 2) {
                        string2 = this.resources.getString(C23086R.string.option_order_place_again_btn);
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        string2 = this.resources.getString(C23086R.string.option_order_create_duplicate_order_btn);
                    }
                    str = string2;
                } else {
                    str = null;
                }
                i2 = iArr[dataState.getOptionsPlaceAgainVariant().ordinal()];
                if (i2 != 1) {
                    str2 = "";
                } else if (i2 == 2) {
                    str2 = OptionOrderDetailStateProvider2.BUTTON_COMPONENT_PLACE_AGAIN;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = OptionOrderDetailStateProvider2.BUTTON_COMPONENT_CREATE_DUPLICATE_ORDER;
                }
                String str3 = str2;
                OptionOrderIntentKey placeOrderAgainIntentKey = getPlaceOrderAgainIntentKey(dataState);
                boolean replaceButtonLoading = dataState.getReplaceButtonLoading();
                boolean z4 = !z2 && z3;
                boolean z5 = !z && z3;
                boolean z6 = dataState.getOptionsPlaceAgainVariant() == Experiments.OptionsPlaceAgain.Variant.CONTROL;
                if (z3 || price == null || !z) {
                    OptionOrderDetailScreen optionOrderDetailScreen = dataState.getOptionOrderDetailScreen();
                    titleLine2 = optionOrderDetailScreen == null ? optionOrderDetailScreen.getTitleLine2() : null;
                } else {
                    titleLine2 = INSTANCE.getLimitPriceString(this.resources, price);
                }
                CharSequence charSequence = titleLine2;
                if (!z3 && price != null && z) {
                    i3 = C20690R.attr.textAppearanceRegularMedium;
                } else {
                    i3 = C20690R.attr.textAppearanceDisplayMedium;
                }
                int i5 = i3;
                OptionOrderDetailScreen optionOrderDetailScreen2 = dataState.getOptionOrderDetailScreen();
                return Optional3.asOptional(new OptionOrderDetailViewState(accountNumber, title, actionRows, cancelButtonLoading, symbol, documentDownloadKey, list, infoItems, price2, optionOrderDetailContext, aggregateQuote$feature_options_history_detail_externalDebug, str, str3, placeOrderAgainIntentKey, replaceButtonLoading, zIsCancelable, zIsReplaceable, z4, z5, stringResourceInvoke, charSequence, i5, optionOrderDetailScreen2 != null ? optionOrderDetailScreen2.getTitleLine1() : null, dataState.getUiOptionOrder(), z6, dataState.getPnlUpdatesEnabled()));
            }
            listEmptyList = CollectionsKt.emptyList();
            list = listEmptyList;
            BigDecimal price22 = dataState.getUiOptionOrder().getOptionOrder().getPrice();
            Resources resources2 = this.resources;
            Account account22 = dataState.getAccount();
            if (account22 == null) {
            }
            ProfitAndLossTradeItem profitAndLossTradeItem2 = dataState.getProfitAndLossTradeItem();
            UiOptionOrder uiOptionOrder2 = dataState.getUiOptionOrder();
            UiOptionChain uiOptionChain2 = dataState.getUiOptionChain();
            List<OptionOrderDetailViewState.InfoItem> infoItems2 = getInfoItems(resources2, accountNumber2, profitAndLossTradeItem2, uiOptionOrder2, uiOptionChain2 == null ? uiOptionChain2.getUnderlyingType() : null, dataState.getWithholdingAmountResponse(), dataState.getShouldShowCatFeeNewCopy(), dataState.getUserLocale());
            OptionOrderDetailContext optionOrderDetailContext2 = UiOptionOrders.getOptionOrderDetailContext(dataState.getUiOptionOrder(), (aggregateQuote$feature_options_history_detail_externalDebug != null || (bidPrice = aggregateQuote$feature_options_history_detail_externalDebug.getBidPrice()) == null) ? null : bidPrice.getRawValue(), (aggregateQuote$feature_options_history_detail_externalDebug != null || (askPrice = aggregateQuote$feature_options_history_detail_externalDebug.getAskPrice()) == null) ? null : askPrice.getRawValue());
            Experiments.OptionsPlaceAgain.Variant optionsPlaceAgainVariant2 = dataState.getOptionsPlaceAgainVariant();
            int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
            i = iArr2[optionsPlaceAgainVariant2.ordinal()];
            if (i == 1) {
            }
            i2 = iArr2[dataState.getOptionsPlaceAgainVariant().ordinal()];
            if (i2 != 1) {
            }
            String str32 = str2;
            OptionOrderIntentKey placeOrderAgainIntentKey2 = getPlaceOrderAgainIntentKey(dataState);
            boolean replaceButtonLoading2 = dataState.getReplaceButtonLoading();
            if (z2) {
            }
            if (z) {
            }
            if (dataState.getOptionsPlaceAgainVariant() == Experiments.OptionsPlaceAgain.Variant.CONTROL) {
            }
            if (z3) {
                OptionOrderDetailScreen optionOrderDetailScreen3 = dataState.getOptionOrderDetailScreen();
                if (optionOrderDetailScreen3 == null) {
                }
            }
            CharSequence charSequence2 = titleLine2;
            if (!z3) {
                i3 = C20690R.attr.textAppearanceDisplayMedium;
            }
            int i52 = i3;
            OptionOrderDetailScreen optionOrderDetailScreen22 = dataState.getOptionOrderDetailScreen();
            return Optional3.asOptional(new OptionOrderDetailViewState(accountNumber, title, actionRows, cancelButtonLoading, symbol, documentDownloadKey, list, infoItems2, price22, optionOrderDetailContext2, aggregateQuote$feature_options_history_detail_externalDebug, str, str32, placeOrderAgainIntentKey2, replaceButtonLoading2, zIsCancelable, zIsReplaceable, z4, z5, stringResourceInvoke, charSequence2, i52, optionOrderDetailScreen22 != null ? optionOrderDetailScreen22.getTitleLine1() : null, dataState.getUiOptionOrder(), z6, dataState.getPnlUpdatesEnabled()));
        }
        return Optional2.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<OptionOrderDetailViewState.InfoItem> getInfoItems(Resources resources, String accountNumber, ProfitAndLossTradeItem profitAndLossTradeItem, UiOptionOrder uiOptionOrder, OptionChain.UnderlyingType underlyingType, WithholdingAmount withholdingAmount, boolean shouldShowCatFeeNewCopy, CountryCode.Supported userLocale) throws Resources.NotFoundException {
        int i;
        String estCostOrCreditLabelString;
        Instant timestamp;
        String string2;
        ArrayList arrayList = new ArrayList();
        boolean z = uiOptionOrder.getLegs().size() == 1;
        if (z) {
            String string3 = resources.getString(C23086R.string.option_order_detail_side);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            arrayList.add(new OptionOrderDetailViewState.InfoItem(string3, UiOptionOrders.getOrderTypeString$default(uiOptionOrder, resources, 0, 2, null), null, null, false, 28, null));
            String string4 = resources.getString(C23086R.string.option_order_detail_position_effect);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            arrayList.add(new OptionOrderDetailViewState.InfoItem(string4, INSTANCE.getStringResource(uiOptionOrder.getEffect()).getText(resources).toString(), 0 == true ? 1 : 0, null, false, 28, null));
        }
        String string5 = resources.getString(C23386R.string.order_detail_time_in_force_header);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        arrayList.add(new OptionOrderDetailViewState.InfoItem(string5, UiOptionOrders.getTimeInForceString(uiOptionOrder, resources), null, null, false, 28, null));
        String string6 = resources.getString(C23386R.string.order_detail_submitted_header);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        arrayList.add(new OptionOrderDetailViewState.InfoItem(string6, InstantFormatter.LONG_TIMESTAMP_WITH_ZONE_IN_SYSTEM_ZONE.format((InstantFormatter) uiOptionOrder.getOptionOrder().getCreatedAt()), 0 == true ? 1 : 0, null, false, 28, null));
        if (uiOptionOrder.getOptionOrder().getPrice() != null) {
            String string7 = resources.getString(C23086R.string.option_order_detail_limit_price);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            arrayList.add(new OptionOrderDetailViewState.InfoItem(string7, OptionOrders.getOrderPriceString(uiOptionOrder.getOptionOrder(), resources), null, null, false, 28, null));
        }
        if (BigDecimals7.isPositive(uiOptionOrder.getProcessedQuantity())) {
            Iterator itIterator2 = SequencesKt.flatMapIterable(CollectionsKt.asSequence(uiOptionOrder.getLegs()), new Function1() { // from class: com.robinhood.android.options.history.detail.order.OptionOrderDetailStateProvider$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionOrderDetailStateProvider.getInfoItems$lambda$14$lambda$9((UiOptionOrderLeg) obj);
                }
            }).iterator2();
            if (itIterator2.hasNext()) {
                timestamp = ((OptionOrderExecution) itIterator2.next()).getTimestamp();
                while (itIterator2.hasNext()) {
                    Instant timestamp2 = ((OptionOrderExecution) itIterator2.next()).getTimestamp();
                    if (timestamp.compareTo(timestamp2) > 0) {
                        timestamp = timestamp2;
                    }
                }
            } else {
                timestamp = null;
            }
            String string8 = resources.getString(C23086R.string.option_order_detail_filled_date);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            String str = timestamp != null ? InstantFormatter.LONG_TIMESTAMP_WITH_ZONE_IN_SYSTEM_ZONE.format((InstantFormatter) timestamp) : null;
            if (str == null) {
                str = "";
            }
            arrayList.add(new OptionOrderDetailViewState.InfoItem(string8, str, null, null, false, 28, null));
            BigDecimal processedQuantity = uiOptionOrder.getOptionOrder().getProcessedQuantity();
            String string9 = resources.getString(C23086R.string.option_order_detail_filled_quantity);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            if (z) {
                string2 = resources.getQuantityString(C23086R.plurals.option_order_detail_contract_quantity_value, processedQuantity.intValue(), Formats.getIntegerFormat().format(processedQuantity), Formats.getPriceFormat().format(BigDecimals7.safeDivide(UiOptionOrders.getTotalExecutionPrice(uiOptionOrder), processedQuantity)));
            } else {
                string2 = resources.getString(C23086R.string.option_order_detail_filled_quantity_value, Formats.getIntegerFormat().format(processedQuantity), Formats.getPriceFormat().format(BigDecimals7.safeDivide(UiOptionOrders.getTotalExecutionPrice(uiOptionOrder), processedQuantity)));
            }
            String str2 = string2;
            Intrinsics.checkNotNull(str2);
            arrayList.add(new OptionOrderDetailViewState.InfoItem(string9, str2, null, null, false, 28, null));
        }
        BigDecimal stopPrice = uiOptionOrder.getOptionOrder().getStopPrice();
        if (stopPrice != null) {
            String string10 = resources.getString(C23086R.string.option_order_detail_stop_price);
            Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
            arrayList.add(new OptionOrderDetailViewState.InfoItem(string10, Formats.getPriceFormat().format(stopPrice), null, null, false, 28, null));
        }
        String string11 = resources.getString(C23386R.string.option_order_quantity_label);
        Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
        arrayList.add(new OptionOrderDetailViewState.InfoItem(string11, String.valueOf(uiOptionOrder.getOptionOrder().getQuantity().intValue()), null, null, false, 28, null));
        String backupWithholdingAmountString = withholdingAmount != null ? WithholdingAmount2.getBackupWithholdingAmountString(withholdingAmount) : null;
        if (backupWithholdingAmountString != null) {
            String string12 = resources.getString(C23086R.string.option_order_detail_backup_withholding);
            Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
            arrayList.add(new OptionOrderDetailViewState.InfoItem(string12, backupWithholdingAmountString, null, null, false, 28, null));
        }
        BigDecimal netCreditAmount = withholdingAmount != null ? WithholdingAmount2.getNetCreditAmount(withholdingAmount, uiOptionOrder.getOptionOrder().getProcessedPremium()) : null;
        if (netCreditAmount != null) {
            String string13 = resources.getString(C23086R.string.option_order_detail_net_credit);
            Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
            arrayList.add(new OptionOrderDetailViewState.InfoItem(string13, Formats.getPriceFormat().format(netCreditAmount), null, null, false, 28, null));
        }
        if (uiOptionOrder.getOptionOrder().getState().hasExecutions()) {
            if (!uiOptionOrder.getOptionOrder().getState().isFinal()) {
                estCostOrCreditLabelString = StringHelper.getEstCostOrCreditLabelString(resources, uiOptionOrder.getOptionOrder().getNetAmountDirection());
                arrayList.add(new OptionOrderDetailViewState.InfoItem(estCostOrCreditLabelString, Formats.getPriceFormat().format(uiOptionOrder.getOptionOrder().getNetAmount()), null, null, false, 28, null));
                addInfoItemFees(arrayList, underlyingType, uiOptionOrder, shouldShowCatFeeNewCopy, userLocale);
            } else {
                List<UiOptionOrderLeg> legs = uiOptionOrder.getLegs();
                if (!(legs instanceof Collection) || !legs.isEmpty()) {
                    Iterator<T> it = legs.iterator();
                    while (it.hasNext()) {
                        if (((UiOptionOrderLeg) it.next()).getLeg().getSide() == OrderSide.SELL) {
                            estCostOrCreditLabelString = StringHelper.getEstCostOrCreditLabelString(resources, uiOptionOrder.getOptionOrder().getNetAmountDirection());
                            break;
                        }
                    }
                }
                estCostOrCreditLabelString = StringHelper.getTotalCostCreditLabelString(resources, uiOptionOrder.getOptionOrder().getNetAmountDirection());
                arrayList.add(new OptionOrderDetailViewState.InfoItem(estCostOrCreditLabelString, Formats.getPriceFormat().format(uiOptionOrder.getOptionOrder().getNetAmount()), null, null, false, 28, null));
                addInfoItemFees(arrayList, underlyingType, uiOptionOrder, shouldShowCatFeeNewCopy, userLocale);
            }
        }
        if (profitAndLossTradeItem == null) {
            return arrayList;
        }
        Money realizedReturn = profitAndLossTradeItem.getRealizedReturn();
        if (realizedReturn == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (realizedReturn.isPositive() || realizedReturn.isZero()) {
            i = C23086R.string.option_order_detail_realized_profit;
        } else {
            i = C23086R.string.option_order_detail_realized_loss;
        }
        String string14 = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
        arrayList.add(new OptionOrderDetailViewState.InfoItem(string14, Money.Adjustment.format$default(realizedReturn.toNormalizedAdjustment(), false, null, 3, null), accountNumber, profitAndLossTradeItem, false, 16, null));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable getInfoItems$lambda$14$lambda$9(UiOptionOrderLeg it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getExecutions();
    }

    private final void addInfoItemFees(List<OptionOrderDetailViewState.InfoItem> list, OptionChain.UnderlyingType underlyingType, UiOptionOrder uiOptionOrder, boolean z, CountryCode.Supported supported) throws Resources.NotFoundException {
        if (z) {
            int i = underlyingType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[underlyingType.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    String string2 = this.resources.getString(C23086R.string.option_order_detail_est_regulatory_fees_label);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    list.add(new OptionOrderDetailViewState.InfoItem(string2, Formats.getPriceFormat().format(uiOptionOrder.getOptionOrder().getRegulatoryFees()), null, null, false, 28, null));
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String string3 = this.resources.getString(C23086R.string.option_order_detail_est_reg_and_exchange_fees_label);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    list.add(new OptionOrderDetailViewState.InfoItem(string3, Formats.getPriceFormat().format(uiOptionOrder.getOptionOrder().getRegulatoryFees()), null, null, false, 28, null));
                }
            }
        } else {
            int i2 = underlyingType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[underlyingType.ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    String string4 = this.resources.getString(C23086R.string.option_order_detail_regulatory_fees_label);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    list.add(new OptionOrderDetailViewState.InfoItem(string4, Formats.getPriceFormat().format(uiOptionOrder.getOptionOrder().getRegulatoryFees()), null, null, false, 28, null));
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String string5 = this.resources.getString(C23086R.string.option_order_detail_reg_and_exchange_fees_label);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    list.add(new OptionOrderDetailViewState.InfoItem(string5, Formats.getPriceFormat().format(uiOptionOrder.getOptionOrder().getRegulatoryFees()), null, null, false, 28, null));
                }
            }
        }
        BigDecimal contractFees = uiOptionOrder.getOptionOrder().getContractFees();
        if (contractFees != null && (contractFees.compareTo(BigDecimal.ZERO) > 0 || Intrinsics.areEqual(supported, CountryCode.Supported.UnitedKingdom.INSTANCE))) {
            String string6 = this.resources.getString(C23086R.string.option_order_detail_contract_fee);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            list.add(new OptionOrderDetailViewState.InfoItem(string6, Formats.getPriceFormat().format(contractFees), null, null, false, 28, null));
        }
        List<OptionOrderSalesTax> salesTax = uiOptionOrder.getOptionOrder().getSalesTax();
        if (salesTax != null) {
            for (OptionOrderSalesTax optionOrderSalesTax : salesTax) {
                if (optionOrderSalesTax.getFee().compareTo(BigDecimal.ZERO) >= 0) {
                    list.add(new OptionOrderDetailViewState.InfoItem(optionOrderSalesTax.getDisplayName(), Formats.getPriceFormat().format(optionOrderSalesTax.getFee()), null, null, false, 28, null));
                }
            }
        }
        BigDecimal goldSavings = uiOptionOrder.getOptionOrder().getGoldSavings();
        if (goldSavings == null || goldSavings.compareTo(BigDecimal.ZERO) <= 0) {
            return;
        }
        String string7 = this.resources.getString(C23086R.string.gated_gold_option_order_detail_gold_savings);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        list.add(new OptionOrderDetailViewState.InfoItem(string7, Formats.getPriceFormat().format(goldSavings), null, null, true, 12, null));
    }
}
