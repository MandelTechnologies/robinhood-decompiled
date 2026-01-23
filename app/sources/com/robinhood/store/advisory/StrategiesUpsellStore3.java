package com.robinhood.store.advisory;

import com.robinhood.models.advisory.p304db.onboarding.RecsForRetirementStrategiesUpsellViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: StrategiesUpsellStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "viewModel", "Lcom/robinhood/models/advisory/db/onboarding/RecsForRetirementStrategiesUpsellViewModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.StrategiesUpsellStore$upsellEndpoint$2", m3645f = "StrategiesUpsellStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.advisory.StrategiesUpsellStore$upsellEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class StrategiesUpsellStore3 extends ContinuationImpl7 implements Function2<RecsForRetirementStrategiesUpsellViewModel, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StrategiesUpsellStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StrategiesUpsellStore3(StrategiesUpsellStore strategiesUpsellStore, Continuation<? super StrategiesUpsellStore3> continuation) {
        super(2, continuation);
        this.this$0 = strategiesUpsellStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StrategiesUpsellStore3 strategiesUpsellStore3 = new StrategiesUpsellStore3(this.this$0, continuation);
        strategiesUpsellStore3.L$0 = obj;
        return strategiesUpsellStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RecsForRetirementStrategiesUpsellViewModel recsForRetirementStrategiesUpsellViewModel, Continuation<? super Unit> continuation) {
        return ((StrategiesUpsellStore3) create(recsForRetirementStrategiesUpsellViewModel, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            RecsForRetirementStrategiesUpsellViewModel recsForRetirementStrategiesUpsellViewModel = (RecsForRetirementStrategiesUpsellViewModel) this.L$0;
            StateFlow2 stateFlow2 = (StateFlow2) this.this$0.dao.get(recsForRetirementStrategiesUpsellViewModel.getAccountNumber());
            if (stateFlow2 != null) {
                stateFlow2.setValue(recsForRetirementStrategiesUpsellViewModel);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
