package com.robinhood.microgram.experimentation;

import com.robinhood.microgram.experimentation.MicrogramExperimentManager_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MicrogramExperimentManager_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager_Adapter$Endpoint_variationForExperiment$Emission;", "it", "Lcom/robinhood/microgram/experimentation/MicrogramExperimentManager_Adapter$Endpoint_variationForExperiment$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.microgram.experimentation.MicrogramExperimentManager_Adapter$Endpoint_variationForExperiment$call$1", m3645f = "MicrogramExperimentManager_Adapter.kt", m3646l = {66}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.microgram.experimentation.MicrogramExperimentManager_Adapter$Endpoint_variationForExperiment$call$1, reason: use source file name */
/* loaded from: classes13.dex */
final class MicrogramExperimentManager_Adapter6 extends ContinuationImpl7 implements Function2<MicrogramExperimentManager_Adapter.Endpoint_variationForExperiment.Arguments, Continuation<? super MicrogramExperimentManager_Adapter.Endpoint_variationForExperiment.Emission>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MicrogramExperimentManager_Adapter.Endpoint_variationForExperiment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MicrogramExperimentManager_Adapter6(MicrogramExperimentManager_Adapter.Endpoint_variationForExperiment endpoint_variationForExperiment, Continuation<? super MicrogramExperimentManager_Adapter6> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_variationForExperiment;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MicrogramExperimentManager_Adapter6 microgramExperimentManager_Adapter6 = new MicrogramExperimentManager_Adapter6(this.this$0, continuation);
        microgramExperimentManager_Adapter6.L$0 = obj;
        return microgramExperimentManager_Adapter6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MicrogramExperimentManager_Adapter.Endpoint_variationForExperiment.Arguments arguments, Continuation<? super MicrogramExperimentManager_Adapter.Endpoint_variationForExperiment.Emission> continuation) {
        return ((MicrogramExperimentManager_Adapter6) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MicrogramExperimentManager_Adapter.Endpoint_variationForExperiment.Arguments arguments = (MicrogramExperimentManager_Adapter.Endpoint_variationForExperiment.Arguments) this.L$0;
            MicrogramExperimentManager microgramExperimentManager = this.this$0.service;
            String experimentName = arguments.getExperimentName();
            boolean logExposure = arguments.getLogExposure();
            this.label = 1;
            obj = microgramExperimentManager.variationForExperiment(experimentName, logExposure, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return MicrogramExperimentManager_Adapter.Endpoint_variationForExperiment.Emission.m22911boximpl(MicrogramExperimentManager_Adapter.Endpoint_variationForExperiment.Emission.m22912constructorimpl((String) obj));
    }
}
