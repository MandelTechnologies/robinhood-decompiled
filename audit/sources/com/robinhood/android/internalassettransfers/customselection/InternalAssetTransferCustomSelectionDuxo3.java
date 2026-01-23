package com.robinhood.android.internalassettransfers.customselection;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InternalAssetTransferCustomSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/customselection/InternalAssetTransferCustomSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onCreate$1$1$1", m3645f = "InternalAssetTransferCustomSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionDuxo$onCreate$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InternalAssetTransferCustomSelectionDuxo3 extends ContinuationImpl7 implements Function2<InternalAssetTransferCustomSelectionDataState, Continuation<? super InternalAssetTransferCustomSelectionDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    InternalAssetTransferCustomSelectionDuxo3(Continuation<? super InternalAssetTransferCustomSelectionDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternalAssetTransferCustomSelectionDuxo3 internalAssetTransferCustomSelectionDuxo3 = new InternalAssetTransferCustomSelectionDuxo3(continuation);
        internalAssetTransferCustomSelectionDuxo3.L$0 = obj;
        return internalAssetTransferCustomSelectionDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InternalAssetTransferCustomSelectionDataState internalAssetTransferCustomSelectionDataState, Continuation<? super InternalAssetTransferCustomSelectionDataState> continuation) {
        return ((InternalAssetTransferCustomSelectionDuxo3) create(internalAssetTransferCustomSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InternalAssetTransferCustomSelectionDataState.copy$default((InternalAssetTransferCustomSelectionDataState) this.L$0, null, null, null, null, true, false, false, null, null, 495, null);
    }
}
