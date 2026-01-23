package com.robinhood.shared.crypto.staking.staking.review;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.librobinhood.data.store.CryptoStakingStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.api.staking.ApiCryptoStakingOrder;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.crypto.p315ui.staking.UiCryptoStakingOrderModel;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.crypto.staking.staking.input.StakingIsQuoteInputModePref;
import com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewEvent;
import com.robinhood.shared.crypto.staking.staking.utils.ErrorHandlingUtils;
import com.robinhood.shared.crypto.staking.staking.utils.StakingCrashReporter;
import com.robinhood.shared.formats.crypto.UiCurrencyPairs3;
import com.robinhood.utils.extensions.Throwables;
import java.math.BigDecimal;
import java.util.UUID;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoStakingReviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \"2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0002!\"BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0016\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0017R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDataState;", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewViewState;", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDuxo$InitArgs;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "cryptoStakingStore", "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "cryptoHoldingStore", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;", "isQuoteInputModePref", "Lcom/robinhood/prefs/BooleanPreference;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore;Lcom/robinhood/prefs/BooleanPreference;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "()Lcom/robinhood/prefs/BooleanPreference;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "submitOrder", Card.Icon.ORDER, "Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;", "idempotencyId", "Ljava/util/UUID;", "InitArgs", "Companion", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoStakingReviewDuxo extends BaseDuxo3<CryptoStakingReviewDataState, CryptoStakingReviewViewState, CryptoStakingReviewEvent> implements HasArgs<InitArgs> {
    private final CryptoHoldingStore cryptoHoldingStore;
    private final CryptoStakingStore cryptoStakingStore;
    private final CurrencyPairV2Store currencyPairStore;
    private final BooleanPreference isQuoteInputModePref;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    /* renamed from: isQuoteInputModePref, reason: from getter */
    public final BooleanPreference getIsQuoteInputModePref() {
        return this.isQuoteInputModePref;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoStakingReviewDuxo(CurrencyPairV2Store currencyPairStore, CryptoStakingStore cryptoStakingStore, CryptoHoldingStore cryptoHoldingStore, @StakingIsQuoteInputModePref BooleanPreference isQuoteInputModePref, SavedStateHandle savedStateHandle, CryptoStakingReviewStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new CryptoStakingReviewDataState(null, null, false, ((InitArgs) INSTANCE.getArgs(savedStateHandle)).getOrder(), false, null, null, 119, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(cryptoStakingStore, "cryptoStakingStore");
        Intrinsics.checkNotNullParameter(cryptoHoldingStore, "cryptoHoldingStore");
        Intrinsics.checkNotNullParameter(isQuoteInputModePref, "isQuoteInputModePref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.currencyPairStore = currencyPairStore;
        this.cryptoStakingStore = cryptoStakingStore;
        this.cryptoHoldingStore = cryptoHoldingStore;
        this.isQuoteInputModePref = isQuoteInputModePref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C378771(null));
        getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C378782(null));
    }

    /* compiled from: CryptoStakingReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$onCreate$1", m3645f = "CryptoStakingReviewDuxo.kt", m3646l = {52}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$onCreate$1 */
    static final class C378771 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C378771(Continuation<? super C378771> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoStakingReviewDuxo.this.new C378771(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C378771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow<UiCurrencyPair> flowStreamCurrencyPairFlow = CryptoStakingReviewDuxo.this.currencyPairStore.streamCurrencyPairFlow(((InitArgs) CryptoStakingReviewDuxo.INSTANCE.getArgs((HasArgs) CryptoStakingReviewDuxo.this)).getOrder().getCurrencyPairId());
                Flow<UiCurrencyPair> flow = new Flow<UiCurrencyPair>() { // from class: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2 */
                    public static final class C378762<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "CryptoStakingReviewDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C378762.this.emit(null, this);
                            }
                        }

                        public C378762(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
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
                                UiCurrencyPair uiCurrencyPairAdjustMinOrderQuantityIncrement = UiCurrencyPairs3.adjustMinOrderQuantityIncrement((UiCurrencyPair) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(uiCurrencyPairAdjustMinOrderQuantityIncrement, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super UiCurrencyPair> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamCurrencyPairFlow.collect(new C378762(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoStakingReviewDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: CryptoStakingReviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$onCreate$1$2", m3645f = "CryptoStakingReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoStakingReviewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoStakingReviewDuxo cryptoStakingReviewDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoStakingReviewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoStakingReviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$onCreate$1$2$1", m3645f = "CryptoStakingReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoStakingReviewDataState, Continuation<? super CryptoStakingReviewDataState>, Object> {
                final /* synthetic */ UiCurrencyPair $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(UiCurrencyPair uiCurrencyPair, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = uiCurrencyPair;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoStakingReviewDataState cryptoStakingReviewDataState, Continuation<? super CryptoStakingReviewDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoStakingReviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((CryptoStakingReviewDataState) this.L$0).mutateWith(this.$it);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new AnonymousClass1((UiCurrencyPair) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: CryptoStakingReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$onCreate$2", m3645f = "CryptoStakingReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$onCreate$2 */
    static final class C378782 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C378782(Continuation<? super C378782> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoStakingReviewDuxo.this.new C378782(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C378782) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoStakingReviewDuxo.this.submit(CryptoStakingReviewEvent.ReviewEvent.ForceRedrawEvent.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoStakingReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$submitOrder$1", m3645f = "CryptoStakingReviewDuxo.kt", m3646l = {67}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$submitOrder$1 */
    static final class C378791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $idempotencyId;
        final /* synthetic */ UiCryptoStakingOrderModel $order;
        int label;

        /* compiled from: CryptoStakingReviewDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$submitOrder$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiCryptoStakingOrder.AmountType.values().length];
                try {
                    iArr[ApiCryptoStakingOrder.AmountType.CRYPTOCURRENCY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiCryptoStakingOrder.AmountType.FIAT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApiCryptoStakingOrder.AmountType.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C378791(UiCryptoStakingOrderModel uiCryptoStakingOrderModel, UUID uuid, Continuation<? super C378791> continuation) {
            super(2, continuation);
            this.$order = uiCryptoStakingOrderModel;
            this.$idempotencyId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoStakingReviewDuxo.this.new C378791(this.$order, this.$idempotencyId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C378791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoStakingReviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$submitOrder$1$1", m3645f = "CryptoStakingReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$submitOrder$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoStakingReviewDataState, Continuation<? super CryptoStakingReviewDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoStakingReviewDataState cryptoStakingReviewDataState, Continuation<? super CryptoStakingReviewDataState> continuation) {
                return ((AnonymousClass1) create(cryptoStakingReviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoStakingReviewDataState.copy$default((CryptoStakingReviewDataState) this.L$0, null, null, false, null, true, null, null, 111, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            BigDecimal amount;
            Object objSubmitOrder;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoStakingReviewDuxo.this.applyMutation(new AnonymousClass1(null));
                    CryptoStakingStore cryptoStakingStore = CryptoStakingReviewDuxo.this.cryptoStakingStore;
                    int i2 = WhenMappings.$EnumSwitchMapping$0[this.$order.getAmountType().ordinal()];
                    if (i2 == 1) {
                        amount = this.$order.getAmount();
                    } else if (i2 == 2) {
                        amount = this.$order.getFiatAmount();
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        amount = this.$order.getAmount();
                    }
                    ApiCryptoStakingOrder.AmountType amountType = this.$order.getAmountType();
                    ApiCryptoStakingOrder.OrderType orderType = this.$order.getOrderType();
                    UUID currencyPairId = this.$order.getCurrencyPairId();
                    UUID uuid = this.$idempotencyId;
                    this.label = 1;
                    objSubmitOrder = cryptoStakingStore.submitOrder(amount, amountType, currencyPairId, uuid, orderType, this);
                    if (objSubmitOrder == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objSubmitOrder = obj;
                }
                UiCryptoStakingOrderModel uiCryptoStakingOrderModel = (UiCryptoStakingOrderModel) objSubmitOrder;
                CryptoStakingReviewDuxo.this.cryptoStakingStore.refreshPosition(this.$order.getCurrencyPairId());
                CryptoStakingReviewDuxo.this.cryptoStakingStore.refreshCryptoSummary(this.$order.getCurrencyPairId());
                CryptoStakingReviewDuxo.this.cryptoHoldingStore.refresh(true);
                CryptoStakingReviewDuxo.this.cryptoStakingStore.refreshHistoryEndpoint(this.$order.getCurrencyPairId(), true);
                BooleanPreference isQuoteInputModePref = CryptoStakingReviewDuxo.this.getIsQuoteInputModePref();
                if (this.$order.getAmountType() != ApiCryptoStakingOrder.AmountType.FIAT) {
                    z = false;
                }
                isQuoteInputModePref.set(z);
                CryptoStakingReviewDuxo.this.applyMutation(new AnonymousClass2(uiCryptoStakingOrderModel, null));
                CryptoStakingReviewDuxo.this.submit(new CryptoStakingReviewEvent.OrderSubmissionSuccess(uiCryptoStakingOrderModel));
            } catch (Throwable th) {
                ErrorHandlingUtils.throwIfCancellation(th);
                if (!Throwables.isNetworkRelated(th)) {
                    StakingCrashReporter.logNonFatal$default(StakingCrashReporter.INSTANCE, th, "order_review", "submit_order", this.$order.getOrderType(), null, 16, null);
                }
                CryptoStakingReviewDuxo.this.applyMutation(new AnonymousClass3(null));
                CryptoStakingReviewDuxo.this.submit(new CryptoStakingReviewEvent.Error(th));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CryptoStakingReviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$submitOrder$1$2", m3645f = "CryptoStakingReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$submitOrder$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoStakingReviewDataState, Continuation<? super CryptoStakingReviewDataState>, Object> {
            final /* synthetic */ UiCryptoStakingOrderModel $submittedOrder;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(UiCryptoStakingOrderModel uiCryptoStakingOrderModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$submittedOrder = uiCryptoStakingOrderModel;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$submittedOrder, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoStakingReviewDataState cryptoStakingReviewDataState, Continuation<? super CryptoStakingReviewDataState> continuation) {
                return ((AnonymousClass2) create(cryptoStakingReviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoStakingReviewDataState.copy$default((CryptoStakingReviewDataState) this.L$0, null, null, false, this.$submittedOrder, false, null, null, 119, null);
            }
        }

        /* compiled from: CryptoStakingReviewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$submitOrder$1$3", m3645f = "CryptoStakingReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.staking.staking.review.CryptoStakingReviewDuxo$submitOrder$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CryptoStakingReviewDataState, Continuation<? super CryptoStakingReviewDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoStakingReviewDataState cryptoStakingReviewDataState, Continuation<? super CryptoStakingReviewDataState> continuation) {
                return ((AnonymousClass3) create(cryptoStakingReviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CryptoStakingReviewDataState.copy$default((CryptoStakingReviewDataState) this.L$0, null, null, false, null, false, null, null, 111, null);
            }
        }
    }

    public final void submitOrder(UiCryptoStakingOrderModel order, UUID idempotencyId) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(idempotencyId, "idempotencyId");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C378791(order, idempotencyId, null), 3, null);
    }

    /* compiled from: CryptoStakingReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDuxo$InitArgs;", "Landroid/os/Parcelable;", Card.Icon.ORDER, "Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;", "idempotencyId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;Ljava/util/UUID;)V", "getOrder", "()Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;", "getIdempotencyId", "()Ljava/util/UUID;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final UUID idempotencyId;
        private final UiCryptoStakingOrderModel order;

        /* compiled from: CryptoStakingReviewDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs((UiCryptoStakingOrderModel) parcel.readParcelable(InitArgs.class.getClassLoader()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, UiCryptoStakingOrderModel uiCryptoStakingOrderModel, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCryptoStakingOrderModel = initArgs.order;
            }
            if ((i & 2) != 0) {
                uuid = initArgs.idempotencyId;
            }
            return initArgs.copy(uiCryptoStakingOrderModel, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCryptoStakingOrderModel getOrder() {
            return this.order;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getIdempotencyId() {
            return this.idempotencyId;
        }

        public final InitArgs copy(UiCryptoStakingOrderModel order, UUID idempotencyId) {
            Intrinsics.checkNotNullParameter(order, "order");
            Intrinsics.checkNotNullParameter(idempotencyId, "idempotencyId");
            return new InitArgs(order, idempotencyId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitArgs)) {
                return false;
            }
            InitArgs initArgs = (InitArgs) other;
            return Intrinsics.areEqual(this.order, initArgs.order) && Intrinsics.areEqual(this.idempotencyId, initArgs.idempotencyId);
        }

        public int hashCode() {
            return (this.order.hashCode() * 31) + this.idempotencyId.hashCode();
        }

        public String toString() {
            return "InitArgs(order=" + this.order + ", idempotencyId=" + this.idempotencyId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.order, flags);
            dest.writeSerializable(this.idempotencyId);
        }

        public InitArgs(UiCryptoStakingOrderModel order, UUID idempotencyId) {
            Intrinsics.checkNotNullParameter(order, "order");
            Intrinsics.checkNotNullParameter(idempotencyId, "idempotencyId");
            this.order = order;
            this.idempotencyId = idempotencyId;
        }

        public final UiCryptoStakingOrderModel getOrder() {
            return this.order;
        }

        public final UUID getIdempotencyId() {
            return this.idempotencyId;
        }
    }

    /* compiled from: CryptoStakingReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDuxo;", "Lcom/robinhood/shared/crypto/staking/staking/review/CryptoStakingReviewDuxo$InitArgs;", "<init>", "()V", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<CryptoStakingReviewDuxo, InitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(CryptoStakingReviewDuxo cryptoStakingReviewDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, cryptoStakingReviewDuxo);
        }
    }
}
