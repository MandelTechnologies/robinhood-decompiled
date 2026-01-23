package com.robinhood.shared.trade.crypto.p397ui.account;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p314db.CryptoCurrencyPairAccountSwitcher;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.trade.crypto.p397ui.account.CryptoTradeAccountSwitcherDropdownArgs;
import com.robinhood.shared.trade.crypto.p397ui.account.CryptoTradeAccountSwitcherDropdownDuxo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: CryptoTradeAccountSwitcherDropdownDuxo.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0001\u001eB?\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownDuxo;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownArgs;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownDataState;", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownViewState;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoCurrencyPairAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/CryptoCurrencyPairAccountSwitcherStore;", "cryptoInputModePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownStateProvider;", "<init>", "(Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoCurrencyPairAccountSwitcherStore;Lcom/robinhood/prefs/EnumPreference;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "setSelectedAccount", "accountNumber", "", "location", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation;", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoTradeAccountSwitcherDropdownDuxo extends BaseDuxo<CryptoTradeAccountSwitcherDropdownDataState, CryptoTradeAccountSwitcherDropdownViewState> implements HasArgs<CryptoTradeAccountSwitcherDropdownArgs> {
    private final CryptoAccountProvider cryptoAccountProvider;
    private final CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore;
    private final EnumPreference<CryptoInputMode> cryptoInputModePref;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoTradeAccountSwitcherDropdownDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoInputMode.values().length];
            try {
                iArr2[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CryptoTradeAccountSwitcherDropdownArgs.Source.values().length];
            try {
                iArr3[CryptoTradeAccountSwitcherDropdownArgs.Source.QUOTE_ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[CryptoTradeAccountSwitcherDropdownArgs.Source.ORDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[CryptoTradeAccountSwitcherDropdownArgs.Source.TAX_LOT_ORDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Override // com.robinhood.android.udf.HasArgs
    public CryptoTradeAccountSwitcherDropdownArgs getArgs(SavedStateHandle savedStateHandle) {
        return (CryptoTradeAccountSwitcherDropdownArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CryptoTradeAccountSwitcherDropdownDuxo(CryptoAccountProvider cryptoAccountProvider, CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore, EnumPreference<CryptoInputMode> cryptoInputModePref, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoTradeAccountSwitcherDropdownStateProvider stateProvider) {
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcherStore, "cryptoCurrencyPairAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Screen.Name name = Screen.Name.CRYPTO_ORDER_ENTRY;
        String string2 = ((CryptoTradeAccountSwitcherDropdownArgs) INSTANCE.getArgs(savedStateHandle)).getCurrencyPairId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        super(new CryptoTradeAccountSwitcherDropdownDataState(null, null, null, new Screen(name, null, string2, null, 10, null), 7, null), stateProvider, duxoBundle);
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoCurrencyPairAccountSwitcherStore = cryptoCurrencyPairAccountSwitcherStore;
        this.cryptoInputModePref = cryptoInputModePref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        Object buy;
        Flow<CryptoAccountSwitcherLocation.WithCurrencyPair> flowFlowOf;
        super.onCreate();
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$2[((CryptoTradeAccountSwitcherDropdownArgs) companion.getArgs((HasArgs) this)).getSource().ordinal()];
        if (i == 1) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[((CryptoTradeAccountSwitcherDropdownArgs) companion.getArgs((HasArgs) this)).getSide().ordinal()];
            if (i2 == 1) {
                buy = new CryptoAccountSwitcherLocation.Buy(((CryptoTradeAccountSwitcherDropdownArgs) companion.getArgs((HasArgs) this)).getCurrencyPairId());
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                buy = new CryptoAccountSwitcherLocation.SellQuote(((CryptoTradeAccountSwitcherDropdownArgs) companion.getArgs((HasArgs) this)).getCurrencyPairId());
            }
            flowFlowOf = FlowKt.flowOf(buy);
        } else if (i == 2) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[((CryptoTradeAccountSwitcherDropdownArgs) companion.getArgs((HasArgs) this)).getSide().ordinal()];
            if (i3 == 1) {
                flowFlowOf = FlowKt.flowOf(new CryptoAccountSwitcherLocation.Buy(((CryptoTradeAccountSwitcherDropdownArgs) companion.getArgs((HasArgs) this)).getCurrencyPairId()));
            } else if (i3 == 2) {
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.cryptoInputModePref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                flowFlowOf = new Flow<CryptoAccountSwitcherLocation.WithCurrencyPair>() { // from class: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$$inlined$map$1$2 */
                    public static final class C401422<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ CryptoTradeAccountSwitcherDropdownDuxo this$0;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$$inlined$map$1$2", m3645f = "CryptoTradeAccountSwitcherDropdownDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C401422.this.emit(null, this);
                            }
                        }

                        public C401422(FlowCollector flowCollector, CryptoTradeAccountSwitcherDropdownDuxo cryptoTradeAccountSwitcherDropdownDuxo) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = cryptoTradeAccountSwitcherDropdownDuxo;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            Parcelable sellQuote;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                int i3 = CryptoTradeAccountSwitcherDropdownDuxo.WhenMappings.$EnumSwitchMapping$1[((CryptoInputMode) obj).ordinal()];
                                if (i3 == 1) {
                                    sellQuote = new CryptoAccountSwitcherLocation.SellQuote(((CryptoTradeAccountSwitcherDropdownArgs) CryptoTradeAccountSwitcherDropdownDuxo.INSTANCE.getArgs((HasArgs) this.this$0)).getCurrencyPairId());
                                } else {
                                    if (i3 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    sellQuote = new CryptoAccountSwitcherLocation.SellAsset(((CryptoTradeAccountSwitcherDropdownArgs) CryptoTradeAccountSwitcherDropdownDuxo.INSTANCE.getArgs((HasArgs) this.this$0)).getCurrencyPairId());
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(sellQuote, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoAccountSwitcherLocation.WithCurrencyPair> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new C401422(flowCollector, this), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            flowFlowOf = FlowKt.flowOf(new CryptoAccountSwitcherLocation.SellAsset(((CryptoTradeAccountSwitcherDropdownArgs) companion.getArgs((HasArgs) this)).getCurrencyPairId()));
        }
        LifecycleHostCoroutineScope lifecycleScope = getLifecycleScope();
        LifecycleState lifecycleState = LifecycleState.STARTED;
        lifecycleScope.repeatOnLifecycle(lifecycleState, new C401441(flowFlowOf, this, null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C401452(null));
        getLifecycleScope().repeatOnLifecycle(lifecycleState, new C401463(flowFlowOf, this, null));
    }

    /* compiled from: CryptoTradeAccountSwitcherDropdownDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$1", m3645f = "CryptoTradeAccountSwitcherDropdownDuxo.kt", m3646l = {84}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$1 */
    static final class C401441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<CryptoAccountSwitcherLocation.WithCurrencyPair> $accountSwitcherLocationFlow;
        int label;
        final /* synthetic */ CryptoTradeAccountSwitcherDropdownDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C401441(Flow<? extends CryptoAccountSwitcherLocation.WithCurrencyPair> flow, CryptoTradeAccountSwitcherDropdownDuxo cryptoTradeAccountSwitcherDropdownDuxo, Continuation<? super C401441> continuation) {
            super(2, continuation);
            this.$accountSwitcherLocationFlow = flow;
            this.this$0 = cryptoTradeAccountSwitcherDropdownDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C401441(this.$accountSwitcherLocationFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C401441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoTradeAccountSwitcherDropdownDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation$WithCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$1$1", m3645f = "CryptoTradeAccountSwitcherDropdownDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoAccountSwitcherLocation.WithCurrencyPair, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTradeAccountSwitcherDropdownDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTradeAccountSwitcherDropdownDuxo cryptoTradeAccountSwitcherDropdownDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTradeAccountSwitcherDropdownDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(withCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoTradeAccountSwitcherDropdownDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$1$1$1", m3645f = "CryptoTradeAccountSwitcherDropdownDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507611 extends ContinuationImpl7 implements Function2<CryptoTradeAccountSwitcherDropdownDataState, Continuation<? super CryptoTradeAccountSwitcherDropdownDataState>, Object> {
                final /* synthetic */ CryptoAccountSwitcherLocation.WithCurrencyPair $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507611(CryptoAccountSwitcherLocation.WithCurrencyPair withCurrencyPair, Continuation<? super C507611> continuation) {
                    super(2, continuation);
                    this.$it = withCurrencyPair;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507611 c507611 = new C507611(this.$it, continuation);
                    c507611.L$0 = obj;
                    return c507611;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTradeAccountSwitcherDropdownDataState cryptoTradeAccountSwitcherDropdownDataState, Continuation<? super CryptoTradeAccountSwitcherDropdownDataState> continuation) {
                    return ((C507611) create(cryptoTradeAccountSwitcherDropdownDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTradeAccountSwitcherDropdownDataState.copy$default((CryptoTradeAccountSwitcherDropdownDataState) this.L$0, null, this.$it, null, null, 13, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507611((CryptoAccountSwitcherLocation.WithCurrencyPair) this.L$0, null));
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<CryptoAccountSwitcherLocation.WithCurrencyPair> flow = this.$accountSwitcherLocationFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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
    }

    /* compiled from: CryptoTradeAccountSwitcherDropdownDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$2", m3645f = "CryptoTradeAccountSwitcherDropdownDuxo.kt", m3646l = {91}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$2 */
    static final class C401452 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C401452(Continuation<? super C401452> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTradeAccountSwitcherDropdownDuxo.this.new C401452(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C401452) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<CryptoCurrencyPairAccountSwitcher> flowAsFlow = CryptoTradeAccountSwitcherDropdownDuxo.this.cryptoCurrencyPairAccountSwitcherStore.getAccountSwitcherForCurrencyPairQuery().asFlow(((CryptoTradeAccountSwitcherDropdownArgs) CryptoTradeAccountSwitcherDropdownDuxo.INSTANCE.getArgs((HasArgs) CryptoTradeAccountSwitcherDropdownDuxo.this)).getCurrencyPairId());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTradeAccountSwitcherDropdownDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowAsFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoTradeAccountSwitcherDropdownDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/db/CryptoCurrencyPairAccountSwitcher;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$2$1", m3645f = "CryptoTradeAccountSwitcherDropdownDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoCurrencyPairAccountSwitcher, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTradeAccountSwitcherDropdownDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoTradeAccountSwitcherDropdownDuxo cryptoTradeAccountSwitcherDropdownDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTradeAccountSwitcherDropdownDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoCurrencyPairAccountSwitcher, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoTradeAccountSwitcherDropdownDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$2$1$1", m3645f = "CryptoTradeAccountSwitcherDropdownDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507621 extends ContinuationImpl7 implements Function2<CryptoTradeAccountSwitcherDropdownDataState, Continuation<? super CryptoTradeAccountSwitcherDropdownDataState>, Object> {
                final /* synthetic */ CryptoCurrencyPairAccountSwitcher $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507621(CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher, Continuation<? super C507621> continuation) {
                    super(2, continuation);
                    this.$it = cryptoCurrencyPairAccountSwitcher;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507621 c507621 = new C507621(this.$it, continuation);
                    c507621.L$0 = obj;
                    return c507621;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTradeAccountSwitcherDropdownDataState cryptoTradeAccountSwitcherDropdownDataState, Continuation<? super CryptoTradeAccountSwitcherDropdownDataState> continuation) {
                    return ((C507621) create(cryptoTradeAccountSwitcherDropdownDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTradeAccountSwitcherDropdownDataState.copy$default((CryptoTradeAccountSwitcherDropdownDataState) this.L$0, this.$it, null, null, null, 14, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507621((CryptoCurrencyPairAccountSwitcher) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoTradeAccountSwitcherDropdownDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$3", m3645f = "CryptoTradeAccountSwitcherDropdownDuxo.kt", m3646l = {101}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$3 */
    static final class C401463 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<CryptoAccountSwitcherLocation.WithCurrencyPair> $accountSwitcherLocationFlow;
        int label;
        final /* synthetic */ CryptoTradeAccountSwitcherDropdownDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C401463(Flow<? extends CryptoAccountSwitcherLocation.WithCurrencyPair> flow, CryptoTradeAccountSwitcherDropdownDuxo cryptoTradeAccountSwitcherDropdownDuxo, Continuation<? super C401463> continuation) {
            super(2, continuation);
            this.$accountSwitcherLocationFlow = flow;
            this.this$0 = cryptoTradeAccountSwitcherDropdownDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C401463(this.$accountSwitcherLocationFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C401463) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowTransformLatest = FlowKt.transformLatest(this.$accountSwitcherLocationFlow, new C40143x14692334(null, this.this$0));
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

        /* compiled from: CryptoTradeAccountSwitcherDropdownDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$3$2", m3645f = "CryptoTradeAccountSwitcherDropdownDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoTradeAccountSwitcherDropdownDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoTradeAccountSwitcherDropdownDuxo cryptoTradeAccountSwitcherDropdownDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoTradeAccountSwitcherDropdownDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoTradeAccountSwitcherDropdownDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$3$2$1", m3645f = "CryptoTradeAccountSwitcherDropdownDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.trade.crypto.ui.account.CryptoTradeAccountSwitcherDropdownDuxo$onCreate$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoTradeAccountSwitcherDropdownDataState, Continuation<? super CryptoTradeAccountSwitcherDropdownDataState>, Object> {
                final /* synthetic */ String $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoTradeAccountSwitcherDropdownDataState cryptoTradeAccountSwitcherDropdownDataState, Continuation<? super CryptoTradeAccountSwitcherDropdownDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoTradeAccountSwitcherDropdownDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoTradeAccountSwitcherDropdownDataState.copy$default((CryptoTradeAccountSwitcherDropdownDataState) this.L$0, null, null, this.$it, null, 11, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((String) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    public final void setSelectedAccount(String accountNumber, CryptoAccountSwitcherLocation location) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(location, "location");
        this.cryptoAccountProvider.mo15792setSelectedAccountNumber(location, accountNumber);
    }

    /* compiled from: CryptoTradeAccountSwitcherDropdownDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownDuxo;", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownArgs;", "<init>", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoTradeAccountSwitcherDropdownDuxo, CryptoTradeAccountSwitcherDropdownArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public CryptoTradeAccountSwitcherDropdownArgs getArgs(SavedStateHandle savedStateHandle) {
            return (CryptoTradeAccountSwitcherDropdownArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public CryptoTradeAccountSwitcherDropdownArgs getArgs(CryptoTradeAccountSwitcherDropdownDuxo cryptoTradeAccountSwitcherDropdownDuxo) {
            return (CryptoTradeAccountSwitcherDropdownArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoTradeAccountSwitcherDropdownDuxo);
        }
    }
}
