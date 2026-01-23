package com.robinhood.librobinhood.data.store.fee;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo3;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import nummus.p512v1.UserFeeTierResponseDto;
import retrofit2.Response;

/* compiled from: CryptoFeeTierStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore$getCryptoFeeTierInfo$3", m3645f = "CryptoFeeTierStore.kt", m3646l = {69}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore$getCryptoFeeTierInfo$3, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoFeeTierStore5 extends ContinuationImpl7 implements Function1<Continuation<? super Result<? extends CryptoFeeTierInfo>>, Object> {
    int label;
    final /* synthetic */ CryptoFeeTierStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoFeeTierStore5(CryptoFeeTierStore cryptoFeeTierStore, Continuation<? super CryptoFeeTierStore5> continuation) {
        super(1, continuation);
        this.this$0 = cryptoFeeTierStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CryptoFeeTierStore5(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Result<? extends CryptoFeeTierInfo>> continuation) {
        return invoke2((Continuation<? super Result<CryptoFeeTierInfo>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super Result<CryptoFeeTierInfo>> continuation) {
        return ((CryptoFeeTierStore5) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object objM28550constructorimpl;
        Object objBody;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Endpoint endpoint = this.this$0.endpoint;
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Result.Companion companion = Result.INSTANCE;
            objBody = ((Response) obj).body();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (objBody == null) {
            throw new IllegalStateException("Required value was null.");
        }
        objM28550constructorimpl = Result.m28550constructorimpl(CryptoFeeTierInfo3.getDbModel((UserFeeTierResponseDto) objBody));
        return Result.m28549boximpl(objM28550constructorimpl);
    }
}
