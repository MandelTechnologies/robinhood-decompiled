package com.robinhood.librobinhood.data.store;

import com.robinhood.models.crypto.p314db.explore.CryptoExploreCategories;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoExploreCategoryStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoExploreCategoryStore$cryptoExploreCategoryEndpoint$2", m3645f = "CryptoExploreCategoryStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoExploreCategoryStore$cryptoExploreCategoryEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoExploreCategoryStore3 extends ContinuationImpl7 implements Function2<CryptoExploreCategories, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoExploreCategoryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoExploreCategoryStore3(CryptoExploreCategoryStore cryptoExploreCategoryStore, Continuation<? super CryptoExploreCategoryStore3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoExploreCategoryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoExploreCategoryStore3 cryptoExploreCategoryStore3 = new CryptoExploreCategoryStore3(this.this$0, continuation);
        cryptoExploreCategoryStore3.L$0 = obj;
        return cryptoExploreCategoryStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoExploreCategories cryptoExploreCategories, Continuation<? super Unit> continuation) {
        return ((CryptoExploreCategoryStore3) create(cryptoExploreCategories, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dao.insert((CryptoExploreCategories) this.L$0);
        return Unit.INSTANCE;
    }
}
