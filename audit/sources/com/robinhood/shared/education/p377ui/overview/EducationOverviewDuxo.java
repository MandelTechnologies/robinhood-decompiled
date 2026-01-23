package com.robinhood.shared.education.p377ui.overview;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.CompletedEducationLessonsPref;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationSeries;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationOverviewDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/overview/EducationOverviewDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/shared/education/ui/overview/EducationOverviewViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "educationLessonsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "completedEducationLessonsPref", "Lcom/robinhood/prefs/StringPreference;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;Lcom/robinhood/prefs/StringPreference;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "handleError", "t", "", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class EducationOverviewDuxo extends OldBaseDuxo<EducationOverviewViewState> implements HasSavedState {
    private final StringPreference completedEducationLessonsPref;
    private final EducationLessonsStore educationLessonsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EducationOverviewDuxo(EducationLessonsStore educationLessonsStore, @CompletedEducationLessonsPref StringPreference completedEducationLessonsPref, SavedStateHandle savedStateHandle) {
        super(new EducationOverviewViewState(null, null, 3, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(educationLessonsStore, "educationLessonsStore");
        Intrinsics.checkNotNullParameter(completedEducationLessonsPref, "completedEducationLessonsPref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.educationLessonsStore = educationLessonsStore;
        this.completedEducationLessonsPref = completedEducationLessonsPref;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        EducationLessonsStore educationLessonsStore = this.educationLessonsStore;
        Companion companion = INSTANCE;
        LifecycleHost.DefaultImpls.bind$default(this, Completables.checkFallbackOrError(educationLessonsStore.fetchEducationSeries(((LegacyIntentKey.EducationOverview) companion.getArgs((HasSavedState) this)).getContentfulResourceId(), false), new Function0() { // from class: com.robinhood.shared.education.ui.overview.EducationOverviewDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationOverviewDuxo.onStart$lambda$0(this.f$0);
            }
        }), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.shared.education.ui.overview.EducationOverviewDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new C389133(this));
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.educationLessonsStore.streamEducationSeries(((LegacyIntentKey.EducationOverview) companion.getArgs((HasSavedState) this)).getContentfulResourceId()), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.shared.education.ui.overview.EducationOverviewDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationOverviewDuxo.onStart$lambda$3(this.f$0, (EducationSeries) obj);
            }
        }, new C389145(this), null, null, 12, null);
        Completable completableSwitchMapCompletable = this.completedEducationLessonsPref.changes().switchMapCompletable(new Function() { // from class: com.robinhood.shared.education.ui.overview.EducationOverviewDuxo.onStart.6
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Optional<String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return EducationOverviewDuxo.this.educationLessonsStore.fetchEducationSeries(((LegacyIntentKey.EducationOverview) EducationOverviewDuxo.INSTANCE.getArgs((HasSavedState) EducationOverviewDuxo.this)).getContentfulResourceId(), true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableSwitchMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Maybe onStart$lambda$0(EducationOverviewDuxo educationOverviewDuxo) {
        Maybe<EducationSeries> maybeFirstElement = educationOverviewDuxo.educationLessonsStore.streamEducationSeries(((LegacyIntentKey.EducationOverview) INSTANCE.getArgs((HasSavedState) educationOverviewDuxo)).getContentfulResourceId()).firstElement();
        Intrinsics.checkNotNullExpressionValue(maybeFirstElement, "firstElement(...)");
        return maybeFirstElement;
    }

    /* compiled from: EducationOverviewDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.overview.EducationOverviewDuxo$onStart$3 */
    /* synthetic */ class C389133 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C389133(Object obj) {
            super(1, obj, EducationOverviewDuxo.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) throws Throwable {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EducationOverviewDuxo) this.receiver).handleError(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(EducationOverviewDuxo educationOverviewDuxo, final EducationSeries educationSeries) {
        Intrinsics.checkNotNullParameter(educationSeries, "educationSeries");
        educationOverviewDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.overview.EducationOverviewDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EducationOverviewDuxo.onStart$lambda$3$lambda$2(educationSeries, (EducationOverviewViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationOverviewViewState onStart$lambda$3$lambda$2(EducationSeries educationSeries, EducationOverviewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationOverviewViewState.copy$default(applyMutation, educationSeries, null, 2, null);
    }

    /* compiled from: EducationOverviewDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.education.ui.overview.EducationOverviewDuxo$onStart$5 */
    /* synthetic */ class C389145 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C389145(Object obj) {
            super(1, obj, EducationOverviewDuxo.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) throws Throwable {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EducationOverviewDuxo) this.receiver).handleError(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(Throwable t) throws Throwable {
        if (Throwables.isNetworkRelated(t)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, t, false, null, 4, null);
            applyMutation(new Function1() { // from class: com.robinhood.shared.education.ui.overview.EducationOverviewDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EducationOverviewDuxo.handleError$lambda$4((EducationOverviewViewState) obj);
                }
            });
            return;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EducationOverviewViewState handleError$lambda$4(EducationOverviewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EducationOverviewViewState.copy$default(applyMutation, null, new UiEvent(Unit.INSTANCE), 1, null);
    }

    /* compiled from: EducationOverviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/overview/EducationOverviewDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/education/ui/overview/EducationOverviewDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$EducationOverview;", "<init>", "()V", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EducationOverviewDuxo, LegacyIntentKey.EducationOverview> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyIntentKey.EducationOverview getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyIntentKey.EducationOverview) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyIntentKey.EducationOverview getArgs(EducationOverviewDuxo educationOverviewDuxo) {
            return (LegacyIntentKey.EducationOverview) DuxoCompanion.DefaultImpls.getArgs(this, educationOverviewDuxo);
        }
    }
}
