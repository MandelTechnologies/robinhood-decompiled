package com.robinhood.android.optionsexercise;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.TraderDayTradeStore;
import com.robinhood.models.api.ApiOptionExerciseChecks;
import com.robinhood.models.api.ApiOptionExerciseRequest;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p355ui.UiOptionInstrument;
import com.robinhood.models.util.Money;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionExerciseContext.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002/0B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u001d\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010)\u001a\u00020\u00192\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001a¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "", "exerciseRequest", "Lcom/robinhood/models/api/ApiOptionExerciseRequest;", "exerciseRequestContext", "Lcom/robinhood/android/optionsexercise/OptionExerciseContext$RequestContext;", "<init>", "(Lcom/robinhood/models/api/ApiOptionExerciseRequest;Lcom/robinhood/android/optionsexercise/OptionExerciseContext$RequestContext;)V", "getExerciseRequest", "()Lcom/robinhood/models/api/ApiOptionExerciseRequest;", "getExerciseRequestContext", "()Lcom/robinhood/android/optionsexercise/OptionExerciseContext$RequestContext;", "optionInstrument", "Lcom/robinhood/models/db/OptionInstrument;", "getOptionInstrument", "()Lcom/robinhood/models/db/OptionInstrument;", "optionChain", "Lcom/robinhood/models/db/OptionChain;", "getOptionChain", "()Lcom/robinhood/models/db/OptionChain;", "side", "Lcom/robinhood/models/db/OrderSide;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "isBuy", "", "()Z", "underlyingShareQuantity", "Ljava/math/BigDecimal;", "getUnderlyingShareQuantity", "()Ljava/math/BigDecimal;", "totalCostFromStrikePrice", "getTotalCostFromStrikePrice", "buyingPower", "Lcom/robinhood/models/util/Money;", "getBuyingPower", "()Lcom/robinhood/models/util/Money;", "isClosingPosition", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "RequestContext", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionExerciseContext {
    private final Money buyingPower;
    private final ApiOptionExerciseRequest exerciseRequest;
    private final RequestContext exerciseRequestContext;
    private final boolean isBuy;
    private final boolean isClosingPosition;
    private final OptionChain optionChain;
    private final OptionInstrument optionInstrument;
    private final OrderSide side;
    private final BigDecimal totalCostFromStrikePrice;
    private final BigDecimal underlyingShareQuantity;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionExerciseContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionContractType.values().length];
            try {
                iArr[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ OptionExerciseContext copy$default(OptionExerciseContext optionExerciseContext, ApiOptionExerciseRequest apiOptionExerciseRequest, RequestContext requestContext, int i, Object obj) {
        if ((i & 1) != 0) {
            apiOptionExerciseRequest = optionExerciseContext.exerciseRequest;
        }
        if ((i & 2) != 0) {
            requestContext = optionExerciseContext.exerciseRequestContext;
        }
        return optionExerciseContext.copy(apiOptionExerciseRequest, requestContext);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiOptionExerciseRequest getExerciseRequest() {
        return this.exerciseRequest;
    }

    /* renamed from: component2, reason: from getter */
    public final RequestContext getExerciseRequestContext() {
        return this.exerciseRequestContext;
    }

    public final OptionExerciseContext copy(ApiOptionExerciseRequest exerciseRequest, RequestContext exerciseRequestContext) {
        Intrinsics.checkNotNullParameter(exerciseRequest, "exerciseRequest");
        Intrinsics.checkNotNullParameter(exerciseRequestContext, "exerciseRequestContext");
        return new OptionExerciseContext(exerciseRequest, exerciseRequestContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionExerciseContext)) {
            return false;
        }
        OptionExerciseContext optionExerciseContext = (OptionExerciseContext) other;
        return Intrinsics.areEqual(this.exerciseRequest, optionExerciseContext.exerciseRequest) && Intrinsics.areEqual(this.exerciseRequestContext, optionExerciseContext.exerciseRequestContext);
    }

    public int hashCode() {
        return (this.exerciseRequest.hashCode() * 31) + this.exerciseRequestContext.hashCode();
    }

    public String toString() {
        return "OptionExerciseContext(exerciseRequest=" + this.exerciseRequest + ", exerciseRequestContext=" + this.exerciseRequestContext + ")";
    }

    public OptionExerciseContext(ApiOptionExerciseRequest exerciseRequest, RequestContext exerciseRequestContext) {
        OrderSide orderSide;
        BigDecimal quantity;
        BigDecimal quantity2;
        Intrinsics.checkNotNullParameter(exerciseRequest, "exerciseRequest");
        Intrinsics.checkNotNullParameter(exerciseRequestContext, "exerciseRequestContext");
        this.exerciseRequest = exerciseRequest;
        this.exerciseRequestContext = exerciseRequestContext;
        OptionInstrument optionInstrument = exerciseRequestContext.getUiOptionInstrument().getOptionInstrument();
        this.optionInstrument = optionInstrument;
        OptionChain optionChain = exerciseRequestContext.getUiOptionInstrument().getOptionChain();
        this.optionChain = optionChain;
        OptionContractType contractType = optionInstrument.getContractType();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[contractType.ordinal()];
        if (i == 1) {
            orderSide = OrderSide.BUY;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            orderSide = OrderSide.SELL;
        }
        this.side = orderSide;
        boolean zM2979lt = false;
        this.isBuy = optionInstrument.getContractType() == OptionContractType.CALL;
        BigDecimal bigDecimalSafeMultiply = BigDecimals7.safeMultiply(exerciseRequest.getQuantity(), optionChain.getTradeValueMultiplier());
        this.underlyingShareQuantity = bigDecimalSafeMultiply;
        this.totalCostFromStrikePrice = BigDecimals7.safeMultiply(optionInstrument.getStrikePrice(), bigDecimalSafeMultiply);
        this.buyingPower = exerciseRequestContext.getInstrumentBuyingPower().getBuyingPowerAmount();
        int i2 = iArr[optionInstrument.getContractType().ordinal()];
        if (i2 == 1) {
            Position equityPosition = exerciseRequestContext.getEquityPosition();
            if (equityPosition != null && (quantity = equityPosition.getQuantity()) != null) {
                zM2979lt = BigDecimals7.m2979lt(quantity, BigDecimal.ZERO);
            }
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Position equityPosition2 = exerciseRequestContext.getEquityPosition();
            if (equityPosition2 != null && (quantity2 = equityPosition2.getQuantity()) != null) {
                zM2979lt = BigDecimals7.m2978gt(quantity2, BigDecimal.ZERO);
            }
        }
        this.isClosingPosition = zM2979lt;
    }

    public final ApiOptionExerciseRequest getExerciseRequest() {
        return this.exerciseRequest;
    }

    public final RequestContext getExerciseRequestContext() {
        return this.exerciseRequestContext;
    }

    /* compiled from: OptionExerciseContext.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\tHÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0012HÆ\u0003J\t\u0010=\u001a\u00020\u0014HÆ\u0003J\t\u0010>\u001a\u00020\u0016HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J \u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u00052\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020IHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010,R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010,R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010,¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseContext$RequestContext;", "", "account", "Lcom/robinhood/models/db/Account;", "cashSweepEnrolled", "", "dayTradeCheck", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState;", "equityInstrument", "Lcom/robinhood/models/db/Instrument;", "equityPortfolio", "Lcom/robinhood/models/db/Portfolio;", "equityPosition", "Lcom/robinhood/models/db/Position;", "exerciseChecks", "Lcom/robinhood/models/api/ApiOptionExerciseChecks;", "hasMultipleAccounts", "marketHours", "Lcom/robinhood/models/db/MarketHours;", "instrumentBuyingPower", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "uiOptionInstrument", "Lcom/robinhood/models/ui/UiOptionInstrument;", "overrideDayTradeChecks", "isShortSellingExerciseEnabled", "isMcwEnabled", "<init>", "(Lcom/robinhood/models/db/Account;Ljava/lang/Boolean;Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Portfolio;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/api/ApiOptionExerciseChecks;ZLcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/InstrumentBuyingPower;Lcom/robinhood/models/ui/UiOptionInstrument;ZZZ)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getCashSweepEnrolled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDayTradeCheck", "()Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState;", "getEquityInstrument", "()Lcom/robinhood/models/db/Instrument;", "getEquityPortfolio", "()Lcom/robinhood/models/db/Portfolio;", "getEquityPosition", "()Lcom/robinhood/models/db/Position;", "getExerciseChecks", "()Lcom/robinhood/models/api/ApiOptionExerciseChecks;", "getHasMultipleAccounts", "()Z", "getMarketHours", "()Lcom/robinhood/models/db/MarketHours;", "getInstrumentBuyingPower", "()Lcom/robinhood/models/db/InstrumentBuyingPower;", "getUiOptionInstrument", "()Lcom/robinhood/models/ui/UiOptionInstrument;", "getOverrideDayTradeChecks", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Lcom/robinhood/models/db/Account;Ljava/lang/Boolean;Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Portfolio;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/api/ApiOptionExerciseChecks;ZLcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/db/InstrumentBuyingPower;Lcom/robinhood/models/ui/UiOptionInstrument;ZZZ)Lcom/robinhood/android/optionsexercise/OptionExerciseContext$RequestContext;", "equals", "other", "hashCode", "", "toString", "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RequestContext {
        public static final int $stable = 8;
        private final Account account;
        private final Boolean cashSweepEnrolled;
        private final TraderDayTradeStore.DayTradeCheckState dayTradeCheck;
        private final Instrument equityInstrument;
        private final Portfolio equityPortfolio;
        private final Position equityPosition;
        private final ApiOptionExerciseChecks exerciseChecks;
        private final boolean hasMultipleAccounts;
        private final InstrumentBuyingPower instrumentBuyingPower;
        private final boolean isMcwEnabled;
        private final boolean isShortSellingExerciseEnabled;
        private final MarketHours marketHours;
        private final boolean overrideDayTradeChecks;
        private final UiOptionInstrument uiOptionInstrument;

        /* renamed from: component1, reason: from getter */
        public final Account getAccount() {
            return this.account;
        }

        /* renamed from: component10, reason: from getter */
        public final InstrumentBuyingPower getInstrumentBuyingPower() {
            return this.instrumentBuyingPower;
        }

        /* renamed from: component11, reason: from getter */
        public final UiOptionInstrument getUiOptionInstrument() {
            return this.uiOptionInstrument;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getOverrideDayTradeChecks() {
            return this.overrideDayTradeChecks;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getIsShortSellingExerciseEnabled() {
            return this.isShortSellingExerciseEnabled;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getIsMcwEnabled() {
            return this.isMcwEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getCashSweepEnrolled() {
            return this.cashSweepEnrolled;
        }

        /* renamed from: component3, reason: from getter */
        public final TraderDayTradeStore.DayTradeCheckState getDayTradeCheck() {
            return this.dayTradeCheck;
        }

        /* renamed from: component4, reason: from getter */
        public final Instrument getEquityInstrument() {
            return this.equityInstrument;
        }

        /* renamed from: component5, reason: from getter */
        public final Portfolio getEquityPortfolio() {
            return this.equityPortfolio;
        }

        /* renamed from: component6, reason: from getter */
        public final Position getEquityPosition() {
            return this.equityPosition;
        }

        /* renamed from: component7, reason: from getter */
        public final ApiOptionExerciseChecks getExerciseChecks() {
            return this.exerciseChecks;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getHasMultipleAccounts() {
            return this.hasMultipleAccounts;
        }

        /* renamed from: component9, reason: from getter */
        public final MarketHours getMarketHours() {
            return this.marketHours;
        }

        public final RequestContext copy(Account account, Boolean cashSweepEnrolled, TraderDayTradeStore.DayTradeCheckState dayTradeCheck, Instrument equityInstrument, Portfolio equityPortfolio, Position equityPosition, ApiOptionExerciseChecks exerciseChecks, boolean hasMultipleAccounts, MarketHours marketHours, InstrumentBuyingPower instrumentBuyingPower, UiOptionInstrument uiOptionInstrument, boolean overrideDayTradeChecks, boolean isShortSellingExerciseEnabled, boolean isMcwEnabled) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(dayTradeCheck, "dayTradeCheck");
            Intrinsics.checkNotNullParameter(equityInstrument, "equityInstrument");
            Intrinsics.checkNotNullParameter(equityPortfolio, "equityPortfolio");
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
            Intrinsics.checkNotNullParameter(instrumentBuyingPower, "instrumentBuyingPower");
            Intrinsics.checkNotNullParameter(uiOptionInstrument, "uiOptionInstrument");
            return new RequestContext(account, cashSweepEnrolled, dayTradeCheck, equityInstrument, equityPortfolio, equityPosition, exerciseChecks, hasMultipleAccounts, marketHours, instrumentBuyingPower, uiOptionInstrument, overrideDayTradeChecks, isShortSellingExerciseEnabled, isMcwEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestContext)) {
                return false;
            }
            RequestContext requestContext = (RequestContext) other;
            return Intrinsics.areEqual(this.account, requestContext.account) && Intrinsics.areEqual(this.cashSweepEnrolled, requestContext.cashSweepEnrolled) && Intrinsics.areEqual(this.dayTradeCheck, requestContext.dayTradeCheck) && Intrinsics.areEqual(this.equityInstrument, requestContext.equityInstrument) && Intrinsics.areEqual(this.equityPortfolio, requestContext.equityPortfolio) && Intrinsics.areEqual(this.equityPosition, requestContext.equityPosition) && Intrinsics.areEqual(this.exerciseChecks, requestContext.exerciseChecks) && this.hasMultipleAccounts == requestContext.hasMultipleAccounts && Intrinsics.areEqual(this.marketHours, requestContext.marketHours) && Intrinsics.areEqual(this.instrumentBuyingPower, requestContext.instrumentBuyingPower) && Intrinsics.areEqual(this.uiOptionInstrument, requestContext.uiOptionInstrument) && this.overrideDayTradeChecks == requestContext.overrideDayTradeChecks && this.isShortSellingExerciseEnabled == requestContext.isShortSellingExerciseEnabled && this.isMcwEnabled == requestContext.isMcwEnabled;
        }

        public int hashCode() {
            int iHashCode = this.account.hashCode() * 31;
            Boolean bool = this.cashSweepEnrolled;
            int iHashCode2 = (((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.dayTradeCheck.hashCode()) * 31) + this.equityInstrument.hashCode()) * 31) + this.equityPortfolio.hashCode()) * 31;
            Position position = this.equityPosition;
            int iHashCode3 = (iHashCode2 + (position == null ? 0 : position.hashCode())) * 31;
            ApiOptionExerciseChecks apiOptionExerciseChecks = this.exerciseChecks;
            return ((((((((((((((iHashCode3 + (apiOptionExerciseChecks != null ? apiOptionExerciseChecks.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasMultipleAccounts)) * 31) + this.marketHours.hashCode()) * 31) + this.instrumentBuyingPower.hashCode()) * 31) + this.uiOptionInstrument.hashCode()) * 31) + Boolean.hashCode(this.overrideDayTradeChecks)) * 31) + Boolean.hashCode(this.isShortSellingExerciseEnabled)) * 31) + Boolean.hashCode(this.isMcwEnabled);
        }

        public String toString() {
            return "RequestContext(account=" + this.account + ", cashSweepEnrolled=" + this.cashSweepEnrolled + ", dayTradeCheck=" + this.dayTradeCheck + ", equityInstrument=" + this.equityInstrument + ", equityPortfolio=" + this.equityPortfolio + ", equityPosition=" + this.equityPosition + ", exerciseChecks=" + this.exerciseChecks + ", hasMultipleAccounts=" + this.hasMultipleAccounts + ", marketHours=" + this.marketHours + ", instrumentBuyingPower=" + this.instrumentBuyingPower + ", uiOptionInstrument=" + this.uiOptionInstrument + ", overrideDayTradeChecks=" + this.overrideDayTradeChecks + ", isShortSellingExerciseEnabled=" + this.isShortSellingExerciseEnabled + ", isMcwEnabled=" + this.isMcwEnabled + ")";
        }

        public RequestContext(Account account, Boolean bool, TraderDayTradeStore.DayTradeCheckState dayTradeCheck, Instrument equityInstrument, Portfolio equityPortfolio, Position position, ApiOptionExerciseChecks apiOptionExerciseChecks, boolean z, MarketHours marketHours, InstrumentBuyingPower instrumentBuyingPower, UiOptionInstrument uiOptionInstrument, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(dayTradeCheck, "dayTradeCheck");
            Intrinsics.checkNotNullParameter(equityInstrument, "equityInstrument");
            Intrinsics.checkNotNullParameter(equityPortfolio, "equityPortfolio");
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
            Intrinsics.checkNotNullParameter(instrumentBuyingPower, "instrumentBuyingPower");
            Intrinsics.checkNotNullParameter(uiOptionInstrument, "uiOptionInstrument");
            this.account = account;
            this.cashSweepEnrolled = bool;
            this.dayTradeCheck = dayTradeCheck;
            this.equityInstrument = equityInstrument;
            this.equityPortfolio = equityPortfolio;
            this.equityPosition = position;
            this.exerciseChecks = apiOptionExerciseChecks;
            this.hasMultipleAccounts = z;
            this.marketHours = marketHours;
            this.instrumentBuyingPower = instrumentBuyingPower;
            this.uiOptionInstrument = uiOptionInstrument;
            this.overrideDayTradeChecks = z2;
            this.isShortSellingExerciseEnabled = z3;
            this.isMcwEnabled = z4;
        }

        public /* synthetic */ RequestContext(Account account, Boolean bool, TraderDayTradeStore.DayTradeCheckState dayTradeCheckState, Instrument instrument, Portfolio portfolio, Position position, ApiOptionExerciseChecks apiOptionExerciseChecks, boolean z, MarketHours marketHours, InstrumentBuyingPower instrumentBuyingPower, UiOptionInstrument uiOptionInstrument, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(account, bool, dayTradeCheckState, instrument, portfolio, position, apiOptionExerciseChecks, z, marketHours, instrumentBuyingPower, uiOptionInstrument, z2, z3, (i & 8192) != 0 ? false : z4);
        }

        public final Account getAccount() {
            return this.account;
        }

        public final Boolean getCashSweepEnrolled() {
            return this.cashSweepEnrolled;
        }

        public final TraderDayTradeStore.DayTradeCheckState getDayTradeCheck() {
            return this.dayTradeCheck;
        }

        public final Instrument getEquityInstrument() {
            return this.equityInstrument;
        }

        public final Portfolio getEquityPortfolio() {
            return this.equityPortfolio;
        }

        public final Position getEquityPosition() {
            return this.equityPosition;
        }

        public final ApiOptionExerciseChecks getExerciseChecks() {
            return this.exerciseChecks;
        }

        public final boolean getHasMultipleAccounts() {
            return this.hasMultipleAccounts;
        }

        public final MarketHours getMarketHours() {
            return this.marketHours;
        }

        public final InstrumentBuyingPower getInstrumentBuyingPower() {
            return this.instrumentBuyingPower;
        }

        public final UiOptionInstrument getUiOptionInstrument() {
            return this.uiOptionInstrument;
        }

        public final boolean getOverrideDayTradeChecks() {
            return this.overrideDayTradeChecks;
        }

        public final boolean isShortSellingExerciseEnabled() {
            return this.isShortSellingExerciseEnabled;
        }

        public final boolean isMcwEnabled() {
            return this.isMcwEnabled;
        }
    }

    public final OptionInstrument getOptionInstrument() {
        return this.optionInstrument;
    }

    public final OptionChain getOptionChain() {
        return this.optionChain;
    }

    public final OrderSide getSide() {
        return this.side;
    }

    /* renamed from: isBuy, reason: from getter */
    public final boolean getIsBuy() {
        return this.isBuy;
    }

    public final BigDecimal getUnderlyingShareQuantity() {
        return this.underlyingShareQuantity;
    }

    public final BigDecimal getTotalCostFromStrikePrice() {
        return this.totalCostFromStrikePrice;
    }

    public final Money getBuyingPower() {
        return this.buyingPower;
    }

    /* renamed from: isClosingPosition, reason: from getter */
    public final boolean getIsClosingPosition() {
        return this.isClosingPosition;
    }

    /* compiled from: OptionExerciseContext.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0099\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t¢\u0006\u0002\u0010$¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/OptionExerciseContext$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "account", "Lcom/robinhood/models/db/Account;", "cashSweepEnrolled", "", "dayTradeCheck", "Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState;", "equityInstrument", "Lcom/robinhood/models/db/Instrument;", "equityPortfolio", "Lcom/robinhood/models/db/Portfolio;", "equityPosition", "Lcom/robinhood/models/db/Position;", "exerciseChecks", "Lcom/robinhood/models/api/ApiOptionExerciseChecks;", "hasMultipleAccounts", "instrumentBuyingPower", "Lcom/robinhood/models/db/InstrumentBuyingPower;", "marketHours", "Lcom/robinhood/models/db/MarketHours;", "uiOptionInstrument", "Lcom/robinhood/models/ui/UiOptionInstrument;", "overrideDayTradeChecks", "quantity", "Ljava/math/BigDecimal;", "reason", "Lcom/robinhood/models/api/ApiOptionExerciseRequest$Reason;", "refId", "Ljava/util/UUID;", "isShortSellingExerciseEnabled", "isMcwEnabled", "(Lcom/robinhood/models/db/Account;Ljava/lang/Boolean;Lcom/robinhood/librobinhood/data/store/TraderDayTradeStore$DayTradeCheckState;Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Portfolio;Lcom/robinhood/models/db/Position;Lcom/robinhood/models/api/ApiOptionExerciseChecks;ZLcom/robinhood/models/db/InstrumentBuyingPower;Lcom/robinhood/models/db/MarketHours;Lcom/robinhood/models/ui/UiOptionInstrument;ZLjava/math/BigDecimal;Lcom/robinhood/models/api/ApiOptionExerciseRequest$Reason;Ljava/util/UUID;ZZ)Lcom/robinhood/android/optionsexercise/OptionExerciseContext;", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OptionExerciseContext create(Account account, Boolean cashSweepEnrolled, TraderDayTradeStore.DayTradeCheckState dayTradeCheck, Instrument equityInstrument, Portfolio equityPortfolio, Position equityPosition, ApiOptionExerciseChecks exerciseChecks, boolean hasMultipleAccounts, InstrumentBuyingPower instrumentBuyingPower, MarketHours marketHours, UiOptionInstrument uiOptionInstrument, boolean overrideDayTradeChecks, BigDecimal quantity, ApiOptionExerciseRequest.Reason reason, UUID refId, boolean isShortSellingExerciseEnabled, boolean isMcwEnabled) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(dayTradeCheck, "dayTradeCheck");
            Intrinsics.checkNotNullParameter(equityInstrument, "equityInstrument");
            Intrinsics.checkNotNullParameter(equityPortfolio, "equityPortfolio");
            Intrinsics.checkNotNullParameter(instrumentBuyingPower, "instrumentBuyingPower");
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
            Intrinsics.checkNotNullParameter(uiOptionInstrument, "uiOptionInstrument");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(refId, "refId");
            return new OptionExerciseContext(ApiOptionExerciseRequest.INSTANCE.create(account, uiOptionInstrument.getOptionInstrument(), overrideDayTradeChecks, quantity, reason, refId, isShortSellingExerciseEnabled), new RequestContext(account, cashSweepEnrolled, dayTradeCheck, equityInstrument, equityPortfolio, equityPosition, exerciseChecks, hasMultipleAccounts, marketHours, instrumentBuyingPower, uiOptionInstrument, overrideDayTradeChecks, isShortSellingExerciseEnabled, isMcwEnabled));
        }
    }
}
