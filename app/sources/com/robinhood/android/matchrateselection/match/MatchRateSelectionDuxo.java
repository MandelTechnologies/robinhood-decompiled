package com.robinhood.android.matchrateselection.match;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.robinhood.android.matchrateselection.match.MatchRateSelectionEvent;
import com.robinhood.android.matchrateselection.match.MatchRateSelectionFragment;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchOptionsViewModel;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelection6;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelectionContributions;
import com.robinhood.android.models.retirement.api.contributions.ApiMatchRateSelectionModel;
import com.robinhood.android.retirement.match.MatchOptionsScreenState;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MatchRateSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionViewState;", "Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "matchRateStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementTransfersMatchRateSelectionStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementTransfersMatchRateSelectionStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "Companion", "feature-match-rate-selection_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchRateSelectionDuxo extends BaseDuxo5<MatchRateSelectionViewState, MatchRateSelectionEvent> implements HasSavedState {
    private final RetirementTransfersMatchRateSelectionStore matchRateStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchRateSelectionDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, RetirementTransfersMatchRateSelectionStore matchRateStore) {
        super(new MatchRateSelectionViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(matchRateStore, "matchRateStore");
        this.savedStateHandle = savedStateHandle;
        this.matchRateStore = matchRateStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C215951(null), 3, null);
    }

    /* compiled from: MatchRateSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matchrateselection.match.MatchRateSelectionDuxo$onStart$1", m3645f = "MatchRateSelectionDuxo.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matchrateselection.match.MatchRateSelectionDuxo$onStart$1 */
    static final class C215951 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C215951(Continuation<? super C215951> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchRateSelectionDuxo.this.new C215951(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C215951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore = MatchRateSelectionDuxo.this.matchRateStore;
                    ApiMatchRateSelection6 entryPoint = ((MatchRateSelectionFragment.Args) MatchRateSelectionDuxo.INSTANCE.getArgs((HasSavedState) MatchRateSelectionDuxo.this)).getEntryPoint();
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
                ApiMatchRateSelectionContributions apiMatchRateSelectionContributions = (ApiMatchRateSelectionContributions) obj;
                ApiMatchRateSelectionModel rate_selection_model_mobile = apiMatchRateSelectionContributions.getRate_selection_model_mobile();
                ApiMatchOptionsViewModel match_options_view_model = rate_selection_model_mobile != null ? rate_selection_model_mobile.getMatch_options_view_model() : null;
                if (match_options_view_model != null) {
                    MatchRateSelectionDuxo.this.applyMutation(new AnonymousClass1(match_options_view_model, apiMatchRateSelectionContributions, null));
                } else {
                    MatchRateSelectionDuxo.this.submit(MatchRateSelectionEvent.SkipToNextStep.INSTANCE);
                }
                return Unit.INSTANCE;
            } catch (Exception e) {
                MatchRateSelectionDuxo.this.submit(new MatchRateSelectionEvent.Error(e));
                return Unit.INSTANCE;
            }
        }

        /* compiled from: MatchRateSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.matchrateselection.match.MatchRateSelectionDuxo$onStart$1$1", m3645f = "MatchRateSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.matchrateselection.match.MatchRateSelectionDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MatchRateSelectionViewState, Continuation<? super MatchRateSelectionViewState>, Object> {
            final /* synthetic */ ApiMatchOptionsViewModel $matchOptions;
            final /* synthetic */ ApiMatchRateSelectionContributions $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiMatchOptionsViewModel apiMatchOptionsViewModel, ApiMatchRateSelectionContributions apiMatchRateSelectionContributions, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$matchOptions = apiMatchOptionsViewModel;
                this.$response = apiMatchRateSelectionContributions;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$matchOptions, this.$response, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MatchRateSelectionViewState matchRateSelectionViewState, Continuation<? super MatchRateSelectionViewState> continuation) {
                return ((AnonymousClass1) create(matchRateSelectionViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Boolean show_rejoin_flow;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MatchRateSelectionViewState matchRateSelectionViewState = (MatchRateSelectionViewState) this.L$0;
                String header_image = this.$matchOptions.getHeader_image();
                String title = this.$matchOptions.getTitle();
                String subtitle = this.$matchOptions.getSubtitle();
                ImmutableList immutableList = extensions2.toImmutableList(this.$matchOptions.getMatch_options());
                ImmutableList immutableList2 = extensions2.toImmutableList(this.$matchOptions.getFooter_content());
                Boolean use_pending_downgrade_layout = this.$matchOptions.getUse_pending_downgrade_layout();
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = use_pending_downgrade_layout != null ? use_pending_downgrade_layout.booleanValue() : false;
                ApiMatchRateSelectionModel rate_selection_model_mobile = this.$response.getRate_selection_model_mobile();
                if (rate_selection_model_mobile != null && (show_rejoin_flow = rate_selection_model_mobile.getShow_rejoin_flow()) != null) {
                    zBooleanValue = show_rejoin_flow.booleanValue();
                }
                return matchRateSelectionViewState.copy(new MatchOptionsScreenState(header_image, title, subtitle, immutableList, immutableList2, zBooleanValue2, zBooleanValue));
            }
        }
    }

    /* compiled from: MatchRateSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionDuxo;", "Lcom/robinhood/android/matchrateselection/match/MatchRateSelectionFragment$Args;", "<init>", "()V", "feature-match-rate-selection_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MatchRateSelectionDuxo, MatchRateSelectionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchRateSelectionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MatchRateSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchRateSelectionFragment.Args getArgs(MatchRateSelectionDuxo matchRateSelectionDuxo) {
            return (MatchRateSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, matchRateSelectionDuxo);
        }
    }
}
