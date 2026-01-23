package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: RetirementOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "args", "Lcom/robinhood/models/api/BrokerageAccountType;", "result", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore$endpoint$2", m3645f = "RetirementOnboardingStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class RetirementOnboardingStore3 extends ContinuationImpl7 implements Function3<BrokerageAccountType, ApiRetirementSignUpFlow, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ RetirementOnboardingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementOnboardingStore3(RetirementOnboardingStore retirementOnboardingStore, Continuation<? super RetirementOnboardingStore3> continuation) {
        super(3, continuation);
        this.this$0 = retirementOnboardingStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(BrokerageAccountType brokerageAccountType, ApiRetirementSignUpFlow apiRetirementSignUpFlow, Continuation<? super Unit> continuation) {
        RetirementOnboardingStore3 retirementOnboardingStore3 = new RetirementOnboardingStore3(this.this$0, continuation);
        retirementOnboardingStore3.L$0 = brokerageAccountType;
        retirementOnboardingStore3.L$1 = apiRetirementSignUpFlow;
        return retirementOnboardingStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.getSignUpFlowCache$lib_store_retirement_externalDebug().put((BrokerageAccountType) this.L$0, (ApiRetirementSignUpFlow) this.L$1);
        return Unit.INSTANCE;
    }
}
