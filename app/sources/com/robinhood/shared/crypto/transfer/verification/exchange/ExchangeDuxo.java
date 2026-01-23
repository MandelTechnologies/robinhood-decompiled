package com.robinhood.shared.crypto.transfer.verification.exchange;

import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.models.api.transfer.ApiCryptoTransferHistoryDetailResponse;
import com.robinhood.models.api.transfer.ApiCryptoVaspResponse;
import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse;
import com.robinhood.models.api.transfer.verification.ApiCryptoWithdrawalVerificationRequest;
import com.robinhood.shared.crypto.transfer.verification.VerificationType;
import com.robinhood.shared.crypto.transfer.verification.VerificationType2;
import com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo4;
import com.robinhood.utils.extensions.Throwables;
import com.singular.sdk.internal.Constants;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.coroutines.time.Time4;
import p479j$.time.Duration;

/* compiled from: ExchangeDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u000fJ\u0018\u0010\u001d\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001f\u001a\u00020\u001aR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeDataState;", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeViewState;", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeEvent;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeStateProvider;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeStateProvider;Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;)V", "query", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getQuery$feature_crypto_transfer_externalDebug", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "onCreate", "", "submit", "verificationId", "Ljava/util/UUID;", "verificationType", "Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "selection", "Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse$Vasp;", "onQueryChange", "newQuery", "onVaspSelected", "previous", "vasp", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class ExchangeDuxo extends BaseDuxo3<ExchangeDataState, ExchangeViewState, ExchangeDuxo4> {
    public static final int $stable = 8;
    private final CryptoTransfersStore cryptoTransfersStore;
    private final StateFlow2<String> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeDuxo(DuxoBundle duxoBundle, ExchangeDuxo5 stateProvider, CryptoTransfersStore cryptoTransfersStore) {
        super(new ExchangeDataState(false, null, null, null, 15, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.query = StateFlow4.MutableStateFlow("");
    }

    public final StateFlow2<String> getQuery$feature_crypto_transfer_externalDebug() {
        return this.query;
    }

    /* compiled from: ExchangeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onCreate$1", m3645f = "ExchangeDuxo.kt", m3646l = {73}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onCreate$1 */
    static final class C385401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C385401(Continuation<? super C385401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExchangeDuxo.this.new C385401(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C385401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2<String> query$feature_crypto_transfer_externalDebug = ExchangeDuxo.this.getQuery$feature_crypto_transfer_externalDebug();
                Duration durationOfMillis = Duration.ofMillis(250L);
                Intrinsics.checkNotNullExpressionValue(durationOfMillis, "ofMillis(...)");
                final Flow flowDebounce = Time4.debounce(query$feature_crypto_transfer_externalDebug, durationOfMillis);
                Flow flowM28818catch = FlowKt.m28818catch(FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onCreate$1$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onCreate$1$invokeSuspend$$inlined$filter$1$2 */
                    public static final class C385392<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onCreate$1$invokeSuspend$$inlined$filter$1$2", m3645f = "ExchangeDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onCreate$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C385392.this.emit(null, this);
                            }
                        }

                        public C385392(FlowCollector flowCollector) {
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
                                if (((String) obj).length() >= 3) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
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
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = flowDebounce.collect(new C385392(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }), new ExchangeDuxo$onCreate$1$invokeSuspend$$inlined$flatMapLatest$1(null, ExchangeDuxo.this)), new AnonymousClass3(ExchangeDuxo.this, null));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(ExchangeDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowM28818catch, anonymousClass4, this) == coroutine_suspended) {
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

        /* compiled from: ExchangeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onCreate$1$3", m3645f = "ExchangeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function3<FlowCollector<? super ApiCryptoVaspResponse>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ExchangeDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(ExchangeDuxo exchangeDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(3, continuation);
                this.this$0 = exchangeDuxo;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super ApiCryptoVaspResponse> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = th;
                return anonymousClass3.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Throwable {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.L$0;
                if (Throwables.isNetworkRelated(th)) {
                    this.this$0.applyMutation(new AnonymousClass1(null));
                    FlowKt.emptyFlow();
                    return Unit.INSTANCE;
                }
                throw th;
            }

            /* compiled from: ExchangeDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onCreate$1$3$1", m3645f = "ExchangeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ExchangeDataState, Continuation<? super ExchangeDataState>, Object> {
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
                public final Object invoke(ExchangeDataState exchangeDataState, Continuation<? super ExchangeDataState> continuation) {
                    return ((AnonymousClass1) create(exchangeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ExchangeDataState.copy$default((ExchangeDataState) this.L$0, false, null, null, null, 14, null);
                }
            }
        }

        /* compiled from: ExchangeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/models/api/transfer/ApiCryptoVaspResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onCreate$1$4", m3645f = "ExchangeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onCreate$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<ApiCryptoVaspResponse, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ExchangeDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(ExchangeDuxo exchangeDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = exchangeDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiCryptoVaspResponse apiCryptoVaspResponse, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(apiCryptoVaspResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ExchangeDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onCreate$1$4$1", m3645f = "ExchangeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onCreate$1$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ExchangeDataState, Continuation<? super ExchangeDataState>, Object> {
                final /* synthetic */ ApiCryptoVaspResponse $response;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ApiCryptoVaspResponse apiCryptoVaspResponse, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$response = apiCryptoVaspResponse;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ExchangeDataState exchangeDataState, Continuation<? super ExchangeDataState> continuation) {
                    return ((AnonymousClass1) create(exchangeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ExchangeDataState.copy$default((ExchangeDataState) this.L$0, false, null, null, this.$response, 6, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((ApiCryptoVaspResponse) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C385401(null));
    }

    /* compiled from: ExchangeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$submit$1", m3645f = "ExchangeDuxo.kt", m3646l = {92}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$submit$1 */
    static final class C385431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiCryptoVaspResponse.Vasp $selection;
        final /* synthetic */ UUID $verificationId;
        final /* synthetic */ VerificationType $verificationType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C385431(VerificationType verificationType, UUID uuid, ApiCryptoVaspResponse.Vasp vasp, Continuation<? super C385431> continuation) {
            super(2, continuation);
            this.$verificationType = verificationType;
            this.$verificationId = uuid;
            this.$selection = vasp;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExchangeDuxo.this.new C385431(this.$verificationType, this.$verificationId, this.$selection, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C385431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Exception {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ExchangeDuxo.this.applyMutation(new AnonymousClass1(null));
                    CryptoTransfersStore cryptoTransfersStore = ExchangeDuxo.this.cryptoTransfersStore;
                    ApiCryptoTransferHistoryDetailResponse.Type serverType = VerificationType2.getServerType(this.$verificationType);
                    UUID uuid = this.$verificationId;
                    ApiCryptoWithdrawalVerificationRequest apiCryptoWithdrawalVerificationRequest = new ApiCryptoWithdrawalVerificationRequest(null, null, null, new ApiCryptoWithdrawalVerificationRequest.CounterpartyVaspDetails(this.$selection.getDid()), null, 23, null);
                    this.label = 1;
                    obj = cryptoTransfersStore.updateVerification(serverType, uuid, apiCryptoWithdrawalVerificationRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ExchangeDuxo.this.submit(new ExchangeDuxo4.Success(this.$selection, (ApiCryptoVerificationResponse) obj));
                ExchangeDuxo.this.applyMutation(new AnonymousClass2(null));
            } catch (Exception e) {
                if (Throwables.isNetworkRelated(e)) {
                    ExchangeDuxo.this.applyMutation(new AnonymousClass3(null));
                    ExchangeDuxo.this.submit(new ExchangeDuxo4.Error(e));
                } else {
                    throw e;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: ExchangeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$submit$1$1", m3645f = "ExchangeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$submit$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ExchangeDataState, Continuation<? super ExchangeDataState>, Object> {
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
            public final Object invoke(ExchangeDataState exchangeDataState, Continuation<? super ExchangeDataState> continuation) {
                return ((AnonymousClass1) create(exchangeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ExchangeDataState.copy$default((ExchangeDataState) this.L$0, true, null, null, null, 14, null);
            }
        }

        /* compiled from: ExchangeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$submit$1$2", m3645f = "ExchangeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$submit$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ExchangeDataState, Continuation<? super ExchangeDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ExchangeDataState exchangeDataState, Continuation<? super ExchangeDataState> continuation) {
                return ((AnonymousClass2) create(exchangeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ExchangeDataState.copy$default((ExchangeDataState) this.L$0, false, null, null, null, 14, null);
            }
        }

        /* compiled from: ExchangeDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$submit$1$3", m3645f = "ExchangeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$submit$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<ExchangeDataState, Continuation<? super ExchangeDataState>, Object> {
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
            public final Object invoke(ExchangeDataState exchangeDataState, Continuation<? super ExchangeDataState> continuation) {
                return ((AnonymousClass3) create(exchangeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ExchangeDataState.copy$default((ExchangeDataState) this.L$0, false, null, null, null, 14, null);
            }
        }
    }

    public final void submit(UUID verificationId, VerificationType verificationType, ApiCryptoVaspResponse.Vasp selection) {
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(verificationType, "verificationType");
        Intrinsics.checkNotNullParameter(selection, "selection");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C385431(verificationType, verificationId, selection, null), 3, null);
    }

    /* compiled from: ExchangeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onQueryChange$1", m3645f = "ExchangeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onQueryChange$1 */
    static final class C385411 extends ContinuationImpl7 implements Function2<ExchangeDataState, Continuation<? super ExchangeDataState>, Object> {
        final /* synthetic */ String $newQuery;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C385411(String str, Continuation<? super C385411> continuation) {
            super(2, continuation);
            this.$newQuery = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C385411 c385411 = new C385411(this.$newQuery, continuation);
            c385411.L$0 = obj;
            return c385411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ExchangeDataState exchangeDataState, Continuation<? super ExchangeDataState> continuation) {
            return ((C385411) create(exchangeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ExchangeDataState.copy$default((ExchangeDataState) this.L$0, false, this.$newQuery, null, null, 13, null);
        }
    }

    public final void onQueryChange(String newQuery) {
        Intrinsics.checkNotNullParameter(newQuery, "newQuery");
        this.query.setValue(newQuery);
        applyMutation(new C385411(newQuery, null));
    }

    /* compiled from: ExchangeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/transfer/verification/exchange/ExchangeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onVaspSelected$1", m3645f = "ExchangeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeDuxo$onVaspSelected$1 */
    static final class C385421 extends ContinuationImpl7 implements Function2<ExchangeDataState, Continuation<? super ExchangeDataState>, Object> {
        final /* synthetic */ ApiCryptoVaspResponse.Vasp $previous;
        final /* synthetic */ ApiCryptoVaspResponse.Vasp $vasp;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C385421(ApiCryptoVaspResponse.Vasp vasp, ApiCryptoVaspResponse.Vasp vasp2, Continuation<? super C385421> continuation) {
            super(2, continuation);
            this.$previous = vasp;
            this.$vasp = vasp2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C385421 c385421 = new C385421(this.$previous, this.$vasp, continuation);
            c385421.L$0 = obj;
            return c385421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ExchangeDataState exchangeDataState, Continuation<? super ExchangeDataState> continuation) {
            return ((C385421) create(exchangeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ExchangeDataState.copy$default((ExchangeDataState) this.L$0, false, null, Intrinsics.areEqual(this.$previous, this.$vasp) ? null : this.$vasp, null, 11, null);
        }
    }

    public final void onVaspSelected(ApiCryptoVaspResponse.Vasp previous, ApiCryptoVaspResponse.Vasp vasp) {
        Intrinsics.checkNotNullParameter(vasp, "vasp");
        applyMutation(new C385421(previous, vasp, null));
    }
}
