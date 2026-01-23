package com.robinhood.android.recommendations.p224ui.questionnaire;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.recommendations.p224ui.questionnaire.RecommendationsQuestionnaireDuxo;
import com.robinhood.android.recommendations.p224ui.questionnaire.RecommendationsQuestionnaireViewState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsQuestionnaireStore;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsQuestionnaire;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecommendationsQuestionnaireDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010\n\u001a\u00020\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\fJ\u0006\u0010\u000e\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/recommendations/ui/questionnaire/RecommendationsQuestionnaireViewState;", "recommendationsQuestionnaireStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsQuestionnaireStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsQuestionnaireStore;)V", "onCreate", "", "startIntroPage", "nextPage", "questionToAnswerId", "Lkotlin/Pair;", "Ljava/util/UUID;", "previousPage", "returnToFlow", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsQuestionnaireDuxo extends OldBaseDuxo<RecommendationsQuestionnaireViewState> {
    private final RecommendationsQuestionnaireStore recommendationsQuestionnaireStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecommendationsQuestionnaireDuxo(RecommendationsQuestionnaireStore recommendationsQuestionnaireStore) {
        super(new RecommendationsQuestionnaireViewState(null, 0, null, null, null, null, null, null, false, 511, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(recommendationsQuestionnaireStore, "recommendationsQuestionnaireStore");
        this.recommendationsQuestionnaireStore = recommendationsQuestionnaireStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Single<Optional<UiRecommendationsQuestionnaire>> singleDoOnError = this.recommendationsQuestionnaireStore.fetchRecommendationQuestionnaire().doOnError(new C261181());
        Intrinsics.checkNotNullExpressionValue(singleDoOnError, "doOnError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsQuestionnaireDuxo.onCreate$lambda$1(this.f$0, (Optional) obj);
            }
        });
    }

    /* compiled from: RecommendationsQuestionnaireDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireDuxo$onCreate$1 */
    static final class C261181<T> implements Consumer {
        C261181() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RecommendationsQuestionnaireViewState accept$lambda$0(Throwable th, RecommendationsQuestionnaireViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RecommendationsQuestionnaireViewState.copy$default(applyMutation, null, 0, null, null, null, null, new UiEvent(th), null, false, 447, null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(final Throwable th) {
            RecommendationsQuestionnaireDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireDuxo$onCreate$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecommendationsQuestionnaireDuxo.C261181.accept$lambda$0(th, (RecommendationsQuestionnaireViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(RecommendationsQuestionnaireDuxo recommendationsQuestionnaireDuxo, Optional optional) {
        final UiRecommendationsQuestionnaire uiRecommendationsQuestionnaire = (UiRecommendationsQuestionnaire) optional.component1();
        recommendationsQuestionnaireDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsQuestionnaireDuxo.onCreate$lambda$1$lambda$0(uiRecommendationsQuestionnaire, (RecommendationsQuestionnaireViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsQuestionnaireViewState onCreate$lambda$1$lambda$0(UiRecommendationsQuestionnaire uiRecommendationsQuestionnaire, RecommendationsQuestionnaireViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecommendationsQuestionnaireViewState.copy$default(applyMutation, uiRecommendationsQuestionnaire, 0, null, null, null, null, null, null, false, 510, null);
    }

    public final void startIntroPage() {
        Observable<RecommendationsQuestionnaireViewState> observableTake = getStates().filter(new Predicate() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireDuxo.startIntroPage.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(RecommendationsQuestionnaireViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return !state.getPages().isEmpty();
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsQuestionnaireDuxo.startIntroPage$lambda$3(this.f$0, (RecommendationsQuestionnaireViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startIntroPage$lambda$3(RecommendationsQuestionnaireDuxo recommendationsQuestionnaireDuxo, RecommendationsQuestionnaireViewState recommendationsQuestionnaireViewState) {
        final RecommendationsQuestionnaireViewState.TransitionInfo transitionInfo = new RecommendationsQuestionnaireViewState.TransitionInfo(RecommendationsQuestionnaireViewState.TransitionInfo.TransitionType.FORWARD, 0.0f, 0.0f);
        recommendationsQuestionnaireDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsQuestionnaireDuxo.startIntroPage$lambda$3$lambda$2(transitionInfo, (RecommendationsQuestionnaireViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsQuestionnaireViewState startIntroPage$lambda$3$lambda$2(RecommendationsQuestionnaireViewState.TransitionInfo transitionInfo, RecommendationsQuestionnaireViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecommendationsQuestionnaireViewState.copy$default(applyMutation, null, 0, new UiEvent(transitionInfo), null, null, null, null, null, false, EnumC7081g.f2779x59907a3d, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void nextPage$default(RecommendationsQuestionnaireDuxo recommendationsQuestionnaireDuxo, Tuples2 tuples2, int i, Object obj) {
        if ((i & 1) != 0) {
            tuples2 = null;
        }
        recommendationsQuestionnaireDuxo.nextPage(tuples2);
    }

    public final void nextPage(final Tuples2<UUID, UUID> questionToAnswerId) {
        applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsQuestionnaireDuxo.nextPage$lambda$4(questionToAnswerId, (RecommendationsQuestionnaireViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsQuestionnaireViewState nextPage$lambda$4(Tuples2 tuples2, RecommendationsQuestionnaireViewState applyMutation) {
        Map<UUID, UUID> answeredQuestions;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        UUID uuid = tuples2 != null ? (UUID) tuples2.getFirst() : null;
        UUID uuid2 = tuples2 != null ? (UUID) tuples2.getSecond() : null;
        if (uuid2 != null && uuid != null) {
            answeredQuestions = MapsKt.plus(applyMutation.getAnsweredQuestions(), Tuples4.m3642to(uuid, uuid2));
        } else {
            answeredQuestions = applyMutation.getAnsweredQuestions();
        }
        Map<UUID, UUID> map = answeredQuestions;
        if (applyMutation.getCurrentPageIndex() == CollectionsKt.getLastIndex(applyMutation.getPages())) {
            return RecommendationsQuestionnaireViewState.copy$default(applyMutation, null, 0, null, null, new UiEvent(Unit.INSTANCE), null, null, map, false, 367, null);
        }
        return RecommendationsQuestionnaireViewState.copy$default(applyMutation, null, Math.min(applyMutation.getPages().size() - 1, applyMutation.getCurrentPageIndex() + 1), new UiEvent(new RecommendationsQuestionnaireViewState.TransitionInfo(RecommendationsQuestionnaireViewState.TransitionInfo.TransitionType.FORWARD, applyMutation.questionnaireProgress(applyMutation.getCurrentPageIndex()), applyMutation.questionnaireProgress(applyMutation.getCurrentPageIndex() + 1))), null, null, null, null, map, false, 377, null);
    }

    public final void previousPage() {
        applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsQuestionnaireDuxo.previousPage$lambda$6((RecommendationsQuestionnaireViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsQuestionnaireViewState previousPage$lambda$6(RecommendationsQuestionnaireViewState applyMutation) {
        Map<UUID, UUID> answeredQuestions;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (applyMutation.getOnLandingPage()) {
            return RecommendationsQuestionnaireViewState.copy$default(applyMutation, null, 0, null, null, null, new UiEvent(Unit.INSTANCE), null, null, false, 479, null);
        }
        if (applyMutation.getCurrentPageIndex() == 0) {
            return RecommendationsQuestionnaireViewState.copy$default(applyMutation, null, 0, null, new UiEvent(Unit.INSTANCE), null, null, null, MapsKt.emptyMap(), true, 119, null);
        }
        int currentPageIndex = applyMutation.getCurrentPageIndex() - 1;
        RecommendationsQuestionnaireViewState.TransitionInfo transitionInfo = new RecommendationsQuestionnaireViewState.TransitionInfo(RecommendationsQuestionnaireViewState.TransitionInfo.TransitionType.BACKWARDS_IN_FLOW, applyMutation.questionnaireProgress(applyMutation.getCurrentPageIndex() - 1), applyMutation.questionnaireProgress(applyMutation.getCurrentPageIndex()));
        UUID currentQuestionId = applyMutation.getCurrentQuestionId();
        if (currentQuestionId == null || (answeredQuestions = MapsKt.minus(applyMutation.getAnsweredQuestions(), currentQuestionId)) == null) {
            answeredQuestions = applyMutation.getAnsweredQuestions();
        }
        return RecommendationsQuestionnaireViewState.copy$default(applyMutation, null, currentPageIndex, new UiEvent(transitionInfo), null, null, null, null, answeredQuestions, false, 377, null);
    }

    public final void returnToFlow() {
        applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.ui.questionnaire.RecommendationsQuestionnaireDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsQuestionnaireDuxo.returnToFlow$lambda$7((RecommendationsQuestionnaireViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsQuestionnaireViewState returnToFlow$lambda$7(RecommendationsQuestionnaireViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        int lastIndex = CollectionsKt.getLastIndex(applyMutation.getPages());
        float fQuestionnaireProgress = applyMutation.questionnaireProgress(lastIndex + 1);
        return RecommendationsQuestionnaireViewState.copy$default(applyMutation, null, lastIndex, new UiEvent(new RecommendationsQuestionnaireViewState.TransitionInfo(RecommendationsQuestionnaireViewState.TransitionInfo.TransitionType.RETURN_FROM_NEXT_FLOW, applyMutation.questionnaireProgress(lastIndex), fQuestionnaireProgress)), null, null, null, null, null, false, 505, null);
    }
}
