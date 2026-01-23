package com.robinhood.android.cortex.store.portfolio;

import bonfire.proto.idl.copilot.p032v1.CopilotService;
import bonfire.proto.idl.copilot.p032v1.SubmitPortfolioDigestReadRequestDto;
import com.robinhood.android.cortex.models.ArticleSource;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.Optional;
import com.robinhood.utils.datetime.Durations;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: PortfolioDigestStore.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001a2\u0006\u0010\u0017\u001a\u00020\u000bJ\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001a2\u0006\u0010\u0017\u001a\u00020\u000bJ\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u001a2\u0006\u0010\u0017\u001a\u00020\u000bJ\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestStore;", "Lcom/robinhood/store/Store;", "copilotService", "Lbonfire/proto/idl/copilot/v1/CopilotService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lbonfire/proto/idl/copilot/v1/CopilotService;Lcom/robinhood/store/StoreBundle;)V", "digestCacheFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "Lcom/robinhood/android/cortex/models/portfolio/PortfolioDigest;", "sourcesCacheFlow", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/cortex/models/ArticleSource;", "digestEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/cortex/store/portfolio/PortfolioDigestResult;", "digestQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/utils/Optional;", "forceFetch", "accountNumber", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "poll", "Lkotlinx/coroutines/flow/Flow;", "stream", "streamArticleSources", "submitRead", "", "digestId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-cortex_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PortfolioDigestStore extends Store {
    public static final int $stable = 8;
    private final CopilotService copilotService;
    private final StateFlow2<Map<String, PortfolioDigest>> digestCacheFlow;
    private final Endpoint<String, PortfolioDigestStore2> digestEndpoint;
    private final Query<String, Optional<PortfolioDigest>> digestQuery;
    private final StateFlow2<Map<String, ImmutableList<ArticleSource>>> sourcesCacheFlow;

    /* compiled from: PortfolioDigestStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore", m3645f = "PortfolioDigestStore.kt", m3646l = {117}, m3647m = "submitRead")
    /* renamed from: com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$submitRead$1 */
    static final class C122001 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C122001(Continuation<? super C122001> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PortfolioDigestStore.this.submitRead(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioDigestStore(CopilotService copilotService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(copilotService, "copilotService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.copilotService = copilotService;
        this.digestCacheFlow = StateFlow4.MutableStateFlow(MapsKt.emptyMap());
        this.sourcesCacheFlow = StateFlow4.MutableStateFlow(MapsKt.emptyMap());
        Endpoint.Companion companion = Endpoint.INSTANCE;
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        Clock clock = storeBundle.getClock();
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        this.digestEndpoint = companion.create(new PortfolioDigestStore3(this, null), logoutKillswitch, new PortfolioDigestStore4(this, null), clock, new DefaultStaleDecider(durationOfMinutes, storeBundle.getClock()));
        this.digestQuery = Store.createOptional$default(this, Query.INSTANCE, "getDigestForInstrument", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PortfolioDigestStore.digestQuery$lambda$0(this.f$0, (String) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PortfolioDigestStore.digestQuery$lambda$2(this.f$0, (String) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow digestQuery$lambda$0(PortfolioDigestStore portfolioDigestStore, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<String, PortfolioDigestStore2> endpoint = portfolioDigestStore.digestEndpoint;
        Duration durationOfMinutes = Duration.ofMinutes(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, it, durationOfMinutes, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow digestQuery$lambda$2(PortfolioDigestStore portfolioDigestStore, final String params) {
        Intrinsics.checkNotNullParameter(params, "params");
        final StateFlow2<Map<String, PortfolioDigest>> stateFlow2 = portfolioDigestStore.digestCacheFlow;
        return FlowKt.distinctUntilChanged(new Flow<PortfolioDigest>() { // from class: com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$digestQuery$lambda$2$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$digestQuery$lambda$2$$inlined$map$1$2 */
            public static final class C121962<T> implements FlowCollector {
                final /* synthetic */ String $params$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$digestQuery$lambda$2$$inlined$map$1$2", m3645f = "PortfolioDigestStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$digestQuery$lambda$2$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C121962.this.emit(null, this);
                    }
                }

                public C121962(FlowCollector flowCollector, String str) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$params$inlined = str;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object obj3 = ((Map) obj).get(this.$params$inlined);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super PortfolioDigest> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new C121962(flowCollector, params), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    public final Object forceFetch(String str, Continuation<? super PortfolioDigestStore2> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.digestEndpoint, str, null, continuation, 2, null);
    }

    public final Flow<PortfolioDigest> poll(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        final Flow flowPoll$default = Endpoint.DefaultImpls.poll$default(this.digestEndpoint, accountNumber, Durations.INSTANCE.getONE_SECOND(), null, 4, null);
        return new Flow<PortfolioDigest>() { // from class: com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$poll$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$poll$$inlined$map$1$2 */
            public static final class C121972<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$poll$$inlined$map$1$2", m3645f = "PortfolioDigestStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$poll$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C121972.this.emit(null, this);
                    }
                }

                public C121972(FlowCollector flowCollector) {
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
                        PortfolioDigest digest = ((PortfolioDigestStore2) obj).getDigest();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(digest, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super PortfolioDigest> flowCollector, Continuation continuation) {
                Object objCollect = flowPoll$default.collect(new C121972(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Flow<PortfolioDigest> stream(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        final Flow<Optional<PortfolioDigest>> flowAsFlow = this.digestQuery.asFlow(accountNumber);
        return new Flow<PortfolioDigest>() { // from class: com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$stream$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$stream$$inlined$map$1$2 */
            public static final class C121982<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$stream$$inlined$map$1$2", m3645f = "PortfolioDigestStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$stream$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C121982.this.emit(null, this);
                    }
                }

                public C121982(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object orNull = ((Optional) obj).getOrNull();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super PortfolioDigest> flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new C121982(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Flow<ImmutableList<ArticleSource>> streamArticleSources(final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        final StateFlow2<Map<String, ImmutableList<ArticleSource>>> stateFlow2 = this.sourcesCacheFlow;
        return FlowKt.distinctUntilChanged(new Flow<ImmutableList<? extends ArticleSource>>() { // from class: com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$streamArticleSources$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$streamArticleSources$$inlined$map$1$2 */
            public static final class C121992<T> implements FlowCollector {
                final /* synthetic */ String $accountNumber$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$streamArticleSources$$inlined$map$1$2", m3645f = "PortfolioDigestStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.cortex.store.portfolio.PortfolioDigestStore$streamArticleSources$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C121992.this.emit(null, this);
                    }
                }

                public C121992(FlowCollector flowCollector, String str) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$accountNumber$inlined = str;
                }

                /* JADX WARN: Multi-variable type inference failed */
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
                        Object obj3 = ((Map) obj).get(this.$accountNumber$inlined);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super ImmutableList<? extends ArticleSource>> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new C121992(flowCollector, accountNumber), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object submitRead(String str, String str2, Continuation<? super Unit> continuation) {
        C122001 c122001;
        String str3;
        Map<String, PortfolioDigest> value;
        ArrayList arrayList;
        Tuples2 tuples2M3642to;
        if (continuation instanceof C122001) {
            c122001 = (C122001) continuation;
            int i = c122001.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c122001.label = i - Integer.MIN_VALUE;
            } else {
                c122001 = new C122001(continuation);
            }
        }
        Object obj = c122001.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c122001.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            CopilotService copilotService = this.copilotService;
            SubmitPortfolioDigestReadRequestDto submitPortfolioDigestReadRequestDto = new SubmitPortfolioDigestReadRequestDto(str);
            c122001.L$0 = str2;
            c122001.label = 1;
            if (copilotService.SubmitPortfolioDigestRead(submitPortfolioDigestReadRequestDto, c122001) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str3 = str2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) c122001.L$0;
            ResultKt.throwOnFailure(obj);
        }
        StateFlow2<Map<String, PortfolioDigest>> stateFlow2 = this.digestCacheFlow;
        do {
            value = stateFlow2.getValue();
            Map<String, PortfolioDigest> map = value;
            arrayList = new ArrayList(map.size());
            for (Map.Entry<String, PortfolioDigest> entry : map.entrySet()) {
                String key = entry.getKey();
                PortfolioDigest value2 = entry.getValue();
                if (Intrinsics.areEqual(key, str3) && (value2 instanceof PortfolioDigest.HasOnboarded)) {
                    tuples2M3642to = Tuples4.m3642to(key, PortfolioDigest.HasOnboarded.copy$default((PortfolioDigest.HasOnboarded) value2, null, null, null, null, null, null, true, 63, null));
                } else {
                    tuples2M3642to = Tuples4.m3642to(key, value2);
                }
                arrayList.add(tuples2M3642to);
            }
        } while (!stateFlow2.compareAndSet(value, MapsKt.toMap(arrayList)));
        return Unit.INSTANCE;
    }
}
