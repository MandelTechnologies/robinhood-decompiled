package com.robinhood.android.futures.trade.p147ui.ladder;

import com.robinhood.android.lib.futures.trade.UiFuturesOrderContext;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesLadderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\bf\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent;", "", "ApiOrNetworkError", "ReviewOrder", "NoFuturesAccountError", "MarketdataOnlyError", "Snackbar", "HapticFeedbacks", "CenterAtIndex", "ShowFtuxTooltip", "Vibrate", "LadderKillswitchIsActive", "OpenAccountHistory", "PrefetchFtuxLotties", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface LadderEvent {

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent$ApiOrNetworkError;", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ApiOrNetworkError implements LadderEvent {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ ApiOrNetworkError copy$default(ApiOrNetworkError apiOrNetworkError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = apiOrNetworkError.error;
            }
            return apiOrNetworkError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final ApiOrNetworkError copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new ApiOrNetworkError(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ApiOrNetworkError) && Intrinsics.areEqual(this.error, ((ApiOrNetworkError) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "ApiOrNetworkError(error=" + this.error + ")";
        }

        public ApiOrNetworkError(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent$ReviewOrder;", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent;", Card.Icon.ORDER, "Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$OrderRequest;", "<init>", "(Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$OrderRequest;)V", "getOrder", "()Lcom/robinhood/android/lib/futures/trade/UiFuturesOrderContext$OrderRequest;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ReviewOrder implements LadderEvent {
        public static final int $stable = 8;
        private final UiFuturesOrderContext.OrderRequest order;

        public static /* synthetic */ ReviewOrder copy$default(ReviewOrder reviewOrder, UiFuturesOrderContext.OrderRequest orderRequest, int i, Object obj) {
            if ((i & 1) != 0) {
                orderRequest = reviewOrder.order;
            }
            return reviewOrder.copy(orderRequest);
        }

        /* renamed from: component1, reason: from getter */
        public final UiFuturesOrderContext.OrderRequest getOrder() {
            return this.order;
        }

        public final ReviewOrder copy(UiFuturesOrderContext.OrderRequest order) {
            Intrinsics.checkNotNullParameter(order, "order");
            return new ReviewOrder(order);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReviewOrder) && Intrinsics.areEqual(this.order, ((ReviewOrder) other).order);
        }

        public int hashCode() {
            return this.order.hashCode();
        }

        public String toString() {
            return "ReviewOrder(order=" + this.order + ")";
        }

        public ReviewOrder(UiFuturesOrderContext.OrderRequest order) {
            Intrinsics.checkNotNullParameter(order, "order");
            this.order = order;
        }

        public final UiFuturesOrderContext.OrderRequest getOrder() {
            return this.order;
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent$NoFuturesAccountError;", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NoFuturesAccountError implements LadderEvent {
        public static final int $stable = 0;
        public static final NoFuturesAccountError INSTANCE = new NoFuturesAccountError();

        public boolean equals(Object other) {
            return this == other || (other instanceof NoFuturesAccountError);
        }

        public int hashCode() {
            return -349999610;
        }

        public String toString() {
            return "NoFuturesAccountError";
        }

        private NoFuturesAccountError() {
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent$MarketdataOnlyError;", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MarketdataOnlyError implements LadderEvent {
        public static final int $stable = 0;
        public static final MarketdataOnlyError INSTANCE = new MarketdataOnlyError();

        public boolean equals(Object other) {
            return this == other || (other instanceof MarketdataOnlyError);
        }

        public int hashCode() {
            return -1591108622;
        }

        public String toString() {
            return "MarketdataOnlyError";
        }

        private MarketdataOnlyError() {
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent$Snackbar;", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent;", "msg", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getMsg", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Snackbar implements LadderEvent {
        public static final int $stable = StringResource.$stable;
        private final StringResource msg;

        public static /* synthetic */ Snackbar copy$default(Snackbar snackbar, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = snackbar.msg;
            }
            return snackbar.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getMsg() {
            return this.msg;
        }

        public final Snackbar copy(StringResource msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            return new Snackbar(msg);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Snackbar) && Intrinsics.areEqual(this.msg, ((Snackbar) other).msg);
        }

        public int hashCode() {
            return this.msg.hashCode();
        }

        public String toString() {
            return "Snackbar(msg=" + this.msg + ")";
        }

        public Snackbar(StringResource msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            this.msg = msg;
        }

        public final StringResource getMsg() {
            return this.msg;
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent$HapticFeedbacks;", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent;", "constant", "", "<init>", "(I)V", "getConstant", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class HapticFeedbacks implements LadderEvent {
        public static final int $stable = 0;
        private final int constant;

        public static /* synthetic */ HapticFeedbacks copy$default(HapticFeedbacks hapticFeedbacks, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = hapticFeedbacks.constant;
            }
            return hapticFeedbacks.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getConstant() {
            return this.constant;
        }

        public final HapticFeedbacks copy(int constant) {
            return new HapticFeedbacks(constant);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HapticFeedbacks) && this.constant == ((HapticFeedbacks) other).constant;
        }

        public int hashCode() {
            return Integer.hashCode(this.constant);
        }

        public String toString() {
            return "HapticFeedbacks(constant=" + this.constant + ")";
        }

        public HapticFeedbacks(int i) {
            this.constant = i;
        }

        public final int getConstant() {
            return this.constant;
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent$CenterAtIndex;", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "animate", "", "<init>", "(IZ)V", "getIndex", "()I", "getAnimate", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CenterAtIndex implements LadderEvent {
        public static final int $stable = 0;
        private final boolean animate;
        private final int index;

        public static /* synthetic */ CenterAtIndex copy$default(CenterAtIndex centerAtIndex, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = centerAtIndex.index;
            }
            if ((i2 & 2) != 0) {
                z = centerAtIndex.animate;
            }
            return centerAtIndex.copy(i, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getAnimate() {
            return this.animate;
        }

        public final CenterAtIndex copy(int index, boolean animate) {
            return new CenterAtIndex(index, animate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CenterAtIndex)) {
                return false;
            }
            CenterAtIndex centerAtIndex = (CenterAtIndex) other;
            return this.index == centerAtIndex.index && this.animate == centerAtIndex.animate;
        }

        public int hashCode() {
            return (Integer.hashCode(this.index) * 31) + Boolean.hashCode(this.animate);
        }

        public String toString() {
            return "CenterAtIndex(index=" + this.index + ", animate=" + this.animate + ")";
        }

        public CenterAtIndex(int i, boolean z) {
            this.index = i;
            this.animate = z;
        }

        public final boolean getAnimate() {
            return this.animate;
        }

        public final int getIndex() {
            return this.index;
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent$ShowFtuxTooltip;", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowFtuxTooltip implements LadderEvent {
        public static final int $stable = 0;
        public static final ShowFtuxTooltip INSTANCE = new ShowFtuxTooltip();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowFtuxTooltip);
        }

        public int hashCode() {
            return 2085442321;
        }

        public String toString() {
            return "ShowFtuxTooltip";
        }

        private ShowFtuxTooltip() {
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent$Vibrate;", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent;", "duration", "", "<init>", "(J)V", "getDuration", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Vibrate implements LadderEvent {
        public static final int $stable = 0;
        private final long duration;

        public static /* synthetic */ Vibrate copy$default(Vibrate vibrate, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = vibrate.duration;
            }
            return vibrate.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getDuration() {
            return this.duration;
        }

        public final Vibrate copy(long duration) {
            return new Vibrate(duration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Vibrate) && this.duration == ((Vibrate) other).duration;
        }

        public int hashCode() {
            return Long.hashCode(this.duration);
        }

        public String toString() {
            return "Vibrate(duration=" + this.duration + ")";
        }

        public Vibrate(long j) {
            this.duration = j;
        }

        public final long getDuration() {
            return this.duration;
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent$LadderKillswitchIsActive;", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LadderKillswitchIsActive implements LadderEvent {
        public static final int $stable = 0;
        public static final LadderKillswitchIsActive INSTANCE = new LadderKillswitchIsActive();

        public boolean equals(Object other) {
            return this == other || (other instanceof LadderKillswitchIsActive);
        }

        public int hashCode() {
            return -2089808184;
        }

        public String toString() {
            return "LadderKillswitchIsActive";
        }

        private LadderKillswitchIsActive() {
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent$OpenAccountHistory;", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent;", "fragmentKey", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$Key;", "<init>", "(Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$Key;)V", "getFragmentKey", "()Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$Key;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OpenAccountHistory implements LadderEvent {
        public static final int $stable = 8;
        private final AccountsHistoryContract.Key fragmentKey;

        public static /* synthetic */ OpenAccountHistory copy$default(OpenAccountHistory openAccountHistory, AccountsHistoryContract.Key key, int i, Object obj) {
            if ((i & 1) != 0) {
                key = openAccountHistory.fragmentKey;
            }
            return openAccountHistory.copy(key);
        }

        /* renamed from: component1, reason: from getter */
        public final AccountsHistoryContract.Key getFragmentKey() {
            return this.fragmentKey;
        }

        public final OpenAccountHistory copy(AccountsHistoryContract.Key fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            return new OpenAccountHistory(fragmentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenAccountHistory) && Intrinsics.areEqual(this.fragmentKey, ((OpenAccountHistory) other).fragmentKey);
        }

        public int hashCode() {
            return this.fragmentKey.hashCode();
        }

        public String toString() {
            return "OpenAccountHistory(fragmentKey=" + this.fragmentKey + ")";
        }

        public OpenAccountHistory(AccountsHistoryContract.Key fragmentKey) {
            Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
            this.fragmentKey = fragmentKey;
        }

        public final AccountsHistoryContract.Key getFragmentKey() {
            return this.fragmentKey;
        }
    }

    /* compiled from: FuturesLadderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent$PrefetchFtuxLotties;", "Lcom/robinhood/android/futures/trade/ui/ladder/LadderEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PrefetchFtuxLotties implements LadderEvent {
        public static final int $stable = 0;
        public static final PrefetchFtuxLotties INSTANCE = new PrefetchFtuxLotties();

        public boolean equals(Object other) {
            return this == other || (other instanceof PrefetchFtuxLotties);
        }

        public int hashCode() {
            return -1530502520;
        }

        public String toString() {
            return "PrefetchFtuxLotties";
        }

        private PrefetchFtuxLotties() {
        }
    }
}
