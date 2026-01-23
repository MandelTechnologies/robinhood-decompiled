package com.robinhood.android.transfers.p271ui.max.accounts;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.ApiTransferAccountsResponse;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount6;
import com.robinhood.transfers.api.TransferType;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Produce4;

/* compiled from: TransferAccountsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.accounts.TransferAccountsDuxo$onStart$accountDataObservable$4", m3645f = "TransferAccountsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, 144}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes9.dex */
final class TransferAccountsDuxo$onStart$accountDataObservable$4 extends ContinuationImpl7 implements Function2<Produce4<? super List<? extends TransferAccount>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransferAccountsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferAccountsDuxo$onStart$accountDataObservable$4(TransferAccountsDuxo transferAccountsDuxo, Continuation<? super TransferAccountsDuxo$onStart$accountDataObservable$4> continuation) {
        super(2, continuation);
        this.this$0 = transferAccountsDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransferAccountsDuxo$onStart$accountDataObservable$4 transferAccountsDuxo$onStart$accountDataObservable$4 = new TransferAccountsDuxo$onStart$accountDataObservable$4(this.this$0, continuation);
        transferAccountsDuxo$onStart$accountDataObservable$4.L$0 = obj;
        return transferAccountsDuxo$onStart$accountDataObservable$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Produce4<? super List<? extends TransferAccount>> produce4, Continuation<? super Unit> continuation) {
        return invoke2((Produce4<? super List<TransferAccount>>) produce4, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Produce4<? super List<TransferAccount>> produce4, Continuation<? super Unit> continuation) {
        return ((TransferAccountsDuxo$onStart$accountDataObservable$4) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
    
        if (r1.send(r12, r11) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Produce4 produce4;
        TransferAccountsDuxo$onStart$accountDataObservable$4 transferAccountsDuxo$onStart$accountDataObservable$4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            produce4 = (Produce4) this.L$0;
            TransfersBonfireApi transfersBonfireApi = this.this$0.transfersBonfireApi;
            TransferType transferType = TransferType.OUTGOING_WIRE;
            this.L$0 = produce4;
            this.label = 1;
            transferAccountsDuxo$onStart$accountDataObservable$4 = this;
            obj = TransfersBonfireApi.DefaultImpls.getTransferAccounts$default(transfersBonfireApi, false, null, transferType, transferAccountsDuxo$onStart$accountDataObservable$4, 3, null);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        produce4 = (Produce4) this.L$0;
        ResultKt.throwOnFailure(obj);
        transferAccountsDuxo$onStart$accountDataObservable$4 = this;
        List<ApiTransferAccount> results = ((ApiTransferAccountsResponse) obj).getResults();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : results) {
            if (((ApiTransferAccount) obj2).getType() == ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(TransferAccount6.toDbModel((ApiTransferAccount) it.next()));
        }
        transferAccountsDuxo$onStart$accountDataObservable$4.L$0 = null;
        transferAccountsDuxo$onStart$accountDataObservable$4.label = 2;
    }
}
