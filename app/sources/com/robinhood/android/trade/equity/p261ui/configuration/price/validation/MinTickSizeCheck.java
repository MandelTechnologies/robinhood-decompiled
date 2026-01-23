package com.robinhood.android.trade.equity.p261ui.configuration.price.validation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.util.HtmlCompat;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.validation.BaseOrderPriceContext3;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trade.equity.p261ui.configuration.price.validation.MinTickSizeCheck;
import com.robinhood.models.p320db.Instrument;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MinTickSizeCheck.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/MinTickSizeCheck;", "Lcom/robinhood/android/lib/trade/validation/Validator$Check;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceContext;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceFailureResolver;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceValidationCheck;", "<init>", "()V", "CHECK_ID_MIN_TICK_SIZE", "", "check", "Lcom/robinhood/android/lib/trade/validation/BaseOrderPriceValidationFailure;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceValidationFailure;", "input", "Failure", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class MinTickSizeCheck implements Validator.Check<OrderPriceContext, OrderPriceFailureResolver> {
    public static final int $stable = 0;
    private static final String CHECK_ID_MIN_TICK_SIZE = "order_price_min_tick_size";
    public static final MinTickSizeCheck INSTANCE = new MinTickSizeCheck();

    private MinTickSizeCheck() {
    }

    @Override // com.robinhood.android.lib.trade.validation.Validator.Check
    public BaseOrderPriceContext3<OrderPriceContext, OrderPriceFailureResolver> check(OrderPriceContext input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Instrument instrument = input.getInstrument();
        if (instrument == null) {
            return null;
        }
        BigDecimal price = input.getPrice();
        if (instrument.isRoundedToTickSize(price)) {
            return null;
        }
        BigDecimal bigDecimalRoundToTickSize = instrument.roundToTickSize(price, input.getSide());
        BigDecimal minTickSize = instrument.getMinTickSize();
        Intrinsics.checkNotNull(minTickSize);
        return new Failure(bigDecimalRoundToTickSize, minTickSize);
    }

    /* compiled from: MinTickSizeCheck.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0006HÂ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÂ\u0003J\u001d\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u000bHÖ\u0001J\u0016\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/MinTickSizeCheck$Failure;", "Lcom/robinhood/android/lib/trade/validation/BaseOrderPriceValidationFailure;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceContext;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceFailureResolver;", "Lcom/robinhood/android/trade/equity/ui/configuration/price/validation/OrderPriceValidationFailure;", "roundedPrice", "Ljava/math/BigDecimal;", "minTickSize", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "checkIdentifier", "", "getCheckIdentifier", "()Ljava/lang/String;", "showAlert", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "input", "onPositiveResponse", "Lcom/robinhood/android/lib/trade/validation/Validator$Action;", "resolver", "passthroughArgs", "Landroid/os/Bundle;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failure implements BaseOrderPriceContext3<OrderPriceContext, OrderPriceFailureResolver> {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Failure> CREATOR = new Creator();
        private final BigDecimal minTickSize;
        private final BigDecimal roundedPrice;

        /* compiled from: MinTickSizeCheck.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Failure> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failure((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i) {
                return new Failure[i];
            }
        }

        /* renamed from: component1, reason: from getter */
        private final BigDecimal getRoundedPrice() {
            return this.roundedPrice;
        }

        /* renamed from: component2, reason: from getter */
        private final BigDecimal getMinTickSize() {
            return this.minTickSize;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = failure.roundedPrice;
            }
            if ((i & 2) != 0) {
                bigDecimal2 = failure.minTickSize;
            }
            return failure.copy(bigDecimal, bigDecimal2);
        }

        public final Failure copy(BigDecimal roundedPrice, BigDecimal minTickSize) {
            Intrinsics.checkNotNullParameter(roundedPrice, "roundedPrice");
            Intrinsics.checkNotNullParameter(minTickSize, "minTickSize");
            return new Failure(roundedPrice, minTickSize);
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
            return Intrinsics.areEqual(this.roundedPrice, failure.roundedPrice) && Intrinsics.areEqual(this.minTickSize, failure.minTickSize);
        }

        public int hashCode() {
            return (this.roundedPrice.hashCode() * 31) + this.minTickSize.hashCode();
        }

        public String toString() {
            return "Failure(roundedPrice=" + this.roundedPrice + ", minTickSize=" + this.minTickSize + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.roundedPrice);
            dest.writeSerializable(this.minTickSize);
        }

        @Override // com.robinhood.android.lib.trade.validation.BaseOrderPriceContext3
        public Bundle getPassthroughArgs() {
            return BaseOrderPriceContext3.DefaultImpls.getPassthroughArgs(this);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<OrderPriceContext> onNegativeResponse(OrderPriceFailureResolver orderPriceFailureResolver, Bundle bundle) {
            return BaseOrderPriceContext3.DefaultImpls.onNegativeResponse(this, orderPriceFailureResolver, bundle);
        }

        public Failure(BigDecimal roundedPrice, BigDecimal minTickSize) {
            Intrinsics.checkNotNullParameter(roundedPrice, "roundedPrice");
            Intrinsics.checkNotNullParameter(minTickSize, "minTickSize");
            this.roundedPrice = roundedPrice;
            this.minTickSize = minTickSize;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public String getCheckIdentifier() {
            return MinTickSizeCheck.CHECK_ID_MIN_TICK_SIZE;
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public void showAlert(BaseActivity activity, OrderPriceContext input) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(input, "input");
            RhDialogFragment.Builder title = RhDialogFragment.INSTANCE.create(activity).setId(C20649R.id.dialog_id_order_tick_size).setTitle(C29365R.string.order_create_tick_size_dialog_title, new Object[0]);
            String string2 = activity.getString(C29365R.string.order_create_tick_size_dialog_message, Formats.getPriceFormat().format(this.minTickSize));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            RhDialogFragment.Builder passthroughArgs = title.setMessage(HtmlCompat.fromHtml$default(string2, 0, 2, null)).setPositiveButton(C20649R.string.order_create_tick_size_dialog_round_price, Formats.getPriceFormat().format(this.roundedPrice)).setNegativeButton(C11048R.string.general_label_dismiss, new Object[0]).setPassthroughArgs(getPassthroughArgs());
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RhDialogFragment.Builder.show$default(passthroughArgs, supportFragmentManager, "tickSizeDialog", false, 4, null);
        }

        @Override // com.robinhood.android.lib.trade.validation.Validator.Failure
        public Validator.Action<OrderPriceContext> onPositiveResponse(OrderPriceFailureResolver resolver, Bundle passthroughArgs) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            resolver.overridePrice(this.roundedPrice);
            return new Validator.Action.RetryWhen(new Function1() { // from class: com.robinhood.android.trade.equity.ui.configuration.price.validation.MinTickSizeCheck$Failure$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(MinTickSizeCheck.Failure.onPositiveResponse$lambda$0((OrderPriceContext) obj));
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onPositiveResponse$lambda$0(OrderPriceContext input) {
            Intrinsics.checkNotNullParameter(input, "input");
            Instrument instrument = input.getInstrument();
            return instrument != null && instrument.isRoundedToTickSize(input.getPrice());
        }
    }
}
