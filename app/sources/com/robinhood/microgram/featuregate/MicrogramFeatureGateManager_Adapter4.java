package com.robinhood.microgram.featuregate;

import com.robinhood.microgram.featuregate.MicrogramFeatureGateManager_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MicrogramFeatureGateManager_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/microgram/featuregate/MicrogramFeatureGateManager_Adapter$Endpoint_getFeatureGateState$Emission;", "it", "Lcom/robinhood/microgram/featuregate/MicrogramFeatureGateManager_Adapter$Endpoint_getFeatureGateState$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.microgram.featuregate.MicrogramFeatureGateManager_Adapter$Endpoint_getFeatureGateState$call$1", m3645f = "MicrogramFeatureGateManager_Adapter.kt", m3646l = {60}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.microgram.featuregate.MicrogramFeatureGateManager_Adapter$Endpoint_getFeatureGateState$call$1, reason: use source file name */
/* loaded from: classes13.dex */
final class MicrogramFeatureGateManager_Adapter4 extends ContinuationImpl7 implements Function2<MicrogramFeatureGateManager_Adapter.Endpoint_getFeatureGateState.Arguments, Continuation<? super MicrogramFeatureGateManager_Adapter.Endpoint_getFeatureGateState.Emission>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MicrogramFeatureGateManager_Adapter.Endpoint_getFeatureGateState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MicrogramFeatureGateManager_Adapter4(MicrogramFeatureGateManager_Adapter.Endpoint_getFeatureGateState endpoint_getFeatureGateState, Continuation<? super MicrogramFeatureGateManager_Adapter4> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_getFeatureGateState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MicrogramFeatureGateManager_Adapter4 microgramFeatureGateManager_Adapter4 = new MicrogramFeatureGateManager_Adapter4(this.this$0, continuation);
        microgramFeatureGateManager_Adapter4.L$0 = obj;
        return microgramFeatureGateManager_Adapter4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MicrogramFeatureGateManager_Adapter.Endpoint_getFeatureGateState.Arguments arguments, Continuation<? super MicrogramFeatureGateManager_Adapter.Endpoint_getFeatureGateState.Emission> continuation) {
        return ((MicrogramFeatureGateManager_Adapter4) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MicrogramFeatureGateManager_Adapter.Endpoint_getFeatureGateState.Arguments arguments = (MicrogramFeatureGateManager_Adapter.Endpoint_getFeatureGateState.Arguments) this.L$0;
            MicrogramFeatureGateManager microgramFeatureGateManager = this.this$0.service;
            String name = arguments.getName();
            this.label = 1;
            obj = microgramFeatureGateManager.getFeatureGateState(name, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return MicrogramFeatureGateManager_Adapter.Endpoint_getFeatureGateState.Emission.m22920boximpl(MicrogramFeatureGateManager_Adapter.Endpoint_getFeatureGateState.Emission.m22921constructorimpl(((Boolean) obj).booleanValue()));
    }
}
