package com.robinhood.shared.education.p377ui.lessons.cardstack;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore;
import com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore;
import com.robinhood.rhc.upsells.RhcUpsellsService;
import com.robinhood.rhc.upsells.TouchPoint;
import com.robinhood.rhc.upsells.TouchPointData;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.education.p377ui.lessons.cardstack.EducationLessonCardStackViewState;
import com.robinhood.shared.models.api.bonfire.education.ApiEducationClaimRewardResult;
import com.robinhood.shared.models.contract.EducationLessonFragmentKeys;
import com.robinhood.shared.models.p387db.bonfire.education.EducationUserProgress;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLesson;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonSection;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationQuizAnswer;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;

/* compiled from: EducationLessonCardStackDuxo.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001.B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!J\u0016\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020\u0017J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0002J\u0014\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0-0,H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "educationLessonsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "educationUserProgressStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressStore;Lcom/robinhood/shared/app/type/AppType;Lmicrogram/android/inject/MicrogramComponent$Factory;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "rhcUpsellsMicrogramApp", "Lmicrogram/android/inject/MicrogramComponent;", "onStart", "", "refresh", "force", "", "nextSection", "updateDayNightOverlay", "overlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "updateQuizAnswers", "answer", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationQuizAnswer;", "updateLessonProgress", "trackingId", "", "percentComplete", "", "claimLessonReward", "handleError", "t", "", "getPostRewardUpsellDeeplinkForRhc", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationLessonCardStackDuxo extends OldBaseDuxo<EducationLessonCardStackViewState> implements HasSavedState {
    private final AppType appType;
    private final EducationLessonsStore educationLessonsStore;
    private final EducationUserProgressStore educationUserProgressStore;
    private final ExperimentsStore experimentsStore;
    private final MicrogramComponent rhcUpsellsMicrogramApp;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationLessonCardStackDuxo(ExperimentsStore experimentsStore, EducationLessonsStore educationLessonsStore, EducationUserProgressStore educationUserProgressStore, AppType appType, MicrogramComponent.Factory microgramComponentFactory, SavedStateHandle savedStateHandle) {
        super(new EducationLessonCardStackViewState(null, ((EducationLessonFragmentKeys) INSTANCE.getArgs(savedStateHandle)).getSource(), 0, null, null, null, null, null, false, null, null, 2045, null), null, 2, null);
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(educationLessonsStore, "educationLessonsStore");
        Intrinsics.checkNotNullParameter(educationUserProgressStore, "educationUserProgressStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.experimentsStore = experimentsStore;
        this.educationLessonsStore = educationLessonsStore;
        this.educationUserProgressStore = educationUserProgressStore;
        this.appType = appType;
        this.savedStateHandle = savedStateHandle;
        this.rhcUpsellsMicrogramApp = appType == AppType.RHC ? MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, ViewModel2.getViewModelScope(this), new RemoteMicrogramApplication("app-rhc-upsells", null, 2, null), null, 4, null) : null;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        refresh$default(this, false, 1, null);
        EducationLessonsStore educationLessonsStore = this.educationLessonsStore;
        Companion companion = INSTANCE;
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, educationLessonsStore.streamEducationLesson(((EducationLessonFragmentKeys) companion.getArgs((HasSavedState) this)).getContentfulId(), ((EducationLessonFragmentKeys) companion.getArgs((HasSavedState) this)).getSource()), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonCardStackDuxo.onStart$lambda$1(this.f$0, (EducationLesson) obj);
            }
        }, new C388452(this), null, null, 12, null);
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, getPostRewardUpsellDeeplinkForRhc(), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonCardStackDuxo.onStart$lambda$3(this.f$0, (Optional) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonCardStackDuxo.onStart$lambda$4((Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(EducationLessonCardStackDuxo educationLessonCardStackDuxo, final EducationLesson lesson) {
        Intrinsics.checkNotNullParameter(lesson, "lesson");
        educationLessonCardStackDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonCardStackDuxo.onStart$lambda$1$lambda$0(lesson, (EducationLessonCardStackViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonCardStackViewState onStart$lambda$1$lambda$0(EducationLesson educationLesson, EducationLessonCardStackViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonCardStackViewState.copy$default(applyMutation, new EducationLessonCardStackViewState.Status.Success(educationLesson), null, 0, (applyMutation.getSectionPosition() != 0 || (((EducationLessonSection) CollectionsKt.firstOrNull((List) educationLesson.getSections())) instanceof EducationLessonSection.Quiz)) ? null : new UiEvent(Unit.INSTANCE), null, null, null, null, false, null, null, 2038, null);
    }

    /* compiled from: EducationLessonCardStackDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$onStart$2 */
    /* synthetic */ class C388452 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C388452(Object obj) {
            super(1, obj, EducationLessonCardStackDuxo.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) throws Throwable {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EducationLessonCardStackDuxo) this.receiver).handleError(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(EducationLessonCardStackDuxo educationLessonCardStackDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        final String str = (String) optional.component1();
        educationLessonCardStackDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonCardStackDuxo.onStart$lambda$3$lambda$2(str, (EducationLessonCardStackViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonCardStackViewState onStart$lambda$3$lambda$2(String str, EducationLessonCardStackViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonCardStackViewState.copy$default(applyMutation, null, null, 0, null, null, null, null, null, false, null, str, 1023, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, true, null, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void refresh$default(EducationLessonCardStackDuxo educationLessonCardStackDuxo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        educationLessonCardStackDuxo.refresh(z);
    }

    public final void refresh(boolean force) {
        applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonCardStackDuxo.refresh$lambda$5((EducationLessonCardStackViewState) obj);
            }
        });
        EducationLessonsStore educationLessonsStore = this.educationLessonsStore;
        Companion companion = INSTANCE;
        LifecycleHost.DefaultImpls.bind$default(this, Completables.checkFallbackOrError(educationLessonsStore.refreshEducationLesson(((EducationLessonFragmentKeys) companion.getArgs((HasSavedState) this)).getContentfulId(), ((EducationLessonFragmentKeys) companion.getArgs((HasSavedState) this)).getSource(), force), new Function0() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonCardStackDuxo.refresh$lambda$6(this.f$0);
            }
        }), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new C388464(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonCardStackViewState refresh$lambda$5(EducationLessonCardStackViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonCardStackViewState.copy$default(applyMutation, EducationLessonCardStackViewState.Status.Loading.INSTANCE, null, 0, null, null, null, null, null, false, null, null, 2046, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Maybe refresh$lambda$6(EducationLessonCardStackDuxo educationLessonCardStackDuxo) {
        EducationLessonsStore educationLessonsStore = educationLessonCardStackDuxo.educationLessonsStore;
        Companion companion = INSTANCE;
        Maybe<EducationLesson> maybeFirstElement = educationLessonsStore.streamEducationLesson(((EducationLessonFragmentKeys) companion.getArgs((HasSavedState) educationLessonCardStackDuxo)).getContentfulId(), ((EducationLessonFragmentKeys) companion.getArgs((HasSavedState) educationLessonCardStackDuxo)).getSource()).firstElement();
        Intrinsics.checkNotNullExpressionValue(maybeFirstElement, "firstElement(...)");
        return maybeFirstElement;
    }

    /* compiled from: EducationLessonCardStackDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$refresh$4 */
    /* synthetic */ class C388464 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C388464(Object obj) {
            super(1, obj, EducationLessonCardStackDuxo.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) throws Throwable {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EducationLessonCardStackDuxo) this.receiver).handleError(p0);
        }
    }

    public final void nextSection() {
        applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonCardStackDuxo.nextSection$lambda$8((EducationLessonCardStackViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonCardStackViewState nextSection$lambda$8(EducationLessonCardStackViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        int iCoerceAtMost = RangesKt.coerceAtMost(applyMutation.getSectionPosition() + 1, CollectionsKt.getLastIndex(applyMutation.getLessonSectionItems()));
        return EducationLessonCardStackViewState.copy$default(applyMutation, null, null, iCoerceAtMost, null, (iCoerceAtMost == applyMutation.getSectionPosition() || !(((EducationLessonSection) CollectionsKt.getOrNull(applyMutation.getLessonSectionItems(), iCoerceAtMost)) instanceof EducationLessonSection.Quiz)) ? null : new UiEvent(Unit.INSTANCE), null, null, null, false, null, null, 2027, null);
    }

    public final void updateDayNightOverlay(final DayNightOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonCardStackDuxo.updateDayNightOverlay$lambda$9(overlay, (EducationLessonCardStackViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonCardStackViewState updateDayNightOverlay$lambda$9(DayNightOverlay dayNightOverlay, EducationLessonCardStackViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonCardStackViewState.copy$default(applyMutation, null, null, 0, null, null, null, null, null, false, dayNightOverlay, null, 1535, null);
    }

    public final void updateQuizAnswers(final EducationQuizAnswer answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonCardStackDuxo.updateQuizAnswers$lambda$11(answer, (EducationLessonCardStackViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonCardStackViewState updateQuizAnswers$lambda$11(EducationQuizAnswer educationQuizAnswer, EducationLessonCardStackViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        HashSet<EducationQuizAnswer> quizAnswers = applyMutation.getQuizAnswers();
        quizAnswers.add(educationQuizAnswer);
        Unit unit = Unit.INSTANCE;
        return EducationLessonCardStackViewState.copy$default(applyMutation, null, null, 0, null, null, quizAnswers, null, null, false, null, null, 2015, null);
    }

    public final void updateLessonProgress(String trackingId, int percentComplete) {
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        LifecycleHost.DefaultImpls.bind$default(this, this.educationUserProgressStore.postUserProgress(new EducationUserProgress(trackingId, EducationUserProgress.ContentType.LESSON, EducationUserProgress.StatusType.ENGAGED, percentComplete)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    public final void claimLessonReward() {
        applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonCardStackDuxo.claimLessonReward$lambda$12((EducationLessonCardStackViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.educationLessonsStore.claimLessonReward(((EducationLessonFragmentKeys) INSTANCE.getArgs((HasSavedState) this)).getContentfulId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonCardStackDuxo.claimLessonReward$lambda$14(this.f$0, (ApiEducationClaimRewardResult) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonCardStackDuxo.claimLessonReward$lambda$16(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonCardStackViewState claimLessonReward$lambda$12(EducationLessonCardStackViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonCardStackViewState.copy$default(applyMutation, null, null, 0, null, null, null, null, null, true, null, null, 1791, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit claimLessonReward$lambda$14(EducationLessonCardStackDuxo educationLessonCardStackDuxo, final ApiEducationClaimRewardResult claimResult) {
        Intrinsics.checkNotNullParameter(claimResult, "claimResult");
        educationLessonCardStackDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonCardStackDuxo.claimLessonReward$lambda$14$lambda$13(claimResult, (EducationLessonCardStackViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonCardStackViewState claimLessonReward$lambda$14$lambda$13(ApiEducationClaimRewardResult apiEducationClaimRewardResult, EducationLessonCardStackViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonCardStackViewState.copy$default(applyMutation, null, null, 0, null, null, null, apiEducationClaimRewardResult.getCrypto_earnability(), new EducationLessonCardStackViewState.ClaimRewardResult.ResultReceived(apiEducationClaimRewardResult), false, null, null, 1855, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit claimLessonReward$lambda$16(EducationLessonCardStackDuxo educationLessonCardStackDuxo, Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (Throwables.isNetworkRelated(throwable)) {
            educationLessonCardStackDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EducationLessonCardStackDuxo.claimLessonReward$lambda$16$lambda$15((EducationLessonCardStackViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw throwable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonCardStackViewState claimLessonReward$lambda$16$lambda$15(EducationLessonCardStackViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonCardStackViewState.copy$default(applyMutation, null, null, 0, null, null, null, null, EducationLessonCardStackViewState.ClaimRewardResult.NetworkError.INSTANCE, false, null, null, 1919, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(Throwable t) throws Throwable {
        if (Throwables.isNetworkRelated(t)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, t, false, null, 4, null);
            applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EducationLessonCardStackDuxo.handleError$lambda$17((EducationLessonCardStackViewState) obj);
                }
            });
            return;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonCardStackViewState handleError$lambda$17(EducationLessonCardStackViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonCardStackViewState.copy$default(applyMutation, EducationLessonCardStackViewState.Status.Failure.INSTANCE, null, 0, null, null, null, null, null, false, null, null, 2046, null);
    }

    private final Observable<Optional<String>> getPostRewardUpsellDeeplinkForRhc() {
        MicrogramComponent microgramComponent;
        if (this.appType != AppType.RHC || (microgramComponent = this.rhcUpsellsMicrogramApp) == null) {
            Observable<Optional<String>> observableEmpty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
            return observableEmpty;
        }
        return asObservable(FlowKt.flow(new C388441((RhcUpsellsService) microgramComponent.getServiceLocator().getClient(RhcUpsellsService.class), null)));
    }

    /* compiled from: EducationLessonCardStackDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/utils/Optional;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$getPostRewardUpsellDeeplinkForRhc$1", m3645f = "EducationLessonCardStackDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE, 211}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.education.ui.lessons.cardstack.EducationLessonCardStackDuxo$getPostRewardUpsellDeeplinkForRhc$1 */
    static final class C388441 extends ContinuationImpl7 implements Function2<FlowCollector<? super Optional<? extends String>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ RhcUpsellsService $rhcUpsellsService;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C388441(RhcUpsellsService rhcUpsellsService, Continuation<? super C388441> continuation) {
            super(2, continuation);
            this.$rhcUpsellsService = rhcUpsellsService;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C388441 c388441 = new C388441(this.$rhcUpsellsService, continuation);
            c388441.L$0 = obj;
            return c388441;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Optional<? extends String>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Optional<String>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Optional<String>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C388441) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        
            if (r1.emit(r12, r11) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
        
            if (r1.emit(r12, r11) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                RhcUpsellsService rhcUpsellsService = this.$rhcUpsellsService;
                TouchPointData touchPointData = new TouchPointData(TouchPoint.LEARN_AND_EARN_COMPLETION, (String) null, (String) null, 6, (DefaultConstructorMarker) null);
                this.L$0 = flowCollector;
                this.label = 1;
                obj = rhcUpsellsService.shouldShowUpsell(touchPointData, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            String str = (String) obj;
            if (str != null && !StringsKt.isBlank(str)) {
                Optional optionalAsOptional = Optional3.asOptional(str);
                this.L$0 = null;
                this.label = 2;
            } else {
                Optional2 optional2 = Optional2.INSTANCE;
                this.L$0 = null;
                this.label = 3;
            }
        }
    }

    /* compiled from: EducationLessonCardStackDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/education/ui/lessons/cardstack/EducationLessonCardStackDuxo;", "Lcom/robinhood/shared/models/contract/EducationLessonCardStackFragmentKey;", "<init>", "()V", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EducationLessonCardStackDuxo, EducationLessonFragmentKeys> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EducationLessonFragmentKeys getArgs(SavedStateHandle savedStateHandle) {
            return (EducationLessonFragmentKeys) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EducationLessonFragmentKeys getArgs(EducationLessonCardStackDuxo educationLessonCardStackDuxo) {
            return (EducationLessonFragmentKeys) DuxoCompanion.DefaultImpls.getArgs(this, educationLessonCardStackDuxo);
        }
    }
}
