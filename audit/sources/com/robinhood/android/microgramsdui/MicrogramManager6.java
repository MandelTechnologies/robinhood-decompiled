package com.robinhood.android.microgramsdui;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;
import microgram.android.Monitoring;

/* compiled from: MicrogramManager.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lmicrogram/android/MicrogramState$Terminated;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.RealMicrogramManager$getInstance$2", m3645f = "MicrogramManager.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.microgramsdui.RealMicrogramManager$getInstance$2, reason: use source file name */
/* loaded from: classes8.dex */
final class MicrogramManager6 extends ContinuationImpl7 implements Function2<Monitoring.Terminated, Continuation<? super Unit>, Object> {
    final /* synthetic */ Job $job;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MicrogramManager6(Job job, Continuation<? super MicrogramManager6> continuation) {
        super(2, continuation);
        this.$job = job;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MicrogramManager6(this.$job, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Monitoring.Terminated terminated, Continuation<? super Unit> continuation) {
        return ((MicrogramManager6) create(terminated, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Job.DefaultImpls.cancel$default(this.$job, null, 1, null);
        return Unit.INSTANCE;
    }
}
