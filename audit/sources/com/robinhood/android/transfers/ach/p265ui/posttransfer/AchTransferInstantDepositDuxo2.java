package com.robinhood.android.transfers.ach.p265ui.posttransfer;

import com.robinhood.android.transfers.ach.p265ui.posttransfer.AchTransferInstantDepositViewState;
import com.robinhood.models.serverdriven.p347db.RichText;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AchTransferInstantDepositDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ach/ui/posttransfer/AchTransferInstantDepositViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferInstantDepositDuxo$onResume$1$1", m3645f = "AchTransferInstantDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferInstantDepositDuxo$onResume$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class AchTransferInstantDepositDuxo2 extends ContinuationImpl7 implements Function2<AchTransferInstantDepositViewState, Continuation<? super AchTransferInstantDepositViewState>, Object> {
    final /* synthetic */ RichText $instantDepositInfo;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AchTransferInstantDepositDuxo2(RichText richText, Continuation<? super AchTransferInstantDepositDuxo2> continuation) {
        super(2, continuation);
        this.$instantDepositInfo = richText;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AchTransferInstantDepositDuxo2 achTransferInstantDepositDuxo2 = new AchTransferInstantDepositDuxo2(this.$instantDepositInfo, continuation);
        achTransferInstantDepositDuxo2.L$0 = obj;
        return achTransferInstantDepositDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AchTransferInstantDepositViewState achTransferInstantDepositViewState, Continuation<? super AchTransferInstantDepositViewState> continuation) {
        return ((AchTransferInstantDepositDuxo2) create(achTransferInstantDepositViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AchTransferInstantDepositViewState achTransferInstantDepositViewState = (AchTransferInstantDepositViewState) this.L$0;
        return achTransferInstantDepositViewState instanceof AchTransferInstantDepositViewState.Loaded ? AchTransferInstantDepositViewState.Loaded.copy$default((AchTransferInstantDepositViewState.Loaded) achTransferInstantDepositViewState, null, null, null, this.$instantDepositInfo, 7, null) : achTransferInstantDepositViewState;
    }
}
