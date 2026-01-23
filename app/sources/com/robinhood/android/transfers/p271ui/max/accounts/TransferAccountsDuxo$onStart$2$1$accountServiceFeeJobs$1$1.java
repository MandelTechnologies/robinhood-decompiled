package com.robinhood.android.transfers.p271ui.max.accounts;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionKey;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccountAdditionalData;
import com.robinhood.transfers.api.TransferType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TransferAccountsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$onStart$2$1$accountServiceFeeJobs$1$1", m3645f = "TransferAccountsDuxo.kt", m3646l = {202}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class TransferAccountsDuxo$onStart$2$1$accountServiceFeeJobs$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Tuples2<? extends TransferAccount, ? extends ApiServiceFeeParams>>, Object> {
    final /* synthetic */ TransferAccount $account;
    Object L$0;
    int label;
    final /* synthetic */ TransferAccountsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferAccountsDuxo$onStart$2$1$accountServiceFeeJobs$1$1(TransferAccount transferAccount, TransferAccountsDuxo transferAccountsDuxo, Continuation<? super TransferAccountsDuxo$onStart$2$1$accountServiceFeeJobs$1$1> continuation) {
        super(2, continuation);
        this.$account = transferAccount;
        this.this$0 = transferAccountsDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransferAccountsDuxo$onStart$2$1$accountServiceFeeJobs$1$1(this.$account, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Tuples2<? extends TransferAccount, ? extends ApiServiceFeeParams>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Tuples2<TransferAccount, ApiServiceFeeParams>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Tuples2<TransferAccount, ApiServiceFeeParams>> continuation) {
        return ((TransferAccountsDuxo$onStart$2$1$accountServiceFeeJobs$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        TransferAccount transferAccount;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$account.getType() != ApiTransferAccount.TransferAccountType.DEBIT_CARD) {
                    TransferAccountAdditionalData additionalData = this.$account.getAdditionalData();
                    if (!(additionalData != null ? Intrinsics.areEqual(additionalData.isInstantWithdrawalsEligible(), boxing.boxBoolean(true)) : false)) {
                        return new Tuples2(this.$account, null);
                    }
                }
                TransferAccount transferAccount2 = this.$account;
                TransfersBonfireApi transfersBonfireApi = this.this$0.transfersBonfireApi;
                TransferType apiMatchaSpecificRhyTransferType = TransferAccountsDuxoKt.toApiMatchaSpecificRhyTransferType(this.$account.getType());
                TransferAccount transactingAccount = ((TransferAccountSelectionKey) TransferAccountsDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getTransactingAccount();
                ApiTransferAccount.TransferAccountType type2 = transactingAccount != null ? transactingAccount.getType() : null;
                ApiTransferAccount.TransferAccountType type3 = this.$account.getType();
                this.L$0 = transferAccount2;
                this.label = 1;
                Object serviceFeeParams = transfersBonfireApi.getServiceFeeParams(apiMatchaSpecificRhyTransferType, type2, type3, this);
                if (serviceFeeParams == coroutine_suspended) {
                    return coroutine_suspended;
                }
                transferAccount = transferAccount2;
                obj = serviceFeeParams;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                transferAccount = (TransferAccount) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return new Tuples2(transferAccount, obj);
        } catch (Exception unused) {
            return null;
        }
    }
}
