package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiCryptoStats;
import com.robinhood.models.crypto.p314db.CryptoStats2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoStatsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/ApiCryptoStats;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoStatsStore$cryptoStatsEndpoints$2", m3645f = "CryptoStatsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoStatsStore$cryptoStatsEndpoints$2, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoStatsStore3 extends ContinuationImpl7 implements Function2<ApiCryptoStats, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoStatsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoStatsStore3(CryptoStatsStore cryptoStatsStore, Continuation<? super CryptoStatsStore3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoStatsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoStatsStore3 cryptoStatsStore3 = new CryptoStatsStore3(this.this$0, continuation);
        cryptoStatsStore3.L$0 = obj;
        return cryptoStatsStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiCryptoStats apiCryptoStats, Continuation<? super Unit> continuation) {
        return ((CryptoStatsStore3) create(apiCryptoStats, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dao.insert(CryptoStats2.toDbModel((ApiCryptoStats) this.L$0));
        return Unit.INSTANCE;
    }
}
