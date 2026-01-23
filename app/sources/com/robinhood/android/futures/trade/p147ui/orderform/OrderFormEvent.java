package com.robinhood.android.futures.trade.p147ui.orderform;

import com.robinhood.android.futures.trade.p147ui.orderform.FuturesOrderFormDataState;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.futures.ordercheck.contracts.FuturesOrderCheckResolver;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOrderFormDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent;", "", "GenericReviewOrderError", "OrderError", "ExitOrderForm", "ShowOrderCheckDialog", "ShowTransferFlow", "ShowOnboardingFlow", "OrderSubmittedSuccessfully", "OrderCheckResolveOnLadderEvent", "FocusOnText", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$ExitOrderForm;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$FocusOnText;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$GenericReviewOrderError;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$OrderCheckResolveOnLadderEvent;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$OrderError;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$OrderSubmittedSuccessfully;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$ShowOnboardingFlow;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$ShowOrderCheckDialog;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$ShowTransferFlow;", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface OrderFormEvent {

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$GenericReviewOrderError;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent;", "error", "", "<init>", "(I)V", "getError", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GenericReviewOrderError implements OrderFormEvent {
        public static final int $stable = 0;
        private final int error;

        public static /* synthetic */ GenericReviewOrderError copy$default(GenericReviewOrderError genericReviewOrderError, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = genericReviewOrderError.error;
            }
            return genericReviewOrderError.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getError() {
            return this.error;
        }

        public final GenericReviewOrderError copy(int error) {
            return new GenericReviewOrderError(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GenericReviewOrderError) && this.error == ((GenericReviewOrderError) other).error;
        }

        public int hashCode() {
            return Integer.hashCode(this.error);
        }

        public String toString() {
            return "GenericReviewOrderError(error=" + this.error + ")";
        }

        public GenericReviewOrderError(int i) {
            this.error = i;
        }

        public final int getError() {
            return this.error;
        }
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$OrderError;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderError implements OrderFormEvent {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ OrderError copy$default(OrderError orderError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = orderError.error;
            }
            return orderError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final OrderError copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new OrderError(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OrderError) && Intrinsics.areEqual(this.error, ((OrderError) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "OrderError(error=" + this.error + ")";
        }

        public OrderError(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$ExitOrderForm;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent;", "shouldFadeOut", "", "orderSubmittedSuccessfully", "<init>", "(ZZ)V", "getShouldFadeOut", "()Z", "getOrderSubmittedSuccessfully", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ExitOrderForm implements OrderFormEvent {
        public static final int $stable = 0;
        private final boolean orderSubmittedSuccessfully;
        private final boolean shouldFadeOut;

        /* JADX WARN: Illegal instructions before constructor call */
        public ExitOrderForm() {
            boolean z = false;
            this(z, z, 3, null);
        }

        public static /* synthetic */ ExitOrderForm copy$default(ExitOrderForm exitOrderForm, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = exitOrderForm.shouldFadeOut;
            }
            if ((i & 2) != 0) {
                z2 = exitOrderForm.orderSubmittedSuccessfully;
            }
            return exitOrderForm.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShouldFadeOut() {
            return this.shouldFadeOut;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getOrderSubmittedSuccessfully() {
            return this.orderSubmittedSuccessfully;
        }

        public final ExitOrderForm copy(boolean shouldFadeOut, boolean orderSubmittedSuccessfully) {
            return new ExitOrderForm(shouldFadeOut, orderSubmittedSuccessfully);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExitOrderForm)) {
                return false;
            }
            ExitOrderForm exitOrderForm = (ExitOrderForm) other;
            return this.shouldFadeOut == exitOrderForm.shouldFadeOut && this.orderSubmittedSuccessfully == exitOrderForm.orderSubmittedSuccessfully;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.shouldFadeOut) * 31) + Boolean.hashCode(this.orderSubmittedSuccessfully);
        }

        public String toString() {
            return "ExitOrderForm(shouldFadeOut=" + this.shouldFadeOut + ", orderSubmittedSuccessfully=" + this.orderSubmittedSuccessfully + ")";
        }

        public ExitOrderForm(boolean z, boolean z2) {
            this.shouldFadeOut = z;
            this.orderSubmittedSuccessfully = z2;
        }

        public /* synthetic */ ExitOrderForm(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public final boolean getShouldFadeOut() {
            return this.shouldFadeOut;
        }

        public final boolean getOrderSubmittedSuccessfully() {
            return this.orderSubmittedSuccessfully;
        }
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$ShowOrderCheckDialog;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent;", "key", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/DialogFragmentKey;)V", "getKey", "()Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowOrderCheckDialog implements OrderFormEvent {
        public static final int $stable = 8;
        private final DialogFragmentKey key;

        public static /* synthetic */ ShowOrderCheckDialog copy$default(ShowOrderCheckDialog showOrderCheckDialog, DialogFragmentKey dialogFragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                dialogFragmentKey = showOrderCheckDialog.key;
            }
            return showOrderCheckDialog.copy(dialogFragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final DialogFragmentKey getKey() {
            return this.key;
        }

        public final ShowOrderCheckDialog copy(DialogFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new ShowOrderCheckDialog(key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowOrderCheckDialog) && Intrinsics.areEqual(this.key, ((ShowOrderCheckDialog) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "ShowOrderCheckDialog(key=" + this.key + ")";
        }

        public ShowOrderCheckDialog(DialogFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final DialogFragmentKey getKey() {
            return this.key;
        }
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$ShowTransferFlow;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent;", "recommendedAmount", "Ljava/math/BigDecimal;", "accountNumber", "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;)V", "getRecommendedAmount", "()Ljava/math/BigDecimal;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowTransferFlow implements OrderFormEvent {
        public static final int $stable = 8;
        private final String accountNumber;
        private final BigDecimal recommendedAmount;

        public static /* synthetic */ ShowTransferFlow copy$default(ShowTransferFlow showTransferFlow, BigDecimal bigDecimal, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = showTransferFlow.recommendedAmount;
            }
            if ((i & 2) != 0) {
                str = showTransferFlow.accountNumber;
            }
            return showTransferFlow.copy(bigDecimal, str);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ShowTransferFlow copy(BigDecimal recommendedAmount, String accountNumber) {
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new ShowTransferFlow(recommendedAmount, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowTransferFlow)) {
                return false;
            }
            ShowTransferFlow showTransferFlow = (ShowTransferFlow) other;
            return Intrinsics.areEqual(this.recommendedAmount, showTransferFlow.recommendedAmount) && Intrinsics.areEqual(this.accountNumber, showTransferFlow.accountNumber);
        }

        public int hashCode() {
            return (this.recommendedAmount.hashCode() * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "ShowTransferFlow(recommendedAmount=" + this.recommendedAmount + ", accountNumber=" + this.accountNumber + ")";
        }

        public ShowTransferFlow(BigDecimal recommendedAmount, String accountNumber) {
            Intrinsics.checkNotNullParameter(recommendedAmount, "recommendedAmount");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.recommendedAmount = recommendedAmount;
            this.accountNumber = accountNumber;
        }

        public final BigDecimal getRecommendedAmount() {
            return this.recommendedAmount;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$ShowOnboardingFlow;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowOnboardingFlow implements OrderFormEvent {
        public static final int $stable = 0;
        public static final ShowOnboardingFlow INSTANCE = new ShowOnboardingFlow();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowOnboardingFlow);
        }

        public int hashCode() {
            return -1666465934;
        }

        public String toString() {
            return "ShowOnboardingFlow";
        }

        private ShowOnboardingFlow() {
        }
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$OrderSubmittedSuccessfully;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderSubmittedSuccessfully implements OrderFormEvent {
        public static final int $stable = 0;
        public static final OrderSubmittedSuccessfully INSTANCE = new OrderSubmittedSuccessfully();

        public boolean equals(Object other) {
            return this == other || (other instanceof OrderSubmittedSuccessfully);
        }

        public int hashCode() {
            return 2014781632;
        }

        public String toString() {
            return "OrderSubmittedSuccessfully";
        }

        private OrderSubmittedSuccessfully() {
        }
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\"\u0010\u0002\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0004\b\b\u0010\tJ*\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ4\u0010\u000e\u001a\u00020\u00002$\b\u0002\u0010\u0002\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R/\u0010\u0002\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$OrderCheckResolveOnLadderEvent;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent;", "block", "Lkotlin/Function2;", "Lcom/robinhood/futures/ordercheck/contracts/FuturesOrderCheckResolver;", "Lkotlin/coroutines/Continuation;", "", "", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "getBlock", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "component1", "copy", "(Lkotlin/jvm/functions/Function2;)Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$OrderCheckResolveOnLadderEvent;", "equals", "", "other", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderCheckResolveOnLadderEvent implements OrderFormEvent {
        public static final int $stable = 8;
        private final Function2<FuturesOrderCheckResolver, Continuation<? super Unit>, Object> block;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OrderCheckResolveOnLadderEvent copy$default(OrderCheckResolveOnLadderEvent orderCheckResolveOnLadderEvent, Function2 function2, int i, Object obj) {
            if ((i & 1) != 0) {
                function2 = orderCheckResolveOnLadderEvent.block;
            }
            return orderCheckResolveOnLadderEvent.copy(function2);
        }

        public final Function2<FuturesOrderCheckResolver, Continuation<? super Unit>, Object> component1() {
            return this.block;
        }

        public final OrderCheckResolveOnLadderEvent copy(Function2<? super FuturesOrderCheckResolver, ? super Continuation<? super Unit>, ? extends Object> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new OrderCheckResolveOnLadderEvent(block);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OrderCheckResolveOnLadderEvent) && Intrinsics.areEqual(this.block, ((OrderCheckResolveOnLadderEvent) other).block);
        }

        public int hashCode() {
            return this.block.hashCode();
        }

        public String toString() {
            return "OrderCheckResolveOnLadderEvent(block=" + this.block + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OrderCheckResolveOnLadderEvent(Function2<? super FuturesOrderCheckResolver, ? super Continuation<? super Unit>, ? extends Object> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            this.block = block;
        }

        public final Function2<FuturesOrderCheckResolver, Continuation<? super Unit>, Object> getBlock() {
            return this.block;
        }
    }

    /* compiled from: FuturesOrderFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent$FocusOnText;", "Lcom/robinhood/android/futures/trade/ui/orderform/OrderFormEvent;", "focusedText", "Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$FocusedText;", "<init>", "(Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$FocusedText;)V", "getFocusedText", "()Lcom/robinhood/android/futures/trade/ui/orderform/FuturesOrderFormDataState$FocusedText;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FocusOnText implements OrderFormEvent {
        public static final int $stable = 0;
        private final FuturesOrderFormDataState.FocusedText focusedText;

        public static /* synthetic */ FocusOnText copy$default(FocusOnText focusOnText, FuturesOrderFormDataState.FocusedText focusedText, int i, Object obj) {
            if ((i & 1) != 0) {
                focusedText = focusOnText.focusedText;
            }
            return focusOnText.copy(focusedText);
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesOrderFormDataState.FocusedText getFocusedText() {
            return this.focusedText;
        }

        public final FocusOnText copy(FuturesOrderFormDataState.FocusedText focusedText) {
            Intrinsics.checkNotNullParameter(focusedText, "focusedText");
            return new FocusOnText(focusedText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FocusOnText) && this.focusedText == ((FocusOnText) other).focusedText;
        }

        public int hashCode() {
            return this.focusedText.hashCode();
        }

        public String toString() {
            return "FocusOnText(focusedText=" + this.focusedText + ")";
        }

        public FocusOnText(FuturesOrderFormDataState.FocusedText focusedText) {
            Intrinsics.checkNotNullParameter(focusedText, "focusedText");
            this.focusedText = focusedText;
        }

        public final FuturesOrderFormDataState.FocusedText getFocusedText() {
            return this.focusedText;
        }
    }
}
