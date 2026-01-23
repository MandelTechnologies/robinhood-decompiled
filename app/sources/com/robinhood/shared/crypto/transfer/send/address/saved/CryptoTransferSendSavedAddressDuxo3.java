package com.robinhood.shared.crypto.transfer.send.address.saved;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.transfer.ApiSavedAddresses;
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
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: CryptoTransferSendSavedAddressDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/models/api/transfer/ApiSavedAddresses;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$fetchAddressLists$2", m3645f = "CryptoTransferSendSavedAddressDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferSendSavedAddressDuxo$fetchAddressLists$2, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoTransferSendSavedAddressDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends ApiSavedAddresses>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoTransferSendSavedAddressDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTransferSendSavedAddressDuxo3(CryptoTransferSendSavedAddressDuxo cryptoTransferSendSavedAddressDuxo, Continuation<? super CryptoTransferSendSavedAddressDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoTransferSendSavedAddressDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoTransferSendSavedAddressDuxo3 cryptoTransferSendSavedAddressDuxo3 = new CryptoTransferSendSavedAddressDuxo3(this.this$0, continuation);
        cryptoTransferSendSavedAddressDuxo3.L$0 = obj;
        return cryptoTransferSendSavedAddressDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ApiSavedAddresses>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<ApiSavedAddresses>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ApiSavedAddresses>> continuation) {
        return ((CryptoTransferSendSavedAddressDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        List listListOf = CollectionsKt.listOf((Object[]) new Deferred[]{BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CryptoTransferSendSavedAddressDuxo5(this.this$0, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CryptoTransferSendSavedAddressDuxo4(this.this$0, null), 3, null)});
        this.label = 1;
        Object objAwaitAll = Await2.awaitAll(listListOf, this);
        return objAwaitAll == coroutine_suspended ? coroutine_suspended : objAwaitAll;
    }
}
