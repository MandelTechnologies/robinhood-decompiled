package com.robinhood.android.transfers;

import com.robinhood.android.transfers.transferhub.TransferHubDuxoExtensions;
import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.transfers.hub.contracts.TransferHubConfigurationManagedService;
import com.robinhood.transfers.hub.contracts.TransferHubItemClickIdentifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TransfersHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.TransfersHubDuxo$onCreate$2$1$2$2$1", m3645f = "TransfersHubDuxo.kt", m3646l = {147}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class TransfersHubDuxo$onCreate$2$1$2$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TransferHubConfigurationManagedService $configService;
    final /* synthetic */ boolean $isInRecurringExtraCashExperiment;
    final /* synthetic */ TransferHubItemClickIdentifier $it;
    final /* synthetic */ TransferAccount $rhsAccount;
    final /* synthetic */ RhyAccount $rhyAccount;
    int label;
    final /* synthetic */ TransfersHubDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransfersHubDuxo$onCreate$2$1$2$2$1(TransfersHubDuxo transfersHubDuxo, TransferHubItemClickIdentifier transferHubItemClickIdentifier, TransferHubConfigurationManagedService transferHubConfigurationManagedService, TransferAccount transferAccount, RhyAccount rhyAccount, boolean z, Continuation<? super TransfersHubDuxo$onCreate$2$1$2$2$1> continuation) {
        super(2, continuation);
        this.this$0 = transfersHubDuxo;
        this.$it = transferHubItemClickIdentifier;
        this.$configService = transferHubConfigurationManagedService;
        this.$rhsAccount = transferAccount;
        this.$rhyAccount = rhyAccount;
        this.$isInRecurringExtraCashExperiment = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransfersHubDuxo$onCreate$2$1$2$2$1(this.this$0, this.$it, this.$configService, this.$rhsAccount, this.$rhyAccount, this.$isInRecurringExtraCashExperiment, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TransfersHubDuxo$onCreate$2$1$2$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TransfersHubDuxo transfersHubDuxo = this.this$0;
            TransferHubItemClickIdentifier transferHubItemClickIdentifier = this.$it;
            TransferHubConfigurationManagedService transferHubConfigurationManagedService = this.$configService;
            TransferAccount transferAccount = this.$rhsAccount;
            RhyAccount rhyAccount = this.$rhyAccount;
            boolean z = this.$isInRecurringExtraCashExperiment;
            this.label = 1;
            if (TransferHubDuxoExtensions.mapEvent(transfersHubDuxo, transferHubItemClickIdentifier, transferHubConfigurationManagedService, transferAccount, rhyAccount, z, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
