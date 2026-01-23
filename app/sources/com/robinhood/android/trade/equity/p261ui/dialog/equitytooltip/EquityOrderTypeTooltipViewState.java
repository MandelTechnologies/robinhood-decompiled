package com.robinhood.android.trade.equity.p261ui.dialog.equitytooltip;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.equities.tradesettings.utils.CheckAdtTradability;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiEquityOrderTypeTooltipResponse;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderType;
import com.robinhood.models.p320db.TaxLotEligibility;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import p479j$.time.Instant;

/* compiled from: EquityOrderTypeTooltipViewState.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0087\b\u0018\u0000 s2\u00020\u0001:\u0002tsBÁ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÂ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÂ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÂ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\bHÂ\u0003¢\u0006\u0004\b(\u0010&J\u0012\u0010)\u001a\u0004\u0018\u00010\u0015HÂ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u001aHÂ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0004\b-\u0010.J\u0019\u00102\u001a\u0004\u0018\u0001012\b\b\u0002\u00100\u001a\u00020/¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u00020\bHÀ\u0003¢\u0006\u0004\b4\u0010&J\u0018\u00106\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rHÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b<\u0010&J\u0012\u0010=\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b?\u0010&JÊ\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010C\u001a\u00020BHÖ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010F\u001a\u00020EHÖ\u0001¢\u0006\u0004\bF\u0010GJ\u001a\u0010I\u001a\u00020\b2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bI\u0010JR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010KR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010LR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010MR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010NR\u001a\u0010\n\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010N\u001a\u0004\bO\u0010&R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010NR\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010P\u001a\u0004\bQ\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010R\u001a\u0004\bS\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010T\u001a\u0004\bU\u0010;R\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010N\u001a\u0004\bV\u0010&R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010NR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010WR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010X\u001a\u0004\bY\u0010>R\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010N\u001a\u0004\bZ\u0010&R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010[R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\\R\u0016\u0010]\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\\R\u0019\u0010_\u001a\u0004\u0018\u00010^8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0019\u0010c\u001a\u0004\u0018\u00010^8\u0006¢\u0006\f\n\u0004\bc\u0010`\u001a\u0004\bd\u0010bR\u0016\u0010f\u001a\u0004\u0018\u00010B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010DR\u0011\u0010j\u001a\u00020g8F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0011\u0010l\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bk\u0010&R\u0013\u0010n\u001a\u0004\u0018\u00010^8F¢\u0006\u0006\u001a\u0004\bm\u0010bR\u0011\u0010p\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bo\u0010GR\u0011\u0010r\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bq\u0010G¨\u0006u"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipViewState;", "", "Lcom/robinhood/models/db/EquityOrderSide;", "orderSide", "Lcom/robinhood/models/db/Account;", "account", "Lcom/robinhood/models/db/Instrument;", "instrument", "", "marketBuysEnabled", "marketBuysV2Member", "marketBuyTooltipSeen", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/models/db/MarketHours;", "marketHours", "Lcom/robinhood/models/api/bonfire/ApiEquityOrderTypeTooltipResponse;", "tooltipResponse", "adtTooltipEnabled", "isDollarBasedOrder", "Lcom/robinhood/models/db/Order$Configuration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/OrderType;", "marketSessionOrderType", "taxLotsTooltipSeen", "Lcom/robinhood/models/db/TaxLotEligibility;", "taxLotEligibility", "isOrderReplacement", "<init>", "(Lcom/robinhood/models/db/EquityOrderSide;Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Instrument;ZZZLcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/api/bonfire/ApiEquityOrderTypeTooltipResponse;ZZLcom/robinhood/models/db/Order$Configuration;Lcom/robinhood/models/db/OrderType;ZLcom/robinhood/models/db/TaxLotEligibility;Ljava/lang/Boolean;)V", "component1", "()Lcom/robinhood/models/db/EquityOrderSide;", "component2", "()Lcom/robinhood/models/db/Account;", "component3", "()Lcom/robinhood/models/db/Instrument;", "component4", "()Z", "component6", "component11", "component12", "()Lcom/robinhood/models/db/Order$Configuration;", "component15", "()Lcom/robinhood/models/db/TaxLotEligibility;", "component16", "()Ljava/lang/Boolean;", "j$/time/Instant", "now", "Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipViewState$TooltipType;", "getTooltipType", "(Lj$/time/Instant;)Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipViewState$TooltipType;", "component5$feature_trade_equity_externalDebug", "component5", "component7", "()Lcom/robinhood/rosetta/eventlogging/Context;", "component8", "()Lcom/robinhood/models/db/MarketHours;", "component9", "()Lcom/robinhood/models/api/bonfire/ApiEquityOrderTypeTooltipResponse;", "component10", "component13", "()Lcom/robinhood/models/db/OrderType;", "component14", "copy", "(Lcom/robinhood/models/db/EquityOrderSide;Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/Instrument;ZZZLcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/api/bonfire/ApiEquityOrderTypeTooltipResponse;ZZLcom/robinhood/models/db/Order$Configuration;Lcom/robinhood/models/db/OrderType;ZLcom/robinhood/models/db/TaxLotEligibility;Ljava/lang/Boolean;)Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/EquityOrderSide;", "Lcom/robinhood/models/db/Account;", "Lcom/robinhood/models/db/Instrument;", "Z", "getMarketBuysV2Member$feature_trade_equity_externalDebug", "Lcom/robinhood/rosetta/eventlogging/Context;", "getLoggingContext", "Lcom/robinhood/models/db/MarketHours;", "getMarketHours", "Lcom/robinhood/models/api/bonfire/ApiEquityOrderTypeTooltipResponse;", "getTooltipResponse", "getAdtTooltipEnabled", "Lcom/robinhood/models/db/Order$Configuration;", "Lcom/robinhood/models/db/OrderType;", "getMarketSessionOrderType", "getTaxLotsTooltipSeen", "Lcom/robinhood/models/db/TaxLotEligibility;", "Ljava/lang/Boolean;", "adtTradable", "Lcom/robinhood/utils/resource/StringResource;", "tooltipText", "Lcom/robinhood/utils/resource/StringResource;", "getTooltipText", "()Lcom/robinhood/utils/resource/StringResource;", "tooltipLinkText", "getTooltipLinkText", "getAdtTooltipText", "adtTooltipText", "", "getNibHorizontalBias", "()F", "nibHorizontalBias", "getTooltipVisible", "tooltipVisible", "getTooltipLink", "tooltipLink", "getMinLines", "minLines", "getMaxLines", "maxLines", "Companion", "TooltipType", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class EquityOrderTypeTooltipViewState {
    public static final int MAX_LINES = 2;
    public static final int MAX_LINES_MARKET_BUY = 3;
    public static final int MAX_LINES_MARKET_BUY_V2 = 4;
    public static final int MIN_LINES = 1;
    public static final int MIN_LINES_24HM = 2;
    public static final int MIN_LINES_MARKET_BUY = 3;
    public static final int MIN_LINES_MARKET_BUY_V2 = 4;
    public static final float NIB_HORIZONTAL_BIAS = 0.9f;
    public static final float NIB_HORIZONTAL_BIAS_MARKET_BUYS = 0.35f;
    private final Account account;
    private final boolean adtTooltipEnabled;
    private final Boolean adtTradable;
    private final Order.Configuration configuration;
    private final Instrument instrument;
    private final boolean isDollarBasedOrder;
    private final Boolean isOrderReplacement;
    private final Context loggingContext;
    private final boolean marketBuyTooltipSeen;
    private final boolean marketBuysEnabled;
    private final boolean marketBuysV2Member;
    private final MarketHours marketHours;
    private final OrderType marketSessionOrderType;
    private final EquityOrderSide orderSide;
    private final TaxLotEligibility taxLotEligibility;
    private final boolean taxLotsTooltipSeen;
    private final StringResource tooltipLinkText;
    private final ApiEquityOrderTypeTooltipResponse tooltipResponse;
    private final StringResource tooltipText;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EquityOrderTypeTooltipViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TooltipType.values().length];
            try {
                iArr[TooltipType.BUY_SELL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TooltipType.ADT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TooltipType.MARKET_BUY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TooltipType.TAX_LOTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EquityOrderTypeTooltipViewState() {
        this(null, null, null, false, false, false, null, null, null, false, false, null, null, false, null, null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH, null);
    }

    /* renamed from: component1, reason: from getter */
    private final EquityOrderSide getOrderSide() {
        return this.orderSide;
    }

    /* renamed from: component11, reason: from getter */
    private final boolean getIsDollarBasedOrder() {
        return this.isDollarBasedOrder;
    }

    /* renamed from: component12, reason: from getter */
    private final Order.Configuration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component15, reason: from getter */
    private final TaxLotEligibility getTaxLotEligibility() {
        return this.taxLotEligibility;
    }

    /* renamed from: component16, reason: from getter */
    private final Boolean getIsOrderReplacement() {
        return this.isOrderReplacement;
    }

    /* renamed from: component2, reason: from getter */
    private final Account getAccount() {
        return this.account;
    }

    /* renamed from: component3, reason: from getter */
    private final Instrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component4, reason: from getter */
    private final boolean getMarketBuysEnabled() {
        return this.marketBuysEnabled;
    }

    /* renamed from: component6, reason: from getter */
    private final boolean getMarketBuyTooltipSeen() {
        return this.marketBuyTooltipSeen;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getAdtTooltipEnabled() {
        return this.adtTooltipEnabled;
    }

    /* renamed from: component13, reason: from getter */
    public final OrderType getMarketSessionOrderType() {
        return this.marketSessionOrderType;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getTaxLotsTooltipSeen() {
        return this.taxLotsTooltipSeen;
    }

    /* renamed from: component5$feature_trade_equity_externalDebug, reason: from getter */
    public final boolean getMarketBuysV2Member() {
        return this.marketBuysV2Member;
    }

    /* renamed from: component7, reason: from getter */
    public final Context getLoggingContext() {
        return this.loggingContext;
    }

    /* renamed from: component8, reason: from getter */
    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    /* renamed from: component9, reason: from getter */
    public final ApiEquityOrderTypeTooltipResponse getTooltipResponse() {
        return this.tooltipResponse;
    }

    public final EquityOrderTypeTooltipViewState copy(EquityOrderSide orderSide, Account account, Instrument instrument, boolean marketBuysEnabled, boolean marketBuysV2Member, boolean marketBuyTooltipSeen, Context loggingContext, MarketHours marketHours, ApiEquityOrderTypeTooltipResponse tooltipResponse, boolean adtTooltipEnabled, boolean isDollarBasedOrder, Order.Configuration configuration, OrderType marketSessionOrderType, boolean taxLotsTooltipSeen, TaxLotEligibility taxLotEligibility, Boolean isOrderReplacement) {
        return new EquityOrderTypeTooltipViewState(orderSide, account, instrument, marketBuysEnabled, marketBuysV2Member, marketBuyTooltipSeen, loggingContext, marketHours, tooltipResponse, adtTooltipEnabled, isDollarBasedOrder, configuration, marketSessionOrderType, taxLotsTooltipSeen, taxLotEligibility, isOrderReplacement);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityOrderTypeTooltipViewState)) {
            return false;
        }
        EquityOrderTypeTooltipViewState equityOrderTypeTooltipViewState = (EquityOrderTypeTooltipViewState) other;
        return this.orderSide == equityOrderTypeTooltipViewState.orderSide && Intrinsics.areEqual(this.account, equityOrderTypeTooltipViewState.account) && Intrinsics.areEqual(this.instrument, equityOrderTypeTooltipViewState.instrument) && this.marketBuysEnabled == equityOrderTypeTooltipViewState.marketBuysEnabled && this.marketBuysV2Member == equityOrderTypeTooltipViewState.marketBuysV2Member && this.marketBuyTooltipSeen == equityOrderTypeTooltipViewState.marketBuyTooltipSeen && Intrinsics.areEqual(this.loggingContext, equityOrderTypeTooltipViewState.loggingContext) && Intrinsics.areEqual(this.marketHours, equityOrderTypeTooltipViewState.marketHours) && Intrinsics.areEqual(this.tooltipResponse, equityOrderTypeTooltipViewState.tooltipResponse) && this.adtTooltipEnabled == equityOrderTypeTooltipViewState.adtTooltipEnabled && this.isDollarBasedOrder == equityOrderTypeTooltipViewState.isDollarBasedOrder && this.configuration == equityOrderTypeTooltipViewState.configuration && this.marketSessionOrderType == equityOrderTypeTooltipViewState.marketSessionOrderType && this.taxLotsTooltipSeen == equityOrderTypeTooltipViewState.taxLotsTooltipSeen && Intrinsics.areEqual(this.taxLotEligibility, equityOrderTypeTooltipViewState.taxLotEligibility) && Intrinsics.areEqual(this.isOrderReplacement, equityOrderTypeTooltipViewState.isOrderReplacement);
    }

    public int hashCode() {
        EquityOrderSide equityOrderSide = this.orderSide;
        int iHashCode = (equityOrderSide == null ? 0 : equityOrderSide.hashCode()) * 31;
        Account account = this.account;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        Instrument instrument = this.instrument;
        int iHashCode3 = (((((((iHashCode2 + (instrument == null ? 0 : instrument.hashCode())) * 31) + Boolean.hashCode(this.marketBuysEnabled)) * 31) + Boolean.hashCode(this.marketBuysV2Member)) * 31) + Boolean.hashCode(this.marketBuyTooltipSeen)) * 31;
        Context context = this.loggingContext;
        int iHashCode4 = (iHashCode3 + (context == null ? 0 : context.hashCode())) * 31;
        MarketHours marketHours = this.marketHours;
        int iHashCode5 = (iHashCode4 + (marketHours == null ? 0 : marketHours.hashCode())) * 31;
        ApiEquityOrderTypeTooltipResponse apiEquityOrderTypeTooltipResponse = this.tooltipResponse;
        int iHashCode6 = (((((iHashCode5 + (apiEquityOrderTypeTooltipResponse == null ? 0 : apiEquityOrderTypeTooltipResponse.hashCode())) * 31) + Boolean.hashCode(this.adtTooltipEnabled)) * 31) + Boolean.hashCode(this.isDollarBasedOrder)) * 31;
        Order.Configuration configuration = this.configuration;
        int iHashCode7 = (iHashCode6 + (configuration == null ? 0 : configuration.hashCode())) * 31;
        OrderType orderType = this.marketSessionOrderType;
        int iHashCode8 = (((iHashCode7 + (orderType == null ? 0 : orderType.hashCode())) * 31) + Boolean.hashCode(this.taxLotsTooltipSeen)) * 31;
        TaxLotEligibility taxLotEligibility = this.taxLotEligibility;
        int iHashCode9 = (iHashCode8 + (taxLotEligibility == null ? 0 : taxLotEligibility.hashCode())) * 31;
        Boolean bool = this.isOrderReplacement;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "EquityOrderTypeTooltipViewState(orderSide=" + this.orderSide + ", account=" + this.account + ", instrument=" + this.instrument + ", marketBuysEnabled=" + this.marketBuysEnabled + ", marketBuysV2Member=" + this.marketBuysV2Member + ", marketBuyTooltipSeen=" + this.marketBuyTooltipSeen + ", loggingContext=" + this.loggingContext + ", marketHours=" + this.marketHours + ", tooltipResponse=" + this.tooltipResponse + ", adtTooltipEnabled=" + this.adtTooltipEnabled + ", isDollarBasedOrder=" + this.isDollarBasedOrder + ", configuration=" + this.configuration + ", marketSessionOrderType=" + this.marketSessionOrderType + ", taxLotsTooltipSeen=" + this.taxLotsTooltipSeen + ", taxLotEligibility=" + this.taxLotEligibility + ", isOrderReplacement=" + this.isOrderReplacement + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EquityOrderTypeTooltipViewState(EquityOrderSide equityOrderSide, Account account, Instrument instrument, boolean z, boolean z2, boolean z3, Context context, MarketHours marketHours, ApiEquityOrderTypeTooltipResponse apiEquityOrderTypeTooltipResponse, boolean z4, boolean z5, Order.Configuration configuration, OrderType orderType, boolean z6, TaxLotEligibility taxLotEligibility, Boolean bool) {
        StringResource stringResourceInvoke;
        String cr_tooltip;
        String adtTooltipText;
        this.orderSide = equityOrderSide;
        this.account = account;
        this.instrument = instrument;
        this.marketBuysEnabled = z;
        this.marketBuysV2Member = z2;
        this.marketBuyTooltipSeen = z3;
        this.loggingContext = context;
        this.marketHours = marketHours;
        this.tooltipResponse = apiEquityOrderTypeTooltipResponse;
        this.adtTooltipEnabled = z4;
        this.isDollarBasedOrder = z5;
        this.configuration = configuration;
        this.marketSessionOrderType = orderType;
        this.taxLotsTooltipSeen = z6;
        this.taxLotEligibility = taxLotEligibility;
        this.isOrderReplacement = bool;
        Boolean boolCheckAdtTradability = CheckAdtTradability.checkAdtTradability(instrument, account, equityOrderSide);
        this.adtTradable = boolCheckAdtTradability;
        TooltipType tooltipType$default = getTooltipType$default(this, null, 1, null);
        int i = tooltipType$default == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tooltipType$default.ordinal()];
        if (i == -1) {
            stringResourceInvoke = null;
        } else if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C29365R.string.tax_lots_onboarding_tooltip_text, new Object[0]);
                } else if (z2) {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C29365R.string.market_buy_onboarding_tooltip_text_v2, new Object[0]);
                } else {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(C29365R.string.market_buy_onboarding_tooltip_text, new Object[0]);
                }
            } else if (Intrinsics.areEqual(boolCheckAdtTradability, Boolean.TRUE) && apiEquityOrderTypeTooltipResponse != null && (adtTooltipText = getAdtTooltipText()) != null) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(adtTooltipText);
            }
        } else if (apiEquityOrderTypeTooltipResponse != null && (cr_tooltip = apiEquityOrderTypeTooltipResponse.getCr_tooltip()) != null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(cr_tooltip);
        }
        this.tooltipText = stringResourceInvoke;
        this.tooltipLinkText = getTooltipLink() != null ? StringResource.INSTANCE.invoke(C29365R.string.learn_more, new Object[0]) : null;
    }

    public final boolean getMarketBuysV2Member$feature_trade_equity_externalDebug() {
        return this.marketBuysV2Member;
    }

    public final Context getLoggingContext() {
        return this.loggingContext;
    }

    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final ApiEquityOrderTypeTooltipResponse getTooltipResponse() {
        return this.tooltipResponse;
    }

    public final boolean getAdtTooltipEnabled() {
        return this.adtTooltipEnabled;
    }

    public /* synthetic */ EquityOrderTypeTooltipViewState(EquityOrderSide equityOrderSide, Account account, Instrument instrument, boolean z, boolean z2, boolean z3, Context context, MarketHours marketHours, ApiEquityOrderTypeTooltipResponse apiEquityOrderTypeTooltipResponse, boolean z4, boolean z5, Order.Configuration configuration, OrderType orderType, boolean z6, TaxLotEligibility taxLotEligibility, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : equityOrderSide, (i & 2) != 0 ? null : account, (i & 4) != 0 ? null : instrument, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? null : context, (i & 128) != 0 ? null : marketHours, (i & 256) != 0 ? null : apiEquityOrderTypeTooltipResponse, (i & 512) != 0 ? false : z4, (i & 1024) != 0 ? false : z5, (i & 2048) != 0 ? null : configuration, (i & 4096) != 0 ? OrderType.MARKET : orderType, (i & 8192) == 0 ? z6 : false, (i & 16384) != 0 ? null : taxLotEligibility, (i & 32768) != 0 ? null : bool);
    }

    public final OrderType getMarketSessionOrderType() {
        return this.marketSessionOrderType;
    }

    public final boolean getTaxLotsTooltipSeen() {
        return this.taxLotsTooltipSeen;
    }

    public final float getNibHorizontalBias() {
        return getTooltipType$default(this, null, 1, null) == TooltipType.MARKET_BUY ? 0.35f : 0.9f;
    }

    public static /* synthetic */ TooltipType getTooltipType$default(EquityOrderTypeTooltipViewState equityOrderTypeTooltipViewState, Instant instant, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = Instant.now();
        }
        return equityOrderTypeTooltipViewState.getTooltipType(instant);
    }

    public final TooltipType getTooltipType(Instant now) {
        TaxLotEligibility taxLotEligibility;
        Account account;
        BrokerageAccountType brokerageAccountType;
        String adt_tooltip;
        String cr_tooltip;
        Instrument instrument;
        MarketHours marketHours;
        Intrinsics.checkNotNullParameter(now, "now");
        if (this.marketBuysEnabled && !this.marketBuyTooltipSeen && this.orderSide == EquityOrderSide.BUY && (((instrument = this.instrument) == null || !instrument.isOtc()) && (marketHours = this.marketHours) != null && !marketHours.isExtendedHours(now) && !this.isDollarBasedOrder && this.configuration == Order.Configuration.MARKET && this.marketSessionOrderType == OrderType.MARKET)) {
            return TooltipType.MARKET_BUY;
        }
        ApiEquityOrderTypeTooltipResponse apiEquityOrderTypeTooltipResponse = this.tooltipResponse;
        if (apiEquityOrderTypeTooltipResponse != null && (cr_tooltip = apiEquityOrderTypeTooltipResponse.getCr_tooltip()) != null && (!StringsKt.isBlank(cr_tooltip))) {
            return TooltipType.BUY_SELL;
        }
        ApiEquityOrderTypeTooltipResponse apiEquityOrderTypeTooltipResponse2 = this.tooltipResponse;
        if (apiEquityOrderTypeTooltipResponse2 != null && (adt_tooltip = apiEquityOrderTypeTooltipResponse2.getAdt_tooltip()) != null && (!StringsKt.isBlank(adt_tooltip))) {
            return TooltipType.ADT;
        }
        if (this.tooltipResponse == null || this.orderSide != EquityOrderSide.SELL || (taxLotEligibility = this.taxLotEligibility) == null || !taxLotEligibility.getCustomTaxLotSelectionEligible() || this.taxLotEligibility.getNotEligibleReason() != null || (account = this.account) == null || (brokerageAccountType = account.getBrokerageAccountType()) == null || brokerageAccountType.isRetirement() || this.taxLotsTooltipSeen || Intrinsics.areEqual(this.isOrderReplacement, Boolean.TRUE)) {
            return null;
        }
        return TooltipType.TAX_LOTS;
    }

    private final String getAdtTooltipText() {
        String adt_tooltip;
        ApiEquityOrderTypeTooltipResponse apiEquityOrderTypeTooltipResponse = this.tooltipResponse;
        if (apiEquityOrderTypeTooltipResponse == null || (adt_tooltip = apiEquityOrderTypeTooltipResponse.getAdt_tooltip()) == null) {
            return null;
        }
        int length = adt_tooltip.length() / 2;
        String strSubstring = adt_tooltip.substring(0, length);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = adt_tooltip.substring(length);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring + "\n" + strSubstring2;
    }

    public final StringResource getTooltipText() {
        return this.tooltipText;
    }

    public final boolean getTooltipVisible() {
        return this.tooltipText != null;
    }

    public final StringResource getTooltipLinkText() {
        return this.tooltipLinkText;
    }

    public final StringResource getTooltipLink() {
        if (getTooltipType$default(this, null, 1, null) != TooltipType.MARKET_BUY || this.marketBuysV2Member) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C29365R.string.market_buy_onboarding_tooltip_link, new Object[0]);
    }

    public final int getMinLines() {
        TooltipType tooltipType$default = getTooltipType$default(this, null, 1, null);
        int i = tooltipType$default == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tooltipType$default.ordinal()];
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                return 1;
            }
            if (this.marketBuysV2Member) {
                return 4;
            }
        }
        return i2;
    }

    public final int getMaxLines() {
        if (getTooltipType$default(this, null, 1, null) == TooltipType.MARKET_BUY) {
            return this.marketBuysV2Member ? 4 : 3;
        }
        return 2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EquityOrderTypeTooltipViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipViewState$TooltipType;", "", "<init>", "(Ljava/lang/String;I)V", "BUY_SELL", "ADT", "MARKET_BUY", "TAX_LOTS", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TooltipType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TooltipType[] $VALUES;
        public static final TooltipType BUY_SELL = new TooltipType("BUY_SELL", 0);
        public static final TooltipType ADT = new TooltipType("ADT", 1);
        public static final TooltipType MARKET_BUY = new TooltipType("MARKET_BUY", 2);
        public static final TooltipType TAX_LOTS = new TooltipType("TAX_LOTS", 3);

        private static final /* synthetic */ TooltipType[] $values() {
            return new TooltipType[]{BUY_SELL, ADT, MARKET_BUY, TAX_LOTS};
        }

        public static EnumEntries<TooltipType> getEntries() {
            return $ENTRIES;
        }

        private TooltipType(String str, int i) {
        }

        static {
            TooltipType[] tooltipTypeArr$values = $values();
            $VALUES = tooltipTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(tooltipTypeArr$values);
        }

        public static TooltipType valueOf(String str) {
            return (TooltipType) Enum.valueOf(TooltipType.class, str);
        }

        public static TooltipType[] values() {
            return (TooltipType[]) $VALUES.clone();
        }
    }

    /* compiled from: EquityOrderTypeTooltipViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0016\u0010\t\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003R\u0016\u0010\f\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0003R\u0016\u0010\u000e\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003R\u0016\u0010\u0010\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0003R\u0016\u0010\u0012\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0003R\u0016\u0010\u0014\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0003R\u0016\u0010\u0016\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0003¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/equitytooltip/EquityOrderTypeTooltipViewState$Companion;", "", "<init>", "()V", "NIB_HORIZONTAL_BIAS", "", "getNIB_HORIZONTAL_BIAS$feature_trade_equity_externalDebug$annotations", "NIB_HORIZONTAL_BIAS_MARKET_BUYS", "getNIB_HORIZONTAL_BIAS_MARKET_BUYS$feature_trade_equity_externalDebug$annotations", "MAX_LINES_MARKET_BUY_V2", "", "getMAX_LINES_MARKET_BUY_V2$feature_trade_equity_externalDebug$annotations", "MAX_LINES_MARKET_BUY", "getMAX_LINES_MARKET_BUY$feature_trade_equity_externalDebug$annotations", "MAX_LINES", "getMAX_LINES$feature_trade_equity_externalDebug$annotations", "MIN_LINES_MARKET_BUY_V2", "getMIN_LINES_MARKET_BUY_V2$feature_trade_equity_externalDebug$annotations", "MIN_LINES_MARKET_BUY", "getMIN_LINES_MARKET_BUY$feature_trade_equity_externalDebug$annotations", "MIN_LINES_24HM", "getMIN_LINES_24HM$feature_trade_equity_externalDebug$annotations", "MIN_LINES", "getMIN_LINES$feature_trade_equity_externalDebug$annotations", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getMAX_LINES$feature_trade_equity_externalDebug$annotations() {
        }

        /* renamed from: getMAX_LINES_MARKET_BUY$feature_trade_equity_externalDebug$annotations */
        public static /* synthetic */ void m2489x42484922() {
        }

        /* renamed from: getMAX_LINES_MARKET_BUY_V2$feature_trade_equity_externalDebug$annotations */
        public static /* synthetic */ void m2490xe5f3086f() {
        }

        public static /* synthetic */ void getMIN_LINES$feature_trade_equity_externalDebug$annotations() {
        }

        public static /* synthetic */ void getMIN_LINES_24HM$feature_trade_equity_externalDebug$annotations() {
        }

        /* renamed from: getMIN_LINES_MARKET_BUY$feature_trade_equity_externalDebug$annotations */
        public static /* synthetic */ void m2491x8a49da10() {
        }

        /* renamed from: getMIN_LINES_MARKET_BUY_V2$feature_trade_equity_externalDebug$annotations */
        public static /* synthetic */ void m2492x5433a8c1() {
        }

        /* renamed from: getNIB_HORIZONTAL_BIAS$feature_trade_equity_externalDebug$annotations */
        public static /* synthetic */ void m2493x58ffc190() {
        }

        /* renamed from: getNIB_HORIZONTAL_BIAS_MARKET_BUYS$feature_trade_equity_externalDebug$annotations */
        public static /* synthetic */ void m2494x4f25bb5f() {
        }

        private Companion() {
        }
    }
}
