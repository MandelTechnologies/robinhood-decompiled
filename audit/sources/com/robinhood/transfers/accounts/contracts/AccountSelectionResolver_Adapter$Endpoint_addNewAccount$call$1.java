package com.robinhood.transfers.accounts.contracts;

import com.robinhood.transfers.accounts.contracts.AccountSelectionResolver_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountSelectionResolver_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "it"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.transfers.accounts.contracts.AccountSelectionResolver_Adapter$Endpoint_addNewAccount$call$1", m3645f = "AccountSelectionResolver_Adapter.kt", m3646l = {125}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AccountSelectionResolver_Adapter$Endpoint_addNewAccount$call$1 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AccountSelectionResolver_Adapter.Endpoint_addNewAccount this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSelectionResolver_Adapter$Endpoint_addNewAccount$call$1(AccountSelectionResolver_Adapter.Endpoint_addNewAccount endpoint_addNewAccount, Continuation<? super AccountSelectionResolver_Adapter$Endpoint_addNewAccount$call$1> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_addNewAccount;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectionResolver_Adapter$Endpoint_addNewAccount$call$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((AccountSelectionResolver_Adapter$Endpoint_addNewAccount$call$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AccountSelectionResolver accountSelectionResolver = this.this$0.service;
            this.label = 1;
            if (accountSelectionResolver.addNewAccount(this) == coroutine_suspended) {
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
