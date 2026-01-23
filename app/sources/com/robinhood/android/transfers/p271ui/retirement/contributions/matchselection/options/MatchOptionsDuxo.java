package com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.options;

import com.robinhood.android.models.retirement.api.contributions.ApiMatchOptionsViewModel;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelection6;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelectionContributions;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelectionModel;
import com.robinhood.android.retirement.match.MatchOptionsScreenState;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.options.MatchOptionsDuxo2;
import com.robinhood.android.transfers.preference.HasSeenFullscreenMatchSelectionPref;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementTransfersMatchRateSelectionStore;
import com.robinhood.prefs.BooleanPreference;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MatchOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsViewState;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchSelectionEvent;", "matchRateSelectionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementTransfersMatchRateSelectionStore;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "hasSeenFullscreenMatchSelectionPref", "Lcom/robinhood/prefs/BooleanPreference;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementTransfersMatchRateSelectionStore;Lcom/robinhood/userleap/UserLeapManager;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class MatchOptionsDuxo extends BaseDuxo5<MatchOptionsViewState, MatchOptionsDuxo2> {
    public static final int $stable = 8;
    private final BooleanPreference hasSeenFullscreenMatchSelectionPref;
    private final RetirementTransfersMatchRateSelectionStore matchRateSelectionStore;
    private final SurveyManager3 userLeapManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchOptionsDuxo(RetirementTransfersMatchRateSelectionStore matchRateSelectionStore, SurveyManager3 userLeapManager, @HasSeenFullscreenMatchSelectionPref BooleanPreference hasSeenFullscreenMatchSelectionPref, DuxoBundle duxoBundle) {
        super(new MatchOptionsViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(matchRateSelectionStore, "matchRateSelectionStore");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        Intrinsics.checkNotNullParameter(hasSeenFullscreenMatchSelectionPref, "hasSeenFullscreenMatchSelectionPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.matchRateSelectionStore = matchRateSelectionStore;
        this.userLeapManager = userLeapManager;
        this.hasSeenFullscreenMatchSelectionPref = hasSeenFullscreenMatchSelectionPref;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().launchWhenStarted(new C310861(null));
    }

    /* compiled from: MatchOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.options.MatchOptionsDuxo$onStart$1", m3645f = "MatchOptionsDuxo.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.options.MatchOptionsDuxo$onStart$1 */
    static final class C310861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C310861(Continuation<? super C310861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchOptionsDuxo.this.new C310861(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C310861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ApiMatchRateSelectionModel rate_selection_model_mobile;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore = MatchOptionsDuxo.this.matchRateSelectionStore;
                    ApiMatchRateSelection6 apiMatchRateSelection6 = ApiMatchRateSelection6.CONTRIBUTION;
                    this.label = 1;
                    obj = retirementTransfersMatchRateSelectionStore.getTransfersMatchRateSelectionViewModels(apiMatchRateSelection6, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                rate_selection_model_mobile = ((ApiMatchRateSelectionContributions) obj).getRate_selection_model_mobile();
            } catch (Exception unused) {
                rate_selection_model_mobile = null;
            }
            ApiMatchOptionsViewModel match_options_view_model = rate_selection_model_mobile != null ? rate_selection_model_mobile.getMatch_options_view_model() : null;
            if (match_options_view_model != null) {
                MatchOptionsDuxo.this.userLeapManager.track(TrackingEvent.SAW_MATCH_OPTIONS_IN_CONTRIBUTION);
                MatchOptionsDuxo.this.applyMutation(new AnonymousClass1(match_options_view_model, rate_selection_model_mobile, null));
                MatchOptionsDuxo.this.hasSeenFullscreenMatchSelectionPref.set(true);
            } else {
                MatchOptionsDuxo.this.submit(MatchOptionsDuxo2.NotEligibleEvent.INSTANCE);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: MatchOptionsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/matchselection/options/MatchOptionsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.matchselection.options.MatchOptionsDuxo$onStart$1$1", m3645f = "MatchOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.matchselection.options.MatchOptionsDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MatchOptionsViewState, Continuation<? super MatchOptionsViewState>, Object> {
            final /* synthetic */ ApiMatchOptionsViewModel $matchOptionsViewModel;
            final /* synthetic */ ApiMatchRateSelectionModel $rateSelectionModel;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiMatchOptionsViewModel apiMatchOptionsViewModel, ApiMatchRateSelectionModel apiMatchRateSelectionModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$matchOptionsViewModel = apiMatchOptionsViewModel;
                this.$rateSelectionModel = apiMatchRateSelectionModel;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$matchOptionsViewModel, this.$rateSelectionModel, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MatchOptionsViewState matchOptionsViewState, Continuation<? super MatchOptionsViewState> continuation) {
                return ((AnonymousClass1) create(matchOptionsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MatchOptionsViewState matchOptionsViewState = (MatchOptionsViewState) this.L$0;
                String title = this.$matchOptionsViewModel.getTitle();
                String subtitle = this.$matchOptionsViewModel.getSubtitle();
                ImmutableList immutableList = extensions2.toImmutableList(this.$matchOptionsViewModel.getMatch_options());
                ImmutableList immutableList2 = extensions2.toImmutableList(this.$matchOptionsViewModel.getFooter_content());
                Boolean use_pending_downgrade_layout = this.$matchOptionsViewModel.getUse_pending_downgrade_layout();
                boolean zBooleanValue = use_pending_downgrade_layout != null ? use_pending_downgrade_layout.booleanValue() : false;
                Boolean show_rejoin_flow = this.$rateSelectionModel.getShow_rejoin_flow();
                return matchOptionsViewState.copy(new MatchOptionsScreenState(null, title, subtitle, immutableList, immutableList2, zBooleanValue, show_rejoin_flow != null ? show_rejoin_flow.booleanValue() : false));
            }
        }
    }
}
