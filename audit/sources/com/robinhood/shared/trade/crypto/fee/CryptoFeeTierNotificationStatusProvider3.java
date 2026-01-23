package com.robinhood.shared.trade.crypto.fee;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: CryptoFeeTierNotificationStatusProvider.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.fee.CryptoFeeTierNotificationStatusProvider$canSkipNotificationPrompt$2$1", m3645f = "CryptoFeeTierNotificationStatusProvider.kt", m3646l = {61, 62, 63}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.fee.CryptoFeeTierNotificationStatusProvider$canSkipNotificationPrompt$2$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoFeeTierNotificationStatusProvider3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ CryptoFeeTierNotificationStatusProvider $this_runCatching;
    private /* synthetic */ Object L$0;
    Object L$1;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoFeeTierNotificationStatusProvider3(CryptoFeeTierNotificationStatusProvider cryptoFeeTierNotificationStatusProvider, Continuation<? super CryptoFeeTierNotificationStatusProvider3> continuation) {
        super(2, continuation);
        this.$this_runCatching = cryptoFeeTierNotificationStatusProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoFeeTierNotificationStatusProvider3 cryptoFeeTierNotificationStatusProvider3 = new CryptoFeeTierNotificationStatusProvider3(this.$this_runCatching, continuation);
        cryptoFeeTierNotificationStatusProvider3.L$0 = obj;
        return cryptoFeeTierNotificationStatusProvider3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Boolean>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Boolean>> continuation) {
        return ((CryptoFeeTierNotificationStatusProvider3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Deferred deferredAsync$default;
        Deferred deferred;
        Object objAwait;
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z2 = false;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            if (this.$this_runCatching.hasSeenNotificationPrimerInLast7Days()) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m28549boximpl(Result.m28550constructorimpl(boxing.boxBoolean(true)));
            }
            CryptoFeeTierNotificationStatusProvider cryptoFeeTierNotificationStatusProvider = this.$this_runCatching;
            if (cryptoFeeTierNotificationStatusProvider.isNotificationPermissionGranted(cryptoFeeTierNotificationStatusProvider.application)) {
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CryptoFeeTierNotificationStatusProvider5(this.$this_runCatching, null), 3, null);
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CryptoFeeTierNotificationStatusProvider4(this.$this_runCatching, null), 3, null);
                Deferred[] deferredArr = {deferredAsync$default2, deferredAsync$default};
                this.L$0 = deferredAsync$default2;
                this.L$1 = deferredAsync$default;
                this.label = 1;
                if (Await2.awaitAll(deferredArr, this) != coroutine_suspended) {
                    deferred = deferredAsync$default2;
                }
                return coroutine_suspended;
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28549boximpl(Result.m28550constructorimpl(boxing.boxBoolean(false)));
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.Z$0;
                ResultKt.throwOnFailure(obj);
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Result.Companion companion3 = Result.INSTANCE;
                if (z && zBooleanValue) {
                    z2 = true;
                }
                return Result.m28549boximpl(Result.m28550constructorimpl(boxing.boxBoolean(z2)));
            }
            deferredAsync$default = (Deferred) this.L$0;
            ResultKt.throwOnFailure(obj);
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            this.L$0 = null;
            this.Z$0 = zBooleanValue2;
            this.label = 3;
            objAwait = deferredAsync$default.await(this);
            if (objAwait != coroutine_suspended) {
                z = zBooleanValue2;
                obj = objAwait;
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                Result.Companion companion32 = Result.INSTANCE;
                if (z) {
                    z2 = true;
                }
                return Result.m28549boximpl(Result.m28550constructorimpl(boxing.boxBoolean(z2)));
            }
            return coroutine_suspended;
        }
        deferredAsync$default = (Deferred) this.L$1;
        deferred = (Deferred) this.L$0;
        ResultKt.throwOnFailure(obj);
        this.L$0 = deferredAsync$default;
        this.L$1 = null;
        this.label = 2;
        obj = deferred.await(this);
        if (obj != coroutine_suspended) {
            boolean zBooleanValue22 = ((Boolean) obj).booleanValue();
            this.L$0 = null;
            this.Z$0 = zBooleanValue22;
            this.label = 3;
            objAwait = deferredAsync$default.await(this);
            if (objAwait != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }
}
