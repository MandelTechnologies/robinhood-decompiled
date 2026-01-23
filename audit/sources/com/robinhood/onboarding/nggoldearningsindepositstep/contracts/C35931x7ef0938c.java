package com.robinhood.onboarding.nggoldearningsindepositstep.contracts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.onboarding.nggoldearningsindepositstep.contracts.NGGoldEarningsService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: NGGoldEarningsService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_showNewUserBottomSheetIfEligible$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.onboarding.nggoldearningsindepositstep.contracts.NGGoldEarningsService_Adapter$Endpoint_showNewUserBottomSheetIfEligible$call$1", m3645f = "NGGoldEarningsService_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.onboarding.nggoldearningsindepositstep.contracts.NGGoldEarningsService_Adapter$Endpoint_showNewUserBottomSheetIfEligible$call$1 */
/* loaded from: classes22.dex */
final class C35931x7ef0938c extends ContinuationImpl7 implements Function2<NGGoldEarningsService_Adapter.Endpoint_showNewUserBottomSheetIfEligible.Arguments, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NGGoldEarningsService_Adapter.Endpoint_showNewUserBottomSheetIfEligible this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C35931x7ef0938c(NGGoldEarningsService_Adapter.Endpoint_showNewUserBottomSheetIfEligible endpoint_showNewUserBottomSheetIfEligible, Continuation<? super C35931x7ef0938c> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_showNewUserBottomSheetIfEligible;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C35931x7ef0938c c35931x7ef0938c = new C35931x7ef0938c(this.this$0, continuation);
        c35931x7ef0938c.L$0 = obj;
        return c35931x7ef0938c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NGGoldEarningsService_Adapter.Endpoint_showNewUserBottomSheetIfEligible.Arguments arguments, Continuation<? super Unit> continuation) {
        return ((C35931x7ef0938c) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            NGGoldEarningsService_Adapter.Endpoint_showNewUserBottomSheetIfEligible.Arguments arguments = (NGGoldEarningsService_Adapter.Endpoint_showNewUserBottomSheetIfEligible.Arguments) this.L$0;
            NGGoldEarningsService nGGoldEarningsService = this.this$0.service;
            Double depositAmount = arguments.getDepositAmount();
            String entryPoint = arguments.getEntryPoint();
            this.label = 1;
            if (nGGoldEarningsService.showNewUserBottomSheetIfEligible(depositAmount, entryPoint, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
