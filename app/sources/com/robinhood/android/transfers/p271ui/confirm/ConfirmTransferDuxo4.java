package com.robinhood.android.transfers.p271ui.confirm;

import com.robinhood.models.api.bonfire.ApiConfirmTransferResponse;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage2;
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
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$confirmTransfer$1$3$1", m3645f = "ConfirmTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$confirmTransfer$1$3$1, reason: use source file name */
/* loaded from: classes9.dex */
final class ConfirmTransferDuxo4 extends ContinuationImpl7 implements Function2<ConfirmTransferViewState, Continuation<? super ConfirmTransferViewState>, Object> {
    final /* synthetic */ ApiConfirmTransferResponse $response;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConfirmTransferDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmTransferDuxo4(ApiConfirmTransferResponse apiConfirmTransferResponse, ConfirmTransferDuxo confirmTransferDuxo, Continuation<? super ConfirmTransferDuxo4> continuation) {
        super(2, continuation);
        this.$response = apiConfirmTransferResponse;
        this.this$0 = confirmTransferDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConfirmTransferDuxo4 confirmTransferDuxo4 = new ConfirmTransferDuxo4(this.$response, this.this$0, continuation);
        confirmTransferDuxo4.L$0 = obj;
        return confirmTransferDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ConfirmTransferViewState confirmTransferViewState, Continuation<? super ConfirmTransferViewState> continuation) {
        return ((ConfirmTransferDuxo4) create(confirmTransferViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ConfirmTransferViewState confirmTransferViewState = (ConfirmTransferViewState) this.L$0;
        ApiPostTransferPage.Timeline transfer_timeline = this.$response.getTransfer_timeline();
        if (transfer_timeline != null) {
            return ConfirmTransferViewState.copy$default(confirmTransferViewState, false, null, null, false, false, new UiEvent(UiPostTransferPage2.toUiModel(transfer_timeline)), null, null, null, 471, null);
        }
        return ConfirmTransferViewState.copy$default(confirmTransferViewState, false, null, null, false, false, null, new UiEvent(this.this$0.transferId), null, null, 439, null);
    }
}
