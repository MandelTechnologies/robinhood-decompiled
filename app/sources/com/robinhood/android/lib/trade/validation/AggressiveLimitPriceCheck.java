package com.robinhood.android.lib.trade.validation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.validation.BaseOrderPriceContext3;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AggressiveLimitPriceCheck.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fj\u0004\u0018\u0001`\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/AggressiveLimitPriceCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/android/lib/trade/validation/BaseOrderPriceContext;", "Lcom/robinhood/android/lib/trade/validation/BaseOrderPriceFailureResolver;", "Lcom/robinhood/android/lib/trade/validation/BasicOrderPriceValidationCheck;", "<init>", "()V", "CHECK_ID_AGGRESSIVE_LIMIT_PRICE", "", "AGGRESSIVE_LIMIT_PRICE_THRESHOLD", "Ljava/math/BigDecimal;", "check", "Lcom/robinhood/android/lib/trade/validation/BaseOrderPriceValidationFailure;", "Lcom/robinhood/android/lib/trade/validation/BasicOrderPriceValidationFailure;", "input", "Failure", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class AggressiveLimitPriceCheck implements Validator.Check<BaseOrderPriceContext, BaseOrderPriceContext2> {
    private static final String CHECK_ID_AGGRESSIVE_LIMIT_PRICE = "order_price_aggressive_limit_price";
    public static final AggressiveLimitPriceCheck INSTANCE = new AggressiveLimitPriceCheck();
    private static final BigDecimal AGGRESSIVE_LIMIT_PRICE_THRESHOLD = new BigDecimal("0.3");
    public static final int $stable = 8;

    private AggressiveLimitPriceCheck() {
    }

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public BaseOrderPriceContext3<BaseOrderPriceContext, BaseOrderPriceContext2> check(BaseOrderPriceContext input) {
        BigDecimal lastTradePrice;
        BigDecimal bigDecimalSafeDivide;
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.getConfiguration() != Order.Configuration.LIMIT || (lastTradePrice = input.getLastTradePrice()) == null) {
            return null;
        }
        EquityOrderSide side = input.getSide();
        BigDecimal price = input.getPrice();
        BigDecimal bigDecimalMultiply = AGGRESSIVE_LIMIT_PRICE_THRESHOLD.multiply(lastTradePrice.max(BigDecimal.ONE));
        BigDecimal bigDecimalSubtract = price.subtract(lastTradePrice);
        BigDecimal bigDecimalSubtract2 = lastTradePrice.subtract(price);
        if (side == EquityOrderSide.BUY && BigDecimals7.m2978gt(bigDecimalSubtract, bigDecimalMultiply)) {
            bigDecimalSafeDivide = BigDecimals7.safeDivide(bigDecimalSubtract, lastTradePrice);
        } else {
            bigDecimalSafeDivide = (side == EquityOrderSide.SELL && BigDecimals7.m2978gt(bigDecimalSubtract2, bigDecimalMultiply)) ? BigDecimals7.safeDivide(bigDecimalSubtract2, lastTradePrice) : null;
        }
        if (bigDecimalSafeDivide != null) {
            return new Failure(bigDecimalSafeDivide);
        }
        return null;
    }

    /* compiled from: AggressiveLimitPriceCheck.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0006HÂ\u0003J\u0013\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\nHÖ\u0001J\u0016\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/AggressiveLimitPriceCheck$Failure;", "Lcom/robinhood/android/lib/trade/validation/BaseOrderPriceValidationFailure;", "Lcom/robinhood/android/lib/trade/validation/BaseOrderPriceContext;", "Lcom/robinhood/android/lib/trade/validation/BaseOrderPriceFailureResolver;", "Lcom/robinhood/android/lib/trade/validation/BasicOrderPriceValidationFailure;", "aggressivePercent", "Ljava/math/BigDecimal;", "<init>", "(Ljava/math/BigDecimal;)V", "checkIdentifier", "", "getCheckIdentifier$annotations", "()V", "getCheckIdentifier", "()Ljava/lang/String;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "onNegativeResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action$Skip;", "resolver", "passthroughArgs", "Landroid/os/Bundle;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failure implements BaseOrderPriceContext3<BaseOrderPriceContext, BaseOrderPriceContext2> {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Failure> CREATOR = new Creator();
        private final BigDecimal aggressivePercent;
        private final String checkIdentifier;

        /* compiled from: AggressiveLimitPriceCheck.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Failure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failure((BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i) {
                return new Failure[i];
            }
        }

        /* compiled from: AggressiveLimitPriceCheck.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EquityOrderSide.values().length];
                try {
                    iArr[EquityOrderSide.BUY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EquityOrderSide.SELL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: component1, reason: from getter */
        private final BigDecimal getAggressivePercent() {
            return this.aggressivePercent;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = failure.aggressivePercent;
            }
            return failure.copy(bigDecimal);
        }

        public static /* synthetic */ void getCheckIdentifier$annotations() {
        }

        public final Failure copy(BigDecimal aggressivePercent) {
            Intrinsics.checkNotNullParameter(aggressivePercent, "aggressivePercent");
            return new Failure(aggressivePercent);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.aggressivePercent, ((Failure) other).aggressivePercent);
        }

        public int hashCode() {
            return this.aggressivePercent.hashCode();
        }

        public String toString() {
            return "Failure(aggressivePercent=" + this.aggressivePercent + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.aggressivePercent);
        }

        @Override // com.robinhood.android.lib.trade.validation.BaseOrderPriceContext3
        public Bundle getPassthroughArgs() {
            return BaseOrderPriceContext3.DefaultImpls.getPassthroughArgs(this);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<BaseOrderPriceContext> onPositiveResponse(BaseOrderPriceContext2 baseOrderPriceContext2, Bundle bundle) {
            return BaseOrderPriceContext3.DefaultImpls.onPositiveResponse(this, baseOrderPriceContext2, bundle);
        }

        public Failure(BigDecimal aggressivePercent) {
            Intrinsics.checkNotNullParameter(aggressivePercent, "aggressivePercent");
            this.aggressivePercent = aggressivePercent;
            this.checkIdentifier = AggressiveLimitPriceCheck.CHECK_ID_AGGRESSIVE_LIMIT_PRICE;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return this.checkIdentifier;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public void showAlert(BaseActivity activity, BaseOrderPriceContext input) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(input, "input");
            RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(activity).setPositiveButton(C20649R.string.order_create_aggressive_limit_edit_action, new Object[0]).setNegativeButton(C11048R.string.general_label_continue, new Object[0]);
            int i = WhenMappings.$EnumSwitchMapping$0[input.getSide().ordinal()];
            if (i == 1) {
                negativeButton.setTitle(C20649R.string.order_create_aggressive_limit_buy_dialog_title, new Object[0]).setMessage(C20649R.string.order_create_aggressive_limit_buy_dialog_body, Formats.getPercentFormat().format(this.aggressivePercent));
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                negativeButton.setTitle(C20649R.string.order_create_aggressive_limit_sell_dialog_title, new Object[0]).setMessage(C20649R.string.order_create_aggressive_limit_sell_dialog_body, Formats.getPercentFormat().format(this.aggressivePercent));
            }
            RhDialogFragment.Builder passthroughArgs = negativeButton.setPassthroughArgs(getPassthroughArgs());
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(passthroughArgs, supportFragmentManager, "aggressive-limit-price", false, 4, null);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action.Skip onNegativeResponse(BaseOrderPriceContext2 resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            return Validator.Action.Skip.INSTANCE;
        }
    }
}
