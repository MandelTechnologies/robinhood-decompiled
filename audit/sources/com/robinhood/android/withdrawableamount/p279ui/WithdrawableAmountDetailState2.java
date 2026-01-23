package com.robinhood.android.withdrawableamount.p279ui;

import com.robinhood.models.api.bonfire.withdrawablecash.ApiWithdrawableAmountBreakdown;
import com.robinhood.models.api.bonfire.withdrawablecash.ApiWithdrawableAmountBreakdownItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WithdrawableAmountDetailState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountRequest;", "", "<init>", "()V", "Loading", "Success", "Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountRequest$Loading;", "Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountRequest$Success;", "feature-withdrawable-amount_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.withdrawableamount.ui.WithdrawableAmountRequest, reason: use source file name */
/* loaded from: classes16.dex */
public abstract class WithdrawableAmountDetailState2 {
    public /* synthetic */ WithdrawableAmountDetailState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: WithdrawableAmountDetailState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountRequest$Loading;", "Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountRequest;", "<init>", "()V", "feature-withdrawable-amount_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.withdrawableamount.ui.WithdrawableAmountRequest$Loading */
    public static final class Loading extends WithdrawableAmountDetailState2 {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private WithdrawableAmountDetailState2() {
    }

    /* compiled from: WithdrawableAmountDetailState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountRequest$Success;", "Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountRequest;", "breakdown", "Lcom/robinhood/models/api/bonfire/withdrawablecash/ApiWithdrawableAmountBreakdown;", "<init>", "(Lcom/robinhood/models/api/bonfire/withdrawablecash/ApiWithdrawableAmountBreakdown;)V", "getBreakdown", "()Lcom/robinhood/models/api/bonfire/withdrawablecash/ApiWithdrawableAmountBreakdown;", "breakdownItems", "", "Lcom/robinhood/models/api/bonfire/withdrawablecash/ApiWithdrawableAmountBreakdownItem;", "getBreakdownItems", "()Ljava/util/List;", "withdrawableAmountItem", "getWithdrawableAmountItem", "()Lcom/robinhood/models/api/bonfire/withdrawablecash/ApiWithdrawableAmountBreakdownItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-withdrawable-amount_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.withdrawableamount.ui.WithdrawableAmountRequest$Success, reason: from toString */
    public static final /* data */ class Success extends WithdrawableAmountDetailState2 {
        private final ApiWithdrawableAmountBreakdown breakdown;
        private final List<ApiWithdrawableAmountBreakdownItem> breakdownItems;
        private final ApiWithdrawableAmountBreakdownItem withdrawableAmountItem;

        public static /* synthetic */ Success copy$default(Success success, ApiWithdrawableAmountBreakdown apiWithdrawableAmountBreakdown, int i, Object obj) {
            if ((i & 1) != 0) {
                apiWithdrawableAmountBreakdown = success.breakdown;
            }
            return success.copy(apiWithdrawableAmountBreakdown);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiWithdrawableAmountBreakdown getBreakdown() {
            return this.breakdown;
        }

        public final Success copy(ApiWithdrawableAmountBreakdown breakdown) {
            Intrinsics.checkNotNullParameter(breakdown, "breakdown");
            return new Success(breakdown);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.breakdown, ((Success) other).breakdown);
        }

        public int hashCode() {
            return this.breakdown.hashCode();
        }

        public String toString() {
            return "Success(breakdown=" + this.breakdown + ")";
        }

        public final ApiWithdrawableAmountBreakdown getBreakdown() {
            return this.breakdown;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(ApiWithdrawableAmountBreakdown breakdown) {
            super(null);
            Intrinsics.checkNotNullParameter(breakdown, "breakdown");
            this.breakdown = breakdown;
            this.breakdownItems = CollectionsKt.dropLast(breakdown.getBreakdownItems(), 1);
            this.withdrawableAmountItem = (ApiWithdrawableAmountBreakdownItem) CollectionsKt.last((List) breakdown.getBreakdownItems());
        }

        public final List<ApiWithdrawableAmountBreakdownItem> getBreakdownItems() {
            return this.breakdownItems;
        }

        public final ApiWithdrawableAmountBreakdownItem getWithdrawableAmountItem() {
            return this.withdrawableAmountItem;
        }
    }
}
