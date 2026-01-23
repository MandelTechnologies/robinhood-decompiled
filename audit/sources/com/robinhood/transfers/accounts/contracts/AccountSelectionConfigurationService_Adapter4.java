package com.robinhood.transfers.accounts.contracts;

import com.robinhood.transfers.accounts.contracts.AccountSelectionConfigurationService_Adapter;
import com.robinhood.transfers.accounts.contracts.model.TransferAccountSelectionLoadConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountSelectionConfigurationService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionConfigurationService_Adapter$Endpoint_setOnLoadConfiguration$Arguments;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.transfers.accounts.contracts.AccountSelectionConfigurationService_Adapter$Endpoint_setOnLoadConfiguration$call$1", m3645f = "AccountSelectionConfigurationService_Adapter.kt", m3646l = {58}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.transfers.accounts.contracts.AccountSelectionConfigurationService_Adapter$Endpoint_setOnLoadConfiguration$call$1, reason: use source file name */
/* loaded from: classes12.dex */
final class AccountSelectionConfigurationService_Adapter4 extends ContinuationImpl7 implements Function2<AccountSelectionConfigurationService_Adapter.Endpoint_setOnLoadConfiguration.Arguments, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AccountSelectionConfigurationService_Adapter.Endpoint_setOnLoadConfiguration this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSelectionConfigurationService_Adapter4(AccountSelectionConfigurationService_Adapter.Endpoint_setOnLoadConfiguration endpoint_setOnLoadConfiguration, Continuation<? super AccountSelectionConfigurationService_Adapter4> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_setOnLoadConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountSelectionConfigurationService_Adapter4 accountSelectionConfigurationService_Adapter4 = new AccountSelectionConfigurationService_Adapter4(this.this$0, continuation);
        accountSelectionConfigurationService_Adapter4.L$0 = obj;
        return accountSelectionConfigurationService_Adapter4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountSelectionConfigurationService_Adapter.Endpoint_setOnLoadConfiguration.Arguments arguments, Continuation<? super Unit> continuation) {
        return ((AccountSelectionConfigurationService_Adapter4) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AccountSelectionConfigurationService_Adapter.Endpoint_setOnLoadConfiguration.Arguments arguments = (AccountSelectionConfigurationService_Adapter.Endpoint_setOnLoadConfiguration.Arguments) this.L$0;
            AccountSelectionConfigurationService accountSelectionConfigurationService = this.this$0.service;
            TransferAccountSelectionLoadConfiguration config = arguments.getConfig();
            this.label = 1;
            if (accountSelectionConfigurationService.setOnLoadConfiguration(config, this) == coroutine_suspended) {
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
