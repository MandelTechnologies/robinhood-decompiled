package com.robinhood.android.portfolio.positions.display;

import com.robinhood.android.models.portfolio.SelectedPositionsDisplayOption;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PositionsDisplayOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/positions/display/PositionsDisplayOptionsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$onStart$2$1", m3645f = "PositionsDisplayOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.portfolio.positions.display.PositionsDisplayOptionsDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PositionsDisplayOptionsDuxo2 extends ContinuationImpl7 implements Function2<PositionsDisplayOptionsDataState, Continuation<? super PositionsDisplayOptionsDataState>, Object> {
    final /* synthetic */ SelectedPositionsDisplayOption $selectedDisplayOption;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionsDisplayOptionsDuxo2(SelectedPositionsDisplayOption selectedPositionsDisplayOption, Continuation<? super PositionsDisplayOptionsDuxo2> continuation) {
        super(2, continuation);
        this.$selectedDisplayOption = selectedPositionsDisplayOption;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PositionsDisplayOptionsDuxo2 positionsDisplayOptionsDuxo2 = new PositionsDisplayOptionsDuxo2(this.$selectedDisplayOption, continuation);
        positionsDisplayOptionsDuxo2.L$0 = obj;
        return positionsDisplayOptionsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PositionsDisplayOptionsDataState positionsDisplayOptionsDataState, Continuation<? super PositionsDisplayOptionsDataState> continuation) {
        return ((PositionsDisplayOptionsDuxo2) create(positionsDisplayOptionsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PositionsDisplayOptionsDataState positionsDisplayOptionsDataState = (PositionsDisplayOptionsDataState) this.L$0;
        SelectedPositionsDisplayOption selectedPositionsDisplayOption = this.$selectedDisplayOption;
        return PositionsDisplayOptionsDataState.copy$default(positionsDisplayOptionsDataState, selectedPositionsDisplayOption != null ? selectedPositionsDisplayOption.getDisplayOption() : null, null, null, 6, null);
    }
}
