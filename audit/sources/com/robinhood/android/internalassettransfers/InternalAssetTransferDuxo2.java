package com.robinhood.android.internalassettransfers;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InternalAssetTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$onFullTransferSelected$1$1", m3645f = "InternalAssetTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$onFullTransferSelected$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InternalAssetTransferDuxo2 extends ContinuationImpl7 implements Function2<InternalAssetTransferViewState, Continuation<? super InternalAssetTransferViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    InternalAssetTransferDuxo2(Continuation<? super InternalAssetTransferDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InternalAssetTransferDuxo2 internalAssetTransferDuxo2 = new InternalAssetTransferDuxo2(continuation);
        internalAssetTransferDuxo2.L$0 = obj;
        return internalAssetTransferDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InternalAssetTransferViewState internalAssetTransferViewState, Continuation<? super InternalAssetTransferViewState> continuation) {
        return ((InternalAssetTransferDuxo2) create(internalAssetTransferViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return InternalAssetTransferViewState.copy$default((InternalAssetTransferViewState) this.L$0, null, null, null, true, 7, null);
    }
}
