package com.robinhood.android.equities.equitytrade;

import android.net.Uri;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.p320db.EquityOrderChecksAlert;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderSubmitResult.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\n\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;", "", "orderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "getOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "ChangeTradingSessionAction", "DisplayOrderCheck", "NotifyAutoSendSuccess", "LaunchTradeFlow", "ShowDialogFragment", "Error", "DeepLink", "EditLimitOrderAction", "EditStopOrderAction", "NoAction", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$ChangeTradingSessionAction;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$DeepLink;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$DisplayOrderCheck;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$EditLimitOrderAction;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$EditStopOrderAction;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$Error;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$LaunchTradeFlow;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$NoAction;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$NotifyAutoSendSuccess;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$ShowDialogFragment;", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface OrderSubmitResult {
    EquityOrderIntent getOrderIntent();

    /* compiled from: OrderSubmitResult.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$ChangeTradingSessionAction;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;", "orderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "<init>", "(Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;)V", "getOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ChangeTradingSessionAction implements OrderSubmitResult {
        private final EquityOrderIntent orderIntent;

        public static /* synthetic */ ChangeTradingSessionAction copy$default(ChangeTradingSessionAction changeTradingSessionAction, EquityOrderIntent equityOrderIntent, int i, Object obj) {
            if ((i & 1) != 0) {
                equityOrderIntent = changeTradingSessionAction.orderIntent;
            }
            return changeTradingSessionAction.copy(equityOrderIntent);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }

        public final ChangeTradingSessionAction copy(EquityOrderIntent orderIntent) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            return new ChangeTradingSessionAction(orderIntent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChangeTradingSessionAction) && Intrinsics.areEqual(this.orderIntent, ((ChangeTradingSessionAction) other).orderIntent);
        }

        public int hashCode() {
            return this.orderIntent.hashCode();
        }

        public String toString() {
            return "ChangeTradingSessionAction(orderIntent=" + this.orderIntent + ")";
        }

        public ChangeTradingSessionAction(EquityOrderIntent orderIntent) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            this.orderIntent = orderIntent;
        }

        @Override // com.robinhood.android.equities.equitytrade.OrderSubmitResult
        public EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }
    }

    /* compiled from: OrderSubmitResult.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$DisplayOrderCheck;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;", "orderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "orderCheckAlert", "Lcom/robinhood/models/db/EquityOrderChecksAlert;", "<init>", "(Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;Lcom/robinhood/models/db/EquityOrderChecksAlert;)V", "getOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "getOrderCheckAlert", "()Lcom/robinhood/models/db/EquityOrderChecksAlert;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DisplayOrderCheck implements OrderSubmitResult {
        private final EquityOrderChecksAlert orderCheckAlert;
        private final EquityOrderIntent orderIntent;

        public static /* synthetic */ DisplayOrderCheck copy$default(DisplayOrderCheck displayOrderCheck, EquityOrderIntent equityOrderIntent, EquityOrderChecksAlert equityOrderChecksAlert, int i, Object obj) {
            if ((i & 1) != 0) {
                equityOrderIntent = displayOrderCheck.orderIntent;
            }
            if ((i & 2) != 0) {
                equityOrderChecksAlert = displayOrderCheck.orderCheckAlert;
            }
            return displayOrderCheck.copy(equityOrderIntent, equityOrderChecksAlert);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }

        /* renamed from: component2, reason: from getter */
        public final EquityOrderChecksAlert getOrderCheckAlert() {
            return this.orderCheckAlert;
        }

        public final DisplayOrderCheck copy(EquityOrderIntent orderIntent, EquityOrderChecksAlert orderCheckAlert) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            return new DisplayOrderCheck(orderIntent, orderCheckAlert);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisplayOrderCheck)) {
                return false;
            }
            DisplayOrderCheck displayOrderCheck = (DisplayOrderCheck) other;
            return Intrinsics.areEqual(this.orderIntent, displayOrderCheck.orderIntent) && Intrinsics.areEqual(this.orderCheckAlert, displayOrderCheck.orderCheckAlert);
        }

        public int hashCode() {
            int iHashCode = this.orderIntent.hashCode() * 31;
            EquityOrderChecksAlert equityOrderChecksAlert = this.orderCheckAlert;
            return iHashCode + (equityOrderChecksAlert == null ? 0 : equityOrderChecksAlert.hashCode());
        }

        public String toString() {
            return "DisplayOrderCheck(orderIntent=" + this.orderIntent + ", orderCheckAlert=" + this.orderCheckAlert + ")";
        }

        public DisplayOrderCheck(EquityOrderIntent orderIntent, EquityOrderChecksAlert equityOrderChecksAlert) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            this.orderIntent = orderIntent;
            this.orderCheckAlert = equityOrderChecksAlert;
        }

        @Override // com.robinhood.android.equities.equitytrade.OrderSubmitResult
        public EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }

        public final EquityOrderChecksAlert getOrderCheckAlert() {
            return this.orderCheckAlert;
        }
    }

    /* compiled from: OrderSubmitResult.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$NotifyAutoSendSuccess;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;", "orderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "<init>", "(Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;)V", "getOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NotifyAutoSendSuccess implements OrderSubmitResult {
        private final EquityOrderIntent orderIntent;

        public static /* synthetic */ NotifyAutoSendSuccess copy$default(NotifyAutoSendSuccess notifyAutoSendSuccess, EquityOrderIntent equityOrderIntent, int i, Object obj) {
            if ((i & 1) != 0) {
                equityOrderIntent = notifyAutoSendSuccess.orderIntent;
            }
            return notifyAutoSendSuccess.copy(equityOrderIntent);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }

        public final NotifyAutoSendSuccess copy(EquityOrderIntent orderIntent) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            return new NotifyAutoSendSuccess(orderIntent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotifyAutoSendSuccess) && Intrinsics.areEqual(this.orderIntent, ((NotifyAutoSendSuccess) other).orderIntent);
        }

        public int hashCode() {
            return this.orderIntent.hashCode();
        }

        public String toString() {
            return "NotifyAutoSendSuccess(orderIntent=" + this.orderIntent + ")";
        }

        public NotifyAutoSendSuccess(EquityOrderIntent orderIntent) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            this.orderIntent = orderIntent;
        }

        @Override // com.robinhood.android.equities.equitytrade.OrderSubmitResult
        public EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }
    }

    /* compiled from: OrderSubmitResult.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$LaunchTradeFlow;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;", "orderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "intentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "(Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;Lcom/robinhood/android/navigation/keys/IntentKey;)V", "getOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LaunchTradeFlow implements OrderSubmitResult {
        private final IntentKey intentKey;
        private final EquityOrderIntent orderIntent;

        public static /* synthetic */ LaunchTradeFlow copy$default(LaunchTradeFlow launchTradeFlow, EquityOrderIntent equityOrderIntent, IntentKey intentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                equityOrderIntent = launchTradeFlow.orderIntent;
            }
            if ((i & 2) != 0) {
                intentKey = launchTradeFlow.intentKey;
            }
            return launchTradeFlow.copy(equityOrderIntent, intentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }

        /* renamed from: component2, reason: from getter */
        public final IntentKey getIntentKey() {
            return this.intentKey;
        }

        public final LaunchTradeFlow copy(EquityOrderIntent orderIntent, IntentKey intentKey) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            Intrinsics.checkNotNullParameter(intentKey, "intentKey");
            return new LaunchTradeFlow(orderIntent, intentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LaunchTradeFlow)) {
                return false;
            }
            LaunchTradeFlow launchTradeFlow = (LaunchTradeFlow) other;
            return Intrinsics.areEqual(this.orderIntent, launchTradeFlow.orderIntent) && Intrinsics.areEqual(this.intentKey, launchTradeFlow.intentKey);
        }

        public int hashCode() {
            return (this.orderIntent.hashCode() * 31) + this.intentKey.hashCode();
        }

        public String toString() {
            return "LaunchTradeFlow(orderIntent=" + this.orderIntent + ", intentKey=" + this.intentKey + ")";
        }

        public LaunchTradeFlow(EquityOrderIntent orderIntent, IntentKey intentKey) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            Intrinsics.checkNotNullParameter(intentKey, "intentKey");
            this.orderIntent = orderIntent;
            this.intentKey = intentKey;
        }

        @Override // com.robinhood.android.equities.equitytrade.OrderSubmitResult
        public EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }

        public final IntentKey getIntentKey() {
            return this.intentKey;
        }
    }

    /* compiled from: OrderSubmitResult.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$ShowDialogFragment;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;", "orderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "dialogFragmentKey", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "tag", "", "<init>", "(Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;Lcom/robinhood/android/navigation/keys/DialogFragmentKey;Ljava/lang/String;)V", "getOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "getDialogFragmentKey", "()Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowDialogFragment implements OrderSubmitResult {
        private final DialogFragmentKey dialogFragmentKey;
        private final EquityOrderIntent orderIntent;
        private final String tag;

        public static /* synthetic */ ShowDialogFragment copy$default(ShowDialogFragment showDialogFragment, EquityOrderIntent equityOrderIntent, DialogFragmentKey dialogFragmentKey, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                equityOrderIntent = showDialogFragment.orderIntent;
            }
            if ((i & 2) != 0) {
                dialogFragmentKey = showDialogFragment.dialogFragmentKey;
            }
            if ((i & 4) != 0) {
                str = showDialogFragment.tag;
            }
            return showDialogFragment.copy(equityOrderIntent, dialogFragmentKey, str);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }

        /* renamed from: component2, reason: from getter */
        public final DialogFragmentKey getDialogFragmentKey() {
            return this.dialogFragmentKey;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public final ShowDialogFragment copy(EquityOrderIntent orderIntent, DialogFragmentKey dialogFragmentKey, String tag) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            Intrinsics.checkNotNullParameter(dialogFragmentKey, "dialogFragmentKey");
            return new ShowDialogFragment(orderIntent, dialogFragmentKey, tag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowDialogFragment)) {
                return false;
            }
            ShowDialogFragment showDialogFragment = (ShowDialogFragment) other;
            return Intrinsics.areEqual(this.orderIntent, showDialogFragment.orderIntent) && Intrinsics.areEqual(this.dialogFragmentKey, showDialogFragment.dialogFragmentKey) && Intrinsics.areEqual(this.tag, showDialogFragment.tag);
        }

        public int hashCode() {
            int iHashCode = ((this.orderIntent.hashCode() * 31) + this.dialogFragmentKey.hashCode()) * 31;
            String str = this.tag;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ShowDialogFragment(orderIntent=" + this.orderIntent + ", dialogFragmentKey=" + this.dialogFragmentKey + ", tag=" + this.tag + ")";
        }

        public ShowDialogFragment(EquityOrderIntent orderIntent, DialogFragmentKey dialogFragmentKey, String str) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            Intrinsics.checkNotNullParameter(dialogFragmentKey, "dialogFragmentKey");
            this.orderIntent = orderIntent;
            this.dialogFragmentKey = dialogFragmentKey;
            this.tag = str;
        }

        public /* synthetic */ ShowDialogFragment(EquityOrderIntent equityOrderIntent, DialogFragmentKey dialogFragmentKey, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(equityOrderIntent, dialogFragmentKey, (i & 4) != 0 ? null : str);
        }

        @Override // com.robinhood.android.equities.equitytrade.OrderSubmitResult
        public EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }

        public final DialogFragmentKey getDialogFragmentKey() {
            return this.dialogFragmentKey;
        }

        public final String getTag() {
            return this.tag;
        }
    }

    /* compiled from: OrderSubmitResult.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$Error;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;", "errorMessage", "Lcom/robinhood/utils/resource/StringResource;", "orderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;)V", "getErrorMessage", "()Lcom/robinhood/utils/resource/StringResource;", "getOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements OrderSubmitResult {
        private final StringResource errorMessage;
        private final EquityOrderIntent orderIntent;

        public static /* synthetic */ Error copy$default(Error error, StringResource stringResource, EquityOrderIntent equityOrderIntent, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = error.errorMessage;
            }
            if ((i & 2) != 0) {
                equityOrderIntent = error.orderIntent;
            }
            return error.copy(stringResource, equityOrderIntent);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component2, reason: from getter */
        public final EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }

        public final Error copy(StringResource errorMessage, EquityOrderIntent orderIntent) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            return new Error(errorMessage, orderIntent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.errorMessage, error.errorMessage) && Intrinsics.areEqual(this.orderIntent, error.orderIntent);
        }

        public int hashCode() {
            StringResource stringResource = this.errorMessage;
            return ((stringResource == null ? 0 : stringResource.hashCode()) * 31) + this.orderIntent.hashCode();
        }

        public String toString() {
            return "Error(errorMessage=" + this.errorMessage + ", orderIntent=" + this.orderIntent + ")";
        }

        public Error(StringResource stringResource, EquityOrderIntent orderIntent) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            this.errorMessage = stringResource;
            this.orderIntent = orderIntent;
        }

        public final StringResource getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.robinhood.android.equities.equitytrade.OrderSubmitResult
        public EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }
    }

    /* compiled from: OrderSubmitResult.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$DeepLink;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;", "uri", "Landroid/net/Uri;", "orderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "<init>", "(Landroid/net/Uri;Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;)V", "getUri", "()Landroid/net/Uri;", "getOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DeepLink implements OrderSubmitResult {
        private final EquityOrderIntent orderIntent;
        private final Uri uri;

        public static /* synthetic */ DeepLink copy$default(DeepLink deepLink, Uri uri, EquityOrderIntent equityOrderIntent, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = deepLink.uri;
            }
            if ((i & 2) != 0) {
                equityOrderIntent = deepLink.orderIntent;
            }
            return deepLink.copy(uri, equityOrderIntent);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        /* renamed from: component2, reason: from getter */
        public final EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }

        public final DeepLink copy(Uri uri, EquityOrderIntent orderIntent) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            return new DeepLink(uri, orderIntent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeepLink)) {
                return false;
            }
            DeepLink deepLink = (DeepLink) other;
            return Intrinsics.areEqual(this.uri, deepLink.uri) && Intrinsics.areEqual(this.orderIntent, deepLink.orderIntent);
        }

        public int hashCode() {
            return (this.uri.hashCode() * 31) + this.orderIntent.hashCode();
        }

        public String toString() {
            return "DeepLink(uri=" + this.uri + ", orderIntent=" + this.orderIntent + ")";
        }

        public DeepLink(Uri uri, EquityOrderIntent orderIntent) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            this.uri = uri;
            this.orderIntent = orderIntent;
        }

        public final Uri getUri() {
            return this.uri;
        }

        @Override // com.robinhood.android.equities.equitytrade.OrderSubmitResult
        public EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }
    }

    /* compiled from: OrderSubmitResult.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$EditLimitOrderAction;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;", "orderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "<init>", "(Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;)V", "getOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EditLimitOrderAction implements OrderSubmitResult {
        private final EquityOrderIntent orderIntent;

        public static /* synthetic */ EditLimitOrderAction copy$default(EditLimitOrderAction editLimitOrderAction, EquityOrderIntent equityOrderIntent, int i, Object obj) {
            if ((i & 1) != 0) {
                equityOrderIntent = editLimitOrderAction.orderIntent;
            }
            return editLimitOrderAction.copy(equityOrderIntent);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }

        public final EditLimitOrderAction copy(EquityOrderIntent orderIntent) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            return new EditLimitOrderAction(orderIntent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EditLimitOrderAction) && Intrinsics.areEqual(this.orderIntent, ((EditLimitOrderAction) other).orderIntent);
        }

        public int hashCode() {
            return this.orderIntent.hashCode();
        }

        public String toString() {
            return "EditLimitOrderAction(orderIntent=" + this.orderIntent + ")";
        }

        public EditLimitOrderAction(EquityOrderIntent orderIntent) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            this.orderIntent = orderIntent;
        }

        @Override // com.robinhood.android.equities.equitytrade.OrderSubmitResult
        public EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }
    }

    /* compiled from: OrderSubmitResult.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$EditStopOrderAction;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;", "orderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "<init>", "(Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;)V", "getOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EditStopOrderAction implements OrderSubmitResult {
        private final EquityOrderIntent orderIntent;

        public static /* synthetic */ EditStopOrderAction copy$default(EditStopOrderAction editStopOrderAction, EquityOrderIntent equityOrderIntent, int i, Object obj) {
            if ((i & 1) != 0) {
                equityOrderIntent = editStopOrderAction.orderIntent;
            }
            return editStopOrderAction.copy(equityOrderIntent);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }

        public final EditStopOrderAction copy(EquityOrderIntent orderIntent) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            return new EditStopOrderAction(orderIntent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EditStopOrderAction) && Intrinsics.areEqual(this.orderIntent, ((EditStopOrderAction) other).orderIntent);
        }

        public int hashCode() {
            return this.orderIntent.hashCode();
        }

        public String toString() {
            return "EditStopOrderAction(orderIntent=" + this.orderIntent + ")";
        }

        public EditStopOrderAction(EquityOrderIntent orderIntent) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            this.orderIntent = orderIntent;
        }

        @Override // com.robinhood.android.equities.equitytrade.OrderSubmitResult
        public EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }
    }

    /* compiled from: OrderSubmitResult.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult$NoAction;", "Lcom/robinhood/android/equities/equitytrade/OrderSubmitResult;", "orderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "<init>", "(Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;)V", "getOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-equity-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NoAction implements OrderSubmitResult {
        private final EquityOrderIntent orderIntent;

        public static /* synthetic */ NoAction copy$default(NoAction noAction, EquityOrderIntent equityOrderIntent, int i, Object obj) {
            if ((i & 1) != 0) {
                equityOrderIntent = noAction.orderIntent;
            }
            return noAction.copy(equityOrderIntent);
        }

        /* renamed from: component1, reason: from getter */
        public final EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }

        public final NoAction copy(EquityOrderIntent orderIntent) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            return new NoAction(orderIntent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NoAction) && Intrinsics.areEqual(this.orderIntent, ((NoAction) other).orderIntent);
        }

        public int hashCode() {
            return this.orderIntent.hashCode();
        }

        public String toString() {
            return "NoAction(orderIntent=" + this.orderIntent + ")";
        }

        public NoAction(EquityOrderIntent orderIntent) {
            Intrinsics.checkNotNullParameter(orderIntent, "orderIntent");
            this.orderIntent = orderIntent;
        }

        @Override // com.robinhood.android.equities.equitytrade.OrderSubmitResult
        public EquityOrderIntent getOrderIntent() {
            return this.orderIntent;
        }
    }
}
