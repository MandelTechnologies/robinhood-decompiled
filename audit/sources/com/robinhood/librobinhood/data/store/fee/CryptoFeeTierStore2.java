package com.robinhood.librobinhood.data.store.fee;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nummus.p512v1.RestNummusService;
import nummus.p512v1.UserFeeTierRequestDto;
import nummus.p512v1.UserFeeTierResponseDto;
import retrofit2.Response;

/* compiled from: CryptoFeeTierStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lnummus/v1/UserFeeTierResponseDto;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore$endpoint$1", m3645f = "CryptoFeeTierStore.kt", m3646l = {43, 41}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoFeeTierStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Response<UserFeeTierResponseDto>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ CryptoFeeTierStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoFeeTierStore2(CryptoFeeTierStore cryptoFeeTierStore, Continuation<? super CryptoFeeTierStore2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoFeeTierStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoFeeTierStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Response<UserFeeTierResponseDto>> continuation) {
        return ((CryptoFeeTierStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RestNummusService restNummusService;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            restNummusService = this.this$0.nummusService;
            CryptoFeeTierStore cryptoFeeTierStore = this.this$0;
            this.L$0 = restNummusService;
            this.label = 1;
            obj = cryptoFeeTierStore.getCryptoAccountId(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Response responseSuccess = Response.success(obj);
            Intrinsics.checkNotNullExpressionValue(responseSuccess, "success(...)");
            return responseSuccess;
        }
        restNummusService = (RestNummusService) this.L$0;
        ResultKt.throwOnFailure(obj);
        UserFeeTierRequestDto userFeeTierRequestDto = new UserFeeTierRequestDto((String) obj);
        this.L$0 = null;
        this.label = 2;
        obj = restNummusService.UserFeeTier(userFeeTierRequestDto, this);
    }
}
