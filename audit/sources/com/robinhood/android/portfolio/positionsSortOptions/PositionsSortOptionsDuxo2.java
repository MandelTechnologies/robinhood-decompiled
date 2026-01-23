package com.robinhood.android.portfolio.positionsSortOptions;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PositionsSortOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsDuxo$onDone$1$1", m3645f = "PositionsSortOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsDuxo$onDone$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PositionsSortOptionsDuxo2 extends ContinuationImpl7 implements Function2<PositionsSortOptionsDataState, Continuation<? super PositionsSortOptionsDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    PositionsSortOptionsDuxo2(Continuation<? super PositionsSortOptionsDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PositionsSortOptionsDuxo2 positionsSortOptionsDuxo2 = new PositionsSortOptionsDuxo2(continuation);
        positionsSortOptionsDuxo2.L$0 = obj;
        return positionsSortOptionsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PositionsSortOptionsDataState positionsSortOptionsDataState, Continuation<? super PositionsSortOptionsDataState> continuation) {
        return ((PositionsSortOptionsDuxo2) create(positionsSortOptionsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return PositionsSortOptionsDataState.copy$default((PositionsSortOptionsDataState) this.L$0, null, null, null, null, true, false, 47, null);
    }
}
