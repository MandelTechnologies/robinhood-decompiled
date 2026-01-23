package com.robinhood.android.transfers.ach.p265ui.posttransfer;

import com.robinhood.android.transfers.ach.p265ui.posttransfer.AchTransferInstantDepositViewState;
import com.robinhood.models.p320db.Account;
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
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferInstantDepositDuxo$onResume$2$1", m3645f = "AchTransferInstantDepositDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.ach.ui.posttransfer.AchTransferInstantDepositDuxo$onResume$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class AchTransferInstantDepositDuxo3 extends ContinuationImpl7 implements Function2<AchTransferInstantDepositViewState, Continuation<? super AchTransferInstantDepositViewState>, Object> {
    final /* synthetic */ Account $account;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AchTransferInstantDepositDuxo3(Account account, Continuation<? super AchTransferInstantDepositDuxo3> continuation) {
        super(2, continuation);
        this.$account = account;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AchTransferInstantDepositDuxo3 achTransferInstantDepositDuxo3 = new AchTransferInstantDepositDuxo3(this.$account, continuation);
        achTransferInstantDepositDuxo3.L$0 = obj;
        return achTransferInstantDepositDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AchTransferInstantDepositViewState achTransferInstantDepositViewState, Continuation<? super AchTransferInstantDepositViewState> continuation) {
        return ((AchTransferInstantDepositDuxo3) create(achTransferInstantDepositViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AchTransferInstantDepositViewState achTransferInstantDepositViewState = (AchTransferInstantDepositViewState) this.L$0;
        if (!(achTransferInstantDepositViewState instanceof AchTransferInstantDepositViewState.Loaded)) {
            return achTransferInstantDepositViewState;
        }
        AchTransferInstantDepositViewState.Loaded loaded = (AchTransferInstantDepositViewState.Loaded) achTransferInstantDepositViewState;
        return AchTransferInstantDepositViewState.Loaded.copy$default(loaded, this.$account, loaded.getAccount$feature_legacy_ach_transfers_externalDebug(), null, null, 12, null);
    }
}
