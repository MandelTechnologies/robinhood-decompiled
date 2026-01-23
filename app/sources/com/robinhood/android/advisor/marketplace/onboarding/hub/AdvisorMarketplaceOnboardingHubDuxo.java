package com.robinhood.android.advisor.marketplace.onboarding.hub;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorMatchesResponse;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.MeetingsHubResponse;
import com.robinhood.store.advisor.marketplace.AdvisorMarketplaceOnboardingStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AdvisorMarketplaceOnboardingHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubDataState;", "Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubViewState;", "advisorMarketplaceOnboardingStore", "Lcom/robinhood/store/advisor/marketplace/AdvisorMarketplaceOnboardingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/advisor/marketplace/AdvisorMarketplaceOnboardingStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "feature-advisor-marketplace-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdvisorMarketplaceOnboardingHubDuxo extends BaseDuxo<AdvisorMarketplaceOnboardingHubDataState, AdvisorMarketplaceOnboardingHubViewState> {
    public static final int $stable = 8;
    private final AdvisorMarketplaceOnboardingStore advisorMarketplaceOnboardingStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisorMarketplaceOnboardingHubDuxo(AdvisorMarketplaceOnboardingStore advisorMarketplaceOnboardingStore, DuxoBundle duxoBundle) {
        super(new AdvisorMarketplaceOnboardingHubDataState(null, null, 3, null), AdvisorMarketplaceOnboardingHubDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(advisorMarketplaceOnboardingStore, "advisorMarketplaceOnboardingStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.advisorMarketplaceOnboardingStore = advisorMarketplaceOnboardingStore;
    }

    /* compiled from: AdvisorMarketplaceOnboardingHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubDuxo$onCreate$1", m3645f = "AdvisorMarketplaceOnboardingHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubDuxo$onCreate$1 */
    static final class C85731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C85731(Continuation<? super C85731> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C85731 c85731 = AdvisorMarketplaceOnboardingHubDuxo.this.new C85731(continuation);
            c85731.L$0 = obj;
            return c85731;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C85731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AdvisorMarketplaceOnboardingHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubDuxo$onCreate$1$1", m3645f = "AdvisorMarketplaceOnboardingHubDuxo.kt", m3646l = {27}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvisorMarketplaceOnboardingHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AdvisorMarketplaceOnboardingHubDuxo advisorMarketplaceOnboardingHubDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = advisorMarketplaceOnboardingHubDuxo;
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
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<AdvisorMatchesResponse> flowStreamAdvisorMatches = this.this$0.advisorMarketplaceOnboardingStore.streamAdvisorMatches();
                    C495361 c495361 = new C495361(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamAdvisorMatches, c495361, this) == coroutine_suspended) {
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

            /* compiled from: AdvisorMarketplaceOnboardingHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "matchesResponse", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorMatchesResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubDuxo$onCreate$1$1$1", m3645f = "AdvisorMarketplaceOnboardingHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C495361 extends ContinuationImpl7 implements Function2<AdvisorMatchesResponse, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AdvisorMarketplaceOnboardingHubDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495361(AdvisorMarketplaceOnboardingHubDuxo advisorMarketplaceOnboardingHubDuxo, Continuation<? super C495361> continuation) {
                    super(2, continuation);
                    this.this$0 = advisorMarketplaceOnboardingHubDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495361 c495361 = new C495361(this.this$0, continuation);
                    c495361.L$0 = obj;
                    return c495361;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AdvisorMatchesResponse advisorMatchesResponse, Continuation<? super Unit> continuation) {
                    return ((C495361) create(advisorMatchesResponse, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AdvisorMarketplaceOnboardingHubDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubDuxo$onCreate$1$1$1$1", m3645f = "AdvisorMarketplaceOnboardingHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubDuxo$onCreate$1$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495371 extends ContinuationImpl7 implements Function2<AdvisorMarketplaceOnboardingHubDataState, Continuation<? super AdvisorMarketplaceOnboardingHubDataState>, Object> {
                    final /* synthetic */ AdvisorMatchesResponse $matchesResponse;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495371(AdvisorMatchesResponse advisorMatchesResponse, Continuation<? super C495371> continuation) {
                        super(2, continuation);
                        this.$matchesResponse = advisorMatchesResponse;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495371 c495371 = new C495371(this.$matchesResponse, continuation);
                        c495371.L$0 = obj;
                        return c495371;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AdvisorMarketplaceOnboardingHubDataState advisorMarketplaceOnboardingHubDataState, Continuation<? super AdvisorMarketplaceOnboardingHubDataState> continuation) {
                        return ((C495371) create(advisorMarketplaceOnboardingHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AdvisorMarketplaceOnboardingHubDataState.copy$default((AdvisorMarketplaceOnboardingHubDataState) this.L$0, this.$matchesResponse, null, 2, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495371((AdvisorMatchesResponse) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(AdvisorMarketplaceOnboardingHubDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(AdvisorMarketplaceOnboardingHubDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: AdvisorMarketplaceOnboardingHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubDuxo$onCreate$1$2", m3645f = "AdvisorMarketplaceOnboardingHubDuxo.kt", m3646l = {35}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvisorMarketplaceOnboardingHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AdvisorMarketplaceOnboardingHubDuxo advisorMarketplaceOnboardingHubDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = advisorMarketplaceOnboardingHubDuxo;
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
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<MeetingsHubResponse> flowStreamMeetingsHub = this.this$0.advisorMarketplaceOnboardingStore.streamMeetingsHub();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamMeetingsHub, anonymousClass1, this) == coroutine_suspended) {
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

            /* compiled from: AdvisorMarketplaceOnboardingHubDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "meetingsHubResponse", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/MeetingsHubResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubDuxo$onCreate$1$2$1", m3645f = "AdvisorMarketplaceOnboardingHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MeetingsHubResponse, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AdvisorMarketplaceOnboardingHubDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AdvisorMarketplaceOnboardingHubDuxo advisorMarketplaceOnboardingHubDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = advisorMarketplaceOnboardingHubDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MeetingsHubResponse meetingsHubResponse, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(meetingsHubResponse, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AdvisorMarketplaceOnboardingHubDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisor/marketplace/onboarding/hub/AdvisorMarketplaceOnboardingHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubDuxo$onCreate$1$2$1$1", m3645f = "AdvisorMarketplaceOnboardingHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.advisor.marketplace.onboarding.hub.AdvisorMarketplaceOnboardingHubDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495381 extends ContinuationImpl7 implements Function2<AdvisorMarketplaceOnboardingHubDataState, Continuation<? super AdvisorMarketplaceOnboardingHubDataState>, Object> {
                    final /* synthetic */ MeetingsHubResponse $meetingsHubResponse;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C495381(MeetingsHubResponse meetingsHubResponse, Continuation<? super C495381> continuation) {
                        super(2, continuation);
                        this.$meetingsHubResponse = meetingsHubResponse;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C495381 c495381 = new C495381(this.$meetingsHubResponse, continuation);
                        c495381.L$0 = obj;
                        return c495381;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AdvisorMarketplaceOnboardingHubDataState advisorMarketplaceOnboardingHubDataState, Continuation<? super AdvisorMarketplaceOnboardingHubDataState> continuation) {
                        return ((C495381) create(advisorMarketplaceOnboardingHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AdvisorMarketplaceOnboardingHubDataState.copy$default((AdvisorMarketplaceOnboardingHubDataState) this.L$0, null, this.$meetingsHubResponse, 1, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C495381((MeetingsHubResponse) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C85731(null));
    }
}
