package com.robinhood.android.crypto.tab.p093ui.walletTrending;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoExploreCategoryStore;
import com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore;
import com.robinhood.models.api.trading.CryptoTradingAssetType;
import com.robinhood.models.api.trading.CryptoTradingOptionsCategory;
import com.robinhood.models.api.trading.CryptoTradingOptionsLocation;
import com.robinhood.models.crypto.p314db.explore.CryptoExploreCategories;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import kotlin.Metadata;
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
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoHomeWalletTrendingDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingDataState;", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingViewState;", "cryptoTradingOptionsStore", "Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore;", "cryptoExploreCategoryStore", "Lcom/robinhood/librobinhood/data/store/CryptoExploreCategoryStore;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore;Lcom/robinhood/librobinhood/data/store/CryptoExploreCategoryStore;Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeWalletTrendingDuxo extends BaseDuxo<CryptoHomeWalletTrendingDataState, CryptoHomeWalletTrendingViewState> {
    public static final int $stable = 8;
    private final CryptoExploreCategoryStore cryptoExploreCategoryStore;
    private final CryptoTradingOptionsStore cryptoTradingOptionsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CryptoHomeWalletTrendingDuxo(CryptoTradingOptionsStore cryptoTradingOptionsStore, CryptoExploreCategoryStore cryptoExploreCategoryStore, CryptoHomeWalletTrendingStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new CryptoHomeWalletTrendingDataState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoTradingOptionsStore, "cryptoTradingOptionsStore");
        Intrinsics.checkNotNullParameter(cryptoExploreCategoryStore, "cryptoExploreCategoryStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cryptoTradingOptionsStore = cryptoTradingOptionsStore;
        this.cryptoExploreCategoryStore = cryptoExploreCategoryStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C132421(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C132432(null));
    }

    /* compiled from: CryptoHomeWalletTrendingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingDuxo$onCreate$1", m3645f = "CryptoHomeWalletTrendingDuxo.kt", m3646l = {38}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingDuxo$onCreate$1 */
    static final class C132421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C132421(Continuation<? super C132421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHomeWalletTrendingDuxo.this.new C132421(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C132421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(CryptoHomeWalletTrendingDuxo.this.cryptoExploreCategoryStore.getCryptoExploreCategories(CryptoTradingAssetType.CRYPTO, CryptoTradingOptionsLocation.DISCOVER_COINS));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoHomeWalletTrendingDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoHomeWalletTrendingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/explore/CryptoExploreCategories;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingDuxo$onCreate$1$1", m3645f = "CryptoHomeWalletTrendingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoExploreCategories, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoHomeWalletTrendingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoHomeWalletTrendingDuxo cryptoHomeWalletTrendingDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHomeWalletTrendingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoExploreCategories cryptoExploreCategories, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoExploreCategories, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoHomeWalletTrendingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingDuxo$onCreate$1$1$1", m3645f = "CryptoHomeWalletTrendingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497631 extends ContinuationImpl7 implements Function2<CryptoHomeWalletTrendingDataState, Continuation<? super CryptoHomeWalletTrendingDataState>, Object> {
                final /* synthetic */ CryptoExploreCategories $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497631(CryptoExploreCategories cryptoExploreCategories, Continuation<? super C497631> continuation) {
                    super(2, continuation);
                    this.$it = cryptoExploreCategories;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497631 c497631 = new C497631(this.$it, continuation);
                    c497631.L$0 = obj;
                    return c497631;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoHomeWalletTrendingDataState cryptoHomeWalletTrendingDataState, Continuation<? super CryptoHomeWalletTrendingDataState> continuation) {
                    return ((C497631) create(cryptoHomeWalletTrendingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoHomeWalletTrendingDataState.copy$default((CryptoHomeWalletTrendingDataState) this.L$0, this.$it, null, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C497631((CryptoExploreCategories) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoHomeWalletTrendingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingDuxo$onCreate$2", m3645f = "CryptoHomeWalletTrendingDuxo.kt", m3646l = {52}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingDuxo$onCreate$2 */
    static final class C132432 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C132432(Continuation<? super C132432> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoHomeWalletTrendingDuxo.this.new C132432(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C132432) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(CryptoTradingOptionsStore.streamTradingOptions$default(CryptoHomeWalletTrendingDuxo.this.cryptoTradingOptionsStore, CryptoTradingOptionsLocation.WALLET_TRENDING, CryptoTradingAssetType.CRYPTO, new CryptoTradingOptionsCategory(CryptoHomeWalletTrendingDataState2.WALLET_TRENDING_CATEGORY, ""), null, null, 24, null));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoHomeWalletTrendingDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoHomeWalletTrendingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingDuxo$onCreate$2$1", m3645f = "CryptoHomeWalletTrendingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTradingOptions, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoHomeWalletTrendingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoHomeWalletTrendingDuxo cryptoHomeWalletTrendingDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoHomeWalletTrendingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoTradingOptions cryptoTradingOptions, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoTradingOptions, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoHomeWalletTrendingDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingDuxo$onCreate$2$1$1", m3645f = "CryptoHomeWalletTrendingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.tab.ui.walletTrending.CryptoHomeWalletTrendingDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497641 extends ContinuationImpl7 implements Function2<CryptoHomeWalletTrendingDataState, Continuation<? super CryptoHomeWalletTrendingDataState>, Object> {
                final /* synthetic */ CryptoTradingOptions $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497641(CryptoTradingOptions cryptoTradingOptions, Continuation<? super C497641> continuation) {
                    super(2, continuation);
                    this.$it = cryptoTradingOptions;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497641 c497641 = new C497641(this.$it, continuation);
                    c497641.L$0 = obj;
                    return c497641;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoHomeWalletTrendingDataState cryptoHomeWalletTrendingDataState, Continuation<? super CryptoHomeWalletTrendingDataState> continuation) {
                    return ((C497641) create(cryptoHomeWalletTrendingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoHomeWalletTrendingDataState.copy$default((CryptoHomeWalletTrendingDataState) this.L$0, null, this.$it, 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C497641((CryptoTradingOptions) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }
}
