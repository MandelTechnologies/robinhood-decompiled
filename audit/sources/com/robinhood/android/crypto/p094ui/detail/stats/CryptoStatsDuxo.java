package com.robinhood.android.crypto.p094ui.detail.stats;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoStatsStore;
import com.robinhood.models.crypto.p314db.CryptoStats;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: CryptoStatsDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/stats/CryptoStatsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/ui/detail/stats/CryptoStatsDataState;", "Lcom/robinhood/android/crypto/ui/detail/stats/CryptoStatsViewState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/stats/CryptoStatsStateProvider;", "cryptoStatsStore", "Lcom/robinhood/librobinhood/data/store/CryptoStatsStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/crypto/ui/detail/stats/CryptoStatsStateProvider;Lcom/robinhood/librobinhood/data/store/CryptoStatsStore;)V", "currencyPairIdFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ljava/util/UUID;", "onCreate", "", "setCurrencyPairId", "currencyPairId", "setCurrencyPairId$feature_crypto_externalDebug", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoStatsDuxo extends BaseDuxo<CryptoStatsDataState, CryptoStatsViewState> {
    public static final int $stable = 8;
    private final CryptoStatsStore cryptoStatsStore;
    private final StateFlow2<UUID> currencyPairIdFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CryptoStatsDuxo(DuxoBundle duxoBundle, CryptoStatsDuxo3 stateProvider, CryptoStatsStore cryptoStatsStore) {
        super(new CryptoStatsDataState(null, 1, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(cryptoStatsStore, "cryptoStatsStore");
        this.cryptoStatsStore = cryptoStatsStore;
        this.currencyPairIdFlow = StateFlow4.MutableStateFlow(null);
    }

    /* compiled from: CryptoStatsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.stats.CryptoStatsDuxo$onCreate$1", m3645f = "CryptoStatsDuxo.kt", m3646l = {44}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detail.stats.CryptoStatsDuxo$onCreate$1 */
    static final class C134691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C134691(Continuation<? super C134691> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoStatsDuxo.this.new C134691(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C134691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.filterNotNull(CryptoStatsDuxo.this.currencyPairIdFlow), new C13468xae391258(null, CryptoStatsDuxo.this));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoStatsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoStatsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "stats", "Lcom/robinhood/models/crypto/db/CryptoStats;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.stats.CryptoStatsDuxo$onCreate$1$2", m3645f = "CryptoStatsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detail.stats.CryptoStatsDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoStats, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoStatsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoStatsDuxo cryptoStatsDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoStatsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoStats cryptoStats, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(cryptoStats, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoStatsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/ui/detail/stats/CryptoStatsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detail.stats.CryptoStatsDuxo$onCreate$1$2$1", m3645f = "CryptoStatsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.ui.detail.stats.CryptoStatsDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoStatsDataState, Continuation<? super CryptoStatsDataState>, Object> {
                final /* synthetic */ CryptoStats $stats;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoStats cryptoStats, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$stats = cryptoStats;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$stats, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoStatsDataState cryptoStatsDataState, Continuation<? super CryptoStatsDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoStatsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((CryptoStatsDataState) this.L$0).copy(this.$stats);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((CryptoStats) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C134691(null));
    }

    public final void setCurrencyPairId$feature_crypto_externalDebug(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        StateFlow2<UUID> stateFlow2 = this.currencyPairIdFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), currencyPairId)) {
        }
    }
}
