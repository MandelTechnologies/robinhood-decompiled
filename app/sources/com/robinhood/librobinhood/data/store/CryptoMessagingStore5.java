package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.CryptoMessagingStore;
import com.robinhood.models.api.ApiCryptoSduiMessageScreen;
import com.robinhood.models.api.retrofit.CryptoBonfireApi;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoMessagingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiCryptoSduiMessageScreen;", "request", "Lcom/robinhood/librobinhood/data/store/CryptoMessagingStore$MessagingRequestData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoMessagingStore$fetchMessagingEndpoint$1", m3645f = "CryptoMessagingStore.kt", m3646l = {34}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.CryptoMessagingStore$fetchMessagingEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoMessagingStore5 extends ContinuationImpl7 implements Function2<CryptoMessagingStore.MessagingRequestData, Continuation<? super ApiCryptoSduiMessageScreen>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoMessagingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoMessagingStore5(CryptoMessagingStore cryptoMessagingStore, Continuation<? super CryptoMessagingStore5> continuation) {
        super(2, continuation);
        this.this$0 = cryptoMessagingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoMessagingStore5 cryptoMessagingStore5 = new CryptoMessagingStore5(this.this$0, continuation);
        cryptoMessagingStore5.L$0 = obj;
        return cryptoMessagingStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoMessagingStore.MessagingRequestData messagingRequestData, Continuation<? super ApiCryptoSduiMessageScreen> continuation) {
        return ((CryptoMessagingStore5) create(messagingRequestData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        CryptoMessagingStore5 cryptoMessagingStore5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoMessagingStore.MessagingRequestData messagingRequestData = (CryptoMessagingStore.MessagingRequestData) this.L$0;
            CryptoBonfireApi cryptoBonfireApi = this.this$0.cryptoBonfireApi;
            ApiCryptoSduiMessageScreen.TouchPoint touchPoint = messagingRequestData.getTouchPoint();
            UUID currencyPairId = messagingRequestData.getCurrencyPairId();
            int viewCount = messagingRequestData.getViewCount();
            int version = messagingRequestData.getVersion();
            this.label = 1;
            cryptoMessagingStore5 = this;
            obj = cryptoBonfireApi.getMessagingForScreen(touchPoint, version, currencyPairId, viewCount, cryptoMessagingStore5);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            cryptoMessagingStore5 = this;
        }
        cryptoMessagingStore5.this$0.checkVersion((ApiCryptoSduiMessageScreen) obj);
        return obj;
    }
}
