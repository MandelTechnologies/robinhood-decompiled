package com.robinhood.transfers.accounts.contracts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.transfers.accounts.contracts.AccountSelectionResolver_Adapter;
import com.robinhood.transfers.accounts.contracts.model.IraTransferType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountSelectionResolver_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver_Adapter$Endpoint_launchIraQuestionnaire$Arguments;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.transfers.accounts.contracts.AccountSelectionResolver_Adapter$Endpoint_launchIraQuestionnaire$call$1", m3645f = "AccountSelectionResolver_Adapter.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.transfers.accounts.contracts.AccountSelectionResolver_Adapter$Endpoint_launchIraQuestionnaire$call$1 */
/* loaded from: classes12.dex */
final class C41773x496e0736 extends ContinuationImpl7 implements Function2<AccountSelectionResolver_Adapter.Endpoint_launchIraQuestionnaire.Arguments, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AccountSelectionResolver_Adapter.Endpoint_launchIraQuestionnaire this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C41773x496e0736(AccountSelectionResolver_Adapter.Endpoint_launchIraQuestionnaire endpoint_launchIraQuestionnaire, Continuation<? super C41773x496e0736> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_launchIraQuestionnaire;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C41773x496e0736 c41773x496e0736 = new C41773x496e0736(this.this$0, continuation);
        c41773x496e0736.L$0 = obj;
        return c41773x496e0736;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountSelectionResolver_Adapter.Endpoint_launchIraQuestionnaire.Arguments arguments, Continuation<? super Unit> continuation) {
        return ((C41773x496e0736) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AccountSelectionResolver_Adapter.Endpoint_launchIraQuestionnaire.Arguments arguments = (AccountSelectionResolver_Adapter.Endpoint_launchIraQuestionnaire.Arguments) this.L$0;
            AccountSelectionResolver accountSelectionResolver = this.this$0.service;
            IraTransferType iraTransferType = arguments.getIraTransferType();
            String iraId = arguments.getIraId();
            String selectingAccountId = arguments.getSelectingAccountId();
            this.label = 1;
            if (accountSelectionResolver.launchIraQuestionnaire(iraTransferType, iraId, selectingAccountId, this) == coroutine_suspended) {
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
