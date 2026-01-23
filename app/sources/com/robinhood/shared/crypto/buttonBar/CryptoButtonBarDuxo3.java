package com.robinhood.shared.crypto.buttonBar;

import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.models.crypto.p314db.CryptoAccountInfo;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.shared.crypto.buttonBar.CryptoButtonBarArgs;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CryptoButtonBarDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$onCreate$1$2$2", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {93, 101}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$onCreate$1$2$2, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoButtonBarDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoAccountSwitcherLocation $location;
    int label;
    final /* synthetic */ CryptoButtonBarDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoButtonBarDuxo3(CryptoButtonBarDuxo cryptoButtonBarDuxo, CryptoAccountSwitcherLocation cryptoAccountSwitcherLocation, Continuation<? super CryptoButtonBarDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoButtonBarDuxo;
        this.$location = cryptoAccountSwitcherLocation;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoButtonBarDuxo3(this.this$0, this.$location, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoButtonBarDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r6, r1, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r6, r1, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoButtonBarArgs cryptoButtonBarArgs = this.this$0.args;
            if (cryptoButtonBarArgs instanceof CryptoButtonBarArgs.Home) {
                Flow<CryptoAccountInfo> flowStreamAccountInfo = this.this$0.cryptoAccountProvider.streamAccountInfo(CryptoAccountSwitcherLocation.Home.INSTANCE);
                C376151 c376151 = new C376151(this.this$0, null);
                this.label = 1;
            } else if (cryptoButtonBarArgs instanceof CryptoButtonBarArgs.Crypto) {
                CryptoAccountProvider cryptoAccountProvider = this.this$0.cryptoAccountProvider;
                CryptoAccountSwitcherLocation cryptoAccountSwitcherLocation = this.$location;
                Intrinsics.checkNotNull(cryptoAccountSwitcherLocation, "null cannot be cast to non-null type com.robinhood.models.crypto.db.CryptoAccountSwitcherLocation.WithCurrencyPair");
                Flow<CryptoAccountInfo> flowStreamAccountInfo2 = cryptoAccountProvider.streamAccountInfo((CryptoAccountSwitcherLocation.WithCurrencyPair) cryptoAccountSwitcherLocation);
                C376162 c376162 = new C376162(this.this$0, null);
                this.label = 2;
            } else if (!(cryptoButtonBarArgs instanceof CryptoButtonBarArgs.Perpetuals)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoButtonBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/CryptoAccountInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$onCreate$1$2$2$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$onCreate$1$2$2$1 */
    static final class C376151 extends ContinuationImpl7 implements Function2<CryptoAccountInfo, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CryptoButtonBarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C376151(CryptoButtonBarDuxo cryptoButtonBarDuxo, Continuation<? super C376151> continuation) {
            super(2, continuation);
            this.this$0 = cryptoButtonBarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C376151 c376151 = new C376151(this.this$0, continuation);
            c376151.L$0 = obj;
            return c376151;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoAccountInfo cryptoAccountInfo, Continuation<? super Unit> continuation) {
            return ((C376151) create(cryptoAccountInfo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoButtonBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$onCreate$1$2$2$1$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$onCreate$1$2$2$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoButtonBarDataState, Continuation<? super CryptoButtonBarDataState>, Object> {
            final /* synthetic */ CryptoAccountInfo $it;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoAccountInfo cryptoAccountInfo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$it = cryptoAccountInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoButtonBarDataState cryptoButtonBarDataState, Continuation<? super CryptoButtonBarDataState> continuation) {
                return ((AnonymousClass1) create(cryptoButtonBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoButtonBarDataState.copy$default((CryptoButtonBarDataState) this.L$0, null, null, null, null, null, false, null, null, null, this.$it, 511, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new AnonymousClass1((CryptoAccountInfo) this.L$0, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoButtonBarDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/CryptoAccountInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$onCreate$1$2$2$2", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$onCreate$1$2$2$2 */
    static final class C376162 extends ContinuationImpl7 implements Function2<CryptoAccountInfo, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CryptoButtonBarDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C376162(CryptoButtonBarDuxo cryptoButtonBarDuxo, Continuation<? super C376162> continuation) {
            super(2, continuation);
            this.this$0 = cryptoButtonBarDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C376162 c376162 = new C376162(this.this$0, continuation);
            c376162.L$0 = obj;
            return c376162;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoAccountInfo cryptoAccountInfo, Continuation<? super Unit> continuation) {
            return ((C376162) create(cryptoAccountInfo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoButtonBarDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$onCreate$1$2$2$2$1", m3645f = "CryptoButtonBarDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.buttonBar.CryptoButtonBarDuxo$onCreate$1$2$2$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoButtonBarDataState, Continuation<? super CryptoButtonBarDataState>, Object> {
            final /* synthetic */ CryptoAccountInfo $it;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoAccountInfo cryptoAccountInfo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$it = cryptoAccountInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoButtonBarDataState cryptoButtonBarDataState, Continuation<? super CryptoButtonBarDataState> continuation) {
                return ((AnonymousClass1) create(cryptoButtonBarDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoButtonBarDataState.copy$default((CryptoButtonBarDataState) this.L$0, null, null, null, null, null, false, null, null, null, this.$it, 511, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new AnonymousClass1((CryptoAccountInfo) this.L$0, null));
            return Unit.INSTANCE;
        }
    }
}
