package com.robinhood.android.recommendations.p224ui.risk;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.recommendations.p224ui.risk.RecommendationsRiskProfileDuxo;
import com.robinhood.android.recommendations.p224ui.risk.RecommendationsRiskProfileFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsPortfolioStore;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsPortfolio;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecommendationsRiskProfileDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "recommendationsPortfolioStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsPortfolioStore;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsPortfolioStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "loadWalkthrough", "", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class RecommendationsRiskProfileDuxo extends OldBaseDuxo<RecommendationsRiskProfileViewState> implements HasSavedState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RecommendationsPortfolioStore recommendationsPortfolioStore;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecommendationsRiskProfileDuxo(SavedStateHandle savedStateHandle, RecommendationsPortfolioStore recommendationsPortfolioStore) {
        super(new RecommendationsRiskProfileViewState(false, null, null, 7, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(recommendationsPortfolioStore, "recommendationsPortfolioStore");
        this.savedStateHandle = savedStateHandle;
        this.recommendationsPortfolioStore = recommendationsPortfolioStore;
    }

    public final void loadWalkthrough() {
        applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsRiskProfileDuxo.loadWalkthrough$lambda$0((RecommendationsRiskProfileViewState) obj);
            }
        });
        Single<Optional<UiRecommendationsPortfolio>> singleDoOnError = this.recommendationsPortfolioStore.createPortfolioRecommendation(((RecommendationsRiskProfileFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getSubmissionId()).doOnError(new C261632());
        Intrinsics.checkNotNullExpressionValue(singleDoOnError, "doOnError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsRiskProfileDuxo.loadWalkthrough$lambda$2(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsRiskProfileViewState loadWalkthrough$lambda$0(RecommendationsRiskProfileViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecommendationsRiskProfileViewState.copy$default(applyMutation, true, null, null, 6, null);
    }

    /* compiled from: RecommendationsRiskProfileDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileDuxo$loadWalkthrough$2 */
    static final class C261632<T> implements Consumer {
        C261632() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(final Throwable th) {
            RecommendationsRiskProfileDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileDuxo$loadWalkthrough$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecommendationsRiskProfileDuxo.C261632.accept$lambda$0(th, (RecommendationsRiskProfileViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RecommendationsRiskProfileViewState accept$lambda$0(Throwable th, RecommendationsRiskProfileViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RecommendationsRiskProfileViewState.copy$default(applyMutation, false, null, new UiEvent(th), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadWalkthrough$lambda$2(RecommendationsRiskProfileDuxo recommendationsRiskProfileDuxo, Optional optional) {
        final UiRecommendationsPortfolio uiRecommendationsPortfolio = (UiRecommendationsPortfolio) optional.component1();
        recommendationsRiskProfileDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.ui.risk.RecommendationsRiskProfileDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsRiskProfileDuxo.loadWalkthrough$lambda$2$lambda$1(uiRecommendationsPortfolio, (RecommendationsRiskProfileViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsRiskProfileViewState loadWalkthrough$lambda$2$lambda$1(UiRecommendationsPortfolio uiRecommendationsPortfolio, RecommendationsRiskProfileViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecommendationsRiskProfileViewState.copy$default(applyMutation, false, new UiEvent(uiRecommendationsPortfolio), null, 4, null);
    }

    /* compiled from: RecommendationsRiskProfileDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileDuxo;", "Lcom/robinhood/android/recommendations/ui/risk/RecommendationsRiskProfileFragment$Args;", "<init>", "()V", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecommendationsRiskProfileDuxo, RecommendationsRiskProfileFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecommendationsRiskProfileFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RecommendationsRiskProfileFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecommendationsRiskProfileFragment.Args getArgs(RecommendationsRiskProfileDuxo recommendationsRiskProfileDuxo) {
            return (RecommendationsRiskProfileFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, recommendationsRiskProfileDuxo);
        }
    }
}
