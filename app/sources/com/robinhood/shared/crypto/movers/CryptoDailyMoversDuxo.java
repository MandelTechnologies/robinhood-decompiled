package com.robinhood.shared.crypto.movers;

import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore;
import com.robinhood.models.api.trading.CryptoTradingAssetType;
import com.robinhood.models.api.trading.CryptoTradingOptionsLocation;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoDailyMoversDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversDataState;", "Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversViewState;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversStateProvider;", "cryptoTradingOptionsStore", "Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore;", "<init>", "(Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversStateProvider;Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore;)V", "bind", "Lkotlinx/coroutines/Job;", "location", "Lcom/robinhood/models/api/trading/CryptoTradingOptionsLocation;", "tabOverride", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "lib-crypto-movers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoDailyMoversDuxo extends BaseDuxo<CryptoDailyMoversDataState, CryptoDailyMoversViewState> {
    public static final int $stable = 8;
    private final CryptoTradingOptionsStore cryptoTradingOptionsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoDailyMoversDuxo(AuthManager authManager, DuxoBundle duxoBundle, CryptoDailyMoversDuxo3 stateProvider, CryptoTradingOptionsStore cryptoTradingOptionsStore) {
        super(new CryptoDailyMoversDataState(authManager.isLoggedIn(), null, false, null, 8, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(cryptoTradingOptionsStore, "cryptoTradingOptionsStore");
        this.cryptoTradingOptionsStore = cryptoTradingOptionsStore;
    }

    public static /* synthetic */ Job bind$default(CryptoDailyMoversDuxo cryptoDailyMoversDuxo, CryptoTradingOptionsLocation cryptoTradingOptionsLocation, FragmentTab fragmentTab, int i, Object obj) {
        if ((i & 2) != 0) {
            fragmentTab = null;
        }
        return cryptoDailyMoversDuxo.bind(cryptoTradingOptionsLocation, fragmentTab);
    }

    /* compiled from: CryptoDailyMoversDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.movers.CryptoDailyMoversDuxo$bind$1", m3645f = "CryptoDailyMoversDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.crypto.movers.CryptoDailyMoversDuxo$bind$1 */
    static final class C377371 extends ContinuationImpl7 implements Function2<CryptoDailyMoversDataState, Continuation<? super CryptoDailyMoversDataState>, Object> {
        final /* synthetic */ FragmentTab $tabOverride;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C377371(FragmentTab fragmentTab, Continuation<? super C377371> continuation) {
            super(2, continuation);
            this.$tabOverride = fragmentTab;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C377371 c377371 = new C377371(this.$tabOverride, continuation);
            c377371.L$0 = obj;
            return c377371;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoDailyMoversDataState cryptoDailyMoversDataState, Continuation<? super CryptoDailyMoversDataState> continuation) {
            return ((C377371) create(cryptoDailyMoversDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CryptoDailyMoversDataState.copy$default((CryptoDailyMoversDataState) this.L$0, false, null, false, this.$tabOverride, 7, null);
        }
    }

    /* compiled from: CryptoDailyMoversDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.crypto.movers.CryptoDailyMoversDuxo$bind$2", m3645f = "CryptoDailyMoversDuxo.kt", m3646l = {63}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.movers.CryptoDailyMoversDuxo$bind$2 */
    static final class C377382 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CryptoTradingOptionsLocation $location;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C377382(CryptoTradingOptionsLocation cryptoTradingOptionsLocation, Continuation<? super C377382> continuation) {
            super(2, continuation);
            this.$location = cryptoTradingOptionsLocation;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoDailyMoversDuxo.this.new C377382(this.$location, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C377382) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowStreamTradingOptions$default = CryptoTradingOptionsStore.streamTradingOptions$default(CryptoDailyMoversDuxo.this.cryptoTradingOptionsStore, this.$location, CryptoTradingAssetType.CRYPTO, null, null, null, 28, null);
                Flow flowM28818catch = FlowKt.m28818catch(new Flow<Optional<? extends CryptoTradingOptions>>() { // from class: com.robinhood.shared.crypto.movers.CryptoDailyMoversDuxo$bind$2$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.movers.CryptoDailyMoversDuxo$bind$2$invokeSuspend$$inlined$map$1$2 */
                    public static final class C377362<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.movers.CryptoDailyMoversDuxo$bind$2$invokeSuspend$$inlined$map$1$2", m3645f = "CryptoDailyMoversDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.crypto.movers.CryptoDailyMoversDuxo$bind$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C377362.this.emit(null, this);
                            }
                        }

                        public C377362(FlowCollector flowCollector) {
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
                                Optional optionalAsOptional = Optional3.asOptional((CryptoTradingOptions) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(optionalAsOptional, anonymousClass1) == coroutine_suspended) {
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
                    public Object collect(FlowCollector<? super Optional<? extends CryptoTradingOptions>> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamTradingOptions$default.collect(new C377362(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, new AnonymousClass2(CryptoDailyMoversDuxo.this, null));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CryptoDailyMoversDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowM28818catch, anonymousClass3, this) == coroutine_suspended) {
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

        /* compiled from: CryptoDailyMoversDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.movers.CryptoDailyMoversDuxo$bind$2$2", m3645f = "CryptoDailyMoversDuxo.kt", m3646l = {61}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.movers.CryptoDailyMoversDuxo$bind$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<FlowCollector<? super Optional<? extends CryptoTradingOptions>>, Throwable, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoDailyMoversDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoDailyMoversDuxo cryptoDailyMoversDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
                this.this$0 = cryptoDailyMoversDuxo;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Optional<? extends CryptoTradingOptions>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                return invoke2((FlowCollector<? super Optional<CryptoTradingOptions>>) flowCollector, th, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(FlowCollector<? super Optional<CryptoTradingOptions>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = flowCollector;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoDailyMoversDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.movers.CryptoDailyMoversDuxo$bind$2$2$1", m3645f = "CryptoDailyMoversDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.movers.CryptoDailyMoversDuxo$bind$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoDailyMoversDataState, Continuation<? super CryptoDailyMoversDataState>, Object> {
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
                public final Object invoke(CryptoDailyMoversDataState cryptoDailyMoversDataState, Continuation<? super CryptoDailyMoversDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoDailyMoversDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoDailyMoversDataState.copy$default((CryptoDailyMoversDataState) this.L$0, false, null, true, null, 11, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    this.this$0.applyMutation(new AnonymousClass1(null));
                    Optional2 optional2 = Optional2.INSTANCE;
                    this.label = 1;
                    if (flowCollector.emit(optional2, this) == coroutine_suspended) {
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

        /* compiled from: CryptoDailyMoversDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.crypto.movers.CryptoDailyMoversDuxo$bind$2$3", m3645f = "CryptoDailyMoversDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.crypto.movers.CryptoDailyMoversDuxo$bind$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Optional<? extends CryptoTradingOptions>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoDailyMoversDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoDailyMoversDuxo cryptoDailyMoversDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDailyMoversDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<CryptoTradingOptions> optional, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends CryptoTradingOptions> optional, Continuation<? super Unit> continuation) {
                return invoke2((Optional<CryptoTradingOptions>) optional, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoTradingOptions cryptoTradingOptions = (CryptoTradingOptions) ((Optional) this.L$0).component1();
                if (cryptoTradingOptions != null) {
                    this.this$0.applyMutation(new AnonymousClass1(cryptoTradingOptions, null));
                }
                return Unit.INSTANCE;
            }

            /* compiled from: CryptoDailyMoversDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.crypto.movers.CryptoDailyMoversDuxo$bind$2$3$1", m3645f = "CryptoDailyMoversDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.crypto.movers.CryptoDailyMoversDuxo$bind$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoDailyMoversDataState, Continuation<? super CryptoDailyMoversDataState>, Object> {
                final /* synthetic */ CryptoTradingOptions $response;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CryptoTradingOptions cryptoTradingOptions, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$response = cryptoTradingOptions;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$response, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoDailyMoversDataState cryptoDailyMoversDataState, Continuation<? super CryptoDailyMoversDataState> continuation) {
                    return ((AnonymousClass1) create(cryptoDailyMoversDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoDailyMoversDataState.copy$default((CryptoDailyMoversDataState) this.L$0, false, this.$response, false, null, 9, null);
                }
            }
        }
    }

    public final Job bind(CryptoTradingOptionsLocation location, FragmentTab tabOverride) {
        Intrinsics.checkNotNullParameter(location, "location");
        applyMutation(new C377371(tabOverride, null));
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C377382(location, null), 3, null);
    }
}
