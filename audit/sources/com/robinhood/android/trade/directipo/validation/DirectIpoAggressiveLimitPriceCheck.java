package com.robinhood.android.trade.directipo.validation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.doc.p109ui.photo.DocUploadReviewPdfFragment;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.trade.directipo.C29323R;
import com.robinhood.android.trade.directipo.validation.DirectIpoOrderContext;
import com.robinhood.android.trade.directipo.validation.DirectIpoOrderValidationFailure;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoAggressiveLimitPriceCheck.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/validation/DirectIpoAggressiveLimitPriceCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderFailureResolver;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderValidationCheck;", "<init>", "()V", "check", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "input", "Failure", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class DirectIpoAggressiveLimitPriceCheck implements Validator.Check<DirectIpoOrderContext, DirectIpoOrderFailureResolver> {
    public static final int $stable = 0;
    public static final DirectIpoAggressiveLimitPriceCheck INSTANCE = new DirectIpoAggressiveLimitPriceCheck();

    private DirectIpoAggressiveLimitPriceCheck() {
    }

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public Validator.Failure<DirectIpoOrderContext, DirectIpoOrderFailureResolver> check(DirectIpoOrderContext input) {
        Intrinsics.checkNotNullParameter(input, "input");
        DirectIpoOrderContext.LimitPriceAggressiveness limitPriceAggressiveness = input.getLimitPriceAggressiveness();
        if (limitPriceAggressiveness instanceof DirectIpoOrderContext.LimitPriceAggressiveness.Aggressive) {
            DirectIpoOrderContext.LimitPriceAggressiveness.Aggressive aggressive = (DirectIpoOrderContext.LimitPriceAggressiveness.Aggressive) limitPriceAggressiveness;
            return new Failure(aggressive.getLowerPriceRange(), aggressive.getUpperPriceRange());
        }
        if (Intrinsics.areEqual(limitPriceAggressiveness, DirectIpoOrderContext.LimitPriceAggressiveness.NotAggressive.INSTANCE)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DirectIpoAggressiveLimitPriceCheck.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u000bHÖ\u0001J\u0016\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/validation/DirectIpoAggressiveLimitPriceCheck$Failure;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderValidationFailure;", "lowerPriceRange", "Lcom/robinhood/models/util/Money;", "upperPriceRange", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;)V", "getLowerPriceRange", "()Lcom/robinhood/models/util/Money;", "getUpperPriceRange", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failure implements DirectIpoOrderValidationFailure {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Failure> CREATOR = new Creator();
        private final Money lowerPriceRange;
        private final Money upperPriceRange;

        /* compiled from: DirectIpoAggressiveLimitPriceCheck.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Failure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failure((Money) parcel.readParcelable(Failure.class.getClassLoader()), (Money) parcel.readParcelable(Failure.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i) {
                return new Failure[i];
            }
        }

        public static /* synthetic */ Failure copy$default(Failure failure, Money money, Money money2, int i, Object obj) {
            if ((i & 1) != 0) {
                money = failure.lowerPriceRange;
            }
            if ((i & 2) != 0) {
                money2 = failure.upperPriceRange;
            }
            return failure.copy(money, money2);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getLowerPriceRange() {
            return this.lowerPriceRange;
        }

        /* renamed from: component2, reason: from getter */
        public final Money getUpperPriceRange() {
            return this.upperPriceRange;
        }

        public final Failure copy(Money lowerPriceRange, Money upperPriceRange) {
            Intrinsics.checkNotNullParameter(lowerPriceRange, "lowerPriceRange");
            Intrinsics.checkNotNullParameter(upperPriceRange, "upperPriceRange");
            return new Failure(lowerPriceRange, upperPriceRange);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return Intrinsics.areEqual(this.lowerPriceRange, failure.lowerPriceRange) && Intrinsics.areEqual(this.upperPriceRange, failure.upperPriceRange);
        }

        public int hashCode() {
            return (this.lowerPriceRange.hashCode() * 31) + this.upperPriceRange.hashCode();
        }

        public String toString() {
            return "Failure(lowerPriceRange=" + this.lowerPriceRange + ", upperPriceRange=" + this.upperPriceRange + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.lowerPriceRange, flags);
            dest.writeParcelable(this.upperPriceRange, flags);
        }

        @Override // com.robinhood.android.trade.directipo.validation.DirectIpoOrderValidationFailure
        public Bundle getPassthroughArgs() {
            return DirectIpoOrderValidationFailure.DefaultImpls.getPassthroughArgs(this);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<DirectIpoOrderContext> onNegativeResponse(DirectIpoOrderFailureResolver directIpoOrderFailureResolver, Bundle bundle) {
            return DirectIpoOrderValidationFailure.DefaultImpls.onNegativeResponse(this, directIpoOrderFailureResolver, bundle);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<DirectIpoOrderContext> onPositiveResponse(DirectIpoOrderFailureResolver directIpoOrderFailureResolver, Bundle bundle) {
            return DirectIpoOrderValidationFailure.DefaultImpls.onPositiveResponse(this, directIpoOrderFailureResolver, bundle);
        }

        public Failure(Money lowerPriceRange, Money upperPriceRange) {
            Intrinsics.checkNotNullParameter(lowerPriceRange, "lowerPriceRange");
            Intrinsics.checkNotNullParameter(upperPriceRange, "upperPriceRange");
            this.lowerPriceRange = lowerPriceRange;
            this.upperPriceRange = upperPriceRange;
        }

        public final Money getLowerPriceRange() {
            return this.lowerPriceRange;
        }

        public final Money getUpperPriceRange() {
            return this.upperPriceRange;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return "ipo_access_aggressive_limit_price";
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public void showAlert(BaseActivity activity, DirectIpoOrderContext input) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(input, "input");
            RhDialogFragment.Builder passthroughArgs = RhDialogFragment.INSTANCE.create(activity).setTitle(C29323R.string.direct_ipo_order_aggressive_limit_title, new Object[0]).setMessage(C29323R.string.direct_ipo_order_aggressive_limit_message, Money.format$default(this.lowerPriceRange, null, false, null, false, 0, null, false, null, false, false, 1023, null), Money.format$default(this.upperPriceRange, null, false, null, false, 0, null, false, null, false, false, 1023, null)).setId(C29323R.id.dialog_id_direct_ipo_aggressive_limit).setPositiveButton(C29323R.string.direct_ipo_order_aggressive_limit_edit_request, new Object[0]).setPassthroughArgs(getPassthroughArgs());
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(passthroughArgs, supportFragmentManager, DocUploadReviewPdfFragment.ERROR_DIALOG_TAG, false, 4, null);
        }
    }
}
