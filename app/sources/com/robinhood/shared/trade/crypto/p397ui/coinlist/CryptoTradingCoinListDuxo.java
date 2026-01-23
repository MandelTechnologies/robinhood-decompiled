package com.robinhood.shared.trade.crypto.p397ui.coinlist;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore;
import com.robinhood.models.api.trading.CryptoTradingOptionsLocation;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import com.robinhood.shared.crypto.contracts.CryptoTradingCoinListFragmentKey;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoTradingCoinListDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0001\u0016B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListDuxo;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListDataState;", "Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState;", "tradingOptionsStore", "Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onQueryChanged", "query", "", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoTradingCoinListDuxo extends BaseDuxo<CryptoTradingCoinListDataState, CryptoTradingCoinListViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final CryptoTradingOptionsStore tradingOptionsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoTradingCoinListDuxo(CryptoTradingOptionsStore tradingOptionsStore, SavedStateHandle savedStateHandle, CryptoTradingCoinListStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new CryptoTradingCoinListDataState(((CryptoTradingCoinListFragmentKey) INSTANCE.getArgs(savedStateHandle)).getEntryPoint(), null, null, 6, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(tradingOptionsStore, "tradingOptionsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.tradingOptionsStore = tradingOptionsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C401651(null));
    }

    /* compiled from: CryptoTradingCoinListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListDuxo$onCreate$1", m3645f = "CryptoTradingCoinListDuxo.kt", m3646l = {46}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListDuxo$onCreate$1 */
    static final class C401651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* compiled from: CryptoTradingCoinListDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListDuxo$onCreate$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CryptoTradingCoinListFragmentKey.EntryPoint.values().length];
                try {
                    iArr[CryptoTradingCoinListFragmentKey.EntryPoint.TAX_LOTS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CryptoTradingCoinListFragmentKey.EntryPoint.CRYPTO_EDUCATION_TRADING_5_DOLLAR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CryptoTradingCoinListFragmentKey.EntryPoint.CRYPTO_EDUCATION_TRADING_1_DOLLAR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C401651(Continuation<? super C401651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTradingCoinListDuxo.this.new C401651(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C401651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CryptoTradingOptionsLocation cryptoTradingOptionsLocation;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoTradingOptionsStore cryptoTradingOptionsStore = CryptoTradingCoinListDuxo.this.tradingOptionsStore;
                CryptoTradingCoinListFragmentKey.EntryPoint entryPoint = ((CryptoTradingCoinListFragmentKey) CryptoTradingCoinListDuxo.INSTANCE.getArgs((HasSavedState) CryptoTradingCoinListDuxo.this)).getEntryPoint();
                int i2 = entryPoint == null ? -1 : WhenMappings.$EnumSwitchMapping$0[entryPoint.ordinal()];
                if (i2 == 1) {
                    cryptoTradingOptionsLocation = CryptoTradingOptionsLocation.TAX_LOTS;
                } else if (i2 == 2) {
                    cryptoTradingOptionsLocation = CryptoTradingOptionsLocation.CRYPTO_EDUCATION_TRADING_5_DOLLAR;
                } else if (i2 == 3) {
                    cryptoTradingOptionsLocation = CryptoTradingOptionsLocation.CRYPTO_EDUCATION_TRADING_1_DOLLAR;
                } else {
                    cryptoTradingOptionsLocation = CryptoTradingOptionsLocation.CTA;
                }
                Flow flowStreamTradingOptions$default = CryptoTradingOptionsStore.streamTradingOptions$default(cryptoTradingOptionsStore, cryptoTradingOptionsLocation, null, null, null, null, 30, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTradingCoinListDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamTradingOptions$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoTradingCoinListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "tradingOptions", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListDuxo$onCreate$1$1", m3645f = "CryptoTradingCoinListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTradingOptions, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTradingCoinListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTradingCoinListDuxo cryptoTradingCoinListDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTradingCoinListDuxo;
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

            /* compiled from: CryptoTradingCoinListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListDuxo$onCreate$1$1$1", m3645f = "CryptoTradingCoinListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507631 extends ContinuationImpl7 implements Function2<CryptoTradingCoinListDataState, Continuation<? super CryptoTradingCoinListDataState>, Object> {
                final /* synthetic */ CryptoTradingOptions $tradingOptions;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507631(CryptoTradingOptions cryptoTradingOptions, Continuation<? super C507631> continuation) {
                    super(2, continuation);
                    this.$tradingOptions = cryptoTradingOptions;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507631 c507631 = new C507631(this.$tradingOptions, continuation);
                    c507631.L$0 = obj;
                    return c507631;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTradingCoinListDataState cryptoTradingCoinListDataState, Continuation<? super CryptoTradingCoinListDataState> continuation) {
                    return ((C507631) create(cryptoTradingCoinListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTradingCoinListDataState.copy$default((CryptoTradingCoinListDataState) this.L$0, null, null, this.$tradingOptions.getResults(), 3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C507631((CryptoTradingOptions) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CryptoTradingCoinListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListDuxo$onQueryChanged$1", m3645f = "CryptoTradingCoinListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListDuxo$onQueryChanged$1 */
    static final class C401661 extends ContinuationImpl7 implements Function2<CryptoTradingCoinListDataState, Continuation<? super CryptoTradingCoinListDataState>, Object> {
        final /* synthetic */ String $query;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C401661(String str, Continuation<? super C401661> continuation) {
            super(2, continuation);
            this.$query = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C401661 c401661 = new C401661(this.$query, continuation);
            c401661.L$0 = obj;
            return c401661;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoTradingCoinListDataState cryptoTradingCoinListDataState, Continuation<? super CryptoTradingCoinListDataState> continuation) {
            return ((C401661) create(cryptoTradingCoinListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoTradingCoinListDataState.copy$default((CryptoTradingCoinListDataState) this.L$0, null, this.$query, null, 5, null);
        }
    }

    public final void onQueryChanged(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        applyMutation(new C401661(query, null));
    }

    /* compiled from: CryptoTradingCoinListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListDuxo;", "Lcom/robinhood/shared/crypto/contracts/CryptoTradingCoinListFragmentKey;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CryptoTradingCoinListDuxo, CryptoTradingCoinListFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTradingCoinListFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoTradingCoinListFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CryptoTradingCoinListFragmentKey getArgs(CryptoTradingCoinListDuxo cryptoTradingCoinListDuxo) {
            return (CryptoTradingCoinListFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, cryptoTradingCoinListDuxo);
        }
    }
}
