package com.robinhood.android.recommendations.p224ui.reentry;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.recommendations.p224ui.reentry.RecommendationsReentryQuestionnaireConfirmationDuxo;
import com.robinhood.android.recommendations.p224ui.reentry.RecommendationsReentryQuestionnaireConfirmationFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.recommendations.RecommendationsQuestionnaireStore;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsExistingAnswers;
import com.robinhood.recommendations.models.p363ui.UiRecommendationsQuestionnaire;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecommendationsReentryQuestionnaireConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "recsQuestionnaireStore", "Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsQuestionnaireStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/recommendations/RecommendationsQuestionnaireStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onChangeAnswerEvent", "questionId", "Ljava/util/UUID;", "currentAnswerId", "updateAnswer", "newAnswerId", "Companion", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RecommendationsReentryQuestionnaireConfirmationDuxo extends OldBaseDuxo<RecommendationsReentryQuestionnaireConfirmationViewState> implements HasSavedState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RecommendationsQuestionnaireStore recsQuestionnaireStore;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public RecommendationsReentryQuestionnaireConfirmationDuxo(RecommendationsQuestionnaireStore recsQuestionnaireStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(recsQuestionnaireStore, "recsQuestionnaireStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new RecommendationsReentryQuestionnaireConfirmationViewState(((RecommendationsReentryQuestionnaireConfirmationFragment.Args) companion.getArgs(savedStateHandle)).getExistingAnswers(), ((RecommendationsReentryQuestionnaireConfirmationFragment.Args) companion.getArgs(savedStateHandle)).getExistingAnswers().getEntryRows(), false, null, null, 28, null), null, 2, 0 == true ? 1 : 0);
        this.recsQuestionnaireStore = recsQuestionnaireStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        Single<Optional<UiRecommendationsQuestionnaire>> singleDoOnSubscribe = this.recsQuestionnaireStore.fetchRecommendationQuestionnaire().doOnSubscribe(new C261501());
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryQuestionnaireConfirmationDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsReentryQuestionnaireConfirmationDuxo.onCreate$lambda$2(this.f$0, (Optional) obj);
            }
        });
    }

    /* compiled from: RecommendationsReentryQuestionnaireConfirmationDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryQuestionnaireConfirmationDuxo$onCreate$1 */
    static final class C261501<T> implements Consumer {
        C261501() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RecommendationsReentryQuestionnaireConfirmationViewState accept$lambda$0(RecommendationsReentryQuestionnaireConfirmationViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return RecommendationsReentryQuestionnaireConfirmationViewState.copy$default(applyMutation, null, null, true, null, null, 27, null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            RecommendationsReentryQuestionnaireConfirmationDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryQuestionnaireConfirmationDuxo$onCreate$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecommendationsReentryQuestionnaireConfirmationDuxo.C261501.accept$lambda$0((RecommendationsReentryQuestionnaireConfirmationViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(RecommendationsReentryQuestionnaireConfirmationDuxo recommendationsReentryQuestionnaireConfirmationDuxo, Optional optional) {
        final List listEmptyList;
        List<UiRecommendationsQuestionnaire.Section> sections;
        UiRecommendationsQuestionnaire uiRecommendationsQuestionnaire = (UiRecommendationsQuestionnaire) optional.component1();
        if (uiRecommendationsQuestionnaire == null || (sections = uiRecommendationsQuestionnaire.getSections()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = new ArrayList();
            Iterator<T> it = sections.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(listEmptyList, ((UiRecommendationsQuestionnaire.Section) it.next()).getQuestions());
            }
        }
        recommendationsReentryQuestionnaireConfirmationDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryQuestionnaireConfirmationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsReentryQuestionnaireConfirmationDuxo.onCreate$lambda$2$lambda$1(listEmptyList, (RecommendationsReentryQuestionnaireConfirmationViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsReentryQuestionnaireConfirmationViewState onCreate$lambda$2$lambda$1(List list, RecommendationsReentryQuestionnaireConfirmationViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RecommendationsReentryQuestionnaireConfirmationViewState.copy$default(applyMutation, null, null, false, list, null, 19, null);
    }

    public final void onChangeAnswerEvent(final UUID questionId, final UUID currentAnswerId) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(currentAnswerId, "currentAnswerId");
        applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryQuestionnaireConfirmationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsReentryQuestionnaireConfirmationDuxo.onChangeAnswerEvent$lambda$5(questionId, currentAnswerId, (RecommendationsReentryQuestionnaireConfirmationViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsReentryQuestionnaireConfirmationViewState onChangeAnswerEvent$lambda$5(UUID uuid, UUID uuid2, RecommendationsReentryQuestionnaireConfirmationViewState applyMutation) {
        Object obj;
        Object next;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Iterator<T> it = applyMutation.getQuestions().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((UiRecommendationsQuestionnaire.Question) next).getId(), uuid)) {
                break;
            }
        }
        UiRecommendationsQuestionnaire.Question question = (UiRecommendationsQuestionnaire.Question) next;
        if (question == null) {
            return RecommendationsReentryQuestionnaireConfirmationViewState.copy$default(applyMutation, null, null, false, null, null, 31, null);
        }
        Iterator<T> it2 = question.getAllowedAnswers().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (Intrinsics.areEqual(((UiRecommendationsQuestionnaire.Answer) next2).getId(), uuid2)) {
                obj = next2;
                break;
            }
        }
        UiRecommendationsQuestionnaire.Answer answer = (UiRecommendationsQuestionnaire.Answer) obj;
        return answer == null ? RecommendationsReentryQuestionnaireConfirmationViewState.copy$default(applyMutation, null, null, false, null, null, 31, null) : RecommendationsReentryQuestionnaireConfirmationViewState.copy$default(applyMutation, null, null, false, null, new UiEvent(Tuples4.m3642to(question, answer)), 15, null);
    }

    public final void updateAnswer(final UUID questionId, final UUID newAnswerId) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(newAnswerId, "newAnswerId");
        applyMutation(new Function1() { // from class: com.robinhood.android.recommendations.ui.reentry.RecommendationsReentryQuestionnaireConfirmationDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecommendationsReentryQuestionnaireConfirmationDuxo.updateAnswer$lambda$9(questionId, newAnswerId, (RecommendationsReentryQuestionnaireConfirmationViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecommendationsReentryQuestionnaireConfirmationViewState updateAnswer$lambda$9(UUID uuid, UUID uuid2, RecommendationsReentryQuestionnaireConfirmationViewState applyMutation) {
        Object obj;
        Object next;
        List<UiRecommendationsQuestionnaire.Answer> allowedAnswers;
        String title;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Iterator<T> it = applyMutation.getQuestions().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((UiRecommendationsQuestionnaire.Question) next).getId(), uuid)) {
                break;
            }
        }
        UiRecommendationsQuestionnaire.Question question = (UiRecommendationsQuestionnaire.Question) next;
        if (question != null && (allowedAnswers = question.getAllowedAnswers()) != null) {
            Iterator<T> it2 = allowedAnswers.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (Intrinsics.areEqual(((UiRecommendationsQuestionnaire.Answer) next2).getId(), uuid2)) {
                    obj = next2;
                    break;
                }
            }
            UiRecommendationsQuestionnaire.Answer answer = (UiRecommendationsQuestionnaire.Answer) obj;
            if (answer != null && (title = answer.getTitle()) != null) {
                List mutableList = CollectionsKt.toMutableList((Collection) applyMutation.getQuestionAnswerSummaries());
                Iterator it3 = mutableList.iterator();
                int i = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (Intrinsics.areEqual(((UiRecommendationsExistingAnswers.QuestionAnswerSummary) it3.next()).getQuestionToAnswerIds().getFirst(), uuid)) {
                        break;
                    }
                    i++;
                }
                mutableList.set(i, UiRecommendationsExistingAnswers.QuestionAnswerSummary.copy$default((UiRecommendationsExistingAnswers.QuestionAnswerSummary) mutableList.get(i), title, null, Tuples4.m3642to(uuid, uuid2), null, 10, null));
                return RecommendationsReentryQuestionnaireConfirmationViewState.copy$default(applyMutation, null, mutableList, false, null, null, 29, null);
            }
        }
        return RecommendationsReentryQuestionnaireConfirmationViewState.copy$default(applyMutation, null, null, false, null, null, 31, null);
    }

    /* compiled from: RecommendationsReentryQuestionnaireConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationDuxo;", "Lcom/robinhood/android/recommendations/ui/reentry/RecommendationsReentryQuestionnaireConfirmationFragment$Args;", "<init>", "()V", "feature-recommendations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RecommendationsReentryQuestionnaireConfirmationDuxo, RecommendationsReentryQuestionnaireConfirmationFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecommendationsReentryQuestionnaireConfirmationFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RecommendationsReentryQuestionnaireConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RecommendationsReentryQuestionnaireConfirmationFragment.Args getArgs(RecommendationsReentryQuestionnaireConfirmationDuxo recommendationsReentryQuestionnaireConfirmationDuxo) {
            return (RecommendationsReentryQuestionnaireConfirmationFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, recommendationsReentryQuestionnaireConfirmationDuxo);
        }
    }
}
