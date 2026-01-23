package com.robinhood.android.equities.orderactions;

import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Order;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityPendingOrderActionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/orderactions/FinishAction;", "", "Basic", "Replace", "Lcom/robinhood/android/equities/orderactions/FinishAction$Basic;", "Lcom/robinhood/android/equities/orderactions/FinishAction$Replace;", "feature-equity-order-actions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.orderactions.FinishAction, reason: use source file name */
/* loaded from: classes3.dex */
public interface EquityPendingOrderActionViewState2 {

    /* compiled from: EquityPendingOrderActionViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equities/orderactions/FinishAction$Basic;", "Lcom/robinhood/android/equities/orderactions/FinishAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-order-actions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.orderactions.FinishAction$Basic */
    public static final /* data */ class Basic implements EquityPendingOrderActionViewState2 {
        public static final int $stable = 0;
        public static final Basic INSTANCE = new Basic();

        public boolean equals(Object other) {
            return this == other || (other instanceof Basic);
        }

        public int hashCode() {
            return -1665405551;
        }

        public String toString() {
            return "Basic";
        }

        private Basic() {
        }
    }

    /* compiled from: EquityPendingOrderActionViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equities/orderactions/FinishAction$Replace;", "Lcom/robinhood/android/equities/orderactions/FinishAction;", Card.Icon.ORDER, "Lcom/robinhood/models/db/Order;", "<init>", "(Lcom/robinhood/models/db/Order;)V", "getOrder", "()Lcom/robinhood/models/db/Order;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-order-actions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equities.orderactions.FinishAction$Replace, reason: from toString */
    public static final /* data */ class Replace implements EquityPendingOrderActionViewState2 {
        public static final int $stable = 8;
        private final Order order;

        public static /* synthetic */ Replace copy$default(Replace replace, Order order, int i, Object obj) {
            if ((i & 1) != 0) {
                order = replace.order;
            }
            return replace.copy(order);
        }

        /* renamed from: component1, reason: from getter */
        public final Order getOrder() {
            return this.order;
        }

        public final Replace copy(Order order) {
            Intrinsics.checkNotNullParameter(order, "order");
            return new Replace(order);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Replace) && Intrinsics.areEqual(this.order, ((Replace) other).order);
        }

        public int hashCode() {
            return this.order.hashCode();
        }

        public String toString() {
            return "Replace(order=" + this.order + ")";
        }

        public Replace(Order order) {
            Intrinsics.checkNotNullParameter(order, "order");
            this.order = order;
        }

        public final Order getOrder() {
            return this.order;
        }
    }
}
