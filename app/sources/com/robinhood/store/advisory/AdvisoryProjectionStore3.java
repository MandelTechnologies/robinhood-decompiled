package com.robinhood.store.advisory;

import com.robinhood.models.advisory.p304db.projection.ProjectionDisclosure;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: AdvisoryProjectionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "projectionDisclosure", "Lcom/robinhood/models/advisory/db/projection/ProjectionDisclosure;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.AdvisoryProjectionStore$projectionDisclosureEndpoint$2", m3645f = "AdvisoryProjectionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.advisory.AdvisoryProjectionStore$projectionDisclosureEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class AdvisoryProjectionStore3 extends ContinuationImpl7 implements Function2<ProjectionDisclosure, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvisoryProjectionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvisoryProjectionStore3(AdvisoryProjectionStore advisoryProjectionStore, Continuation<? super AdvisoryProjectionStore3> continuation) {
        super(2, continuation);
        this.this$0 = advisoryProjectionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvisoryProjectionStore3 advisoryProjectionStore3 = new AdvisoryProjectionStore3(this.this$0, continuation);
        advisoryProjectionStore3.L$0 = obj;
        return advisoryProjectionStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProjectionDisclosure projectionDisclosure, Continuation<? super Unit> continuation) {
        return ((AdvisoryProjectionStore3) create(projectionDisclosure, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ProjectionDisclosure projectionDisclosure = (ProjectionDisclosure) this.L$0;
            StateFlow2 stateFlow2 = (StateFlow2) this.this$0.projectionDisclosureFlowMap.get(projectionDisclosure.getAccountNumber());
            if (stateFlow2 != null) {
                stateFlow2.setValue(projectionDisclosure);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
