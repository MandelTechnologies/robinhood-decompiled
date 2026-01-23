package com.robinhood.librobinhood.data.store;

import com.robinhood.g11n.iso.RegionCode;
import com.robinhood.models.api.ApiCurrencyPair;
import com.robinhood.models.api.retrofit.NummusApi;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CurrencyPairV2Store.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCurrencyPair;", "it", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CurrencyPairV2Store$getCurrencyPairEndpoint$1", m3645f = "CurrencyPairV2Store.kt", m3646l = {53, 55}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CurrencyPairV2Store$getCurrencyPairEndpoint$1, reason: use source file name */
/* loaded from: classes20.dex */
final class CurrencyPairV2Store2 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super ApiCurrencyPair>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CurrencyPairV2Store this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurrencyPairV2Store2(CurrencyPairV2Store currencyPairV2Store, Continuation<? super CurrencyPairV2Store2> continuation) {
        super(2, continuation);
        this.this$0 = currencyPairV2Store;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CurrencyPairV2Store2 currencyPairV2Store2 = new CurrencyPairV2Store2(this.this$0, continuation);
        currencyPairV2Store2.L$0 = obj;
        return currencyPairV2Store2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiCurrencyPair> continuation) {
        return ((CurrencyPairV2Store2) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r5 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r5 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return (ApiCurrencyPair) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (ApiCurrencyPair) obj;
        }
        ResultKt.throwOnFailure(obj);
        UUID uuid = (UUID) this.L$0;
        if (this.this$0.authManager.isLoggedIn()) {
            NummusApi nummusApi = this.this$0.nummus;
            this.label = 1;
            obj = nummusApi.getCurrencyPair(uuid, this);
        } else {
            NummusApi nummusApi2 = this.this$0.nummus;
            RegionCode regionCode = RegionCode.f5251EU;
            this.label = 2;
            obj = nummusApi2.getCurrencyPairAnonymous(regionCode, uuid, this);
        }
        return coroutine_suspended;
    }
}
