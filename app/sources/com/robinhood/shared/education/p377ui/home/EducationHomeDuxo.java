package com.robinhood.shared.education.p377ui.home;

import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore;
import com.robinhood.librobinhood.data.store.bonfire.EducationUserProgressStore;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.CompletedEducationLessonsPref;
import com.robinhood.shared.education.p377ui.home.EducationHomeViewState;
import com.robinhood.shared.models.p387db.bonfire.education.EducationUserProgress;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationHome;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationHomeDuxo.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0010\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000fJ\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0013J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/home/EducationHomeDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/shared/education/ui/home/EducationHomeViewState;", "educationLessonsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "userProgressStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressStore;", "completedEducationLessonsPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;Lcom/robinhood/librobinhood/data/store/bonfire/EducationUserProgressStore;Lcom/robinhood/prefs/StringPreference;)V", "onStart", "", "loadUserProgress", "trackingIds", "", "", "refresh", "force", "", "updateDayNightOverlay", "overlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "markEducationLessonsAppeared", "lessons", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "setHasViewedLesson", "hasViewedLesson", "handleError", "t", "", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class EducationHomeDuxo extends OldBaseDuxo<EducationHomeViewState> {
    public static final int $stable = 8;
    private final StringPreference completedEducationLessonsPref;
    private final EducationLessonsStore educationLessonsStore;
    private final EducationUserProgressStore userProgressStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EducationHomeDuxo(EducationLessonsStore educationLessonsStore, EducationUserProgressStore userProgressStore, @CompletedEducationLessonsPref StringPreference completedEducationLessonsPref) {
        super(new EducationHomeViewState(null, null, null, false, 15, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(educationLessonsStore, "educationLessonsStore");
        Intrinsics.checkNotNullParameter(userProgressStore, "userProgressStore");
        Intrinsics.checkNotNullParameter(completedEducationLessonsPref, "completedEducationLessonsPref");
        this.educationLessonsStore = educationLessonsStore;
        this.userProgressStore = userProgressStore;
        this.completedEducationLessonsPref = completedEducationLessonsPref;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        refresh$default(this, false, 1, null);
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.educationLessonsStore.streamEducationHome(), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.shared.education.ui.home.EducationHomeDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationHomeDuxo.onStart$lambda$1(this.f$0, (EducationHome) obj);
            }
        }, new C388252(this), null, null, 12, null);
        Completable completableSwitchMapCompletable = this.completedEducationLessonsPref.changes().switchMapCompletable(new Function() { // from class: com.robinhood.shared.education.ui.home.EducationHomeDuxo.onStart.3
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Optional<String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return EducationHomeDuxo.this.educationLessonsStore.refreshEducationHome(true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableSwitchMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(EducationHomeDuxo educationHomeDuxo, final EducationHome it) {
        Intrinsics.checkNotNullParameter(it, "it");
        educationHomeDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.home.EducationHomeDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationHomeDuxo.onStart$lambda$1$lambda$0(it, (EducationHomeViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationHomeViewState onStart$lambda$1$lambda$0(EducationHome educationHome, EducationHomeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationHomeViewState.copy$default(applyMutation, new EducationHomeViewState.Status.Success(educationHome), null, null, false, 14, null);
    }

    /* compiled from: EducationHomeDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.home.EducationHomeDuxo$onStart$2 */
    /* synthetic */ class C388252 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C388252(Object obj) {
            super(1, obj, EducationHomeDuxo.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) throws Throwable {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EducationHomeDuxo) this.receiver).handleError(p0);
        }
    }

    public final void loadUserProgress(List<String> trackingIds) {
        Intrinsics.checkNotNullParameter(trackingIds, "trackingIds");
        EducationUserProgressStore.refreshUserProgressByTrackingIds$default(this.userProgressStore, trackingIds, null, EducationUserProgress.ContentType.LESSON, false, 2, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.userProgressStore.streamUserProgressByTrackingIds(trackingIds), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.education.ui.home.EducationHomeDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationHomeDuxo.loadUserProgress$lambda$3(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadUserProgress$lambda$3(EducationHomeDuxo educationHomeDuxo, final List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        educationHomeDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.home.EducationHomeDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationHomeDuxo.loadUserProgress$lambda$3$lambda$2(it, (EducationHomeViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationHomeViewState loadUserProgress$lambda$3$lambda$2(List list, EducationHomeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationHomeViewState.copy$default(applyMutation, null, null, list, false, 11, null);
    }

    public static /* synthetic */ void refresh$default(EducationHomeDuxo educationHomeDuxo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        educationHomeDuxo.refresh(z);
    }

    public final void refresh(boolean force) {
        applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.home.EducationHomeDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationHomeDuxo.refresh$lambda$4((EducationHomeViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, Completables.checkFallbackOrError(this.educationLessonsStore.refreshEducationHome(force), new Function0() { // from class: com.robinhood.shared.education.ui.home.EducationHomeDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationHomeDuxo.refresh$lambda$5(this.f$0);
            }
        }), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.shared.education.ui.home.EducationHomeDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new C388274(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationHomeViewState refresh$lambda$4(EducationHomeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationHomeViewState.copy$default(applyMutation, EducationHomeViewState.Status.Loading.INSTANCE, null, null, false, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Maybe refresh$lambda$5(EducationHomeDuxo educationHomeDuxo) {
        Maybe<EducationHome> maybeFirstElement = educationHomeDuxo.educationLessonsStore.streamEducationHome().firstElement();
        Intrinsics.checkNotNullExpressionValue(maybeFirstElement, "firstElement(...)");
        return maybeFirstElement;
    }

    /* compiled from: EducationHomeDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.home.EducationHomeDuxo$refresh$4 */
    /* synthetic */ class C388274 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C388274(Object obj) {
            super(1, obj, EducationHomeDuxo.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) throws Throwable {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EducationHomeDuxo) this.receiver).handleError(p0);
        }
    }

    public final void updateDayNightOverlay(final DayNightOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.home.EducationHomeDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationHomeDuxo.updateDayNightOverlay$lambda$7(overlay, (EducationHomeViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationHomeViewState updateDayNightOverlay$lambda$7(DayNightOverlay dayNightOverlay, EducationHomeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationHomeViewState.copy$default(applyMutation, null, dayNightOverlay, null, false, 13, null);
    }

    public final void markEducationLessonsAppeared(List<EducationLessonPreview> lessons) {
        Intrinsics.checkNotNullParameter(lessons, "lessons");
        this.educationLessonsStore.setLessonsAppearanceTimestamps(lessons);
    }

    public final void setHasViewedLesson(final boolean hasViewedLesson) {
        applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.home.EducationHomeDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationHomeDuxo.setHasViewedLesson$lambda$8(hasViewedLesson, (EducationHomeViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationHomeViewState setHasViewedLesson$lambda$8(boolean z, EducationHomeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationHomeViewState.copy$default(applyMutation, null, null, null, z, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(Throwable t) throws Throwable {
        if (Throwables.isNetworkRelated(t)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, t, false, null, 4, null);
            applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.home.EducationHomeDuxo$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EducationHomeDuxo.handleError$lambda$9((EducationHomeViewState) obj);
                }
            });
            return;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationHomeViewState handleError$lambda$9(EducationHomeViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationHomeViewState.copy$default(applyMutation, EducationHomeViewState.Status.Failure.INSTANCE, null, null, false, 14, null);
    }
}
