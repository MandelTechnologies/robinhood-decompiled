package com.robinhood.android.transfers.p271ui.max.i18n.details;

import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdjustmentWithFxState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/details/AdjustmentWithFxState;", "", "adjustment", "Lcom/robinhood/models/util/Money$Adjustment;", "<init>", "(Lcom/robinhood/models/util/Money$Adjustment;)V", "getAdjustment", "()Lcom/robinhood/models/util/Money$Adjustment;", "format", "", "Pending", "Finalized", "Lcom/robinhood/android/transfers/ui/max/i18n/details/AdjustmentWithFxState$Finalized;", "Lcom/robinhood/android/transfers/ui/max/i18n/details/AdjustmentWithFxState$Pending;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class AdjustmentWithFxState {
    public static final int $stable = 8;
    private final Money.Adjustment adjustment;

    public /* synthetic */ AdjustmentWithFxState(Money.Adjustment adjustment, DefaultConstructorMarker defaultConstructorMarker) {
        this(adjustment);
    }

    private AdjustmentWithFxState(Money.Adjustment adjustment) {
        this.adjustment = adjustment;
    }

    public final Money.Adjustment getAdjustment() {
        return this.adjustment;
    }

    /* compiled from: AdjustmentWithFxState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/details/AdjustmentWithFxState$Pending;", "Lcom/robinhood/android/transfers/ui/max/i18n/details/AdjustmentWithFxState;", "adjustment", "Lcom/robinhood/models/util/Money$Adjustment;", "<init>", "(Lcom/robinhood/models/util/Money$Adjustment;)V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Pending extends AdjustmentWithFxState {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pending(Money.Adjustment adjustment) {
            super(adjustment, null);
            Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        }
    }

    /* compiled from: AdjustmentWithFxState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/details/AdjustmentWithFxState$Finalized;", "Lcom/robinhood/android/transfers/ui/max/i18n/details/AdjustmentWithFxState;", "adjustment", "Lcom/robinhood/models/util/Money$Adjustment;", "<init>", "(Lcom/robinhood/models/util/Money$Adjustment;)V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Finalized extends AdjustmentWithFxState {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Finalized(Money.Adjustment adjustment) {
            super(adjustment, null);
            Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        }
    }

    public final String format() {
        String str;
        if (this instanceof Pending) {
            str = "≈";
        } else {
            if (!(this instanceof Finalized)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "";
        }
        return str + Money.Adjustment.format$default(this.adjustment, false, null, 3, null);
    }
}
