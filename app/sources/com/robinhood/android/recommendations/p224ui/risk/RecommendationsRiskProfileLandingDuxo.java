package com.robinhood.android.recommendations.p224ui.risk;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.recommendations.p224ui.risk.RecommendationsRiskProfileLandingDuxo;
import com.robinhood.android.recommendations.p224ui.risk.RecommendationsRiskProfileLandingFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsQuestionnaireStore;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsRiskProfileStore;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsRiskProfile;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsRiskProfileLandingDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "recsRiskProfileStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsRiskProfileStore;", "recsQuestionnaireStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsQuestionnaireStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsRiskProfileStore;Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsQuestionnaireStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class RecommendationsRiskProfileLandingDuxo extends OldBaseDuxo<RecommendationsRiskProfileLandingViewState> implements HasSavedState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RecommendationsQuestionnaireStore recsQuestionnaireStore;
    private final RecommendationsRiskProfileStore recsRiskProfileStore;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecommendationsRiskProfileLandingDuxo(RecommendationsRiskProfileStore recsRiskProfileStore, RecommendationsQuestionnaireStore recsQuestionnaireStore, SavedStateHandle savedStateHandle) {
        super(new RecommendationsRiskProfileLandingViewState(null, null, 3, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(recsRiskProfileStore, "recsRiskProfileStore");
        Intrinsics.checkNotNullParameter(recsQuestionnaireStore, "recsQuestionnaireStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.recsRiskProfileStore = recsRiskProfileStore;
        this.recsQuestionnaireStore = recsQuestionnaireStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        RecommendationsRiskProfileStore recommendationsRiskProfileStore = this.recsRiskProfileStore;
        Companion companion = INSTANCE;
        Single singleDoOnError = recommendationsRiskProfileStore.createRiskProfile(((RecommendationsRiskProfileLandingFragment.Args) companion.getArgs((HasSavedState) this)).getQuestionsAndAnswers(), ((RecommendationsRiskProfileLandingFragment.Args) companion.getArgs((HasSavedState) this)).getSubmissionId()).flatMap(new Function() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileLandingDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<UiRecommendationsRiskProfile>> apply(final Optional<UiRecommendationsRiskProfile> riskProfile) {
                Intrinsics.checkNotNullParameter(riskProfile, "riskProfile");
                Companion companion2 = RecommendationsRiskProfileLandingDuxo.INSTANCE;
                if (((RecommendationsRiskProfileLandingFragment.Args) companion2.getArgs((HasSavedState) RecommendationsRiskProfileLandingDuxo.this)).getSkipConfirmationScreen()) {
                    return RecommendationsRiskProfileLandingDuxo.this.recsQuestionnaireStore.confirmAnswers(((RecommendationsRiskProfileLandingFragment.Args) companion2.getArgs((HasSavedState) RecommendationsRiskProfileLandingDuxo.this)).getSubmissionId()).map(new Function() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileLandingDuxo.onCreate.1.1
                        @Override // io.reactivex.functions.Function
                        public final Optional<UiRecommendationsRiskProfile> apply(Optional<Unit> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return riskProfile;
                        }
                    });
                }
                return Single.just(riskProfile);
            }
        }).doOnError(new C261702<>());
        Intrinsics.checkNotNullExpressionValue(singleDoOnError, "doOnError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileLandingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsRiskProfileLandingDuxo.onCreate$lambda$1(this.f$0, (Optional) obj);
            }
        });
    }

    /* compiled from: RecommendationsRiskProfileLandingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileLandingDuxo$onCreate$2 */
    static final class C261702<T> implements Consumer {
        C261702() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RecommendationsRiskProfileLandingViewState accept$lambda$0(Throwable th, RecommendationsRiskProfileLandingViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RecommendationsRiskProfileLandingViewState.copy$default(applyMutation, null, new UiEvent(th), 1, null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(final Throwable th) {
            RecommendationsRiskProfileLandingDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileLandingDuxo$onCreate$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecommendationsRiskProfileLandingDuxo.C261702.accept$lambda$0(th, (RecommendationsRiskProfileLandingViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(RecommendationsRiskProfileLandingDuxo recommendationsRiskProfileLandingDuxo, Optional optional) {
        final UiRecommendationsRiskProfile uiRecommendationsRiskProfile = (UiRecommendationsRiskProfile) optional.component1();
        recommendationsRiskProfileLandingDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileLandingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsRiskProfileLandingDuxo.onCreate$lambda$1$lambda$0(uiRecommendationsRiskProfile, (RecommendationsRiskProfileLandingViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsRiskProfileLandingViewState onCreate$lambda$1$lambda$0(UiRecommendationsRiskProfile uiRecommendationsRiskProfile, RecommendationsRiskProfileLandingViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecommendationsRiskProfileLandingViewState.copy$default(applyMutation, uiRecommendationsRiskProfile, null, 2, null);
    }

    /* compiled from: RecommendationsRiskProfileLandingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingDuxo;", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileLandingFragment$Args;", "<init>", "()V", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecommendationsRiskProfileLandingDuxo, RecommendationsRiskProfileLandingFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecommendationsRiskProfileLandingFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RecommendationsRiskProfileLandingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecommendationsRiskProfileLandingFragment.Args getArgs(RecommendationsRiskProfileLandingDuxo recommendationsRiskProfileLandingDuxo) {
            return (RecommendationsRiskProfileLandingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, recommendationsRiskProfileLandingDuxo);
        }
    }
}
