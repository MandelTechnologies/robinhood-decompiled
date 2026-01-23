package com.robinhood.android.transfers.p271ui.max.accounts;

import com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanners;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TransferAccountsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$onStart$4$1", m3645f = "TransferAccountsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class TransferAccountsDuxo$onStart$4$1 extends ContinuationImpl7 implements Function2<TransferAccountsViewState, Continuation<? super TransferAccountsViewState>, Object> {
    final /* synthetic */ ApiTransferBanners $transferBanners;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferAccountsDuxo$onStart$4$1(ApiTransferBanners apiTransferBanners, Continuation<? super TransferAccountsDuxo$onStart$4$1> continuation) {
        super(2, continuation);
        this.$transferBanners = apiTransferBanners;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransferAccountsDuxo$onStart$4$1 transferAccountsDuxo$onStart$4$1 = new TransferAccountsDuxo$onStart$4$1(this.$transferBanners, continuation);
        transferAccountsDuxo$onStart$4$1.L$0 = obj;
        return transferAccountsDuxo$onStart$4$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TransferAccountsViewState transferAccountsViewState, Continuation<? super TransferAccountsViewState> continuation) {
        return ((TransferAccountsDuxo$onStart$4$1) create(transferAccountsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return TransferAccountsViewState.copy$default((TransferAccountsViewState) this.L$0, null, false, null, null, false, this.$transferBanners, null, null, false, false, null, null, false, false, null, false, false, false, false, null, null, 2097119, null);
    }
}
