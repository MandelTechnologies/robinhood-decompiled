package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.utils.Optional;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ExperimentsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/utils/Optional;", "", "Lcom/robinhood/models/db/KaizenExperiment;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ExperimentsStore$experimentsEndpoint$2", m3645f = "ExperimentsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.ExperimentsStore$experimentsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class ExperimentsStore5 extends ContinuationImpl7 implements Function2<Optional<? extends List<? extends KaizenExperiment>>, Continuation<? super Unit>, Object> {
    int label;

    ExperimentsStore5(Continuation<? super ExperimentsStore5> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExperimentsStore5(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Optional<? extends List<? extends KaizenExperiment>> optional, Continuation<? super Unit> continuation) {
        return ((ExperimentsStore5) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
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
