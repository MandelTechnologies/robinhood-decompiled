package com.stripe.android.payments.core.authentication;

import androidx.lifecycle.LifecycleOwner;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultCaller;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.payments.Unvalidated;
import com.stripe.android.payments.core.ActivityResultLauncherHost;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PaymentNextActionHandler.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000bJ&\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\nH¤@¢\u0006\u0002\u0010\u000b¨\u0006\r"}, m3636d2 = {"Lcom/stripe/android/payments/core/authentication/PaymentNextActionHandler;", "Actionable", "Lcom/stripe/android/payments/core/ActivityResultLauncherHost;", "()V", "performNextAction", "", "host", "Lcom/stripe/android/view/AuthActivityStarterHost;", "actionable", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/Object;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performNextActionOnResumed", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public abstract class PaymentNextActionHandler<Actionable> implements ActivityResultLauncherHost {

    /* compiled from: PaymentNextActionHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.payments.core.authentication.PaymentNextActionHandler", m3645f = "PaymentNextActionHandler.kt", m3646l = {35, 36}, m3647m = "performNextAction")
    /* renamed from: com.stripe.android.payments.core.authentication.PaymentNextActionHandler$performNextAction$1 */
    static final class C425761 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PaymentNextActionHandler<Actionable> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425761(PaymentNextActionHandler<Actionable> paymentNextActionHandler, Continuation<? super C425761> continuation) {
            super(continuation);
            this.this$0 = paymentNextActionHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.performNextAction(null, null, null, this);
        }
    }

    protected abstract Object performNextActionOnResumed(AuthActivityStarterHost authActivityStarterHost, Actionable actionable, ApiRequest.Options options, Continuation<? super Unit> continuation);

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onLauncherInvalidated() {
        ActivityResultLauncherHost.DefaultImpls.onLauncherInvalidated(this);
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onNewActivityResultCaller(ActivityResultCaller activityResultCaller, ActivityResultCallback<Unvalidated> activityResultCallback) {
        ActivityResultLauncherHost.DefaultImpls.onNewActivityResultCaller(this, activityResultCaller, activityResultCallback);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r2.performNextActionOnResumed(r6, r7, r8, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performNextAction(AuthActivityStarterHost authActivityStarterHost, Actionable actionable, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        C425761 c425761;
        PaymentNextActionHandler paymentNextActionHandler;
        if (continuation instanceof C425761) {
            c425761 = (C425761) continuation;
            int i = c425761.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c425761.label = i - Integer.MIN_VALUE;
            } else {
                c425761 = new C425761(this, continuation);
            }
        }
        Object obj = c425761.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c425761.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            LifecycleOwner lifecycleOwner = authActivityStarterHost.getLifecycleOwner();
            c425761.L$0 = this;
            c425761.L$1 = authActivityStarterHost;
            c425761.L$2 = actionable;
            c425761.L$3 = options;
            c425761.label = 1;
            if (PaymentNextActionHandler2.awaitResumed(lifecycleOwner, c425761) != coroutine_suspended) {
                paymentNextActionHandler = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        options = (ApiRequest.Options) c425761.L$3;
        actionable = (Actionable) c425761.L$2;
        authActivityStarterHost = (AuthActivityStarterHost) c425761.L$1;
        paymentNextActionHandler = (PaymentNextActionHandler) c425761.L$0;
        ResultKt.throwOnFailure(obj);
        c425761.L$0 = null;
        c425761.L$1 = null;
        c425761.L$2 = null;
        c425761.L$3 = null;
        c425761.label = 2;
    }
}
