package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.p314db.CryptoNewsfeed;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoNewsfeedStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/models/crypto/db/CryptoNewsfeed;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoNewsfeedStore$cryptoNewsfeedEndpoint$2", m3645f = "CryptoNewsfeedStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoNewsfeedStore$cryptoNewsfeedEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoNewsfeedStore3 extends ContinuationImpl7 implements Function2<List<? extends CryptoNewsfeed>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoNewsfeedStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoNewsfeedStore3(CryptoNewsfeedStore cryptoNewsfeedStore, Continuation<? super CryptoNewsfeedStore3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoNewsfeedStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoNewsfeedStore3 cryptoNewsfeedStore3 = new CryptoNewsfeedStore3(this.this$0, continuation);
        cryptoNewsfeedStore3.L$0 = obj;
        return cryptoNewsfeedStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends CryptoNewsfeed> list, Continuation<? super Unit> continuation) {
        return invoke2((List<CryptoNewsfeed>) list, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<CryptoNewsfeed> list, Continuation<? super Unit> continuation) {
        return ((CryptoNewsfeedStore3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dao.insert((Iterable) this.L$0);
        return Unit.INSTANCE;
    }
}
