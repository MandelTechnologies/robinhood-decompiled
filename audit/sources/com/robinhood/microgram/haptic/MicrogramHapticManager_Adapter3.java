package com.robinhood.microgram.haptic;

import com.robinhood.microgram.haptic.MicrogramHapticManager_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MicrogramHapticManager_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/microgram/haptic/MicrogramHapticManager_Adapter$Endpoint_perform$Arguments;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.microgram.haptic.MicrogramHapticManager_Adapter$Endpoint_perform$call$1", m3645f = "MicrogramHapticManager_Adapter.kt", m3646l = {58}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.microgram.haptic.MicrogramHapticManager_Adapter$Endpoint_perform$call$1, reason: use source file name */
/* loaded from: classes13.dex */
final class MicrogramHapticManager_Adapter3 extends ContinuationImpl7 implements Function2<MicrogramHapticManager_Adapter.Endpoint_perform.Arguments, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MicrogramHapticManager_Adapter.Endpoint_perform this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MicrogramHapticManager_Adapter3(MicrogramHapticManager_Adapter.Endpoint_perform endpoint_perform, Continuation<? super MicrogramHapticManager_Adapter3> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_perform;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MicrogramHapticManager_Adapter3 microgramHapticManager_Adapter3 = new MicrogramHapticManager_Adapter3(this.this$0, continuation);
        microgramHapticManager_Adapter3.L$0 = obj;
        return microgramHapticManager_Adapter3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MicrogramHapticManager_Adapter.Endpoint_perform.Arguments arguments, Continuation<? super Unit> continuation) {
        return ((MicrogramHapticManager_Adapter3) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MicrogramHapticManager_Adapter.Endpoint_perform.Arguments arguments = (MicrogramHapticManager_Adapter.Endpoint_perform.Arguments) this.L$0;
            HapticManager hapticManager = this.this$0.service;
            HapticType haptic = arguments.getHaptic();
            this.label = 1;
            if (hapticManager.perform(haptic, this) == coroutine_suspended) {
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
