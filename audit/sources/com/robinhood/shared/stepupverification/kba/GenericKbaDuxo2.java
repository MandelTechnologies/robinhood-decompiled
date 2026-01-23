package com.robinhood.shared.stepupverification.kba;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: GenericKbaDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/stepupverification/kba/GenericKbaViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.kba.GenericKbaDuxo$onSecondaryCtaClicked$1$1", m3645f = "GenericKbaDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.stepupverification.kba.GenericKbaDuxo$onSecondaryCtaClicked$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class GenericKbaDuxo2 extends ContinuationImpl7 implements Function2<GenericKbaViewState, Continuation<? super GenericKbaViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    GenericKbaDuxo2(Continuation<? super GenericKbaDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GenericKbaDuxo2 genericKbaDuxo2 = new GenericKbaDuxo2(continuation);
        genericKbaDuxo2.L$0 = obj;
        return genericKbaDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GenericKbaViewState genericKbaViewState, Continuation<? super GenericKbaViewState> continuation) {
        return ((GenericKbaDuxo2) create(genericKbaViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((GenericKbaViewState) this.L$0).copy(true);
    }
}
