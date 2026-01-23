package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.rewards.ApiCryptoClawbackDetails;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoClawbackStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/rewards/ApiCryptoClawbackDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoClawbackStore$endpoint$2", m3645f = "CryptoClawbackStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoClawbackStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoClawbackStore3 extends ContinuationImpl7 implements Function2<Optional<? extends ApiCryptoClawbackDetails>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoClawbackStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoClawbackStore3(CryptoClawbackStore cryptoClawbackStore, Continuation<? super CryptoClawbackStore3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoClawbackStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoClawbackStore3 cryptoClawbackStore3 = new CryptoClawbackStore3(this.this$0, continuation);
        cryptoClawbackStore3.L$0 = obj;
        return cryptoClawbackStore3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Optional<ApiCryptoClawbackDetails> optional, Continuation<? super Unit> continuation) {
        return ((CryptoClawbackStore3) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Optional<? extends ApiCryptoClawbackDetails> optional, Continuation<? super Unit> continuation) {
        return invoke2((Optional<ApiCryptoClawbackDetails>) optional, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiCryptoClawbackDetails apiCryptoClawbackDetails = (ApiCryptoClawbackDetails) ((Optional) this.L$0).component1();
        if (apiCryptoClawbackDetails != null) {
            this.this$0.saveToDb(apiCryptoClawbackDetails);
        }
        return Unit.INSTANCE;
    }
}
