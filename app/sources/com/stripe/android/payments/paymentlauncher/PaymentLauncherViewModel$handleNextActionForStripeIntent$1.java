package com.stripe.android.payments.paymentlauncher;

import com.plaid.internal.EnumC7081g;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeRepository;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaymentLauncherViewModel.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$handleNextActionForStripeIntent$1", m3645f = "PaymentLauncherViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PIN_VALUE, EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes22.dex */
final class PaymentLauncherViewModel$handleNextActionForStripeIntent$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $clientSecret;
    final /* synthetic */ AuthActivityStarterHost $host;
    Object L$0;
    int label;
    final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentLauncherViewModel$handleNextActionForStripeIntent$1(PaymentLauncherViewModel paymentLauncherViewModel, String str, AuthActivityStarterHost authActivityStarterHost, Continuation<? super PaymentLauncherViewModel$handleNextActionForStripeIntent$1> continuation) {
        super(2, continuation);
        this.this$0 = paymentLauncherViewModel;
        this.$clientSecret = str;
        this.$host = authActivityStarterHost;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PaymentLauncherViewModel$handleNextActionForStripeIntent$1(this.this$0, this.$clientSecret, this.$host, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PaymentLauncherViewModel$handleNextActionForStripeIntent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
    
        if (r1.performNextAction(r6, r14, (com.stripe.android.core.networking.ApiRequest.Options) r3, r13) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r14, r2, r13) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map mapLogHandleNextActionStarted;
        PaymentLauncherViewModel$handleNextActionForStripeIntent$1 paymentLauncherViewModel$handleNextActionForStripeIntent$1;
        Object objM26910retrieveStripeIntentBWLJW6A$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.savedStateHandle.set("key_has_started", boxing.boxBoolean(true));
            this.this$0.savedStateHandle.set("confirm_action_requested", boxing.boxBoolean(false));
            mapLogHandleNextActionStarted = this.this$0.logHandleNextActionStarted(this.$clientSecret);
            StripeRepository stripeRepository = this.this$0.stripeApiRepository;
            String str = this.$clientSecret;
            Object obj2 = this.this$0.apiRequestOptionsProvider.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            this.L$0 = mapLogHandleNextActionStarted;
            this.label = 1;
            paymentLauncherViewModel$handleNextActionForStripeIntent$1 = this;
            objM26910retrieveStripeIntentBWLJW6A$default = StripeRepository.DefaultImpls.m26910retrieveStripeIntentBWLJW6A$default(stripeRepository, str, (ApiRequest.Options) obj2, null, paymentLauncherViewModel$handleNextActionForStripeIntent$1, 4, null);
            if (objM26910retrieveStripeIntentBWLJW6A$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        mapLogHandleNextActionStarted = (Map) this.L$0;
        ResultKt.throwOnFailure(obj);
        objM26910retrieveStripeIntentBWLJW6A$default = ((Result) obj).getValue();
        paymentLauncherViewModel$handleNextActionForStripeIntent$1 = this;
        PaymentLauncherViewModel paymentLauncherViewModel = paymentLauncherViewModel$handleNextActionForStripeIntent$1.this$0;
        AuthActivityStarterHost authActivityStarterHost = paymentLauncherViewModel$handleNextActionForStripeIntent$1.$host;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM26910retrieveStripeIntentBWLJW6A$default);
        if (thM28553exceptionOrNullimpl != null) {
            CoroutineContext coroutineContext = paymentLauncherViewModel.uiContext;
            PaymentLauncherViewModel$handleNextActionForStripeIntent$1$2$1 paymentLauncherViewModel$handleNextActionForStripeIntent$1$2$1 = new PaymentLauncherViewModel$handleNextActionForStripeIntent$1$2$1(paymentLauncherViewModel, thM28553exceptionOrNullimpl, mapLogHandleNextActionStarted, null);
            paymentLauncherViewModel$handleNextActionForStripeIntent$1.L$0 = null;
            paymentLauncherViewModel$handleNextActionForStripeIntent$1.label = 3;
        } else {
            StripeIntent stripeIntent = (StripeIntent) objM26910retrieveStripeIntentBWLJW6A$default;
            PaymentNextActionHandler nextActionHandler = paymentLauncherViewModel.nextActionHandlerRegistry.getNextActionHandler(stripeIntent);
            Object obj3 = paymentLauncherViewModel.apiRequestOptionsProvider.get();
            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
            paymentLauncherViewModel$handleNextActionForStripeIntent$1.L$0 = null;
            paymentLauncherViewModel$handleNextActionForStripeIntent$1.label = 2;
        }
    }
}
