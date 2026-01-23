package com.robinhood.android.matchrateselection.matchagreements;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsEvent;
import com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsFragment;
import com.robinhood.android.models.retirement.api.ApiRetirementOnboardingAgreement;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.android.models.retirement.api.contributions.ApiAgreementsViewModel;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelection6;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelectionContributions;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelectionModel;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelectionSubmitRequest;
import com.robinhood.android.retirement.lib.Agreements3;
import com.robinhood.android.retirement.match.MatchAgreementState;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementTransfersMatchRateSelectionStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MatchAgreementsDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/retirement/match/MatchAgreementState;", "Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "matchRateSelectionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementTransfersMatchRateSelectionStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementTransfersMatchRateSelectionStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "setSweepState", "enabled", "", "onAgreementsAccepted", "Companion", "feature-match-rate-selection_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchAgreementsDuxo extends BaseDuxo5<MatchAgreementState, MatchAgreementsEvent> implements HasSavedState {
    private final RetirementTransfersMatchRateSelectionStore matchRateSelectionStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchAgreementsDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, RetirementTransfersMatchRateSelectionStore matchRateSelectionStore) {
        super(new MatchAgreementState(null, false, false, 7, null), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(matchRateSelectionStore, "matchRateSelectionStore");
        this.savedStateHandle = savedStateHandle;
        this.matchRateSelectionStore = matchRateSelectionStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C216031(null), 3, null);
    }

    /* compiled from: MatchAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsDuxo$onStart$1", m3645f = "MatchAgreementsDuxo.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsDuxo$onStart$1 */
    static final class C216031 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C216031(Continuation<? super C216031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchAgreementsDuxo.this.new C216031(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C216031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore = MatchAgreementsDuxo.this.matchRateSelectionStore;
                    ApiMatchRateSelection6 entryPoint = ((MatchAgreementsFragment.Args) MatchAgreementsDuxo.INSTANCE.getArgs((HasSavedState) MatchAgreementsDuxo.this)).getEntryPoint();
                    this.label = 1;
                    obj = retirementTransfersMatchRateSelectionStore.getTransfersMatchRateSelectionViewModels(entryPoint, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ApiMatchRateSelectionModel rate_selection_model_mobile = ((ApiMatchRateSelectionContributions) obj).getRate_selection_model_mobile();
                ApiAgreementsViewModel agreements_view_model = rate_selection_model_mobile != null ? rate_selection_model_mobile.getAgreements_view_model() : null;
                if (agreements_view_model != null) {
                    MatchAgreementsDuxo.this.applyMutation(new AnonymousClass1(agreements_view_model, null));
                } else {
                    MatchAgreementsDuxo.this.submit(new MatchAgreementsEvent.Error(new IllegalStateException("Missing agreements view model"), true));
                }
                return Unit.INSTANCE;
            } catch (Exception e) {
                MatchAgreementsDuxo.this.submit(new MatchAgreementsEvent.Error(e, true));
                return Unit.INSTANCE;
            }
        }

        /* compiled from: MatchAgreementsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/match/MatchAgreementState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsDuxo$onStart$1$1", m3645f = "MatchAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MatchAgreementState, Continuation<? super MatchAgreementState>, Object> {
            final /* synthetic */ ApiAgreementsViewModel $agreements;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiAgreementsViewModel apiAgreementsViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$agreements = apiAgreementsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$agreements, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MatchAgreementState matchAgreementState, Continuation<? super MatchAgreementState> continuation) {
                return ((AnonymousClass1) create(matchAgreementState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MatchAgreementState.copy$default((MatchAgreementState) this.L$0, this.$agreements, false, false, 6, null);
            }
        }
    }

    /* compiled from: MatchAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/match/MatchAgreementState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsDuxo$setSweepState$1", m3645f = "MatchAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsDuxo$setSweepState$1 */
    static final class C216041 extends ContinuationImpl7 implements Function2<MatchAgreementState, Continuation<? super MatchAgreementState>, Object> {
        final /* synthetic */ boolean $enabled;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C216041(boolean z, Continuation<? super C216041> continuation) {
            super(2, continuation);
            this.$enabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C216041 c216041 = new C216041(this.$enabled, continuation);
            c216041.L$0 = obj;
            return c216041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchAgreementState matchAgreementState, Continuation<? super MatchAgreementState> continuation) {
            return ((C216041) create(matchAgreementState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MatchAgreementState.copy$default((MatchAgreementState) this.L$0, null, this.$enabled, false, 5, null);
        }
    }

    public final void setSweepState(boolean enabled) {
        applyMutation(new C216041(enabled, null));
    }

    /* compiled from: MatchAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/retirement/match/MatchAgreementState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsDuxo$onAgreementsAccepted$1", m3645f = "MatchAgreementsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsDuxo$onAgreementsAccepted$1 */
    static final class C216011 extends ContinuationImpl7 implements Function2<MatchAgreementState, Continuation<? super MatchAgreementState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C216011(Continuation<? super C216011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C216011 c216011 = new C216011(continuation);
            c216011.L$0 = obj;
            return c216011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MatchAgreementState matchAgreementState, Continuation<? super MatchAgreementState> continuation) {
            return ((C216011) create(matchAgreementState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MatchAgreementState.copy$default((MatchAgreementState) this.L$0, null, false, true, 3, null);
        }
    }

    public final void onAgreementsAccepted() {
        applyMutation(new C216011(null));
        withDataState(new Function1() { // from class: com.robinhood.android.matchrateselection.matchagreements.MatchAgreementsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchAgreementsDuxo.onAgreementsAccepted$lambda$1(this.f$0, (MatchAgreementState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAgreementsAccepted$lambda$1(MatchAgreementsDuxo matchAgreementsDuxo, MatchAgreementState state) {
        ApiRetirementOnboardingAgreement agreement;
        ApiRetirementSignUpFlow.RetirementAgreementViewModel sweep_agreement;
        ApiRetirementSignUpFlow.RetirementAgreementViewModel gold_agreement;
        Intrinsics.checkNotNullParameter(state, "state");
        ApiAgreementsViewModel agreementsViewModel = state.getAgreementsViewModel();
        ApiRetirementOnboardingAgreement agreement2 = (agreementsViewModel == null || (gold_agreement = agreementsViewModel.getGold_agreement()) == null) ? null : Agreements3.toAgreement(gold_agreement);
        if (agreement2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ApiAgreementsViewModel agreementsViewModel2 = state.getAgreementsViewModel();
        if (agreementsViewModel2 == null || (sweep_agreement = agreementsViewModel2.getSweep_agreement()) == null || (agreement = Agreements3.toAgreement(sweep_agreement)) == null || !state.isSweepAgreementChecked()) {
            agreement = null;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(matchAgreementsDuxo), null, null, new MatchAgreementsDuxo2(matchAgreementsDuxo, new ApiMatchRateSelectionSubmitRequest(agreement2, agreement), null), 3, null);
        return Unit.INSTANCE;
    }

    /* compiled from: MatchAgreementsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsDuxo;", "Lcom/robinhood/android/matchrateselection/matchagreements/MatchAgreementsFragment$Args;", "<init>", "()V", "feature-match-rate-selection_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MatchAgreementsDuxo, MatchAgreementsFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchAgreementsFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MatchAgreementsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchAgreementsFragment.Args getArgs(MatchAgreementsDuxo matchAgreementsDuxo) {
            return (MatchAgreementsFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, matchAgreementsDuxo);
        }
    }
}
