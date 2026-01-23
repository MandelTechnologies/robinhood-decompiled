package com.robinhood.android.crypto.tab.p093ui.feeTiers;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.fee.CryptoFeeTierPreferencesProvider;
import com.robinhood.librobinhood.data.store.fee.CryptoFeeTierPreferencesProvider2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoHomeFeeTierStatusDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusDataState;", "Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusViewState;", "cryptoFeeTierPreferencesProvider", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferencesProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferencesProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeFeeTierStatusDuxo extends BaseDuxo<CryptoHomeFeeTierStatusDataState, CryptoHomeFeeTierStatusViewState> {
    public static final int $stable = 8;
    private final CryptoExperimentsStore cryptoExperimentsStore;
    private final CryptoFeeTierPreferencesProvider cryptoFeeTierPreferencesProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CryptoHomeFeeTierStatusDuxo(CryptoFeeTierPreferencesProvider cryptoFeeTierPreferencesProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoHomeFeeTierStatusDuxo2 stateProvider, DuxoBundle duxoBundle) {
        super(new CryptoHomeFeeTierStatusDataState(null, 1, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoFeeTierPreferencesProvider, "cryptoFeeTierPreferencesProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cryptoFeeTierPreferencesProvider = cryptoFeeTierPreferencesProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C131421(null));
    }

    /* compiled from: CryptoHomeFeeTierStatusDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusDuxo$onCreate$1", m3645f = "CryptoHomeFeeTierStatusDuxo.kt", m3646l = {34, 38}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusDuxo$onCreate$1 */
    static final class C131421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C131421(Continuation<? super C131421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C131421 c131421 = CryptoHomeFeeTierStatusDuxo.this.new C131421(continuation);
            c131421.L$0 = obj;
            return c131421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C131421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r6, r1, r5) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                Flow<Boolean> flowStreamCryptoVolumeTiersDiscoveryExperiment = CryptoHomeFeeTierStatusDuxo.this.cryptoExperimentsStore.streamCryptoVolumeTiersDiscoveryExperiment();
                this.L$0 = coroutineScope;
                this.label = 1;
                obj = FlowKt.firstOrNull(flowStreamCryptoVolumeTiersDiscoveryExperiment, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (Intrinsics.areEqual(obj, boxing.boxBoolean(true))) {
                Flow<CryptoFeeTierPreferencesProvider2> flowStreamCryptoFeeTierPreferences = CryptoHomeFeeTierStatusDuxo.this.cryptoFeeTierPreferencesProvider.streamCryptoFeeTierPreferences(coroutineScope);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoHomeFeeTierStatusDuxo.this, null);
                this.L$0 = null;
                this.label = 2;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoHomeFeeTierStatusDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferences;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusDuxo$onCreate$1$1", m3645f = "CryptoHomeFeeTierStatusDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoFeeTierPreferencesProvider2, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoHomeFeeTierStatusDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoHomeFeeTierStatusDuxo cryptoHomeFeeTierStatusDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHomeFeeTierStatusDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoFeeTierPreferencesProvider2 cryptoFeeTierPreferencesProvider2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoFeeTierPreferencesProvider2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoHomeFeeTierStatusDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusDuxo$onCreate$1$1$1", m3645f = "CryptoHomeFeeTierStatusDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.tab.ui.feeTiers.CryptoHomeFeeTierStatusDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497541 extends ContinuationImpl7 implements Function2<CryptoHomeFeeTierStatusDataState, Continuation<? super CryptoHomeFeeTierStatusDataState>, Object> {
                final /* synthetic */ CryptoFeeTierPreferencesProvider2 $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497541(CryptoFeeTierPreferencesProvider2 cryptoFeeTierPreferencesProvider2, Continuation<? super C497541> continuation) {
                    super(2, continuation);
                    this.$it = cryptoFeeTierPreferencesProvider2;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497541 c497541 = new C497541(this.$it, continuation);
                    c497541.L$0 = obj;
                    return c497541;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoHomeFeeTierStatusDataState cryptoHomeFeeTierStatusDataState, Continuation<? super CryptoHomeFeeTierStatusDataState> continuation) {
                    return ((C497541) create(cryptoHomeFeeTierStatusDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((CryptoHomeFeeTierStatusDataState) this.L$0).copy(this.$it);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497541((CryptoFeeTierPreferencesProvider2) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
