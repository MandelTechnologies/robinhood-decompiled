package com.robinhood.android.transfers.p271ui.confirm;

import com.robinhood.models.p320db.AchRelationship;
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
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$onStart$4$1", m3645f = "ConfirmTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ui.confirm.ConfirmTransferDuxo$onStart$4$1, reason: use source file name */
/* loaded from: classes9.dex */
final class ConfirmTransferDuxo8 extends ContinuationImpl7 implements Function2<ConfirmTransferViewState, Continuation<? super ConfirmTransferViewState>, Object> {
    final /* synthetic */ AchRelationship $achRelationship;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmTransferDuxo8(AchRelationship achRelationship, Continuation<? super ConfirmTransferDuxo8> continuation) {
        super(2, continuation);
        this.$achRelationship = achRelationship;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConfirmTransferDuxo8 confirmTransferDuxo8 = new ConfirmTransferDuxo8(this.$achRelationship, continuation);
        confirmTransferDuxo8.L$0 = obj;
        return confirmTransferDuxo8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ConfirmTransferViewState confirmTransferViewState, Continuation<? super ConfirmTransferViewState> continuation) {
        return ((ConfirmTransferDuxo8) create(confirmTransferViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ConfirmTransferViewState.copy$default((ConfirmTransferViewState) this.L$0, false, null, this.$achRelationship, false, false, null, null, null, null, 507, null);
    }
}
