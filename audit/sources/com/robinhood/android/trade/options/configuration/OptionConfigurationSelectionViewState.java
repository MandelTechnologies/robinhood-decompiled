package com.robinhood.android.trade.options.configuration;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.trade.configuration.C29312R;
import com.robinhood.android.trade.configuration.OrderConfigurationRadioGroupResource;
import com.robinhood.android.trade.configuration.OrderConfigurationResource;
import com.robinhood.android.trade.configuration.OrderConfigurationRow;
import com.robinhood.android.trade.options.C29757R;
import com.robinhood.android.trade.options.configuration.OptionConfigurationDisabledState;
import com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionFragment;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.EquityOrderSide3;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.Clock2;
import kotlinx.datetime.Converters4;
import p479j$.time.Instant;

/* compiled from: OptionConfigurationSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0001^BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u001fH\u0001¢\u0006\u0004\b \u0010!J\u000f\u0010$\u001a\u00020\u001fH\u0001¢\u0006\u0004\b#\u0010!J\u000f\u0010&\u001a\u00020\u001fH\u0001¢\u0006\u0004\b%\u0010!J\u000f\u0010(\u001a\u00020\u001fH\u0001¢\u0006\u0004\b'\u0010!J\u000f\u0010,\u001a\u00020)H\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b1\u0010.J\u0010\u00102\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b4\u0010.J\u0010\u00105\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b5\u0010.Jb\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010>\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bC\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010D\u001a\u0004\bE\u00100R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bF\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\bH\u00103R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bI\u0010.R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bJ\u0010.R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010KR\u0016\u0010M\u001a\u0004\u0018\u00010L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u0004\u0018\u00010L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010NR\u0016\u0010Q\u001a\u0004\u0018\u00010P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u0004\u0018\u00010P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010RR\u0019\u0010T\u001a\u0004\u0018\u00010P8\u0006¢\u0006\f\n\u0004\bT\u0010R\u001a\u0004\bU\u0010VR\u0018\u0010Y\u001a\u00020P*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001f0Z8F¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006_"}, m3636d2 = {"Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionViewState;", "", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionFragment$Args;", "args", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "dayNightOverlay", "", "inOptionsMarketOrdersExperiment", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "showOptionMarketDiscovery", "Lcom/robinhood/models/db/OrderTimeInForce;", "selectedTimeInForce", "inIndexOptionsCurbHoursExperiment", "withShortenedVolatilityPeriod", "<init>", "(Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionFragment$Args;Lcom/robinhood/android/designsystem/style/DayNightOverlay;ZLcom/robinhood/models/db/MarketHours;ZLcom/robinhood/models/db/OrderTimeInForce;ZZ)V", "component1", "()Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionFragment$Args;", "component2", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "Lcom/robinhood/models/db/EquityOrderSide;", "side", "", "symbol", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Option;", "getLimitOrderRow$feature_trade_options_externalDebug", "(Lcom/robinhood/models/db/EquityOrderSide;Ljava/lang/String;)Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Option;", "getLimitOrderRow", "getStopLimitOrderRow$feature_trade_options_externalDebug", "getStopLimitOrderRow", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "getStopMarketOrderRow$feature_trade_options_externalDebug", "()Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "getStopMarketOrderRow", "getMarketOrderRow$feature_trade_options_externalDebug", "getMarketOrderRow", "getLimitSectionRow$feature_trade_options_externalDebug", "getLimitSectionRow", "getMarketSectionRow$feature_trade_options_externalDebug", "getMarketSectionRow", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Disclosure;", "getDisclosureRow$feature_trade_options_externalDebug", "()Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Disclosure;", "getDisclosureRow", "component3", "()Z", "component4", "()Lcom/robinhood/models/db/MarketHours;", "component5", "component6", "()Lcom/robinhood/models/db/OrderTimeInForce;", "component7", "component8", "copy", "(Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionFragment$Args;Lcom/robinhood/android/designsystem/style/DayNightOverlay;ZLcom/robinhood/models/db/MarketHours;ZLcom/robinhood/models/db/OrderTimeInForce;ZZ)Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionViewState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionFragment$Args;", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "Z", "getInOptionsMarketOrdersExperiment", "Lcom/robinhood/models/db/MarketHours;", "getMarketHours", "getShowOptionMarketDiscovery", "Lcom/robinhood/models/db/OrderTimeInForce;", "getSelectedTimeInForce", "getInIndexOptionsCurbHoursExperiment", "getWithShortenedVolatilityPeriod", "Lcom/robinhood/models/db/EquityOrderSide;", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState;", "marketOrderDisabledState", "Lcom/robinhood/android/trade/options/configuration/OptionConfigurationDisabledState;", "stopMarketOrderDisabledState", "j$/time/Instant", "marketCloseToWaitFor", "Lj$/time/Instant;", "marketOpenToWaitFor", "autoUpdateStateAt", "getAutoUpdateStateAt", "()Lj$/time/Instant;", "getMarketClose", "(Lcom/robinhood/models/db/MarketHours;)Lj$/time/Instant;", "marketClose", "", "getOptionConfigurationList", "()Ljava/util/List;", "optionConfigurationList", "Companion", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class OptionConfigurationSelectionViewState {
    private static final long VOLATILITY_PERIOD_SECONDS = 900;
    private final OptionConfigurationSelectionFragment.Args args;
    private final Instant autoUpdateStateAt;
    private final DayNightOverlay dayNightOverlay;
    private final boolean inIndexOptionsCurbHoursExperiment;
    private final boolean inOptionsMarketOrdersExperiment;
    private final Instant marketCloseToWaitFor;
    private final MarketHours marketHours;
    private final Instant marketOpenToWaitFor;
    private final OptionConfigurationDisabledState marketOrderDisabledState;
    private final OrderTimeInForce selectedTimeInForce;
    private final boolean showOptionMarketDiscovery;
    private final EquityOrderSide side;
    private final OptionConfigurationDisabledState stopMarketOrderDisabledState;
    private final boolean withShortenedVolatilityPeriod;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionConfigurationSelectionViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EquityOrderSide.values().length];
            try {
                iArr[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final OptionConfigurationSelectionFragment.Args getArgs() {
        return this.args;
    }

    /* renamed from: component2, reason: from getter */
    private final DayNightOverlay getDayNightOverlay() {
        return this.dayNightOverlay;
    }

    public static /* synthetic */ OptionConfigurationSelectionViewState copy$default(OptionConfigurationSelectionViewState optionConfigurationSelectionViewState, OptionConfigurationSelectionFragment.Args args, DayNightOverlay dayNightOverlay, boolean z, MarketHours marketHours, boolean z2, OrderTimeInForce orderTimeInForce, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            args = optionConfigurationSelectionViewState.args;
        }
        if ((i & 2) != 0) {
            dayNightOverlay = optionConfigurationSelectionViewState.dayNightOverlay;
        }
        if ((i & 4) != 0) {
            z = optionConfigurationSelectionViewState.inOptionsMarketOrdersExperiment;
        }
        if ((i & 8) != 0) {
            marketHours = optionConfigurationSelectionViewState.marketHours;
        }
        if ((i & 16) != 0) {
            z2 = optionConfigurationSelectionViewState.showOptionMarketDiscovery;
        }
        if ((i & 32) != 0) {
            orderTimeInForce = optionConfigurationSelectionViewState.selectedTimeInForce;
        }
        if ((i & 64) != 0) {
            z3 = optionConfigurationSelectionViewState.inIndexOptionsCurbHoursExperiment;
        }
        if ((i & 128) != 0) {
            z4 = optionConfigurationSelectionViewState.withShortenedVolatilityPeriod;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        boolean z7 = z2;
        OrderTimeInForce orderTimeInForce2 = orderTimeInForce;
        return optionConfigurationSelectionViewState.copy(args, dayNightOverlay, z, marketHours, z7, orderTimeInForce2, z5, z6);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getInOptionsMarketOrdersExperiment() {
        return this.inOptionsMarketOrdersExperiment;
    }

    /* renamed from: component4, reason: from getter */
    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowOptionMarketDiscovery() {
        return this.showOptionMarketDiscovery;
    }

    /* renamed from: component6, reason: from getter */
    public final OrderTimeInForce getSelectedTimeInForce() {
        return this.selectedTimeInForce;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getInIndexOptionsCurbHoursExperiment() {
        return this.inIndexOptionsCurbHoursExperiment;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getWithShortenedVolatilityPeriod() {
        return this.withShortenedVolatilityPeriod;
    }

    public final OptionConfigurationSelectionViewState copy(OptionConfigurationSelectionFragment.Args args, DayNightOverlay dayNightOverlay, boolean inOptionsMarketOrdersExperiment, MarketHours marketHours, boolean showOptionMarketDiscovery, OrderTimeInForce selectedTimeInForce, boolean inIndexOptionsCurbHoursExperiment, boolean withShortenedVolatilityPeriod) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        Intrinsics.checkNotNullParameter(selectedTimeInForce, "selectedTimeInForce");
        return new OptionConfigurationSelectionViewState(args, dayNightOverlay, inOptionsMarketOrdersExperiment, marketHours, showOptionMarketDiscovery, selectedTimeInForce, inIndexOptionsCurbHoursExperiment, withShortenedVolatilityPeriod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionConfigurationSelectionViewState)) {
            return false;
        }
        OptionConfigurationSelectionViewState optionConfigurationSelectionViewState = (OptionConfigurationSelectionViewState) other;
        return Intrinsics.areEqual(this.args, optionConfigurationSelectionViewState.args) && this.dayNightOverlay == optionConfigurationSelectionViewState.dayNightOverlay && this.inOptionsMarketOrdersExperiment == optionConfigurationSelectionViewState.inOptionsMarketOrdersExperiment && Intrinsics.areEqual(this.marketHours, optionConfigurationSelectionViewState.marketHours) && this.showOptionMarketDiscovery == optionConfigurationSelectionViewState.showOptionMarketDiscovery && this.selectedTimeInForce == optionConfigurationSelectionViewState.selectedTimeInForce && this.inIndexOptionsCurbHoursExperiment == optionConfigurationSelectionViewState.inIndexOptionsCurbHoursExperiment && this.withShortenedVolatilityPeriod == optionConfigurationSelectionViewState.withShortenedVolatilityPeriod;
    }

    public int hashCode() {
        int iHashCode = ((((this.args.hashCode() * 31) + this.dayNightOverlay.hashCode()) * 31) + Boolean.hashCode(this.inOptionsMarketOrdersExperiment)) * 31;
        MarketHours marketHours = this.marketHours;
        return ((((((((iHashCode + (marketHours == null ? 0 : marketHours.hashCode())) * 31) + Boolean.hashCode(this.showOptionMarketDiscovery)) * 31) + this.selectedTimeInForce.hashCode()) * 31) + Boolean.hashCode(this.inIndexOptionsCurbHoursExperiment)) * 31) + Boolean.hashCode(this.withShortenedVolatilityPeriod);
    }

    public String toString() {
        return "OptionConfigurationSelectionViewState(args=" + this.args + ", dayNightOverlay=" + this.dayNightOverlay + ", inOptionsMarketOrdersExperiment=" + this.inOptionsMarketOrdersExperiment + ", marketHours=" + this.marketHours + ", showOptionMarketDiscovery=" + this.showOptionMarketDiscovery + ", selectedTimeInForce=" + this.selectedTimeInForce + ", inIndexOptionsCurbHoursExperiment=" + this.inIndexOptionsCurbHoursExperiment + ", withShortenedVolatilityPeriod=" + this.withShortenedVolatilityPeriod + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OptionConfigurationSelectionViewState(OptionConfigurationSelectionFragment.Args args, DayNightOverlay dayNightOverlay, boolean z, MarketHours marketHours, boolean z2, OrderTimeInForce selectedTimeInForce, boolean z3, boolean z4) {
        Instant marketClose;
        Instant marketOpenAfterVolatility;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        Intrinsics.checkNotNullParameter(selectedTimeInForce, "selectedTimeInForce");
        this.args = args;
        this.dayNightOverlay = dayNightOverlay;
        this.inOptionsMarketOrdersExperiment = z;
        this.marketHours = marketHours;
        this.showOptionMarketDiscovery = z2;
        this.selectedTimeInForce = selectedTimeInForce;
        this.inIndexOptionsCurbHoursExperiment = z3;
        this.withShortenedVolatilityPeriod = z4;
        EquityOrderSide equityOrderSideFromDirection = EquityOrderSide.INSTANCE.fromDirection(args.getDirection());
        this.side = equityOrderSideFromDirection;
        OptionConfigurationDisabledState.Companion companion = OptionConfigurationDisabledState.INSTANCE;
        boolean zIsLateClosing = args.isLateClosing();
        boolean zIsRolling = args.isRolling();
        boolean zIsMultiLeg = args.isMultiLeg();
        OrderSide orderSide = EquityOrderSide3.toOrderSide(equityOrderSideFromDirection);
        if (orderSide != null) {
            this.marketOrderDisabledState = companion.from(marketHours, zIsLateClosing, zIsRolling, zIsMultiLeg, orderSide, args.getSingleLegPositionEffect(), z4);
            boolean zIsLateClosing2 = args.isLateClosing();
            boolean zIsRolling2 = args.isRolling();
            boolean zIsMultiLeg2 = args.isMultiLeg();
            OrderSide orderSide2 = EquityOrderSide3.toOrderSide(equityOrderSideFromDirection);
            if (orderSide2 != null) {
                this.stopMarketOrderDisabledState = companion.from(marketHours, zIsLateClosing2, zIsRolling2, zIsMultiLeg2, orderSide2, args.getSingleLegPositionEffect(), false);
                Instant instant = null;
                if (marketHours != null) {
                    Instant marketOpenAfterVolatility2 = INSTANCE.getMarketOpenAfterVolatility(marketHours);
                    Instant marketClose2 = getMarketClose(marketHours);
                    Instant javaInstant = Converters4.toJavaInstant(Clock2.INSTANCE.now());
                    MarketHours marketHours2 = (javaInstant.compareTo(marketOpenAfterVolatility2) < 0 || javaInstant.compareTo(marketClose2) > 0) ? null : marketHours;
                    marketClose = marketHours2 != null ? getMarketClose(marketHours2) : null;
                }
                this.marketCloseToWaitFor = marketClose;
                if (marketHours != null && (marketOpenAfterVolatility = INSTANCE.getMarketOpenAfterVolatility(marketHours)) != null && Converters4.toJavaInstant(Clock2.INSTANCE.now()).compareTo(marketOpenAfterVolatility) < 0) {
                    instant = marketOpenAfterVolatility;
                }
                this.marketOpenToWaitFor = instant;
                this.autoUpdateStateAt = marketClose == null ? instant : marketClose;
                return;
            }
            throw new IllegalStateException("side is null, but it should not be. did short_sell leak?");
        }
        throw new IllegalStateException("side is null, but it should not be. did short_sell leak?");
    }

    public /* synthetic */ OptionConfigurationSelectionViewState(OptionConfigurationSelectionFragment.Args args, DayNightOverlay dayNightOverlay, boolean z, MarketHours marketHours, boolean z2, OrderTimeInForce orderTimeInForce, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(args, (i & 2) != 0 ? DayNightOverlay.DAY : dayNightOverlay, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : marketHours, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? args.getOrderTimeInForce() : orderTimeInForce, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4);
    }

    public final boolean getInOptionsMarketOrdersExperiment() {
        return this.inOptionsMarketOrdersExperiment;
    }

    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final boolean getShowOptionMarketDiscovery() {
        return this.showOptionMarketDiscovery;
    }

    public final OrderTimeInForce getSelectedTimeInForce() {
        return this.selectedTimeInForce;
    }

    public final boolean getInIndexOptionsCurbHoursExperiment() {
        return this.inIndexOptionsCurbHoursExperiment;
    }

    public final boolean getWithShortenedVolatilityPeriod() {
        return this.withShortenedVolatilityPeriod;
    }

    public final OrderConfigurationRow.Option getLimitOrderRow$feature_trade_options_externalDebug(EquityOrderSide side, String symbol) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new OrderConfigurationRow.Option(new OrderConfigurationResource.Limit(side, symbol, false, C29312R.string.order_type_limit_option_order_buy_description, C29312R.string.order_type_limit_option_order_sell_description, 0, null, this.dayNightOverlay, true, C29312R.string.order_type_limit_title_options, 96, null), Order.Configuration.LIMIT);
    }

    public final OrderConfigurationRow.Option getStopLimitOrderRow$feature_trade_options_externalDebug(EquityOrderSide side, String symbol) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        int i = C29312R.string.order_type_stop_limit_option_order_buy_description;
        int i2 = C29312R.string.order_type_stop_limit_option_order_sell_description;
        boolean zIsMultiLeg = this.args.isMultiLeg();
        int i3 = C29312R.string.order_type_disabled_stop_limit_order_description;
        return new OrderConfigurationRow.Option(new OrderConfigurationResource.StopLimit(side, zIsMultiLeg, symbol, i, i2, this.dayNightOverlay, Integer.valueOf(i3), true, C29312R.string.order_type_stop_limit_title_options), Order.Configuration.STOP_LIMIT);
    }

    public final OrderConfigurationRow getStopMarketOrderRow$feature_trade_options_externalDebug() {
        List<String> listEmptyList;
        OptionConfigurationDisabledState optionConfigurationDisabledState = this.stopMarketOrderDisabledState;
        int subtitleRes = optionConfigurationDisabledState != null ? optionConfigurationDisabledState.getSubtitleRes() : C29757R.string.option_order_configuration_stop_market_subtitle;
        int i = C29757R.string.option_order_configuration_stop_market_title;
        OptionConfigurationDisabledState optionConfigurationDisabledState2 = this.stopMarketOrderDisabledState;
        if (optionConfigurationDisabledState2 == null || (listEmptyList = optionConfigurationDisabledState2.getSubtitleFormatArgs()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<String> list = listEmptyList;
        boolean z = this.stopMarketOrderDisabledState != null;
        DayNightOverlay dayNightOverlay = this.dayNightOverlay;
        OptionConfigurationSelectionViewState2 optionConfigurationSelectionViewState2 = OptionConfigurationSelectionViewState2.INSTANCE;
        return new OrderConfigurationRow.Option(new OrderConfigurationResource.StopMarket(i, subtitleRes, list, z, dayNightOverlay, optionConfigurationSelectionViewState2.m19450getLambda$1096691760$feature_trade_options_externalDebug(), optionConfigurationSelectionViewState2.getLambda$1594271663$feature_trade_options_externalDebug()), Order.Configuration.STOP_LOSS);
    }

    public final OrderConfigurationRow getMarketOrderRow$feature_trade_options_externalDebug() {
        int subtitleRes;
        List<String> listEmptyList;
        final OptionConfigurationDisabledState optionConfigurationDisabledState = this.marketOrderDisabledState;
        if ((optionConfigurationDisabledState != null ? optionConfigurationDisabledState.getMode() : null) != OptionConfigurationDisabledState.Mode.ALL_MARKET_ORDERS) {
            optionConfigurationDisabledState = null;
        }
        int i = C29757R.string.option_order_configuration_market_title;
        if (optionConfigurationDisabledState != null) {
            subtitleRes = optionConfigurationDisabledState.getSubtitleRes();
        } else {
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.side.ordinal()];
            if (i2 == 1) {
                subtitleRes = C29757R.string.option_order_configuration_market_subtitle_buy;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("options orders should never be short");
                }
                subtitleRes = C29757R.string.option_order_configuration_market_subtitle_sell;
            }
        }
        if (optionConfigurationDisabledState == null || (listEmptyList = optionConfigurationDisabledState.getSubtitleFormatArgs()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new OrderConfigurationRow.Option(new OrderConfigurationResource.OptionMarket(i, subtitleRes, listEmptyList, optionConfigurationDisabledState != null, this.dayNightOverlay, this.showOptionMarketDiscovery ? ComposableLambda3.composableLambdaInstance(2052158775, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionViewState$getMarketOrderRow$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i3) {
                if ((i3 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2052158775, i3, -1, "com.robinhood.android.trade.options.configuration.OptionConfigurationSelectionViewState.getMarketOrderRow.<anonymous> (OptionConfigurationSelectionViewState.kt:119)");
                }
                OptionConfigurationSelectionDiscoveryHeaderComposable.OptionConfigurationSelectionDiscoveryHeaderComposable(null, optionConfigurationDisabledState != null, composer, 0, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }) : null, OptionConfigurationSelectionViewState2.INSTANCE.m19451getLambda$1563977711$feature_trade_options_externalDebug()), Order.Configuration.MARKET);
    }

    public final OrderConfigurationRow getLimitSectionRow$feature_trade_options_externalDebug() {
        return new OrderConfigurationRow.OptionSectionHeader(C29757R.string.option_order_configuration_section_limit);
    }

    public final OrderConfigurationRow getMarketSectionRow$feature_trade_options_externalDebug() {
        return new OrderConfigurationRow.OptionSectionHeader(C29757R.string.option_order_configuration_section_market);
    }

    public final OrderConfigurationRow.Disclosure getDisclosureRow$feature_trade_options_externalDebug() {
        return OrderConfigurationRow.Disclosure.INSTANCE;
    }

    public final List<OrderConfigurationRow> getOptionConfigurationList() {
        return CollectionsKt.listOf((Object[]) new OrderConfigurationRow[]{new OrderConfigurationRow.Header(C29757R.string.order_types_header_text, true, null, false, this.dayNightOverlay, 12, null), getLimitSectionRow$feature_trade_options_externalDebug(), getLimitOrderRow$feature_trade_options_externalDebug(this.side, this.args.getSymbol()), getStopLimitOrderRow$feature_trade_options_externalDebug(this.side, this.args.getSymbol()), getMarketSectionRow$feature_trade_options_externalDebug(), getMarketOrderRow$feature_trade_options_externalDebug(), getStopMarketOrderRow$feature_trade_options_externalDebug(), getDisclosureRow$feature_trade_options_externalDebug(), new OrderConfigurationRow.Header(C29757R.string.time_in_force_header_text, false, null, false, this.dayNightOverlay, 12, null), new OrderConfigurationRow.RadioGroupBased(new OrderConfigurationRadioGroupResource.TimeInForce(this.args.getOrderTimeInForce(), this.inIndexOptionsCurbHoursExperiment))});
    }

    private final Instant getMarketClose(MarketHours marketHours) {
        Instant lateOptionClosesAt;
        return (!this.args.isLateClosing() || (lateOptionClosesAt = marketHours.getLateOptionClosesAt()) == null) ? marketHours.getRegularClosesAt() : lateOptionClosesAt;
    }

    public final Instant getAutoUpdateStateAt() {
        return this.autoUpdateStateAt;
    }

    /* compiled from: OptionConfigurationSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/configuration/OptionConfigurationSelectionViewState$Companion;", "", "<init>", "()V", "Lcom/robinhood/models/db/MarketHours;", "j$/time/Instant", "getMarketOpenAfterVolatility", "(Lcom/robinhood/models/db/MarketHours;)Lj$/time/Instant;", "marketOpenAfterVolatility", "", "VOLATILITY_PERIOD_SECONDS", "J", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Instant getMarketOpenAfterVolatility(MarketHours marketHours) {
            Instant instantPlusSeconds = marketHours.getRegularOpensAt().plusSeconds(OptionConfigurationSelectionViewState.VOLATILITY_PERIOD_SECONDS);
            Intrinsics.checkNotNullExpressionValue(instantPlusSeconds, "plusSeconds(...)");
            return instantPlusSeconds;
        }
    }
}
