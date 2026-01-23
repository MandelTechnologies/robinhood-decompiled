package com.stripe.android.view;

import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PaymentFlowViewModel.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lcom/stripe/android/model/ShippingMethod;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.stripe.android.view.PaymentFlowViewModel$validateShippingInformation$result$1", m3645f = "PaymentFlowViewModel.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.stripe.android.view.PaymentFlowViewModel$validateShippingInformation$result$1, reason: use source file name */
/* loaded from: classes26.dex */
final class PaymentFlowViewModel5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends ShippingMethod>>>, Object> {
    final /* synthetic */ PaymentSessionConfig.ShippingInformationValidator $shippingInfoValidator;
    final /* synthetic */ ShippingInformation $shippingInformation;
    final /* synthetic */ PaymentSessionConfig.ShippingMethodsFactory $shippingMethodsFactory;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentFlowViewModel5(PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator, ShippingInformation shippingInformation, PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory, Continuation<? super PaymentFlowViewModel5> continuation) {
        super(2, continuation);
        this.$shippingInfoValidator = shippingInformationValidator;
        this.$shippingInformation = shippingInformation;
        this.$shippingMethodsFactory = shippingMethodsFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaymentFlowViewModel5 paymentFlowViewModel5 = new PaymentFlowViewModel5(this.$shippingInfoValidator, this.$shippingInformation, this.$shippingMethodsFactory, continuation);
        paymentFlowViewModel5.L$0 = obj;
        return paymentFlowViewModel5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends ShippingMethod>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<ShippingMethod>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<ShippingMethod>>> continuation) {
        return ((PaymentFlowViewModel5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objM28550constructorimpl;
        Object objM28550constructorimpl2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$shippingInfoValidator.isValid(this.$shippingInformation)) {
            PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory = this.$shippingMethodsFactory;
            ShippingInformation shippingInformation = this.$shippingInformation;
            try {
                Result.Companion companion = Result.INSTANCE;
                List<ShippingMethod> listCreate = shippingMethodsFactory != null ? shippingMethodsFactory.create(shippingInformation) : null;
                if (listCreate == null) {
                    listCreate = CollectionsKt.emptyList();
                }
                objM28550constructorimpl2 = Result.m28550constructorimpl(listCreate);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl2 = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator = this.$shippingInfoValidator;
            ShippingInformation shippingInformation2 = this.$shippingInformation;
            try {
                Result.Companion companion3 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(shippingInformationValidator.getErrorMessage(shippingInformation2));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
                thM28553exceptionOrNullimpl = new RuntimeException((String) objM28550constructorimpl);
            }
            objM28550constructorimpl2 = Result.m28550constructorimpl(ResultKt.createFailure(thM28553exceptionOrNullimpl));
        }
        return Result.m28549boximpl(objM28550constructorimpl2);
    }
}
