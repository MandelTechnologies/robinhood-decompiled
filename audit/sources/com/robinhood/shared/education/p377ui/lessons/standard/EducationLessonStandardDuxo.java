package com.robinhood.shared.education.p377ui.lessons.standard;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore;
import com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.ContextActionEvent;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardViewState;
import com.robinhood.shared.education.p377ui.onboarding.HasShownCryptoLearnAndEarnOnboardingPref;
import com.robinhood.shared.models.api.bonfire.education.ApiEducationEarnability;
import com.robinhood.shared.models.contract.EducationLessonFragmentKeys2;
import com.robinhood.shared.models.p387db.bonfire.education.EducationUserProgress;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLesson;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.extensions.SinglesKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: EducationLessonStandardDuxo.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001/B3\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0013J\u0006\u0010\u001b\u001a\u00020\u0013J\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016J\u0016\u0010#\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!2\u0006\u0010$\u001a\u00020\u0016J\u000e\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020'J\u0016\u0010(\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!2\u0006\u0010)\u001a\u00020\u0019J\u0006\u0010*\u001a\u00020\u0013J\u0006\u0010+\u001a\u00020\u0013J\u0010\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020.H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u00060"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "educationLessonsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "educationUserProgressStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressStore;", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "hasShownCryptoLearnAndEarnOnboarding", "Lcom/robinhood/prefs/BooleanPreference;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressStore;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/prefs/BooleanPreference;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "refresh", "force", "", "updateSectionPosition", "sectionPosition", "", "previousSection", "nextSection", "updateDayNightOverlay", "overlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "setLessonStarted", "trackingId", "", "isStarted", "setLessonCompletion", "isComplete", "updateLottieCompositionInfo", "totalFrames", "", "updateLessonProgress", "percentComplete", "checkLessonEarnability", "logLessonLoaded", "handleError", "t", "", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class EducationLessonStandardDuxo extends OldBaseDuxo<EducationLessonStandardViewState> implements HasSavedState {
    private final EducationLessonsStore educationLessonsStore;
    private final EducationUserProgressStore educationUserProgressStore;
    private final BooleanPreference hasShownCryptoLearnAndEarnOnboarding;
    private final PerformanceLogger performanceLogger;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public EducationLessonStandardDuxo(EducationLessonsStore educationLessonsStore, EducationUserProgressStore educationUserProgressStore, PerformanceLogger performanceLogger, @HasShownCryptoLearnAndEarnOnboardingPref BooleanPreference hasShownCryptoLearnAndEarnOnboarding, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(educationLessonsStore, "educationLessonsStore");
        Intrinsics.checkNotNullParameter(educationUserProgressStore, "educationUserProgressStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(hasShownCryptoLearnAndEarnOnboarding, "hasShownCryptoLearnAndEarnOnboarding");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        EducationLessonStandardViewState.Status status = null;
        super(new EducationLessonStandardViewState(status, ((EducationLessonFragmentKeys2) companion.getArgs(savedStateHandle)).getSource(), ((EducationLessonFragmentKeys2) companion.getArgs(savedStateHandle)).getContentfulId(), 0, 0, null, null, null, false, 505, null), null, 2, 0 == true ? 1 : 0);
        this.educationLessonsStore = educationLessonsStore;
        this.educationUserProgressStore = educationUserProgressStore;
        this.performanceLogger = performanceLogger;
        this.hasShownCryptoLearnAndEarnOnboarding = hasShownCryptoLearnAndEarnOnboarding;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        refresh$default(this, false, 1, null);
        EducationLessonsStore educationLessonsStore = this.educationLessonsStore;
        Companion companion = INSTANCE;
        Observable<EducationLesson> observableStreamEducationLesson = educationLessonsStore.streamEducationLesson(((EducationLessonFragmentKeys2) companion.getArgs((HasSavedState) this)).getContentfulId(), ((EducationLessonFragmentKeys2) companion.getArgs((HasSavedState) this)).getSource());
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableStreamEducationLesson, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardDuxo.onStart$lambda$1(this.f$0, (EducationLesson) obj);
            }
        }, new C388622(this), null, null, 12, null);
        Observable<R> observableSwitchMapSingle = observableStreamEducationLesson.distinctUntilChanged().switchMapSingle(new Function() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo.onStart.3
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<ApiEducationEarnability>> apply(EducationLesson lesson) {
                Intrinsics.checkNotNullParameter(lesson, "lesson");
                if (lesson.getReward() != null) {
                    return SinglesKt.mapToOptional(EducationLessonStandardDuxo.this.educationLessonsStore.fetchLessonEarnability(new Either.Left(((EducationLessonFragmentKeys2) EducationLessonStandardDuxo.INSTANCE.getArgs((HasSavedState) EducationLessonStandardDuxo.this)).getContentfulId())));
                }
                Single singleJust = Single.just(Optional2.INSTANCE);
                Intrinsics.checkNotNull(singleJust);
                return singleJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardDuxo.onStart$lambda$3(this.f$0, (Optional) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardDuxo.onStart$lambda$4((Throwable) obj);
            }
        }, null, null, 12, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.hasShownCryptoLearnAndEarnOnboarding.getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardDuxo.onStart$lambda$6(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(EducationLessonStandardDuxo educationLessonStandardDuxo, final EducationLesson lesson) {
        Intrinsics.checkNotNullParameter(lesson, "lesson");
        educationLessonStandardDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardDuxo.onStart$lambda$1$lambda$0(lesson, (EducationLessonStandardViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonStandardViewState onStart$lambda$1$lambda$0(EducationLesson educationLesson, EducationLessonStandardViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonStandardViewState.copy$default(applyMutation, new EducationLessonStandardViewState.Status.Success(educationLesson), null, null, 0, 0, null, null, null, false, 510, null);
    }

    /* compiled from: EducationLessonStandardDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$onStart$2 */
    /* synthetic */ class C388622 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C388622(Object obj) {
            super(1, obj, EducationLessonStandardDuxo.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) throws Throwable {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EducationLessonStandardDuxo) this.receiver).handleError(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(EducationLessonStandardDuxo educationLessonStandardDuxo, Optional optional) {
        final ApiEducationEarnability apiEducationEarnability = (ApiEducationEarnability) optional.component1();
        if (apiEducationEarnability != null) {
            educationLessonStandardDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EducationLessonStandardDuxo.onStart$lambda$3$lambda$2(apiEducationEarnability, (EducationLessonStandardViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonStandardViewState onStart$lambda$3$lambda$2(ApiEducationEarnability apiEducationEarnability, EducationLessonStandardViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonStandardViewState.copy$default(applyMutation, null, null, null, 0, 0, null, null, new UiEvent(apiEducationEarnability), false, 383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (Throwables.isNetworkRelated(throwable)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, throwable, false, null, 4, null);
            return Unit.INSTANCE;
        }
        throw throwable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(EducationLessonStandardDuxo educationLessonStandardDuxo, final boolean z) {
        educationLessonStandardDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardDuxo.onStart$lambda$6$lambda$5(z, (EducationLessonStandardViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonStandardViewState onStart$lambda$6$lambda$5(boolean z, EducationLessonStandardViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonStandardViewState.copy$default(applyMutation, null, null, null, 0, 0, null, null, null, z, 255, null);
    }

    public static /* synthetic */ void refresh$default(EducationLessonStandardDuxo educationLessonStandardDuxo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        educationLessonStandardDuxo.refresh(z);
    }

    public final void refresh(boolean force) {
        applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardDuxo.refresh$lambda$7((EducationLessonStandardViewState) obj);
            }
        });
        EducationLessonsStore educationLessonsStore = this.educationLessonsStore;
        Companion companion = INSTANCE;
        LifecycleHost.DefaultImpls.bind$default(this, Completables.checkFallbackOrError(educationLessonsStore.refreshEducationLesson(((EducationLessonFragmentKeys2) companion.getArgs((HasSavedState) this)).getContentfulId(), ((EducationLessonFragmentKeys2) companion.getArgs((HasSavedState) this)).getSource(), force), new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonStandardDuxo.refresh$lambda$8(this.f$0);
            }
        }), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new C388644(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonStandardViewState refresh$lambda$7(EducationLessonStandardViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonStandardViewState.copy$default(applyMutation, EducationLessonStandardViewState.Status.Loading.INSTANCE, null, null, 0, 0, null, null, null, false, 510, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Maybe refresh$lambda$8(EducationLessonStandardDuxo educationLessonStandardDuxo) {
        EducationLessonsStore educationLessonsStore = educationLessonStandardDuxo.educationLessonsStore;
        Companion companion = INSTANCE;
        return educationLessonsStore.streamEducationLessonMaybe(((EducationLessonFragmentKeys2) companion.getArgs((HasSavedState) educationLessonStandardDuxo)).getContentfulId(), ((EducationLessonFragmentKeys2) companion.getArgs((HasSavedState) educationLessonStandardDuxo)).getSource());
    }

    /* compiled from: EducationLessonStandardDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$refresh$4 */
    /* synthetic */ class C388644 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C388644(Object obj) {
            super(1, obj, EducationLessonStandardDuxo.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) throws Throwable {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EducationLessonStandardDuxo) this.receiver).handleError(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonStandardViewState updateSectionPosition$lambda$10(int i, EducationLessonStandardViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonStandardViewState.copy$default(applyMutation, null, null, null, i, 0, null, null, null, false, 503, null);
    }

    public final void updateSectionPosition(final int sectionPosition) {
        applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardDuxo.updateSectionPosition$lambda$10(sectionPosition, (EducationLessonStandardViewState) obj);
            }
        });
    }

    public final void previousSection() {
        applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardDuxo.previousSection$lambda$11((EducationLessonStandardViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonStandardViewState previousSection$lambda$11(EducationLessonStandardViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonStandardViewState.copy$default(applyMutation, null, null, null, RangesKt.coerceAtLeast(applyMutation.getSectionPosition() - 1, 0), applyMutation.getSectionPosition(), null, null, null, false, 487, null);
    }

    public final void nextSection() {
        applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardDuxo.nextSection$lambda$12((EducationLessonStandardViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonStandardViewState nextSection$lambda$12(EducationLessonStandardViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonStandardViewState.copy$default(applyMutation, null, null, null, RangesKt.coerceAtMost(applyMutation.getSectionPosition() + 1, CollectionsKt.getLastIndex(applyMutation.getLessonSectionItems())), applyMutation.getSectionPosition(), null, null, null, false, 487, null);
    }

    public final void updateDayNightOverlay(final DayNightOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardDuxo.updateDayNightOverlay$lambda$13(overlay, (EducationLessonStandardViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonStandardViewState updateDayNightOverlay$lambda$13(DayNightOverlay dayNightOverlay, EducationLessonStandardViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonStandardViewState.copy$default(applyMutation, null, null, null, 0, 0, null, dayNightOverlay, null, false, 447, null);
    }

    public final void setLessonStarted(String trackingId, boolean isStarted) {
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        this.educationLessonsStore.setLessonStarted(trackingId, isStarted);
    }

    public final void setLessonCompletion(String trackingId, boolean isComplete) {
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        this.educationLessonsStore.setLessonCompletion(trackingId, isComplete);
    }

    public final void updateLottieCompositionInfo(final float totalFrames) {
        applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardDuxo.updateLottieCompositionInfo$lambda$14(totalFrames, (EducationLessonStandardViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonStandardViewState updateLottieCompositionInfo$lambda$14(float f, EducationLessonStandardViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonStandardViewState.copy$default(applyMutation, null, null, null, 0, 0, Float.valueOf(f), null, null, false, 479, null);
    }

    public final void updateLessonProgress(String trackingId, int percentComplete) {
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        LifecycleHost.DefaultImpls.bind$default(this, this.educationUserProgressStore.postUserProgress(new EducationUserProgress(trackingId, EducationUserProgress.ContentType.LESSON, EducationUserProgress.StatusType.ENGAGED, percentComplete)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    public final void checkLessonEarnability() {
        LifecycleHost.DefaultImpls.bind$default(this, this.educationLessonsStore.fetchLessonEarnability(new Either.Left(((EducationLessonFragmentKeys2) INSTANCE.getArgs((HasSavedState) this)).getContentfulId())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardDuxo.checkLessonEarnability$lambda$16(this.f$0, (ApiEducationEarnability) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardDuxo.checkLessonEarnability$lambda$17((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkLessonEarnability$lambda$16(EducationLessonStandardDuxo educationLessonStandardDuxo, final ApiEducationEarnability earnability) {
        Intrinsics.checkNotNullParameter(earnability, "earnability");
        educationLessonStandardDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationLessonStandardDuxo.checkLessonEarnability$lambda$16$lambda$15(earnability, (EducationLessonStandardViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonStandardViewState checkLessonEarnability$lambda$16$lambda$15(ApiEducationEarnability apiEducationEarnability, EducationLessonStandardViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonStandardViewState.copy$default(applyMutation, null, null, null, 0, 0, null, null, new UiEvent(apiEducationEarnability), false, 383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkLessonEarnability$lambda$17(Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (Throwables.isNetworkRelated(throwable)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, throwable, false, null, 4, null);
            return Unit.INSTANCE;
        }
        throw throwable;
    }

    public final void logLessonLoaded() {
        this.performanceLogger.completeMetric(new ContextActionEvent.Action(UserInteractionEventData.Action.VIEW_LEARNING_LESSON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(final Throwable t) throws Throwable {
        if (Throwables.isNetworkRelated(t)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, t, false, null, 4, null);
            applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EducationLessonStandardDuxo.handleError$lambda$18(t, (EducationLessonStandardViewState) obj);
                }
            });
            return;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationLessonStandardViewState handleError$lambda$18(Throwable th, EducationLessonStandardViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationLessonStandardViewState.copy$default(applyMutation, new EducationLessonStandardViewState.Status.Failure(th), null, null, 0, 0, null, null, null, false, 510, null);
    }

    /* compiled from: EducationLessonStandardDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardDuxo;", "Lcom/robinhood/shared/models/contract/EducationLessonStandardFragmentKey;", "<init>", "()V", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EducationLessonStandardDuxo, EducationLessonFragmentKeys2> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EducationLessonFragmentKeys2 getArgs(SavedStateHandle savedStateHandle) {
            return (EducationLessonFragmentKeys2) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EducationLessonFragmentKeys2 getArgs(EducationLessonStandardDuxo educationLessonStandardDuxo) {
            return (EducationLessonFragmentKeys2) DuxoCompanion.DefaultImpls.getArgs(this, educationLessonStandardDuxo);
        }
    }
}
