package com.robinhood.android.history.p153ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.p320db.bonfire.PaymentTransfer;
import com.robinhood.transfers.api.ApiManagedAccountTransferDetails;
import com.robinhood.transfers.api.ApiPaymentTransfer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AchTransferDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.history.ui.AchTransferDetailDuxo$onResume$3$3", m3645f = "AchTransferDetailDuxo.kt", m3646l = {108}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.history.ui.AchTransferDetailDuxo$onResume$3$3, reason: use source file name */
/* loaded from: classes10.dex */
final class AchTransferDetailDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentTransfer $paymentTransfer;
    int label;
    final /* synthetic */ AchTransferDetailDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AchTransferDetailDuxo2(AchTransferDetailDuxo achTransferDetailDuxo, PaymentTransfer paymentTransfer, Continuation<? super AchTransferDetailDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = achTransferDetailDuxo;
        this.$paymentTransfer = paymentTransfer;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AchTransferDetailDuxo2(this.this$0, this.$paymentTransfer, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AchTransferDetailDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TransfersBonfireApi transfersBonfireApi = this.this$0.transfersBonfireApi;
            UUID id = this.$paymentTransfer.getId();
            this.label = 1;
            obj = transfersBonfireApi.getPaymentTransfer(id, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        final ApiManagedAccountTransferDetails managed_account_transfer_details = ((ApiPaymentTransfer) obj).getManaged_account_transfer_details();
        this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.AchTransferDetailDuxo$onResume$3$3$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AchTransferDetailDuxo2.invokeSuspend$lambda$0(managed_account_transfer_details, (AchTransferDetailViewState) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AchTransferDetailViewState invokeSuspend$lambda$0(ApiManagedAccountTransferDetails apiManagedAccountTransferDetails, AchTransferDetailViewState achTransferDetailViewState) {
        return AchTransferDetailViewState.copy$default(achTransferDetailViewState, null, null, null, null, null, null, null, apiManagedAccountTransferDetails, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }
}
