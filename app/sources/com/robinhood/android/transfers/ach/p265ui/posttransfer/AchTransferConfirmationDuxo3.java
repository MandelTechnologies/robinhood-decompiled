package com.robinhood.android.transfers.ach.p265ui.posttransfer;

import com.robinhood.models.p355ui.identi.UiApplication;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AchTransferConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferConfirmationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationDuxo$onResume$2$1", m3645f = "AchTransferConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferConfirmationDuxo$onResume$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class AchTransferConfirmationDuxo3 extends ContinuationImpl7 implements Function2<AchTransferConfirmationViewState, Continuation<? super AchTransferConfirmationViewState>, Object> {
    final /* synthetic */ UiApplication $application;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AchTransferConfirmationDuxo3(UiApplication uiApplication, Continuation<? super AchTransferConfirmationDuxo3> continuation) {
        super(2, continuation);
        this.$application = uiApplication;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AchTransferConfirmationDuxo3 achTransferConfirmationDuxo3 = new AchTransferConfirmationDuxo3(this.$application, continuation);
        achTransferConfirmationDuxo3.L$0 = obj;
        return achTransferConfirmationDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AchTransferConfirmationViewState achTransferConfirmationViewState, Continuation<? super AchTransferConfirmationViewState> continuation) {
        return ((AchTransferConfirmationDuxo3) create(achTransferConfirmationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AchTransferConfirmationViewState.copy$default((AchTransferConfirmationViewState) this.L$0, null, null, null, false, null, false, null, null, null, this.$application.isApproved(), null, false, null, 7679, null);
    }
}
