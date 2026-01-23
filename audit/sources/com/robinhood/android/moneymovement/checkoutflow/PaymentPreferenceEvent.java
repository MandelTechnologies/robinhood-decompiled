package com.robinhood.android.moneymovement.checkoutflow;

import kotlin.Metadata;

/* compiled from: PaymentPreferenceEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceEvent;", "", "Succeed", "CloseScreen", "Error", "NavigateToAddAccount", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceEvent$CloseScreen;", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceEvent$Error;", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceEvent$NavigateToAddAccount;", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceEvent$Succeed;", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface PaymentPreferenceEvent {

    /* compiled from: PaymentPreferenceEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceEvent$Succeed;", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceEvent;", "<init>", "()V", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Succeed implements PaymentPreferenceEvent {
        public static final int $stable = 0;
        public static final Succeed INSTANCE = new Succeed();

        private Succeed() {
        }
    }

    /* compiled from: PaymentPreferenceEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceEvent$CloseScreen;", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceEvent;", "<init>", "()V", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CloseScreen implements PaymentPreferenceEvent {
        public static final int $stable = 0;
        public static final CloseScreen INSTANCE = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: PaymentPreferenceEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceEvent$Error;", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceEvent;", "<init>", "()V", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error implements PaymentPreferenceEvent {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
        }
    }

    /* compiled from: PaymentPreferenceEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceEvent$NavigateToAddAccount;", "Lcom/robinhood/android/moneymovement/checkoutflow/PaymentPreferenceEvent;", "<init>", "()V", "lib-money-movements-checkout-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NavigateToAddAccount implements PaymentPreferenceEvent {
        public static final int $stable = 0;
        public static final NavigateToAddAccount INSTANCE = new NavigateToAddAccount();

        private NavigateToAddAccount() {
        }
    }
}
