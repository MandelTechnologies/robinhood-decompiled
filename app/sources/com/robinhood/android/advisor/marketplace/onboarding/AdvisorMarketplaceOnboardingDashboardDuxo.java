package com.robinhood.android.advisor.marketplace.onboarding;

import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.advisor.marketplace.p303db.onboarding.AdvisorDashboardState;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AdvisorMarketplaceOnboardingDashboardDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisor/marketplace/onboarding/AdvisorMarketplaceOnboardingDashboardDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/advisor/marketplace/onboarding/AdvisorMarketplaceOnboardingDashboardViewState;", "advisorMarketplaceOnboardingStore", "Lcom/robinhood/store/advisor/marketplace/AdvisorMarketplaceOnboardingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/advisor/marketplace/AdvisorMarketplaceOnboardingStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "refresh", "feature-advisor-marketplace-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdvisorMarketplaceOnboardingDashboardDuxo extends BaseDuxo4<AdvisorMarketplaceOnboardingDashboardViewState> {
    public static final int $stable = 8;
    private final AdvisorMarketplaceOnboardingStore advisorMarketplaceOnboardingStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisorMarketplaceOnboardingDashboardDuxo(AdvisorMarketplaceOnboardingStore advisorMarketplaceOnboardingStore, DuxoBundle duxoBundle) {
        super(new AdvisorMarketplaceOnboardingDashboardViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(advisorMarketplaceOnboardingStore, "advisorMarketplaceOnboardingStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.advisorMarketplaceOnboardingStore = advisorMarketplaceOnboardingStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        refresh();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C85521(null));
    }

    /* compiled from: AdvisorMarketplaceOnboardingDashboardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceOnboardingDashboardDuxo$onStart$1", m3645f = "AdvisorMarketplaceOnboardingDashboardDuxo.kt", m3646l = {27}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceOnboardingDashboardDuxo$onStart$1 */
    static final class C85521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C85521(Continuation<? super C85521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvisorMarketplaceOnboardingDashboardDuxo.this.new C85521(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C85521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(AdvisorMarketplaceOnboardingDashboardDuxo.this.advisorMarketplaceOnboardingStore.streamDashboardState());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AdvisorMarketplaceOnboardingDashboardDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: AdvisorMarketplaceOnboardingDashboardDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lcom/robinhood/models/advisor/marketplace/db/onboarding/AdvisorDashboardState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceOnboardingDashboardDuxo$onStart$1$1", m3645f = "AdvisorMarketplaceOnboardingDashboardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceOnboardingDashboardDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AdvisorDashboardState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AdvisorMarketplaceOnboardingDashboardDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AdvisorMarketplaceOnboardingDashboardDuxo advisorMarketplaceOnboardingDashboardDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = advisorMarketplaceOnboardingDashboardDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AdvisorDashboardState advisorDashboardState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(advisorDashboardState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AdvisorMarketplaceOnboardingDashboardDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisor/marketplace/onboarding/AdvisorMarketplaceOnboardingDashboardViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceOnboardingDashboardDuxo$onStart$1$1$1", m3645f = "AdvisorMarketplaceOnboardingDashboardDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.advisor.marketplace.onboarding.AdvisorMarketplaceOnboardingDashboardDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C495351 extends ContinuationImpl7 implements Function2<AdvisorMarketplaceOnboardingDashboardViewState, Continuation<? super AdvisorMarketplaceOnboardingDashboardViewState>, Object> {
                final /* synthetic */ AdvisorDashboardState $state;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C495351(AdvisorDashboardState advisorDashboardState, Continuation<? super C495351> continuation) {
                    super(2, continuation);
                    this.$state = advisorDashboardState;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C495351 c495351 = new C495351(this.$state, continuation);
                    c495351.L$0 = obj;
                    return c495351;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AdvisorMarketplaceOnboardingDashboardViewState advisorMarketplaceOnboardingDashboardViewState, Continuation<? super AdvisorMarketplaceOnboardingDashboardViewState> continuation) {
                    return ((C495351) create(advisorMarketplaceOnboardingDashboardViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((AdvisorMarketplaceOnboardingDashboardViewState) this.L$0).copy(this.$state);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C495351((AdvisorDashboardState) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void refresh() {
        this.advisorMarketplaceOnboardingStore.refreshDashboardState();
    }
}
