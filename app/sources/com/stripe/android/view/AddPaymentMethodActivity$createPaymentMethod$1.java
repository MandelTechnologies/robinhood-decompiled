package com.stripe.android.view;

import com.plaid.internal.EnumC7081g;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AddPaymentMethodActivity.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.view.AddPaymentMethodActivity$createPaymentMethod$1", m3645f = "AddPaymentMethodActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes26.dex */
final class AddPaymentMethodActivity$createPaymentMethod$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentMethodCreateParams $params;
    final /* synthetic */ AddPaymentMethodViewModel $viewModel;
    int label;
    final /* synthetic */ AddPaymentMethodActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddPaymentMethodActivity$createPaymentMethod$1(AddPaymentMethodViewModel addPaymentMethodViewModel, PaymentMethodCreateParams paymentMethodCreateParams, AddPaymentMethodActivity addPaymentMethodActivity, Continuation<? super AddPaymentMethodActivity$createPaymentMethod$1> continuation) {
        super(2, continuation);
        this.$viewModel = addPaymentMethodViewModel;
        this.$params = paymentMethodCreateParams;
        this.this$0 = addPaymentMethodActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddPaymentMethodActivity$createPaymentMethod$1(this.$viewModel, this.$params, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddPaymentMethodActivity$createPaymentMethod$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objM26956createPaymentMethodgIAlus$payments_core_release;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AddPaymentMethodViewModel addPaymentMethodViewModel = this.$viewModel;
            PaymentMethodCreateParams paymentMethodCreateParams = this.$params;
            this.label = 1;
            objM26956createPaymentMethodgIAlus$payments_core_release = addPaymentMethodViewModel.m26956createPaymentMethodgIAlus$payments_core_release(paymentMethodCreateParams, this);
            if (objM26956createPaymentMethodgIAlus$payments_core_release == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM26956createPaymentMethodgIAlus$payments_core_release = ((Result) obj).getValue();
        }
        AddPaymentMethodActivity addPaymentMethodActivity = this.this$0;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM26956createPaymentMethodgIAlus$payments_core_release);
        if (thM28553exceptionOrNullimpl == null) {
            PaymentMethod paymentMethod = (PaymentMethod) objM26956createPaymentMethodgIAlus$payments_core_release;
            if (addPaymentMethodActivity.getShouldAttachToCustomer()) {
                addPaymentMethodActivity.attachPaymentMethodToCustomer(paymentMethod);
            } else {
                addPaymentMethodActivity.finishWithPaymentMethod(paymentMethod);
            }
        } else {
            addPaymentMethodActivity.setProgressBarVisible(false);
            String message = thM28553exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            addPaymentMethodActivity.showError(message);
        }
        return Unit.INSTANCE;
    }
}
