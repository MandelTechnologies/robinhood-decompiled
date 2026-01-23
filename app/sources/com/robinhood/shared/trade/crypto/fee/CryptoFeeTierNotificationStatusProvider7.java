package com.robinhood.shared.trade.crypto.fee;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: CryptoFeeTierNotificationStatusProvider.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.fee.CryptoFeeTierNotificationStatusProvider$optIn$2$1", m3645f = "CryptoFeeTierNotificationStatusProvider.kt", m3646l = {88}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.fee.CryptoFeeTierNotificationStatusProvider$optIn$2$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoFeeTierNotificationStatusProvider7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ CryptoFeeTierNotificationStatusProvider $this_runCatching;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoFeeTierNotificationStatusProvider7(CryptoFeeTierNotificationStatusProvider cryptoFeeTierNotificationStatusProvider, Continuation<? super CryptoFeeTierNotificationStatusProvider7> continuation) {
        super(2, continuation);
        this.$this_runCatching = cryptoFeeTierNotificationStatusProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoFeeTierNotificationStatusProvider7 cryptoFeeTierNotificationStatusProvider7 = new CryptoFeeTierNotificationStatusProvider7(this.$this_runCatching, continuation);
        cryptoFeeTierNotificationStatusProvider7.L$0 = obj;
        return cryptoFeeTierNotificationStatusProvider7;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((CryptoFeeTierNotificationStatusProvider7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred[] deferredArr = {BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CryptoFeeTierNotificationStatusProvider9(this.$this_runCatching, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CryptoFeeTierNotificationStatusProvider8(this.$this_runCatching, null), 3, null)};
            this.label = 1;
            if (Await2.awaitAll(deferredArr, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m28549boximpl(Result.m28550constructorimpl(Unit.INSTANCE));
    }
}
