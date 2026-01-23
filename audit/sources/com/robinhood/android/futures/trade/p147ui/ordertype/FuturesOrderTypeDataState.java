package com.robinhood.android.futures.trade.p147ui.ordertype;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.futures.trade.C17462R;
import com.robinhood.android.futures.trade.p147ui.ordertype.FuturesOrderTypeViewState;
import com.robinhood.android.models.futures.api.order.FuturesOrderSide;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import com.robinhood.android.trade.configuration.C29312R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderTypeDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeDataState;", "", "side", "Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "isDay", "", "contract", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "<init>", "(Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;ZLcom/robinhood/android/models/futures/arsenal/db/FuturesContract;)V", "getSide", "()Lcom/robinhood/android/models/futures/api/order/FuturesOrderSide;", "()Z", "getContract", "()Lcom/robinhood/android/models/futures/arsenal/db/FuturesContract;", "marketOrderConfig", "Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeViewState$OrderTypeConfig;", "getMarketOrderConfig", "()Lcom/robinhood/android/futures/trade/ui/ordertype/FuturesOrderTypeViewState$OrderTypeConfig;", "limitOrderConfig", "getLimitOrderConfig", "stopOrderConfig", "getStopOrderConfig", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FuturesOrderTypeDataState {
    public static final int $stable = 8;
    private final FuturesContract contract;
    private final boolean isDay;
    private final FuturesOrderSide side;

    /* compiled from: FuturesOrderTypeDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FuturesOrderSide.values().length];
            try {
                iArr[FuturesOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ FuturesOrderTypeDataState copy$default(FuturesOrderTypeDataState futuresOrderTypeDataState, FuturesOrderSide futuresOrderSide, boolean z, FuturesContract futuresContract, int i, Object obj) {
        if ((i & 1) != 0) {
            futuresOrderSide = futuresOrderTypeDataState.side;
        }
        if ((i & 2) != 0) {
            z = futuresOrderTypeDataState.isDay;
        }
        if ((i & 4) != 0) {
            futuresContract = futuresOrderTypeDataState.contract;
        }
        return futuresOrderTypeDataState.copy(futuresOrderSide, z, futuresContract);
    }

    /* renamed from: component1, reason: from getter */
    public final FuturesOrderSide getSide() {
        return this.side;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsDay() {
        return this.isDay;
    }

    /* renamed from: component3, reason: from getter */
    public final FuturesContract getContract() {
        return this.contract;
    }

    public final FuturesOrderTypeDataState copy(FuturesOrderSide side, boolean isDay, FuturesContract contract) {
        Intrinsics.checkNotNullParameter(side, "side");
        return new FuturesOrderTypeDataState(side, isDay, contract);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesOrderTypeDataState)) {
            return false;
        }
        FuturesOrderTypeDataState futuresOrderTypeDataState = (FuturesOrderTypeDataState) other;
        return this.side == futuresOrderTypeDataState.side && this.isDay == futuresOrderTypeDataState.isDay && Intrinsics.areEqual(this.contract, futuresOrderTypeDataState.contract);
    }

    public int hashCode() {
        int iHashCode = ((this.side.hashCode() * 31) + Boolean.hashCode(this.isDay)) * 31;
        FuturesContract futuresContract = this.contract;
        return iHashCode + (futuresContract == null ? 0 : futuresContract.hashCode());
    }

    public String toString() {
        return "FuturesOrderTypeDataState(side=" + this.side + ", isDay=" + this.isDay + ", contract=" + this.contract + ")";
    }

    public FuturesOrderTypeDataState(FuturesOrderSide side, boolean z, FuturesContract futuresContract) {
        Intrinsics.checkNotNullParameter(side, "side");
        this.side = side;
        this.isDay = z;
        this.contract = futuresContract;
    }

    public /* synthetic */ FuturesOrderTypeDataState(FuturesOrderSide futuresOrderSide, boolean z, FuturesContract futuresContract, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(futuresOrderSide, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : futuresContract);
    }

    public final FuturesOrderSide getSide() {
        return this.side;
    }

    public final boolean isDay() {
        return this.isDay;
    }

    public final FuturesContract getContract() {
        return this.contract;
    }

    public final FuturesOrderTypeViewState.OrderTypeConfig getMarketOrderConfig() {
        int i;
        StringResource stringResourceInvoke;
        if (this.isDay) {
            i = C29312R.drawable.svg_shares_order_day;
        } else {
            i = C29312R.drawable.svg_shares_order_night;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.side.ordinal()];
        if (i2 == 1) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C17462R.string.futures_order_type_market_buy_order_desc, new Object[0]);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            stringResourceInvoke = StringResource.INSTANCE.invoke(C17462R.string.futures_order_type_market_sell_order_desc, new Object[0]);
        }
        return new FuturesOrderTypeViewState.OrderTypeConfig(i, stringResourceInvoke);
    }

    public final FuturesOrderTypeViewState.OrderTypeConfig getLimitOrderConfig() {
        int i;
        StringResource stringResourceInvoke;
        boolean z = this.isDay;
        if (z && this.side == FuturesOrderSide.BUY) {
            i = C29312R.drawable.svg_limit_order_day_buy;
        } else if (z && this.side == FuturesOrderSide.SELL) {
            i = C29312R.drawable.svg_limit_order_day_sell;
        } else if (!z && this.side == FuturesOrderSide.BUY) {
            i = C29312R.drawable.svg_limit_order_night_buy;
        } else if (!z && this.side == FuturesOrderSide.SELL) {
            i = C29312R.drawable.svg_limit_order_night_sell;
        } else {
            throw new IllegalArgumentException("Unrecognized " + this.isDay + PlaceholderUtils.XXShortPlaceholderText + this.side);
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.side.ordinal()];
        if (i2 == 1) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i3 = C17462R.string.futures_order_type_limit_buy_order_desc;
            FuturesContract futuresContract = this.contract;
            stringResourceInvoke = companion.invoke(i3, futuresContract != null ? futuresContract.getDisplaySymbol() : null);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            StringResource.Companion companion2 = StringResource.INSTANCE;
            int i4 = C17462R.string.futures_order_type_limit_sell_order_desc;
            FuturesContract futuresContract2 = this.contract;
            stringResourceInvoke = companion2.invoke(i4, futuresContract2 != null ? futuresContract2.getDisplaySymbol() : null);
        }
        return new FuturesOrderTypeViewState.OrderTypeConfig(i, stringResourceInvoke);
    }

    public final FuturesOrderTypeViewState.OrderTypeConfig getStopOrderConfig() {
        int i;
        StringResource stringResourceInvoke;
        boolean z = this.isDay;
        if (z && this.side == FuturesOrderSide.BUY) {
            i = C29312R.drawable.svg_stop_order_day_buy;
        } else if (z && this.side == FuturesOrderSide.SELL) {
            i = C29312R.drawable.svg_stop_order_day_sell;
        } else if (!z && this.side == FuturesOrderSide.BUY) {
            i = C29312R.drawable.svg_stop_order_night_buy;
        } else if (!z && this.side == FuturesOrderSide.SELL) {
            i = C29312R.drawable.svg_stop_order_night_sell;
        } else {
            throw new IllegalArgumentException("Unrecognized " + this.isDay + PlaceholderUtils.XXShortPlaceholderText + this.side);
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.side.ordinal()];
        if (i2 == 1) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i3 = C17462R.string.futures_order_type_stop_buy_order_desc;
            FuturesContract futuresContract = this.contract;
            stringResourceInvoke = companion.invoke(i3, futuresContract != null ? futuresContract.getDisplaySymbol() : null);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            StringResource.Companion companion2 = StringResource.INSTANCE;
            int i4 = C17462R.string.futures_order_type_stop_sell_order_desc;
            FuturesContract futuresContract2 = this.contract;
            stringResourceInvoke = companion2.invoke(i4, futuresContract2 != null ? futuresContract2.getDisplaySymbol() : null);
        }
        return new FuturesOrderTypeViewState.OrderTypeConfig(i, stringResourceInvoke);
    }
}
