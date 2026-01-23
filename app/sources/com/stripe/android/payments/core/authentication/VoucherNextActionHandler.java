package com.stripe.android.payments.core.authentication;

import android.content.Context;
import android.os.Parcelable;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VoucherNextActionHandler.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0094@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/VoucherNextActionHandler;", "Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Lcom/stripe/android/model/StripeIntent;", "webIntentAuthenticator", "Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;", "noOpIntentAuthenticator", "Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;", "context", "Landroid/content/Context;", "(Lcom/stripe/android/payments/core/authentication/WebIntentNextActionHandler;Lcom/stripe/android/payments/core/authentication/NoOpIntentNextActionHandler;Landroid/content/Context;)V", "performNextActionOnResumed", "", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "actionable", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final class VoucherNextActionHandler extends PaymentNextActionHandler<StripeIntent> {
    private final Context context;
    private final NoOpIntentNextActionHandler noOpIntentAuthenticator;
    private final WebIntentNextActionHandler webIntentAuthenticator;

    @Override // com.stripe.android.payments.core.authentication.PaymentNextActionHandler
    public /* bridge */ /* synthetic */ Object performNextActionOnResumed(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation continuation) {
        return performNextActionOnResumed2(authActivityStarterHost, stripeIntent, options, (Continuation<? super Unit>) continuation);
    }

    public VoucherNextActionHandler(WebIntentNextActionHandler webIntentAuthenticator, NoOpIntentNextActionHandler noOpIntentAuthenticator, Context context) {
        Intrinsics.checkNotNullParameter(webIntentAuthenticator, "webIntentAuthenticator");
        Intrinsics.checkNotNullParameter(noOpIntentAuthenticator, "noOpIntentAuthenticator");
        Intrinsics.checkNotNullParameter(context, "context");
        this.webIntentAuthenticator = webIntentAuthenticator;
        this.noOpIntentAuthenticator = noOpIntentAuthenticator;
        this.context = context;
    }

    /* renamed from: performNextActionOnResumed, reason: avoid collision after fix types in other method */
    protected Object performNextActionOnResumed2(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        String code;
        Parcelable nextActionData = stripeIntent.getNextActionData();
        Intrinsics.checkNotNull(nextActionData, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails");
        if (((StripeIntent.NextActionData.DisplayVoucherDetails) nextActionData).getHostedVoucherUrl() == null) {
            ErrorReporter errorReporterCreateFallbackInstance$default = ErrorReporter.Companion.createFallbackInstance$default(ErrorReporter.INSTANCE, this.context, null, 2, null);
            ErrorReporter.UnexpectedErrorEvent unexpectedErrorEvent = ErrorReporter.UnexpectedErrorEvent.MISSING_HOSTED_VOUCHER_URL;
            StripeIntent.NextActionType nextActionType = stripeIntent.getNextActionType();
            if (nextActionType == null || (code = nextActionType.getCode()) == null) {
                code = "";
            }
            ErrorReporter.DefaultImpls.report$default(errorReporterCreateFallbackInstance$default, unexpectedErrorEvent, null, MapsKt.mapOf(Tuples4.m3642to("next_action_type", code)), 2, null);
            Object objPerformNextAction = this.noOpIntentAuthenticator.performNextAction(authActivityStarterHost, stripeIntent, options, continuation);
            return objPerformNextAction == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformNextAction : Unit.INSTANCE;
        }
        Object objPerformNextAction2 = this.webIntentAuthenticator.performNextAction(authActivityStarterHost, stripeIntent, options, continuation);
        return objPerformNextAction2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPerformNextAction2 : Unit.INSTANCE;
    }
}
