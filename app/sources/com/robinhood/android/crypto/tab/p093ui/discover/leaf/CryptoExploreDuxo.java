package com.robinhood.android.crypto.tab.p093ui.discover.leaf;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import com.robinhood.shared.crypto.contracts.CryptoExploreFragmentKey;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: CryptoExploreDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0019B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/discover/leaf/CryptoExploreDuxo;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/crypto/tab/ui/discover/leaf/CryptoExploreViewState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoTradingOptionsStore", "Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "getCryptoTradingOptionsStore", "()Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore;", "queryFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "onCreate", "", "onQueryChanged", "newQuery", "onFakeSearchTapped", "onCancelTapped", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoExploreDuxo extends BaseDuxo4<CryptoExploreViewState> implements HasSavedState {
    private final CryptoTradingOptionsStore cryptoTradingOptionsStore;
    private final StateFlow2<String> queryFlow;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public final CryptoTradingOptionsStore getCryptoTradingOptionsStore() {
        return this.cryptoTradingOptionsStore;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoExploreDuxo(SavedStateHandle savedStateHandle, CryptoTradingOptionsStore cryptoTradingOptionsStore, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(cryptoTradingOptionsStore, "cryptoTradingOptionsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        String title = ((CryptoExploreFragmentKey) companion.getArgs(savedStateHandle)).getTitle();
        super(new CryptoExploreViewState(false, null, ((CryptoExploreFragmentKey) companion.getArgs(savedStateHandle)).getCategoriesResponse(), ((CryptoExploreFragmentKey) companion.getArgs(savedStateHandle)).getSelectedCategoryIndex(), title, ""), duxoBundle);
        this.savedStateHandle = savedStateHandle;
        this.cryptoTradingOptionsStore = cryptoTradingOptionsStore;
        this.queryFlow = StateFlow4.MutableStateFlow("");
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C131301(FlowKt.distinctUntilChanged(FlowKt.onStart(FlowKt.debounce(FlowKt.onEach(this.queryFlow, new CryptoExploreDuxo2(this, null)), 300L), new CryptoExploreDuxo3(null))), this, null));
    }

    /* compiled from: CryptoExploreDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreDuxo$onCreate$1", m3645f = "CryptoExploreDuxo.kt", m3646l = {81}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreDuxo$onCreate$1 */
    static final class C131301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<String> $searchFlow;
        int label;
        final /* synthetic */ CryptoExploreDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C131301(Flow<String> flow, CryptoExploreDuxo cryptoExploreDuxo, Continuation<? super C131301> continuation) {
            super(2, continuation);
            this.$searchFlow = flow;
            this.this$0 = cryptoExploreDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C131301(this.$searchFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C131301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(this.$searchFlow, new C13127xcf64ad8c(null, this.this$0));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
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

        /* compiled from: CryptoExploreDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreDuxo$onCreate$1$2", m3645f = "CryptoExploreDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Tuples2<? extends CryptoTradingOptions, ? extends String>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoExploreDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoExploreDuxo cryptoExploreDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoExploreDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends CryptoTradingOptions, ? extends String> tuples2, Continuation<? super Unit> continuation) {
                return invoke2((Tuples2<CryptoTradingOptions, String>) tuples2, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Tuples2<CryptoTradingOptions, String> tuples2, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) this.L$0;
                CryptoTradingOptions cryptoTradingOptions = (CryptoTradingOptions) tuples2.component1();
                if (Intrinsics.areEqual(this.this$0.getStateFlow().getValue().getQuery(), (String) tuples2.component2())) {
                    this.this$0.applyMutation(new AnonymousClass1(cryptoTradingOptions, null));
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoExploreDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/discover/leaf/CryptoExploreViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreDuxo$onCreate$1$2$1", m3645f = "CryptoExploreDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoExploreViewState, Continuation<? super CryptoExploreViewState>, Object> {
                final /* synthetic */ CryptoTradingOptions $options;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoTradingOptions cryptoTradingOptions, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$options = cryptoTradingOptions;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$options, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoExploreViewState cryptoExploreViewState, Continuation<? super CryptoExploreViewState> continuation) {
                    return ((AnonymousClass1) create(cryptoExploreViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoExploreViewState.copy$default((CryptoExploreViewState) this.L$0, false, this.$options.getResults(), null, 0, null, null, 61, null);
                }
            }
        }
    }

    /* compiled from: CryptoExploreDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/discover/leaf/CryptoExploreViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreDuxo$onQueryChanged$1", m3645f = "CryptoExploreDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreDuxo$onQueryChanged$1 */
    static final class C131331 extends ContinuationImpl7 implements Function2<CryptoExploreViewState, Continuation<? super CryptoExploreViewState>, Object> {
        final /* synthetic */ String $newQuery;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C131331(String str, Continuation<? super C131331> continuation) {
            super(2, continuation);
            this.$newQuery = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C131331 c131331 = new C131331(this.$newQuery, continuation);
            c131331.L$0 = obj;
            return c131331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoExploreViewState cryptoExploreViewState, Continuation<? super CryptoExploreViewState> continuation) {
            return ((C131331) create(cryptoExploreViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoExploreViewState.copy$default((CryptoExploreViewState) this.L$0, false, null, null, 0, null, this.$newQuery, 31, null);
        }
    }

    public final void onQueryChanged(String newQuery) {
        Intrinsics.checkNotNullParameter(newQuery, "newQuery");
        applyMutation(new C131331(newQuery, null));
        this.queryFlow.setValue(newQuery);
    }

    /* compiled from: CryptoExploreDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/discover/leaf/CryptoExploreViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreDuxo$onFakeSearchTapped$1", m3645f = "CryptoExploreDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreDuxo$onFakeSearchTapped$1 */
    static final class C131321 extends ContinuationImpl7 implements Function2<CryptoExploreViewState, Continuation<? super CryptoExploreViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C131321(Continuation<? super C131321> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C131321 c131321 = new C131321(continuation);
            c131321.L$0 = obj;
            return c131321;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoExploreViewState cryptoExploreViewState, Continuation<? super CryptoExploreViewState> continuation) {
            return ((C131321) create(cryptoExploreViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoExploreViewState.copy$default((CryptoExploreViewState) this.L$0, true, null, null, 0, null, null, 62, null);
        }
    }

    public final void onFakeSearchTapped() {
        applyMutation(new C131321(null));
        onQueryChanged("");
    }

    /* compiled from: CryptoExploreDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/discover/leaf/CryptoExploreViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreDuxo$onCancelTapped$1", m3645f = "CryptoExploreDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.discover.leaf.CryptoExploreDuxo$onCancelTapped$1 */
    static final class C131291 extends ContinuationImpl7 implements Function2<CryptoExploreViewState, Continuation<? super CryptoExploreViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C131291(Continuation<? super C131291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C131291 c131291 = new C131291(continuation);
            c131291.L$0 = obj;
            return c131291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoExploreViewState cryptoExploreViewState, Continuation<? super CryptoExploreViewState> continuation) {
            return ((C131291) create(cryptoExploreViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoExploreViewState.copy$default((CryptoExploreViewState) this.L$0, false, null, null, 0, null, null, 62, null);
        }
    }

    public final void onCancelTapped() {
        applyMutation(new C131291(null));
        onQueryChanged("");
    }

    /* compiled from: CryptoExploreDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/discover/leaf/CryptoExploreDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/crypto/tab/ui/discover/leaf/CryptoExploreDuxo;", "Lcom/robinhood/shared/crypto/contracts/CryptoExploreFragmentKey;", "<init>", "()V", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoExploreDuxo, CryptoExploreFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoExploreFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoExploreFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoExploreFragmentKey getArgs(CryptoExploreDuxo cryptoExploreDuxo) {
            return (CryptoExploreFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, cryptoExploreDuxo);
        }
    }
}
