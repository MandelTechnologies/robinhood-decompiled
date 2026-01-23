package com.robinhood.shared.crypto.messaging;

import com.robinhood.models.api.ApiCryptoSduiMessageScreen;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoSduiMessagingScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.messaging.CryptoSduiMessagingScreenKt$CryptoSduiMessagingScreen$3$1", m3645f = "CryptoSduiMessagingScreen.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.messaging.CryptoSduiMessagingScreenKt$CryptoSduiMessagingScreen$3$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoSduiMessagingScreen4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApiCryptoSduiMessageScreen $data;
    final /* synthetic */ Function1<ApiCryptoSduiMessageScreen, Unit> $onViewScreen;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CryptoSduiMessagingScreen4(Function1<? super ApiCryptoSduiMessageScreen, Unit> function1, ApiCryptoSduiMessageScreen apiCryptoSduiMessageScreen, Continuation<? super CryptoSduiMessagingScreen4> continuation) {
        super(2, continuation);
        this.$onViewScreen = function1;
        this.$data = apiCryptoSduiMessageScreen;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoSduiMessagingScreen4(this.$onViewScreen, this.$data, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoSduiMessagingScreen4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$onViewScreen.invoke(this.$data);
        return Unit.INSTANCE;
    }
}
