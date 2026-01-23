package com.robinhood.android.cortex.store.feedback;

import bonfire.proto.idl.copilot.p032v1.CopilotService;
import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: DigestFeedbackStore.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\u0006\u0010\u0019\u001a\u00020\u000bJ\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\u0006\u0010\u0019\u001a\u00020\u000bJ\u0016\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\fH\u0082@¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/cortex/store/feedback/DigestFeedbackStore;", "Lcom/robinhood/store/Store;", "copilotService", "Lbonfire/proto/idl/copilot/v1/CopilotService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lbonfire/proto/idl/copilot/v1/CopilotService;Lcom/robinhood/store/StoreBundle;)V", "feedbackCacheFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "assetFeedbackEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback$Asset;", "portfolioFeedbackEndpoint", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback$Portfolio;", "assetFeedbackQuery", "Lcom/robinhood/android/moria/db/Query;", "portfolioFeedbackQuery", "submitFeedbackEndpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "getAssetDigestFeedback", "Lkotlinx/coroutines/flow/Flow;", "digestId", "getPortfolioDigestFeedback", "submitFeedback", "newFeedback", "(Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAction", "", "feedback", "lib-store-cortex_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DigestFeedbackStore extends Store {
    public static final int $stable = 8;
    private final Endpoint<String, DigestFeedback.Asset> assetFeedbackEndpoint;
    private final Query<String, DigestFeedback> assetFeedbackQuery;
    private final CopilotService copilotService;
    private final StateFlow2<Map<String, DigestFeedback>> feedbackCacheFlow;
    private final Endpoint<String, DigestFeedback.Portfolio> portfolioFeedbackEndpoint;
    private final Query<String, DigestFeedback> portfolioFeedbackQuery;
    private final PostEndpoint<DigestFeedback, DigestFeedback> submitFeedbackEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigestFeedbackStore(CopilotService copilotService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(copilotService, "copilotService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.copilotService = copilotService;
        this.feedbackCacheFlow = StateFlow4.MutableStateFlow(MapsKt.emptyMap());
        Endpoint.Companion companion = Endpoint.INSTANCE;
        Endpoint<String, DigestFeedback.Asset> endpointCreate$default = Endpoint.Companion.create$default(companion, new DigestFeedbackStore2(this, null), getLogoutKillswitch(), new DigestFeedbackStore3(this), storeBundle.getClock(), null, 16, null);
        this.assetFeedbackEndpoint = endpointCreate$default;
        Endpoint<String, DigestFeedback.Portfolio> endpointCreate$default2 = Endpoint.Companion.create$default(companion, new DigestFeedbackStore5(this, null), getLogoutKillswitch(), new DigestFeedbackStore6(this), storeBundle.getClock(), null, 16, null);
        this.portfolioFeedbackEndpoint = endpointCreate$default2;
        Query.Companion companion2 = Query.INSTANCE;
        this.assetFeedbackQuery = Store.create$default(this, companion2, "getFeedbackByDigest", CollectionsKt.listOf(new RefreshEach(new DigestFeedbackStore4(endpointCreate$default))), new Function1() { // from class: com.robinhood.android.cortex.store.feedback.DigestFeedbackStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DigestFeedbackStore.assetFeedbackQuery$lambda$1(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.portfolioFeedbackQuery = Store.create$default(this, companion2, "getPortfolioFeedbackByDigest", CollectionsKt.listOf(new RefreshEach(new DigestFeedbackStore7(endpointCreate$default2))), new Function1() { // from class: com.robinhood.android.cortex.store.feedback.DigestFeedbackStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DigestFeedbackStore.portfolioFeedbackQuery$lambda$4(this.f$0, (String) obj);
            }
        }, false, 8, null);
        this.submitFeedbackEndpoint = PostEndpoint.INSTANCE.create(new DigestFeedbackStore8(this, null), new DigestFeedbackStore9(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow assetFeedbackQuery$lambda$1(DigestFeedbackStore digestFeedbackStore, final String params) {
        Intrinsics.checkNotNullParameter(params, "params");
        final StateFlow2<Map<String, DigestFeedback>> stateFlow2 = digestFeedbackStore.feedbackCacheFlow;
        return FlowKt.distinctUntilChanged(new Flow<DigestFeedback>() { // from class: com.robinhood.android.cortex.store.feedback.DigestFeedbackStore$assetFeedbackQuery$lambda$1$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.cortex.store.feedback.DigestFeedbackStore$assetFeedbackQuery$lambda$1$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ String $params$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.store.feedback.DigestFeedbackStore$assetFeedbackQuery$lambda$1$$inlined$mapNotNull$1$2", m3645f = "DigestFeedbackStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.cortex.store.feedback.DigestFeedbackStore$assetFeedbackQuery$lambda$1$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, String str) {
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
                        if (obj3 != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super DigestFeedback> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector, params), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow portfolioFeedbackQuery$lambda$4(DigestFeedbackStore digestFeedbackStore, final String params) {
        Intrinsics.checkNotNullParameter(params, "params");
        final StateFlow2<Map<String, DigestFeedback>> stateFlow2 = digestFeedbackStore.feedbackCacheFlow;
        return FlowKt.distinctUntilChanged(new Flow<DigestFeedback>() { // from class: com.robinhood.android.cortex.store.feedback.DigestFeedbackStore$portfolioFeedbackQuery$lambda$4$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.cortex.store.feedback.DigestFeedbackStore$portfolioFeedbackQuery$lambda$4$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ String $params$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.cortex.store.feedback.DigestFeedbackStore$portfolioFeedbackQuery$lambda$4$$inlined$mapNotNull$1$2", m3645f = "DigestFeedbackStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.android.cortex.store.feedback.DigestFeedbackStore$portfolioFeedbackQuery$lambda$4$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, String str) {
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
                        if (obj3 != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super DigestFeedback> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector, params), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    public final Flow<DigestFeedback> getAssetDigestFeedback(String digestId) {
        Intrinsics.checkNotNullParameter(digestId, "digestId");
        return this.assetFeedbackQuery.asFlow(digestId);
    }

    public final Flow<DigestFeedback> getPortfolioDigestFeedback(String digestId) {
        Intrinsics.checkNotNullParameter(digestId, "digestId");
        return this.portfolioFeedbackQuery.asFlow(digestId);
    }

    public final Object submitFeedback(DigestFeedback digestFeedback, Continuation<? super DigestFeedback> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.submitFeedbackEndpoint, digestFeedback, null, continuation, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveAction(DigestFeedback digestFeedback, Continuation<? super Unit> continuation) {
        Tuples2 tuples2M3642to = Tuples4.m3642to(digestFeedback.getDigestId(), digestFeedback);
        StateFlow2<Map<String, DigestFeedback>> stateFlow2 = this.feedbackCacheFlow;
        Object objEmit = stateFlow2.emit(MapsKt.plus(stateFlow2.getValue(), tuples2M3642to), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }
}
