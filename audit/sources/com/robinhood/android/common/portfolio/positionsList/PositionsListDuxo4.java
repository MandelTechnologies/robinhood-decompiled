package com.robinhood.android.common.portfolio.positionsList;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionsListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$bind$6$1", m3645f = "PositionsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$bind$6$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PositionsListDuxo4 extends ContinuationImpl7 implements Function2<PositionsListDataState, Continuation<? super PositionsListDataState>, Object> {
    final /* synthetic */ Boolean $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionsListDuxo4(Boolean bool, Continuation<? super PositionsListDuxo4> continuation) {
        super(2, continuation);
        this.$it = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PositionsListDuxo4 positionsListDuxo4 = new PositionsListDuxo4(this.$it, continuation);
        positionsListDuxo4.L$0 = obj;
        return positionsListDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PositionsListDataState positionsListDataState, Continuation<? super PositionsListDataState> continuation) {
        return ((PositionsListDuxo4) create(positionsListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PositionsListDataState positionsListDataState = (PositionsListDataState) this.L$0;
        Boolean bool = this.$it;
        Intrinsics.checkNotNull(bool);
        return PositionsListDataState.copy$default(positionsListDataState, null, null, null, null, null, null, null, bool.booleanValue(), false, false, false, false, 3967, null);
    }
}
