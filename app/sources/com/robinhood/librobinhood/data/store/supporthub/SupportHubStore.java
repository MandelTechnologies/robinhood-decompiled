package com.robinhood.librobinhood.data.store.supporthub;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.supporthub.SupportHubApi;
import com.robinhood.models.api.supporthub.ApiConciergeEligibility;
import com.robinhood.models.api.supporthub.ApiPostConciergeOnboarding;
import com.robinhood.models.api.supporthub.ApiPrioritySupportChannelAvailability;
import com.robinhood.models.p355ui.supporthub.ChannelAvailability3;
import com.robinhood.models.p355ui.supporthub.PrioritySupportChannelAvailability;
import com.robinhood.models.p355ui.supporthub.RecommendedActions;
import com.robinhood.models.p355ui.supporthub.SupportHub;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: SupportHubStore.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010 J\u000e\u0010!\u001a\u00020\"H\u0086@¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/supporthub/SupportHubStore;", "Lcom/robinhood/store/Store;", "supportHubApi", "Lcom/robinhood/api/supporthub/SupportHubApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/supporthub/SupportHubApi;Lcom/robinhood/store/StoreBundle;)V", "supportHubFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/models/ui/supporthub/SupportHub;", "supportHubEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "recommendedActionsFlow", "Lcom/robinhood/models/ui/supporthub/RecommendedActions;", "recommendedActionsEndpoint", "refresh", "Lkotlinx/coroutines/Job;", "hasSupportHubCache", "", "streamSupportHub", "Lkotlinx/coroutines/flow/Flow;", "streamRecommendedActions", "handleError", "t", "", "isEligibleForConciergeOnboardingExperience", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markConciergeOnboardingCheckpoint", "onboarded", "optInSms", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lkotlinx/coroutines/Job;", "getPrioritySupportChannelAvailability", "Lcom/robinhood/models/ui/supporthub/PrioritySupportChannelAvailability;", "lib-store-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SupportHubStore extends Store {
    private final Endpoint<Unit, RecommendedActions> recommendedActionsEndpoint;
    private final StateFlow2<RecommendedActions> recommendedActionsFlow;
    private final SupportHubApi supportHubApi;
    private final Endpoint<Unit, SupportHub> supportHubEndpoint;
    private final StateFlow2<SupportHub> supportHubFlow;

    /* compiled from: SupportHubStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.supporthub.SupportHubStore", m3645f = "SupportHubStore.kt", m3646l = {114}, m3647m = "getPrioritySupportChannelAvailability")
    /* renamed from: com.robinhood.librobinhood.data.store.supporthub.SupportHubStore$getPrioritySupportChannelAvailability$1 */
    static final class C348891 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C348891(Continuation<? super C348891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportHubStore.this.getPrioritySupportChannelAvailability(this);
        }
    }

    /* compiled from: SupportHubStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.supporthub.SupportHubStore", m3645f = "SupportHubStore.kt", m3646l = {90}, m3647m = "isEligibleForConciergeOnboardingExperience")
    /* renamed from: com.robinhood.librobinhood.data.store.supporthub.SupportHubStore$isEligibleForConciergeOnboardingExperience$1 */
    static final class C348901 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C348901(Continuation<? super C348901> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportHubStore.this.isEligibleForConciergeOnboardingExperience(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportHubStore(SupportHubApi supportHubApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(supportHubApi, "supportHubApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.supportHubApi = supportHubApi;
        this.supportHubFlow = StateFlow4.MutableStateFlow(null);
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.supportHubEndpoint = Endpoint.Companion.create$default(companion, new SupportHubStore4(this, null), getLogoutKillswitch(), new SupportHubStore5(this, null), storeBundle.getClock(), null, 16, null);
        this.recommendedActionsFlow = StateFlow4.MutableStateFlow(null);
        this.recommendedActionsEndpoint = Endpoint.Companion.create$default(companion, new SupportHubStore2(this, null), getLogoutKillswitch(), new SupportHubStore3(this, null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: SupportHubStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.supporthub.SupportHubStore$refresh$1", m3645f = "SupportHubStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.supporthub.SupportHubStore$refresh$1 */
    static final class C348921 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C348921(Continuation<? super C348921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C348921 c348921 = SupportHubStore.this.new C348921(continuation);
            c348921.L$0 = obj;
            return c348921;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C348921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SupportHubStore.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.supporthub.SupportHubStore$refresh$1$1", m3645f = "SupportHubStore.kt", m3646l = {54}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.librobinhood.data.store.supporthub.SupportHubStore$refresh$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SupportHubStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SupportHubStore supportHubStore, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = supportHubStore;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                AnonymousClass1 anonymousClass1;
                Throwable th;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Endpoint endpoint = this.this$0.supportHubEndpoint;
                        Unit unit = Unit.INSTANCE;
                        this.label = 1;
                        anonymousClass1 = this;
                        try {
                            if (Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, anonymousClass1, 2, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            anonymousClass1.this$0.handleError(th);
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        anonymousClass1 = this;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        anonymousClass1 = this;
                        anonymousClass1.this$0.handleError(th);
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(SupportHubStore.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(SupportHubStore.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: SupportHubStore.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.supporthub.SupportHubStore$refresh$1$2", m3645f = "SupportHubStore.kt", m3646l = {62}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.librobinhood.data.store.supporthub.SupportHubStore$refresh$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SupportHubStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SupportHubStore supportHubStore, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = supportHubStore;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                AnonymousClass2 anonymousClass2;
                Throwable th;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Endpoint endpoint = this.this$0.recommendedActionsEndpoint;
                        Unit unit = Unit.INSTANCE;
                        this.label = 1;
                        anonymousClass2 = this;
                        try {
                            if (Endpoint.DefaultImpls.forceFetch$default(endpoint, unit, null, anonymousClass2, 2, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            anonymousClass2.this$0.handleError(th);
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        anonymousClass2 = this;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        anonymousClass2 = this;
                        anonymousClass2.this$0.handleError(th);
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final Job refresh() {
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C348921(null), 3, null);
    }

    public final boolean hasSupportHubCache() {
        return this.supportHubFlow.getValue() != null;
    }

    public final Flow<SupportHub> streamSupportHub() {
        return FlowKt.filterNotNull(this.supportHubFlow);
    }

    public final Flow<RecommendedActions> streamRecommendedActions() {
        return FlowKt.filterNotNull(this.recommendedActionsFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(Throwable t) {
        if (Throwables.isNetworkRelated(t)) {
            return;
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, t, true, null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isEligibleForConciergeOnboardingExperience(Continuation<? super Boolean> continuation) {
        C348901 c348901;
        if (continuation instanceof C348901) {
            c348901 = (C348901) continuation;
            int i = c348901.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c348901.label = i - Integer.MIN_VALUE;
            } else {
                c348901 = new C348901(continuation);
            }
        }
        Object conciergeEligibility = c348901.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c348901.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(conciergeEligibility);
            SupportHubApi supportHubApi = this.supportHubApi;
            c348901.label = 1;
            conciergeEligibility = supportHubApi.getConciergeEligibility(c348901);
            if (conciergeEligibility == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(conciergeEligibility);
        }
        return boxing.boxBoolean((!r5.getHasSeenOnboarding()) & ((ApiConciergeEligibility) conciergeEligibility).isEligible());
    }

    /* compiled from: SupportHubStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.supporthub.SupportHubStore$markConciergeOnboardingCheckpoint$1", m3645f = "SupportHubStore.kt", m3646l = {99}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.supporthub.SupportHubStore$markConciergeOnboardingCheckpoint$1 */
    static final class C348911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Boolean $onboarded;
        final /* synthetic */ Boolean $optInSms;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C348911(Boolean bool, Boolean bool2, Continuation<? super C348911> continuation) {
            super(2, continuation);
            this.$onboarded = bool;
            this.$optInSms = bool2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportHubStore.this.new C348911(this.$onboarded, this.$optInSms, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C348911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SupportHubApi supportHubApi = SupportHubStore.this.supportHubApi;
                    ApiPostConciergeOnboarding apiPostConciergeOnboarding = new ApiPostConciergeOnboarding(this.$onboarded, this.$optInSms);
                    this.label = 1;
                    if (supportHubApi.postConciergeOnboarding(apiPostConciergeOnboarding, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public final Job markConciergeOnboardingCheckpoint(Boolean onboarded, Boolean optInSms) {
        return BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C348911(onboarded, optInSms, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getPrioritySupportChannelAvailability(Continuation<? super PrioritySupportChannelAvailability> continuation) {
        C348891 c348891;
        if (continuation instanceof C348891) {
            c348891 = (C348891) continuation;
            int i = c348891.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c348891.label = i - Integer.MIN_VALUE;
            } else {
                c348891 = new C348891(continuation);
            }
        }
        Object prioritySupportChannelAvailability = c348891.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c348891.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(prioritySupportChannelAvailability);
            SupportHubApi supportHubApi = this.supportHubApi;
            c348891.label = 1;
            prioritySupportChannelAvailability = supportHubApi.getPrioritySupportChannelAvailability(c348891);
            if (prioritySupportChannelAvailability == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(prioritySupportChannelAvailability);
        }
        return ChannelAvailability3.toUiModel((ApiPrioritySupportChannelAvailability) prioritySupportChannelAvailability);
    }
}
