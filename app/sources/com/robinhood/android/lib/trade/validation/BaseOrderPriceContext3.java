package com.robinhood.android.lib.trade.validation;

import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.lib.trade.validation.BaseOrderPriceContext;
import com.robinhood.android.lib.trade.validation.BaseOrderPriceContext2;
import com.robinhood.android.lib.trade.validation.Validator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseOrderPriceContext.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000b*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u00020\u0006:\u0001\u000bR\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/BaseOrderPriceValidationFailure;", "InputT", "Lcom/robinhood/android/lib/trade/validation/BaseOrderPriceContext;", "ResolverT", "Lcom/robinhood/android/lib/trade/validation/BaseOrderPriceFailureResolver;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Landroid/os/Parcelable;", "passthroughArgs", "Landroid/os/Bundle;", "getPassthroughArgs", "()Landroid/os/Bundle;", "Companion", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.trade.validation.BaseOrderPriceValidationFailure, reason: use source file name */
/* loaded from: classes8.dex */
public interface BaseOrderPriceContext3<InputT extends BaseOrderPriceContext, ResolverT extends BaseOrderPriceContext2> extends Validator.Failure<InputT, ResolverT>, Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Bundle getPassthroughArgs();

    /* compiled from: BaseOrderPriceContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.trade.validation.BaseOrderPriceValidationFailure$DefaultImpls */
    public static final class DefaultImpls {
        public static <InputT extends BaseOrderPriceContext, ResolverT extends BaseOrderPriceContext2> Validator.Action<InputT> onNegativeResponse(BaseOrderPriceContext3<InputT, ResolverT> baseOrderPriceContext3, ResolverT resolver, Bundle bundle) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            return Validator.Failure.DefaultImpls.onNegativeResponse(baseOrderPriceContext3, resolver, bundle);
        }

        public static <InputT extends BaseOrderPriceContext, ResolverT extends BaseOrderPriceContext2> Validator.Action<InputT> onPositiveResponse(BaseOrderPriceContext3<InputT, ResolverT> baseOrderPriceContext3, ResolverT resolver, Bundle bundle) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            return Validator.Failure.DefaultImpls.onPositiveResponse(baseOrderPriceContext3, resolver, bundle);
        }

        public static <InputT extends BaseOrderPriceContext, ResolverT extends BaseOrderPriceContext2> Bundle getPassthroughArgs(BaseOrderPriceContext3<InputT, ResolverT> baseOrderPriceContext3) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("orderPriceError", baseOrderPriceContext3);
            return bundle;
        }
    }

    /* compiled from: BaseOrderPriceContext.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0006\u001a\u0004\u0018\u0001H\u0007\"\u0010\b\u0002\u0010\u0007*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/trade/validation/BaseOrderPriceValidationFailure$Companion;", "", "<init>", "()V", "KEY_ORDER_PRICE_ERROR", "", "getFailure", "FailureT", "Lcom/robinhood/android/lib/trade/validation/BaseOrderPriceValidationFailure;", "bundle", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)Lcom/robinhood/android/lib/trade/validation/BaseOrderPriceValidationFailure;", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.trade.validation.BaseOrderPriceValidationFailure$Companion, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String KEY_ORDER_PRICE_ERROR = "orderPriceError";

        private Companion() {
        }

        public final <FailureT extends BaseOrderPriceContext3<?, ?>> FailureT getFailure(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return (FailureT) bundle.getParcelable(KEY_ORDER_PRICE_ERROR);
        }
    }
}
