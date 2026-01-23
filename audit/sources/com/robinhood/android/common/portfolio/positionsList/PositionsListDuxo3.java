package com.robinhood.android.common.portfolio.positionsList;

import com.robinhood.android.models.portfolio.PositionsV2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PositionsListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$bind$5$1", m3645f = "PositionsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.portfolio.positionsList.PositionsListDuxo$bind$5$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PositionsListDuxo3 extends ContinuationImpl7 implements Function2<PositionsListDataState, Continuation<? super PositionsListDataState>, Object> {
    final /* synthetic */ PositionsV2 $positions;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionsListDuxo3(PositionsV2 positionsV2, Continuation<? super PositionsListDuxo3> continuation) {
        super(2, continuation);
        this.$positions = positionsV2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PositionsListDuxo3 positionsListDuxo3 = new PositionsListDuxo3(this.$positions, continuation);
        positionsListDuxo3.L$0 = obj;
        return positionsListDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PositionsListDataState positionsListDataState, Continuation<? super PositionsListDataState> continuation) {
        return ((PositionsListDuxo3) create(positionsListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return PositionsListDataState.copy$default((PositionsListDataState) this.L$0, null, null, null, null, this.$positions.getHeader(), this.$positions.getFooter(), extensions2.toImmutableList(this.$positions.getResults()), false, false, false, false, false, 3983, null);
    }
}
