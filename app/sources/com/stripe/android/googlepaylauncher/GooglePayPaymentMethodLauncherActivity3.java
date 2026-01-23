package com.stripe.android.googlepaylauncher;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GooglePayPaymentMethodLauncherActivity.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onCreate$2$1$1", m3645f = "GooglePayPaymentMethodLauncherActivity.kt", m3646l = {78}, m3647m = "invokeSuspend")
/* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity$onCreate$2$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class GooglePayPaymentMethodLauncherActivity3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Task<PaymentData>>, Object> {
    int label;
    final /* synthetic */ GooglePayPaymentMethodLauncherActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GooglePayPaymentMethodLauncherActivity3(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity, Continuation<? super GooglePayPaymentMethodLauncherActivity3> continuation) {
        super(2, continuation);
        this.this$0 = googlePayPaymentMethodLauncherActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GooglePayPaymentMethodLauncherActivity3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Task<PaymentData>> continuation) {
        return ((GooglePayPaymentMethodLauncherActivity3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        GooglePayPaymentMethodLauncherViewModel viewModel = this.this$0.getViewModel();
        this.label = 1;
        Object objLoadPaymentData = viewModel.loadPaymentData(this);
        return objLoadPaymentData == coroutine_suspended ? coroutine_suspended : objLoadPaymentData;
    }
}
