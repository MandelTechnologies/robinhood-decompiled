package com.robinhood.shared.transfers.store.cryptocheckout;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.api.bonfire.transfer.ApiTransferAction;
import com.robinhood.transfers.api.ApiPaymentTransfer;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BillingCryptoOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderStore$set3DSecureComplete$1$1", m3645f = "BillingCryptoOrderStore.kt", m3646l = {83}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderStore$set3DSecureComplete$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class BillingCryptoOrderStore3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $it;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BillingCryptoOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BillingCryptoOrderStore3(BillingCryptoOrderStore billingCryptoOrderStore, UUID uuid, Continuation<? super BillingCryptoOrderStore3> continuation) {
        super(2, continuation);
        this.this$0 = billingCryptoOrderStore;
        this.$it = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BillingCryptoOrderStore3 billingCryptoOrderStore3 = new BillingCryptoOrderStore3(this.this$0, this.$it, continuation);
        billingCryptoOrderStore3.L$0 = obj;
        return billingCryptoOrderStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BillingCryptoOrderStore3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objM28550constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BillingCryptoOrderStore billingCryptoOrderStore = this.this$0;
                UUID uuid = this.$it;
                Result.Companion companion = Result.INSTANCE;
                TransfersBonfireApi transfersBonfireApi = billingCryptoOrderStore.transfersBonfireApi;
                ApiTransferAction apiTransferAction = new ApiTransferAction("transfer_update_3ds");
                this.label = 1;
                obj = transfersBonfireApi.postPaymentTransferAction(uuid, apiTransferAction, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((ApiPaymentTransfer) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null && !Throwables.isNetworkRelated(thM28553exceptionOrNullimpl)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, thM28553exceptionOrNullimpl, false, null, 6, null);
        }
        return Unit.INSTANCE;
    }
}
