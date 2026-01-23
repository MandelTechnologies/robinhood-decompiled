package com.robinhood.store.advisory;

import com.robinhood.models.advisory.p304db.promo.DepositPromoResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: AdvisoryDepositPromoStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "depositPromoResponse", "Lcom/robinhood/models/advisory/db/promo/DepositPromoResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryDepositPromoStore$depositPromoEndpoint$2", m3645f = "AdvisoryDepositPromoStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.advisory.AdvisoryDepositPromoStore$depositPromoEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class AdvisoryDepositPromoStore5 extends ContinuationImpl7 implements Function2<DepositPromoResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisoryDepositPromoStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryDepositPromoStore5(AdvisoryDepositPromoStore advisoryDepositPromoStore, Continuation<? super AdvisoryDepositPromoStore5> continuation) {
        super(2, continuation);
        this.this$0 = advisoryDepositPromoStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisoryDepositPromoStore5 advisoryDepositPromoStore5 = new AdvisoryDepositPromoStore5(this.this$0, continuation);
        advisoryDepositPromoStore5.L$0 = obj;
        return advisoryDepositPromoStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DepositPromoResponse depositPromoResponse, Continuation<? super Unit> continuation) {
        return ((AdvisoryDepositPromoStore5) create(depositPromoResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            DepositPromoResponse depositPromoResponse = (DepositPromoResponse) this.L$0;
            StateFlow2 stateFlow2 = (StateFlow2) this.this$0.depositPromoFlowMap.get(depositPromoResponse.getAccountNumber());
            if (stateFlow2 != null) {
                stateFlow2.setValue(depositPromoResponse.getDepositPromoConfig());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
