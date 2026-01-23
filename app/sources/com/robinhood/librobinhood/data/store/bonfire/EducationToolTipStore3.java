package com.robinhood.librobinhood.data.store.bonfire;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.shared.models.api.bonfire.education.ApiEducationToolTipResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationToolTipStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/shared/models/api/bonfire/education/ApiEducationToolTipResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.EducationToolTipStore$getToolTipEndpoint$2", m3645f = "EducationToolTipStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.EducationToolTipStore$getToolTipEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class EducationToolTipStore3 extends ContinuationImpl7 implements Function2<ApiEducationToolTipResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EducationToolTipStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EducationToolTipStore3(EducationToolTipStore educationToolTipStore, Continuation<? super EducationToolTipStore3> continuation) {
        super(2, continuation);
        this.this$0 = educationToolTipStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EducationToolTipStore3 educationToolTipStore3 = new EducationToolTipStore3(this.this$0, continuation);
        educationToolTipStore3.L$0 = obj;
        return educationToolTipStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiEducationToolTipResponse apiEducationToolTipResponse, Continuation<? super Unit> continuation) {
        return ((EducationToolTipStore3) create(apiEducationToolTipResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ApiEducationToolTipResponse apiEducationToolTipResponse = (ApiEducationToolTipResponse) this.L$0;
            BehaviorRelay behaviorRelayCreate = (BehaviorRelay) this.this$0.toolTipRelays.get(apiEducationToolTipResponse.getId());
            if (behaviorRelayCreate == null) {
                behaviorRelayCreate = BehaviorRelay.create();
                Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
            }
            this.this$0.toolTipRelays.put(apiEducationToolTipResponse.getId(), behaviorRelayCreate);
            behaviorRelayCreate.accept(apiEducationToolTipResponse);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
