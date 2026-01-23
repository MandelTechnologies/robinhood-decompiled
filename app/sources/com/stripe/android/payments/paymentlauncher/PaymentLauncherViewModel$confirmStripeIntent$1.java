package com.stripe.android.payments.paymentlauncher;

import com.plaid.internal.EnumC7081g;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandler;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaymentLauncherViewModel.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$confirmStripeIntent$1", m3645f = "PaymentLauncherViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, 144, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes22.dex */
final class PaymentLauncherViewModel$confirmStripeIntent$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConfirmStripeIntentParams $confirmStripeIntentParams;
    final /* synthetic */ AuthActivityStarterHost $host;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentLauncherViewModel$confirmStripeIntent$1(PaymentLauncherViewModel paymentLauncherViewModel, ConfirmStripeIntentParams confirmStripeIntentParams, AuthActivityStarterHost authActivityStarterHost, Continuation<? super PaymentLauncherViewModel$confirmStripeIntent$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentLauncherViewModel;
        this.$confirmStripeIntentParams = confirmStripeIntentParams;
        this.$host = authActivityStarterHost;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentLauncherViewModel$confirmStripeIntent$1(this.this$0, this.$confirmStripeIntentParams, this.$host, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaymentLauncherViewModel$confirmStripeIntent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r1, r2, r11) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010d, code lost:
    
        if (r1.performNextAction(r8, r12, (com.stripe.android.core.networking.ApiRequest.Options) r2, r11) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0123, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r12, r1, r11) == r0) goto L49;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String returnUrl;
        Map map;
        Object value;
        String id;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.savedStateHandle.set("key_has_started", boxing.boxBoolean(true));
            this.this$0.savedStateHandle.set("confirm_action_requested", boxing.boxBoolean(true));
            Map mapLogConfirmStarted = this.this$0.logConfirmStarted(this.$confirmStripeIntentParams);
            this.this$0.logReturnUrl(this.$confirmStripeIntentParams.getReturnUrl());
            if (this.this$0.isInstantApp) {
                returnUrl = this.$confirmStripeIntentParams.getReturnUrl();
            } else {
                returnUrl = this.$confirmStripeIntentParams.getReturnUrl();
                if (returnUrl == null || StringsKt.isBlank(returnUrl)) {
                    returnUrl = null;
                }
                if (returnUrl == null) {
                    returnUrl = this.this$0.defaultReturnUrl.getValue();
                }
            }
            PaymentLauncherViewModel paymentLauncherViewModel = this.this$0;
            ConfirmStripeIntentParams confirmStripeIntentParams = this.$confirmStripeIntentParams;
            this.L$0 = mapLogConfirmStarted;
            this.L$1 = returnUrl;
            this.label = 1;
            Object objM26952confirmIntent0E7RQCE = paymentLauncherViewModel.m26952confirmIntent0E7RQCE(confirmStripeIntentParams, returnUrl, this);
            if (objM26952confirmIntent0E7RQCE != coroutine_suspended) {
                map = mapLogConfirmStarted;
                value = objM26952confirmIntent0E7RQCE;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        returnUrl = (String) this.L$1;
        map = (Map) this.L$0;
        ResultKt.throwOnFailure(obj);
        value = ((Result) obj).getValue();
        PaymentLauncherViewModel paymentLauncherViewModel2 = this.this$0;
        AuthActivityStarterHost authActivityStarterHost = this.$host;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
        if (thM28553exceptionOrNullimpl != null) {
            CoroutineContext coroutineContext = paymentLauncherViewModel2.uiContext;
            PaymentLauncherViewModel$confirmStripeIntent$1$2$1 paymentLauncherViewModel$confirmStripeIntent$1$2$1 = new PaymentLauncherViewModel$confirmStripeIntent$1$2$1(paymentLauncherViewModel2, thM28553exceptionOrNullimpl, map, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 4;
        } else {
            StripeIntent stripeIntent = (StripeIntent) value;
            StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
            if (nextActionData != null && (nextActionData instanceof StripeIntent.NextActionData.SdkData.Use3DS1) && (id = stripeIntent.getId()) != null) {
                Map map2 = paymentLauncherViewModel2.threeDs1IntentReturnUrlMap;
                if (returnUrl == null) {
                    returnUrl = "";
                }
                map2.put(id, returnUrl);
            }
            if (!stripeIntent.requiresAction()) {
                CoroutineContext coroutineContext2 = paymentLauncherViewModel2.uiContext;
                PaymentLauncherViewModel$confirmStripeIntent$1$1$2 paymentLauncherViewModel$confirmStripeIntent$1$1$2 = new PaymentLauncherViewModel$confirmStripeIntent$1$1$2(paymentLauncherViewModel2, stripeIntent, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
            } else {
                PaymentNextActionHandler nextActionHandler = paymentLauncherViewModel2.nextActionHandlerRegistry.getNextActionHandler(stripeIntent);
                Object obj2 = paymentLauncherViewModel2.apiRequestOptionsProvider.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
            }
        }
    }
}
