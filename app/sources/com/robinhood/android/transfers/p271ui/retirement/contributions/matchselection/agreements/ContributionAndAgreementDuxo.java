package com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.agreements;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.data.store.logging.utils.EventLoggers;
import com.robinhood.android.models.retirement.api.ApiRetirementOnboardingAgreement;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.android.models.retirement.api.contributions.ApiAgreementsViewModel;
import com.robinhood.android.models.retirement.api.contributions.ApiGoldMatchAgreements;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelection6;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelectionContributions;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelectionModel;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelectionSubmitRequest;
import com.robinhood.android.retirement.lib.Agreements3;
import com.robinhood.android.transfers.p271ui.max.CreateTransferLogging;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementEvent;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementFragment;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementTransfersMatchRateSelectionStore;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow2;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.GoldUpgradeContext;
import com.robinhood.rosetta.eventlogging.GoldUpgradeType;
import com.robinhood.rosetta.eventlogging.NetworkContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.TrackingEvent;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;

/* compiled from: ContributionAndAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001fB9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0019J\u0006\u0010\u001e\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementViewState;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "contributionsMatchRateSelectionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementTransfersMatchRateSelectionStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementTransfersMatchRateSelectionStore;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/userleap/UserLeapManager;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onSweepAgreementToggled", "enabled", "", "onAgreeClicked", "agreementsViewModel", "Lcom/robinhood/android/models/retirement/api/contributions/ApiAgreementsViewModel;", "isSweepAgreementChecked", "onGoldRejoinFlowCompleted", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ContributionAndAgreementDuxo extends BaseDuxo5<ContributionAndAgreementViewState, ContributionAndAgreementEvent> implements HasSavedState {
    private final RetirementTransfersMatchRateSelectionStore contributionsMatchRateSelectionStore;
    private final EventLogger eventLogger;
    private final SavedStateHandle savedStateHandle;
    private final TransfersBonfireApi transfersBonfireApi;
    private final SurveyManager3 userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContributionAndAgreementDuxo(RetirementTransfersMatchRateSelectionStore contributionsMatchRateSelectionStore, TransfersBonfireApi transfersBonfireApi, EventLogger eventLogger, SurveyManager3 userLeapManager, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new ContributionAndAgreementViewState(null, false, false, 7, null), duxoBundle);
        Intrinsics.checkNotNullParameter(contributionsMatchRateSelectionStore, "contributionsMatchRateSelectionStore");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.contributionsMatchRateSelectionStore = contributionsMatchRateSelectionStore;
        this.transfersBonfireApi = transfersBonfireApi;
        this.eventLogger = eventLogger;
        this.userLeapManager = userLeapManager;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().launchWhenCreated(new C310741(null));
    }

    /* compiled from: ContributionAndAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementDuxo$onCreate$1", m3645f = "ContributionAndAgreementDuxo.kt", m3646l = {53, 63}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementDuxo$onCreate$1 */
    static final class C310741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C310741(Continuation<? super C310741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContributionAndAgreementDuxo.this.new C310741(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C310741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
        
            if (r6 == r0) goto L29;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ApiMatchRateSelectionContributions apiMatchRateSelectionContributions;
            ApiAgreementsViewModel agreements_view_model;
            ApiMatchRateSelectionModel rate_selection_model_mobile;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                } catch (Exception unused) {
                    apiMatchRateSelectionContributions = null;
                }
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Companion companion = ContributionAndAgreementDuxo.INSTANCE;
                    if (((ContributionAndAgreementFragment.Args) companion.getArgs((HasSavedState) ContributionAndAgreementDuxo.this)).getShowGoldRejoinFlow()) {
                        ContributionAndAgreementDuxo.this.submit(ContributionAndAgreementEvent.LaunchGoldRejoinFlow.INSTANCE);
                        return Unit.INSTANCE;
                    }
                    if (((ContributionAndAgreementFragment.Args) companion.getArgs((HasSavedState) ContributionAndAgreementDuxo.this)).getLoadOnlyAgreements()) {
                        RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore = ContributionAndAgreementDuxo.this.contributionsMatchRateSelectionStore;
                        this.label = 1;
                        obj = retirementTransfersMatchRateSelectionStore.getGoldMatchAgreements(this);
                        if (obj == coroutine_suspended) {
                        }
                        agreements_view_model = ((ApiGoldMatchAgreements) obj).getMobile_agreements_view_model();
                    } else {
                        RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore2 = ContributionAndAgreementDuxo.this.contributionsMatchRateSelectionStore;
                        ApiMatchRateSelection6 apiMatchRateSelection6 = ApiMatchRateSelection6.CONTRIBUTION;
                        this.label = 2;
                        obj = retirementTransfersMatchRateSelectionStore2.getTransfersMatchRateSelectionViewModels(apiMatchRateSelection6, this);
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    agreements_view_model = ((ApiGoldMatchAgreements) obj).getMobile_agreements_view_model();
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    apiMatchRateSelectionContributions = (ApiMatchRateSelectionContributions) obj;
                    agreements_view_model = (apiMatchRateSelectionContributions == null || (rate_selection_model_mobile = apiMatchRateSelectionContributions.getRate_selection_model_mobile()) == null) ? null : rate_selection_model_mobile.getAgreements_view_model();
                }
                if (agreements_view_model != null) {
                    ContributionAndAgreementDuxo.this.userLeapManager.track(TrackingEvent.SAW_MATCH_SELECTION_AGREEMENTS_AND_CONTRIBUTION);
                    ContributionAndAgreementDuxo.this.applyMutation(new AnonymousClass1(agreements_view_model, null));
                } else {
                    ContributionAndAgreementDuxo.this.submit(ContributionAndAgreementEvent.NotEligible.INSTANCE);
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                ContributionAndAgreementDuxo.this.submit(new ContributionAndAgreementEvent.NetworkError(th, true));
                return Unit.INSTANCE;
            }
        }

        /* compiled from: ContributionAndAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementDuxo$onCreate$1$1", m3645f = "ContributionAndAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ContributionAndAgreementViewState, Continuation<? super ContributionAndAgreementViewState>, Object> {
            final /* synthetic */ ApiAgreementsViewModel $agreementsViewModel;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiAgreementsViewModel apiAgreementsViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$agreementsViewModel = apiAgreementsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$agreementsViewModel, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ContributionAndAgreementViewState contributionAndAgreementViewState, Continuation<? super ContributionAndAgreementViewState> continuation) {
                return ((AnonymousClass1) create(contributionAndAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ContributionAndAgreementViewState.copy$default((ContributionAndAgreementViewState) this.L$0, this.$agreementsViewModel, false, false, 6, null);
            }
        }
    }

    /* compiled from: ContributionAndAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementDuxo$onSweepAgreementToggled$1", m3645f = "ContributionAndAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementDuxo$onSweepAgreementToggled$1 */
    static final class C310771 extends ContinuationImpl7 implements Function2<ContributionAndAgreementViewState, Continuation<? super ContributionAndAgreementViewState>, Object> {
        final /* synthetic */ boolean $enabled;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C310771(boolean z, Continuation<? super C310771> continuation) {
            super(2, continuation);
            this.$enabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310771 c310771 = new C310771(this.$enabled, continuation);
            c310771.L$0 = obj;
            return c310771;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ContributionAndAgreementViewState contributionAndAgreementViewState, Continuation<? super ContributionAndAgreementViewState> continuation) {
            return ((C310771) create(contributionAndAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ContributionAndAgreementViewState.copy$default((ContributionAndAgreementViewState) this.L$0, null, this.$enabled, false, 5, null);
        }
    }

    public final void onSweepAgreementToggled(boolean enabled) {
        applyMutation(new C310771(enabled, null));
    }

    /* compiled from: ContributionAndAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementDuxo$onAgreeClicked$1", m3645f = "ContributionAndAgreementDuxo.kt", m3646l = {108, EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementDuxo$onAgreeClicked$1 */
    static final class C310711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiAgreementsViewModel $agreementsViewModel;
        final /* synthetic */ boolean $isSweepAgreementChecked;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C310711(ApiAgreementsViewModel apiAgreementsViewModel, boolean z, Continuation<? super C310711> continuation) {
            super(2, continuation);
            this.$agreementsViewModel = apiAgreementsViewModel;
            this.$isSweepAgreementChecked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContributionAndAgreementDuxo.this.new C310711(this.$agreementsViewModel, this.$isSweepAgreementChecked, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C310711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ContributionAndAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementDuxo$onAgreeClicked$1$1", m3645f = "ContributionAndAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementDuxo$onAgreeClicked$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ContributionAndAgreementViewState, Continuation<? super ContributionAndAgreementViewState>, Object> {
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
            public final Object invoke(ContributionAndAgreementViewState contributionAndAgreementViewState, Continuation<? super ContributionAndAgreementViewState> continuation) {
                return ((AnonymousClass1) create(contributionAndAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ContributionAndAgreementViewState.copy$default((ContributionAndAgreementViewState) this.L$0, null, false, true, 3, null);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x026c, code lost:
        
            if (r2 == r0) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ApiRetirementOnboardingAgreement agreement;
            Object objLogResponseMetadataAndUnwrap;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 2;
            ByteString byteString = null;
            Object[] objArr = 0;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        ContributionAndAgreementDuxo.this.applyMutation(new AnonymousClass1(null));
                        ApiRetirementOnboardingAgreement agreement2 = Agreements3.toAgreement(this.$agreementsViewModel.getGold_agreement());
                        ApiRetirementSignUpFlow.RetirementAgreementViewModel sweep_agreement = this.$agreementsViewModel.getSweep_agreement();
                        if (sweep_agreement == null || (agreement = Agreements3.toAgreement(sweep_agreement)) == null || !this.$isSweepAgreementChecked) {
                            agreement = null;
                        }
                        ApiMatchRateSelectionSubmitRequest apiMatchRateSelectionSubmitRequest = new ApiMatchRateSelectionSubmitRequest(agreement2, agreement);
                        RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore = ContributionAndAgreementDuxo.this.contributionsMatchRateSelectionStore;
                        this.label = 1;
                        if (retirementTransfersMatchRateSelectionStore.submitRetirementMatchRateSelectionInTransfers(apiMatchRateSelectionSubmitRequest, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        objLogResponseMetadataAndUnwrap = obj;
                        ContributionAndAgreementDuxo.this.submit(new ContributionAndAgreementEvent.SuccessfulTransfer(PostTransferFlow2.toUiModel((ApiCreateTransferResponse) objLogResponseMetadataAndUnwrap, ((ContributionAndAgreementFragment.Args) ContributionAndAgreementDuxo.INSTANCE.getArgs((HasSavedState) ContributionAndAgreementDuxo.this)).getContributionBundle().getTransferData().getSinkAccount().getType())));
                        ContributionAndAgreementDuxo.this.applyMutation(new AnonymousClass3(null));
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    EventLogger eventLogger = ContributionAndAgreementDuxo.this.eventLogger;
                    UserInteractionEventData.Action action = UserInteractionEventData.Action.GOLD_UPGRADE_SUCCESS;
                    Screen.Name name = Screen.Name.RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION_AGREEMENTS;
                    EventLogger.DefaultImpls.logTap$default(eventLogger, action, new Screen(name, null, null, null, 14, null), null, null, new Context(0, 0, 0, null, null, null, null, Context.ProductTag.GOLD, 0, null, ApiMatchRateSelection6.CONTRIBUTION.getServerValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new GoldUpgradeContext(Boolean.FALSE, byteString, i2, objArr == true ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, GoldUpgradeType.RETIREMENT_GOLD, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1153, -1, -1, -524289, -33554433, -1, 16383, null), false, 44, null);
                    EventLogger eventLogger2 = ContributionAndAgreementDuxo.this.eventLogger;
                    UserInteractionEventData userInteractionEventDataCreateTransferBaseEvent$default = CreateTransferLogging.createTransferBaseEvent$default(((ContributionAndAgreementFragment.Args) ContributionAndAgreementDuxo.INSTANCE.getArgs((HasSavedState) ContributionAndAgreementDuxo.this)).getContributionBundle().getLoggingContext(), null, name, 2, null);
                    ContributionAndAgreementDuxo2 contributionAndAgreementDuxo2 = new ContributionAndAgreementDuxo2(ContributionAndAgreementDuxo.this, null);
                    NetworkContext.Tag tag = NetworkContext.Tag.TAG_TYPE_UNSPECIFIED;
                    this.label = 2;
                    objLogResponseMetadataAndUnwrap = EventLoggers.logResponseMetadataAndUnwrap(eventLogger2, userInteractionEventDataCreateTransferBaseEvent$default, contributionAndAgreementDuxo2, tag, this);
                } catch (Throwable th) {
                    ContributionAndAgreementDuxo.this.applyMutation(new AnonymousClass2(null));
                    ContributionAndAgreementDuxo.this.submit(new ContributionAndAgreementEvent.NetworkError(th, false));
                    return Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                ContributionAndAgreementDuxo.this.submit(new ContributionAndAgreementEvent.NetworkError(th2, false));
                ContributionAndAgreementDuxo.this.applyMutation(new ContributionAndAgreementDuxo3(null));
                return Unit.INSTANCE;
            }
        }

        /* compiled from: ContributionAndAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementDuxo$onAgreeClicked$1$2", m3645f = "ContributionAndAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementDuxo$onAgreeClicked$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ContributionAndAgreementViewState, Continuation<? super ContributionAndAgreementViewState>, Object> {
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
            public final Object invoke(ContributionAndAgreementViewState contributionAndAgreementViewState, Continuation<? super ContributionAndAgreementViewState> continuation) {
                return ((AnonymousClass2) create(contributionAndAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ContributionAndAgreementViewState.copy$default((ContributionAndAgreementViewState) this.L$0, null, false, false, 3, null);
            }
        }

        /* compiled from: ContributionAndAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementDuxo$onAgreeClicked$1$3", m3645f = "ContributionAndAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementDuxo$onAgreeClicked$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<ContributionAndAgreementViewState, Continuation<? super ContributionAndAgreementViewState>, Object> {
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
            public final Object invoke(ContributionAndAgreementViewState contributionAndAgreementViewState, Continuation<? super ContributionAndAgreementViewState> continuation) {
                return ((AnonymousClass3) create(contributionAndAgreementViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ContributionAndAgreementViewState.copy$default((ContributionAndAgreementViewState) this.L$0, null, false, false, 3, null);
            }
        }
    }

    public final void onAgreeClicked(ApiAgreementsViewModel agreementsViewModel, boolean isSweepAgreementChecked) {
        if (agreementsViewModel == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C310711(agreementsViewModel, isSweepAgreementChecked, null), 3, null);
    }

    /* compiled from: ContributionAndAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementDuxo$onGoldRejoinFlowCompleted$1", m3645f = "ContributionAndAgreementDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.agreements.ContributionAndAgreementDuxo$onGoldRejoinFlowCompleted$1 */
    static final class C310751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C310751(Continuation<? super C310751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContributionAndAgreementDuxo.this.new C310751(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C310751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    EventLogger eventLogger = ContributionAndAgreementDuxo.this.eventLogger;
                    UserInteractionEventData userInteractionEventDataCreateTransferBaseEvent$default = CreateTransferLogging.createTransferBaseEvent$default(((ContributionAndAgreementFragment.Args) ContributionAndAgreementDuxo.INSTANCE.getArgs((HasSavedState) ContributionAndAgreementDuxo.this)).getContributionBundle().getLoggingContext(), null, Screen.Name.RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION_AGREEMENTS, 2, null);
                    ContributionAndAgreementDuxo4 contributionAndAgreementDuxo4 = new ContributionAndAgreementDuxo4(ContributionAndAgreementDuxo.this, null);
                    NetworkContext.Tag tag = NetworkContext.Tag.TAG_TYPE_UNSPECIFIED;
                    this.label = 1;
                    obj = EventLoggers.logResponseMetadataAndUnwrap(eventLogger, userInteractionEventDataCreateTransferBaseEvent$default, contributionAndAgreementDuxo4, tag, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ContributionAndAgreementDuxo.this.submit(new ContributionAndAgreementEvent.SuccessfulTransfer(PostTransferFlow2.toUiModel((ApiCreateTransferResponse) obj, ((ContributionAndAgreementFragment.Args) ContributionAndAgreementDuxo.INSTANCE.getArgs((HasSavedState) ContributionAndAgreementDuxo.this)).getContributionBundle().getTransferData().getSinkAccount().getType())));
                return Unit.INSTANCE;
            } catch (Throwable th) {
                ContributionAndAgreementDuxo.this.submit(new ContributionAndAgreementEvent.NetworkError(th, false));
                return Unit.INSTANCE;
            }
        }
    }

    public final void onGoldRejoinFlowCompleted() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C310751(null), 3, null);
    }

    /* compiled from: ContributionAndAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementDuxo;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/agreements/ContributionAndAgreementFragment$Args;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ContributionAndAgreementDuxo, ContributionAndAgreementFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ContributionAndAgreementFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ContributionAndAgreementFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ContributionAndAgreementFragment.Args getArgs(ContributionAndAgreementDuxo contributionAndAgreementDuxo) {
            return (ContributionAndAgreementFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, contributionAndAgreementDuxo);
        }
    }
}
