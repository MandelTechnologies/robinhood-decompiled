package com.robinhood.android.transfers;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubBulkResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.TransferProductType;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LinkingOptionsActivity.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiLimitsHubBulkResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.LinkingOptionsActivity$onCreate$6$1$4", m3645f = "LinkingOptionsActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.transfers.LinkingOptionsActivity$onCreate$6$1$4, reason: use source file name */
/* loaded from: classes9.dex */
final class LinkingOptionsActivity4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiLimitsHubBulkResponse>, Object> {
    int label;
    final /* synthetic */ LinkingOptionsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkingOptionsActivity4(LinkingOptionsActivity linkingOptionsActivity, Continuation<? super LinkingOptionsActivity4> continuation) {
        super(2, continuation);
        this.this$0 = linkingOptionsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LinkingOptionsActivity4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiLimitsHubBulkResponse> continuation) {
        return ((LinkingOptionsActivity4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        TransfersBonfireApi transfersBonfireApi = this.this$0.getTransfersBonfireApi();
        List listListOf = CollectionsKt.listOf(TransferProductType.DEBIT_CARD_FUNDING);
        this.label = 1;
        Object transferLimitsV1$default = TransfersBonfireApi.DefaultImpls.getTransferLimitsV1$default(transfersBonfireApi, null, listListOf, this, 1, null);
        return transferLimitsV1$default == coroutine_suspended ? coroutine_suspended : transferLimitsV1$default;
    }
}
