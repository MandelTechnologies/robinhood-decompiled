package com.robinhood.android.advisory.onboarding.retirement.recommendation.selection;

import androidx.lifecycle.ViewModel2;
import com.robinhood.android.models.retirement.api.onboarding.RetirementOnboardingIntro;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore;
import com.robinhood.models.advisory.api.onboarding.recommendation.ApiAccountTypeRecommendationIntroViewModel;
import com.robinhood.store.AsyncResult;
import com.robinhood.store.advisory.AdvisoryOnboardingStore;
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

/* compiled from: AccountRecommendationSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionDataState;", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionViewState;", "advisoryOnboardingStore", "Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;", "retirementOnboardingStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "fetchViewModel", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AccountRecommendationSelectionDuxo extends BaseDuxo<AccountRecommendationSelectionDataState, AsyncResult<? extends AccountRecommendationSelectionViewState>> {
    public static final int $stable = 8;
    private final AdvisoryOnboardingStore advisoryOnboardingStore;
    private final RetirementOnboardingStore retirementOnboardingStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountRecommendationSelectionDuxo(AdvisoryOnboardingStore advisoryOnboardingStore, RetirementOnboardingStore retirementOnboardingStore, DuxoBundle duxoBundle) {
        super(new AccountRecommendationSelectionDataState(null, null, null, 7, null), AccountRecommendationSelectionDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(advisoryOnboardingStore, "advisoryOnboardingStore");
        Intrinsics.checkNotNullParameter(retirementOnboardingStore, "retirementOnboardingStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.advisoryOnboardingStore = advisoryOnboardingStore;
        this.retirementOnboardingStore = retirementOnboardingStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        fetchViewModel();
    }

    /* compiled from: AccountRecommendationSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionDuxo$fetchViewModel$1", m3645f = "AccountRecommendationSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionDuxo$fetchViewModel$1 */
    static final class C91021 extends ContinuationImpl7 implements Function2<AccountRecommendationSelectionDataState, Continuation<? super AccountRecommendationSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C91021(Continuation<? super C91021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C91021 c91021 = new C91021(continuation);
            c91021.L$0 = obj;
            return c91021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountRecommendationSelectionDataState accountRecommendationSelectionDataState, Continuation<? super AccountRecommendationSelectionDataState> continuation) {
            return ((C91021) create(accountRecommendationSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountRecommendationSelectionDataState.copy$default((AccountRecommendationSelectionDataState) this.L$0, null, null, null, 3, null);
        }
    }

    public final void fetchViewModel() {
        applyMutation(new C91021(null));
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C91032(null), 3, null);
    }

    /* compiled from: AccountRecommendationSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionDuxo$fetchViewModel$2", m3645f = "AccountRecommendationSelectionDuxo.kt", m3646l = {35, 36}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionDuxo$fetchViewModel$2 */
    static final class C91032 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C91032(Continuation<? super C91032> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountRecommendationSelectionDuxo.this.new C91032(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C91032) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ApiAccountTypeRecommendationIntroViewModel apiAccountTypeRecommendationIntroViewModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception e) {
                AccountRecommendationSelectionDuxo.this.applyMutation(new AnonymousClass2(e, null));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AdvisoryOnboardingStore advisoryOnboardingStore = AccountRecommendationSelectionDuxo.this.advisoryOnboardingStore;
                this.label = 1;
                obj = advisoryOnboardingStore.streamAccountTypeRecommendationIntro(this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiAccountTypeRecommendationIntroViewModel = (ApiAccountTypeRecommendationIntroViewModel) this.L$0;
                ResultKt.throwOnFailure(obj);
                AccountRecommendationSelectionDuxo.this.applyMutation(new AnonymousClass1(apiAccountTypeRecommendationIntroViewModel, (RetirementOnboardingIntro.AccountSelection) obj, null));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ApiAccountTypeRecommendationIntroViewModel apiAccountTypeRecommendationIntroViewModel2 = (ApiAccountTypeRecommendationIntroViewModel) obj;
            RetirementOnboardingStore retirementOnboardingStore = AccountRecommendationSelectionDuxo.this.retirementOnboardingStore;
            this.L$0 = apiAccountTypeRecommendationIntroViewModel2;
            this.label = 2;
            Object objStreamAccountSelectionAsIntro = retirementOnboardingStore.streamAccountSelectionAsIntro(null, this);
            if (objStreamAccountSelectionAsIntro != coroutine_suspended) {
                apiAccountTypeRecommendationIntroViewModel = apiAccountTypeRecommendationIntroViewModel2;
                obj = objStreamAccountSelectionAsIntro;
                AccountRecommendationSelectionDuxo.this.applyMutation(new AnonymousClass1(apiAccountTypeRecommendationIntroViewModel, (RetirementOnboardingIntro.AccountSelection) obj, null));
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }

        /* compiled from: AccountRecommendationSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionDuxo$fetchViewModel$2$1", m3645f = "AccountRecommendationSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionDuxo$fetchViewModel$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountRecommendationSelectionDataState, Continuation<? super AccountRecommendationSelectionDataState>, Object> {
            final /* synthetic */ RetirementOnboardingIntro.AccountSelection $accountSelection;
            final /* synthetic */ ApiAccountTypeRecommendationIntroViewModel $viewModel;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiAccountTypeRecommendationIntroViewModel apiAccountTypeRecommendationIntroViewModel, RetirementOnboardingIntro.AccountSelection accountSelection, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$viewModel = apiAccountTypeRecommendationIntroViewModel;
                this.$accountSelection = accountSelection;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$viewModel, this.$accountSelection, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountRecommendationSelectionDataState accountRecommendationSelectionDataState, Continuation<? super AccountRecommendationSelectionDataState> continuation) {
                return ((AnonymousClass1) create(accountRecommendationSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AccountRecommendationSelectionDataState.copy$default((AccountRecommendationSelectionDataState) this.L$0, this.$viewModel, this.$accountSelection, null, 4, null);
            }
        }

        /* compiled from: AccountRecommendationSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionDuxo$fetchViewModel$2$2", m3645f = "AccountRecommendationSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionDuxo$fetchViewModel$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AccountRecommendationSelectionDataState, Continuation<? super AccountRecommendationSelectionDataState>, Object> {

            /* renamed from: $e */
            final /* synthetic */ Exception f3916$e;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Exception exc, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f3916$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f3916$e, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountRecommendationSelectionDataState accountRecommendationSelectionDataState, Continuation<? super AccountRecommendationSelectionDataState> continuation) {
                return ((AnonymousClass2) create(accountRecommendationSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AccountRecommendationSelectionDataState.copy$default((AccountRecommendationSelectionDataState) this.L$0, null, null, this.f3916$e, 3, null);
            }
        }
    }
}
