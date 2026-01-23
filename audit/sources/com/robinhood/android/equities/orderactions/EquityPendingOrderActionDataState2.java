package com.robinhood.android.equities.orderactions;

import kotlin.Metadata;

/* compiled from: EquityPendingOrderActionDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/orderactions/Dialog;", "", "CancelFailed", "GenericError", "Lcom/robinhood/android/equities/orderactions/Dialog$CancelFailed;", "Lcom/robinhood/android/equities/orderactions/Dialog$GenericError;", "feature-equity-order-actions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.orderactions.Dialog, reason: use source file name */
/* loaded from: classes3.dex */
public interface EquityPendingOrderActionDataState2 {

    /* compiled from: EquityPendingOrderActionDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equities/orderactions/Dialog$CancelFailed;", "Lcom/robinhood/android/equities/orderactions/Dialog;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-order-actions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.orderactions.Dialog$CancelFailed */
    public static final /* data */ class CancelFailed implements EquityPendingOrderActionDataState2 {
        public static final int $stable = 0;
        public static final CancelFailed INSTANCE = new CancelFailed();

        public boolean equals(Object other) {
            return this == other || (other instanceof CancelFailed);
        }

        public int hashCode() {
            return -315613099;
        }

        public String toString() {
            return "CancelFailed";
        }

        private CancelFailed() {
        }
    }

    /* compiled from: EquityPendingOrderActionDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equities/orderactions/Dialog$GenericError;", "Lcom/robinhood/android/equities/orderactions/Dialog;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-order-actions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.orderactions.Dialog$GenericError */
    public static final /* data */ class GenericError implements EquityPendingOrderActionDataState2 {
        public static final int $stable = 0;
        public static final GenericError INSTANCE = new GenericError();

        public boolean equals(Object other) {
            return this == other || (other instanceof GenericError);
        }

        public int hashCode() {
            return 1606753135;
        }

        public String toString() {
            return "GenericError";
        }

        private GenericError() {
        }
    }
}
