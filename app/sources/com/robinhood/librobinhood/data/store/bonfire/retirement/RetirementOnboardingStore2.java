package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore$endpoint$1", m3645f = "RetirementOnboardingStore.kt", m3646l = {25}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RetirementOnboardingStore2 extends ContinuationImpl7 implements Function2<BrokerageAccountType, Continuation<? super ApiRetirementSignUpFlow>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RetirementOnboardingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetirementOnboardingStore2(RetirementOnboardingStore retirementOnboardingStore, Continuation<? super RetirementOnboardingStore2> continuation) {
        super(2, continuation);
        this.this$0 = retirementOnboardingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RetirementOnboardingStore2 retirementOnboardingStore2 = new RetirementOnboardingStore2(this.this$0, continuation);
        retirementOnboardingStore2.L$0 = obj;
        return retirementOnboardingStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BrokerageAccountType brokerageAccountType, Continuation<? super ApiRetirementSignUpFlow> continuation) {
        return ((RetirementOnboardingStore2) create(brokerageAccountType, continuation)).invokeSuspend(Unit.INSTANCE);
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
        BrokerageAccountType brokerageAccountType = (BrokerageAccountType) this.L$0;
        RetirementApi retirementApi = this.this$0.retirementApi;
        this.label = 1;
        Object retirementSignUpFlow = retirementApi.getRetirementSignUpFlow(brokerageAccountType, this);
        return retirementSignUpFlow == coroutine_suspended ? coroutine_suspended : retirementSignUpFlow;
    }
}
