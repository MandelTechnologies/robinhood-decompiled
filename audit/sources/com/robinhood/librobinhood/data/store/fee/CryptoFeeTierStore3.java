package com.robinhood.librobinhood.data.store.fee;

import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import nummus.p512v1.UserFeeTierResponseDto;
import retrofit2.Response;

/* compiled from: CryptoFeeTierStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lretrofit2/Response;", "Lnummus/v1/UserFeeTierResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore$endpoint$2", m3645f = "CryptoFeeTierStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoFeeTierStore3 extends ContinuationImpl7 implements Function2<Response<UserFeeTierResponseDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoFeeTierStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoFeeTierStore3(CryptoFeeTierStore cryptoFeeTierStore, Continuation<? super CryptoFeeTierStore3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoFeeTierStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoFeeTierStore3 cryptoFeeTierStore3 = new CryptoFeeTierStore3(this.this$0, continuation);
        cryptoFeeTierStore3.L$0 = obj;
        return cryptoFeeTierStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Response<UserFeeTierResponseDto> response, Continuation<? super Unit> continuation) {
        return ((CryptoFeeTierStore3) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UserFeeTierResponseDto userFeeTierResponseDto = (UserFeeTierResponseDto) ((Response) this.L$0).body();
        if (userFeeTierResponseDto != null) {
            this.this$0.cryptoFeeTierInfoDao.insert(CryptoFeeTierInfo3.getDbModel(userFeeTierResponseDto));
        }
        return Unit.INSTANCE;
    }
}
