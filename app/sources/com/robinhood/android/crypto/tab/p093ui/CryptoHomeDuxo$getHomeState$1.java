package com.robinhood.android.crypto.tab.p093ui;

import com.robinhood.models.crypto.p314db.home.CryptoHomeState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoHomeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/home/CryptoHomeState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$getHomeState$1", m3645f = "CryptoHomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CryptoHomeDuxo$getHomeState$1 extends ContinuationImpl7 implements Function2<CryptoHomeState, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoHomeDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHomeDuxo$getHomeState$1(CryptoHomeDuxo cryptoHomeDuxo, Continuation<? super CryptoHomeDuxo$getHomeState$1> continuation) {
        super(2, continuation);
        this.this$0 = cryptoHomeDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoHomeDuxo$getHomeState$1 cryptoHomeDuxo$getHomeState$1 = new CryptoHomeDuxo$getHomeState$1(this.this$0, continuation);
        cryptoHomeDuxo$getHomeState$1.L$0 = obj;
        return cryptoHomeDuxo$getHomeState$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoHomeState cryptoHomeState, Continuation<? super Unit> continuation) {
        return ((CryptoHomeDuxo$getHomeState$1) create(cryptoHomeState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: CryptoHomeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$getHomeState$1$1", m3645f = "CryptoHomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$getHomeState$1$1 */
    static final class C130361 extends ContinuationImpl7 implements Function2<CryptoHomeDataState, Continuation<? super CryptoHomeDataState>, Object> {
        final /* synthetic */ CryptoHomeState $it;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C130361(CryptoHomeState cryptoHomeState, Continuation<? super C130361> continuation) {
            super(2, continuation);
            this.$it = cryptoHomeState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C130361 c130361 = new C130361(this.$it, continuation);
            c130361.L$0 = obj;
            return c130361;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoHomeDataState cryptoHomeDataState, Continuation<? super CryptoHomeDataState> continuation) {
            return ((C130361) create(cryptoHomeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoHomeDataState.copy$default((CryptoHomeDataState) this.L$0, this.$it.getAccountNumber(), null, null, null, null, null, null, false, null, false, null, false, false, 8190, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.applyMutation(new C130361((CryptoHomeState) this.L$0, null));
        return Unit.INSTANCE;
    }
}
