package com.stripe.android.payments.core.authentication;

import android.content.Context;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultPaymentNextActionHandlerRegistry.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0000\u001a)\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002j\u0002`\u0004\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0002\b\b0\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002*\"\b\u0002\u0010\r\"\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\b2\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\b*\u001c\b\u0002\u0010\u000e\"\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¨\u0006\u000f"}, m3636d2 = {"paymentSheetNextActionHandlers", "", "Ljava/lang/Class;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/payments/core/authentication/NextActionHandlerKey;", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/payments/core/authentication/NextActionHandler;", "Lkotlin/jvm/JvmSuppressWildcards;", "includePaymentSheetNextActionHandlers", "", "applicationContext", "Landroid/content/Context;", "NextActionHandler", "NextActionHandlerKey", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistryKt, reason: use source file name */
/* loaded from: classes22.dex */
public final class DefaultPaymentNextActionHandlerRegistry3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<Class<? extends StripeIntent.NextActionData>, PaymentNextActionHandler<StripeIntent>> paymentSheetNextActionHandlers(boolean z, Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (z) {
                Object obj = Class.forName("com.stripe.android.paymentsheet.PaymentSheetNextActionHandlers").getDeclaredField("INSTANCE").get(null);
                Object objInvoke = obj.getClass().getDeclaredMethod("get", null).invoke(obj, null);
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.collections.Map<java.lang.Class<out com.stripe.android.model.StripeIntent.NextActionData>{ com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistryKt.NextActionHandlerKey }, @[JvmSuppressWildcards(suppress = <null>)] com.stripe.android.payments.core.authentication.PaymentNextActionHandler<com.stripe.android.model.StripeIntent>{ com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistryKt.NextActionHandler }>");
                return (Map) objInvoke;
            }
            return MapsKt.emptyMap();
        } catch (Exception e) {
            ErrorReporter.DefaultImpls.report$default(ErrorReporter.Companion.createFallbackInstance$default(ErrorReporter.INSTANCE, context, null, 2, null), ErrorReporter.UnexpectedErrorEvent.PAYMENT_SHEET_AUTHENTICATORS_NOT_FOUND, StripeException.INSTANCE.create(e), null, 4, null);
            return MapsKt.emptyMap();
        }
    }
}
