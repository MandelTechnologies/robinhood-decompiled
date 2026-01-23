package com.robinhood.android.equities.taxlots;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SelectLotsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$onCreate$1$1$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$onCreate$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class SelectLotsDuxo2 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
    final /* synthetic */ int $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectLotsDuxo2(int i, Continuation<? super SelectLotsDuxo2> continuation) {
        super(2, continuation);
        this.$it = i;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SelectLotsDuxo2 selectLotsDuxo2 = new SelectLotsDuxo2(this.$it, continuation);
        selectLotsDuxo2.L$0 = obj;
        return selectLotsDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
        return ((SelectLotsDuxo2) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return SelectLotsDataState.copy$default((SelectLotsDataState) this.L$0, null, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, this.$it, 134217727, null);
    }
}
