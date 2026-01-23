package com.robinhood.android.crypto.costbasis.details.list;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.crypto.contracts.CryptoCostBasisDetailsIntentKey;
import com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListEvent;
import com.robinhood.android.crypto.costbasis.utils.CostBasisErrors4;
import com.robinhood.android.lib.formats.datetime.LocalizedDateTimeFormatter;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore;
import com.robinhood.models.crypto.p314db.costbasis.CryptoCostBasisDetails;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoCostBasisDetailsListDuxo.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0001\u001eBA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/list/CryptoCostBasisDetailsListDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/crypto/costbasis/details/list/CryptoCostBasisDetailsListDataState;", "Lcom/robinhood/android/crypto/costbasis/details/list/CryptoCostBasisDetailsListViewState;", "Lcom/robinhood/android/crypto/costbasis/details/list/CryptoCostBasisDetailsListEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/crypto/contracts/CryptoCostBasisDetailsIntentKey;", "cryptoCostBasisStore", "Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "currencyPairV2Store", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "localizedDateTimeFormatter", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "stateProvider", "Lcom/robinhood/android/crypto/costbasis/details/list/CryptoCostBasisDetailsListStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore;Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;Lcom/robinhood/android/crypto/costbasis/details/list/CryptoCostBasisDetailsListStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "getAccountId", "Ljava/util/UUID;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoCostBasisDetailsListDuxo extends BaseDuxo3<CryptoCostBasisDetailsListDataState, CryptoCostBasisDetailsListViewState, CryptoCostBasisDetailsListEvent> implements HasArgs<CryptoCostBasisDetailsIntentKey> {
    public static final String SOURCE_TYPE = "deposit";
    private final CryptoAccountStore cryptoAccountStore;
    private final CryptoCostBasisStore cryptoCostBasisStore;
    private final CurrencyPairV2Store currencyPairV2Store;
    private final SavedStateHandle savedStateHandle;
    public static final int $stable = 8;

    /* compiled from: CryptoCostBasisDetailsListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo", m3645f = "CryptoCostBasisDetailsListDuxo.kt", m3646l = {86}, m3647m = "getAccountId")
    /* renamed from: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo$getAccountId$1 */
    static final class C128601 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C128601(Continuation<? super C128601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CryptoCostBasisDetailsListDuxo.this.getAccountId(this);
        }
    }

    @Override // com.robinhood.android.udf.HasArgs
    public CryptoCostBasisDetailsIntentKey getArgs(SavedStateHandle savedStateHandle) {
        return (CryptoCostBasisDetailsIntentKey) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoCostBasisDetailsListDuxo(CryptoCostBasisStore cryptoCostBasisStore, CryptoAccountStore cryptoAccountStore, CurrencyPairV2Store currencyPairV2Store, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, LocalizedDateTimeFormatter localizedDateTimeFormatter, CryptoCostBasisDetailsListStateProvider stateProvider) {
        super(new CryptoCostBasisDetailsListDataState(localizedDateTimeFormatter, null, null, 6, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoCostBasisStore, "cryptoCostBasisStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.cryptoCostBasisStore = cryptoCostBasisStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.currencyPairV2Store = currencyPairV2Store;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C128611(null));
    }

    /* compiled from: CryptoCostBasisDetailsListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo$onCreate$1", m3645f = "CryptoCostBasisDetailsListDuxo.kt", m3646l = {54, 67}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo$onCreate$1 */
    static final class C128611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        C128611(Continuation<? super C128611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoCostBasisDetailsListDuxo.this.new C128611(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C128611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r7, r1, r6) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            UUID depositId;
            CryptoCostBasisStore cryptoCostBasisStore;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                if (!Throwables.isNetworkRelated(th)) {
                    throw th;
                }
                CryptoCostBasisDetailsListDuxo.this.submit(new CryptoCostBasisDetailsListEvent.Error(CostBasisErrors4.extractCostBasisErrorDetails(th)));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoCostBasisStore cryptoCostBasisStore2 = CryptoCostBasisDetailsListDuxo.this.cryptoCostBasisStore;
                CryptoCostBasisDetailsListDuxo cryptoCostBasisDetailsListDuxo = CryptoCostBasisDetailsListDuxo.this;
                depositId = ((CryptoCostBasisDetailsIntentKey) cryptoCostBasisDetailsListDuxo.getArgs(cryptoCostBasisDetailsListDuxo.getSavedStateHandle())).getDepositId();
                CryptoCostBasisDetailsListDuxo cryptoCostBasisDetailsListDuxo2 = CryptoCostBasisDetailsListDuxo.this;
                this.L$0 = cryptoCostBasisStore2;
                this.L$1 = depositId;
                this.label = 1;
                Object accountId = cryptoCostBasisDetailsListDuxo2.getAccountId(this);
                if (accountId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cryptoCostBasisStore = cryptoCostBasisStore2;
                obj = accountId;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                depositId = (UUID) this.L$1;
                cryptoCostBasisStore = (CryptoCostBasisStore) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.onEach(cryptoCostBasisStore.streamCostBasisDetails((UUID) obj, depositId, CryptoCostBasisDetailsListDuxo.SOURCE_TYPE), new AnonymousClass1(CryptoCostBasisDetailsListDuxo.this, null)), new C12859x24c20bea(null, CryptoCostBasisDetailsListDuxo.this));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(CryptoCostBasisDetailsListDuxo.this, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        }

        /* compiled from: CryptoCostBasisDetailsListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "costBasisDetails", "Lcom/robinhood/models/crypto/db/costbasis/CryptoCostBasisDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo$onCreate$1$1", m3645f = "CryptoCostBasisDetailsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoCostBasisDetails, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoCostBasisDetailsListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoCostBasisDetailsListDuxo cryptoCostBasisDetailsListDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoCostBasisDetailsListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoCostBasisDetails cryptoCostBasisDetails, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(cryptoCostBasisDetails, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoCostBasisDetailsListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/details/list/CryptoCostBasisDetailsListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo$onCreate$1$1$1", m3645f = "CryptoCostBasisDetailsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497331 extends ContinuationImpl7 implements Function2<CryptoCostBasisDetailsListDataState, Continuation<? super CryptoCostBasisDetailsListDataState>, Object> {
                final /* synthetic */ CryptoCostBasisDetails $costBasisDetails;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497331(CryptoCostBasisDetails cryptoCostBasisDetails, Continuation<? super C497331> continuation) {
                    super(2, continuation);
                    this.$costBasisDetails = cryptoCostBasisDetails;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497331 c497331 = new C497331(this.$costBasisDetails, continuation);
                    c497331.L$0 = obj;
                    return c497331;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoCostBasisDetailsListDataState cryptoCostBasisDetailsListDataState, Continuation<? super CryptoCostBasisDetailsListDataState> continuation) {
                    return ((C497331) create(cryptoCostBasisDetailsListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoCostBasisDetailsListDataState.copy$default((CryptoCostBasisDetailsListDataState) this.L$0, null, null, this.$costBasisDetails, 3, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497331((CryptoCostBasisDetails) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: CryptoCostBasisDetailsListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo$onCreate$1$3", m3645f = "CryptoCostBasisDetailsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoCostBasisDetailsListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoCostBasisDetailsListDuxo cryptoCostBasisDetailsListDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoCostBasisDetailsListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoCostBasisDetailsListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/details/list/CryptoCostBasisDetailsListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo$onCreate$1$3$1", m3645f = "CryptoCostBasisDetailsListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoCostBasisDetailsListDataState, Continuation<? super CryptoCostBasisDetailsListDataState>, Object> {
                final /* synthetic */ UiCurrencyPair $currencyPair;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(UiCurrencyPair uiCurrencyPair, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$currencyPair = uiCurrencyPair;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currencyPair, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoCostBasisDetailsListDataState cryptoCostBasisDetailsListDataState, Continuation<? super CryptoCostBasisDetailsListDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoCostBasisDetailsListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoCostBasisDetailsListDataState.copy$default((CryptoCostBasisDetailsListDataState) this.L$0, null, this.$currencyPair, null, 5, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((UiCurrencyPair) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAccountId(Continuation<? super UUID> continuation) {
        C128601 c128601;
        if (continuation instanceof C128601) {
            c128601 = (C128601) continuation;
            int i = c128601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c128601.label = i - Integer.MIN_VALUE;
            } else {
                c128601 = new C128601(continuation);
            }
        }
        Object objFirst = c128601.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c128601.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            UUID accountId = ((CryptoCostBasisDetailsIntentKey) getArgs(getSavedStateHandle())).getAccountId();
            if (accountId != null) {
                return accountId;
            }
            Flow<String> flowStreamAccountId = this.cryptoAccountStore.streamAccountId();
            c128601.label = 1;
            objFirst = FlowKt.first(flowStreamAccountId, c128601);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        return StringsKt.toUuid((String) objFirst);
    }
}
