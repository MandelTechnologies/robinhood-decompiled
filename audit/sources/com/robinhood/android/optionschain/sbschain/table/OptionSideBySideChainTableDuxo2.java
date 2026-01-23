package com.robinhood.android.optionschain.sbschain.table;

import com.robinhood.android.optionschain.sbschain.table.gestures.DragTarget;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionSideBySideChainTableDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/optionschain/sbschain/table/OptionSideBySideChainTableDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$bindInitialDragTarget$1", m3645f = "OptionSideBySideChainTableDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableDuxo$bindInitialDragTarget$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionSideBySideChainTableDuxo2 extends ContinuationImpl7 implements Function2<OptionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState>, Object> {
    final /* synthetic */ DragTarget $dragTarget;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionSideBySideChainTableDuxo2(DragTarget dragTarget, Continuation<? super OptionSideBySideChainTableDuxo2> continuation) {
        super(2, continuation);
        this.$dragTarget = dragTarget;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionSideBySideChainTableDuxo2 optionSideBySideChainTableDuxo2 = new OptionSideBySideChainTableDuxo2(this.$dragTarget, continuation);
        optionSideBySideChainTableDuxo2.L$0 = obj;
        return optionSideBySideChainTableDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OptionSideBySideChainTableDataState optionSideBySideChainTableDataState, Continuation<? super OptionSideBySideChainTableDataState> continuation) {
        return ((OptionSideBySideChainTableDuxo2) create(optionSideBySideChainTableDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        OptionSideBySideChainTableDataState optionSideBySideChainTableDataState = (OptionSideBySideChainTableDataState) this.L$0;
        DragTarget dragTarget = this.$dragTarget;
        return optionSideBySideChainTableDataState.copyInitialDragTarget(dragTarget, boxing.boxInt(dragTarget.getDragStartRowIndex()));
    }
}
