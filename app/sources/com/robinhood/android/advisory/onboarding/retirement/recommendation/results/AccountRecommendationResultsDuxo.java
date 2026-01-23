package com.robinhood.android.advisory.onboarding.retirement.recommendation.results;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationResultsFragment;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.advisory.api.onboarding.recommendation.ApiAccountTypeRecommendationResults;
import com.robinhood.store.advisory.AdvisoryOnboardingStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountRecommendationResultsDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsDataState;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "advisoryOnboardingStore", "Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "fetchResults", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AccountRecommendationResultsDuxo extends BaseDuxo<AccountRecommendationResultsDataState, AccountRecommendationResultsViewState> implements HasSavedState {
    private final AdvisoryOnboardingStore advisoryOnboardingStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AccountRecommendationResultsDuxo(AdvisoryOnboardingStore advisoryOnboardingStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new AccountRecommendationResultsDataState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), AccountRecommendationResultsDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(advisoryOnboardingStore, "advisoryOnboardingStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.advisoryOnboardingStore = advisoryOnboardingStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        fetchResults();
    }

    /* compiled from: AccountRecommendationResultsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationResultsDuxo$fetchResults$1", m3645f = "AccountRecommendationResultsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationResultsDuxo$fetchResults$1 */
    static final class C90921 extends ContinuationImpl7 implements Function2<AccountRecommendationResultsDataState, Continuation<? super AccountRecommendationResultsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C90921(Continuation<? super C90921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C90921 c90921 = new C90921(continuation);
            c90921.L$0 = obj;
            return c90921;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AccountRecommendationResultsDataState accountRecommendationResultsDataState, Continuation<? super AccountRecommendationResultsDataState> continuation) {
            return ((C90921) create(accountRecommendationResultsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AccountRecommendationResultsDataState.copy$default((AccountRecommendationResultsDataState) this.L$0, null, null, 1, null);
        }
    }

    public final void fetchResults() {
        applyMutation(new C90921(null));
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C90932(null), 3, null);
    }

    /* compiled from: AccountRecommendationResultsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationResultsDuxo$fetchResults$2", m3645f = "AccountRecommendationResultsDuxo.kt", m3646l = {36}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationResultsDuxo$fetchResults$2 */
    static final class C90932 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C90932(Continuation<? super C90932> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AccountRecommendationResultsDuxo.this.new C90932(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C90932) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AdvisoryOnboardingStore advisoryOnboardingStore = AccountRecommendationResultsDuxo.this.advisoryOnboardingStore;
                    String context = ((AccountRecommendationResultsFragment.Args) AccountRecommendationResultsDuxo.INSTANCE.getArgs((HasSavedState) AccountRecommendationResultsDuxo.this)).getContext();
                    this.label = 1;
                    obj = advisoryOnboardingStore.streamAccountTypeRecommendationResults(context, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                AccountRecommendationResultsDuxo.this.applyMutation(new AnonymousClass1((ApiAccountTypeRecommendationResults) obj, null));
            } catch (Exception e) {
                AccountRecommendationResultsDuxo.this.applyMutation(new AnonymousClass2(e, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AccountRecommendationResultsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationResultsDuxo$fetchResults$2$1", m3645f = "AccountRecommendationResultsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationResultsDuxo$fetchResults$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AccountRecommendationResultsDataState, Continuation<? super AccountRecommendationResultsDataState>, Object> {
            final /* synthetic */ ApiAccountTypeRecommendationResults $results;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiAccountTypeRecommendationResults apiAccountTypeRecommendationResults, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$results = apiAccountTypeRecommendationResults;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$results, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountRecommendationResultsDataState accountRecommendationResultsDataState, Continuation<? super AccountRecommendationResultsDataState> continuation) {
                return ((AnonymousClass1) create(accountRecommendationResultsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AccountRecommendationResultsDataState.copy$default((AccountRecommendationResultsDataState) this.L$0, this.$results, null, 2, null);
            }
        }

        /* compiled from: AccountRecommendationResultsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationResultsDuxo$fetchResults$2$2", m3645f = "AccountRecommendationResultsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationResultsDuxo$fetchResults$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<AccountRecommendationResultsDataState, Continuation<? super AccountRecommendationResultsDataState>, Object> {

            /* renamed from: $e */
            final /* synthetic */ Exception f3915$e;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Exception exc, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f3915$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f3915$e, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AccountRecommendationResultsDataState accountRecommendationResultsDataState, Continuation<? super AccountRecommendationResultsDataState> continuation) {
                return ((AnonymousClass2) create(accountRecommendationResultsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AccountRecommendationResultsDataState.copy$default((AccountRecommendationResultsDataState) this.L$0, null, this.f3915$e, 1, null);
            }
        }
    }

    /* compiled from: AccountRecommendationResultsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsDuxo;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsFragment$Args;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AccountRecommendationResultsDuxo, AccountRecommendationResultsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AccountRecommendationResultsFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AccountRecommendationResultsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AccountRecommendationResultsFragment.Args getArgs(AccountRecommendationResultsDuxo accountRecommendationResultsDuxo) {
            return (AccountRecommendationResultsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, accountRecommendationResultsDuxo);
        }
    }
}
