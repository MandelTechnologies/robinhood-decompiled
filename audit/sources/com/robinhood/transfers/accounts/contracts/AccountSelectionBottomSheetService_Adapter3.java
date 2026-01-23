package com.robinhood.transfers.accounts.contracts;

import com.robinhood.transfers.accounts.contracts.AccountSelectionBottomSheetService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AccountSelectionBottomSheetService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionBottomSheetService_Adapter$Endpoint_launchBottomSheet$Arguments;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.transfers.accounts.contracts.AccountSelectionBottomSheetService_Adapter$Endpoint_launchBottomSheet$call$1", m3645f = "AccountSelectionBottomSheetService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.transfers.accounts.contracts.AccountSelectionBottomSheetService_Adapter$Endpoint_launchBottomSheet$call$1, reason: use source file name */
/* loaded from: classes12.dex */
final class AccountSelectionBottomSheetService_Adapter3 extends ContinuationImpl7 implements Function2<AccountSelectionBottomSheetService_Adapter.Endpoint_launchBottomSheet.Arguments, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AccountSelectionBottomSheetService_Adapter.Endpoint_launchBottomSheet this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSelectionBottomSheetService_Adapter3(AccountSelectionBottomSheetService_Adapter.Endpoint_launchBottomSheet endpoint_launchBottomSheet, Continuation<? super AccountSelectionBottomSheetService_Adapter3> continuation) {
        super(2, continuation);
        this.this$0 = endpoint_launchBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AccountSelectionBottomSheetService_Adapter3 accountSelectionBottomSheetService_Adapter3 = new AccountSelectionBottomSheetService_Adapter3(this.this$0, continuation);
        accountSelectionBottomSheetService_Adapter3.L$0 = obj;
        return accountSelectionBottomSheetService_Adapter3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AccountSelectionBottomSheetService_Adapter.Endpoint_launchBottomSheet.Arguments arguments, Continuation<? super Unit> continuation) {
        return ((AccountSelectionBottomSheetService_Adapter3) create(arguments, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AccountSelectionBottomSheetService_Adapter.Endpoint_launchBottomSheet.Arguments arguments = (AccountSelectionBottomSheetService_Adapter.Endpoint_launchBottomSheet.Arguments) this.L$0;
            AccountSelectionBottomSheetService accountSelectionBottomSheetService = this.this$0.service;
            AccountSelectionBottomSheetArgs args = arguments.getArgs();
            this.label = 1;
            if (accountSelectionBottomSheetService.launchBottomSheet(args, this) == coroutine_suspended) {
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
