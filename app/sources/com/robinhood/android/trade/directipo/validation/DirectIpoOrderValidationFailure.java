package com.robinhood.android.trade.directipo.validation;

import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.lib.trade.validation.Validator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoOrderValidationFailure.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\tR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderValidationFailure;", "Lcom/robinhood/android/lib/trade/validation/Validator$Failure;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderContext;", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderFailureResolver;", "Landroid/os/Parcelable;", "passthroughArgs", "Landroid/os/Bundle;", "getPassthroughArgs", "()Landroid/os/Bundle;", "Companion", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface DirectIpoOrderValidationFailure extends Validator.Failure<DirectIpoOrderContext, DirectIpoOrderFailureResolver>, Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Bundle getPassthroughArgs();

    /* compiled from: DirectIpoOrderValidationFailure.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static Validator.Action<DirectIpoOrderContext> onNegativeResponse(DirectIpoOrderValidationFailure directIpoOrderValidationFailure, DirectIpoOrderFailureResolver resolver, Bundle bundle) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            return Validator.Failure.DefaultImpls.onNegativeResponse(directIpoOrderValidationFailure, resolver, bundle);
        }

        public static Validator.Action<DirectIpoOrderContext> onPositiveResponse(DirectIpoOrderValidationFailure directIpoOrderValidationFailure, DirectIpoOrderFailureResolver resolver, Bundle bundle) {
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            return Validator.Failure.DefaultImpls.onPositiveResponse(directIpoOrderValidationFailure, resolver, bundle);
        }

        public static Bundle getPassthroughArgs(DirectIpoOrderValidationFailure directIpoOrderValidationFailure) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("directIpoOrderError", directIpoOrderValidationFailure);
            return bundle;
        }
    }

    /* compiled from: DirectIpoOrderValidationFailure.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderValidationFailure$Companion;", "", "<init>", "()V", "KEY_FAILURE", "", "getFailure", "Lcom/robinhood/android/trade/directipo/validation/DirectIpoOrderValidationFailure;", "bundle", "Landroid/os/Bundle;", "feature-lib-trade-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String KEY_FAILURE = "directIpoOrderError";

        private Companion() {
        }

        public final DirectIpoOrderValidationFailure getFailure(Bundle bundle) {
            if (bundle != null) {
                return (DirectIpoOrderValidationFailure) bundle.getParcelable(KEY_FAILURE);
            }
            return null;
        }
    }
}
