package com.robinhood.android.margin.p174ui.limit;

import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginLimitStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation;", "", "<init>", "()V", "Valid", "ZeroMarginLimit", "BelowCurrentMarginUse", "AboveGoldBuyingPower", "ViewAccountDeficit", "Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation$AboveGoldBuyingPower;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation$BelowCurrentMarginUse;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation$Valid;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation$ViewAccountDeficit;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation$ZeroMarginLimit;", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitValidation, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class MarginLimitStateProvider3 {
    public static final int $stable = 0;

    public /* synthetic */ MarginLimitStateProvider3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: MarginLimitStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation$Valid;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation;", "newMarginLimit", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/models/util/Money;)V", "getNewMarginLimit", "()Lcom/robinhood/models/util/Money;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitValidation$Valid, reason: from toString */
    public static final /* data */ class Valid extends MarginLimitStateProvider3 {
        public static final int $stable = 8;
        private final Money newMarginLimit;

        public static /* synthetic */ Valid copy$default(Valid valid, Money money, int i, Object obj) {
            if ((i & 1) != 0) {
                money = valid.newMarginLimit;
            }
            return valid.copy(money);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getNewMarginLimit() {
            return this.newMarginLimit;
        }

        public final Valid copy(Money newMarginLimit) {
            Intrinsics.checkNotNullParameter(newMarginLimit, "newMarginLimit");
            return new Valid(newMarginLimit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Valid) && Intrinsics.areEqual(this.newMarginLimit, ((Valid) other).newMarginLimit);
        }

        public int hashCode() {
            return this.newMarginLimit.hashCode();
        }

        public String toString() {
            return "Valid(newMarginLimit=" + this.newMarginLimit + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Valid(Money newMarginLimit) {
            super(null);
            Intrinsics.checkNotNullParameter(newMarginLimit, "newMarginLimit");
            this.newMarginLimit = newMarginLimit;
        }

        public final Money getNewMarginLimit() {
            return this.newMarginLimit;
        }
    }

    private MarginLimitStateProvider3() {
    }

    /* compiled from: MarginLimitStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation$ZeroMarginLimit;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitValidation$ZeroMarginLimit */
    public static final /* data */ class ZeroMarginLimit extends MarginLimitStateProvider3 {
        public static final int $stable = 0;
        public static final ZeroMarginLimit INSTANCE = new ZeroMarginLimit();

        public boolean equals(Object other) {
            return this == other || (other instanceof ZeroMarginLimit);
        }

        public int hashCode() {
            return 1514701788;
        }

        public String toString() {
            return "ZeroMarginLimit";
        }

        private ZeroMarginLimit() {
            super(null);
        }
    }

    /* compiled from: MarginLimitStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation$BelowCurrentMarginUse;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation;", "currentGoldUsed", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/models/util/Money;)V", "getCurrentGoldUsed", "()Lcom/robinhood/models/util/Money;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitValidation$BelowCurrentMarginUse, reason: from toString */
    public static final /* data */ class BelowCurrentMarginUse extends MarginLimitStateProvider3 {
        public static final int $stable = 8;
        private final Money currentGoldUsed;

        public static /* synthetic */ BelowCurrentMarginUse copy$default(BelowCurrentMarginUse belowCurrentMarginUse, Money money, int i, Object obj) {
            if ((i & 1) != 0) {
                money = belowCurrentMarginUse.currentGoldUsed;
            }
            return belowCurrentMarginUse.copy(money);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getCurrentGoldUsed() {
            return this.currentGoldUsed;
        }

        public final BelowCurrentMarginUse copy(Money currentGoldUsed) {
            Intrinsics.checkNotNullParameter(currentGoldUsed, "currentGoldUsed");
            return new BelowCurrentMarginUse(currentGoldUsed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BelowCurrentMarginUse) && Intrinsics.areEqual(this.currentGoldUsed, ((BelowCurrentMarginUse) other).currentGoldUsed);
        }

        public int hashCode() {
            return this.currentGoldUsed.hashCode();
        }

        public String toString() {
            return "BelowCurrentMarginUse(currentGoldUsed=" + this.currentGoldUsed + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BelowCurrentMarginUse(Money currentGoldUsed) {
            super(null);
            Intrinsics.checkNotNullParameter(currentGoldUsed, "currentGoldUsed");
            this.currentGoldUsed = currentGoldUsed;
        }

        public final Money getCurrentGoldUsed() {
            return this.currentGoldUsed;
        }
    }

    /* compiled from: MarginLimitStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation$AboveGoldBuyingPower;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitValidation$AboveGoldBuyingPower */
    public static final /* data */ class AboveGoldBuyingPower extends MarginLimitStateProvider3 {
        public static final int $stable = 0;
        public static final AboveGoldBuyingPower INSTANCE = new AboveGoldBuyingPower();

        public boolean equals(Object other) {
            return this == other || (other instanceof AboveGoldBuyingPower);
        }

        public int hashCode() {
            return -1172190635;
        }

        public String toString() {
            return "AboveGoldBuyingPower";
        }

        private AboveGoldBuyingPower() {
            super(null);
        }
    }

    /* compiled from: MarginLimitStateProvider.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation$ViewAccountDeficit;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitValidation$ViewAccountDeficit */
    public static final /* data */ class ViewAccountDeficit extends MarginLimitStateProvider3 {
        public static final int $stable = 0;
        public static final ViewAccountDeficit INSTANCE = new ViewAccountDeficit();

        public boolean equals(Object other) {
            return this == other || (other instanceof ViewAccountDeficit);
        }

        public int hashCode() {
            return 1566461963;
        }

        public String toString() {
            return "ViewAccountDeficit";
        }

        private ViewAccountDeficit() {
            super(null);
        }
    }
}
