package com.robinhood.android.transfers.p271ui.confirm;

import com.robinhood.transfers.api.AchTransferRhsState;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ConfirmTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$onStart$1$1", m3645f = "ConfirmTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class ConfirmTransferDuxo6 extends ContinuationImpl7 implements Function2<ConfirmTransferViewState, Continuation<? super ConfirmTransferViewState>, Object> {
    final /* synthetic */ AchTransfer $transfer;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConfirmTransferDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmTransferDuxo6(AchTransfer achTransfer, ConfirmTransferDuxo confirmTransferDuxo, Continuation<? super ConfirmTransferDuxo6> continuation) {
        super(2, continuation);
        this.$transfer = achTransfer;
        this.this$0 = confirmTransferDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConfirmTransferDuxo6 confirmTransferDuxo6 = new ConfirmTransferDuxo6(this.$transfer, this.this$0, continuation);
        confirmTransferDuxo6.L$0 = obj;
        return confirmTransferDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ConfirmTransferViewState confirmTransferViewState, Continuation<? super ConfirmTransferViewState> continuation) {
        return ((ConfirmTransferDuxo6) create(confirmTransferViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ConfirmTransferViewState confirmTransferViewState = (ConfirmTransferViewState) this.L$0;
        if (this.$transfer.getRhsState() == AchTransferRhsState.PENDING_CONFIRMATION) {
            return ConfirmTransferViewState.copy$default(confirmTransferViewState, false, this.$transfer, null, false, false, null, null, null, null, 508, null);
        }
        return ConfirmTransferViewState.copy$default(confirmTransferViewState, false, null, null, false, false, null, new UiEvent(this.this$0.transferId), null, null, 447, null);
    }
}
