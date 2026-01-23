package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.p320db.bonfire.ProgramDetail;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PspStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/ProgramDetail;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PspStore$programDetailEndpoint$2", m3645f = "PspStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PspStore$programDetailEndpoint$2 extends ContinuationImpl7 implements Function2<Optional<? extends ProgramDetail>, Continuation<? super Unit>, Object> {
    int label;

    PspStore$programDetailEndpoint$2(Continuation<? super PspStore$programDetailEndpoint$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PspStore$programDetailEndpoint$2(continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Optional<ProgramDetail> optional, Continuation<? super Unit> continuation) {
        return ((PspStore$programDetailEndpoint$2) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Optional<? extends ProgramDetail> optional, Continuation<? super Unit> continuation) {
        return invoke2((Optional<ProgramDetail>) optional, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
