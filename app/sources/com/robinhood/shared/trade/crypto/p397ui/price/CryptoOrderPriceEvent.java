package com.robinhood.shared.trade.crypto.p397ui.price;

import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.utils.resource.StringResource;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderPriceEvent.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent;", "", "<init>", "()V", "LimitOrderPriceSelectedEvent", "StopLossOrderPriceSelectedEvent", "StopLimitOrderStopPriceSelectedEvent", "StopLimitOrderLimitPriceSelectedEvent", "DialogEvent", "DialogData", "ShowOrderEducationEvent", "ShowDialogFragment", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$DialogEvent;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$LimitOrderPriceSelectedEvent;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$ShowDialogFragment;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$ShowOrderEducationEvent;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$StopLimitOrderLimitPriceSelectedEvent;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$StopLimitOrderStopPriceSelectedEvent;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$StopLossOrderPriceSelectedEvent;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoOrderPriceEvent {
    public static final int $stable = 0;

    public /* synthetic */ CryptoOrderPriceEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CryptoOrderPriceEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$LimitOrderPriceSelectedEvent;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent;", "limitPrice", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getLimitPrice", "()Ljava/math/BigDecimal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LimitOrderPriceSelectedEvent extends CryptoOrderPriceEvent {
        public static final int $stable = 8;
        private final BigDecimal limitPrice;

        public static /* synthetic */ LimitOrderPriceSelectedEvent copy$default(LimitOrderPriceSelectedEvent limitOrderPriceSelectedEvent, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = limitOrderPriceSelectedEvent.limitPrice;
            }
            return limitOrderPriceSelectedEvent.copy(bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        public final LimitOrderPriceSelectedEvent copy(BigDecimal limitPrice) {
            Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
            return new LimitOrderPriceSelectedEvent(limitPrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LimitOrderPriceSelectedEvent) && Intrinsics.areEqual(this.limitPrice, ((LimitOrderPriceSelectedEvent) other).limitPrice);
        }

        public int hashCode() {
            return this.limitPrice.hashCode();
        }

        public String toString() {
            return "LimitOrderPriceSelectedEvent(limitPrice=" + this.limitPrice + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LimitOrderPriceSelectedEvent(BigDecimal limitPrice) {
            super(null);
            Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
            this.limitPrice = limitPrice;
        }

        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
        }
    }

    private CryptoOrderPriceEvent() {
    }

    /* compiled from: CryptoOrderPriceEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$StopLossOrderPriceSelectedEvent;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent;", "stopPrice", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getStopPrice", "()Ljava/math/BigDecimal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StopLossOrderPriceSelectedEvent extends CryptoOrderPriceEvent {
        public static final int $stable = 8;
        private final BigDecimal stopPrice;

        public static /* synthetic */ StopLossOrderPriceSelectedEvent copy$default(StopLossOrderPriceSelectedEvent stopLossOrderPriceSelectedEvent, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = stopLossOrderPriceSelectedEvent.stopPrice;
            }
            return stopLossOrderPriceSelectedEvent.copy(bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getStopPrice() {
            return this.stopPrice;
        }

        public final StopLossOrderPriceSelectedEvent copy(BigDecimal stopPrice) {
            Intrinsics.checkNotNullParameter(stopPrice, "stopPrice");
            return new StopLossOrderPriceSelectedEvent(stopPrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StopLossOrderPriceSelectedEvent) && Intrinsics.areEqual(this.stopPrice, ((StopLossOrderPriceSelectedEvent) other).stopPrice);
        }

        public int hashCode() {
            return this.stopPrice.hashCode();
        }

        public String toString() {
            return "StopLossOrderPriceSelectedEvent(stopPrice=" + this.stopPrice + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopLossOrderPriceSelectedEvent(BigDecimal stopPrice) {
            super(null);
            Intrinsics.checkNotNullParameter(stopPrice, "stopPrice");
            this.stopPrice = stopPrice;
        }

        public final BigDecimal getStopPrice() {
            return this.stopPrice;
        }
    }

    /* compiled from: CryptoOrderPriceEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$StopLimitOrderStopPriceSelectedEvent;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent;", "stopPrice", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "getStopPrice", "()Ljava/math/BigDecimal;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StopLimitOrderStopPriceSelectedEvent extends CryptoOrderPriceEvent {
        public static final int $stable = 8;
        private final BigDecimal stopPrice;

        public static /* synthetic */ StopLimitOrderStopPriceSelectedEvent copy$default(StopLimitOrderStopPriceSelectedEvent stopLimitOrderStopPriceSelectedEvent, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = stopLimitOrderStopPriceSelectedEvent.stopPrice;
            }
            return stopLimitOrderStopPriceSelectedEvent.copy(bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getStopPrice() {
            return this.stopPrice;
        }

        public final StopLimitOrderStopPriceSelectedEvent copy(BigDecimal stopPrice) {
            Intrinsics.checkNotNullParameter(stopPrice, "stopPrice");
            return new StopLimitOrderStopPriceSelectedEvent(stopPrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StopLimitOrderStopPriceSelectedEvent) && Intrinsics.areEqual(this.stopPrice, ((StopLimitOrderStopPriceSelectedEvent) other).stopPrice);
        }

        public int hashCode() {
            return this.stopPrice.hashCode();
        }

        public String toString() {
            return "StopLimitOrderStopPriceSelectedEvent(stopPrice=" + this.stopPrice + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopLimitOrderStopPriceSelectedEvent(BigDecimal stopPrice) {
            super(null);
            Intrinsics.checkNotNullParameter(stopPrice, "stopPrice");
            this.stopPrice = stopPrice;
        }

        public final BigDecimal getStopPrice() {
            return this.stopPrice;
        }
    }

    /* compiled from: CryptoOrderPriceEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$StopLimitOrderLimitPriceSelectedEvent;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent;", "stopPrice", "Ljava/math/BigDecimal;", "limitPrice", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getStopPrice", "()Ljava/math/BigDecimal;", "getLimitPrice", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StopLimitOrderLimitPriceSelectedEvent extends CryptoOrderPriceEvent {
        public static final int $stable = 8;
        private final BigDecimal limitPrice;
        private final BigDecimal stopPrice;

        public static /* synthetic */ StopLimitOrderLimitPriceSelectedEvent copy$default(StopLimitOrderLimitPriceSelectedEvent stopLimitOrderLimitPriceSelectedEvent, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = stopLimitOrderLimitPriceSelectedEvent.stopPrice;
            }
            if ((i & 2) != 0) {
                bigDecimal2 = stopLimitOrderLimitPriceSelectedEvent.limitPrice;
            }
            return stopLimitOrderLimitPriceSelectedEvent.copy(bigDecimal, bigDecimal2);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getStopPrice() {
            return this.stopPrice;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        public final StopLimitOrderLimitPriceSelectedEvent copy(BigDecimal stopPrice, BigDecimal limitPrice) {
            Intrinsics.checkNotNullParameter(stopPrice, "stopPrice");
            Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
            return new StopLimitOrderLimitPriceSelectedEvent(stopPrice, limitPrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StopLimitOrderLimitPriceSelectedEvent)) {
                return false;
            }
            StopLimitOrderLimitPriceSelectedEvent stopLimitOrderLimitPriceSelectedEvent = (StopLimitOrderLimitPriceSelectedEvent) other;
            return Intrinsics.areEqual(this.stopPrice, stopLimitOrderLimitPriceSelectedEvent.stopPrice) && Intrinsics.areEqual(this.limitPrice, stopLimitOrderLimitPriceSelectedEvent.limitPrice);
        }

        public int hashCode() {
            return (this.stopPrice.hashCode() * 31) + this.limitPrice.hashCode();
        }

        public String toString() {
            return "StopLimitOrderLimitPriceSelectedEvent(stopPrice=" + this.stopPrice + ", limitPrice=" + this.limitPrice + ")";
        }

        public final BigDecimal getStopPrice() {
            return this.stopPrice;
        }

        public final BigDecimal getLimitPrice() {
            return this.limitPrice;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StopLimitOrderLimitPriceSelectedEvent(BigDecimal stopPrice, BigDecimal limitPrice) {
            super(null);
            Intrinsics.checkNotNullParameter(stopPrice, "stopPrice");
            Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
            this.stopPrice = stopPrice;
            this.limitPrice = limitPrice;
        }
    }

    /* compiled from: CryptoOrderPriceEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$DialogEvent;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent;", "dialogData", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$DialogData;", "<init>", "(Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$DialogData;)V", "getDialogData", "()Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$DialogData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DialogEvent extends CryptoOrderPriceEvent {
        public static final int $stable = StringResource.$stable;
        private final DialogData dialogData;

        public static /* synthetic */ DialogEvent copy$default(DialogEvent dialogEvent, DialogData dialogData, int i, Object obj) {
            if ((i & 1) != 0) {
                dialogData = dialogEvent.dialogData;
            }
            return dialogEvent.copy(dialogData);
        }

        /* renamed from: component1, reason: from getter */
        public final DialogData getDialogData() {
            return this.dialogData;
        }

        public final DialogEvent copy(DialogData dialogData) {
            Intrinsics.checkNotNullParameter(dialogData, "dialogData");
            return new DialogEvent(dialogData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DialogEvent) && Intrinsics.areEqual(this.dialogData, ((DialogEvent) other).dialogData);
        }

        public int hashCode() {
            return this.dialogData.hashCode();
        }

        public String toString() {
            return "DialogEvent(dialogData=" + this.dialogData + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogEvent(DialogData dialogData) {
            super(null);
            Intrinsics.checkNotNullParameter(dialogData, "dialogData");
            this.dialogData = dialogData;
        }

        public final DialogData getDialogData() {
            return this.dialogData;
        }
    }

    /* compiled from: CryptoOrderPriceEvent.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$DialogData;", "", "id", "", "titleText", "Lcom/robinhood/utils/resource/StringResource;", "messageText", "positiveButtonText", "negativeButtonText", "tag", "", "alertTitle", "<init>", "(ILcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getTitleText", "()Lcom/robinhood/utils/resource/StringResource;", "getMessageText", "getPositiveButtonText", "getNegativeButtonText", "getTag", "()Ljava/lang/String;", "getAlertTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DialogData {
        public static final int $stable = StringResource.$stable;
        private final String alertTitle;
        private final int id;
        private final StringResource messageText;
        private final StringResource negativeButtonText;
        private final StringResource positiveButtonText;
        private final String tag;
        private final StringResource titleText;

        public static /* synthetic */ DialogData copy$default(DialogData dialogData, int i, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = dialogData.id;
            }
            if ((i2 & 2) != 0) {
                stringResource = dialogData.titleText;
            }
            if ((i2 & 4) != 0) {
                stringResource2 = dialogData.messageText;
            }
            if ((i2 & 8) != 0) {
                stringResource3 = dialogData.positiveButtonText;
            }
            if ((i2 & 16) != 0) {
                stringResource4 = dialogData.negativeButtonText;
            }
            if ((i2 & 32) != 0) {
                str = dialogData.tag;
            }
            if ((i2 & 64) != 0) {
                str2 = dialogData.alertTitle;
            }
            String str3 = str;
            String str4 = str2;
            StringResource stringResource5 = stringResource4;
            StringResource stringResource6 = stringResource2;
            return dialogData.copy(i, stringResource, stringResource6, stringResource3, stringResource5, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getTitleText() {
            return this.titleText;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getMessageText() {
            return this.messageText;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getPositiveButtonText() {
            return this.positiveButtonText;
        }

        /* renamed from: component5, reason: from getter */
        public final StringResource getNegativeButtonText() {
            return this.negativeButtonText;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* renamed from: component7, reason: from getter */
        public final String getAlertTitle() {
            return this.alertTitle;
        }

        public final DialogData copy(int id, StringResource titleText, StringResource messageText, StringResource positiveButtonText, StringResource negativeButtonText, String tag, String alertTitle) {
            Intrinsics.checkNotNullParameter(titleText, "titleText");
            Intrinsics.checkNotNullParameter(messageText, "messageText");
            Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
            Intrinsics.checkNotNullParameter(tag, "tag");
            return new DialogData(id, titleText, messageText, positiveButtonText, negativeButtonText, tag, alertTitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DialogData)) {
                return false;
            }
            DialogData dialogData = (DialogData) other;
            return this.id == dialogData.id && Intrinsics.areEqual(this.titleText, dialogData.titleText) && Intrinsics.areEqual(this.messageText, dialogData.messageText) && Intrinsics.areEqual(this.positiveButtonText, dialogData.positiveButtonText) && Intrinsics.areEqual(this.negativeButtonText, dialogData.negativeButtonText) && Intrinsics.areEqual(this.tag, dialogData.tag) && Intrinsics.areEqual(this.alertTitle, dialogData.alertTitle);
        }

        public int hashCode() {
            int iHashCode = ((((((Integer.hashCode(this.id) * 31) + this.titleText.hashCode()) * 31) + this.messageText.hashCode()) * 31) + this.positiveButtonText.hashCode()) * 31;
            StringResource stringResource = this.negativeButtonText;
            int iHashCode2 = (((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.tag.hashCode()) * 31;
            String str = this.alertTitle;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "DialogData(id=" + this.id + ", titleText=" + this.titleText + ", messageText=" + this.messageText + ", positiveButtonText=" + this.positiveButtonText + ", negativeButtonText=" + this.negativeButtonText + ", tag=" + this.tag + ", alertTitle=" + this.alertTitle + ")";
        }

        public DialogData(int i, StringResource titleText, StringResource messageText, StringResource positiveButtonText, StringResource stringResource, String tag, String str) {
            Intrinsics.checkNotNullParameter(titleText, "titleText");
            Intrinsics.checkNotNullParameter(messageText, "messageText");
            Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.id = i;
            this.titleText = titleText;
            this.messageText = messageText;
            this.positiveButtonText = positiveButtonText;
            this.negativeButtonText = stringResource;
            this.tag = tag;
            this.alertTitle = str;
        }

        public /* synthetic */ DialogData(int i, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, stringResource, stringResource2, stringResource3, stringResource4, str, (i2 & 64) != 0 ? null : str2);
        }

        public final int getId() {
            return this.id;
        }

        public final StringResource getTitleText() {
            return this.titleText;
        }

        public final StringResource getMessageText() {
            return this.messageText;
        }

        public final StringResource getPositiveButtonText() {
            return this.positiveButtonText;
        }

        public final StringResource getNegativeButtonText() {
            return this.negativeButtonText;
        }

        public final String getTag() {
            return this.tag;
        }

        public final String getAlertTitle() {
            return this.alertTitle;
        }
    }

    /* compiled from: CryptoOrderPriceEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$ShowOrderEducationEvent;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", "side", "Lcom/robinhood/models/db/OrderSide;", "<init>", "(Lcom/robinhood/models/db/Order$Configuration;Lcom/robinhood/models/db/OrderSide;)V", "getConfiguration", "()Lcom/robinhood/models/db/Order$Configuration;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowOrderEducationEvent extends CryptoOrderPriceEvent {
        public static final int $stable = 0;
        private final Order.Configuration configuration;
        private final OrderSide side;

        public static /* synthetic */ ShowOrderEducationEvent copy$default(ShowOrderEducationEvent showOrderEducationEvent, Order.Configuration configuration, OrderSide orderSide, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = showOrderEducationEvent.configuration;
            }
            if ((i & 2) != 0) {
                orderSide = showOrderEducationEvent.side;
            }
            return showOrderEducationEvent.copy(configuration, orderSide);
        }

        /* renamed from: component1, reason: from getter */
        public final Order.Configuration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderSide getSide() {
            return this.side;
        }

        public final ShowOrderEducationEvent copy(Order.Configuration configuration, OrderSide side) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(side, "side");
            return new ShowOrderEducationEvent(configuration, side);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowOrderEducationEvent)) {
                return false;
            }
            ShowOrderEducationEvent showOrderEducationEvent = (ShowOrderEducationEvent) other;
            return this.configuration == showOrderEducationEvent.configuration && this.side == showOrderEducationEvent.side;
        }

        public int hashCode() {
            return (this.configuration.hashCode() * 31) + this.side.hashCode();
        }

        public String toString() {
            return "ShowOrderEducationEvent(configuration=" + this.configuration + ", side=" + this.side + ")";
        }

        public final Order.Configuration getConfiguration() {
            return this.configuration;
        }

        public final OrderSide getSide() {
            return this.side;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowOrderEducationEvent(Order.Configuration configuration, OrderSide side) {
            super(null);
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(side, "side");
            this.configuration = configuration;
            this.side = side;
        }
    }

    /* compiled from: CryptoOrderPriceEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent$ShowDialogFragment;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceEvent;", "dialogFragmentKey", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/DialogFragmentKey;)V", "getDialogFragmentKey", "()Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowDialogFragment extends CryptoOrderPriceEvent {
        public static final int $stable = 8;
        private final DialogFragmentKey dialogFragmentKey;

        public static /* synthetic */ ShowDialogFragment copy$default(ShowDialogFragment showDialogFragment, DialogFragmentKey dialogFragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                dialogFragmentKey = showDialogFragment.dialogFragmentKey;
            }
            return showDialogFragment.copy(dialogFragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final DialogFragmentKey getDialogFragmentKey() {
            return this.dialogFragmentKey;
        }

        public final ShowDialogFragment copy(DialogFragmentKey dialogFragmentKey) {
            Intrinsics.checkNotNullParameter(dialogFragmentKey, "dialogFragmentKey");
            return new ShowDialogFragment(dialogFragmentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowDialogFragment) && Intrinsics.areEqual(this.dialogFragmentKey, ((ShowDialogFragment) other).dialogFragmentKey);
        }

        public int hashCode() {
            return this.dialogFragmentKey.hashCode();
        }

        public String toString() {
            return "ShowDialogFragment(dialogFragmentKey=" + this.dialogFragmentKey + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowDialogFragment(DialogFragmentKey dialogFragmentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(dialogFragmentKey, "dialogFragmentKey");
            this.dialogFragmentKey = dialogFragmentKey;
        }

        public final DialogFragmentKey getDialogFragmentKey() {
            return this.dialogFragmentKey;
        }
    }
}
