package com.withpersona.sdk2.inquiry.internal.integrity;

import com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: PlayIntegrityHelper.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/internal/integrity/PlayIntegrityHelper$PlayIntegrityState;", "it", ""}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$integrityTokenProvider$2", m3645f = "PlayIntegrityHelper.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper$generateToken$2$integrityTokenProvider$2, reason: use source file name */
/* loaded from: classes18.dex */
final class PlayIntegrityHelper4 extends ContinuationImpl7 implements Function3<FlowCollector<? super PlayIntegrityHelper.PlayIntegrityState>, Throwable, Continuation<? super Unit>, Object> {
    int label;

    PlayIntegrityHelper4(Continuation<? super PlayIntegrityHelper4> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super PlayIntegrityHelper.PlayIntegrityState> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return new PlayIntegrityHelper4(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PlayIntegrityHelper.PlayIntegrityState.Error error = PlayIntegrityHelper.PlayIntegrityState.Error.INSTANCE;
        return Unit.INSTANCE;
    }
}
