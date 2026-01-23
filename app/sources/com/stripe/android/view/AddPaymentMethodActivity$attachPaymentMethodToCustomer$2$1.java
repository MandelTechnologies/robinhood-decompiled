package com.stripe.android.view;

import com.plaid.internal.EnumC7081g;
import com.stripe.android.CustomerSession;
import com.stripe.android.model.PaymentMethod;
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
@DebugMetadata(m3644c = "com.stripe.android.view.AddPaymentMethodActivity$attachPaymentMethodToCustomer$2$1", m3645f = "AddPaymentMethodActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes26.dex */
final class AddPaymentMethodActivity$attachPaymentMethodToCustomer$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CustomerSession $customerSession;
    final /* synthetic */ PaymentMethod $paymentMethod;
    int label;
    final /* synthetic */ AddPaymentMethodActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddPaymentMethodActivity$attachPaymentMethodToCustomer$2$1(AddPaymentMethodActivity addPaymentMethodActivity, CustomerSession customerSession, PaymentMethod paymentMethod, Continuation<? super AddPaymentMethodActivity$attachPaymentMethodToCustomer$2$1> continuation) {
        super(2, continuation);
        this.this$0 = addPaymentMethodActivity;
        this.$customerSession = customerSession;
        this.$paymentMethod = paymentMethod;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddPaymentMethodActivity$attachPaymentMethodToCustomer$2$1(this.this$0, this.$customerSession, this.$paymentMethod, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddPaymentMethodActivity$attachPaymentMethodToCustomer$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objM26955attachPaymentMethod0E7RQCE$payments_core_release;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AddPaymentMethodViewModel viewModel = this.this$0.getViewModel();
            CustomerSession customerSession = this.$customerSession;
            PaymentMethod paymentMethod = this.$paymentMethod;
            this.label = 1;
            objM26955attachPaymentMethod0E7RQCE$payments_core_release = viewModel.m26955attachPaymentMethod0E7RQCE$payments_core_release(customerSession, paymentMethod, this);
            if (objM26955attachPaymentMethod0E7RQCE$payments_core_release == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM26955attachPaymentMethod0E7RQCE$payments_core_release = ((Result) obj).getValue();
        }
        AddPaymentMethodActivity addPaymentMethodActivity = this.this$0;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM26955attachPaymentMethod0E7RQCE$payments_core_release);
        if (thM28553exceptionOrNullimpl == null) {
            addPaymentMethodActivity.finishWithPaymentMethod((PaymentMethod) objM26955attachPaymentMethod0E7RQCE$payments_core_release);
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
